package com.ordana.immersive_weathering.mixins.forge;

import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.lang.ref.Reference;
import java.util.Map;

@Mixin({BlockColors.class})
public interface AccessorBlockColor {
    @Accessor("f_92571_")
    Map<Holder.Reference<Block>, BlockColor> getBlockColors();
}

