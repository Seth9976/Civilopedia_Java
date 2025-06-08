package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J5\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilopediaPageSidebarPanels;", "", "component", "", "pageID", "sectionID", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getComponent", "()Ljava/lang/String;", "getPageID", "getSectionID", "getSortIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilopediaPageSidebarPanels {
    private final String component;
    private final String pageID;
    private final String sectionID;
    private final int sortIndex;

    public Civ7CivilopediaPageSidebarPanels(String s, String s1, String s2, int v) {
        j.f(s, "component");
        super();
        this.component = s;
        this.pageID = s1;
        this.sectionID = s2;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.component;
    }

    public final String component2() {
        return this.pageID;
    }

    public final String component3() {
        return this.sectionID;
    }

    public final int component4() {
        return this.sortIndex;
    }

    public final Civ7CivilopediaPageSidebarPanels copy(String s, String s1, String s2, int v) {
        j.f(s, "component");
        return new Civ7CivilopediaPageSidebarPanels(s, s1, s2, v);
    }

    public static Civ7CivilopediaPageSidebarPanels copy$default(Civ7CivilopediaPageSidebarPanels civ7CivilopediaPageSidebarPanels0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7CivilopediaPageSidebarPanels0.component;
        }
        if((v1 & 2) != 0) {
            s1 = civ7CivilopediaPageSidebarPanels0.pageID;
        }
        if((v1 & 4) != 0) {
            s2 = civ7CivilopediaPageSidebarPanels0.sectionID;
        }
        if((v1 & 8) != 0) {
            v = civ7CivilopediaPageSidebarPanels0.sortIndex;
        }
        return civ7CivilopediaPageSidebarPanels0.copy(s, s1, s2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilopediaPageSidebarPanels)) {
            return false;
        }
        if(!j.a(this.component, ((Civ7CivilopediaPageSidebarPanels)object0).component)) {
            return false;
        }
        if(!j.a(this.pageID, ((Civ7CivilopediaPageSidebarPanels)object0).pageID)) {
            return false;
        }
        return j.a(this.sectionID, ((Civ7CivilopediaPageSidebarPanels)object0).sectionID) ? this.sortIndex == ((Civ7CivilopediaPageSidebarPanels)object0).sortIndex : false;
    }

    public final String getComponent() {
        return this.component;
    }

    public final String getPageID() {
        return this.pageID;
    }

    public final String getSectionID() {
        return this.sectionID;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = this.component.hashCode();
        int v1 = 0;
        int v2 = this.pageID == null ? 0 : this.pageID.hashCode();
        String s = this.sectionID;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v1) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        return f.l(e.j("Civ7CivilopediaPageSidebarPanels(component=", this.component, ", pageID=", this.pageID, ", sectionID="), this.sortIndex, this.sectionID, ", sortIndex=", ")");
    }
}

