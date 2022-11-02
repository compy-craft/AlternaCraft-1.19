package com.huskytacodile.alternacraft.client.render.entity;

import com.google.common.collect.Maps;
import com.huskytacodile.alternacraft.client.model.entity.BaryonyxModel;
import com.huskytacodile.alternacraft.entities.dinos.carnivore.semiaquatic.BaryonyxEntity;
import com.huskytacodile.alternacraft.entities.variant.GenderVariant;
import com.huskytacodile.alternacraft.entities.variant.QuadrupleVariant;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;
import java.util.Map;

public class BaryonyxRenderer extends GeoEntityRenderer<BaryonyxEntity>
{
    public BaryonyxRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new BaryonyxModel());
        this.shadowRadius = 2.2F;
    }
    public static final Map<QuadrupleVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(QuadrupleVariant.class), (p_114874_) -> {
                p_114874_.put(QuadrupleVariant.MALE, new ResourceLocation("alternacraft:textures/entity/baryonyx_chaos.png"));
                p_114874_.put(QuadrupleVariant.FEMALE, new ResourceLocation("alternacraft:textures/entity/baryonyx_grim.png"));
                p_114874_.put(QuadrupleVariant.FEMALE2, new ResourceLocation("alternacraft:textures/entity/baryonyx_fk.png"));
                p_114874_.put(QuadrupleVariant.MALE2, new ResourceLocation("alternacraft:textures/entity/baryonyx_chaos.png"));
            });
    @Override
    public ResourceLocation getTextureLocation(BaryonyxEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }
    @Override
    public RenderType getRenderType(BaryonyxEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource multiBufferSource, VertexConsumer vertexConsumer, int packedLightIn,
                                    ResourceLocation textureLocation)
    {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
    @Override
    protected float getDeathMaxRotation(BaryonyxEntity entityLivingBaseIn){
        return 0.0F;
    }
}
