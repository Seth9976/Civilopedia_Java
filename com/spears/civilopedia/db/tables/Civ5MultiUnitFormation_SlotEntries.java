package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000FJJ\u0010\u0017\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5MultiUnitFormation_SlotEntries;", "", "multiUnitFormationType", "", "primaryUnitType", "secondaryUnitType", "multiUnitPositionType", "requiredSlot", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getMultiUnitFormationType", "()Ljava/lang/String;", "getMultiUnitPositionType", "getPrimaryUnitType", "getRequiredSlot", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSecondaryUnitType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/spears/civilopedia/db/tables/Civ5MultiUnitFormation_SlotEntries;", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5MultiUnitFormation_SlotEntries {
    private final String multiUnitFormationType;
    private final String multiUnitPositionType;
    private final String primaryUnitType;
    private final Boolean requiredSlot;
    private final String secondaryUnitType;

    public Civ5MultiUnitFormation_SlotEntries(String s, String s1, String s2, String s3, Boolean boolean0) {
        this.multiUnitFormationType = s;
        this.primaryUnitType = s1;
        this.secondaryUnitType = s2;
        this.multiUnitPositionType = s3;
        this.requiredSlot = boolean0;
    }

    public final String component1() {
        return this.multiUnitFormationType;
    }

    public final String component2() {
        return this.primaryUnitType;
    }

    public final String component3() {
        return this.secondaryUnitType;
    }

    public final String component4() {
        return this.multiUnitPositionType;
    }

    public final Boolean component5() {
        return this.requiredSlot;
    }

    public final Civ5MultiUnitFormation_SlotEntries copy(String s, String s1, String s2, String s3, Boolean boolean0) {
        return new Civ5MultiUnitFormation_SlotEntries(s, s1, s2, s3, boolean0);
    }

    public static Civ5MultiUnitFormation_SlotEntries copy$default(Civ5MultiUnitFormation_SlotEntries civ5MultiUnitFormation_SlotEntries0, String s, String s1, String s2, String s3, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5MultiUnitFormation_SlotEntries0.multiUnitFormationType;
        }
        if((v & 2) != 0) {
            s1 = civ5MultiUnitFormation_SlotEntries0.primaryUnitType;
        }
        if((v & 4) != 0) {
            s2 = civ5MultiUnitFormation_SlotEntries0.secondaryUnitType;
        }
        if((v & 8) != 0) {
            s3 = civ5MultiUnitFormation_SlotEntries0.multiUnitPositionType;
        }
        if((v & 16) != 0) {
            boolean0 = civ5MultiUnitFormation_SlotEntries0.requiredSlot;
        }
        return civ5MultiUnitFormation_SlotEntries0.copy(s, s1, s2, s3, boolean0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5MultiUnitFormation_SlotEntries)) {
            return false;
        }
        if(!j.a(this.multiUnitFormationType, ((Civ5MultiUnitFormation_SlotEntries)object0).multiUnitFormationType)) {
            return false;
        }
        if(!j.a(this.primaryUnitType, ((Civ5MultiUnitFormation_SlotEntries)object0).primaryUnitType)) {
            return false;
        }
        if(!j.a(this.secondaryUnitType, ((Civ5MultiUnitFormation_SlotEntries)object0).secondaryUnitType)) {
            return false;
        }
        return j.a(this.multiUnitPositionType, ((Civ5MultiUnitFormation_SlotEntries)object0).multiUnitPositionType) ? j.a(this.requiredSlot, ((Civ5MultiUnitFormation_SlotEntries)object0).requiredSlot) : false;
    }

    public final String getMultiUnitFormationType() {
        return this.multiUnitFormationType;
    }

    public final String getMultiUnitPositionType() {
        return this.multiUnitPositionType;
    }

    public final String getPrimaryUnitType() {
        return this.primaryUnitType;
    }

    public final Boolean getRequiredSlot() {
        return this.requiredSlot;
    }

    public final String getSecondaryUnitType() {
        return this.secondaryUnitType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.multiUnitFormationType == null ? 0 : this.multiUnitFormationType.hashCode();
        int v2 = this.primaryUnitType == null ? 0 : this.primaryUnitType.hashCode();
        int v3 = this.secondaryUnitType == null ? 0 : this.secondaryUnitType.hashCode();
        int v4 = this.multiUnitPositionType == null ? 0 : this.multiUnitPositionType.hashCode();
        Boolean boolean0 = this.requiredSlot;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5MultiUnitFormation_SlotEntries(multiUnitFormationType=", this.multiUnitFormationType, ", primaryUnitType=", this.primaryUnitType, ", secondaryUnitType=");
        f.t(stringBuilder0, this.secondaryUnitType, ", multiUnitPositionType=", this.multiUnitPositionType, ", requiredSlot=");
        stringBuilder0.append(this.requiredSlot);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

