package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Route_ResourceCosts;", "", "routeType", "", "resourceType", "buildWithUnitCost", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getBuildWithUnitCost", "()I", "getResourceType", "()Ljava/lang/String;", "getRouteType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Route_ResourceCosts {
    private final int buildWithUnitCost;
    private final String resourceType;
    private final String routeType;

    public Route_ResourceCosts(String s, String s1, int v) {
        j.f(s, "routeType");
        j.f(s1, "resourceType");
        super();
        this.routeType = s;
        this.resourceType = s1;
        this.buildWithUnitCost = v;
    }

    public final String component1() {
        return this.routeType;
    }

    public final String component2() {
        return this.resourceType;
    }

    public final int component3() {
        return this.buildWithUnitCost;
    }

    public final Route_ResourceCosts copy(String s, String s1, int v) {
        j.f(s, "routeType");
        j.f(s1, "resourceType");
        return new Route_ResourceCosts(s, s1, v);
    }

    public static Route_ResourceCosts copy$default(Route_ResourceCosts route_ResourceCosts0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = route_ResourceCosts0.routeType;
        }
        if((v1 & 2) != 0) {
            s1 = route_ResourceCosts0.resourceType;
        }
        if((v1 & 4) != 0) {
            v = route_ResourceCosts0.buildWithUnitCost;
        }
        return route_ResourceCosts0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Route_ResourceCosts)) {
            return false;
        }
        if(!j.a(this.routeType, ((Route_ResourceCosts)object0).routeType)) {
            return false;
        }
        return j.a(this.resourceType, ((Route_ResourceCosts)object0).resourceType) ? this.buildWithUnitCost == ((Route_ResourceCosts)object0).buildWithUnitCost : false;
    }

    public final int getBuildWithUnitCost() {
        return this.buildWithUnitCost;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final String getRouteType() {
        return this.routeType;
    }

    @Override
    public int hashCode() {
        return f.b(this.routeType.hashCode() * 0x1F, 0x1F, this.resourceType) + this.buildWithUnitCost;
    }

    @Override
    public String toString() {
        return e.g(e.j("Route_ResourceCosts(routeType=", this.routeType, ", resourceType=", this.resourceType, ", buildWithUnitCost="), this.buildWithUnitCost, ")");
    }
}

