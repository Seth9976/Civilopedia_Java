package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ<\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0005HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\f\u0010\nR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7NarrativeStory_Yield_Rewards;", "", "type", "", "diplomacyYieldValue", "", "maintenanceYieldValue", "progressionYieldValue", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDiplomacyYieldValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaintenanceYieldValue", "getProgressionYieldValue", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ7NarrativeStory_Yield_Rewards;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7NarrativeStory_Yield_Rewards {
    private final Integer diplomacyYieldValue;
    private final Integer maintenanceYieldValue;
    private final Integer progressionYieldValue;
    private final String type;

    public Civ7NarrativeStory_Yield_Rewards(String s, Integer integer0, Integer integer1, Integer integer2) {
        j.f(s, "type");
        super();
        this.type = s;
        this.diplomacyYieldValue = integer0;
        this.maintenanceYieldValue = integer1;
        this.progressionYieldValue = integer2;
    }

    public final String component1() {
        return this.type;
    }

    public final Integer component2() {
        return this.diplomacyYieldValue;
    }

    public final Integer component3() {
        return this.maintenanceYieldValue;
    }

    public final Integer component4() {
        return this.progressionYieldValue;
    }

    public final Civ7NarrativeStory_Yield_Rewards copy(String s, Integer integer0, Integer integer1, Integer integer2) {
        j.f(s, "type");
        return new Civ7NarrativeStory_Yield_Rewards(s, integer0, integer1, integer2);
    }

    public static Civ7NarrativeStory_Yield_Rewards copy$default(Civ7NarrativeStory_Yield_Rewards civ7NarrativeStory_Yield_Rewards0, String s, Integer integer0, Integer integer1, Integer integer2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7NarrativeStory_Yield_Rewards0.type;
        }
        if((v & 2) != 0) {
            integer0 = civ7NarrativeStory_Yield_Rewards0.diplomacyYieldValue;
        }
        if((v & 4) != 0) {
            integer1 = civ7NarrativeStory_Yield_Rewards0.maintenanceYieldValue;
        }
        if((v & 8) != 0) {
            integer2 = civ7NarrativeStory_Yield_Rewards0.progressionYieldValue;
        }
        return civ7NarrativeStory_Yield_Rewards0.copy(s, integer0, integer1, integer2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7NarrativeStory_Yield_Rewards)) {
            return false;
        }
        if(!j.a(this.type, ((Civ7NarrativeStory_Yield_Rewards)object0).type)) {
            return false;
        }
        if(!j.a(this.diplomacyYieldValue, ((Civ7NarrativeStory_Yield_Rewards)object0).diplomacyYieldValue)) {
            return false;
        }
        return j.a(this.maintenanceYieldValue, ((Civ7NarrativeStory_Yield_Rewards)object0).maintenanceYieldValue) ? j.a(this.progressionYieldValue, ((Civ7NarrativeStory_Yield_Rewards)object0).progressionYieldValue) : false;
    }

    public final Integer getDiplomacyYieldValue() {
        return this.diplomacyYieldValue;
    }

    public final Integer getMaintenanceYieldValue() {
        return this.maintenanceYieldValue;
    }

    public final Integer getProgressionYieldValue() {
        return this.progressionYieldValue;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = this.type.hashCode();
        int v1 = 0;
        int v2 = this.diplomacyYieldValue == null ? 0 : this.diplomacyYieldValue.hashCode();
        int v3 = this.maintenanceYieldValue == null ? 0 : this.maintenanceYieldValue.hashCode();
        Integer integer0 = this.progressionYieldValue;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.i("Civ7NarrativeStory_Yield_Rewards(type=", this.type, ", diplomacyYieldValue=", this.diplomacyYieldValue, ", maintenanceYieldValue=");
        stringBuilder0.append(this.maintenanceYieldValue);
        stringBuilder0.append(", progressionYieldValue=");
        stringBuilder0.append(this.progressionYieldValue);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

