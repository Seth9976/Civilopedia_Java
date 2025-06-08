package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5UnitGameplay2DScripts;", "", "unitType", "", "selectionSound", "firstSelectionSound", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstSelectionSound", "()Ljava/lang/String;", "getSelectionSound", "getUnitType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5UnitGameplay2DScripts {
    private final String firstSelectionSound;
    private final String selectionSound;
    private final String unitType;

    public Civ5UnitGameplay2DScripts(String s, String s1, String s2) {
        this.unitType = s;
        this.selectionSound = s1;
        this.firstSelectionSound = s2;
    }

    public final String component1() {
        return this.unitType;
    }

    public final String component2() {
        return this.selectionSound;
    }

    public final String component3() {
        return this.firstSelectionSound;
    }

    public final Civ5UnitGameplay2DScripts copy(String s, String s1, String s2) {
        return new Civ5UnitGameplay2DScripts(s, s1, s2);
    }

    public static Civ5UnitGameplay2DScripts copy$default(Civ5UnitGameplay2DScripts civ5UnitGameplay2DScripts0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5UnitGameplay2DScripts0.unitType;
        }
        if((v & 2) != 0) {
            s1 = civ5UnitGameplay2DScripts0.selectionSound;
        }
        if((v & 4) != 0) {
            s2 = civ5UnitGameplay2DScripts0.firstSelectionSound;
        }
        return civ5UnitGameplay2DScripts0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5UnitGameplay2DScripts)) {
            return false;
        }
        if(!j.a(this.unitType, ((Civ5UnitGameplay2DScripts)object0).unitType)) {
            return false;
        }
        return j.a(this.selectionSound, ((Civ5UnitGameplay2DScripts)object0).selectionSound) ? j.a(this.firstSelectionSound, ((Civ5UnitGameplay2DScripts)object0).firstSelectionSound) : false;
    }

    public final String getFirstSelectionSound() {
        return this.firstSelectionSound;
    }

    public final String getSelectionSound() {
        return this.selectionSound;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.unitType == null ? 0 : this.unitType.hashCode();
        int v2 = this.selectionSound == null ? 0 : this.selectionSound.hashCode();
        String s = this.firstSelectionSound;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ5UnitGameplay2DScripts(unitType=", this.unitType, ", selectionSound=", this.selectionSound, ", firstSelectionSound="), this.firstSelectionSound, ")");
    }
}

