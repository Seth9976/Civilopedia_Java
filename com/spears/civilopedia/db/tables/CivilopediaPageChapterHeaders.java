package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/CivilopediaPageChapterHeaders;", "", "sectionId", "", "pageId", "chapterId", "header", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChapterId", "()Ljava/lang/String;", "getHeader", "getPageId", "getSectionId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CivilopediaPageChapterHeaders {
    private final String chapterId;
    private final String header;
    private final String pageId;
    private final String sectionId;

    public CivilopediaPageChapterHeaders(String s, String s1, String s2, String s3) {
        j.f(s, "sectionId");
        j.f(s1, "pageId");
        j.f(s2, "chapterId");
        j.f(s3, "header");
        super();
        this.sectionId = s;
        this.pageId = s1;
        this.chapterId = s2;
        this.header = s3;
    }

    public final String component1() {
        return this.sectionId;
    }

    public final String component2() {
        return this.pageId;
    }

    public final String component3() {
        return this.chapterId;
    }

    public final String component4() {
        return this.header;
    }

    public final CivilopediaPageChapterHeaders copy(String s, String s1, String s2, String s3) {
        j.f(s, "sectionId");
        j.f(s1, "pageId");
        j.f(s2, "chapterId");
        j.f(s3, "header");
        return new CivilopediaPageChapterHeaders(s, s1, s2, s3);
    }

    public static CivilopediaPageChapterHeaders copy$default(CivilopediaPageChapterHeaders civilopediaPageChapterHeaders0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civilopediaPageChapterHeaders0.sectionId;
        }
        if((v & 2) != 0) {
            s1 = civilopediaPageChapterHeaders0.pageId;
        }
        if((v & 4) != 0) {
            s2 = civilopediaPageChapterHeaders0.chapterId;
        }
        if((v & 8) != 0) {
            s3 = civilopediaPageChapterHeaders0.header;
        }
        return civilopediaPageChapterHeaders0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CivilopediaPageChapterHeaders)) {
            return false;
        }
        if(!j.a(this.sectionId, ((CivilopediaPageChapterHeaders)object0).sectionId)) {
            return false;
        }
        if(!j.a(this.pageId, ((CivilopediaPageChapterHeaders)object0).pageId)) {
            return false;
        }
        return j.a(this.chapterId, ((CivilopediaPageChapterHeaders)object0).chapterId) ? j.a(this.header, ((CivilopediaPageChapterHeaders)object0).header) : false;
    }

    public final String getChapterId() {
        return this.chapterId;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getSectionId() {
        return this.sectionId;
    }

    @Override
    public int hashCode() {
        return this.header.hashCode() + f.b(f.b(this.sectionId.hashCode() * 0x1F, 0x1F, this.pageId), 0x1F, this.chapterId);
    }

    @Override
    public String toString() {
        return e.i(e.j("CivilopediaPageChapterHeaders(sectionId=", this.sectionId, ", pageId=", this.pageId, ", chapterId="), this.chapterId, ", header=", this.header, ")");
    }
}

