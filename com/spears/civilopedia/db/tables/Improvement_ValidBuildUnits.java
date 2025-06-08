package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0006HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00062\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Improvement_ValidBuildUnits;", "", "improvementType", "", "unitType", "consumesCharge", "", "validRepairOnly", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getConsumesCharge", "()Z", "getImprovementType", "()Ljava/lang/String;", "getUnitType", "getValidRepairOnly", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Improvement_ValidBuildUnits {
    private final boolean consumesCharge;
    private final String improvementType;
    private final String unitType;
    private final boolean validRepairOnly;

    public Improvement_ValidBuildUnits(String s, String s1, boolean z, boolean z1) {
        j.f(s, "improvementType");
        j.f(s1, "unitType");
        super();
        this.improvementType = s;
        this.unitType = s1;
        this.consumesCharge = z;
        this.validRepairOnly = z1;
    }

    public final String component1() {
        return this.improvementType;
    }

    public final String component2() {
        return this.unitType;
    }

    public final boolean component3() {
        return this.consumesCharge;
    }

    public final boolean component4() {
        return this.validRepairOnly;
    }

    public final Improvement_ValidBuildUnits copy(String s, String s1, boolean z, boolean z1) {
        j.f(s, "improvementType");
        j.f(s1, "unitType");
        return new Improvement_ValidBuildUnits(s, s1, z, z1);
    }

    public static Improvement_ValidBuildUnits copy$default(Improvement_ValidBuildUnits improvement_ValidBuildUnits0, String s, String s1, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            s = improvement_ValidBuildUnits0.improvementType;
        }
        if((v & 2) != 0) {
            s1 = improvement_ValidBuildUnits0.unitType;
        }
        if((v & 4) != 0) {
            z = improvement_ValidBuildUnits0.consumesCharge;
        }
        if((v & 8) != 0) {
            z1 = improvement_ValidBuildUnits0.validRepairOnly;
        }
        return improvement_ValidBuildUnits0.copy(s, s1, z, z1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Improvement_ValidBuildUnits)) {
            return false;
        }
        if(!j.a(this.improvementType, ((Improvement_ValidBuildUnits)object0).improvementType)) {
            return false;
        }
        if(!j.a(this.unitType, ((Improvement_ValidBuildUnits)object0).unitType)) {
            return false;
        }
        return this.consumesCharge == ((Improvement_ValidBuildUnits)object0).consumesCharge ? this.validRepairOnly == ((Improvement_ValidBuildUnits)object0).validRepairOnly : false;
    }

    public final boolean getConsumesCharge() {
        return this.consumesCharge;
    }

    public final String getImprovementType() {
        return this.improvementType;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    public final boolean getValidRepairOnly() {
        return this.validRepairOnly;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.improvementType.hashCode() * 0x1F, 0x1F, this.unitType);
        int v1 = 0x4D5;
        int v2 = this.consumesCharge ? 0x4CF : 0x4D5;
        if(this.validRepairOnly) {
            v1 = 0x4CF;
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Improvement_ValidBuildUnits(improvementType=", this.improvementType, ", unitType=", this.unitType, ", consumesCharge=");
        stringBuilder0.append(this.consumesCharge);
        stringBuilder0.append(", validRepairOnly=");
        stringBuilder0.append(this.validRepairOnly);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

