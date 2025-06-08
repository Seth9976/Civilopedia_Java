package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\u000F\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5HistoricRankings;", "", "ID", "", "historicLeader", "", "leaderQuote", "leaderScore", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHistoricLeader", "()Ljava/lang/String;", "getLeaderQuote", "getLeaderScore", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5HistoricRankings;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5HistoricRankings {
    private final Integer ID;
    private final String historicLeader;
    private final String leaderQuote;
    private final Integer leaderScore;

    public Civ5HistoricRankings(Integer integer0, String s, String s1, Integer integer1) {
        this.ID = integer0;
        this.historicLeader = s;
        this.leaderQuote = s1;
        this.leaderScore = integer1;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.historicLeader;
    }

    public final String component3() {
        return this.leaderQuote;
    }

    public final Integer component4() {
        return this.leaderScore;
    }

    public final Civ5HistoricRankings copy(Integer integer0, String s, String s1, Integer integer1) {
        return new Civ5HistoricRankings(integer0, s, s1, integer1);
    }

    public static Civ5HistoricRankings copy$default(Civ5HistoricRankings civ5HistoricRankings0, Integer integer0, String s, String s1, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5HistoricRankings0.ID;
        }
        if((v & 2) != 0) {
            s = civ5HistoricRankings0.historicLeader;
        }
        if((v & 4) != 0) {
            s1 = civ5HistoricRankings0.leaderQuote;
        }
        if((v & 8) != 0) {
            integer1 = civ5HistoricRankings0.leaderScore;
        }
        return civ5HistoricRankings0.copy(integer0, s, s1, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5HistoricRankings)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5HistoricRankings)object0).ID)) {
            return false;
        }
        if(!j.a(this.historicLeader, ((Civ5HistoricRankings)object0).historicLeader)) {
            return false;
        }
        return j.a(this.leaderQuote, ((Civ5HistoricRankings)object0).leaderQuote) ? j.a(this.leaderScore, ((Civ5HistoricRankings)object0).leaderScore) : false;
    }

    public final String getHistoricLeader() {
        return this.historicLeader;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getLeaderQuote() {
        return this.leaderQuote;
    }

    public final Integer getLeaderScore() {
        return this.leaderScore;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.ID == null ? 0 : this.ID.hashCode();
        int v2 = this.historicLeader == null ? 0 : this.historicLeader.hashCode();
        int v3 = this.leaderQuote == null ? 0 : this.leaderQuote.hashCode();
        Integer integer0 = this.leaderScore;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5HistoricRankings(ID=", this.ID, ", historicLeader=", this.historicLeader, ", leaderQuote=");
        return u9.d(this.leaderScore, this.leaderQuote, ", leaderScore=", ")", stringBuilder0);
    }
}

