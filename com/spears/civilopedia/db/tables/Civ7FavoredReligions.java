package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J+\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7FavoredReligions;", "", "civilizationType", "", "leaderType", "religionType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCivilizationType", "()Ljava/lang/String;", "getLeaderType", "getReligionType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7FavoredReligions {
    private final String civilizationType;
    private final String leaderType;
    private final String religionType;

    public Civ7FavoredReligions(String s, String s1, String s2) {
        j.f(s2, "religionType");
        super();
        this.civilizationType = s;
        this.leaderType = s1;
        this.religionType = s2;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.leaderType;
    }

    public final String component3() {
        return this.religionType;
    }

    public final Civ7FavoredReligions copy(String s, String s1, String s2) {
        j.f(s2, "religionType");
        return new Civ7FavoredReligions(s, s1, s2);
    }

    public static Civ7FavoredReligions copy$default(Civ7FavoredReligions civ7FavoredReligions0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7FavoredReligions0.civilizationType;
        }
        if((v & 2) != 0) {
            s1 = civ7FavoredReligions0.leaderType;
        }
        if((v & 4) != 0) {
            s2 = civ7FavoredReligions0.religionType;
        }
        return civ7FavoredReligions0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7FavoredReligions)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civ7FavoredReligions)object0).civilizationType)) {
            return false;
        }
        return j.a(this.leaderType, ((Civ7FavoredReligions)object0).leaderType) ? j.a(this.religionType, ((Civ7FavoredReligions)object0).religionType) : false;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final String getReligionType() {
        return this.religionType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.civilizationType == null ? 0 : this.civilizationType.hashCode();
        String s = this.leaderType;
        if(s != null) {
            v = s.hashCode();
        }
        return this.religionType.hashCode() + (v1 * 0x1F + v) * 0x1F;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7FavoredReligions(civilizationType=", this.civilizationType, ", leaderType=", this.leaderType, ", religionType="), this.religionType, ")");
    }
}

