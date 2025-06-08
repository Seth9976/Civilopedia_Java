package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Terrain_YieldChanges;", "", "terrainType", "", "yieldType", "yieldChange", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTerrainType", "()Ljava/lang/String;", "getYieldChange", "()I", "getYieldType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Terrain_YieldChanges {
    private final String terrainType;
    private final int yieldChange;
    private final String yieldType;

    public Terrain_YieldChanges(String s, String s1, int v) {
        j.f(s, "terrainType");
        j.f(s1, "yieldType");
        super();
        this.terrainType = s;
        this.yieldType = s1;
        this.yieldChange = v;
    }

    public final String component1() {
        return this.terrainType;
    }

    public final String component2() {
        return this.yieldType;
    }

    public final int component3() {
        return this.yieldChange;
    }

    public final Terrain_YieldChanges copy(String s, String s1, int v) {
        j.f(s, "terrainType");
        j.f(s1, "yieldType");
        return new Terrain_YieldChanges(s, s1, v);
    }

    public static Terrain_YieldChanges copy$default(Terrain_YieldChanges terrain_YieldChanges0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = terrain_YieldChanges0.terrainType;
        }
        if((v1 & 2) != 0) {
            s1 = terrain_YieldChanges0.yieldType;
        }
        if((v1 & 4) != 0) {
            v = terrain_YieldChanges0.yieldChange;
        }
        return terrain_YieldChanges0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Terrain_YieldChanges)) {
            return false;
        }
        if(!j.a(this.terrainType, ((Terrain_YieldChanges)object0).terrainType)) {
            return false;
        }
        return j.a(this.yieldType, ((Terrain_YieldChanges)object0).yieldType) ? this.yieldChange == ((Terrain_YieldChanges)object0).yieldChange : false;
    }

    public final String getTerrainType() {
        return this.terrainType;
    }

    public final int getYieldChange() {
        return this.yieldChange;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        return f.b(this.terrainType.hashCode() * 0x1F, 0x1F, this.yieldType) + this.yieldChange;
    }

    @Override
    public String toString() {
        return e.g(e.j("Terrain_YieldChanges(terrainType=", this.terrainType, ", yieldType=", this.yieldType, ", yieldChange="), this.yieldChange, ")");
    }
}

