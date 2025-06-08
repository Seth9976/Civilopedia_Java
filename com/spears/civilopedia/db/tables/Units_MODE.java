package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ$\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001A\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001A\u0004\b\u0019\u0010\f¨\u0006\u001A"}, d2 = {"Lcom/spears/civilopedia/db/tables/Units_MODE;", "Lo2/m;", "", "unitType", "", "actionCharges", "<init>", "(Ljava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/spears/civilopedia/db/tables/Units_MODE;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUnitType", "I", "getActionCharges", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Units_MODE implements m {
    private final int actionCharges;
    private final String unitType;

    public Units_MODE(String s, int v) {
        j.f(s, "unitType");
        super();
        this.unitType = s;
        this.actionCharges = v;
    }

    public final String component1() {
        return this.unitType;
    }

    public final int component2() {
        return this.actionCharges;
    }

    public final Units_MODE copy(String s, int v) {
        j.f(s, "unitType");
        return new Units_MODE(s, v);
    }

    public static Units_MODE copy$default(Units_MODE units_MODE0, String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = units_MODE0.unitType;
        }
        if((v1 & 2) != 0) {
            v = units_MODE0.actionCharges;
        }
        return units_MODE0.copy(s, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Units_MODE)) {
            return false;
        }
        return j.a(this.unitType, ((Units_MODE)object0).unitType) ? this.actionCharges == ((Units_MODE)object0).actionCharges : false;
    }

    public final int getActionCharges() {
        return this.actionCharges;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    @Override
    public int hashCode() {
        return this.unitType.hashCode() * 0x1F + this.actionCharges;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.unitType;
    }

    @Override
    public String toString() {
        return f.f(this.actionCharges, "Units_MODE(unitType=", this.unitType, ", actionCharges=", ")");
    }
}

