package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ$\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001A\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001A\u0004\b\u0019\u0010\f¨\u0006\u001A"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7BoostNames;", "Lo2/m;", "", "boostType", "", "boostValue", "<init>", "(Ljava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/spears/civilopedia/db/tables/Civ7BoostNames;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBoostType", "I", "getBoostValue", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7BoostNames implements m {
    private final String boostType;
    private final int boostValue;

    public Civ7BoostNames(String s, int v) {
        j.f(s, "boostType");
        super();
        this.boostType = s;
        this.boostValue = v;
    }

    public final String component1() {
        return this.boostType;
    }

    public final int component2() {
        return this.boostValue;
    }

    public final Civ7BoostNames copy(String s, int v) {
        j.f(s, "boostType");
        return new Civ7BoostNames(s, v);
    }

    public static Civ7BoostNames copy$default(Civ7BoostNames civ7BoostNames0, String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7BoostNames0.boostType;
        }
        if((v1 & 2) != 0) {
            v = civ7BoostNames0.boostValue;
        }
        return civ7BoostNames0.copy(s, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7BoostNames)) {
            return false;
        }
        return j.a(this.boostType, ((Civ7BoostNames)object0).boostType) ? this.boostValue == ((Civ7BoostNames)object0).boostValue : false;
    }

    public final String getBoostType() {
        return this.boostType;
    }

    public final int getBoostValue() {
        return this.boostValue;
    }

    @Override
    public int hashCode() {
        return this.boostType.hashCode() * 0x1F + this.boostValue;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.boostType;
    }

    @Override
    public String toString() {
        return f.f(this.boostValue, "Civ7BoostNames(boostType=", this.boostType, ", boostValue=", ")");
    }
}

