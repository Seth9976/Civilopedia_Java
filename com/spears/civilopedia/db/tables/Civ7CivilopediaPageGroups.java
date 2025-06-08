package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001A\u00020\tHÆ\u0003J;\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001A\u00020\t2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001B\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001C\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u001D"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilopediaPageGroups;", "", "pageGroupID", "", "sectionID", "name", "sortIndex", "", "visibleIfEmpty", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getName", "()Ljava/lang/String;", "getPageGroupID", "getSectionID", "getSortIndex", "()I", "getVisibleIfEmpty", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilopediaPageGroups {
    private final String name;
    private final String pageGroupID;
    private final String sectionID;
    private final int sortIndex;
    private final boolean visibleIfEmpty;

    public Civ7CivilopediaPageGroups(String s, String s1, String s2, int v, boolean z) {
        j.f(s, "pageGroupID");
        j.f(s1, "sectionID");
        j.f(s2, "name");
        super();
        this.pageGroupID = s;
        this.sectionID = s1;
        this.name = s2;
        this.sortIndex = v;
        this.visibleIfEmpty = z;
    }

    public final String component1() {
        return this.pageGroupID;
    }

    public final String component2() {
        return this.sectionID;
    }

    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.sortIndex;
    }

    public final boolean component5() {
        return this.visibleIfEmpty;
    }

    public final Civ7CivilopediaPageGroups copy(String s, String s1, String s2, int v, boolean z) {
        j.f(s, "pageGroupID");
        j.f(s1, "sectionID");
        j.f(s2, "name");
        return new Civ7CivilopediaPageGroups(s, s1, s2, v, z);
    }

    public static Civ7CivilopediaPageGroups copy$default(Civ7CivilopediaPageGroups civ7CivilopediaPageGroups0, String s, String s1, String s2, int v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7CivilopediaPageGroups0.pageGroupID;
        }
        if((v1 & 2) != 0) {
            s1 = civ7CivilopediaPageGroups0.sectionID;
        }
        if((v1 & 4) != 0) {
            s2 = civ7CivilopediaPageGroups0.name;
        }
        if((v1 & 8) != 0) {
            v = civ7CivilopediaPageGroups0.sortIndex;
        }
        if((v1 & 16) != 0) {
            z = civ7CivilopediaPageGroups0.visibleIfEmpty;
        }
        return civ7CivilopediaPageGroups0.copy(s, s1, s2, v, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilopediaPageGroups)) {
            return false;
        }
        if(!j.a(this.pageGroupID, ((Civ7CivilopediaPageGroups)object0).pageGroupID)) {
            return false;
        }
        if(!j.a(this.sectionID, ((Civ7CivilopediaPageGroups)object0).sectionID)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7CivilopediaPageGroups)object0).name)) {
            return false;
        }
        return this.sortIndex == ((Civ7CivilopediaPageGroups)object0).sortIndex ? this.visibleIfEmpty == ((Civ7CivilopediaPageGroups)object0).visibleIfEmpty : false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPageGroupID() {
        return this.pageGroupID;
    }

    public final String getSectionID() {
        return this.sectionID;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final boolean getVisibleIfEmpty() {
        return this.visibleIfEmpty;
    }

    @Override
    public int hashCode() {
        int v = (f.b(f.b(this.pageGroupID.hashCode() * 0x1F, 0x1F, this.sectionID), 0x1F, this.name) + this.sortIndex) * 0x1F;
        return this.visibleIfEmpty ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7CivilopediaPageGroups(pageGroupID=", this.pageGroupID, ", sectionID=", this.sectionID, ", name=");
        f.s(stringBuilder0, this.name, ", sortIndex=", this.sortIndex, ", visibleIfEmpty=");
        return u9.g(stringBuilder0, this.visibleIfEmpty, ")");
    }
}

