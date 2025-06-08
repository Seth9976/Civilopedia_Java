package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000B\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ:\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u001A\u0010\u0019\u001A\u00020\u00042\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001B\u001A\u0004\b\u001C\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001D\u001A\u0004\b\u001E\u0010\u000FR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001F\u001A\u0004\b \u0010\u0011R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001B\u001A\u0004\b!\u0010\f¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/Routes_XP2;", "Lo2/m;", "", "routeType", "", "buildOnlyWithUnit", "", "buildWithUnitChargeCost", "prereqTech", "<init>", "(Ljava/lang/String;ZILjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "()I", "component4", "copy", "(Ljava/lang/String;ZILjava/lang/String;)Lcom/spears/civilopedia/db/tables/Routes_XP2;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRouteType", "Z", "getBuildOnlyWithUnit", "I", "getBuildWithUnitChargeCost", "getPrereqTech", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Routes_XP2 implements m {
    private final boolean buildOnlyWithUnit;
    private final int buildWithUnitChargeCost;
    private final String prereqTech;
    private final String routeType;

    public Routes_XP2(String s, boolean z, int v, String s1) {
        j.f(s, "routeType");
        super();
        this.routeType = s;
        this.buildOnlyWithUnit = z;
        this.buildWithUnitChargeCost = v;
        this.prereqTech = s1;
    }

    public final String component1() {
        return this.routeType;
    }

    public final boolean component2() {
        return this.buildOnlyWithUnit;
    }

    public final int component3() {
        return this.buildWithUnitChargeCost;
    }

    public final String component4() {
        return this.prereqTech;
    }

    public final Routes_XP2 copy(String s, boolean z, int v, String s1) {
        j.f(s, "routeType");
        return new Routes_XP2(s, z, v, s1);
    }

    public static Routes_XP2 copy$default(Routes_XP2 routes_XP20, String s, boolean z, int v, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = routes_XP20.routeType;
        }
        if((v1 & 2) != 0) {
            z = routes_XP20.buildOnlyWithUnit;
        }
        if((v1 & 4) != 0) {
            v = routes_XP20.buildWithUnitChargeCost;
        }
        if((v1 & 8) != 0) {
            s1 = routes_XP20.prereqTech;
        }
        return routes_XP20.copy(s, z, v, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Routes_XP2)) {
            return false;
        }
        if(!j.a(this.routeType, ((Routes_XP2)object0).routeType)) {
            return false;
        }
        if(this.buildOnlyWithUnit != ((Routes_XP2)object0).buildOnlyWithUnit) {
            return false;
        }
        return this.buildWithUnitChargeCost == ((Routes_XP2)object0).buildWithUnitChargeCost ? j.a(this.prereqTech, ((Routes_XP2)object0).prereqTech) : false;
    }

    public final boolean getBuildOnlyWithUnit() {
        return this.buildOnlyWithUnit;
    }

    public final int getBuildWithUnitChargeCost() {
        return this.buildWithUnitChargeCost;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final String getRouteType() {
        return this.routeType;
    }

    @Override
    public int hashCode() {
        int v = ((this.routeType.hashCode() * 0x1F + (this.buildOnlyWithUnit ? 0x4CF : 0x4D5)) * 0x1F + this.buildWithUnitChargeCost) * 0x1F;
        return this.prereqTech == null ? v : v + this.prereqTech.hashCode();
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.routeType;
    }

    @Override
    public String toString() {
        return u9.e(u9.j("Routes_XP2(routeType=", this.routeType, this.buildOnlyWithUnit, ", buildOnlyWithUnit=", ", buildWithUnitChargeCost="), this.buildWithUnitChargeCost, ", prereqTech=", this.prereqTech, ")");
    }
}

