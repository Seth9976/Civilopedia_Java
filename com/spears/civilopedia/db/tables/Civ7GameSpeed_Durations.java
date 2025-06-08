package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0005HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7GameSpeed_Durations;", "", "gameSpeedScalingType", "", "numberOfTurnsOnStandard", "", "numberOfTurnsScaled", "(Ljava/lang/String;II)V", "getGameSpeedScalingType", "()Ljava/lang/String;", "getNumberOfTurnsOnStandard", "()I", "getNumberOfTurnsScaled", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7GameSpeed_Durations {
    private final String gameSpeedScalingType;
    private final int numberOfTurnsOnStandard;
    private final int numberOfTurnsScaled;

    public Civ7GameSpeed_Durations(String s, int v, int v1) {
        j.f(s, "gameSpeedScalingType");
        super();
        this.gameSpeedScalingType = s;
        this.numberOfTurnsOnStandard = v;
        this.numberOfTurnsScaled = v1;
    }

    public final String component1() {
        return this.gameSpeedScalingType;
    }

    public final int component2() {
        return this.numberOfTurnsOnStandard;
    }

    public final int component3() {
        return this.numberOfTurnsScaled;
    }

    public final Civ7GameSpeed_Durations copy(String s, int v, int v1) {
        j.f(s, "gameSpeedScalingType");
        return new Civ7GameSpeed_Durations(s, v, v1);
    }

    public static Civ7GameSpeed_Durations copy$default(Civ7GameSpeed_Durations civ7GameSpeed_Durations0, String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7GameSpeed_Durations0.gameSpeedScalingType;
        }
        if((v2 & 2) != 0) {
            v = civ7GameSpeed_Durations0.numberOfTurnsOnStandard;
        }
        if((v2 & 4) != 0) {
            v1 = civ7GameSpeed_Durations0.numberOfTurnsScaled;
        }
        return civ7GameSpeed_Durations0.copy(s, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7GameSpeed_Durations)) {
            return false;
        }
        if(!j.a(this.gameSpeedScalingType, ((Civ7GameSpeed_Durations)object0).gameSpeedScalingType)) {
            return false;
        }
        return this.numberOfTurnsOnStandard == ((Civ7GameSpeed_Durations)object0).numberOfTurnsOnStandard ? this.numberOfTurnsScaled == ((Civ7GameSpeed_Durations)object0).numberOfTurnsScaled : false;
    }

    public final String getGameSpeedScalingType() {
        return this.gameSpeedScalingType;
    }

    public final int getNumberOfTurnsOnStandard() {
        return this.numberOfTurnsOnStandard;
    }

    public final int getNumberOfTurnsScaled() {
        return this.numberOfTurnsScaled;
    }

    @Override
    public int hashCode() {
        return (this.gameSpeedScalingType.hashCode() * 0x1F + this.numberOfTurnsOnStandard) * 0x1F + this.numberOfTurnsScaled;
    }

    @Override
    public String toString() {
        return e.g(f.m(this.numberOfTurnsOnStandard, "Civ7GameSpeed_Durations(gameSpeedScalingType=", this.gameSpeedScalingType, ", numberOfTurnsOnStandard=", ", numberOfTurnsScaled="), this.numberOfTurnsScaled, ")");
    }
}

