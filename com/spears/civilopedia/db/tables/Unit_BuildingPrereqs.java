package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Unit_BuildingPrereqs;", "", "unit", "", "prereqBuilding", "numSupported", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getNumSupported", "()I", "getPrereqBuilding", "()Ljava/lang/String;", "getUnit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Unit_BuildingPrereqs {
    private final int numSupported;
    private final String prereqBuilding;
    private final String unit;

    public Unit_BuildingPrereqs(String s, String s1, int v) {
        j.f(s, "unit");
        j.f(s1, "prereqBuilding");
        super();
        this.unit = s;
        this.prereqBuilding = s1;
        this.numSupported = v;
    }

    public final String component1() {
        return this.unit;
    }

    public final String component2() {
        return this.prereqBuilding;
    }

    public final int component3() {
        return this.numSupported;
    }

    public final Unit_BuildingPrereqs copy(String s, String s1, int v) {
        j.f(s, "unit");
        j.f(s1, "prereqBuilding");
        return new Unit_BuildingPrereqs(s, s1, v);
    }

    public static Unit_BuildingPrereqs copy$default(Unit_BuildingPrereqs unit_BuildingPrereqs0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = unit_BuildingPrereqs0.unit;
        }
        if((v1 & 2) != 0) {
            s1 = unit_BuildingPrereqs0.prereqBuilding;
        }
        if((v1 & 4) != 0) {
            v = unit_BuildingPrereqs0.numSupported;
        }
        return unit_BuildingPrereqs0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Unit_BuildingPrereqs)) {
            return false;
        }
        if(!j.a(this.unit, ((Unit_BuildingPrereqs)object0).unit)) {
            return false;
        }
        return j.a(this.prereqBuilding, ((Unit_BuildingPrereqs)object0).prereqBuilding) ? this.numSupported == ((Unit_BuildingPrereqs)object0).numSupported : false;
    }

    public final int getNumSupported() {
        return this.numSupported;
    }

    public final String getPrereqBuilding() {
        return this.prereqBuilding;
    }

    public final String getUnit() {
        return this.unit;
    }

    @Override
    public int hashCode() {
        return f.b(this.unit.hashCode() * 0x1F, 0x1F, this.prereqBuilding) + this.numSupported;
    }

    @Override
    public String toString() {
        return e.g(e.j("Unit_BuildingPrereqs(unit=", this.unit, ", prereqBuilding=", this.prereqBuilding, ", numSupported="), this.numSupported, ")");
    }
}

