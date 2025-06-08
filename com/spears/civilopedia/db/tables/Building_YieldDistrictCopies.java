package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Building_YieldDistrictCopies;", "", "buildingType", "", "oldYieldType", "newYieldType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingType", "()Ljava/lang/String;", "getNewYieldType", "getOldYieldType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Building_YieldDistrictCopies {
    private final String buildingType;
    private final String newYieldType;
    private final String oldYieldType;

    public Building_YieldDistrictCopies(String s, String s1, String s2) {
        j.f(s, "buildingType");
        j.f(s1, "oldYieldType");
        j.f(s2, "newYieldType");
        super();
        this.buildingType = s;
        this.oldYieldType = s1;
        this.newYieldType = s2;
    }

    public final String component1() {
        return this.buildingType;
    }

    public final String component2() {
        return this.oldYieldType;
    }

    public final String component3() {
        return this.newYieldType;
    }

    public final Building_YieldDistrictCopies copy(String s, String s1, String s2) {
        j.f(s, "buildingType");
        j.f(s1, "oldYieldType");
        j.f(s2, "newYieldType");
        return new Building_YieldDistrictCopies(s, s1, s2);
    }

    public static Building_YieldDistrictCopies copy$default(Building_YieldDistrictCopies building_YieldDistrictCopies0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = building_YieldDistrictCopies0.buildingType;
        }
        if((v & 2) != 0) {
            s1 = building_YieldDistrictCopies0.oldYieldType;
        }
        if((v & 4) != 0) {
            s2 = building_YieldDistrictCopies0.newYieldType;
        }
        return building_YieldDistrictCopies0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Building_YieldDistrictCopies)) {
            return false;
        }
        if(!j.a(this.buildingType, ((Building_YieldDistrictCopies)object0).buildingType)) {
            return false;
        }
        return j.a(this.oldYieldType, ((Building_YieldDistrictCopies)object0).oldYieldType) ? j.a(this.newYieldType, ((Building_YieldDistrictCopies)object0).newYieldType) : false;
    }

    public final String getBuildingType() {
        return this.buildingType;
    }

    public final String getNewYieldType() {
        return this.newYieldType;
    }

    public final String getOldYieldType() {
        return this.oldYieldType;
    }

    @Override
    public int hashCode() {
        return this.newYieldType.hashCode() + f.b(this.buildingType.hashCode() * 0x1F, 0x1F, this.oldYieldType);
    }

    @Override
    public String toString() {
        return e.h(e.j("Building_YieldDistrictCopies(buildingType=", this.buildingType, ", oldYieldType=", this.oldYieldType, ", newYieldType="), this.newYieldType, ")");
    }
}

