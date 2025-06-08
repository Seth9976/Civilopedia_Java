package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\bHÆ\u0003J;\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\bHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilopediaPageChapterParagraphs;", "", "chapterID", "", "pageID", "sectionID", "paragraph", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getChapterID", "()Ljava/lang/String;", "getPageID", "getParagraph", "getSectionID", "getSortIndex", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilopediaPageChapterParagraphs {
    private final String chapterID;
    private final String pageID;
    private final String paragraph;
    private final String sectionID;
    private final int sortIndex;

    public Civ7CivilopediaPageChapterParagraphs(String s, String s1, String s2, String s3, int v) {
        j.f(s, "chapterID");
        j.f(s1, "pageID");
        j.f(s2, "sectionID");
        j.f(s3, "paragraph");
        super();
        this.chapterID = s;
        this.pageID = s1;
        this.sectionID = s2;
        this.paragraph = s3;
        this.sortIndex = v;
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
        return this.paragraph;
    }

    public final int component5() {
        return this.sortIndex;
    }

    public final Civ7CivilopediaPageChapterParagraphs copy(String s, String s1, String s2, String s3, int v) {
        j.f(s, "chapterID");
        j.f(s1, "pageID");
        j.f(s2, "sectionID");
        j.f(s3, "paragraph");
        return new Civ7CivilopediaPageChapterParagraphs(s, s1, s2, s3, v);
    }

    public static Civ7CivilopediaPageChapterParagraphs copy$default(Civ7CivilopediaPageChapterParagraphs civ7CivilopediaPageChapterParagraphs0, String s, String s1, String s2, String s3, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7CivilopediaPageChapterParagraphs0.chapterID;
        }
        if((v1 & 2) != 0) {
            s1 = civ7CivilopediaPageChapterParagraphs0.pageID;
        }
        if((v1 & 4) != 0) {
            s2 = civ7CivilopediaPageChapterParagraphs0.sectionID;
        }
        if((v1 & 8) != 0) {
            s3 = civ7CivilopediaPageChapterParagraphs0.paragraph;
        }
        if((v1 & 16) != 0) {
            v = civ7CivilopediaPageChapterParagraphs0.sortIndex;
        }
        return civ7CivilopediaPageChapterParagraphs0.copy(s, s1, s2, s3, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilopediaPageChapterParagraphs)) {
            return false;
        }
        if(!j.a(this.chapterID, ((Civ7CivilopediaPageChapterParagraphs)object0).chapterID)) {
            return false;
        }
        if(!j.a(this.pageID, ((Civ7CivilopediaPageChapterParagraphs)object0).pageID)) {
            return false;
        }
        if(!j.a(this.sectionID, ((Civ7CivilopediaPageChapterParagraphs)object0).sectionID)) {
            return false;
        }
        return j.a(this.paragraph, ((Civ7CivilopediaPageChapterParagraphs)object0).paragraph) ? this.sortIndex == ((Civ7CivilopediaPageChapterParagraphs)object0).sortIndex : false;
    }

    public final String getChapterID() {
        return this.chapterID;
    }

    public final String getPageID() {
        return this.pageID;
    }

    public final String getParagraph() {
        return this.paragraph;
    }

    public final String getSectionID() {
        return this.sectionID;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        return f.b(f.b(f.b(this.chapterID.hashCode() * 0x1F, 0x1F, this.pageID), 0x1F, this.sectionID), 0x1F, this.paragraph) + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7CivilopediaPageChapterParagraphs(chapterID=", this.chapterID, ", pageID=", this.pageID, ", sectionID=");
        f.t(stringBuilder0, this.sectionID, ", paragraph=", this.paragraph, ", sortIndex=");
        return e.g(stringBuilder0, this.sortIndex, ")");
    }
}

