package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u000E\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\u0004\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0012JV\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u000FJ\u0010\u0010\u001C\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u0012J\u001A\u0010\u001F\u001A\u00020\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u00D6\u0003\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010!\u001A\u0004\b\"\u0010\u000FR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010#\u001A\u0004\b$\u0010\u0012R\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010#\u001A\u0004\b%\u0010\u0012R\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010#\u001A\u0004\b&\u0010\u0012R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\t\u0010\'\u001A\u0004\b(\u0010\u0016R\u0017\u0010\n\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\n\u0010\'\u001A\u0004\b)\u0010\u0016R\u0017\u0010\u000B\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010#\u001A\u0004\b*\u0010\u0012\u00A8\u0006+"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Constructible_Logistics;", "Lo2/m;", "", "constructibleType", "", "buildChargeCost", "combatStrength", "maxHealPerTurn", "", "plotOwned", "plotWallsDefense", "supplies", "<init>", "(Ljava/lang/String;IIIZZI)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;IIIZZI)Lcom/spears/civilopedia/db/tables/Civ7Constructible_Logistics;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConstructibleType", "I", "getBuildChargeCost", "getCombatStrength", "getMaxHealPerTurn", "Z", "getPlotOwned", "getPlotWallsDefense", "getSupplies", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Constructible_Logistics implements m {
    private final int buildChargeCost;
    private final int combatStrength;
    private final String constructibleType;
    private final int maxHealPerTurn;
    private final boolean plotOwned;
    private final boolean plotWallsDefense;
    private final int supplies;

    public Civ7Constructible_Logistics(String s, int v, int v1, int v2, boolean z, boolean z1, int v3) {
        j.f(s, "constructibleType");
        super();
        this.constructibleType = s;
        this.buildChargeCost = v;
        this.combatStrength = v1;
        this.maxHealPerTurn = v2;
        this.plotOwned = z;
        this.plotWallsDefense = z1;
        this.supplies = v3;
    }

    public final String component1() {
        return this.constructibleType;
    }

    public final int component2() {
        return this.buildChargeCost;
    }

    public final int component3() {
        return this.combatStrength;
    }

    public final int component4() {
        return this.maxHealPerTurn;
    }

    public final boolean component5() {
        return this.plotOwned;
    }

    public final boolean component6() {
        return this.plotWallsDefense;
    }

    public final int component7() {
        return this.supplies;
    }

    public final Civ7Constructible_Logistics copy(String s, int v, int v1, int v2, boolean z, boolean z1, int v3) {
        j.f(s, "constructibleType");
        return new Civ7Constructible_Logistics(s, v, v1, v2, z, z1, v3);
    }

    public static Civ7Constructible_Logistics copy$default(Civ7Constructible_Logistics civ7Constructible_Logistics0, String s, int v, int v1, int v2, boolean z, boolean z1, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            s = civ7Constructible_Logistics0.constructibleType;
        }
        if((v4 & 2) != 0) {
            v = civ7Constructible_Logistics0.buildChargeCost;
        }
        if((v4 & 4) != 0) {
            v1 = civ7Constructible_Logistics0.combatStrength;
        }
        if((v4 & 8) != 0) {
            v2 = civ7Constructible_Logistics0.maxHealPerTurn;
        }
        if((v4 & 16) != 0) {
            z = civ7Constructible_Logistics0.plotOwned;
        }
        if((v4 & 0x20) != 0) {
            z1 = civ7Constructible_Logistics0.plotWallsDefense;
        }
        if((v4 & 0x40) != 0) {
            v3 = civ7Constructible_Logistics0.supplies;
        }
        return civ7Constructible_Logistics0.copy(s, v, v1, v2, z, z1, v3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Constructible_Logistics)) {
            return false;
        }
        if(!j.a(this.constructibleType, ((Civ7Constructible_Logistics)object0).constructibleType)) {
            return false;
        }
        if(this.buildChargeCost != ((Civ7Constructible_Logistics)object0).buildChargeCost) {
            return false;
        }
        if(this.combatStrength != ((Civ7Constructible_Logistics)object0).combatStrength) {
            return false;
        }
        if(this.maxHealPerTurn != ((Civ7Constructible_Logistics)object0).maxHealPerTurn) {
            return false;
        }
        if(this.plotOwned != ((Civ7Constructible_Logistics)object0).plotOwned) {
            return false;
        }
        return this.plotWallsDefense == ((Civ7Constructible_Logistics)object0).plotWallsDefense ? this.supplies == ((Civ7Constructible_Logistics)object0).supplies : false;
    }

    public final int getBuildChargeCost() {
        return this.buildChargeCost;
    }

    public final int getCombatStrength() {
        return this.combatStrength;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final int getMaxHealPerTurn() {
        return this.maxHealPerTurn;
    }

    public final boolean getPlotOwned() {
        return this.plotOwned;
    }

    public final boolean getPlotWallsDefense() {
        return this.plotWallsDefense;
    }

    public final int getSupplies() {
        return this.supplies;
    }

    @Override
    public int hashCode() {
        int v = (((this.constructibleType.hashCode() * 0x1F + this.buildChargeCost) * 0x1F + this.combatStrength) * 0x1F + this.maxHealPerTurn) * 0x1F;
        int v1 = 0x4D5;
        int v2 = this.plotOwned ? 0x4CF : 0x4D5;
        if(this.plotWallsDefense) {
            v1 = 0x4CF;
        }
        return ((v + v2) * 0x1F + v1) * 0x1F + this.supplies;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.constructibleType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.buildChargeCost, "Civ7Constructible_Logistics(constructibleType=", this.constructibleType, ", buildChargeCost=", ", combatStrength=");
        f.q(stringBuilder0, this.combatStrength, ", maxHealPerTurn=", this.maxHealPerTurn, ", plotOwned=");
        u9.A(stringBuilder0, this.plotOwned, ", plotWallsDefense=", this.plotWallsDefense, ", supplies=");
        return e.g(stringBuilder0, this.supplies, ")");
    }
}

