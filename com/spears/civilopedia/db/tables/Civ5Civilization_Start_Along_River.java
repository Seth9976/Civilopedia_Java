package com.spears.civilopedia.db.tables;

import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000FJ\u0013\u0010\u0010\u001A\u00020\u00052\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Civilization_Start_Along_River;", "", "civilizationType", "", "startAlongRiver", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getCivilizationType", "()Ljava/lang/String;", "getStartAlongRiver", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/spears/civilopedia/db/tables/Civ5Civilization_Start_Along_River;", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Civilization_Start_Along_River {
    private final String civilizationType;
    private final Boolean startAlongRiver;

    public Civ5Civilization_Start_Along_River(String s, Boolean boolean0) {
        this.civilizationType = s;
        this.startAlongRiver = boolean0;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final Boolean component2() {
        return this.startAlongRiver;
    }

    public final Civ5Civilization_Start_Along_River copy(String s, Boolean boolean0) {
        return new Civ5Civilization_Start_Along_River(s, boolean0);
    }

    public static Civ5Civilization_Start_Along_River copy$default(Civ5Civilization_Start_Along_River civ5Civilization_Start_Along_River0, String s, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Civilization_Start_Along_River0.civilizationType;
        }
        if((v & 2) != 0) {
            boolean0 = civ5Civilization_Start_Along_River0.startAlongRiver;
        }
        return civ5Civilization_Start_Along_River0.copy(s, boolean0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Civilization_Start_Along_River)) {
            return false;
        }
        return j.a(this.civilizationType, ((Civ5Civilization_Start_Along_River)object0).civilizationType) ? j.a(this.startAlongRiver, ((Civ5Civilization_Start_Along_River)object0).startAlongRiver) : false;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final Boolean getStartAlongRiver() {
        return this.startAlongRiver;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.civilizationType == null ? 0 : this.civilizationType.hashCode();
        Boolean boolean0 = this.startAlongRiver;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return "Civ5Civilization_Start_Along_River(civilizationType=" + this.civilizationType + ", startAlongRiver=" + this.startAlongRiver + ")";
    }
}

