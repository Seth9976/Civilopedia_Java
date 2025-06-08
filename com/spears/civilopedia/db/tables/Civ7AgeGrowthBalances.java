package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000EJ8\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0014\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000EJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001C\u001A\u0004\b\u001D\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001C\u001A\u0004\b\u001E\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001C\u001A\u0004\b\u001F\u0010\u000E¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeGrowthBalances;", "Lo2/m;", "", "age", "", "exponent", "flat", "scalar", "<init>", "(Ljava/lang/String;III)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/String;III)Lcom/spears/civilopedia/db/tables/Civ7AgeGrowthBalances;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAge", "I", "getExponent", "getFlat", "getScalar", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeGrowthBalances implements m {
    private final String age;
    private final int exponent;
    private final int flat;
    private final int scalar;

    public Civ7AgeGrowthBalances(String s, int v, int v1, int v2) {
        j.f(s, "age");
        super();
        this.age = s;
        this.exponent = v;
        this.flat = v1;
        this.scalar = v2;
    }

    public final String component1() {
        return this.age;
    }

    public final int component2() {
        return this.exponent;
    }

    public final int component3() {
        return this.flat;
    }

    public final int component4() {
        return this.scalar;
    }

    public final Civ7AgeGrowthBalances copy(String s, int v, int v1, int v2) {
        j.f(s, "age");
        return new Civ7AgeGrowthBalances(s, v, v1, v2);
    }

    public static Civ7AgeGrowthBalances copy$default(Civ7AgeGrowthBalances civ7AgeGrowthBalances0, String s, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            s = civ7AgeGrowthBalances0.age;
        }
        if((v3 & 2) != 0) {
            v = civ7AgeGrowthBalances0.exponent;
        }
        if((v3 & 4) != 0) {
            v1 = civ7AgeGrowthBalances0.flat;
        }
        if((v3 & 8) != 0) {
            v2 = civ7AgeGrowthBalances0.scalar;
        }
        return civ7AgeGrowthBalances0.copy(s, v, v1, v2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeGrowthBalances)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7AgeGrowthBalances)object0).age)) {
            return false;
        }
        if(this.exponent != ((Civ7AgeGrowthBalances)object0).exponent) {
            return false;
        }
        return this.flat == ((Civ7AgeGrowthBalances)object0).flat ? this.scalar == ((Civ7AgeGrowthBalances)object0).scalar : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final int getExponent() {
        return this.exponent;
    }

    public final int getFlat() {
        return this.flat;
    }

    public final int getScalar() {
        return this.scalar;
    }

    @Override
    public int hashCode() {
        return ((this.age.hashCode() * 0x1F + this.exponent) * 0x1F + this.flat) * 0x1F + this.scalar;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.age;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.exponent, "Civ7AgeGrowthBalances(age=", this.age, ", exponent=", ", flat=");
        stringBuilder0.append(this.flat);
        stringBuilder0.append(", scalar=");
        stringBuilder0.append(this.scalar);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

