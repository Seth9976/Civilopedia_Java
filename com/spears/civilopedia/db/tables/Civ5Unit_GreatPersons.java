package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Unit_GreatPersons;", "", "unitType", "", "greatPersonType", "(Ljava/lang/String;Ljava/lang/String;)V", "getGreatPersonType", "()Ljava/lang/String;", "getUnitType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Unit_GreatPersons {
    private final String greatPersonType;
    private final String unitType;

    public Civ5Unit_GreatPersons(String s, String s1) {
        this.unitType = s;
        this.greatPersonType = s1;
    }

    public final String component1() {
        return this.unitType;
    }

    public final String component2() {
        return this.greatPersonType;
    }

    public final Civ5Unit_GreatPersons copy(String s, String s1) {
        return new Civ5Unit_GreatPersons(s, s1);
    }

    public static Civ5Unit_GreatPersons copy$default(Civ5Unit_GreatPersons civ5Unit_GreatPersons0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Unit_GreatPersons0.unitType;
        }
        if((v & 2) != 0) {
            s1 = civ5Unit_GreatPersons0.greatPersonType;
        }
        return civ5Unit_GreatPersons0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Unit_GreatPersons)) {
            return false;
        }
        return j.a(this.unitType, ((Civ5Unit_GreatPersons)object0).unitType) ? j.a(this.greatPersonType, ((Civ5Unit_GreatPersons)object0).greatPersonType) : false;
    }

    public final String getGreatPersonType() {
        return this.greatPersonType;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.unitType == null ? 0 : this.unitType.hashCode();
        String s = this.greatPersonType;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return f.k("Civ5Unit_GreatPersons(unitType=", this.unitType, ", greatPersonType=", this.greatPersonType, ")");
    }
}

