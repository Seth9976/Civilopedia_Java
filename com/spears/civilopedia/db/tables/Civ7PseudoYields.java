package com.spears.civilopedia.db.tables;

import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ$\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\tJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001A\u001A\u0004\b\u001B\u0010\f¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7PseudoYields;", "Lo2/m;", "", "pseudoYieldType", "", "defaultValue", "<init>", "(Ljava/lang/String;D)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()D", "copy", "(Ljava/lang/String;D)Lcom/spears/civilopedia/db/tables/Civ7PseudoYields;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPseudoYieldType", "D", "getDefaultValue", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7PseudoYields implements m {
    private final double defaultValue;
    private final String pseudoYieldType;

    public Civ7PseudoYields(String s, double f) {
        j.f(s, "pseudoYieldType");
        super();
        this.pseudoYieldType = s;
        this.defaultValue = f;
    }

    public final String component1() {
        return this.pseudoYieldType;
    }

    public final double component2() {
        return this.defaultValue;
    }

    public final Civ7PseudoYields copy(String s, double f) {
        j.f(s, "pseudoYieldType");
        return new Civ7PseudoYields(s, f);
    }

    public static Civ7PseudoYields copy$default(Civ7PseudoYields civ7PseudoYields0, String s, double f, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7PseudoYields0.pseudoYieldType;
        }
        if((v & 2) != 0) {
            f = civ7PseudoYields0.defaultValue;
        }
        return civ7PseudoYields0.copy(s, f);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7PseudoYields)) {
            return false;
        }
        return j.a(this.pseudoYieldType, ((Civ7PseudoYields)object0).pseudoYieldType) ? Double.compare(this.defaultValue, ((Civ7PseudoYields)object0).defaultValue) == 0 : false;
    }

    public final double getDefaultValue() {
        return this.defaultValue;
    }

    public final String getPseudoYieldType() {
        return this.pseudoYieldType;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.defaultValue);
        return this.pseudoYieldType.hashCode() * 0x1F + ((int)(v ^ v >>> 0x20));
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.pseudoYieldType;
    }

    @Override
    public String toString() {
        return "Civ7PseudoYields(pseudoYieldType=" + this.pseudoYieldType + ", defaultValue=" + this.defaultValue + ")";
    }
}

