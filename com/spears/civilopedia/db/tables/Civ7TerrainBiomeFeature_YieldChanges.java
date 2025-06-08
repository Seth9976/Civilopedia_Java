package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\bHÆ\u0003J\t\u0010\u0018\u001A\u00020\bHÆ\u0003JG\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\bHÆ\u0001J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\bHÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\f¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7TerrainBiomeFeature_YieldChanges;", "", "biomeType", "", "featureType", "terrainType", "yieldType", "scaleByGameAge", "", "yieldChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getBiomeType", "()Ljava/lang/String;", "getFeatureType", "getScaleByGameAge", "()I", "getTerrainType", "getYieldChange", "getYieldType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7TerrainBiomeFeature_YieldChanges {
    private final String biomeType;
    private final String featureType;
    private final int scaleByGameAge;
    private final String terrainType;
    private final int yieldChange;
    private final String yieldType;

    public Civ7TerrainBiomeFeature_YieldChanges(String s, String s1, String s2, String s3, int v, int v1) {
        j.f(s, "biomeType");
        j.f(s2, "terrainType");
        j.f(s3, "yieldType");
        super();
        this.biomeType = s;
        this.featureType = s1;
        this.terrainType = s2;
        this.yieldType = s3;
        this.scaleByGameAge = v;
        this.yieldChange = v1;
    }

    public final String component1() {
        return this.biomeType;
    }

    public final String component2() {
        return this.featureType;
    }

    public final String component3() {
        return this.terrainType;
    }

    public final String component4() {
        return this.yieldType;
    }

    public final int component5() {
        return this.scaleByGameAge;
    }

    public final int component6() {
        return this.yieldChange;
    }

    public final Civ7TerrainBiomeFeature_YieldChanges copy(String s, String s1, String s2, String s3, int v, int v1) {
        j.f(s, "biomeType");
        j.f(s2, "terrainType");
        j.f(s3, "yieldType");
        return new Civ7TerrainBiomeFeature_YieldChanges(s, s1, s2, s3, v, v1);
    }

    public static Civ7TerrainBiomeFeature_YieldChanges copy$default(Civ7TerrainBiomeFeature_YieldChanges civ7TerrainBiomeFeature_YieldChanges0, String s, String s1, String s2, String s3, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7TerrainBiomeFeature_YieldChanges0.biomeType;
        }
        if((v2 & 2) != 0) {
            s1 = civ7TerrainBiomeFeature_YieldChanges0.featureType;
        }
        if((v2 & 4) != 0) {
            s2 = civ7TerrainBiomeFeature_YieldChanges0.terrainType;
        }
        if((v2 & 8) != 0) {
            s3 = civ7TerrainBiomeFeature_YieldChanges0.yieldType;
        }
        if((v2 & 16) != 0) {
            v = civ7TerrainBiomeFeature_YieldChanges0.scaleByGameAge;
        }
        if((v2 & 0x20) != 0) {
            v1 = civ7TerrainBiomeFeature_YieldChanges0.yieldChange;
        }
        return civ7TerrainBiomeFeature_YieldChanges0.copy(s, s1, s2, s3, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7TerrainBiomeFeature_YieldChanges)) {
            return false;
        }
        if(!j.a(this.biomeType, ((Civ7TerrainBiomeFeature_YieldChanges)object0).biomeType)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ7TerrainBiomeFeature_YieldChanges)object0).featureType)) {
            return false;
        }
        if(!j.a(this.terrainType, ((Civ7TerrainBiomeFeature_YieldChanges)object0).terrainType)) {
            return false;
        }
        if(!j.a(this.yieldType, ((Civ7TerrainBiomeFeature_YieldChanges)object0).yieldType)) {
            return false;
        }
        return this.scaleByGameAge == ((Civ7TerrainBiomeFeature_YieldChanges)object0).scaleByGameAge ? this.yieldChange == ((Civ7TerrainBiomeFeature_YieldChanges)object0).yieldChange : false;
    }

    public final String getBiomeType() {
        return this.biomeType;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final int getScaleByGameAge() {
        return this.scaleByGameAge;
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
        int v = this.biomeType.hashCode();
        return this.featureType == null ? (f.b(f.b(v * 961, 0x1F, this.terrainType), 0x1F, this.yieldType) + this.scaleByGameAge) * 0x1F + this.yieldChange : (f.b(f.b((v * 0x1F + this.featureType.hashCode()) * 0x1F, 0x1F, this.terrainType), 0x1F, this.yieldType) + this.scaleByGameAge) * 0x1F + this.yieldChange;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7TerrainBiomeFeature_YieldChanges(biomeType=", this.biomeType, ", featureType=", this.featureType, ", terrainType=");
        f.t(stringBuilder0, this.terrainType, ", yieldType=", this.yieldType, ", scaleByGameAge=");
        stringBuilder0.append(this.scaleByGameAge);
        stringBuilder0.append(", yieldChange=");
        stringBuilder0.append(this.yieldChange);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

