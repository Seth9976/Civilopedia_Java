package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000BJ8\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0014\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000EJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001C\u001A\u0004\b\u001D\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001A\u001A\u0004\b\u001E\u0010\u000BR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001A\u001A\u0004\b\u001F\u0010\u000B¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7GameSpeed_Scalings;", "Lo2/m;", "", "gameSpeedScalingType", "", "defaultCostMultiplier", "gameSpeedType", "scalingType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7GameSpeed_Scalings;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGameSpeedScalingType", "I", "getDefaultCostMultiplier", "getGameSpeedType", "getScalingType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7GameSpeed_Scalings implements m {
    private final int defaultCostMultiplier;
    private final String gameSpeedScalingType;
    private final String gameSpeedType;
    private final String scalingType;

    public Civ7GameSpeed_Scalings(String s, int v, String s1, String s2) {
        j.f(s, "gameSpeedScalingType");
        j.f(s1, "gameSpeedType");
        j.f(s2, "scalingType");
        super();
        this.gameSpeedScalingType = s;
        this.defaultCostMultiplier = v;
        this.gameSpeedType = s1;
        this.scalingType = s2;
    }

    public final String component1() {
        return this.gameSpeedScalingType;
    }

    public final int component2() {
        return this.defaultCostMultiplier;
    }

    public final String component3() {
        return this.gameSpeedType;
    }

    public final String component4() {
        return this.scalingType;
    }

    public final Civ7GameSpeed_Scalings copy(String s, int v, String s1, String s2) {
        j.f(s, "gameSpeedScalingType");
        j.f(s1, "gameSpeedType");
        j.f(s2, "scalingType");
        return new Civ7GameSpeed_Scalings(s, v, s1, s2);
    }

    public static Civ7GameSpeed_Scalings copy$default(Civ7GameSpeed_Scalings civ7GameSpeed_Scalings0, String s, int v, String s1, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7GameSpeed_Scalings0.gameSpeedScalingType;
        }
        if((v1 & 2) != 0) {
            v = civ7GameSpeed_Scalings0.defaultCostMultiplier;
        }
        if((v1 & 4) != 0) {
            s1 = civ7GameSpeed_Scalings0.gameSpeedType;
        }
        if((v1 & 8) != 0) {
            s2 = civ7GameSpeed_Scalings0.scalingType;
        }
        return civ7GameSpeed_Scalings0.copy(s, v, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7GameSpeed_Scalings)) {
            return false;
        }
        if(!j.a(this.gameSpeedScalingType, ((Civ7GameSpeed_Scalings)object0).gameSpeedScalingType)) {
            return false;
        }
        if(this.defaultCostMultiplier != ((Civ7GameSpeed_Scalings)object0).defaultCostMultiplier) {
            return false;
        }
        return j.a(this.gameSpeedType, ((Civ7GameSpeed_Scalings)object0).gameSpeedType) ? j.a(this.scalingType, ((Civ7GameSpeed_Scalings)object0).scalingType) : false;
    }

    public final int getDefaultCostMultiplier() {
        return this.defaultCostMultiplier;
    }

    public final String getGameSpeedScalingType() {
        return this.gameSpeedScalingType;
    }

    public final String getGameSpeedType() {
        return this.gameSpeedType;
    }

    public final String getScalingType() {
        return this.scalingType;
    }

    @Override
    public int hashCode() {
        return this.scalingType.hashCode() + f.b((this.gameSpeedScalingType.hashCode() * 0x1F + this.defaultCostMultiplier) * 0x1F, 0x1F, this.gameSpeedType);
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.gameSpeedScalingType;
    }

    @Override
    public String toString() {
        return e.i(f.m(this.defaultCostMultiplier, "Civ7GameSpeed_Scalings(gameSpeedScalingType=", this.gameSpeedScalingType, ", defaultCostMultiplier=", ", gameSpeedType="), this.gameSpeedType, ", scalingType=", this.scalingType, ")");
    }
}

