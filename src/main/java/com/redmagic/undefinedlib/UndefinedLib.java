package com.redmagic.undefinedlib;

import com.redmagic.undefinedlib.async.WorkLoadManager;
import com.redmagic.undefinedlib.entity.DamageableEntityBuilder;
import com.redmagic.undefinedlib.entity.EntityBuilder;
import com.redmagic.undefinedlib.entity.LivingEntityBuilder;
import com.redmagic.undefinedlib.entity.MobBuilder;
import com.redmagic.undefinedlib.item.CompassBuilder;
import com.redmagic.undefinedlib.item.SkullBuilder;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class UndefinedLib extends JavaPlugin {

    private WorkLoadManager workLoadManager;

    @Override
    public void onEnable() {
        // Plugin startup logic

        workLoadManager = new WorkLoadManager();
        Bukkit.getScheduler().runTaskTimer(this, workLoadManager, 0, 1);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
