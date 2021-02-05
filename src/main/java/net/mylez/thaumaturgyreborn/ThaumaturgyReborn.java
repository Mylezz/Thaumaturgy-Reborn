package net.mylez.thaumaturgyreborn;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.mylez.thaumaturgyreborn.setup.Registration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ThaumaturgyReborn.MOD_ID)
public class ThaumaturgyReborn{
    public static final String MOD_ID = "thaumaturgyreborn";

    private static final Logger LOGGER = LogManager.getLogger();

    public ThaumaturgyReborn() {
        Registration.register();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}