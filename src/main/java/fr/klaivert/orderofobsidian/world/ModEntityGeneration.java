package fr.klaivert.orderofobsidian.world;


import fr.klaivert.orderofobsidian.init.OrderofobsidianModEntities;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModEntityGeneration
{
    public static void onEntitySpawn(final BiomeLoadingEvent event)
    {
        if(doesBiomeMatch(event.getName(), Biomes.LUSH_CAVES))
        {
            event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(OrderofobsidianModEntities.MOSS_WALKER.get(), 3, 2, 4));
        }
        //Example Spawner if want another biome
        /**else if(doesBiomeMatch(event.getName(), Biomes.BADLANDS)){
            event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(CftlcModEntityTypes.MOSS_WALKER.get(), 100, 5, 1));
        }**/
    }

    public static boolean doesBiomeMatch(ResourceLocation biomeNameIn, ResourceKey<Biome> biomeIn)
    {
        return biomeNameIn.getPath().matches(biomeIn.location().getPath());
    }
}