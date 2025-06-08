package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitDiplomacyAction_Targets;", "", "diplomacyActionType", "", "targetSpace", "unitTag", "civilizationLevelType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCivilizationLevelType", "()Ljava/lang/String;", "getDiplomacyActionType", "getTargetSpace", "getUnitTag", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitDiplomacyAction_Targets {
    private final String civilizationLevelType;
    private final String diplomacyActionType;
    private final String targetSpace;
    private final String unitTag;

    public Civ7UnitDiplomacyAction_Targets(String s, String s1, String s2, String s3) {
        j.f(s, "diplomacyActionType");
        j.f(s1, "targetSpace");
        j.f(s2, "unitTag");
        j.f(s3, "civilizationLevelType");
        super();
        this.diplomacyActionType = s;
        this.targetSpace = s1;
        this.unitTag = s2;
        this.civilizationLevelType = s3;
    }

    public final String component1() {
        return this.diplomacyActionType;
    }

    public final String component2() {
        return this.targetSpace;
    }

    public final String component3() {
        return this.unitTag;
    }

    public final String component4() {
        return this.civilizationLevelType;
    }

    public final Civ7UnitDiplomacyAction_Targets copy(String s, String s1, String s2, String s3) {
        j.f(s, "diplomacyActionType");
        j.f(s1, "targetSpace");
        j.f(s2, "unitTag");
        j.f(s3, "civilizationLevelType");
        return new Civ7UnitDiplomacyAction_Targets(s, s1, s2, s3);
    }

    public static Civ7UnitDiplomacyAction_Targets copy$default(Civ7UnitDiplomacyAction_Targets civ7UnitDiplomacyAction_Targets0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnitDiplomacyAction_Targets0.diplomacyActionType;
        }
        if((v & 2) != 0) {
            s1 = civ7UnitDiplomacyAction_Targets0.targetSpace;
        }
        if((v & 4) != 0) {
            s2 = civ7UnitDiplomacyAction_Targets0.unitTag;
        }
        if((v & 8) != 0) {
            s3 = civ7UnitDiplomacyAction_Targets0.civilizationLevelType;
        }
        return civ7UnitDiplomacyAction_Targets0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitDiplomacyAction_Targets)) {
            return false;
        }
        if(!j.a(this.diplomacyActionType, ((Civ7UnitDiplomacyAction_Targets)object0).diplomacyActionType)) {
            return false;
        }
        if(!j.a(this.targetSpace, ((Civ7UnitDiplomacyAction_Targets)object0).targetSpace)) {
            return false;
        }
        return j.a(this.unitTag, ((Civ7UnitDiplomacyAction_Targets)object0).unitTag) ? j.a(this.civilizationLevelType, ((Civ7UnitDiplomacyAction_Targets)object0).civilizationLevelType) : false;
    }

    public final String getCivilizationLevelType() {
        return this.civilizationLevelType;
    }

    public final String getDiplomacyActionType() {
        return this.diplomacyActionType;
    }

    public final String getTargetSpace() {
        return this.targetSpace;
    }

    public final String getUnitTag() {
        return this.unitTag;
    }

    @Override
    public int hashCode() {
        return this.civilizationLevelType.hashCode() + f.b(f.b(this.diplomacyActionType.hashCode() * 0x1F, 0x1F, this.targetSpace), 0x1F, this.unitTag);
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ7UnitDiplomacyAction_Targets(diplomacyActionType=", this.diplomacyActionType, ", targetSpace=", this.targetSpace, ", unitTag="), this.unitTag, ", civilizationLevelType=", this.civilizationLevelType, ")");
    }
}

