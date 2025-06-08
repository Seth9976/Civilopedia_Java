package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitDiplomacyAction_ValidUnits;", "", "diplomacyActionType", "", "unitTag", "(Ljava/lang/String;Ljava/lang/String;)V", "getDiplomacyActionType", "()Ljava/lang/String;", "getUnitTag", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitDiplomacyAction_ValidUnits {
    private final String diplomacyActionType;
    private final String unitTag;

    public Civ7UnitDiplomacyAction_ValidUnits(String s, String s1) {
        j.f(s, "diplomacyActionType");
        j.f(s1, "unitTag");
        super();
        this.diplomacyActionType = s;
        this.unitTag = s1;
    }

    public final String component1() {
        return this.diplomacyActionType;
    }

    public final String component2() {
        return this.unitTag;
    }

    public final Civ7UnitDiplomacyAction_ValidUnits copy(String s, String s1) {
        j.f(s, "diplomacyActionType");
        j.f(s1, "unitTag");
        return new Civ7UnitDiplomacyAction_ValidUnits(s, s1);
    }

    public static Civ7UnitDiplomacyAction_ValidUnits copy$default(Civ7UnitDiplomacyAction_ValidUnits civ7UnitDiplomacyAction_ValidUnits0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnitDiplomacyAction_ValidUnits0.diplomacyActionType;
        }
        if((v & 2) != 0) {
            s1 = civ7UnitDiplomacyAction_ValidUnits0.unitTag;
        }
        return civ7UnitDiplomacyAction_ValidUnits0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitDiplomacyAction_ValidUnits)) {
            return false;
        }
        return j.a(this.diplomacyActionType, ((Civ7UnitDiplomacyAction_ValidUnits)object0).diplomacyActionType) ? j.a(this.unitTag, ((Civ7UnitDiplomacyAction_ValidUnits)object0).unitTag) : false;
    }

    public final String getDiplomacyActionType() {
        return this.diplomacyActionType;
    }

    public final String getUnitTag() {
        return this.unitTag;
    }

    @Override
    public int hashCode() {
        return this.unitTag.hashCode() + this.diplomacyActionType.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        return f.k("Civ7UnitDiplomacyAction_ValidUnits(diplomacyActionType=", this.diplomacyActionType, ", unitTag=", this.unitTag, ")");
    }
}

