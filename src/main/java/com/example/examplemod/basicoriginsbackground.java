package com.example.examplemod;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;


@Mod(basicoriginsbackground.MODID)
public class basicoriginsbackground {
    public static final String MODID = "basicoriginsbackground";
    public static final Logger LOGGER = LogUtils.getLogger();

    public basicoriginsbackground(IEventBus modEventBus) {
        LOGGER.info("basicorigins background initializing");
    }
}
