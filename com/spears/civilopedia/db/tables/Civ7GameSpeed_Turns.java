package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7GameSpeed_Turns;", "", "gameSpeedType", "", "monthIncrement", "", "turnsPerIncrement", "age", "(Ljava/lang/String;IILjava/lang/String;)V", "getAge", "()Ljava/lang/String;", "getGameSpeedType", "getMonthIncrement", "()I", "getTurnsPerIncrement", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7GameSpeed_Turns {
    private final String age;
    private final String gameSpeedType;
    private final int monthIncrement;
    private final int turnsPerIncrement;

    public Civ7GameSpeed_Turns(String s, int v, int v1, String s1) {
        j.f(s, "gameSpeedType");
        j.f(s1, "age");
        super();
        this.gameSpeedType = s;
        this.monthIncrement = v;
        this.turnsPerIncrement = v1;
        this.age = s1;
    }

    public final String component1() {
        return this.gameSpeedType;
    }

    public final int component2() {
        return this.monthIncrement;
    }

    public final int component3() {
        return this.turnsPerIncrement;
    }

    public final String component4() {
        return this.age;
    }

    public final Civ7GameSpeed_Turns copy(String s, int v, int v1, String s1) {
        j.f(s, "gameSpeedType");
        j.f(s1, "age");
        return new Civ7GameSpeed_Turns(s, v, v1, s1);
    }

    public static Civ7GameSpeed_Turns copy$default(Civ7GameSpeed_Turns civ7GameSpeed_Turns0, String s, int v, int v1, String s1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7GameSpeed_Turns0.gameSpeedType;
        }
        if((v2 & 2) != 0) {
            v = civ7GameSpeed_Turns0.monthIncrement;
        }
        if((v2 & 4) != 0) {
            v1 = civ7GameSpeed_Turns0.turnsPerIncrement;
        }
        if((v2 & 8) != 0) {
            s1 = civ7GameSpeed_Turns0.age;
        }
        return civ7GameSpeed_Turns0.copy(s, v, v1, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7GameSpeed_Turns)) {
            return false;
        }
        if(!j.a(this.gameSpeedType, ((Civ7GameSpeed_Turns)object0).gameSpeedType)) {
            return false;
        }
        if(this.monthIncrement != ((Civ7GameSpeed_Turns)object0).monthIncrement) {
            return false;
        }
        return this.turnsPerIncrement == ((Civ7GameSpeed_Turns)object0).turnsPerIncrement ? j.a(this.age, ((Civ7GameSpeed_Turns)object0).age) : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getGameSpeedType() {
        return this.gameSpeedType;
    }

    public final int getMonthIncrement() {
        return this.monthIncrement;
    }

    public final int getTurnsPerIncrement() {
        return this.turnsPerIncrement;
    }

    @Override
    public int hashCode() {
        return this.age.hashCode() + ((this.gameSpeedType.hashCode() * 0x1F + this.monthIncrement) * 0x1F + this.turnsPerIncrement) * 0x1F;
    }

    @Override
    public String toString() {
        return u9.e(f.m(this.monthIncrement, "Civ7GameSpeed_Turns(gameSpeedType=", this.gameSpeedType, ", monthIncrement=", ", turnsPerIncrement="), this.turnsPerIncrement, ", age=", this.age, ")");
    }
}

