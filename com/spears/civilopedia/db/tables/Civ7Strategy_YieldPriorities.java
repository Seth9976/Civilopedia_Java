package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J7\u0010\u0013\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Strategy_YieldPriorities;", "", "pseudoYieldType", "", "strategyType", "yieldType", "percentageDelta", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getPercentageDelta", "()I", "getPseudoYieldType", "()Ljava/lang/String;", "getStrategyType", "getYieldType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Strategy_YieldPriorities {
    private final int percentageDelta;
    private final String pseudoYieldType;
    private final String strategyType;
    private final String yieldType;

    public Civ7Strategy_YieldPriorities(String s, String s1, String s2, int v) {
        this.pseudoYieldType = s;
        this.strategyType = s1;
        this.yieldType = s2;
        this.percentageDelta = v;
    }

    public final String component1() {
        return this.pseudoYieldType;
    }

    public final String component2() {
        return this.strategyType;
    }

    public final String component3() {
        return this.yieldType;
    }

    public final int component4() {
        return this.percentageDelta;
    }

    public final Civ7Strategy_YieldPriorities copy(String s, String s1, String s2, int v) {
        return new Civ7Strategy_YieldPriorities(s, s1, s2, v);
    }

    public static Civ7Strategy_YieldPriorities copy$default(Civ7Strategy_YieldPriorities civ7Strategy_YieldPriorities0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7Strategy_YieldPriorities0.pseudoYieldType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7Strategy_YieldPriorities0.strategyType;
        }
        if((v1 & 4) != 0) {
            s2 = civ7Strategy_YieldPriorities0.yieldType;
        }
        if((v1 & 8) != 0) {
            v = civ7Strategy_YieldPriorities0.percentageDelta;
        }
        return civ7Strategy_YieldPriorities0.copy(s, s1, s2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Strategy_YieldPriorities)) {
            return false;
        }
        if(!j.a(this.pseudoYieldType, ((Civ7Strategy_YieldPriorities)object0).pseudoYieldType)) {
            return false;
        }
        if(!j.a(this.strategyType, ((Civ7Strategy_YieldPriorities)object0).strategyType)) {
            return false;
        }
        return j.a(this.yieldType, ((Civ7Strategy_YieldPriorities)object0).yieldType) ? this.percentageDelta == ((Civ7Strategy_YieldPriorities)object0).percentageDelta : false;
    }

    public final int getPercentageDelta() {
        return this.percentageDelta;
    }

    public final String getPseudoYieldType() {
        return this.pseudoYieldType;
    }

    public final String getStrategyType() {
        return this.strategyType;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.pseudoYieldType == null ? 0 : this.pseudoYieldType.hashCode();
        int v2 = this.strategyType == null ? 0 : this.strategyType.hashCode();
        String s = this.yieldType;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + this.percentageDelta;
    }

    @Override
    public String toString() {
        return f.l(e.j("Civ7Strategy_YieldPriorities(pseudoYieldType=", this.pseudoYieldType, ", strategyType=", this.strategyType, ", yieldType="), this.percentageDelta, this.yieldType, ", percentageDelta=", ")");
    }
}

