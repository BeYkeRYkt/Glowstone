package net.glowstone.entity.passive;

import java.util.function.Function;
import net.glowstone.entity.GlowEntityTest;
import org.bukkit.Location;

public abstract class GlowChestedHorseTest<T extends GlowChestedHorse> extends GlowEntityTest<T> {
    protected GlowChestedHorseTest(
            Function<Location, ? extends T> entityCreator) {
        super(entityCreator);
    }
}