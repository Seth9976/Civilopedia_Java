package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J+\u0010\u0010\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Route_TechMovementChanges;", "", "routeType", "", "techType", "movementChange", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getMovementChange", "()I", "getRouteType", "()Ljava/lang/String;", "getTechType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Route_TechMovementChanges {
    private final int movementChange;
    private final String routeType;
    private final String techType;

    public Civ5Route_TechMovementChanges(String s, String s1, int v) {
        this.routeType = s;
        this.techType = s1;
        this.movementChange = v;
    }

    public final String component1() {
        return this.routeType;
    }

    public final String component2() {
        return this.techType;
    }

    public final int component3() {
        return this.movementChange;
    }

    public final Civ5Route_TechMovementChanges copy(String s, String s1, int v) {
        return new Civ5Route_TechMovementChanges(s, s1, v);
    }

    public static Civ5Route_TechMovementChanges copy$default(Civ5Route_TechMovementChanges civ5Route_TechMovementChanges0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5Route_TechMovementChanges0.routeType;
        }
        if((v1 & 2) != 0) {
            s1 = civ5Route_TechMovementChanges0.techType;
        }
        if((v1 & 4) != 0) {
            v = civ5Route_TechMovementChanges0.movementChange;
        }
        return civ5Route_TechMovementChanges0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Route_TechMovementChanges)) {
            return false;
        }
        if(!j.a(this.routeType, ((Civ5Route_TechMovementChanges)object0).routeType)) {
            return false;
        }
        return j.a(this.techType, ((Civ5Route_TechMovementChanges)object0).techType) ? this.movementChange == ((Civ5Route_TechMovementChanges)object0).movementChange : false;
    }

    public final int getMovementChange() {
        return this.movementChange;
    }

    public final String getRouteType() {
        return this.routeType;
    }

    public final String getTechType() {
        return this.techType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.routeType == null ? 0 : this.routeType.hashCode();
        String s = this.techType;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v) * 0x1F + this.movementChange;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ5Route_TechMovementChanges(routeType=", this.routeType, ", techType=", this.techType, ", movementChange="), this.movementChange, ")");
    }
}

