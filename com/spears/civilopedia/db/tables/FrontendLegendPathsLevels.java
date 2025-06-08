package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendLegendPathsLevels;", "", "legendPathType", "", "level", "", "threshold", "dnaId", "(Ljava/lang/String;IILjava/lang/String;)V", "getDnaId", "()Ljava/lang/String;", "getLegendPathType", "getLevel", "()I", "getThreshold", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendLegendPathsLevels {
    private final String dnaId;
    private final String legendPathType;
    private final int level;
    private final int threshold;

    public FrontendLegendPathsLevels(String s, int v, int v1, String s1) {
        j.f(s, "legendPathType");
        j.f(s1, "dnaId");
        super();
        this.legendPathType = s;
        this.level = v;
        this.threshold = v1;
        this.dnaId = s1;
    }

    public final String component1() {
        return this.legendPathType;
    }

    public final int component2() {
        return this.level;
    }

    public final int component3() {
        return this.threshold;
    }

    public final String component4() {
        return this.dnaId;
    }

    public final FrontendLegendPathsLevels copy(String s, int v, int v1, String s1) {
        j.f(s, "legendPathType");
        j.f(s1, "dnaId");
        return new FrontendLegendPathsLevels(s, v, v1, s1);
    }

    public static FrontendLegendPathsLevels copy$default(FrontendLegendPathsLevels frontendLegendPathsLevels0, String s, int v, int v1, String s1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = frontendLegendPathsLevels0.legendPathType;
        }
        if((v2 & 2) != 0) {
            v = frontendLegendPathsLevels0.level;
        }
        if((v2 & 4) != 0) {
            v1 = frontendLegendPathsLevels0.threshold;
        }
        if((v2 & 8) != 0) {
            s1 = frontendLegendPathsLevels0.dnaId;
        }
        return frontendLegendPathsLevels0.copy(s, v, v1, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendLegendPathsLevels)) {
            return false;
        }
        if(!j.a(this.legendPathType, ((FrontendLegendPathsLevels)object0).legendPathType)) {
            return false;
        }
        if(this.level != ((FrontendLegendPathsLevels)object0).level) {
            return false;
        }
        return this.threshold == ((FrontendLegendPathsLevels)object0).threshold ? j.a(this.dnaId, ((FrontendLegendPathsLevels)object0).dnaId) : false;
    }

    public final String getDnaId() {
        return this.dnaId;
    }

    public final String getLegendPathType() {
        return this.legendPathType;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    @Override
    public int hashCode() {
        return this.dnaId.hashCode() + ((this.legendPathType.hashCode() * 0x1F + this.level) * 0x1F + this.threshold) * 0x1F;
    }

    @Override
    public String toString() {
        return u9.e(f.m(this.level, "FrontendLegendPathsLevels(legendPathType=", this.legendPathType, ", level=", ", threshold="), this.threshold, ", dnaId=", this.dnaId, ")");
    }
}

