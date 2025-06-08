package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u000B¢\u0006\u0002\u0010\fJ\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001C\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001D\u001A\u00020\u000BHÆ\u0003JU\u0010\u001E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u000BHÆ\u0001J\u0013\u0010\u001F\u001A\u00020\u00052\b\u0010 \u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001A\u00020\u000BHÖ\u0001J\t\u0010\"\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000ER\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000ER\u0011\u0010\n\u001A\u00020\u000B¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7StrategyConditions;", "", "conditionFunction", "", "exclusive", "", "strategyType", "stringValue", "disqualifier", "forbidden", "thresholdValue", "", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZI)V", "getConditionFunction", "()Ljava/lang/String;", "getDisqualifier", "()Z", "getExclusive", "getForbidden", "getStrategyType", "getStringValue", "getThresholdValue", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7StrategyConditions {
    private final String conditionFunction;
    private final boolean disqualifier;
    private final boolean exclusive;
    private final boolean forbidden;
    private final String strategyType;
    private final String stringValue;
    private final int thresholdValue;

    public Civ7StrategyConditions(String s, boolean z, String s1, String s2, boolean z1, boolean z2, int v) {
        this.conditionFunction = s;
        this.exclusive = z;
        this.strategyType = s1;
        this.stringValue = s2;
        this.disqualifier = z1;
        this.forbidden = z2;
        this.thresholdValue = v;
    }

    public final String component1() {
        return this.conditionFunction;
    }

    public final boolean component2() {
        return this.exclusive;
    }

    public final String component3() {
        return this.strategyType;
    }

    public final String component4() {
        return this.stringValue;
    }

    public final boolean component5() {
        return this.disqualifier;
    }

    public final boolean component6() {
        return this.forbidden;
    }

    public final int component7() {
        return this.thresholdValue;
    }

    public final Civ7StrategyConditions copy(String s, boolean z, String s1, String s2, boolean z1, boolean z2, int v) {
        return new Civ7StrategyConditions(s, z, s1, s2, z1, z2, v);
    }

    public static Civ7StrategyConditions copy$default(Civ7StrategyConditions civ7StrategyConditions0, String s, boolean z, String s1, String s2, boolean z1, boolean z2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7StrategyConditions0.conditionFunction;
        }
        if((v1 & 2) != 0) {
            z = civ7StrategyConditions0.exclusive;
        }
        if((v1 & 4) != 0) {
            s1 = civ7StrategyConditions0.strategyType;
        }
        if((v1 & 8) != 0) {
            s2 = civ7StrategyConditions0.stringValue;
        }
        if((v1 & 16) != 0) {
            z1 = civ7StrategyConditions0.disqualifier;
        }
        if((v1 & 0x20) != 0) {
            z2 = civ7StrategyConditions0.forbidden;
        }
        if((v1 & 0x40) != 0) {
            v = civ7StrategyConditions0.thresholdValue;
        }
        return civ7StrategyConditions0.copy(s, z, s1, s2, z1, z2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7StrategyConditions)) {
            return false;
        }
        if(!j.a(this.conditionFunction, ((Civ7StrategyConditions)object0).conditionFunction)) {
            return false;
        }
        if(this.exclusive != ((Civ7StrategyConditions)object0).exclusive) {
            return false;
        }
        if(!j.a(this.strategyType, ((Civ7StrategyConditions)object0).strategyType)) {
            return false;
        }
        if(!j.a(this.stringValue, ((Civ7StrategyConditions)object0).stringValue)) {
            return false;
        }
        if(this.disqualifier != ((Civ7StrategyConditions)object0).disqualifier) {
            return false;
        }
        return this.forbidden == ((Civ7StrategyConditions)object0).forbidden ? this.thresholdValue == ((Civ7StrategyConditions)object0).thresholdValue : false;
    }

    public final String getConditionFunction() {
        return this.conditionFunction;
    }

    public final boolean getDisqualifier() {
        return this.disqualifier;
    }

    public final boolean getExclusive() {
        return this.exclusive;
    }

    public final boolean getForbidden() {
        return this.forbidden;
    }

    public final String getStrategyType() {
        return this.strategyType;
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    public final int getThresholdValue() {
        return this.thresholdValue;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.conditionFunction == null ? 0 : this.conditionFunction.hashCode();
        int v2 = 0x4D5;
        int v3 = this.exclusive ? 0x4CF : 0x4D5;
        int v4 = this.strategyType == null ? 0 : this.strategyType.hashCode();
        String s = this.stringValue;
        if(s != null) {
            v = s.hashCode();
        }
        int v5 = this.disqualifier ? 0x4CF : 0x4D5;
        if(this.forbidden) {
            v2 = 0x4CF;
        }
        return (((((v1 * 0x1F + v3) * 0x1F + v4) * 0x1F + v) * 0x1F + v5) * 0x1F + v2) * 0x1F + this.thresholdValue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.j("Civ7StrategyConditions(conditionFunction=", this.conditionFunction, this.exclusive, ", exclusive=", ", strategyType=");
        f.t(stringBuilder0, this.strategyType, ", stringValue=", this.stringValue, ", disqualifier=");
        u9.A(stringBuilder0, this.disqualifier, ", forbidden=", this.forbidden, ", thresholdValue=");
        return e.g(stringBuilder0, this.thresholdValue, ")");
    }
}

