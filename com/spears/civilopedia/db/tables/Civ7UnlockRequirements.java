package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnlockRequirements;", "", "requirementSetId", "", "unlockType", "description", "narrativeText", "toolTip", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getNarrativeText", "getRequirementSetId", "getToolTip", "getUnlockType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnlockRequirements {
    private final String description;
    private final String narrativeText;
    private final String requirementSetId;
    private final String toolTip;
    private final String unlockType;

    public Civ7UnlockRequirements(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "requirementSetId");
        j.f(s1, "unlockType");
        super();
        this.requirementSetId = s;
        this.unlockType = s1;
        this.description = s2;
        this.narrativeText = s3;
        this.toolTip = s4;
    }

    public final String component1() {
        return this.requirementSetId;
    }

    public final String component2() {
        return this.unlockType;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.narrativeText;
    }

    public final String component5() {
        return this.toolTip;
    }

    public final Civ7UnlockRequirements copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "requirementSetId");
        j.f(s1, "unlockType");
        return new Civ7UnlockRequirements(s, s1, s2, s3, s4);
    }

    public static Civ7UnlockRequirements copy$default(Civ7UnlockRequirements civ7UnlockRequirements0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnlockRequirements0.requirementSetId;
        }
        if((v & 2) != 0) {
            s1 = civ7UnlockRequirements0.unlockType;
        }
        if((v & 4) != 0) {
            s2 = civ7UnlockRequirements0.description;
        }
        if((v & 8) != 0) {
            s3 = civ7UnlockRequirements0.narrativeText;
        }
        if((v & 16) != 0) {
            s4 = civ7UnlockRequirements0.toolTip;
        }
        return civ7UnlockRequirements0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnlockRequirements)) {
            return false;
        }
        if(!j.a(this.requirementSetId, ((Civ7UnlockRequirements)object0).requirementSetId)) {
            return false;
        }
        if(!j.a(this.unlockType, ((Civ7UnlockRequirements)object0).unlockType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7UnlockRequirements)object0).description)) {
            return false;
        }
        return j.a(this.narrativeText, ((Civ7UnlockRequirements)object0).narrativeText) ? j.a(this.toolTip, ((Civ7UnlockRequirements)object0).toolTip) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getNarrativeText() {
        return this.narrativeText;
    }

    public final String getRequirementSetId() {
        return this.requirementSetId;
    }

    public final String getToolTip() {
        return this.toolTip;
    }

    public final String getUnlockType() {
        return this.unlockType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.requirementSetId.hashCode() * 0x1F, 0x1F, this.unlockType);
        int v1 = 0;
        int v2 = this.description == null ? 0 : this.description.hashCode();
        int v3 = this.narrativeText == null ? 0 : this.narrativeText.hashCode();
        String s = this.toolTip;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7UnlockRequirements(requirementSetId=", this.requirementSetId, ", unlockType=", this.unlockType, ", description=");
        f.t(stringBuilder0, this.description, ", narrativeText=", this.narrativeText, ", toolTip=");
        return e.h(stringBuilder0, this.toolTip, ")");
    }
}

