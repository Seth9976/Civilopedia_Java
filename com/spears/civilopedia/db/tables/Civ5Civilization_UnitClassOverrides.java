package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Civilization_UnitClassOverrides;", "", "civilizationType", "", "unitClassType", "unitType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCivilizationType", "()Ljava/lang/String;", "getUnitClassType", "getUnitType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Civilization_UnitClassOverrides {
    private final String civilizationType;
    private final String unitClassType;
    private final String unitType;

    public Civ5Civilization_UnitClassOverrides(String s, String s1, String s2) {
        j.f(s1, "unitClassType");
        super();
        this.civilizationType = s;
        this.unitClassType = s1;
        this.unitType = s2;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.unitClassType;
    }

    public final String component3() {
        return this.unitType;
    }

    public final Civ5Civilization_UnitClassOverrides copy(String s, String s1, String s2) {
        j.f(s1, "unitClassType");
        return new Civ5Civilization_UnitClassOverrides(s, s1, s2);
    }

    public static Civ5Civilization_UnitClassOverrides copy$default(Civ5Civilization_UnitClassOverrides civ5Civilization_UnitClassOverrides0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Civilization_UnitClassOverrides0.civilizationType;
        }
        if((v & 2) != 0) {
            s1 = civ5Civilization_UnitClassOverrides0.unitClassType;
        }
        if((v & 4) != 0) {
            s2 = civ5Civilization_UnitClassOverrides0.unitType;
        }
        return civ5Civilization_UnitClassOverrides0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Civilization_UnitClassOverrides)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civ5Civilization_UnitClassOverrides)object0).civilizationType)) {
            return false;
        }
        return j.a(this.unitClassType, ((Civ5Civilization_UnitClassOverrides)object0).unitClassType) ? j.a(this.unitType, ((Civ5Civilization_UnitClassOverrides)object0).unitType) : false;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getUnitClassType() {
        return this.unitClassType;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.civilizationType == null ? 0 : this.civilizationType.hashCode()) * 0x1F, 0x1F, this.unitClassType);
        String s = this.unitType;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ5Civilization_UnitClassOverrides(civilizationType=", this.civilizationType, ", unitClassType=", this.unitClassType, ", unitType="), this.unitType, ")");
    }
}

