package jp.kaiz.atsassistmod;

import cpw.mods.fml.relauncher.Side;
import jp.kaiz.atsassistmod.network.PacketSetNotch;

import static jp.kaiz.atsassistmod.ATSAssistCore.NETWORK_WRAPPER;

public class ATSAssistNetwork {
    public void init() {
        NETWORK_WRAPPER.registerMessage(PacketSetNotch.class, PacketSetNotch.class, 0, Side.SERVER);
    }
}
