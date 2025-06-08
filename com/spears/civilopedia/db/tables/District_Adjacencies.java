package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/District_Adjacencies;", "", "districtType", "", "yieldChangeId", "(Ljava/lang/String;Ljava/lang/String;)V", "getDistrictType", "()Ljava/lang/String;", "getYieldChangeId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class District_Adjacencies {
    private final String districtType;
    private final String yieldChangeId;

    public District_Adjacencies(String s, String s1) {
        j.f(s, "districtType");
        j.f(s1, "yieldChangeId");
        super();
        this.districtType = s;
        this.yieldChangeId = s1;
    }

    public final String component1() {
        return this.districtType;
    }

    public final String component2() {
        return this.yieldChangeId;
    }

    public final District_Adjacencies copy(String s, String s1) {
        j.f(s, "districtType");
        j.f(s1, "yieldChangeId");
        return new District_Adjacencies(s, s1);
    }

    public static District_Adjacencies copy$default(District_Adjacencies district_Adjacencies0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = district_Adjacencies0.districtType;
        }
        if((v & 2) != 0) {
            s1 = district_Adjacencies0.yieldChangeId;
        }
        return district_Adjacencies0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof District_Adjacencies)) {
            return false;
        }
        return j.a(this.districtType, ((District_Adjacencies)object0).districtType) ? j.a(this.yieldChangeId, ((District_Adjacencies)object0).yieldChangeId) : false;
    }

    public final String getDistrictType() {
        return this.districtType;
    }

    public final String getYieldChangeId() {
        return this.yieldChangeId;
    }

    @Override
    public int hashCode() {
        return this.yieldChangeId.hashCode() + this.districtType.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        return f.k("District_Adjacencies(districtType=", this.districtType, ", yieldChangeId=", this.yieldChangeId, ")");
    }
}

