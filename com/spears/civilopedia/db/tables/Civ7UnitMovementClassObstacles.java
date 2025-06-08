package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0002\u0010\u000BJ\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001A\u001A\u00020\tHÆ\u0003J\t\u0010\u001B\u001A\u00020\tHÆ\u0003JW\u0010\u001C\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\tHÆ\u0001J\u0013\u0010\u001D\u001A\u00020\t2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001F\u001A\u00020 HÖ\u0001J\t\u0010!\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0011\u0010\n\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000FR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000F¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitMovementClassObstacles;", "", "featureType", "", "obstacleTag", "riverType", "terrainType", "unitMovementClass", "endsTurn", "", "prohibited", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getEndsTurn", "()Z", "getFeatureType", "()Ljava/lang/String;", "getObstacleTag", "getProhibited", "getRiverType", "getTerrainType", "getUnitMovementClass", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitMovementClassObstacles {
    private final boolean endsTurn;
    private final String featureType;
    private final String obstacleTag;
    private final boolean prohibited;
    private final String riverType;
    private final String terrainType;
    private final String unitMovementClass;

    public Civ7UnitMovementClassObstacles(String s, String s1, String s2, String s3, String s4, boolean z, boolean z1) {
        j.f(s4, "unitMovementClass");
        super();
        this.featureType = s;
        this.obstacleTag = s1;
        this.riverType = s2;
        this.terrainType = s3;
        this.unitMovementClass = s4;
        this.endsTurn = z;
        this.prohibited = z1;
    }

    public final String component1() {
        return this.featureType;
    }

    public final String component2() {
        return this.obstacleTag;
    }

    public final String component3() {
        return this.riverType;
    }

    public final String component4() {
        return this.terrainType;
    }

    public final String component5() {
        return this.unitMovementClass;
    }

    public final boolean component6() {
        return this.endsTurn;
    }

    public final boolean component7() {
        return this.prohibited;
    }

    public final Civ7UnitMovementClassObstacles copy(String s, String s1, String s2, String s3, String s4, boolean z, boolean z1) {
        j.f(s4, "unitMovementClass");
        return new Civ7UnitMovementClassObstacles(s, s1, s2, s3, s4, z, z1);
    }

    public static Civ7UnitMovementClassObstacles copy$default(Civ7UnitMovementClassObstacles civ7UnitMovementClassObstacles0, String s, String s1, String s2, String s3, String s4, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnitMovementClassObstacles0.featureType;
        }
        if((v & 2) != 0) {
            s1 = civ7UnitMovementClassObstacles0.obstacleTag;
        }
        if((v & 4) != 0) {
            s2 = civ7UnitMovementClassObstacles0.riverType;
        }
        if((v & 8) != 0) {
            s3 = civ7UnitMovementClassObstacles0.terrainType;
        }
        if((v & 16) != 0) {
            s4 = civ7UnitMovementClassObstacles0.unitMovementClass;
        }
        if((v & 0x20) != 0) {
            z = civ7UnitMovementClassObstacles0.endsTurn;
        }
        if((v & 0x40) != 0) {
            z1 = civ7UnitMovementClassObstacles0.prohibited;
        }
        return civ7UnitMovementClassObstacles0.copy(s, s1, s2, s3, s4, z, z1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitMovementClassObstacles)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ7UnitMovementClassObstacles)object0).featureType)) {
            return false;
        }
        if(!j.a(this.obstacleTag, ((Civ7UnitMovementClassObstacles)object0).obstacleTag)) {
            return false;
        }
        if(!j.a(this.riverType, ((Civ7UnitMovementClassObstacles)object0).riverType)) {
            return false;
        }
        if(!j.a(this.terrainType, ((Civ7UnitMovementClassObstacles)object0).terrainType)) {
            return false;
        }
        if(!j.a(this.unitMovementClass, ((Civ7UnitMovementClassObstacles)object0).unitMovementClass)) {
            return false;
        }
        return this.endsTurn == ((Civ7UnitMovementClassObstacles)object0).endsTurn ? this.prohibited == ((Civ7UnitMovementClassObstacles)object0).prohibited : false;
    }

    public final boolean getEndsTurn() {
        return this.endsTurn;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final String getObstacleTag() {
        return this.obstacleTag;
    }

    public final boolean getProhibited() {
        return this.prohibited;
    }

    public final String getRiverType() {
        return this.riverType;
    }

    public final String getTerrainType() {
        return this.terrainType;
    }

    public final String getUnitMovementClass() {
        return this.unitMovementClass;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.featureType == null ? 0 : this.featureType.hashCode();
        int v2 = this.obstacleTag == null ? 0 : this.obstacleTag.hashCode();
        int v3 = this.riverType == null ? 0 : this.riverType.hashCode();
        String s = this.terrainType;
        if(s != null) {
            v = s.hashCode();
        }
        int v4 = f.b((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v) * 0x1F, 0x1F, this.unitMovementClass);
        int v5 = 0x4D5;
        int v6 = this.endsTurn ? 0x4CF : 0x4D5;
        if(this.prohibited) {
            v5 = 0x4CF;
        }
        return (v4 + v6) * 0x1F + v5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7UnitMovementClassObstacles(featureType=", this.featureType, ", obstacleTag=", this.obstacleTag, ", riverType=");
        f.t(stringBuilder0, this.riverType, ", terrainType=", this.terrainType, ", unitMovementClass=");
        u9.x(stringBuilder0, this.unitMovementClass, ", endsTurn=", this.endsTurn, ", prohibited=");
        return u9.g(stringBuilder0, this.prohibited, ")");
    }
}

