package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001A\u00020\u0006\u0012\u0006\u0010\u000B\u001A\u00020\u0006\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0002\u0010\u000EJ\t\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0006H\u00C6\u0003J\u000B\u0010\u001F\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010 \u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0002\u0010\u0016J\t\u0010!\u001A\u00020\u0006H\u00C6\u0003J\t\u0010\"\u001A\u00020\u0006H\u00C6\u0003J\u000B\u0010#\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010$\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0002\u0010\u0016Jp\u0010%\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001A\u00020\u00062\b\b\u0002\u0010\u000B\u001A\u00020\u00062\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\tH\u00C6\u0001\u00A2\u0006\u0002\u0010&J\u0013\u0010\'\u001A\u00020\u00062\b\u0010(\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010)\u001A\u00020\tH\u00D6\u0001J\t\u0010*\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0010R\u0015\u0010\b\u001A\u0004\u0018\u00010\t\u00A2\u0006\n\n\u0002\u0010\u0017\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000B\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0013R\u0013\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0010R\u0015\u0010\r\u001A\u0004\u0018\u00010\t\u00A2\u0006\n\n\u0002\u0010\u0017\u001A\u0004\b\u001B\u0010\u0016\u00A8\u0006+"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Modifiers;", "", "modifierId", "", "modifierType", "newOnly", "", "ownerRequirementSetId", "ownerStackLimit", "", "permanent", "runOnce", "subjectRequirementSetId", "subjectStackLimit", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/Integer;)V", "getModifierId", "()Ljava/lang/String;", "getModifierType", "getNewOnly", "()Z", "getOwnerRequirementSetId", "getOwnerStackLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPermanent", "getRunOnce", "getSubjectRequirementSetId", "getSubjectStackLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ7Modifiers;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Modifiers {
    private final String modifierId;
    private final String modifierType;
    private final boolean newOnly;
    private final String ownerRequirementSetId;
    private final Integer ownerStackLimit;
    private final boolean permanent;
    private final boolean runOnce;
    private final String subjectRequirementSetId;
    private final Integer subjectStackLimit;

    public Civ7Modifiers(String s, String s1, boolean z, String s2, Integer integer0, boolean z1, boolean z2, String s3, Integer integer1) {
        j.f(s, "modifierId");
        j.f(s1, "modifierType");
        super();
        this.modifierId = s;
        this.modifierType = s1;
        this.newOnly = z;
        this.ownerRequirementSetId = s2;
        this.ownerStackLimit = integer0;
        this.permanent = z1;
        this.runOnce = z2;
        this.subjectRequirementSetId = s3;
        this.subjectStackLimit = integer1;
    }

    public final String component1() {
        return this.modifierId;
    }

    public final String component2() {
        return this.modifierType;
    }

    public final boolean component3() {
        return this.newOnly;
    }

    public final String component4() {
        return this.ownerRequirementSetId;
    }

    public final Integer component5() {
        return this.ownerStackLimit;
    }

    public final boolean component6() {
        return this.permanent;
    }

    public final boolean component7() {
        return this.runOnce;
    }

    public final String component8() {
        return this.subjectRequirementSetId;
    }

    public final Integer component9() {
        return this.subjectStackLimit;
    }

    public final Civ7Modifiers copy(String s, String s1, boolean z, String s2, Integer integer0, boolean z1, boolean z2, String s3, Integer integer1) {
        j.f(s, "modifierId");
        j.f(s1, "modifierType");
        return new Civ7Modifiers(s, s1, z, s2, integer0, z1, z2, s3, integer1);
    }

    public static Civ7Modifiers copy$default(Civ7Modifiers civ7Modifiers0, String s, String s1, boolean z, String s2, Integer integer0, boolean z1, boolean z2, String s3, Integer integer1, int v, Object object0) {
        String s4 = (v & 1) == 0 ? s : civ7Modifiers0.modifierId;
        String s5 = (v & 2) == 0 ? s1 : civ7Modifiers0.modifierType;
        boolean z3 = (v & 4) == 0 ? z : civ7Modifiers0.newOnly;
        String s6 = (v & 8) == 0 ? s2 : civ7Modifiers0.ownerRequirementSetId;
        Integer integer2 = (v & 16) == 0 ? integer0 : civ7Modifiers0.ownerStackLimit;
        boolean z4 = (v & 0x20) == 0 ? z1 : civ7Modifiers0.permanent;
        boolean z5 = (v & 0x40) == 0 ? z2 : civ7Modifiers0.runOnce;
        String s7 = (v & 0x80) == 0 ? s3 : civ7Modifiers0.subjectRequirementSetId;
        return (v & 0x100) == 0 ? civ7Modifiers0.copy(s4, s5, z3, s6, integer2, z4, z5, s7, integer1) : civ7Modifiers0.copy(s4, s5, z3, s6, integer2, z4, z5, s7, civ7Modifiers0.subjectStackLimit);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Modifiers)) {
            return false;
        }
        if(!j.a(this.modifierId, ((Civ7Modifiers)object0).modifierId)) {
            return false;
        }
        if(!j.a(this.modifierType, ((Civ7Modifiers)object0).modifierType)) {
            return false;
        }
        if(this.newOnly != ((Civ7Modifiers)object0).newOnly) {
            return false;
        }
        if(!j.a(this.ownerRequirementSetId, ((Civ7Modifiers)object0).ownerRequirementSetId)) {
            return false;
        }
        if(!j.a(this.ownerStackLimit, ((Civ7Modifiers)object0).ownerStackLimit)) {
            return false;
        }
        if(this.permanent != ((Civ7Modifiers)object0).permanent) {
            return false;
        }
        if(this.runOnce != ((Civ7Modifiers)object0).runOnce) {
            return false;
        }
        return j.a(this.subjectRequirementSetId, ((Civ7Modifiers)object0).subjectRequirementSetId) ? j.a(this.subjectStackLimit, ((Civ7Modifiers)object0).subjectStackLimit) : false;
    }

    public final String getModifierId() {
        return this.modifierId;
    }

    public final String getModifierType() {
        return this.modifierType;
    }

    public final boolean getNewOnly() {
        return this.newOnly;
    }

    public final String getOwnerRequirementSetId() {
        return this.ownerRequirementSetId;
    }

    public final Integer getOwnerStackLimit() {
        return this.ownerStackLimit;
    }

    public final boolean getPermanent() {
        return this.permanent;
    }

    public final boolean getRunOnce() {
        return this.runOnce;
    }

    public final String getSubjectRequirementSetId() {
        return this.subjectRequirementSetId;
    }

    public final Integer getSubjectStackLimit() {
        return this.subjectStackLimit;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.modifierId.hashCode() * 0x1F, 0x1F, this.modifierType);
        int v1 = 0x4D5;
        int v2 = this.newOnly ? 0x4CF : 0x4D5;
        int v3 = 0;
        int v4 = this.ownerRequirementSetId == null ? 0 : this.ownerRequirementSetId.hashCode();
        int v5 = this.ownerStackLimit == null ? 0 : this.ownerStackLimit.hashCode();
        int v6 = this.permanent ? 0x4CF : 0x4D5;
        if(this.runOnce) {
            v1 = 0x4CF;
        }
        int v7 = this.subjectRequirementSetId == null ? 0 : this.subjectRequirementSetId.hashCode();
        Integer integer0 = this.subjectStackLimit;
        if(integer0 != null) {
            v3 = integer0.hashCode();
        }
        return ((((((v + v2) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1) * 0x1F + v7) * 0x1F + v3;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Modifiers(modifierId=", this.modifierId, ", modifierType=", this.modifierType, ", newOnly=");
        u9.z(stringBuilder0, this.newOnly, ", ownerRequirementSetId=", this.ownerRequirementSetId, ", ownerStackLimit=");
        stringBuilder0.append(this.ownerStackLimit);
        stringBuilder0.append(", permanent=");
        stringBuilder0.append(this.permanent);
        stringBuilder0.append(", runOnce=");
        u9.z(stringBuilder0, this.runOnce, ", subjectRequirementSetId=", this.subjectRequirementSetId, ", subjectStackLimit=");
        return u9.f(stringBuilder0, this.subjectStackLimit, ")");
    }
}

