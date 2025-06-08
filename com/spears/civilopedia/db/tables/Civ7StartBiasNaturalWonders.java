package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J+\u0010\u0010\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7StartBiasNaturalWonders;", "", "civilizationType", "", "leaderType", "score", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCivilizationType", "()Ljava/lang/String;", "getLeaderType", "getScore", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7StartBiasNaturalWonders {
    private final String civilizationType;
    private final String leaderType;
    private final int score;

    public Civ7StartBiasNaturalWonders(String s, String s1, int v) {
        this.civilizationType = s;
        this.leaderType = s1;
        this.score = v;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.leaderType;
    }

    public final int component3() {
        return this.score;
    }

    public final Civ7StartBiasNaturalWonders copy(String s, String s1, int v) {
        return new Civ7StartBiasNaturalWonders(s, s1, v);
    }

    public static Civ7StartBiasNaturalWonders copy$default(Civ7StartBiasNaturalWonders civ7StartBiasNaturalWonders0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7StartBiasNaturalWonders0.civilizationType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7StartBiasNaturalWonders0.leaderType;
        }
        if((v1 & 4) != 0) {
            v = civ7StartBiasNaturalWonders0.score;
        }
        return civ7StartBiasNaturalWonders0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7StartBiasNaturalWonders)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civ7StartBiasNaturalWonders)object0).civilizationType)) {
            return false;
        }
        return j.a(this.leaderType, ((Civ7StartBiasNaturalWonders)object0).leaderType) ? this.score == ((Civ7StartBiasNaturalWonders)object0).score : false;
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

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.civilizationType == null ? 0 : this.civilizationType.hashCode();
        String s = this.leaderType;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v) * 0x1F + this.score;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ7StartBiasNaturalWonders(civilizationType=", this.civilizationType, ", leaderType=", this.leaderType, ", score="), this.score, ")");
    }
}

