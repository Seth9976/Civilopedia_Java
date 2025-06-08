package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/District_RequiredFeatures;", "", "districtType", "", "featureType", "(Ljava/lang/String;Ljava/lang/String;)V", "getDistrictType", "()Ljava/lang/String;", "getFeatureType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class District_RequiredFeatures {
    private final String districtType;
    private final String featureType;

    public District_RequiredFeatures(String s, String s1) {
        j.f(s, "districtType");
        j.f(s1, "featureType");
        super();
        this.districtType = s;
        this.featureType = s1;
    }

    public final String component1() {
        return this.districtType;
    }

    public final String component2() {
        return this.featureType;
    }

    public final District_RequiredFeatures copy(String s, String s1) {
        j.f(s, "districtType");
        j.f(s1, "featureType");
        return new District_RequiredFeatures(s, s1);
    }

    public static District_RequiredFeatures copy$default(District_RequiredFeatures district_RequiredFeatures0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = district_RequiredFeatures0.districtType;
        }
        if((v & 2) != 0) {
            s1 = district_RequiredFeatures0.featureType;
        }
        return district_RequiredFeatures0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof District_RequiredFeatures)) {
            return false;
        }
        return j.a(this.districtType, ((District_RequiredFeatures)object0).districtType) ? j.a(this.featureType, ((District_RequiredFeatures)object0).featureType) : false;
    }

    public final String getDistrictType() {
        return this.districtType;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    @Override
    public int hashCode() {
        return this.featureType.hashCode() + this.districtType.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        return f.k("District_RequiredFeatures(districtType=", this.districtType, ", featureType=", this.featureType, ")");
    }
}

