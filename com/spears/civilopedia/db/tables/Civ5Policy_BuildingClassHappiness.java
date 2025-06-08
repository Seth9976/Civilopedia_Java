package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000BJ2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Policy_BuildingClassHappiness;", "", "policyType", "", "buildingClassType", "happiness", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBuildingClassType", "()Ljava/lang/String;", "getHappiness", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPolicyType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Policy_BuildingClassHappiness;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Policy_BuildingClassHappiness {
    private final String buildingClassType;
    private final Integer happiness;
    private final String policyType;

    public Civ5Policy_BuildingClassHappiness(String s, String s1, Integer integer0) {
        this.policyType = s;
        this.buildingClassType = s1;
        this.happiness = integer0;
    }

    public final String component1() {
        return this.policyType;
    }

    public final String component2() {
        return this.buildingClassType;
    }

    public final Integer component3() {
        return this.happiness;
    }

    public final Civ5Policy_BuildingClassHappiness copy(String s, String s1, Integer integer0) {
        return new Civ5Policy_BuildingClassHappiness(s, s1, integer0);
    }

    public static Civ5Policy_BuildingClassHappiness copy$default(Civ5Policy_BuildingClassHappiness civ5Policy_BuildingClassHappiness0, String s, String s1, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Policy_BuildingClassHappiness0.policyType;
        }
        if((v & 2) != 0) {
            s1 = civ5Policy_BuildingClassHappiness0.buildingClassType;
        }
        if((v & 4) != 0) {
            integer0 = civ5Policy_BuildingClassHappiness0.happiness;
        }
        return civ5Policy_BuildingClassHappiness0.copy(s, s1, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Policy_BuildingClassHappiness)) {
            return false;
        }
        if(!j.a(this.policyType, ((Civ5Policy_BuildingClassHappiness)object0).policyType)) {
            return false;
        }
        return j.a(this.buildingClassType, ((Civ5Policy_BuildingClassHappiness)object0).buildingClassType) ? j.a(this.happiness, ((Civ5Policy_BuildingClassHappiness)object0).happiness) : false;
    }

    public final String getBuildingClassType() {
        return this.buildingClassType;
    }

    public final Integer getHappiness() {
        return this.happiness;
    }

    public final String getPolicyType() {
        return this.policyType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.policyType == null ? 0 : this.policyType.hashCode();
        int v2 = this.buildingClassType == null ? 0 : this.buildingClassType.hashCode();
        Integer integer0 = this.happiness;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return u9.f(e.j("Civ5Policy_BuildingClassHappiness(policyType=", this.policyType, ", buildingClassType=", this.buildingClassType, ", happiness="), this.happiness, ")");
    }
}

