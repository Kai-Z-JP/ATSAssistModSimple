package jp.kaiz.atsassistmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = ATSAssistCore.MODID, version = ATSAssistCore.VERSION, name = ATSAssistCore.MODID)
public class ATSAssistCore {
    //変更するとブロック消える
    public static final String MODID = "ATSAssistMod";

    public static final String VERSION = "Simple3.0";

    @Mod.Instance(MODID)
    public static ATSAssistCore INSTANCE;

    public static final SimpleNetworkWrapper NETWORK_WRAPPER = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);

    //preInit init postInitの順
    @EventHandler
    public void init(FMLInitializationEvent event) {
        new ATSAssistNetwork().init();
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("[ATSAssist]Loading...");
    }
}