package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ.\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0012\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001A\u001A\u0004\b\u001B\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001A\u001A\u0004\b\u001C\u0010\r¨\u0006\u001D"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7TribeTagSets;", "Lo2/m;", "", "tribeTagName", "", "initialUnitAmount", "maxUnitAmount", "<init>", "(Ljava/lang/String;II)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Lcom/spears/civilopedia/db/tables/Civ7TribeTagSets;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTribeTagName", "I", "getInitialUnitAmount", "getMaxUnitAmount", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7TribeTagSets implements m {
    private final int initialUnitAmount;
    private final int maxUnitAmount;
    private final String tribeTagName;

    public Civ7TribeTagSets(String s, int v, int v1) {
        j.f(s, "tribeTagName");
        super();
        this.tribeTagName = s;
        this.initialUnitAmount = v;
        this.maxUnitAmount = v1;
    }

    public final String component1() {
        return this.tribeTagName;
    }

    public final int component2() {
        return this.initialUnitAmount;
    }

    public final int component3() {
        return this.maxUnitAmount;
    }

    public final Civ7TribeTagSets copy(String s, int v, int v1) {
        j.f(s, "tribeTagName");
        return new Civ7TribeTagSets(s, v, v1);
    }

    public static Civ7TribeTagSets copy$default(Civ7TribeTagSets civ7TribeTagSets0, String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7TribeTagSets0.tribeTagName;
        }
        if((v2 & 2) != 0) {
            v = civ7TribeTagSets0.initialUnitAmount;
        }
        if((v2 & 4) != 0) {
            v1 = civ7TribeTagSets0.maxUnitAmount;
        }
        return civ7TribeTagSets0.copy(s, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7TribeTagSets)) {
            return false;
        }
        if(!j.a(this.tribeTagName, ((Civ7TribeTagSets)object0).tribeTagName)) {
            return false;
        }
        return this.initialUnitAmount == ((Civ7TribeTagSets)object0).initialUnitAmount ? this.maxUnitAmount == ((Civ7TribeTagSets)object0).maxUnitAmount : false;
    }

    public final int getInitialUnitAmount() {
        return this.initialUnitAmount;
    }

    public final int getMaxUnitAmount() {
        return this.maxUnitAmount;
    }

    public final String getTribeTagName() {
        return this.tribeTagName;
    }

    @Override
    public int hashCode() {
        return (this.tribeTagName.hashCode() * 0x1F + this.initialUnitAmount) * 0x1F + this.maxUnitAmount;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.tribeTagName;
    }

    @Override
    public String toString() {
        return e.g(f.m(this.initialUnitAmount, "Civ7TribeTagSets(tribeTagName=", this.tribeTagName, ", initialUnitAmount=", ", maxUnitAmount="), this.maxUnitAmount, ")");
    }
}

