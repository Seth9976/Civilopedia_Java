package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000FJB\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001E\u001A\u0004\b\u001F\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001A\u0004\b!\u0010\u000FR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001E\u001A\u0004\b\"\u0010\fR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001E\u001A\u0004\b#\u0010\fR\u0017\u0010\b\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001A\u0004\b$\u0010\u000F¨\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Yields;", "Lo2/m;", "", "yieldType", "", "defaultValue", "iconString", "name", "occupiedCityChange", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;D)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()D", "component3", "component4", "component5", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;D)Lcom/spears/civilopedia/db/tables/Civ7Yields;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getYieldType", "D", "getDefaultValue", "getIconString", "getName", "getOccupiedCityChange", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Yields implements m {
    private final double defaultValue;
    private final String iconString;
    private final String name;
    private final double occupiedCityChange;
    private final String yieldType;

    public Civ7Yields(String s, double f, String s1, String s2, double f1) {
        j.f(s, "yieldType");
        j.f(s1, "iconString");
        j.f(s2, "name");
        super();
        this.yieldType = s;
        this.defaultValue = f;
        this.iconString = s1;
        this.name = s2;
        this.occupiedCityChange = f1;
    }

    public final String component1() {
        return this.yieldType;
    }

    public final double component2() {
        return this.defaultValue;
    }

    public final String component3() {
        return this.iconString;
    }

    public final String component4() {
        return this.name;
    }

    public final double component5() {
        return this.occupiedCityChange;
    }

    public final Civ7Yields copy(String s, double f, String s1, String s2, double f1) {
        j.f(s, "yieldType");
        j.f(s1, "iconString");
        j.f(s2, "name");
        return new Civ7Yields(s, f, s1, s2, f1);
    }

    public static Civ7Yields copy$default(Civ7Yields civ7Yields0, String s, double f, String s1, String s2, double f1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Yields0.yieldType;
        }
        if((v & 2) != 0) {
            f = civ7Yields0.defaultValue;
        }
        if((v & 4) != 0) {
            s1 = civ7Yields0.iconString;
        }
        if((v & 8) != 0) {
            s2 = civ7Yields0.name;
        }
        if((v & 16) != 0) {
            f1 = civ7Yields0.occupiedCityChange;
        }
        return civ7Yields0.copy(s, f, s1, s2, f1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Yields)) {
            return false;
        }
        if(!j.a(this.yieldType, ((Civ7Yields)object0).yieldType)) {
            return false;
        }
        if(Double.compare(this.defaultValue, ((Civ7Yields)object0).defaultValue) != 0) {
            return false;
        }
        if(!j.a(this.iconString, ((Civ7Yields)object0).iconString)) {
            return false;
        }
        return j.a(this.name, ((Civ7Yields)object0).name) ? Double.compare(this.occupiedCityChange, ((Civ7Yields)object0).occupiedCityChange) == 0 : false;
    }

    public final double getDefaultValue() {
        return this.defaultValue;
    }

    public final String getIconString() {
        return this.iconString;
    }

    public final String getName() {
        return this.name;
    }

    public final double getOccupiedCityChange() {
        return this.occupiedCityChange;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.defaultValue);
        long v1 = Double.doubleToLongBits(this.occupiedCityChange);
        return f.b(f.b((this.yieldType.hashCode() * 0x1F + ((int)(v ^ v >>> 0x20))) * 0x1F, 0x1F, this.iconString), 0x1F, this.name) + ((int)(v1 ^ v1 >>> 0x20));
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.yieldType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7Yields(yieldType=");
        stringBuilder0.append(this.yieldType);
        stringBuilder0.append(", defaultValue=");
        stringBuilder0.append(this.defaultValue);
        f.t(stringBuilder0, ", iconString=", this.iconString, ", name=", this.name);
        stringBuilder0.append(", occupiedCityChange=");
        stringBuilder0.append(this.occupiedCityChange);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

