package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/CivilopediaPageSearchTerms;", "", "sectionId", "", "pageId", "term", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageId", "()Ljava/lang/String;", "getSectionId", "getTerm", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CivilopediaPageSearchTerms {
    private final String pageId;
    private final String sectionId;
    private final String term;

    public CivilopediaPageSearchTerms(String s, String s1, String s2) {
        j.f(s, "sectionId");
        j.f(s1, "pageId");
        j.f(s2, "term");
        super();
        this.sectionId = s;
        this.pageId = s1;
        this.term = s2;
    }

    public final String component1() {
        return this.sectionId;
    }

    public final String component2() {
        return this.pageId;
    }

    public final String component3() {
        return this.term;
    }

    public final CivilopediaPageSearchTerms copy(String s, String s1, String s2) {
        j.f(s, "sectionId");
        j.f(s1, "pageId");
        j.f(s2, "term");
        return new CivilopediaPageSearchTerms(s, s1, s2);
    }

    public static CivilopediaPageSearchTerms copy$default(CivilopediaPageSearchTerms civilopediaPageSearchTerms0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civilopediaPageSearchTerms0.sectionId;
        }
        if((v & 2) != 0) {
            s1 = civilopediaPageSearchTerms0.pageId;
        }
        if((v & 4) != 0) {
            s2 = civilopediaPageSearchTerms0.term;
        }
        return civilopediaPageSearchTerms0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CivilopediaPageSearchTerms)) {
            return false;
        }
        if(!j.a(this.sectionId, ((CivilopediaPageSearchTerms)object0).sectionId)) {
            return false;
        }
        return j.a(this.pageId, ((CivilopediaPageSearchTerms)object0).pageId) ? j.a(this.term, ((CivilopediaPageSearchTerms)object0).term) : false;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getSectionId() {
        return this.sectionId;
    }

    public final String getTerm() {
        return this.term;
    }

    @Override
    public int hashCode() {
        return this.term.hashCode() + f.b(this.sectionId.hashCode() * 0x1F, 0x1F, this.pageId);
    }

    @Override
    public String toString() {
        return e.h(e.j("CivilopediaPageSearchTerms(sectionId=", this.sectionId, ", pageId=", this.pageId, ", term="), this.term, ")");
    }
}

