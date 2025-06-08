package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeTransitionArmyUnits;", "", "age", "", "armyID", "", "unit", "(Ljava/lang/String;ILjava/lang/String;)V", "getAge", "()Ljava/lang/String;", "getArmyID", "()I", "getUnit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeTransitionArmyUnits {
    private final String age;
    private final int armyID;
    private final String unit;

    public Civ7AgeTransitionArmyUnits(String s, int v, String s1) {
        j.f(s, "age");
        j.f(s1, "unit");
        super();
        this.age = s;
        this.armyID = v;
        this.unit = s1;
    }

    public final String component1() {
        return this.age;
    }

    public final int component2() {
        return this.armyID;
    }

    public final String component3() {
        return this.unit;
    }

    public final Civ7AgeTransitionArmyUnits copy(String s, int v, String s1) {
        j.f(s, "age");
        j.f(s1, "unit");
        return new Civ7AgeTransitionArmyUnits(s, v, s1);
    }

    public static Civ7AgeTransitionArmyUnits copy$default(Civ7AgeTransitionArmyUnits civ7AgeTransitionArmyUnits0, String s, int v, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7AgeTransitionArmyUnits0.age;
        }
        if((v1 & 2) != 0) {
            v = civ7AgeTransitionArmyUnits0.armyID;
        }
        if((v1 & 4) != 0) {
            s1 = civ7AgeTransitionArmyUnits0.unit;
        }
        return civ7AgeTransitionArmyUnits0.copy(s, v, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeTransitionArmyUnits)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7AgeTransitionArmyUnits)object0).age)) {
            return false;
        }
        return this.armyID == ((Civ7AgeTransitionArmyUnits)object0).armyID ? j.a(this.unit, ((Civ7AgeTransitionArmyUnits)object0).unit) : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final int getArmyID() {
        return this.armyID;
    }

    public final String getUnit() {
        return this.unit;
    }

    @Override
    public int hashCode() {
        return this.unit.hashCode() + (this.age.hashCode() * 0x1F + this.armyID) * 0x1F;
    }

    @Override
    public String toString() {
        return e.h(f.m(this.armyID, "Civ7AgeTransitionArmyUnits(age=", this.age, ", armyID=", ", unit="), this.unit, ")");
    }
}

