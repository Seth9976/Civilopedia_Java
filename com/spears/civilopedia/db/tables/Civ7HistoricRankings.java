package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J+\u0010\u0010\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7HistoricRankings;", "", "historicLeader", "", "quote", "score", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getHistoricLeader", "()Ljava/lang/String;", "getQuote", "getScore", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7HistoricRankings {
    private final String historicLeader;
    private final String quote;
    private final int score;

    public Civ7HistoricRankings(String s, String s1, int v) {
        this.historicLeader = s;
        this.quote = s1;
        this.score = v;
    }

    public final String component1() {
        return this.historicLeader;
    }

    public final String component2() {
        return this.quote;
    }

    public final int component3() {
        return this.score;
    }

    public final Civ7HistoricRankings copy(String s, String s1, int v) {
        return new Civ7HistoricRankings(s, s1, v);
    }

    public static Civ7HistoricRankings copy$default(Civ7HistoricRankings civ7HistoricRankings0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7HistoricRankings0.historicLeader;
        }
        if((v1 & 2) != 0) {
            s1 = civ7HistoricRankings0.quote;
        }
        if((v1 & 4) != 0) {
            v = civ7HistoricRankings0.score;
        }
        return civ7HistoricRankings0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7HistoricRankings)) {
            return false;
        }
        if(!j.a(this.historicLeader, ((Civ7HistoricRankings)object0).historicLeader)) {
            return false;
        }
        return j.a(this.quote, ((Civ7HistoricRankings)object0).quote) ? this.score == ((Civ7HistoricRankings)object0).score : false;
    }

    public final String getHistoricLeader() {
        return this.historicLeader;
    }

    public final String getQuote() {
        return this.quote;
    }

    public final int getScore() {
        return this.score;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.historicLeader == null ? 0 : this.historicLeader.hashCode();
        String s = this.quote;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v) * 0x1F + this.score;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ7HistoricRankings(historicLeader=", this.historicLeader, ", quote=", this.quote, ", score="), this.score, ")");
    }
}

