package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000EJ8\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\r\u0010\u000E¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendLegendPaths;", "", "legendPathType", "", "legendPathName", "dNAChallengeStatisticID", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDNAChallengeStatisticID", "()Ljava/lang/String;", "getLegendPathName", "getLegendPathType", "getSortIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/FrontendLegendPaths;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendLegendPaths {
    private final String dNAChallengeStatisticID;
    private final String legendPathName;
    private final String legendPathType;
    private final Integer sortIndex;

    public FrontendLegendPaths(String s, String s1, String s2, Integer integer0) {
        j.f(s, "legendPathType");
        j.f(s1, "legendPathName");
        j.f(s2, "dNAChallengeStatisticID");
        super();
        this.legendPathType = s;
        this.legendPathName = s1;
        this.dNAChallengeStatisticID = s2;
        this.sortIndex = integer0;
    }

    public final String component1() {
        return this.legendPathType;
    }

    public final String component2() {
        return this.legendPathName;
    }

    public final String component3() {
        return this.dNAChallengeStatisticID;
    }

    public final Integer component4() {
        return this.sortIndex;
    }

    public final FrontendLegendPaths copy(String s, String s1, String s2, Integer integer0) {
        j.f(s, "legendPathType");
        j.f(s1, "legendPathName");
        j.f(s2, "dNAChallengeStatisticID");
        return new FrontendLegendPaths(s, s1, s2, integer0);
    }

    public static FrontendLegendPaths copy$default(FrontendLegendPaths frontendLegendPaths0, String s, String s1, String s2, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendLegendPaths0.legendPathType;
        }
        if((v & 2) != 0) {
            s1 = frontendLegendPaths0.legendPathName;
        }
        if((v & 4) != 0) {
            s2 = frontendLegendPaths0.dNAChallengeStatisticID;
        }
        if((v & 8) != 0) {
            integer0 = frontendLegendPaths0.sortIndex;
        }
        return frontendLegendPaths0.copy(s, s1, s2, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendLegendPaths)) {
            return false;
        }
        if(!j.a(this.legendPathType, ((FrontendLegendPaths)object0).legendPathType)) {
            return false;
        }
        if(!j.a(this.legendPathName, ((FrontendLegendPaths)object0).legendPathName)) {
            return false;
        }
        return j.a(this.dNAChallengeStatisticID, ((FrontendLegendPaths)object0).dNAChallengeStatisticID) ? j.a(this.sortIndex, ((FrontendLegendPaths)object0).sortIndex) : false;
    }

    public final String getDNAChallengeStatisticID() {
        return this.dNAChallengeStatisticID;
    }

    public final String getLegendPathName() {
        return this.legendPathName;
    }

    public final String getLegendPathType() {
        return this.legendPathType;
    }

    public final Integer getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.legendPathType.hashCode() * 0x1F, 0x1F, this.legendPathName), 0x1F, this.dNAChallengeStatisticID);
        return this.sortIndex == null ? v : v + this.sortIndex.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendLegendPaths(legendPathType=", this.legendPathType, ", legendPathName=", this.legendPathName, ", dNAChallengeStatisticID=");
        return u9.d(this.sortIndex, this.dNAChallengeStatisticID, ", sortIndex=", ")", stringBuilder0);
    }
}

