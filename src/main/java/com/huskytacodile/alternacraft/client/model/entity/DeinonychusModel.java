package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.DeinonychusRenderer;
import com.huskytacodile.alternacraft.client.render.entity.VelociraptorRenderer;
import com.huskytacodile.alternacraft.entities.dinos.carnivore.medium.raptor.DeinonychusEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DeinonychusModel extends AnimatedGeoModel<DeinonychusEntity> {
    @Override
    public ResourceLocation getAnimationResource(DeinonychusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/deinonychus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(DeinonychusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/deinonychus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DeinonychusEntity entity)    {
        return DeinonychusRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}
