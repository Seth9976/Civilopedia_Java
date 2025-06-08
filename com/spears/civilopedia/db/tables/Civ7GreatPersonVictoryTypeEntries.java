package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\fJ\u0010\u0010\u000F\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJB\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001C\u001A\u0004\b\u001D\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001C\u001A\u0004\b\u001E\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001F\u001A\u0004\b \u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001F\u001A\u0004\b!\u0010\u0010R\u0017\u0010\b\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001C\u001A\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7GreatPersonVictoryTypeEntries;", "Lo2/m;", "", "greatPersonIndividualType", "greatPersonVictorySource", "", "maxPointsPerUse", "points", "victoryType", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7GreatPersonVictoryTypeEntries;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGreatPersonIndividualType", "getGreatPersonVictorySource", "I", "getMaxPointsPerUse", "getPoints", "getVictoryType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7GreatPersonVictoryTypeEntries implements m {
    private final String greatPersonIndividualType;
    private final String greatPersonVictorySource;
    private final int maxPointsPerUse;
    private final int points;
    private final String victoryType;

    public Civ7GreatPersonVictoryTypeEntries(String s, String s1, int v, int v1, String s2) {
        j.f(s, "greatPersonIndividualType");
        j.f(s1, "greatPersonVictorySource");
        j.f(s2, "victoryType");
        super();
        this.greatPersonIndividualType = s;
        this.greatPersonVictorySource = s1;
        this.maxPointsPerUse = v;
        this.points = v1;
        this.victoryType = s2;
    }

    public final String component1() {
        return this.greatPersonIndividualType;
    }

    public final String component2() {
        return this.greatPersonVictorySource;
    }

    public final int component3() {
        return this.maxPointsPerUse;
    }

    public final int component4() {
        return this.points;
    }

    public final String component5() {
        return this.victoryType;
    }

    public final Civ7GreatPersonVictoryTypeEntries copy(String s, String s1, int v, int v1, String s2) {
        j.f(s, "greatPersonIndividualType");
        j.f(s1, "greatPersonVictorySource");
        j.f(s2, "victoryType");
        return new Civ7GreatPersonVictoryTypeEntries(s, s1, v, v1, s2);
    }

    public static Civ7GreatPersonVictoryTypeEntries copy$default(Civ7GreatPersonVictoryTypeEntries civ7GreatPersonVictoryTypeEntries0, String s, String s1, int v, int v1, String s2, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7GreatPersonVictoryTypeEntries0.greatPersonIndividualType;
        }
        if((v2 & 2) != 0) {
            s1 = civ7GreatPersonVictoryTypeEntries0.greatPersonVictorySource;
        }
        if((v2 & 4) != 0) {
            v = civ7GreatPersonVictoryTypeEntries0.maxPointsPerUse;
        }
        if((v2 & 8) != 0) {
            v1 = civ7GreatPersonVictoryTypeEntries0.points;
        }
        if((v2 & 16) != 0) {
            s2 = civ7GreatPersonVictoryTypeEntries0.victoryType;
        }
        return civ7GreatPersonVictoryTypeEntries0.copy(s, s1, v, v1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7GreatPersonVictoryTypeEntries)) {
            return false;
        }
        if(!j.a(this.greatPersonIndividualType, ((Civ7GreatPersonVictoryTypeEntries)object0).greatPersonIndividualType)) {
            return false;
        }
        if(!j.a(this.greatPersonVictorySource, ((Civ7GreatPersonVictoryTypeEntries)object0).greatPersonVictorySource)) {
            return false;
        }
        if(this.maxPointsPerUse != ((Civ7GreatPersonVictoryTypeEntries)object0).maxPointsPerUse) {
            return false;
        }
        return this.points == ((Civ7GreatPersonVictoryTypeEntries)object0).points ? j.a(this.victoryType, ((Civ7GreatPersonVictoryTypeEntries)object0).victoryType) : false;
    }

    public final String getGreatPersonIndividualType() {
        return this.greatPersonIndividualType;
    }

    public final String getGreatPersonVictorySource() {
        return this.greatPersonVictorySource;
    }

    public final int getMaxPointsPerUse() {
        return this.maxPointsPerUse;
    }

    public final int getPoints() {
        return this.points;
    }

    public final String getVictoryType() {
        return this.victoryType;
    }

    @Override
    public int hashCode() {
        return this.victoryType.hashCode() + ((f.b(this.greatPersonIndividualType.hashCode() * 0x1F, 0x1F, this.greatPersonVictorySource) + this.maxPointsPerUse) * 0x1F + this.points) * 0x1F;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.greatPersonIndividualType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7GreatPersonVictoryTypeEntries(greatPersonIndividualType=", this.greatPersonIndividualType, ", greatPersonVictorySource=", this.greatPersonVictorySource, ", maxPointsPerUse=");
        f.q(stringBuilder0, this.maxPointsPerUse, ", points=", this.points, ", victoryType=");
        return e.h(stringBuilder0, this.victoryType, ")");
    }
}

