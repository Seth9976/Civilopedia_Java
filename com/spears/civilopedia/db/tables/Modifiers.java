package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0012J\u0012\u0010\u001C\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0012J\u0012\u0010\u001D\u001A\u0004\u0018\u00010\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0012\u0010\u001F\u001A\u0004\u0018\u00010\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001EJ~\u0010 \u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\fH\u00C6\u0001\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010\u0012J\u0010\u0010#\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010\'\u001A\u00020\u00052\b\u0010&\u001A\u0004\u0018\u00010%H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010)\u001A\u0004\b*\u0010\u0012R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010)\u001A\u0004\b+\u0010\u0012R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010,\u001A\u0004\b-\u0010\u0016R\u0017\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010,\u001A\u0004\b.\u0010\u0016R\u0017\u0010\b\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\b\u0010,\u001A\u0004\b/\u0010\u0016R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b\t\u00100\u001A\u0004\b1\u0010\u001AR\u0019\u0010\n\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010)\u001A\u0004\b2\u0010\u0012R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010)\u001A\u0004\b3\u0010\u0012R\u0019\u0010\r\u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\f\n\u0004\b\r\u00104\u001A\u0004\b5\u0010\u001ER\u0019\u0010\u000E\u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\f\n\u0004\b\u000E\u00104\u001A\u0004\b6\u0010\u001E\u00A8\u00067"}, d2 = {"Lcom/spears/civilopedia/db/tables/Modifiers;", "Lo2/m;", "", "modifierId", "modifierType", "", "runOnce", "newOnly", "permanent", "repeatable", "ownerRequirementSetId", "subjectRequirementSetId", "", "ownerStackLimit", "subjectStackLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Modifiers;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModifierId", "getModifierType", "Z", "getRunOnce", "getNewOnly", "getPermanent", "Ljava/lang/Boolean;", "getRepeatable", "getOwnerRequirementSetId", "getSubjectRequirementSetId", "Ljava/lang/Integer;", "getOwnerStackLimit", "getSubjectStackLimit", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Modifiers implements m {
    private final String modifierId;
    private final String modifierType;
    private final boolean newOnly;
    private final String ownerRequirementSetId;
    private final Integer ownerStackLimit;
    private final boolean permanent;
    private final Boolean repeatable;
    private final boolean runOnce;
    private final String subjectRequirementSetId;
    private final Integer subjectStackLimit;

    public Modifiers(String s, String s1, boolean z, boolean z1, boolean z2, Boolean boolean0, String s2, String s3, Integer integer0, Integer integer1) {
        j.f(s, "modifierId");
        j.f(s1, "modifierType");
        super();
        this.modifierId = s;
        this.modifierType = s1;
        this.runOnce = z;
        this.newOnly = z1;
        this.permanent = z2;
        this.repeatable = boolean0;
        this.ownerRequirementSetId = s2;
        this.subjectRequirementSetId = s3;
        this.ownerStackLimit = integer0;
        this.subjectStackLimit = integer1;
    }

    public final String component1() {
        return this.modifierId;
    }

    public final Integer component10() {
        return this.subjectStackLimit;
    }

    public final String component2() {
        return this.modifierType;
    }

    public final boolean component3() {
        return this.runOnce;
    }

    public final boolean component4() {
        return this.newOnly;
    }

    public final boolean component5() {
        return this.permanent;
    }

    public final Boolean component6() {
        return this.repeatable;
    }

    public final String component7() {
        return this.ownerRequirementSetId;
    }

    public final String component8() {
        return this.subjectRequirementSetId;
    }

    public final Integer component9() {
        return this.ownerStackLimit;
    }

    public final Modifiers copy(String s, String s1, boolean z, boolean z1, boolean z2, Boolean boolean0, String s2, String s3, Integer integer0, Integer integer1) {
        j.f(s, "modifierId");
        j.f(s1, "modifierType");
        return new Modifiers(s, s1, z, z1, z2, boolean0, s2, s3, integer0, integer1);
    }

    public static Modifiers copy$default(Modifiers modifiers0, String s, String s1, boolean z, boolean z1, boolean z2, Boolean boolean0, String s2, String s3, Integer integer0, Integer integer1, int v, Object object0) {
        String s4 = (v & 1) == 0 ? s : modifiers0.modifierId;
        String s5 = (v & 2) == 0 ? s1 : modifiers0.modifierType;
        boolean z3 = (v & 4) == 0 ? z : modifiers0.runOnce;
        boolean z4 = (v & 8) == 0 ? z1 : modifiers0.newOnly;
        boolean z5 = (v & 16) == 0 ? z2 : modifiers0.permanent;
        Boolean boolean1 = (v & 0x20) == 0 ? boolean0 : modifiers0.repeatable;
        String s6 = (v & 0x40) == 0 ? s2 : modifiers0.ownerRequirementSetId;
        String s7 = (v & 0x80) == 0 ? s3 : modifiers0.subjectRequirementSetId;
        Integer integer2 = (v & 0x100) == 0 ? integer0 : modifiers0.ownerStackLimit;
        return (v & 0x200) == 0 ? modifiers0.copy(s4, s5, z3, z4, z5, boolean1, s6, s7, integer2, integer1) : modifiers0.copy(s4, s5, z3, z4, z5, boolean1, s6, s7, integer2, modifiers0.subjectStackLimit);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Modifiers)) {
            return false;
        }
        if(!j.a(this.modifierId, ((Modifiers)object0).modifierId)) {
            return false;
        }
        if(!j.a(this.modifierType, ((Modifiers)object0).modifierType)) {
            return false;
        }
        if(this.runOnce != ((Modifiers)object0).runOnce) {
            return false;
        }
        if(this.newOnly != ((Modifiers)object0).newOnly) {
            return false;
        }
        if(this.permanent != ((Modifiers)object0).permanent) {
            return false;
        }
        if(!j.a(this.repeatable, ((Modifiers)object0).repeatable)) {
            return false;
        }
        if(!j.a(this.ownerRequirementSetId, ((Modifiers)object0).ownerRequirementSetId)) {
            return false;
        }
        if(!j.a(this.subjectRequirementSetId, ((Modifiers)object0).subjectRequirementSetId)) {
            return false;
        }
        return j.a(this.ownerStackLimit, ((Modifiers)object0).ownerStackLimit) ? j.a(this.subjectStackLimit, ((Modifiers)object0).subjectStackLimit) : false;
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

    public final Boolean getRepeatable() {
        return this.repeatable;
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
        int v2 = this.runOnce ? 0x4CF : 0x4D5;
        int v3 = this.newOnly ? 0x4CF : 0x4D5;
        if(this.permanent) {
            v1 = 0x4CF;
        }
        int v4 = 0;
        int v5 = this.repeatable == null ? 0 : this.repeatable.hashCode();
        int v6 = this.ownerRequirementSetId == null ? 0 : this.ownerRequirementSetId.hashCode();
        int v7 = this.subjectRequirementSetId == null ? 0 : this.subjectRequirementSetId.hashCode();
        int v8 = this.ownerStackLimit == null ? 0 : this.ownerStackLimit.hashCode();
        Integer integer0 = this.subjectStackLimit;
        if(integer0 != null) {
            v4 = integer0.hashCode();
        }
        return (((((((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v4;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.modifierId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Modifiers(modifierId=", this.modifierId, ", modifierType=", this.modifierType, ", runOnce=");
        u9.A(stringBuilder0, this.runOnce, ", newOnly=", this.newOnly, ", permanent=");
        stringBuilder0.append(this.permanent);
        stringBuilder0.append(", repeatable=");
        stringBuilder0.append(this.repeatable);
        stringBuilder0.append(", ownerRequirementSetId=");
        f.t(stringBuilder0, this.ownerRequirementSetId, ", subjectRequirementSetId=", this.subjectRequirementSetId, ", ownerStackLimit=");
        stringBuilder0.append(this.ownerStackLimit);
        stringBuilder0.append(", subjectStackLimit=");
        stringBuilder0.append(this.subjectStackLimit);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

