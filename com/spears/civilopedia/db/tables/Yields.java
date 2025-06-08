package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\fJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\fJ\u0010\u0010\u0010\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JB\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001E\u001A\u0004\b\u001F\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001E\u001A\u0004\b \u0010\fR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001E\u001A\u0004\b!\u0010\fR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001A\u0004\b#\u0010\u0011R\u0017\u0010\b\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001A\u0004\b$\u0010\u0011¨\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/Yields;", "Lo2/m;", "", "yieldType", "name", "iconString", "", "occupiedCityChange", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()D", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)Lcom/spears/civilopedia/db/tables/Yields;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getYieldType", "getName", "getIconString", "D", "getOccupiedCityChange", "getDefaultValue", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Yields implements m {
    private final double defaultValue;
    private final String iconString;
    private final String name;
    private final double occupiedCityChange;
    private final String yieldType;

    public Yields(String s, String s1, String s2, double f, double f1) {
        j.f(s, "yieldType");
        j.f(s1, "name");
        j.f(s2, "iconString");
        super();
        this.yieldType = s;
        this.name = s1;
        this.iconString = s2;
        this.occupiedCityChange = f;
        this.defaultValue = f1;
    }

    public final String component1() {
        return this.yieldType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.iconString;
    }

    public final double component4() {
        return this.occupiedCityChange;
    }

    public final double component5() {
        return this.defaultValue;
    }

    public final Yields copy(String s, String s1, String s2, double f, double f1) {
        j.f(s, "yieldType");
        j.f(s1, "name");
        j.f(s2, "iconString");
        return new Yields(s, s1, s2, f, f1);
    }

    public static Yields copy$default(Yields yields0, String s, String s1, String s2, double f, double f1, int v, Object object0) {
        if((v & 1) != 0) {
            s = yields0.yieldType;
        }
        if((v & 2) != 0) {
            s1 = yields0.name;
        }
        if((v & 4) != 0) {
            s2 = yields0.iconString;
        }
        if((v & 8) != 0) {
            f = yields0.occupiedCityChange;
        }
        if((v & 16) != 0) {
            f1 = yields0.defaultValue;
        }
        return yields0.copy(s, s1, s2, f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Yields)) {
            return false;
        }
        if(!j.a(this.yieldType, ((Yields)object0).yieldType)) {
            return false;
        }
        if(!j.a(this.name, ((Yields)object0).name)) {
            return false;
        }
        if(!j.a(this.iconString, ((Yields)object0).iconString)) {
            return false;
        }
        return Double.compare(this.occupiedCityChange, ((Yields)object0).occupiedCityChange) == 0 ? Double.compare(this.defaultValue, ((Yields)object0).defaultValue) == 0 : false;
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
        long v = Double.doubleToLongBits(this.occupiedCityChange);
        long v1 = Double.doubleToLongBits(this.defaultValue);
        return (f.b(f.b(this.yieldType.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.iconString) + ((int)(v ^ v >>> 0x20))) * 0x1F + ((int)(v1 ^ v1 >>> 0x20));
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.yieldType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Yields(yieldType=", this.yieldType, ", name=", this.name, ", iconString=");
        stringBuilder0.append(this.iconString);
        stringBuilder0.append(", occupiedCityChange=");
        stringBuilder0.append(this.occupiedCityChange);
        stringBuilder0.append(", defaultValue=");
        stringBuilder0.append(this.defaultValue);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

