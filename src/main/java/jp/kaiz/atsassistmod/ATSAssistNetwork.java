package jp.kaiz.atsassistmod;

import cpw.mods.fml.relauncher.Side;
import jp.kaiz.atsassistmod.network.PacketSetNotch;
import jp.kaiz.atsassistmod.network.PacketSetTrainState;

import static jp.kaiz.atsassistmod.ATSAssistCore.NETWORK_WRAPPER;

public class ATSAssistNetwork {
    public void init() {
        NETWORK_WRAPPER.registerMessage(PacketSetNotch.class, PacketSetNotch.class, 0, Side.SERVER);

        NETWORK_WRAPPER.registerMessage(PacketSetTrainState.class, PacketSetTrainState.class, 2, Side.SERVER);
    }
}
