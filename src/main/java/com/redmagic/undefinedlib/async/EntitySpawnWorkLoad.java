package com.redmagic.undefinedlib.async;

import com.redmagic.undefinedlib.UndefinedLib;
import com.redmagic.undefinedlib.entity.EntityBuilder;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

import java.util.function.Consumer;

public class EntitySpawnWorkLoad implements WorkLoad{

    private final UndefinedLib lib = UndefinedLib.getPlugin(UndefinedLib.class);

    private final EntityBuilder entityBuilder;

    private final Location location;
    private final Consumer<Entity> consumer;

    public EntitySpawnWorkLoad(EntityBuilder builder, Location location, Consumer<Entity> consumer){
        this.entityBuilder = builder;
        this.location = location;
        this.consumer = consumer;
        lib.getWorkLoadManager().addWorkload(this);
    }

    @Override
    public void compute() {
        Entity entity = entityBuilder.buildSync(location);
        if (consumer == null) return;
        consumer.accept(entity);
    }
}
