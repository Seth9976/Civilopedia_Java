package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\t\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000BJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001A\u001A\u00020\tHÆ\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001A\u00020\tHÖ\u0001J\t\u0010!\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilopediaPages;", "", "pageID", "", "sectionID", "name", "pageGroupID", "pageLayoutID", "sortIndex", "", "textKeyPrefix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPageGroupID", "getPageID", "getPageLayoutID", "getSectionID", "getSortIndex", "()I", "getTextKeyPrefix", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilopediaPages {
    private final String name;
    private final String pageGroupID;
    private final String pageID;
    private final String pageLayoutID;
    private final String sectionID;
    private final int sortIndex;
    private final String textKeyPrefix;

    public Civ7CivilopediaPages(String s, String s1, String s2, String s3, String s4, int v, String s5) {
        j.f(s, "pageID");
        j.f(s1, "sectionID");
        j.f(s2, "name");
        j.f(s4, "pageLayoutID");
        super();
        this.pageID = s;
        this.sectionID = s1;
        this.name = s2;
        this.pageGroupID = s3;
        this.pageLayoutID = s4;
        this.sortIndex = v;
        this.textKeyPrefix = s5;
    }

    public final String component1() {
        return this.pageID;
    }

    public final String component2() {
        return this.sectionID;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.pageGroupID;
    }

    public final String component5() {
        return this.pageLayoutID;
    }

    public final int component6() {
        return this.sortIndex;
    }

    public final String component7() {
        return this.textKeyPrefix;
    }

    public final Civ7CivilopediaPages copy(String s, String s1, String s2, String s3, String s4, int v, String s5) {
        j.f(s, "pageID");
        j.f(s1, "sectionID");
        j.f(s2, "name");
        j.f(s4, "pageLayoutID");
        return new Civ7CivilopediaPages(s, s1, s2, s3, s4, v, s5);
    }

    public static Civ7CivilopediaPages copy$default(Civ7CivilopediaPages civ7CivilopediaPages0, String s, String s1, String s2, String s3, String s4, int v, String s5, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7CivilopediaPages0.pageID;
        }
        if((v1 & 2) != 0) {
            s1 = civ7CivilopediaPages0.sectionID;
        }
        if((v1 & 4) != 0) {
            s2 = civ7CivilopediaPages0.name;
        }
        if((v1 & 8) != 0) {
            s3 = civ7CivilopediaPages0.pageGroupID;
        }
        if((v1 & 16) != 0) {
            s4 = civ7CivilopediaPages0.pageLayoutID;
        }
        if((v1 & 0x20) != 0) {
            v = civ7CivilopediaPages0.sortIndex;
        }
        if((v1 & 0x40) != 0) {
            s5 = civ7CivilopediaPages0.textKeyPrefix;
        }
        return civ7CivilopediaPages0.copy(s, s1, s2, s3, s4, v, s5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilopediaPages)) {
            return false;
        }
        if(!j.a(this.pageID, ((Civ7CivilopediaPages)object0).pageID)) {
            return false;
        }
        if(!j.a(this.sectionID, ((Civ7CivilopediaPages)object0).sectionID)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7CivilopediaPages)object0).name)) {
            return false;
        }
        if(!j.a(this.pageGroupID, ((Civ7CivilopediaPages)object0).pageGroupID)) {
            return false;
        }
        if(!j.a(this.pageLayoutID, ((Civ7CivilopediaPages)object0).pageLayoutID)) {
            return false;
        }
        return this.sortIndex == ((Civ7CivilopediaPages)object0).sortIndex ? j.a(this.textKeyPrefix, ((Civ7CivilopediaPages)object0).textKeyPrefix) : false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPageGroupID() {
        return this.pageGroupID;
    }

    public final String getPageID() {
        return this.pageID;
    }

    public final String getPageLayoutID() {
        return this.pageLayoutID;
    }

    public final String getSectionID() {
        return this.sectionID;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final String getTextKeyPrefix() {
        return this.textKeyPrefix;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (f.b((f.b(f.b(this.pageID.hashCode() * 0x1F, 0x1F, this.sectionID), 0x1F, this.name) + (this.pageGroupID == null ? 0 : this.pageGroupID.hashCode())) * 0x1F, 0x1F, this.pageLayoutID) + this.sortIndex) * 0x1F;
        String s = this.textKeyPrefix;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7CivilopediaPages(pageID=", this.pageID, ", sectionID=", this.sectionID, ", name=");
        f.t(stringBuilder0, this.name, ", pageGroupID=", this.pageGroupID, ", pageLayoutID=");
        f.s(stringBuilder0, this.pageLayoutID, ", sortIndex=", this.sortIndex, ", textKeyPrefix=");
        return e.h(stringBuilder0, this.textKeyPrefix, ")");
    }
}

