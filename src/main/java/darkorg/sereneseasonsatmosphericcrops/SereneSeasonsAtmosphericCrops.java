package darkorg.sereneseasonsatmosphericcrops;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("sereneseasonsatmosphericcrops")

public class SereneSeasonsAtmosphericCrops {
    public SereneSeasonsAtmosphericCrops() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
