package themc.pekes.squirrels;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PekesSquirrels implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("pekesfoods");

	public static final Item 	ORAVA 			= new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Block	ORAVA_BLOCK 	= new Block(FabricBlockSettings.of(Material.WOOL).strength(0.5F, 0.5F).sounds(BlockSoundGroup.WOOL));
	public static final Item	PAISTETTU_ORAVA = new Item(new Item.Settings().group(ItemGroup.FOOD).food(OravaFoodComponents.PAISTETTU_ORAVA));
	public static final Block	ORAVA_ORE		= new OravaOreBlock(FabricBlockSettings.of(Material.STONE).strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));
	// public static final Block	ORAVA_ORE		= new OravaOreBlock(FabricBlockSettings.copy(Blocks.STONE)); // Doesn't work for some reason :/

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");



		Registry.register(Registry.ITEM,  new Identifier("pekessquirrels", "orava"), ORAVA); // Identifier for the item.
		Registry.register(Registry.BLOCK, new Identifier("pekessquirrels", "orava_block"), ORAVA_BLOCK);
		Registry.register(Registry.ITEM,  new Identifier("pekessquirrels", "orava_block"), new BlockItem(ORAVA_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,  new Identifier("pekessquirrels", "paistettu_orava"), PAISTETTU_ORAVA);
		Registry.register(Registry.BLOCK, new Identifier("pekessquirrels", "orava_ore"), ORAVA_ORE);
		Registry.register(Registry.ITEM,  new Identifier("pekessquirrels", "orava_ore"), new BlockItem(ORAVA_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
