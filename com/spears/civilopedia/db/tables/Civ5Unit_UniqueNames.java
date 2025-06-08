package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Unit_UniqueNames;", "", "unitType", "", "uniqueName", "greatWorkType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGreatWorkType", "()Ljava/lang/String;", "getUniqueName", "getUnitType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Unit_UniqueNames {
    private final String greatWorkType;
    private final String uniqueName;
    private final String unitType;

    public Civ5Unit_UniqueNames(String s, String s1, String s2) {
        j.f(s1, "uniqueName");
        super();
        this.unitType = s;
        this.uniqueName = s1;
        this.greatWorkType = s2;
    }

    public final String component1() {
        return this.unitType;
    }

    public final String component2() {
        return this.uniqueName;
    }

    public final String component3() {
        return this.greatWorkType;
    }

    public final Civ5Unit_UniqueNames copy(String s, String s1, String s2) {
        j.f(s1, "uniqueName");
        return new Civ5Unit_UniqueNames(s, s1, s2);
    }

    public static Civ5Unit_UniqueNames copy$default(Civ5Unit_UniqueNames civ5Unit_UniqueNames0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Unit_UniqueNames0.unitType;
        }
        if((v & 2) != 0) {
            s1 = civ5Unit_UniqueNames0.uniqueName;
        }
        if((v & 4) != 0) {
            s2 = civ5Unit_UniqueNames0.greatWorkType;
        }
        return civ5Unit_UniqueNames0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Unit_UniqueNames)) {
            return false;
        }
        if(!j.a(this.unitType, ((Civ5Unit_UniqueNames)object0).unitType)) {
            return false;
        }
        return j.a(this.uniqueName, ((Civ5Unit_UniqueNames)object0).uniqueName) ? j.a(this.greatWorkType, ((Civ5Unit_UniqueNames)object0).greatWorkType) : false;
    }

    public final String getGreatWorkType() {
        return this.greatWorkType;
    }

    public final String getUniqueName() {
        return this.uniqueName;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.unitType == null ? 0 : this.unitType.hashCode()) * 0x1F, 0x1F, this.uniqueName);
        String s = this.greatWorkType;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ5Unit_UniqueNames(unitType=", this.unitType, ", uniqueName=", this.uniqueName, ", greatWorkType="), this.greatWorkType, ")");
    }
}

