package me.shadowedleaves.craftingplus.datagen;

import me.shadowedleaves.craftingplus.CraftingPlus;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> GLASS_BLASTABLES = List.of(
            Items.SAND,
            Items.RED_SAND);

    private static final List<ItemConvertible> NETHER_BRICK_BLASTABLES = List.of(
            Items.NETHERRACK);

    private static final List<ItemConvertible> IRON_BLOCK_BLASTABLES = List.of(
            Items.RAW_IRON_BLOCK);

    private static final List<ItemConvertible> IRON_BLOCK_SMELTABLES = List.of(
            Items.RAW_IRON_BLOCK);

    private static final List<ItemConvertible> GOLD_BLOCK_BLASTABLES = List.of(
            Items.RAW_GOLD_BLOCK);

    private static final List<ItemConvertible> GOLD_BLOCK_SMELTABLES = List.of(
            Items.RAW_GOLD_BLOCK);

    private static final List<ItemConvertible> COPPER_BLOCK_BLASTABLES = List.of(
            Items.RAW_COPPER_BLOCK);

    private static final List<ItemConvertible> COPPER_BLOCK_SMELTABLES = List.of(
            Items.RAW_COPPER_BLOCK);

    private static final List<ItemConvertible> DEEPSLATE_BLASTABLES = List.of(
            Items.COBBLED_DEEPSLATE);

    private static final List<ItemConvertible> STONE_BLASTABLES = List.of(
            Items.COBBLESTONE);

    private static final List<ItemConvertible> BRICK_BLASTABLES = List.of(
            Items.CLAY_BALL);

    private static final List<ItemConvertible> BRICKS_BLASTABLES = List.of(
            Items.CLAY);

    private static final List<ItemConvertible> LEATHER_SMELTABLES = List.of(
            Items.ROTTEN_FLESH);

    private static final List<ItemConvertible> DEAD_BUSH_SMELTABLES = List.of(
            Items.SPRUCE_SAPLING,
            Items.BIRCH_SAPLING,
            Items.CHERRY_SAPLING,
            Items.OAK_SAPLING,
            Items.DARK_OAK_SAPLING,
            Items.JUNGLE_SAPLING,
            Items.ACACIA_SAPLING);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Dispenser
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DISPENSER, 1)
                .pattern(" TS")
                .pattern("TDS")
                .pattern(" TS")
                .input('S', Items.STRING)
                .input('D', Items.DROPPER)
                .input('T', Items.STICK)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(Items.DROPPER), conditionsFromItem(Items.DROPPER))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Items.DISPENSER)));

        //Enchanted Golden Apple
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE, 1)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', Items.GOLD_BLOCK)
                .input('A', Items.APPLE)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.ENCHANTED_GOLDEN_APPLE)));

        //Name Tag
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NAME_TAG, 1)
                .pattern(" IS")
                .pattern(" PI")
                .pattern("P  ")
                .input('S', Items.STRING)
                .input('P', Items.PAPER)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Items.NAME_TAG)));

        //Iron Horse Armor
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR, 1)
                .pattern("  I")
                .pattern("III")
                .pattern("ISI")
                .input('S', Items.SADDLE)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.SADDLE), conditionsFromItem(Items.SADDLE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Items.IRON_HORSE_ARMOR)));

        //Gold Horse Armor
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR, 1)
                .pattern("  G")
                .pattern("GGG")
                .pattern("GSG")
                .input('S', Items.SADDLE)
                .input('G', Items.GOLD_INGOT)
                .criterion(hasItem(Items.SADDLE), conditionsFromItem(Items.SADDLE))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Items.GOLDEN_HORSE_ARMOR)));

        //Diamond Horse Armor
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR, 1)
                .pattern("  D")
                .pattern("DDD")
                .pattern("DSD")
                .input('S', Items.SADDLE)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.SADDLE), conditionsFromItem(Items.SADDLE))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Items.DIAMOND_HORSE_ARMOR)));

        //Blackstone Lever
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.LEVER, 1)
                .pattern("S")
                .pattern("B")
                .input('S', Items.STICK)
                .input('B', Items.BLACKSTONE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.BLACKSTONE), conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.LEVER)));

        //Blackstone Observer
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.OBSERVER, 1)
                .pattern("BBB")
                .pattern("RRQ")
                .pattern("BBB")
                .input('Q', Items.QUARTZ)
                .input('R', Items.REDSTONE)
                .input('B', Items.BLACKSTONE)
                .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Items.BLACKSTONE), conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.OBSERVER)));

        //Blackstone Dropper
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DROPPER, 1)
                .pattern("BBB")
                .pattern("B B")
                .pattern("BRB")
                .input('B', Items.BLACKSTONE)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(Items.BLACKSTONE), conditionsFromItem(Items.BLACKSTONE))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.DROPPER)));

        //Blackstone Brewing Stand
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BREWING_STAND, 1)
                .pattern(" R ")
                .pattern("BBB")
                .input('R', Items.BLAZE_ROD)
                .input('B', Items.BLACKSTONE)
                .criterion(hasItem(Items.BLAZE_ROD), conditionsFromItem(Items.BLAZE_ROD))
                .criterion(hasItem(Items.BLACKSTONE), conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.BREWING_STAND)));

        //Raw Iron Block -> Iron Block
        offerSmelting(exporter, IRON_BLOCK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Items.IRON_BLOCK,
                0.7f, 200, "iron_block");

        //Rotten Flesh -> Leather
        offerSmelting(exporter, LEATHER_SMELTABLES, RecipeCategory.MISC, Items.LEATHER,
                0.1f, 150, "leather");

        //Saplings -> Dead Bush
        offerSmelting(exporter, DEAD_BUSH_SMELTABLES, RecipeCategory.DECORATIONS, Items.DEAD_BUSH,
                0.1f, 150, "dead_bush");

        //Raw Iron Block -> Iron Block
        offerBlasting(exporter, IRON_BLOCK_BLASTABLES, RecipeCategory.BUILDING_BLOCKS, Items.IRON_BLOCK,
                0.7f, 100, "iron_block");

        //Raw Gold Block -> Gold Block
        offerSmelting(exporter, GOLD_BLOCK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Items.GOLD_BLOCK,
                0.7f, 200, "gold_block");

        //Raw Gold Block -> Gold Block
        offerBlasting(exporter, GOLD_BLOCK_BLASTABLES, RecipeCategory.BUILDING_BLOCKS, Items.GOLD_BLOCK,
                0.7f, 100, "gold_block");

        //Raw Copper Block -> Copper Block
        offerSmelting(exporter, COPPER_BLOCK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK,
                0.7f, 200, "copper_block");

        //Raw Copper Block -> Copper Block
        offerBlasting(exporter, COPPER_BLOCK_BLASTABLES, RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK,
                0.7f, 100, "copper_block");

        //Red Sand & Sand -> Glass
        offerBlasting(exporter, GLASS_BLASTABLES, RecipeCategory.BUILDING_BLOCKS, Items.GLASS,
                0.1f, 100, "glass");

        //Netherrack -> Nether Brick
        offerBlasting(exporter, NETHER_BRICK_BLASTABLES, RecipeCategory.MISC, Items.NETHER_BRICK,
                0.1f, 100, "nether_brick");

        //Cobblestone -> Stone
        offerBlasting(exporter, STONE_BLASTABLES, RecipeCategory.BUILDING_BLOCKS, Items.STONE,
                0.1f, 100, "stone");

        //Cobbled Deepslate -> Deepslate
        offerBlasting(exporter, DEEPSLATE_BLASTABLES, RecipeCategory.BUILDING_BLOCKS, Items.DEEPSLATE,
                0.1f, 100, "deepslate");

        //Clay Ball -> Brick
        offerBlasting(exporter, BRICK_BLASTABLES, RecipeCategory.MISC, Items.BRICK,
                0.3f, 100, "brick");

        //Clay Block -> Brick Block
        offerBlasting(exporter, BRICKS_BLASTABLES, RecipeCategory.BUILDING_BLOCKS, Items.BRICKS,
                0.3f, 100, "bricks");
    }

    public static void registerModRecipes() {
        CraftingPlus.LOGGER.info("Registering Mod Recipes for " + CraftingPlus.MOD_ID);
    }
}
