package com.spears.civilopedia.db.tables;

import A.f;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J;\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Resource_Distribution;", "", "continents", "", "average", "percentAdjusted", "plentiful", "scarce", "(IIIII)V", "getAverage", "()I", "getContinents", "getPercentAdjusted", "getPlentiful", "getScarce", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Resource_Distribution {
    private final int average;
    private final int continents;
    private final int percentAdjusted;
    private final int plentiful;
    private final int scarce;

    public Civ7Resource_Distribution(int v, int v1, int v2, int v3, int v4) {
        this.continents = v;
        this.average = v1;
        this.percentAdjusted = v2;
        this.plentiful = v3;
        this.scarce = v4;
    }

    public final int component1() {
        return this.continents;
    }

    public final int component2() {
        return this.average;
    }

    public final int component3() {
        return this.percentAdjusted;
    }

    public final int component4() {
        return this.plentiful;
    }

    public final int component5() {
        return this.scarce;
    }

    public final Civ7Resource_Distribution copy(int v, int v1, int v2, int v3, int v4) {
        return new Civ7Resource_Distribution(v, v1, v2, v3, v4);
    }

    public static Civ7Resource_Distribution copy$default(Civ7Resource_Distribution civ7Resource_Distribution0, int v, int v1, int v2, int v3, int v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            v = civ7Resource_Distribution0.continents;
        }
        if((v5 & 2) != 0) {
            v1 = civ7Resource_Distribution0.average;
        }
        if((v5 & 4) != 0) {
            v2 = civ7Resource_Distribution0.percentAdjusted;
        }
        if((v5 & 8) != 0) {
            v3 = civ7Resource_Distribution0.plentiful;
        }
        if((v5 & 16) != 0) {
            v4 = civ7Resource_Distribution0.scarce;
        }
        return civ7Resource_Distribution0.copy(v, v1, v2, v3, v4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Resource_Distribution)) {
            return false;
        }
        if(this.continents != ((Civ7Resource_Distribution)object0).continents) {
            return false;
        }
        if(this.average != ((Civ7Resource_Distribution)object0).average) {
            return false;
        }
        if(this.percentAdjusted != ((Civ7Resource_Distribution)object0).percentAdjusted) {
            return false;
        }
        return this.plentiful == ((Civ7Resource_Distribution)object0).plentiful ? this.scarce == ((Civ7Resource_Distribution)object0).scarce : false;
    }

    public final int getAverage() {
        return this.average;
    }

    public final int getContinents() {
        return this.continents;
    }

    public final int getPercentAdjusted() {
        return this.percentAdjusted;
    }

    public final int getPlentiful() {
        return this.plentiful;
    }

    public final int getScarce() {
        return this.scarce;
    }

    @Override
    public int hashCode() {
        return (((this.continents * 0x1F + this.average) * 0x1F + this.percentAdjusted) * 0x1F + this.plentiful) * 0x1F + this.scarce;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.n("Civ7Resource_Distribution(continents=", this.continents, ", average=", this.average, ", percentAdjusted=");
        f.q(stringBuilder0, this.percentAdjusted, ", plentiful=", this.plentiful, ", scarce=");
        return e.g(stringBuilder0, this.scarce, ")");
    }
}

