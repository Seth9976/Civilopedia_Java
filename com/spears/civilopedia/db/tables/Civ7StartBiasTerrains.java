package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J5\u0010\u0013\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7StartBiasTerrains;", "", "civilizationType", "", "leaderType", "terrainType", "score", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCivilizationType", "()Ljava/lang/String;", "getLeaderType", "getScore", "()I", "getTerrainType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7StartBiasTerrains {
    private final String civilizationType;
    private final String leaderType;
    private final int score;
    private final String terrainType;

    public Civ7StartBiasTerrains(String s, String s1, String s2, int v) {
        j.f(s2, "terrainType");
        super();
        this.civilizationType = s;
        this.leaderType = s1;
        this.terrainType = s2;
        this.score = v;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.leaderType;
    }

    public final String component3() {
        return this.terrainType;
    }

    public final int component4() {
        return this.score;
    }

    public final Civ7StartBiasTerrains copy(String s, String s1, String s2, int v) {
        j.f(s2, "terrainType");
        return new Civ7StartBiasTerrains(s, s1, s2, v);
    }

    public static Civ7StartBiasTerrains copy$default(Civ7StartBiasTerrains civ7StartBiasTerrains0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7StartBiasTerrains0.civilizationType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7StartBiasTerrains0.leaderType;
        }
        if((v1 & 4) != 0) {
            s2 = civ7StartBiasTerrains0.terrainType;
        }
        if((v1 & 8) != 0) {
            v = civ7StartBiasTerrains0.score;
        }
        return civ7StartBiasTerrains0.copy(s, s1, s2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7StartBiasTerrains)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civ7StartBiasTerrains)object0).civilizationType)) {
            return false;
        }
        if(!j.a(this.leaderType, ((Civ7StartBiasTerrains)object0).leaderType)) {
            return false;
        }
        return j.a(this.terrainType, ((Civ7StartBiasTerrains)object0).terrainType) ? this.score == ((Civ7StartBiasTerrains)object0).score : false;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final int getScore() {
        return this.score;
    }

    public final String getTerrainType() {
        return this.terrainType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.civilizationType == null ? 0 : this.civilizationType.hashCode();
        String s = this.leaderType;
        if(s != null) {
            v = s.hashCode();
        }
        return f.b((v1 * 0x1F + v) * 0x1F, 0x1F, this.terrainType) + this.score;
    }

    @Override
    public String toString() {
        return f.l(e.j("Civ7StartBiasTerrains(civilizationType=", this.civilizationType, ", leaderType=", this.leaderType, ", terrainType="), this.score, this.terrainType, ", score=", ")");
    }
}

