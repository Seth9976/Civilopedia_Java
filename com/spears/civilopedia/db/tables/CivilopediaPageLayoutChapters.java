package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/CivilopediaPageLayoutChapters;", "", "pageLayoutId", "", "chapterId", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getChapterId", "()Ljava/lang/String;", "getPageLayoutId", "getSortIndex", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CivilopediaPageLayoutChapters {
    private final String chapterId;
    private final String pageLayoutId;
    private final int sortIndex;

    public CivilopediaPageLayoutChapters(String s, String s1, int v) {
        j.f(s, "pageLayoutId");
        j.f(s1, "chapterId");
        super();
        this.pageLayoutId = s;
        this.chapterId = s1;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.pageLayoutId;
    }

    public final String component2() {
        return this.chapterId;
    }

    public final int component3() {
        return this.sortIndex;
    }

    public final CivilopediaPageLayoutChapters copy(String s, String s1, int v) {
        j.f(s, "pageLayoutId");
        j.f(s1, "chapterId");
        return new CivilopediaPageLayoutChapters(s, s1, v);
    }

    public static CivilopediaPageLayoutChapters copy$default(CivilopediaPageLayoutChapters civilopediaPageLayoutChapters0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civilopediaPageLayoutChapters0.pageLayoutId;
        }
        if((v1 & 2) != 0) {
            s1 = civilopediaPageLayoutChapters0.chapterId;
        }
        if((v1 & 4) != 0) {
            v = civilopediaPageLayoutChapters0.sortIndex;
        }
        return civilopediaPageLayoutChapters0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CivilopediaPageLayoutChapters)) {
            return false;
        }
        if(!j.a(this.pageLayoutId, ((CivilopediaPageLayoutChapters)object0).pageLayoutId)) {
            return false;
        }
        return j.a(this.chapterId, ((CivilopediaPageLayoutChapters)object0).chapterId) ? this.sortIndex == ((CivilopediaPageLayoutChapters)object0).sortIndex : false;
    }

    public final String getChapterId() {
        return this.chapterId;
    }

    public final String getPageLayoutId() {
        return this.pageLayoutId;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        return f.b(this.pageLayoutId.hashCode() * 0x1F, 0x1F, this.chapterId) + this.sortIndex;
    }

    @Override
    public String toString() {
        return e.g(e.j("CivilopediaPageLayoutChapters(pageLayoutId=", this.pageLayoutId, ", chapterId=", this.chapterId, ", sortIndex="), this.sortIndex, ")");
    }
}

