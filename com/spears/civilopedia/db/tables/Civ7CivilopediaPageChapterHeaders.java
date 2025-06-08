package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilopediaPageChapterHeaders;", "", "chapterID", "", "pageID", "sectionID", "header", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChapterID", "()Ljava/lang/String;", "getHeader", "getPageID", "getSectionID", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilopediaPageChapterHeaders {
    private final String chapterID;
    private final String header;
    private final String pageID;
    private final String sectionID;

    public Civ7CivilopediaPageChapterHeaders(String s, String s1, String s2, String s3) {
        j.f(s, "chapterID");
        j.f(s1, "pageID");
        j.f(s2, "sectionID");
        j.f(s3, "header");
        super();
        this.chapterID = s;
        this.pageID = s1;
        this.sectionID = s2;
        this.header = s3;
    }

    public final String component1() {
        return this.chapterID;
    }

    public final String component2() {
        return this.pageID;
    }

    public final String component3() {
        return this.sectionID;
    }

    public final String component4() {
        return this.header;
    }

    public final Civ7CivilopediaPageChapterHeaders copy(String s, String s1, String s2, String s3) {
        j.f(s, "chapterID");
        j.f(s1, "pageID");
        j.f(s2, "sectionID");
        j.f(s3, "header");
        return new Civ7CivilopediaPageChapterHeaders(s, s1, s2, s3);
    }

    public static Civ7CivilopediaPageChapterHeaders copy$default(Civ7CivilopediaPageChapterHeaders civ7CivilopediaPageChapterHeaders0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7CivilopediaPageChapterHeaders0.chapterID;
        }
        if((v & 2) != 0) {
            s1 = civ7CivilopediaPageChapterHeaders0.pageID;
        }
        if((v & 4) != 0) {
            s2 = civ7CivilopediaPageChapterHeaders0.sectionID;
        }
        if((v & 8) != 0) {
            s3 = civ7CivilopediaPageChapterHeaders0.header;
        }
        return civ7CivilopediaPageChapterHeaders0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilopediaPageChapterHeaders)) {
            return false;
        }
        if(!j.a(this.chapterID, ((Civ7CivilopediaPageChapterHeaders)object0).chapterID)) {
            return false;
        }
        if(!j.a(this.pageID, ((Civ7CivilopediaPageChapterHeaders)object0).pageID)) {
            return false;
        }
        return j.a(this.sectionID, ((Civ7CivilopediaPageChapterHeaders)object0).sectionID) ? j.a(this.header, ((Civ7CivilopediaPageChapterHeaders)object0).header) : false;
    }

    public final String getChapterID() {
        return this.chapterID;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getPageID() {
        return this.pageID;
    }

    public final String getSectionID() {
        return this.sectionID;
    }

    @Override
    public int hashCode() {
        return this.header.hashCode() + f.b(f.b(this.chapterID.hashCode() * 0x1F, 0x1F, this.pageID), 0x1F, this.sectionID);
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ7CivilopediaPageChapterHeaders(chapterID=", this.chapterID, ", pageID=", this.pageID, ", sectionID="), this.sectionID, ", header=", this.header, ")");
    }
}

