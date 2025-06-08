package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Policy_BuildingClassYieldChanges;", "", "policyType", "", "buildingClassType", "yieldType", "yieldChange", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBuildingClassType", "()Ljava/lang/String;", "getPolicyType", "getYieldChange", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getYieldType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Policy_BuildingClassYieldChanges;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Policy_BuildingClassYieldChanges {
    private final String buildingClassType;
    private final String policyType;
    private final Integer yieldChange;
    private final String yieldType;

    public Civ5Policy_BuildingClassYieldChanges(String s, String s1, String s2, Integer integer0) {
        this.policyType = s;
        this.buildingClassType = s1;
        this.yieldType = s2;
        this.yieldChange = integer0;
    }

    public final String component1() {
        return this.policyType;
    }

    public final String component2() {
        return this.buildingClassType;
    }

    public final String component3() {
        return this.yieldType;
    }

    public final Integer component4() {
        return this.yieldChange;
    }

    public final Civ5Policy_BuildingClassYieldChanges copy(String s, String s1, String s2, Integer integer0) {
        return new Civ5Policy_BuildingClassYieldChanges(s, s1, s2, integer0);
    }

    public static Civ5Policy_BuildingClassYieldChanges copy$default(Civ5Policy_BuildingClassYieldChanges civ5Policy_BuildingClassYieldChanges0, String s, String s1, String s2, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Policy_BuildingClassYieldChanges0.policyType;
        }
        if((v & 2) != 0) {
            s1 = civ5Policy_BuildingClassYieldChanges0.buildingClassType;
        }
        if((v & 4) != 0) {
            s2 = civ5Policy_BuildingClassYieldChanges0.yieldType;
        }
        if((v & 8) != 0) {
            integer0 = civ5Policy_BuildingClassYieldChanges0.yieldChange;
        }
        return civ5Policy_BuildingClassYieldChanges0.copy(s, s1, s2, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Policy_BuildingClassYieldChanges)) {
            return false;
        }
        if(!j.a(this.policyType, ((Civ5Policy_BuildingClassYieldChanges)object0).policyType)) {
            return false;
        }
        if(!j.a(this.buildingClassType, ((Civ5Policy_BuildingClassYieldChanges)object0).buildingClassType)) {
            return false;
        }
        return j.a(this.yieldType, ((Civ5Policy_BuildingClassYieldChanges)object0).yieldType) ? j.a(this.yieldChange, ((Civ5Policy_BuildingClassYieldChanges)object0).yieldChange) : false;
    }

    public final String getBuildingClassType() {
        return this.buildingClassType;
    }

    public final String getPolicyType() {
        return this.policyType;
    }

    public final Integer getYieldChange() {
        return this.yieldChange;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.policyType == null ? 0 : this.policyType.hashCode();
        int v2 = this.buildingClassType == null ? 0 : this.buildingClassType.hashCode();
        int v3 = this.yieldType == null ? 0 : this.yieldType.hashCode();
        Integer integer0 = this.yieldChange;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Policy_BuildingClassYieldChanges(policyType=", this.policyType, ", buildingClassType=", this.buildingClassType, ", yieldType=");
        return u9.d(this.yieldChange, this.yieldType, ", yieldChange=", ")", stringBuilder0);
    }
}

