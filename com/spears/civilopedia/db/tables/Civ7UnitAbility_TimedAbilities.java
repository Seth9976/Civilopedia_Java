package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitAbility_TimedAbilities;", "", "timedUnitAbilityType", "", "unitAbilityType", "duration", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDuration", "()I", "getTimedUnitAbilityType", "()Ljava/lang/String;", "getUnitAbilityType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitAbility_TimedAbilities {
    private final int duration;
    private final String timedUnitAbilityType;
    private final String unitAbilityType;

    public Civ7UnitAbility_TimedAbilities(String s, String s1, int v) {
        j.f(s, "timedUnitAbilityType");
        j.f(s1, "unitAbilityType");
        super();
        this.timedUnitAbilityType = s;
        this.unitAbilityType = s1;
        this.duration = v;
    }

    public final String component1() {
        return this.timedUnitAbilityType;
    }

    public final String component2() {
        return this.unitAbilityType;
    }

    public final int component3() {
        return this.duration;
    }

    public final Civ7UnitAbility_TimedAbilities copy(String s, String s1, int v) {
        j.f(s, "timedUnitAbilityType");
        j.f(s1, "unitAbilityType");
        return new Civ7UnitAbility_TimedAbilities(s, s1, v);
    }

    public static Civ7UnitAbility_TimedAbilities copy$default(Civ7UnitAbility_TimedAbilities civ7UnitAbility_TimedAbilities0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7UnitAbility_TimedAbilities0.timedUnitAbilityType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7UnitAbility_TimedAbilities0.unitAbilityType;
        }
        if((v1 & 4) != 0) {
            v = civ7UnitAbility_TimedAbilities0.duration;
        }
        return civ7UnitAbility_TimedAbilities0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitAbility_TimedAbilities)) {
            return false;
        }
        if(!j.a(this.timedUnitAbilityType, ((Civ7UnitAbility_TimedAbilities)object0).timedUnitAbilityType)) {
            return false;
        }
        return j.a(this.unitAbilityType, ((Civ7UnitAbility_TimedAbilities)object0).unitAbilityType) ? this.duration == ((Civ7UnitAbility_TimedAbilities)object0).duration : false;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getTimedUnitAbilityType() {
        return this.timedUnitAbilityType;
    }

    public final String getUnitAbilityType() {
        return this.unitAbilityType;
    }

    @Override
    public int hashCode() {
        return f.b(this.timedUnitAbilityType.hashCode() * 0x1F, 0x1F, this.unitAbilityType) + this.duration;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ7UnitAbility_TimedAbilities(timedUnitAbilityType=", this.timedUnitAbilityType, ", unitAbilityType=", this.unitAbilityType, ", duration="), this.duration, ")");
    }
}

