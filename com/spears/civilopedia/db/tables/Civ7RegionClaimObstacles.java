package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7RegionClaimObstacles;", "", "featureClassType", "", "featureType", "ID", "riverType", "terrainType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getID", "()Ljava/lang/String;", "getFeatureClassType", "getFeatureType", "getRiverType", "getTerrainType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7RegionClaimObstacles {
    private final String ID;
    private final String featureClassType;
    private final String featureType;
    private final String riverType;
    private final String terrainType;

    public Civ7RegionClaimObstacles(String s, String s1, String s2, String s3, String s4) {
        j.f(s2, "ID");
        super();
        this.featureClassType = s;
        this.featureType = s1;
        this.ID = s2;
        this.riverType = s3;
        this.terrainType = s4;
    }

    public final String component1() {
        return this.featureClassType;
    }

    public final String component2() {
        return this.featureType;
    }

    public final String component3() {
        return this.ID;
    }

    public final String component4() {
        return this.riverType;
    }

    public final String component5() {
        return this.terrainType;
    }

    public final Civ7RegionClaimObstacles copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s2, "ID");
        return new Civ7RegionClaimObstacles(s, s1, s2, s3, s4);
    }

    public static Civ7RegionClaimObstacles copy$default(Civ7RegionClaimObstacles civ7RegionClaimObstacles0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7RegionClaimObstacles0.featureClassType;
        }
        if((v & 2) != 0) {
            s1 = civ7RegionClaimObstacles0.featureType;
        }
        if((v & 4) != 0) {
            s2 = civ7RegionClaimObstacles0.ID;
        }
        if((v & 8) != 0) {
            s3 = civ7RegionClaimObstacles0.riverType;
        }
        if((v & 16) != 0) {
            s4 = civ7RegionClaimObstacles0.terrainType;
        }
        return civ7RegionClaimObstacles0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7RegionClaimObstacles)) {
            return false;
        }
        if(!j.a(this.featureClassType, ((Civ7RegionClaimObstacles)object0).featureClassType)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ7RegionClaimObstacles)object0).featureType)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ7RegionClaimObstacles)object0).ID)) {
            return false;
        }
        return j.a(this.riverType, ((Civ7RegionClaimObstacles)object0).riverType) ? j.a(this.terrainType, ((Civ7RegionClaimObstacles)object0).terrainType) : false;
    }

    public final String getFeatureClassType() {
        return this.featureClassType;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final String getID() {
        return this.ID;
    }

    public final String getRiverType() {
        return this.riverType;
    }

    public final String getTerrainType() {
        return this.terrainType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(((this.featureClassType == null ? 0 : this.featureClassType.hashCode()) * 0x1F + (this.featureType == null ? 0 : this.featureType.hashCode())) * 0x1F, 0x1F, this.ID);
        int v2 = this.riverType == null ? 0 : this.riverType.hashCode();
        String s = this.terrainType;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7RegionClaimObstacles(featureClassType=", this.featureClassType, ", featureType=", this.featureType, ", ID=");
        f.t(stringBuilder0, this.ID, ", riverType=", this.riverType, ", terrainType=");
        return e.h(stringBuilder0, this.terrainType, ")");
    }
}

