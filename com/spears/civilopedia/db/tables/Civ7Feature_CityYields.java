package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u000EJ\u0010\u0010\u0013\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u000EJ\u0010\u0010\u0014\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u000EJV\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u000EJ\u0010\u0010\u001A\u001A\u00020\bH\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0015J\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010 \u001A\u0004\b!\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010 \u001A\u0004\b\"\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010 \u001A\u0004\b#\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010 \u001A\u0004\b$\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010 \u001A\u0004\b%\u0010\u000ER\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\t\u0010&\u001A\u0004\b\'\u0010\u0015R\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010 \u001A\u0004\b(\u0010\u000E\u00A8\u0006)"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Feature_CityYields;", "Lo2/m;", "", "feature_CityYieldType", "biome", "featureClass", "featureType", "terrain", "", "yieldChange", "yieldType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()I", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7Feature_CityYields;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFeature_CityYieldType", "getBiome", "getFeatureClass", "getFeatureType", "getTerrain", "I", "getYieldChange", "getYieldType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Feature_CityYields implements m {
    private final String biome;
    private final String featureClass;
    private final String featureType;
    private final String feature_CityYieldType;
    private final String terrain;
    private final int yieldChange;
    private final String yieldType;

    public Civ7Feature_CityYields(String s, String s1, String s2, String s3, String s4, int v, String s5) {
        j.f(s, "feature_CityYieldType");
        j.f(s1, "biome");
        j.f(s2, "featureClass");
        j.f(s3, "featureType");
        j.f(s4, "terrain");
        j.f(s5, "yieldType");
        super();
        this.feature_CityYieldType = s;
        this.biome = s1;
        this.featureClass = s2;
        this.featureType = s3;
        this.terrain = s4;
        this.yieldChange = v;
        this.yieldType = s5;
    }

    public final String component1() {
        return this.feature_CityYieldType;
    }

    public final String component2() {
        return this.biome;
    }

    public final String component3() {
        return this.featureClass;
    }

    public final String component4() {
        return this.featureType;
    }

    public final String component5() {
        return this.terrain;
    }

    public final int component6() {
        return this.yieldChange;
    }

    public final String component7() {
        return this.yieldType;
    }

    public final Civ7Feature_CityYields copy(String s, String s1, String s2, String s3, String s4, int v, String s5) {
        j.f(s, "feature_CityYieldType");
        j.f(s1, "biome");
        j.f(s2, "featureClass");
        j.f(s3, "featureType");
        j.f(s4, "terrain");
        j.f(s5, "yieldType");
        return new Civ7Feature_CityYields(s, s1, s2, s3, s4, v, s5);
    }

    public static Civ7Feature_CityYields copy$default(Civ7Feature_CityYields civ7Feature_CityYields0, String s, String s1, String s2, String s3, String s4, int v, String s5, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7Feature_CityYields0.feature_CityYieldType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7Feature_CityYields0.biome;
        }
        if((v1 & 4) != 0) {
            s2 = civ7Feature_CityYields0.featureClass;
        }
        if((v1 & 8) != 0) {
            s3 = civ7Feature_CityYields0.featureType;
        }
        if((v1 & 16) != 0) {
            s4 = civ7Feature_CityYields0.terrain;
        }
        if((v1 & 0x20) != 0) {
            v = civ7Feature_CityYields0.yieldChange;
        }
        if((v1 & 0x40) != 0) {
            s5 = civ7Feature_CityYields0.yieldType;
        }
        return civ7Feature_CityYields0.copy(s, s1, s2, s3, s4, v, s5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Feature_CityYields)) {
            return false;
        }
        if(!j.a(this.feature_CityYieldType, ((Civ7Feature_CityYields)object0).feature_CityYieldType)) {
            return false;
        }
        if(!j.a(this.biome, ((Civ7Feature_CityYields)object0).biome)) {
            return false;
        }
        if(!j.a(this.featureClass, ((Civ7Feature_CityYields)object0).featureClass)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ7Feature_CityYields)object0).featureType)) {
            return false;
        }
        if(!j.a(this.terrain, ((Civ7Feature_CityYields)object0).terrain)) {
            return false;
        }
        return this.yieldChange == ((Civ7Feature_CityYields)object0).yieldChange ? j.a(this.yieldType, ((Civ7Feature_CityYields)object0).yieldType) : false;
    }

    public final String getBiome() {
        return this.biome;
    }

    public final String getFeatureClass() {
        return this.featureClass;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final String getFeature_CityYieldType() {
        return this.feature_CityYieldType;
    }

    public final String getTerrain() {
        return this.terrain;
    }

    public final int getYieldChange() {
        return this.yieldChange;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        return this.yieldType.hashCode() + (f.b(f.b(f.b(f.b(this.feature_CityYieldType.hashCode() * 0x1F, 0x1F, this.biome), 0x1F, this.featureClass), 0x1F, this.featureType), 0x1F, this.terrain) + this.yieldChange) * 0x1F;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.feature_CityYieldType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Feature_CityYields(feature_CityYieldType=", this.feature_CityYieldType, ", biome=", this.biome, ", featureClass=");
        f.t(stringBuilder0, this.featureClass, ", featureType=", this.featureType, ", terrain=");
        f.s(stringBuilder0, this.terrain, ", yieldChange=", this.yieldChange, ", yieldType=");
        return e.h(stringBuilder0, this.yieldType, ")");
    }
}

