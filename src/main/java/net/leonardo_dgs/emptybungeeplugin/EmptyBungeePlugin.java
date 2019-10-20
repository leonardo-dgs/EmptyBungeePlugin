package net.leonardo_dgs.emptybungeeplugin;

import lombok.Getter;
import net.md_5.bungee.api.plugin.Plugin;

public final class EmptyBungeePlugin extends Plugin {

    @Getter
    private static EmptyBungeePlugin instance;

    @Override
    public void onEnable()
    {
        instance = this;
    }

    @Override
    public void onDisable()
    {

    }

}
