package io.github.kopse;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;


@Mod(xyloniaoriginsbackground.MODID)
public class xyloniaoriginsbackground {
    public static final String MODID = "xyloniaoriginsbackground";
    public static final Logger LOGGER = LogUtils.getLogger();

    public xyloniaoriginsbackground(IEventBus modEventBus) {
        LOGGER.info("basicorigins background initializing");
    }
}
