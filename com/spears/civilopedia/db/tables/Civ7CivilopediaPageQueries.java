package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilopediaPageQueries;", "", "sectionID", "", "SQL", "(Ljava/lang/String;Ljava/lang/String;)V", "getSQL", "()Ljava/lang/String;", "getSectionID", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilopediaPageQueries {
    private final String SQL;
    private final String sectionID;

    public Civ7CivilopediaPageQueries(String s, String s1) {
        j.f(s, "sectionID");
        j.f(s1, "SQL");
        super();
        this.sectionID = s;
        this.SQL = s1;
    }

    public final String component1() {
        return this.sectionID;
    }

    public final String component2() {
        return this.SQL;
    }

    public final Civ7CivilopediaPageQueries copy(String s, String s1) {
        j.f(s, "sectionID");
        j.f(s1, "SQL");
        return new Civ7CivilopediaPageQueries(s, s1);
    }

    public static Civ7CivilopediaPageQueries copy$default(Civ7CivilopediaPageQueries civ7CivilopediaPageQueries0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7CivilopediaPageQueries0.sectionID;
        }
        if((v & 2) != 0) {
            s1 = civ7CivilopediaPageQueries0.SQL;
        }
        return civ7CivilopediaPageQueries0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilopediaPageQueries)) {
            return false;
        }
        return j.a(this.sectionID, ((Civ7CivilopediaPageQueries)object0).sectionID) ? j.a(this.SQL, ((Civ7CivilopediaPageQueries)object0).SQL) : false;
    }

    public final String getSQL() {
        return this.SQL;
    }

    public final String getSectionID() {
        return this.sectionID;
    }

    @Override
    public int hashCode() {
        return this.SQL.hashCode() + this.sectionID.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        return f.k("Civ7CivilopediaPageQueries(sectionID=", this.sectionID, ", SQL=", this.SQL, ")");
    }
}

