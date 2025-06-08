package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ>\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Civilization_FreeUnits;", "", "civilizationType", "", "unitClassType", "unitAIType", "count", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCivilizationType", "()Ljava/lang/String;", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnitAIType", "getUnitClassType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Civilization_FreeUnits;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Civilization_FreeUnits {
    private final String civilizationType;
    private final Integer count;
    private final String unitAIType;
    private final String unitClassType;

    public Civ5Civilization_FreeUnits(String s, String s1, String s2, Integer integer0) {
        this.civilizationType = s;
        this.unitClassType = s1;
        this.unitAIType = s2;
        this.count = integer0;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.unitClassType;
    }

    public final String component3() {
        return this.unitAIType;
    }

    public final Integer component4() {
        return this.count;
    }

    public final Civ5Civilization_FreeUnits copy(String s, String s1, String s2, Integer integer0) {
        return new Civ5Civilization_FreeUnits(s, s1, s2, integer0);
    }

    public static Civ5Civilization_FreeUnits copy$default(Civ5Civilization_FreeUnits civ5Civilization_FreeUnits0, String s, String s1, String s2, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Civilization_FreeUnits0.civilizationType;
        }
        if((v & 2) != 0) {
            s1 = civ5Civilization_FreeUnits0.unitClassType;
        }
        if((v & 4) != 0) {
            s2 = civ5Civilization_FreeUnits0.unitAIType;
        }
        if((v & 8) != 0) {
            integer0 = civ5Civilization_FreeUnits0.count;
        }
        return civ5Civilization_FreeUnits0.copy(s, s1, s2, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Civilization_FreeUnits)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civ5Civilization_FreeUnits)object0).civilizationType)) {
            return false;
        }
        if(!j.a(this.unitClassType, ((Civ5Civilization_FreeUnits)object0).unitClassType)) {
            return false;
        }
        return j.a(this.unitAIType, ((Civ5Civilization_FreeUnits)object0).unitAIType) ? j.a(this.count, ((Civ5Civilization_FreeUnits)object0).count) : false;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getUnitAIType() {
        return this.unitAIType;
    }

    public final String getUnitClassType() {
        return this.unitClassType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.civilizationType == null ? 0 : this.civilizationType.hashCode();
        int v2 = this.unitClassType == null ? 0 : this.unitClassType.hashCode();
        int v3 = this.unitAIType == null ? 0 : this.unitAIType.hashCode();
        Integer integer0 = this.count;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Civilization_FreeUnits(civilizationType=", this.civilizationType, ", unitClassType=", this.unitClassType, ", unitAIType=");
        return u9.d(this.count, this.unitAIType, ", count=", ")", stringBuilder0);
    }
}

