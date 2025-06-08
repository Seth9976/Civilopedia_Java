package com.spears.civilopedia.db.tables;

import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ$\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\tJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\u00042\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001A\u0004\b\u001A\u0010\f¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilopediaPageLayouts;", "Lo2/m;", "", "pageLayoutID", "", "useSidebar", "<init>", "(Ljava/lang/String;Z)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/spears/civilopedia/db/tables/Civ7CivilopediaPageLayouts;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageLayoutID", "Z", "getUseSidebar", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilopediaPageLayouts implements m {
    private final String pageLayoutID;
    private final boolean useSidebar;

    public Civ7CivilopediaPageLayouts(String s, boolean z) {
        j.f(s, "pageLayoutID");
        super();
        this.pageLayoutID = s;
        this.useSidebar = z;
    }

    public final String component1() {
        return this.pageLayoutID;
    }

    public final boolean component2() {
        return this.useSidebar;
    }

    public final Civ7CivilopediaPageLayouts copy(String s, boolean z) {
        j.f(s, "pageLayoutID");
        return new Civ7CivilopediaPageLayouts(s, z);
    }

    public static Civ7CivilopediaPageLayouts copy$default(Civ7CivilopediaPageLayouts civ7CivilopediaPageLayouts0, String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7CivilopediaPageLayouts0.pageLayoutID;
        }
        if((v & 2) != 0) {
            z = civ7CivilopediaPageLayouts0.useSidebar;
        }
        return civ7CivilopediaPageLayouts0.copy(s, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilopediaPageLayouts)) {
            return false;
        }
        return j.a(this.pageLayoutID, ((Civ7CivilopediaPageLayouts)object0).pageLayoutID) ? this.useSidebar == ((Civ7CivilopediaPageLayouts)object0).useSidebar : false;
    }

    public final String getPageLayoutID() {
        return this.pageLayoutID;
    }

    public final boolean getUseSidebar() {
        return this.useSidebar;
    }

    @Override
    public int hashCode() {
        int v = this.pageLayoutID.hashCode();
        return this.useSidebar ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.pageLayoutID;
    }

    @Override
    public String toString() {
        return "Civ7CivilopediaPageLayouts(pageLayoutID=" + this.pageLayoutID + ", useSidebar=" + this.useSidebar + ")";
    }
}

