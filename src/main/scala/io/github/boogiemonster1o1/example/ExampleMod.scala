package io.github.boogiemonster1o1.example

import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader

object ExampleMod extends ModInitializer {
	val modId: String = "modid"
	val version: String = FabricLoader.getInstance.getModContainer(modId).get.getMetadata.getVersion.toString

	override def onInitialize(): Unit = {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		println("Hello Fabric world!")
	}
}
