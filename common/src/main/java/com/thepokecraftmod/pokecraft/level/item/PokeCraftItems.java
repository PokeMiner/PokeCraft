package com.thepokecraftmod.pokecraft.level.item;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class PokeCraftItems {
    public static final MojangRegistry<Item, Registry<Item>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.ITEM);

    // Available Properties
    private static final Item.Properties BALL_PROPERTIES = new Item.Properties().stacksTo(16);

    public static final Item BEAST_BALL = register("beast_ball", new Item(BALL_PROPERTIES));
    public static final Item CHERISH_BALL = register("cherish_ball", new Item(BALL_PROPERTIES));
    public static final Item DIVE_BALL = register("dive_ball", new Item(BALL_PROPERTIES));
    public static final Item DREAM_BALL = register("dream_ball", new Item(BALL_PROPERTIES));
    public static final Item DUSK_BALL = register("dusk_ball", new Item(BALL_PROPERTIES));
    public static final Item FAST_BALL = register("fast_ball", new Item(BALL_PROPERTIES));
    public static final Item FRIEND_BALL = register("friend_ball", new Item(BALL_PROPERTIES));
    public static final Item GREAT_BALL = register("great_ball", new Item(BALL_PROPERTIES));
    public static final Item ANCIENT_GREAT_BALL = register("ancient_great_ball", new Item(BALL_PROPERTIES));
    public static final Item HEAL_BALL = register("heal_ball", new Item(BALL_PROPERTIES));
    public static final Item HEAVY_BALL = register("heavy_ball", new Item(BALL_PROPERTIES));
    public static final Item LEADEN_BALL = register("leaden_ball", new Item(BALL_PROPERTIES));
    public static final Item LEVEL_BALL = register("level_ball", new Item(BALL_PROPERTIES));
    public static final Item LOVE_BALL = register("love_ball", new Item(BALL_PROPERTIES));
    public static final Item LURE_BALL = register("lure_ball", new Item(BALL_PROPERTIES));
    public static final Item LUXURY_BALL = register("luxury_ball", new Item(BALL_PROPERTIES));
    public static final Item MASTER_BALL = register("master_ball", new Item(BALL_PROPERTIES));
    public static final Item MOON_BALL = register("moon_ball", new Item(BALL_PROPERTIES));
    public static final Item NEST_BALL = register("nest_ball", new Item(BALL_PROPERTIES));
    public static final Item NET_BALL = register("net_ball", new Item(BALL_PROPERTIES));
    public static final Item ORIGIN_BALL = register("origin_ball", new Item(BALL_PROPERTIES));
    public static final Item PARK_BALL = register("park_ball", new Item(BALL_PROPERTIES));
    public static final Item POKE_BALL = register("poke_ball", new Item(BALL_PROPERTIES));
    public static final Item ANCIENT_POKE_BALL = register("ancient_poke_ball", new Item(BALL_PROPERTIES));
    public static final Item PREMIER_BALL = register("premier_ball", new Item(BALL_PROPERTIES));
    public static final Item QUICK_BALL = register("quick_ball", new Item(BALL_PROPERTIES));
    public static final Item REPEAT_BALL = register("repeat_ball", new Item(BALL_PROPERTIES));
    public static final Item SAFARI_BALL = register("safari_ball", new Item(BALL_PROPERTIES));
    public static final Item SPORT_BALL = register("sport_ball", new Item(BALL_PROPERTIES));
    public static final Item STRANGE_BALL = register("strange_ball", new Item(BALL_PROPERTIES));
    public static final Item TIMER_BALL = register("timer_ball", new Item(BALL_PROPERTIES));
    public static final Item ULTRA_BALL = register("ultra_ball", new Item(BALL_PROPERTIES));
    public static final Item ANCIENT_ULTRA_BALL = register("ancient_ultra_ball", new Item(BALL_PROPERTIES));
    public static final Item WING_BALL = register("wing_ball", new Item(BALL_PROPERTIES));
    public static final Item ANTIDOTE = register("antidote", new Item(BALL_PROPERTIES));
    public static final Item AWAKENING = register("awakening", new Item(BALL_PROPERTIES));
    public static final Item BERRY_JUICE = register("berry_juice", new Item(BALL_PROPERTIES));
    public static final Item BIG_MALASADA = register("big_malasada", new Item(BALL_PROPERTIES));
    public static final Item BURN_HEAL = register("burn_heal", new Item(BALL_PROPERTIES));
    public static final Item CASTELIACONE = register("casteliacone", new Item(BALL_PROPERTIES));
    public static final Item ELIXIR = register("elixir", new Item(BALL_PROPERTIES));
    public static final Item ENERGY_POWDER = register("energy_powder", new Item(BALL_PROPERTIES));
    public static final Item ENERGY_ROOT = register("energy_root", new Item(BALL_PROPERTIES));
    public static final Item ETHER = register("ether", new Item(BALL_PROPERTIES));
    public static final Item FRESH_WATER = register("fresh_water", new Item(BALL_PROPERTIES));
    public static final Item FULL_HEAL = register("full_heal", new Item(BALL_PROPERTIES));
    public static final Item FULL_RESTORE = register("full_restore", new Item(BALL_PROPERTIES));
    public static final Item HEAL_POWDER = register("heal_powder", new Item(BALL_PROPERTIES));
    public static final Item HYPER_POTION = register("hyper_potion", new Item(BALL_PROPERTIES));
    public static final Item ICE_HEAL = register("ice_heal", new Item(BALL_PROPERTIES));
    public static final Item LAVA_COOKIE = register("lava_cookie", new Item(BALL_PROPERTIES));
    public static final Item LEMONADE = register("lemonade", new Item(BALL_PROPERTIES));
    public static final Item LUMIOSE_GALETTE = register("lumiose_galette", new Item(BALL_PROPERTIES));
    public static final Item MAX_ELIXIR = register("max_elixir", new Item(BALL_PROPERTIES));
    public static final Item MAX_ETHER = register("max_ether", new Item(BALL_PROPERTIES));
    public static final Item MAX_HONEY = register("max_honey", new Item(BALL_PROPERTIES));
    public static final Item MAX_POTION = register("max_potion", new Item(BALL_PROPERTIES));
    public static final Item MAX_REVIVE = register("max_revive", new Item(BALL_PROPERTIES));
    public static final Item MOOMOO_MILK = register("moomoo_milk", new Item(BALL_PROPERTIES));
    public static final Item OLD_GATEAU = register("old_gateau", new Item(BALL_PROPERTIES));
    public static final Item PARALYZE_HEAL = register("paralyze_heal", new Item(BALL_PROPERTIES));
    public static final Item POTION = register("potion", new Item(BALL_PROPERTIES));
    public static final Item RAGE_CANDY_BAR = register("rage_candy_bar", new Item(BALL_PROPERTIES));
    public static final Item REVIVAL_HERB = register("revival_herb", new Item(BALL_PROPERTIES));
    public static final Item REVIVE = register("revive", new Item(BALL_PROPERTIES));
    public static final Item SACRED_ASH = register("sacred_ash", new Item(BALL_PROPERTIES));
    public static final Item SHALOUR_SABLE = register("shalour_sable", new Item(BALL_PROPERTIES));
    public static final Item SODA_POP = register("soda_pop", new Item(BALL_PROPERTIES));
    public static final Item SUPER_POTION = register("super_potion", new Item(BALL_PROPERTIES));
    public static final Item SWEET_HEART = register("sweet_heart", new Item(BALL_PROPERTIES));
    public static final Item AGUAV_BERRY = register("aguav_berry", new Item(BALL_PROPERTIES));
    public static final Item APICOT_BERRY = register("apicot_berry", new Item(BALL_PROPERTIES));
    public static final Item ASPEAR_BERRY = register("aspear_berry", new Item(BALL_PROPERTIES));
    public static final Item BABIRI_BERRY = register("babiri_berry", new Item(BALL_PROPERTIES));
    public static final Item BELUE_BERRY = register("belue_berry", new Item(BALL_PROPERTIES));
    public static final Item BLUK_BERRY = register("bluk_berry", new Item(BALL_PROPERTIES));
    public static final Item CHARTI_BERRY = register("charti_berry", new Item(BALL_PROPERTIES));
    public static final Item CHERI_BERRY = register("cheri_berry", new Item(BALL_PROPERTIES));
    public static final Item CHESTO_BERRY = register("chesto_berry", new Item(BALL_PROPERTIES));
    public static final Item CHILAN_BERRY = register("chilan_berry", new Item(BALL_PROPERTIES));
    public static final Item CHOPLE_BERRY = register("chople_berry", new Item(BALL_PROPERTIES));
    public static final Item COBA_BERRY = register("coba_berry", new Item(BALL_PROPERTIES));
    public static final Item COLBUR_BERRY = register("colbur_berry", new Item(BALL_PROPERTIES));
    public static final Item CORNN_BERRY = register("cornn_berry", new Item(BALL_PROPERTIES));
    public static final Item CUSTAP_BERRY = register("custap_berry", new Item(BALL_PROPERTIES));
    public static final Item DURIN_BERRY = register("durin_berry", new Item(BALL_PROPERTIES));
    public static final Item ENIGMA_BERRY = register("enigma_berry", new Item(BALL_PROPERTIES));
    public static final Item FIGY_BERRY = register("figy_berry", new Item(BALL_PROPERTIES));
    public static final Item GANLON_BERRY = register("ganlon_berry", new Item(BALL_PROPERTIES));
    public static final Item GREPA_BERRY = register("grepa_berry", new Item(BALL_PROPERTIES));
    public static final Item HABAN_BERRY = register("haban_berry", new Item(BALL_PROPERTIES));
    public static final Item HONDEW_BERRY = register("hondew_berry", new Item(BALL_PROPERTIES));
    public static final Item IAPAPA_BERRY = register("iapapa_berry", new Item(BALL_PROPERTIES));
    public static final Item JABOCA_BERRY = register("jaboca_berry", new Item(BALL_PROPERTIES));
    public static final Item KASIB_BERRY = register("kasib_berry", new Item(BALL_PROPERTIES));
    public static final Item KEBIA_BERRY = register("kebia_berry", new Item(BALL_PROPERTIES));
    public static final Item KEE_BERRY = register("kee_berry", new Item(BALL_PROPERTIES));
    public static final Item KELPSY_BERRY = register("kelpsy_berry", new Item(BALL_PROPERTIES));
    public static final Item LANSAT_BERRY = register("lansat_berry", new Item(BALL_PROPERTIES));
    public static final Item LEPPA_BERRY = register("leppa_berry", new Item(BALL_PROPERTIES));
    public static final Item LIECHI_BERRY = register("liechi_berry", new Item(BALL_PROPERTIES));
    public static final Item LUM_BERRY = register("lum_berry", new Item(BALL_PROPERTIES));
    public static final Item MAGO_BERRY = register("mago_berry", new Item(BALL_PROPERTIES));
    public static final Item MAGOST_BERRY = register("magost_berry", new Item(BALL_PROPERTIES));
    public static final Item MARANGA_BERRY = register("maranga_berry", new Item(BALL_PROPERTIES));
    public static final Item MICLE_BERRY = register("micle_berry", new Item(BALL_PROPERTIES));
    public static final Item NANAB_BERRY = register("nanab_berry", new Item(BALL_PROPERTIES));
    public static final Item NOMEL_BERRY = register("nomel_berry", new Item(BALL_PROPERTIES));
    public static final Item OCCA_BERRY = register("occa_berry", new Item(BALL_PROPERTIES));
    public static final Item ORAN_BERRY = register("oran_berry", new Item(BALL_PROPERTIES));
    public static final Item PAMTRE_BERRY = register("pamtre_berry", new Item(BALL_PROPERTIES));
    public static final Item PASSHO_BERRY = register("passho_berry", new Item(BALL_PROPERTIES));
    public static final Item PAYAPA_BERRY = register("payapa_berry", new Item(BALL_PROPERTIES));
    public static final Item PECHA_BERRY = register("pecha_berry", new Item(BALL_PROPERTIES));
    public static final Item PERSIM_BERRY = register("persim_berry", new Item(BALL_PROPERTIES));
    public static final Item PETAYA_BERRY = register("petaya_berry", new Item(BALL_PROPERTIES));
    public static final Item PINAP_BERRY = register("pinap_berry", new Item(BALL_PROPERTIES));
    public static final Item POMEG_BERRY = register("pomeg_berry", new Item(BALL_PROPERTIES));
    public static final Item QUALOT_BERRY = register("qualot_berry", new Item(BALL_PROPERTIES));
    public static final Item RABUTA_BERRY = register("rabuta_berry", new Item(BALL_PROPERTIES));
    public static final Item RAWST_BERRY = register("rawst_berry", new Item(BALL_PROPERTIES));
    public static final Item RAZZ_BERRY = register("razz_berry", new Item(BALL_PROPERTIES));
    public static final Item RINDO_BERRY = register("rindo_berry", new Item(BALL_PROPERTIES));
    public static final Item ROSELI_BERRY = register("roseli_berry", new Item(BALL_PROPERTIES));
    public static final Item ROWAP_BERRY = register("rowap_berry", new Item(BALL_PROPERTIES));
    public static final Item SALAC_BERRY = register("salac_berry", new Item(BALL_PROPERTIES));
    public static final Item SHUCA_BERRY = register("shuca_berry", new Item(BALL_PROPERTIES));
    public static final Item SITRUS_BERRY = register("sitrus_berry", new Item(BALL_PROPERTIES));
    public static final Item SPELON_BERRY = register("spelon_berry", new Item(BALL_PROPERTIES));
    public static final Item STARF_BERRY = register("starf_berry", new Item(BALL_PROPERTIES));
    public static final Item TAMATO_BERRY = register("tamato_berry", new Item(BALL_PROPERTIES));
    public static final Item TANGA_BERRY = register("tanga_berry", new Item(BALL_PROPERTIES));
    public static final Item WACAN_BERRY = register("wacan_berry", new Item(BALL_PROPERTIES));
    public static final Item WATMEL_BERRY = register("watmel_berry", new Item(BALL_PROPERTIES));
    public static final Item WEPEAR_BERRY = register("wepear_berry", new Item(BALL_PROPERTIES));
    public static final Item WIKI_BERRY = register("wiki_berry", new Item(BALL_PROPERTIES));
    public static final Item YACHE_BERRY = register("yache_berry", new Item(BALL_PROPERTIES));

    public static void onInitialize() {
    }

    public static Item register(String name, Item item) {
        return REGISTRY.register(name, item);
    }
}
