package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000BJ\t\u0010\u0012\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0007HÆ\u0003J8\u0010\u0015\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001A\u00020\u00052\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\b\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000F¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeTransitionRespawnUnits;", "", "armyID", "", "isNavy", "", "respawnType", "", "unit", "(Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;)V", "getArmyID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getRespawnType", "()Ljava/lang/String;", "getUnit", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7AgeTransitionRespawnUnits;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeTransitionRespawnUnits {
    private final Integer armyID;
    private final boolean isNavy;
    private final String respawnType;
    private final String unit;

    public Civ7AgeTransitionRespawnUnits(Integer integer0, boolean z, String s, String s1) {
        j.f(s, "respawnType");
        j.f(s1, "unit");
        super();
        this.armyID = integer0;
        this.isNavy = z;
        this.respawnType = s;
        this.unit = s1;
    }

    public final Integer component1() {
        return this.armyID;
    }

    public final boolean component2() {
        return this.isNavy;
    }

    public final String component3() {
        return this.respawnType;
    }

    public final String component4() {
        return this.unit;
    }

    public final Civ7AgeTransitionRespawnUnits copy(Integer integer0, boolean z, String s, String s1) {
        j.f(s, "respawnType");
        j.f(s1, "unit");
        return new Civ7AgeTransitionRespawnUnits(integer0, z, s, s1);
    }

    public static Civ7AgeTransitionRespawnUnits copy$default(Civ7AgeTransitionRespawnUnits civ7AgeTransitionRespawnUnits0, Integer integer0, boolean z, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ7AgeTransitionRespawnUnits0.armyID;
        }
        if((v & 2) != 0) {
            z = civ7AgeTransitionRespawnUnits0.isNavy;
        }
        if((v & 4) != 0) {
            s = civ7AgeTransitionRespawnUnits0.respawnType;
        }
        if((v & 8) != 0) {
            s1 = civ7AgeTransitionRespawnUnits0.unit;
        }
        return civ7AgeTransitionRespawnUnits0.copy(integer0, z, s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeTransitionRespawnUnits)) {
            return false;
        }
        if(!j.a(this.armyID, ((Civ7AgeTransitionRespawnUnits)object0).armyID)) {
            return false;
        }
        if(this.isNavy != ((Civ7AgeTransitionRespawnUnits)object0).isNavy) {
            return false;
        }
        return j.a(this.respawnType, ((Civ7AgeTransitionRespawnUnits)object0).respawnType) ? j.a(this.unit, ((Civ7AgeTransitionRespawnUnits)object0).unit) : false;
    }

    public final Integer getArmyID() {
        return this.armyID;
    }

    public final String getRespawnType() {
        return this.respawnType;
    }

    public final String getUnit() {
        return this.unit;
    }

    @Override
    public int hashCode() {
        int v = this.armyID == null ? 0 : this.armyID.hashCode();
        return this.isNavy ? this.unit.hashCode() + f.b((v * 0x1F + 0x4CF) * 0x1F, 0x1F, this.respawnType) : this.unit.hashCode() + f.b((v * 0x1F + 0x4D5) * 0x1F, 0x1F, this.respawnType);
    }

    public final boolean isNavy() {
        return this.isNavy;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7AgeTransitionRespawnUnits(armyID=");
        stringBuilder0.append(this.armyID);
        stringBuilder0.append(", isNavy=");
        stringBuilder0.append(this.isNavy);
        stringBuilder0.append(", respawnType=");
        return e.i(stringBuilder0, this.respawnType, ", unit=", this.unit, ")");
    }
}

