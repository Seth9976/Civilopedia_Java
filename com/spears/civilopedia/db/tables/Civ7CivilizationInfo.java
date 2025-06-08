package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilizationInfo;", "", "civilizationType", "", "header", "caption", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCaption", "()Ljava/lang/String;", "getCivilizationType", "getHeader", "getSortIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilizationInfo {
    private final String caption;
    private final String civilizationType;
    private final String header;
    private final int sortIndex;

    public Civ7CivilizationInfo(String s, String s1, String s2, int v) {
        j.f(s, "civilizationType");
        j.f(s1, "header");
        j.f(s2, "caption");
        super();
        this.civilizationType = s;
        this.header = s1;
        this.caption = s2;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.caption;
    }

    public final int component4() {
        return this.sortIndex;
    }

    public final Civ7CivilizationInfo copy(String s, String s1, String s2, int v) {
        j.f(s, "civilizationType");
        j.f(s1, "header");
        j.f(s2, "caption");
        return new Civ7CivilizationInfo(s, s1, s2, v);
    }

    public static Civ7CivilizationInfo copy$default(Civ7CivilizationInfo civ7CivilizationInfo0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7CivilizationInfo0.civilizationType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7CivilizationInfo0.header;
        }
        if((v1 & 4) != 0) {
            s2 = civ7CivilizationInfo0.caption;
        }
        if((v1 & 8) != 0) {
            v = civ7CivilizationInfo0.sortIndex;
        }
        return civ7CivilizationInfo0.copy(s, s1, s2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilizationInfo)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civ7CivilizationInfo)object0).civilizationType)) {
            return false;
        }
        if(!j.a(this.header, ((Civ7CivilizationInfo)object0).header)) {
            return false;
        }
        return j.a(this.caption, ((Civ7CivilizationInfo)object0).caption) ? this.sortIndex == ((Civ7CivilizationInfo)object0).sortIndex : false;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getHeader() {
        return this.header;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        return f.b(f.b(this.civilizationType.hashCode() * 0x1F, 0x1F, this.header), 0x1F, this.caption) + this.sortIndex;
    }

    @Override
    public String toString() {
        return f.l(e.j("Civ7CivilizationInfo(civilizationType=", this.civilizationType, ", header=", this.header, ", caption="), this.sortIndex, this.caption, ", sortIndex=", ")");
    }
}

