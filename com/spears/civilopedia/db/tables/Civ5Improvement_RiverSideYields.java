package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000BJ2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Improvement_RiverSideYields;", "", "improvementType", "", "yieldType", "yield", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getImprovementType", "()Ljava/lang/String;", "getYield", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getYieldType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Improvement_RiverSideYields;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Improvement_RiverSideYields {
    private final String improvementType;
    private final Integer yield;
    private final String yieldType;

    public Civ5Improvement_RiverSideYields(String s, String s1, Integer integer0) {
        this.improvementType = s;
        this.yieldType = s1;
        this.yield = integer0;
    }

    public final String component1() {
        return this.improvementType;
    }

    public final String component2() {
        return this.yieldType;
    }

    public final Integer component3() {
        return this.yield;
    }

    public final Civ5Improvement_RiverSideYields copy(String s, String s1, Integer integer0) {
        return new Civ5Improvement_RiverSideYields(s, s1, integer0);
    }

    public static Civ5Improvement_RiverSideYields copy$default(Civ5Improvement_RiverSideYields civ5Improvement_RiverSideYields0, String s, String s1, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Improvement_RiverSideYields0.improvementType;
        }
        if((v & 2) != 0) {
            s1 = civ5Improvement_RiverSideYields0.yieldType;
        }
        if((v & 4) != 0) {
            integer0 = civ5Improvement_RiverSideYields0.yield;
        }
        return civ5Improvement_RiverSideYields0.copy(s, s1, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Improvement_RiverSideYields)) {
            return false;
        }
        if(!j.a(this.improvementType, ((Civ5Improvement_RiverSideYields)object0).improvementType)) {
            return false;
        }
        return j.a(this.yieldType, ((Civ5Improvement_RiverSideYields)object0).yieldType) ? j.a(this.yield, ((Civ5Improvement_RiverSideYields)object0).yield) : false;
    }

    public final String getImprovementType() {
        return this.improvementType;
    }

    public final Integer getYield() {
        return this.yield;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.improvementType == null ? 0 : this.improvementType.hashCode();
        int v2 = this.yieldType == null ? 0 : this.yieldType.hashCode();
        Integer integer0 = this.yield;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return u9.f(e.j("Civ5Improvement_RiverSideYields(improvementType=", this.improvementType, ", yieldType=", this.yieldType, ", yield="), this.yield, ")");
    }
}

