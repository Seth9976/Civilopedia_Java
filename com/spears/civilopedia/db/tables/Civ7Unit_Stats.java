package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\u0005HÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0011¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Unit_Stats;", "", "unitType", "", "bombard", "", "combat", "range", "rangedCombat", "wMDType", "(Ljava/lang/String;IIIILjava/lang/String;)V", "getBombard", "()I", "getCombat", "getRange", "getRangedCombat", "getUnitType", "()Ljava/lang/String;", "getWMDType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Unit_Stats {
    private final int bombard;
    private final int combat;
    private final int range;
    private final int rangedCombat;
    private final String unitType;
    private final String wMDType;

    public Civ7Unit_Stats(String s, int v, int v1, int v2, int v3, String s1) {
        j.f(s, "unitType");
        super();
        this.unitType = s;
        this.bombard = v;
        this.combat = v1;
        this.range = v2;
        this.rangedCombat = v3;
        this.wMDType = s1;
    }

    public final String component1() {
        return this.unitType;
    }

    public final int component2() {
        return this.bombard;
    }

    public final int component3() {
        return this.combat;
    }

    public final int component4() {
        return this.range;
    }

    public final int component5() {
        return this.rangedCombat;
    }

    public final String component6() {
        return this.wMDType;
    }

    public final Civ7Unit_Stats copy(String s, int v, int v1, int v2, int v3, String s1) {
        j.f(s, "unitType");
        return new Civ7Unit_Stats(s, v, v1, v2, v3, s1);
    }

    public static Civ7Unit_Stats copy$default(Civ7Unit_Stats civ7Unit_Stats0, String s, int v, int v1, int v2, int v3, String s1, int v4, Object object0) {
        if((v4 & 1) != 0) {
            s = civ7Unit_Stats0.unitType;
        }
        if((v4 & 2) != 0) {
            v = civ7Unit_Stats0.bombard;
        }
        if((v4 & 4) != 0) {
            v1 = civ7Unit_Stats0.combat;
        }
        if((v4 & 8) != 0) {
            v2 = civ7Unit_Stats0.range;
        }
        if((v4 & 16) != 0) {
            v3 = civ7Unit_Stats0.rangedCombat;
        }
        if((v4 & 0x20) != 0) {
            s1 = civ7Unit_Stats0.wMDType;
        }
        return civ7Unit_Stats0.copy(s, v, v1, v2, v3, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Unit_Stats)) {
            return false;
        }
        if(!j.a(this.unitType, ((Civ7Unit_Stats)object0).unitType)) {
            return false;
        }
        if(this.bombard != ((Civ7Unit_Stats)object0).bombard) {
            return false;
        }
        if(this.combat != ((Civ7Unit_Stats)object0).combat) {
            return false;
        }
        if(this.range != ((Civ7Unit_Stats)object0).range) {
            return false;
        }
        return this.rangedCombat == ((Civ7Unit_Stats)object0).rangedCombat ? j.a(this.wMDType, ((Civ7Unit_Stats)object0).wMDType) : false;
    }

    public final int getBombard() {
        return this.bombard;
    }

    public final int getCombat() {
        return this.combat;
    }

    public final int getRange() {
        return this.range;
    }

    public final int getRangedCombat() {
        return this.rangedCombat;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    public final String getWMDType() {
        return this.wMDType;
    }

    @Override
    public int hashCode() {
        int v = ((((this.unitType.hashCode() * 0x1F + this.bombard) * 0x1F + this.combat) * 0x1F + this.range) * 0x1F + this.rangedCombat) * 0x1F;
        return this.wMDType == null ? v : v + this.wMDType.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.bombard, "Civ7Unit_Stats(unitType=", this.unitType, ", bombard=", ", combat=");
        f.q(stringBuilder0, this.combat, ", range=", this.range, ", rangedCombat=");
        return u9.e(stringBuilder0, this.rangedCombat, ", wMDType=", this.wMDType, ")");
    }
}

