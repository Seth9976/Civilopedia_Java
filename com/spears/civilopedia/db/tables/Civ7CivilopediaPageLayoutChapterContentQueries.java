package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilopediaPageLayoutChapterContentQueries;", "", "chapterID", "", "pageLayoutID", "SQL", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSQL", "()Ljava/lang/String;", "getChapterID", "getPageLayoutID", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilopediaPageLayoutChapterContentQueries {
    private final String SQL;
    private final String chapterID;
    private final String pageLayoutID;

    public Civ7CivilopediaPageLayoutChapterContentQueries(String s, String s1, String s2) {
        j.f(s, "chapterID");
        j.f(s1, "pageLayoutID");
        j.f(s2, "SQL");
        super();
        this.chapterID = s;
        this.pageLayoutID = s1;
        this.SQL = s2;
    }

    public final String component1() {
        return this.chapterID;
    }

    public final String component2() {
        return this.pageLayoutID;
    }

    public final String component3() {
        return this.SQL;
    }

    public final Civ7CivilopediaPageLayoutChapterContentQueries copy(String s, String s1, String s2) {
        j.f(s, "chapterID");
        j.f(s1, "pageLayoutID");
        j.f(s2, "SQL");
        return new Civ7CivilopediaPageLayoutChapterContentQueries(s, s1, s2);
    }

    public static Civ7CivilopediaPageLayoutChapterContentQueries copy$default(Civ7CivilopediaPageLayoutChapterContentQueries civ7CivilopediaPageLayoutChapterContentQueries0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7CivilopediaPageLayoutChapterContentQueries0.chapterID;
        }
        if((v & 2) != 0) {
            s1 = civ7CivilopediaPageLayoutChapterContentQueries0.pageLayoutID;
        }
        if((v & 4) != 0) {
            s2 = civ7CivilopediaPageLayoutChapterContentQueries0.SQL;
        }
        return civ7CivilopediaPageLayoutChapterContentQueries0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilopediaPageLayoutChapterContentQueries)) {
            return false;
        }
        if(!j.a(this.chapterID, ((Civ7CivilopediaPageLayoutChapterContentQueries)object0).chapterID)) {
            return false;
        }
        return j.a(this.pageLayoutID, ((Civ7CivilopediaPageLayoutChapterContentQueries)object0).pageLayoutID) ? j.a(this.SQL, ((Civ7CivilopediaPageLayoutChapterContentQueries)object0).SQL) : false;
    }

    public final String getChapterID() {
        return this.chapterID;
    }

    public final String getPageLayoutID() {
        return this.pageLayoutID;
    }

    public final String getSQL() {
        return this.SQL;
    }

    @Override
    public int hashCode() {
        return this.SQL.hashCode() + f.b(this.chapterID.hashCode() * 0x1F, 0x1F, this.pageLayoutID);
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7CivilopediaPageLayoutChapterContentQueries(chapterID=", this.chapterID, ", pageLayoutID=", this.pageLayoutID, ", SQL="), this.SQL, ")");
    }
}

