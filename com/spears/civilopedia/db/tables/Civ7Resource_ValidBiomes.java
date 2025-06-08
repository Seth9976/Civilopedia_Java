package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J3\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Resource_ValidBiomes;", "", "biomeType", "", "featureType", "resourceType", "terrainType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBiomeType", "()Ljava/lang/String;", "getFeatureType", "getResourceType", "getTerrainType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Resource_ValidBiomes {
    private final String biomeType;
    private final String featureType;
    private final String resourceType;
    private final String terrainType;

    public Civ7Resource_ValidBiomes(String s, String s1, String s2, String s3) {
        j.f(s, "biomeType");
        j.f(s2, "resourceType");
        j.f(s3, "terrainType");
        super();
        this.biomeType = s;
        this.featureType = s1;
        this.resourceType = s2;
        this.terrainType = s3;
    }

    public final String component1() {
        return this.biomeType;
    }

    public final String component2() {
        return this.featureType;
    }

    public final String component3() {
        return this.resourceType;
    }

    public final String component4() {
        return this.terrainType;
    }

    public final Civ7Resource_ValidBiomes copy(String s, String s1, String s2, String s3) {
        j.f(s, "biomeType");
        j.f(s2, "resourceType");
        j.f(s3, "terrainType");
        return new Civ7Resource_ValidBiomes(s, s1, s2, s3);
    }

    public static Civ7Resource_ValidBiomes copy$default(Civ7Resource_ValidBiomes civ7Resource_ValidBiomes0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Resource_ValidBiomes0.biomeType;
        }
        if((v & 2) != 0) {
            s1 = civ7Resource_ValidBiomes0.featureType;
        }
        if((v & 4) != 0) {
            s2 = civ7Resource_ValidBiomes0.resourceType;
        }
        if((v & 8) != 0) {
            s3 = civ7Resource_ValidBiomes0.terrainType;
        }
        return civ7Resource_ValidBiomes0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Resource_ValidBiomes)) {
            return false;
        }
        if(!j.a(this.biomeType, ((Civ7Resource_ValidBiomes)object0).biomeType)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ7Resource_ValidBiomes)object0).featureType)) {
            return false;
        }
        return j.a(this.resourceType, ((Civ7Resource_ValidBiomes)object0).resourceType) ? j.a(this.terrainType, ((Civ7Resource_ValidBiomes)object0).terrainType) : false;
    }

    public final String getBiomeType() {
        return this.biomeType;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final String getTerrainType() {
        return this.terrainType;
    }

    @Override
    public int hashCode() {
        int v = this.biomeType.hashCode();
        return this.featureType == null ? this.terrainType.hashCode() + f.b(v * 961, 0x1F, this.resourceType) : this.terrainType.hashCode() + f.b((v * 0x1F + this.featureType.hashCode()) * 0x1F, 0x1F, this.resourceType);
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ7Resource_ValidBiomes(biomeType=", this.biomeType, ", featureType=", this.featureType, ", resourceType="), this.resourceType, ", terrainType=", this.terrainType, ")");
    }
}

