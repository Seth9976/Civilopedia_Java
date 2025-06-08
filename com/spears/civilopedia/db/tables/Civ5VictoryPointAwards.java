package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5VictoryPointAwards;", "", "victoryType", "", "victoryPoints", "", "(Ljava/lang/String;I)V", "getVictoryPoints", "()I", "getVictoryType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5VictoryPointAwards {
    private final int victoryPoints;
    private final String victoryType;

    public Civ5VictoryPointAwards(String s, int v) {
        this.victoryType = s;
        this.victoryPoints = v;
    }

    public final String component1() {
        return this.victoryType;
    }

    public final int component2() {
        return this.victoryPoints;
    }

    public final Civ5VictoryPointAwards copy(String s, int v) {
        return new Civ5VictoryPointAwards(s, v);
    }

    public static Civ5VictoryPointAwards copy$default(Civ5VictoryPointAwards civ5VictoryPointAwards0, String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5VictoryPointAwards0.victoryType;
        }
        if((v1 & 2) != 0) {
            v = civ5VictoryPointAwards0.victoryPoints;
        }
        return civ5VictoryPointAwards0.copy(s, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5VictoryPointAwards)) {
            return false;
        }
        return j.a(this.victoryType, ((Civ5VictoryPointAwards)object0).victoryType) ? this.victoryPoints == ((Civ5VictoryPointAwards)object0).victoryPoints : false;
    }

    public final int getVictoryPoints() {
        return this.victoryPoints;
    }

    public final String getVictoryType() {
        return this.victoryType;
    }

    @Override
    public int hashCode() {
        return this.victoryType == null ? this.victoryPoints : this.victoryType.hashCode() * 0x1F + this.victoryPoints;
    }

    @Override
    public String toString() {
        return f.f(this.victoryPoints, "Civ5VictoryPointAwards(victoryType=", this.victoryType, ", victoryPoints=", ")");
    }
}

