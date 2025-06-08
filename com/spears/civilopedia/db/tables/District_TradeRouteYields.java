package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0006HÆ\u0003J;\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u001BHÖ\u0001J\t\u0010\u001C\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\b\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/spears/civilopedia/db/tables/District_TradeRouteYields;", "", "districtType", "", "yieldType", "yieldChangeAsOrigin", "", "yieldChangeAsDomesticDestination", "yieldChangeAsInternationalDestination", "(Ljava/lang/String;Ljava/lang/String;DDD)V", "getDistrictType", "()Ljava/lang/String;", "getYieldChangeAsDomesticDestination", "()D", "getYieldChangeAsInternationalDestination", "getYieldChangeAsOrigin", "getYieldType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class District_TradeRouteYields {
    private final String districtType;
    private final double yieldChangeAsDomesticDestination;
    private final double yieldChangeAsInternationalDestination;
    private final double yieldChangeAsOrigin;
    private final String yieldType;

    public District_TradeRouteYields(String s, String s1, double f, double f1, double f2) {
        j.f(s, "districtType");
        j.f(s1, "yieldType");
        super();
        this.districtType = s;
        this.yieldType = s1;
        this.yieldChangeAsOrigin = f;
        this.yieldChangeAsDomesticDestination = f1;
        this.yieldChangeAsInternationalDestination = f2;
    }

    public final String component1() {
        return this.districtType;
    }

    public final String component2() {
        return this.yieldType;
    }

    public final double component3() {
        return this.yieldChangeAsOrigin;
    }

    public final double component4() {
        return this.yieldChangeAsDomesticDestination;
    }

    public final double component5() {
        return this.yieldChangeAsInternationalDestination;
    }

    public final District_TradeRouteYields copy(String s, String s1, double f, double f1, double f2) {
        j.f(s, "districtType");
        j.f(s1, "yieldType");
        return new District_TradeRouteYields(s, s1, f, f1, f2);
    }

    public static District_TradeRouteYields copy$default(District_TradeRouteYields district_TradeRouteYields0, String s, String s1, double f, double f1, double f2, int v, Object object0) {
        String s2 = (v & 1) == 0 ? s : district_TradeRouteYields0.districtType;
        String s3 = (v & 2) == 0 ? s1 : district_TradeRouteYields0.yieldType;
        double f3 = (v & 4) == 0 ? f : district_TradeRouteYields0.yieldChangeAsOrigin;
        double f4 = (v & 8) == 0 ? f1 : district_TradeRouteYields0.yieldChangeAsDomesticDestination;
        return (v & 16) == 0 ? district_TradeRouteYields0.copy(s2, s3, f3, f4, f2) : district_TradeRouteYields0.copy(s2, s3, f3, f4, district_TradeRouteYields0.yieldChangeAsInternationalDestination);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof District_TradeRouteYields)) {
            return false;
        }
        if(!j.a(this.districtType, ((District_TradeRouteYields)object0).districtType)) {
            return false;
        }
        if(!j.a(this.yieldType, ((District_TradeRouteYields)object0).yieldType)) {
            return false;
        }
        if(Double.compare(this.yieldChangeAsOrigin, ((District_TradeRouteYields)object0).yieldChangeAsOrigin) != 0) {
            return false;
        }
        return Double.compare(this.yieldChangeAsDomesticDestination, ((District_TradeRouteYields)object0).yieldChangeAsDomesticDestination) == 0 ? Double.compare(this.yieldChangeAsInternationalDestination, ((District_TradeRouteYields)object0).yieldChangeAsInternationalDestination) == 0 : false;
    }

    public final String getDistrictType() {
        return this.districtType;
    }

    public final double getYieldChangeAsDomesticDestination() {
        return this.yieldChangeAsDomesticDestination;
    }

    public final double getYieldChangeAsInternationalDestination() {
        return this.yieldChangeAsInternationalDestination;
    }

    public final double getYieldChangeAsOrigin() {
        return this.yieldChangeAsOrigin;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.yieldChangeAsOrigin);
        long v1 = Double.doubleToLongBits(this.yieldChangeAsDomesticDestination);
        long v2 = Double.doubleToLongBits(this.yieldChangeAsInternationalDestination);
        return ((f.b(this.districtType.hashCode() * 0x1F, 0x1F, this.yieldType) + ((int)(v ^ v >>> 0x20))) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F + ((int)(v2 ^ v2 >>> 0x20));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("District_TradeRouteYields(districtType=", this.districtType, ", yieldType=", this.yieldType, ", yieldChangeAsOrigin=");
        stringBuilder0.append(this.yieldChangeAsOrigin);
        stringBuilder0.append(", yieldChangeAsDomesticDestination=");
        stringBuilder0.append(this.yieldChangeAsDomesticDestination);
        stringBuilder0.append(", yieldChangeAsInternationalDestination=");
        stringBuilder0.append(this.yieldChangeAsInternationalDestination);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

