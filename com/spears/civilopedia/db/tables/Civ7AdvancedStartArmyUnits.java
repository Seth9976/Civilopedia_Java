package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AdvancedStartArmyUnits;", "", "age", "", "armyID", "", "level", "unit", "(Ljava/lang/String;IILjava/lang/String;)V", "getAge", "()Ljava/lang/String;", "getArmyID", "()I", "getLevel", "getUnit", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AdvancedStartArmyUnits {
    private final String age;
    private final int armyID;
    private final int level;
    private final String unit;

    public Civ7AdvancedStartArmyUnits(String s, int v, int v1, String s1) {
        j.f(s, "age");
        j.f(s1, "unit");
        super();
        this.age = s;
        this.armyID = v;
        this.level = v1;
        this.unit = s1;
    }

    public final String component1() {
        return this.age;
    }

    public final int component2() {
        return this.armyID;
    }

    public final int component3() {
        return this.level;
    }

    public final String component4() {
        return this.unit;
    }

    public final Civ7AdvancedStartArmyUnits copy(String s, int v, int v1, String s1) {
        j.f(s, "age");
        j.f(s1, "unit");
        return new Civ7AdvancedStartArmyUnits(s, v, v1, s1);
    }

    public static Civ7AdvancedStartArmyUnits copy$default(Civ7AdvancedStartArmyUnits civ7AdvancedStartArmyUnits0, String s, int v, int v1, String s1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7AdvancedStartArmyUnits0.age;
        }
        if((v2 & 2) != 0) {
            v = civ7AdvancedStartArmyUnits0.armyID;
        }
        if((v2 & 4) != 0) {
            v1 = civ7AdvancedStartArmyUnits0.level;
        }
        if((v2 & 8) != 0) {
            s1 = civ7AdvancedStartArmyUnits0.unit;
        }
        return civ7AdvancedStartArmyUnits0.copy(s, v, v1, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AdvancedStartArmyUnits)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7AdvancedStartArmyUnits)object0).age)) {
            return false;
        }
        if(this.armyID != ((Civ7AdvancedStartArmyUnits)object0).armyID) {
            return false;
        }
        return this.level == ((Civ7AdvancedStartArmyUnits)object0).level ? j.a(this.unit, ((Civ7AdvancedStartArmyUnits)object0).unit) : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final int getArmyID() {
        return this.armyID;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getUnit() {
        return this.unit;
    }

    @Override
    public int hashCode() {
        return this.unit.hashCode() + ((this.age.hashCode() * 0x1F + this.armyID) * 0x1F + this.level) * 0x1F;
    }

    @Override
    public String toString() {
        return u9.e(f.m(this.armyID, "Civ7AdvancedStartArmyUnits(age=", this.age, ", armyID=", ", level="), this.level, ", unit=", this.unit, ")");
    }
}

