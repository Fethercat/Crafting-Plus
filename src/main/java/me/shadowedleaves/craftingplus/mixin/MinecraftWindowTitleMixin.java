package me.shadowedleaves.craftingplus.mixin;

import net.minecraft.client.MinecraftClient;

import org.jetbrains.annotations.*;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;

@Mixin(MinecraftClient.class)
public class MinecraftWindowTitleMixin {
    @Contract(pure = true)
    @ModifyReturnValue(method = "getWindowTitle", at = @At("RETURN"))
    private @NotNull String getWindowTitle(@NotNull String original) {
        return new String("Crafting+ 1.20.4");
    }
}
