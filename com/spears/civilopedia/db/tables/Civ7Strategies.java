package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001A\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0006HÆ\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001B\u001A\u00020\tHÆ\u0003J\t\u0010\u001C\u001A\u00020\tHÆ\u0003J\t\u0010\u001D\u001A\u00020\tHÆ\u0003JS\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\tHÆ\u0001J\u0013\u0010\u001F\u001A\u00020\u00062\b\u0010 \u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001A\u00020\tHÖ\u0001J\t\u0010\"\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000ER\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000B\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000E¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Strategies;", "", "strategyType", "", "behaviorTree", "cityStrategy", "", "legacyPathType", "maxNumConditionsNeeded", "", "minConditionPercentage", "minNumConditionsNeeded", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;III)V", "getBehaviorTree", "()Ljava/lang/String;", "getCityStrategy", "()Z", "getLegacyPathType", "getMaxNumConditionsNeeded", "()I", "getMinConditionPercentage", "getMinNumConditionsNeeded", "getStrategyType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Strategies {
    private final String behaviorTree;
    private final boolean cityStrategy;
    private final String legacyPathType;
    private final int maxNumConditionsNeeded;
    private final int minConditionPercentage;
    private final int minNumConditionsNeeded;
    private final String strategyType;

    public Civ7Strategies(String s, String s1, boolean z, String s2, int v, int v1, int v2) {
        j.f(s, "strategyType");
        super();
        this.strategyType = s;
        this.behaviorTree = s1;
        this.cityStrategy = z;
        this.legacyPathType = s2;
        this.maxNumConditionsNeeded = v;
        this.minConditionPercentage = v1;
        this.minNumConditionsNeeded = v2;
    }

    public final String component1() {
        return this.strategyType;
    }

    public final String component2() {
        return this.behaviorTree;
    }

    public final boolean component3() {
        return this.cityStrategy;
    }

    public final String component4() {
        return this.legacyPathType;
    }

    public final int component5() {
        return this.maxNumConditionsNeeded;
    }

    public final int component6() {
        return this.minConditionPercentage;
    }

    public final int component7() {
        return this.minNumConditionsNeeded;
    }

    public final Civ7Strategies copy(String s, String s1, boolean z, String s2, int v, int v1, int v2) {
        j.f(s, "strategyType");
        return new Civ7Strategies(s, s1, z, s2, v, v1, v2);
    }

    public static Civ7Strategies copy$default(Civ7Strategies civ7Strategies0, String s, String s1, boolean z, String s2, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            s = civ7Strategies0.strategyType;
        }
        if((v3 & 2) != 0) {
            s1 = civ7Strategies0.behaviorTree;
        }
        if((v3 & 4) != 0) {
            z = civ7Strategies0.cityStrategy;
        }
        if((v3 & 8) != 0) {
            s2 = civ7Strategies0.legacyPathType;
        }
        if((v3 & 16) != 0) {
            v = civ7Strategies0.maxNumConditionsNeeded;
        }
        if((v3 & 0x20) != 0) {
            v1 = civ7Strategies0.minConditionPercentage;
        }
        if((v3 & 0x40) != 0) {
            v2 = civ7Strategies0.minNumConditionsNeeded;
        }
        return civ7Strategies0.copy(s, s1, z, s2, v, v1, v2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Strategies)) {
            return false;
        }
        if(!j.a(this.strategyType, ((Civ7Strategies)object0).strategyType)) {
            return false;
        }
        if(!j.a(this.behaviorTree, ((Civ7Strategies)object0).behaviorTree)) {
            return false;
        }
        if(this.cityStrategy != ((Civ7Strategies)object0).cityStrategy) {
            return false;
        }
        if(!j.a(this.legacyPathType, ((Civ7Strategies)object0).legacyPathType)) {
            return false;
        }
        if(this.maxNumConditionsNeeded != ((Civ7Strategies)object0).maxNumConditionsNeeded) {
            return false;
        }
        return this.minConditionPercentage == ((Civ7Strategies)object0).minConditionPercentage ? this.minNumConditionsNeeded == ((Civ7Strategies)object0).minNumConditionsNeeded : false;
    }

    public final String getBehaviorTree() {
        return this.behaviorTree;
    }

    public final boolean getCityStrategy() {
        return this.cityStrategy;
    }

    public final String getLegacyPathType() {
        return this.legacyPathType;
    }

    public final int getMaxNumConditionsNeeded() {
        return this.maxNumConditionsNeeded;
    }

    public final int getMinConditionPercentage() {
        return this.minConditionPercentage;
    }

    public final int getMinNumConditionsNeeded() {
        return this.minNumConditionsNeeded;
    }

    public final String getStrategyType() {
        return this.strategyType;
    }

    @Override
    public int hashCode() {
        int v = this.strategyType.hashCode();
        int v1 = 0;
        int v2 = this.behaviorTree == null ? 0 : this.behaviorTree.hashCode();
        int v3 = this.cityStrategy ? 0x4CF : 0x4D5;
        String s = this.legacyPathType;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + this.maxNumConditionsNeeded) * 0x1F + this.minConditionPercentage) * 0x1F + this.minNumConditionsNeeded;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Strategies(strategyType=", this.strategyType, ", behaviorTree=", this.behaviorTree, ", cityStrategy=");
        u9.z(stringBuilder0, this.cityStrategy, ", legacyPathType=", this.legacyPathType, ", maxNumConditionsNeeded=");
        f.q(stringBuilder0, this.maxNumConditionsNeeded, ", minConditionPercentage=", this.minConditionPercentage, ", minNumConditionsNeeded=");
        return e.g(stringBuilder0, this.minNumConditionsNeeded, ")");
    }
}

