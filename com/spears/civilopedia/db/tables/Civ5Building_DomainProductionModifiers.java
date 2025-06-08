package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Building_DomainProductionModifiers;", "", "buildingType", "", "domainType", "modifier", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBuildingType", "()Ljava/lang/String;", "getDomainType", "getModifier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Building_DomainProductionModifiers;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Building_DomainProductionModifiers {
    private final String buildingType;
    private final String domainType;
    private final Integer modifier;

    public Civ5Building_DomainProductionModifiers(String s, String s1, Integer integer0) {
        this.buildingType = s;
        this.domainType = s1;
        this.modifier = integer0;
    }

    public final String component1() {
        return this.buildingType;
    }

    public final String component2() {
        return this.domainType;
    }

    public final Integer component3() {
        return this.modifier;
    }

    public final Civ5Building_DomainProductionModifiers copy(String s, String s1, Integer integer0) {
        return new Civ5Building_DomainProductionModifiers(s, s1, integer0);
    }

    public static Civ5Building_DomainProductionModifiers copy$default(Civ5Building_DomainProductionModifiers civ5Building_DomainProductionModifiers0, String s, String s1, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Building_DomainProductionModifiers0.buildingType;
        }
        if((v & 2) != 0) {
            s1 = civ5Building_DomainProductionModifiers0.domainType;
        }
        if((v & 4) != 0) {
            integer0 = civ5Building_DomainProductionModifiers0.modifier;
        }
        return civ5Building_DomainProductionModifiers0.copy(s, s1, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Building_DomainProductionModifiers)) {
            return false;
        }
        if(!j.a(this.buildingType, ((Civ5Building_DomainProductionModifiers)object0).buildingType)) {
            return false;
        }
        return j.a(this.domainType, ((Civ5Building_DomainProductionModifiers)object0).domainType) ? j.a(this.modifier, ((Civ5Building_DomainProductionModifiers)object0).modifier) : false;
    }

    public final String getBuildingType() {
        return this.buildingType;
    }

    public final String getDomainType() {
        return this.domainType;
    }

    public final Integer getModifier() {
        return this.modifier;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.buildingType == null ? 0 : this.buildingType.hashCode();
        int v2 = this.domainType == null ? 0 : this.domainType.hashCode();
        Integer integer0 = this.modifier;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return u9.f(e.j("Civ5Building_DomainProductionModifiers(buildingType=", this.buildingType, ", domainType=", this.domainType, ", modifier="), this.modifier, ")");
    }
}

