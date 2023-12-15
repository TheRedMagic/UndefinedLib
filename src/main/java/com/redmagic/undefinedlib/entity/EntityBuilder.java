package com.redmagic.undefinedlib.entity;

import com.redmagic.undefinedlib.async.EntitySpawnWorkLoad;
import lombok.Builder;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.potion.PotionEffect;

import java.util.*;
import java.util.function.Consumer;

@Builder
public class EntityBuilder {

    private EntityType entityType;

    //Base Entity
    private boolean glowing = false;
    private boolean gravity = false;
    private boolean visualByDefault = true;

    private float distance = 0;

    private int fireTicks = 0;
    private int freezeTicks = 0;

    private boolean invulnerable = false;
    private boolean persistent = false;
    private boolean silent = false;

    private int portalCoolDown = 0;

    private float yaw = 0;
    private float pitch = 0;

    private String name = "";
    private boolean showCustomName = false;

    private Entity passenger= null;

    private List<String> scoreboardTags = new ArrayList<>();

    //Mob Entity
    protected boolean aware = false;
    protected LivingEntity target = null;

    //Damageable Entity
    protected double absorptionAmount = 0.0;
    protected double maxHealth = 0.0;
    protected double health = 0.0;

    //Animal Entity
    protected UUID cause = null;
    protected int loveModeTicks = 0;

    //Age able Entity
    protected boolean adult = true;
    protected int age = 0;
    protected boolean breed = false;

    //Living Entity
    protected Collection<PotionEffect> potionEffects = new ArrayList<>();
    protected boolean ai = true;
    protected boolean canPickUpItems = true;
    protected boolean isCollectable = true;
    protected boolean isGliding = false;
    protected boolean isInvisible = false;
    protected Entity setLeashHolder = null;
    protected boolean isSwimming = false;

    public EntityBuilder(EntityType entityType){
        this.entityType = entityType;
    }

    public EntityBuilder setName(String name){
        this.name = name;
        return this;
    }
    public EntityBuilder addScoreboardTag(String tag){
        scoreboardTags.add(tag);
        return this;
    }
    public EntityBuilder setScoreboardTags(List<String> tags){
        scoreboardTags = tags;
        return this;
    }
    public EntityBuilder setPassenger(Entity entity){
        passenger = entity;
        return this;
    }
    public EntityBuilder setShowCustomName(boolean showCustomName){
        this.showCustomName = showCustomName;
        return this;
    }
    public EntityBuilder setGlowing(boolean glowing) {
        this.glowing = glowing;
        return this;
    }
    public EntityBuilder setGravity(boolean gravity){
        this.gravity = gravity;
        return this;
    }
    public EntityBuilder setFallDistance(float distance){
        this.distance = distance;
        return this;
    }
    public EntityBuilder setFireTicks(int ticks){
        this.fireTicks = ticks;
        return this;
    }
    public EntityBuilder setFreezeTicks(int ticks){
        this.freezeTicks = ticks;
        return this;
    }
    public EntityBuilder setInvulnerable(boolean invulnerable){
        this.invulnerable = invulnerable;
        return this;
    }
    public EntityBuilder setPortalCooldown(int cooldown){
        this.portalCoolDown = cooldown;
        return this;
    }
    public EntityBuilder setPersistent(boolean persistent){
        this.persistent = persistent;
        return this;
    }
    public EntityBuilder setRotation(float yaw, float pitch){
        this.yaw = yaw;
        this.pitch = pitch;
        return this;
    }
    public EntityBuilder setSilent(boolean silent){
        this.silent = silent;
        return this;
    }
    public EntityBuilder setVisibleByDefault(boolean visibleByDefault){
        this.visualByDefault = visibleByDefault;
        return this;
    }

    public Entity buildSync(Location location){
        if (location == null) return null;
        Entity entity = location.getWorld().spawnEntity(location, entityType);

        setBaseInfo(entity);

        if (entity instanceof Mob mob){
            mob.setAware(aware);
            mob.setTarget(target);
        }
        if (entity instanceof Damageable damageable){
            if (maxHealth <= 0.0) maxHealth = damageable.getMaxHealth();
            if (health <= 0.0 || health > maxHealth) health = maxHealth;
            damageable.setMaxHealth(maxHealth);
            damageable.setHealth(health);
            damageable.setAbsorptionAmount(absorptionAmount);
        }
        if (entity instanceof Animals animals){
            if (cause != null) animals.setBreedCause(cause);
            animals.setLoveModeTicks(loveModeTicks);
        }
        if (entity instanceof Ageable ageable){
            if (adult){
                ageable.setAdult();
            }else {
                ageable.setBaby();
            }
            if (age > 0){
                ageable.setAge(age);
            }
            ageable.setBreed(breed);
        }
        if (entity instanceof LivingEntity livingEntity){
            livingEntity.addPotionEffects(potionEffects);
            livingEntity.setAI(ai);
            livingEntity.setCanPickupItems(canPickUpItems);
            livingEntity.setCollidable(isCollectable);
            livingEntity.setGliding(isGliding);
            livingEntity.setInvisible(isInvisible);
            if (setLeashHolder != null) livingEntity.setLeashHolder(setLeashHolder);
            livingEntity.setSwimming(isSwimming);
        }

        return entity;
    }

    private Entity setBaseInfo(Entity entity){

        entity.setGlowing(glowing);
        entity.setGravity(gravity);
        entity.setFallDistance(distance);
        entity.setFireTicks(fireTicks);
        entity.setFireTicks(freezeTicks);
        entity.setInvulnerable(invulnerable);
        entity.setPersistent(persistent);
        entity.setPortalCooldown(portalCoolDown);
        entity.setRotation(yaw, pitch);
        entity.setSilent(silent);
        entity.setVisibleByDefault(visualByDefault);
        entity.setCustomName(name);
        entity.setCustomNameVisible(showCustomName);

        if (passenger != null){
            entity.addPassenger(passenger);
        }
        scoreboardTags.forEach(entity::addScoreboardTag);

        return entity;
    }

    public void buildAsync(Location location, Consumer<Entity> consumer){
        new EntitySpawnWorkLoad(this, location, consumer);
    }

    public void buildAsync(Location location){
        new EntitySpawnWorkLoad(this, location, null);
    }

}
