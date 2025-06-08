package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendLegendPathsRewards;", "", "legendPathType", "", "level", "", "reward", "(Ljava/lang/String;ILjava/lang/String;)V", "getLegendPathType", "()Ljava/lang/String;", "getLevel", "()I", "getReward", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendLegendPathsRewards {
    private final String legendPathType;
    private final int level;
    private final String reward;

    public FrontendLegendPathsRewards(String s, int v, String s1) {
        j.f(s, "legendPathType");
        j.f(s1, "reward");
        super();
        this.legendPathType = s;
        this.level = v;
        this.reward = s1;
    }

    public final String component1() {
        return this.legendPathType;
    }

    public final int component2() {
        return this.level;
    }

    public final String component3() {
        return this.reward;
    }

    public final FrontendLegendPathsRewards copy(String s, int v, String s1) {
        j.f(s, "legendPathType");
        j.f(s1, "reward");
        return new FrontendLegendPathsRewards(s, v, s1);
    }

    public static FrontendLegendPathsRewards copy$default(FrontendLegendPathsRewards frontendLegendPathsRewards0, String s, int v, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendLegendPathsRewards0.legendPathType;
        }
        if((v1 & 2) != 0) {
            v = frontendLegendPathsRewards0.level;
        }
        if((v1 & 4) != 0) {
            s1 = frontendLegendPathsRewards0.reward;
        }
        return frontendLegendPathsRewards0.copy(s, v, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendLegendPathsRewards)) {
            return false;
        }
        if(!j.a(this.legendPathType, ((FrontendLegendPathsRewards)object0).legendPathType)) {
            return false;
        }
        return this.level == ((FrontendLegendPathsRewards)object0).level ? j.a(this.reward, ((FrontendLegendPathsRewards)object0).reward) : false;
    }

    public final String getLegendPathType() {
        return this.legendPathType;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getReward() {
        return this.reward;
    }

    @Override
    public int hashCode() {
        return this.reward.hashCode() + (this.legendPathType.hashCode() * 0x1F + this.level) * 0x1F;
    }

    @Override
    public String toString() {
        return e.h(f.m(this.level, "FrontendLegendPathsRewards(legendPathType=", this.legendPathType, ", level=", ", reward="), this.reward, ")");
    }
}

