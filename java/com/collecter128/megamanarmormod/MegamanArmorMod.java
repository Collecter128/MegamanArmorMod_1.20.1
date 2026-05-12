package com.collecter128.megamanarmormod;

import com.collecter128.megamanarmormod.init.BlockInit;
import com.collecter128.megamanarmormod.init.ItemInit;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.Color;

import org.slf4j.Logger;
import net.minecraft.network.chat.Component;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MegamanArmorMod.MODID)
public class MegamanArmorMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "megamanarmormod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

//    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
//    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
//    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
//    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()));
//
//    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
//    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
//            .alwaysEat().nutrition(1).saturationMod(2f).build())));
//
//    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
//    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
//            .withTabsBefore(CreativeModeTabs.COMBAT)
//            .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
//            .displayItems((parameters, output) -> {
//                output.accept(EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
//            }).build());
    
    public static final RegistryObject<CreativeModeTab> MegamanArmorMaterials_TAB = CREATIVE_MODE_TABS.register("megamanarmormaterialstab", () -> CreativeModeTab.builder()
     		//.withTabsBefore(CollectiumTrophies.Collectium_TAB.get())
     		.title(Component.translatable("itemGroup.megamanarmormaterialstab"))
     		.icon(() -> ItemInit.CerataniumRaw.get().getDefaultInstance())
     		.displayItems((parameters, output) -> {
     			
     			output.accept(ItemInit.CerataniumOre_Item.get());
     			output.accept(ItemInit.CerataniumOreDeepslate_Item.get());
     			
     			output.accept(ItemInit.CerataniumRaw.get());
     			output.accept(ItemInit.CerataniumRawBlock_Item.get());
     			
     			output.accept(ItemInit.CerataniumIngot.get());
     			output.accept(ItemInit.CerataniumBlock_Item.get());
     			
     			output.accept(ItemInit.TitaniumXIngot.get());
     			output.accept(ItemInit.TitaniumXBlock_Item.get());
     			
     			output.accept(ItemInit.MysteryDataFragmentBlue.get());
     			output.accept(ItemInit.MysteryDataPartBlue.get());
     			output.accept(ItemInit.MysteryDataBlue_Item.get());
     			output.accept(ItemInit.MysteryDataBlueCompressed_Item.get());
     			output.accept(ItemInit.MysteryDataFragmentPurple.get());
     			output.accept(ItemInit.MysteryDataPartPurple.get());
     			output.accept(ItemInit.MysteryDataPurple_Item.get());
     			output.accept(ItemInit.MysteryDataPurpleCompressed_Item.get());
     			
     			output.accept(ItemInit.DataBuster.get());
     			
     			output.accept(ItemInit.MysteryWaveFragmentBlue.get());
     			output.accept(ItemInit.MysteryWavePartBlue.get());
     			output.accept(ItemInit.MysteryWaveBlue_Item.get());
     			output.accept(ItemInit.MysteryWaveBlueCompressed_Item.get());
     			output.accept(ItemInit.MysteryWaveFragmentPurple.get());
     			output.accept(ItemInit.MysteryWavePartPurple.get());
     			output.accept(ItemInit.MysteryWavePurple_Item.get());
     			output.accept(ItemInit.MysteryWavePurpleCompressed_Item.get());
     			
     			output.accept(ItemInit.WaveAM.get());
     			
     		}).build());
    
    public static final RegistryObject<CreativeModeTab> MegamanArmorArmors_TAB = CREATIVE_MODE_TABS.register("megamanarmorarrmorstab", () -> CreativeModeTab.builder()
     		//.withTabsBefore(CollectiumTrophies.Collectium_TAB.get())
     		.title(Component.translatable("itemGroup.megamanarmorarrmorstab"))
     		.icon(() -> ItemInit.MegamanArmorHelmet.get().getDefaultInstance())
     		.displayItems((parameters, output) -> {
     			
     			output.accept(ItemInit.MegamanArmorHelmet.get());
     			output.accept(ItemInit.MegamanArmorChestplate.get());
     			output.accept(ItemInit.MegamanArmorLegs.get());
     			output.accept(ItemInit.MegamanArmorBoots.get());
     			
     			output.accept(ItemInit.MegamanXHelmet.get());
     			output.accept(ItemInit.MegamanXChestplate.get());
     			output.accept(ItemInit.MegamanXLegs.get());
     			output.accept(ItemInit.MegamanXBoots.get());
     			
     			output.accept(ItemInit.MegamanExeHelmet.get());
     			output.accept(ItemInit.MegamanExeChestplate.get());
     			output.accept(ItemInit.MegamanExeLegs.get());
     			output.accept(ItemInit.MegamanExeBoots.get());
     			
     			output.accept(ItemInit.MegamanStarforceHelmet.get());
     			output.accept(ItemInit.MegamanStarforceChestplate.get());
     			output.accept(ItemInit.MegamanStarforceLegs.get());
     			output.accept(ItemInit.MegamanStarforceBoots.get());
     			
     		}).build());
    
    public static final RegistryObject<CreativeModeTab> MegamanArmorMisc_TAB = CREATIVE_MODE_TABS.register("megamanarmormisctab", () -> CreativeModeTab.builder()
     		//.withTabsBefore(CollectiumTrophies.Collectium_TAB.get())
     		.title(Component.translatable("itemGroup.megamanarmormisctab"))
     		.icon(() -> ItemInit.MegaMiniForgePowered.get().getDefaultInstance())
     		.displayItems((parameters, output) -> {
     			
     			output.accept(ItemInit.MegaMiniForge.get());
     			output.accept(ItemInit.MegaMiniForgePowered.get());
     			
     		}).build());

    public MegamanArmorMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

//        // Register the Deferred Register to the mod event bus so blocks get registered
//        BLOCKS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
//        // Register the Deferred Register to the mod event bus so items get registered
//        ITEMS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
//        // Register the Deferred Register to the mod event bus so tabs get registered
//        CREATIVE_MODE_TABS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        
        modEventBus.addListener(this::clientsetup);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
    
    private void clientsetup(final FMLClientSetupEvent event)
    {
        // some preinit code
    	//RegisterColorHandlersEvent.
//    	RegisterColorHandlersEvent.Item.register(GrassColor.get(0.5D, 1.0D), ItemInit.TestColorItem.get()){
//    		
//    	}
//    	@SubscribeEvent
//    	public void registerItemColors(RegisterColorHandlersEvent.Item event){
//    	  event.register(500, ItemInit.TestColorItem.get());
//    	}
    	//ItemColors modeditemcolors = new ItemColors();
  
    	//Minecraft.getInstance().getItemColors().register(Color.BLUE, ItemInit.TestColorItem.get());
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
//        // Some common setup code
//        LOGGER.info("HELLO FROM COMMON SETUP");
//
//        if (Config.logDirtBlock)
//            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
//
//        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);
//
//        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
//        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
//            event.accept(EXAMPLE_BLOCK_ITEM);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
//        // Do something when the server starts
//        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
//            // Some client setup code
//            LOGGER.info("HELLO FROM CLIENT SETUP");
//            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
