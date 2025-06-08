package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\b\u0012\u0006\u0010\r\u001A\u00020\b\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0019J\u0010\u0010\u001D\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u0019J\u0012\u0010\u001E\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u0012Jl\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\b2\b\b\u0002\u0010\r\u001A\u00020\b2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\u0012J\u0010\u0010\"\u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010\u001BJ\u001A\u0010%\u001A\u00020\b2\b\u0010$\u001A\u0004\u0018\u00010#H\u00D6\u0003\u00A2\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010\'\u001A\u0004\b(\u0010\u0012R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010\'\u001A\u0004\b)\u0010\u0012R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010\'\u001A\u0004\b*\u0010\u0012R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010+\u001A\u0004\b,\u0010\u0017R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\t\u0010-\u001A\u0004\b.\u0010\u0019R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010/\u001A\u0004\b0\u0010\u001BR\u0017\u0010\f\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\f\u0010-\u001A\u0004\b1\u0010\u0019R\u0017\u0010\r\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\r\u0010-\u001A\u0004\b2\u0010\u0019R\u0019\u0010\u000E\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010\'\u001A\u0004\b3\u0010\u0012\u00A8\u00064"}, d2 = {"Lcom/spears/civilopedia/db/tables/Routes;", "Lo2/m;", "", "routeType", "name", "description", "", "movementCost", "", "supportsBridges", "", "placementValue", "placementRequiresRoutePresent", "placementRequiresOwnedTile", "prereqEra", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZIZZLjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()D", "component5", "()Z", "component6", "()I", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZIZZLjava/lang/String;)Lcom/spears/civilopedia/db/tables/Routes;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRouteType", "getName", "getDescription", "D", "getMovementCost", "Z", "getSupportsBridges", "I", "getPlacementValue", "getPlacementRequiresRoutePresent", "getPlacementRequiresOwnedTile", "getPrereqEra", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Routes implements m {
    private final String description;
    private final double movementCost;
    private final String name;
    private final boolean placementRequiresOwnedTile;
    private final boolean placementRequiresRoutePresent;
    private final int placementValue;
    private final String prereqEra;
    private final String routeType;
    private final boolean supportsBridges;

    public Routes(String s, String s1, String s2, double f, boolean z, int v, boolean z1, boolean z2, String s3) {
        j.f(s, "routeType");
        j.f(s1, "name");
        j.f(s2, "description");
        super();
        this.routeType = s;
        this.name = s1;
        this.description = s2;
        this.movementCost = f;
        this.supportsBridges = z;
        this.placementValue = v;
        this.placementRequiresRoutePresent = z1;
        this.placementRequiresOwnedTile = z2;
        this.prereqEra = s3;
    }

    public final String component1() {
        return this.routeType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final double component4() {
        return this.movementCost;
    }

    public final boolean component5() {
        return this.supportsBridges;
    }

    public final int component6() {
        return this.placementValue;
    }

    public final boolean component7() {
        return this.placementRequiresRoutePresent;
    }

    public final boolean component8() {
        return this.placementRequiresOwnedTile;
    }

    public final String component9() {
        return this.prereqEra;
    }

    public final Routes copy(String s, String s1, String s2, double f, boolean z, int v, boolean z1, boolean z2, String s3) {
        j.f(s, "routeType");
        j.f(s1, "name");
        j.f(s2, "description");
        return new Routes(s, s1, s2, f, z, v, z1, z2, s3);
    }

    public static Routes copy$default(Routes routes0, String s, String s1, String s2, double f, boolean z, int v, boolean z1, boolean z2, String s3, int v1, Object object0) {
        String s4 = (v1 & 1) == 0 ? s : routes0.routeType;
        String s5 = (v1 & 2) == 0 ? s1 : routes0.name;
        String s6 = (v1 & 4) == 0 ? s2 : routes0.description;
        double f1 = (v1 & 8) == 0 ? f : routes0.movementCost;
        boolean z3 = (v1 & 16) == 0 ? z : routes0.supportsBridges;
        int v2 = (v1 & 0x20) == 0 ? v : routes0.placementValue;
        boolean z4 = (v1 & 0x40) == 0 ? z1 : routes0.placementRequiresRoutePresent;
        boolean z5 = (v1 & 0x80) == 0 ? z2 : routes0.placementRequiresOwnedTile;
        return (v1 & 0x100) == 0 ? routes0.copy(s4, s5, s6, f1, z3, v2, z4, z5, s3) : routes0.copy(s4, s5, s6, f1, z3, v2, z4, z5, routes0.prereqEra);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Routes)) {
            return false;
        }
        if(!j.a(this.routeType, ((Routes)object0).routeType)) {
            return false;
        }
        if(!j.a(this.name, ((Routes)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((Routes)object0).description)) {
            return false;
        }
        if(Double.compare(this.movementCost, ((Routes)object0).movementCost) != 0) {
            return false;
        }
        if(this.supportsBridges != ((Routes)object0).supportsBridges) {
            return false;
        }
        if(this.placementValue != ((Routes)object0).placementValue) {
            return false;
        }
        if(this.placementRequiresRoutePresent != ((Routes)object0).placementRequiresRoutePresent) {
            return false;
        }
        return this.placementRequiresOwnedTile == ((Routes)object0).placementRequiresOwnedTile ? j.a(this.prereqEra, ((Routes)object0).prereqEra) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final double getMovementCost() {
        return this.movementCost;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPlacementRequiresOwnedTile() {
        return this.placementRequiresOwnedTile;
    }

    public final boolean getPlacementRequiresRoutePresent() {
        return this.placementRequiresRoutePresent;
    }

    public final int getPlacementValue() {
        return this.placementValue;
    }

    public final String getPrereqEra() {
        return this.prereqEra;
    }

    public final String getRouteType() {
        return this.routeType;
    }

    public final boolean getSupportsBridges() {
        return this.supportsBridges;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.movementCost);
        int v1 = 0x4D5;
        int v2 = (((f.b(f.b(this.routeType.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.description) + ((int)(v ^ v >>> 0x20))) * 0x1F + (this.supportsBridges ? 0x4CF : 0x4D5)) * 0x1F + this.placementValue) * 0x1F;
        int v3 = this.placementRequiresRoutePresent ? 0x4CF : 0x4D5;
        if(this.placementRequiresOwnedTile) {
            v1 = 0x4CF;
        }
        return this.prereqEra == null ? ((v2 + v3) * 0x1F + v1) * 0x1F : ((v2 + v3) * 0x1F + v1) * 0x1F + this.prereqEra.hashCode();
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.routeType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Routes(routeType=", this.routeType, ", name=", this.name, ", description=");
        stringBuilder0.append(this.description);
        stringBuilder0.append(", movementCost=");
        stringBuilder0.append(this.movementCost);
        stringBuilder0.append(", supportsBridges=");
        stringBuilder0.append(this.supportsBridges);
        stringBuilder0.append(", placementValue=");
        stringBuilder0.append(this.placementValue);
        stringBuilder0.append(", placementRequiresRoutePresent=");
        stringBuilder0.append(this.placementRequiresRoutePresent);
        stringBuilder0.append(", placementRequiresOwnedTile=");
        stringBuilder0.append(this.placementRequiresOwnedTile);
        stringBuilder0.append(", prereqEra=");
        stringBuilder0.append(this.prereqEra);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

