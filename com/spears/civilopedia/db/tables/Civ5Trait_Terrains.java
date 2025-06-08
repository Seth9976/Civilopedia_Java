package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Trait_Terrains;", "", "traitType", "", "terrainType", "strategicResourceQuantityModifier", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getStrategicResourceQuantityModifier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTerrainType", "()Ljava/lang/String;", "getTraitType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Trait_Terrains;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Trait_Terrains {
    private final Integer strategicResourceQuantityModifier;
    private final String terrainType;
    private final String traitType;

    public Civ5Trait_Terrains(String s, String s1, Integer integer0) {
        this.traitType = s;
        this.terrainType = s1;
        this.strategicResourceQuantityModifier = integer0;
    }

    public final String component1() {
        return this.traitType;
    }

    public final String component2() {
        return this.terrainType;
    }

    public final Integer component3() {
        return this.strategicResourceQuantityModifier;
    }

    public final Civ5Trait_Terrains copy(String s, String s1, Integer integer0) {
        return new Civ5Trait_Terrains(s, s1, integer0);
    }

    public static Civ5Trait_Terrains copy$default(Civ5Trait_Terrains civ5Trait_Terrains0, String s, String s1, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Trait_Terrains0.traitType;
        }
        if((v & 2) != 0) {
            s1 = civ5Trait_Terrains0.terrainType;
        }
        if((v & 4) != 0) {
            integer0 = civ5Trait_Terrains0.strategicResourceQuantityModifier;
        }
        return civ5Trait_Terrains0.copy(s, s1, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Trait_Terrains)) {
            return false;
        }
        if(!j.a(this.traitType, ((Civ5Trait_Terrains)object0).traitType)) {
            return false;
        }
        return j.a(this.terrainType, ((Civ5Trait_Terrains)object0).terrainType) ? j.a(this.strategicResourceQuantityModifier, ((Civ5Trait_Terrains)object0).strategicResourceQuantityModifier) : false;
    }

    public final Integer getStrategicResourceQuantityModifier() {
        return this.strategicResourceQuantityModifier;
    }

    public final String getTerrainType() {
        return this.terrainType;
    }

    public final String getTraitType() {
        return this.traitType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.traitType == null ? 0 : this.traitType.hashCode();
        int v2 = this.terrainType == null ? 0 : this.terrainType.hashCode();
        Integer integer0 = this.strategicResourceQuantityModifier;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return u9.f(e.j("Civ5Trait_Terrains(traitType=", this.traitType, ", terrainType=", this.terrainType, ", strategicResourceQuantityModifier="), this.strategicResourceQuantityModifier, ")");
    }
}

