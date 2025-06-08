package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\u0010\n\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000BJ\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001A\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001B\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001C\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJV\u0010\u001D\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001EJ\u0013\u0010\u001F\u001A\u00020 2\b\u0010!\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001A\u00020\u0005HÖ\u0001J\t\u0010#\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u000F\u0010\u0010R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\u0012\u0010\rR\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u0013\u0010\u0010R\u0015\u0010\n\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\u0014\u0010\rR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Audio_SoundScapes;", "", "scriptID", "", "minVolume", "", "maxVolume", "minGridDistance", "", "maxGridDistance", "priority", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getMaxGridDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxVolume", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinGridDistance", "getMinVolume", "getPriority", "getScriptID", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Civ5Audio_SoundScapes;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Audio_SoundScapes {
    private final Double maxGridDistance;
    private final Integer maxVolume;
    private final Double minGridDistance;
    private final Integer minVolume;
    private final Double priority;
    private final String scriptID;

    public Civ5Audio_SoundScapes(String s, Integer integer0, Integer integer1, Double double0, Double double1, Double double2) {
        this.scriptID = s;
        this.minVolume = integer0;
        this.maxVolume = integer1;
        this.minGridDistance = double0;
        this.maxGridDistance = double1;
        this.priority = double2;
    }

    public final String component1() {
        return this.scriptID;
    }

    public final Integer component2() {
        return this.minVolume;
    }

    public final Integer component3() {
        return this.maxVolume;
    }

    public final Double component4() {
        return this.minGridDistance;
    }

    public final Double component5() {
        return this.maxGridDistance;
    }

    public final Double component6() {
        return this.priority;
    }

    public final Civ5Audio_SoundScapes copy(String s, Integer integer0, Integer integer1, Double double0, Double double1, Double double2) {
        return new Civ5Audio_SoundScapes(s, integer0, integer1, double0, double1, double2);
    }

    public static Civ5Audio_SoundScapes copy$default(Civ5Audio_SoundScapes civ5Audio_SoundScapes0, String s, Integer integer0, Integer integer1, Double double0, Double double1, Double double2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Audio_SoundScapes0.scriptID;
        }
        if((v & 2) != 0) {
            integer0 = civ5Audio_SoundScapes0.minVolume;
        }
        if((v & 4) != 0) {
            integer1 = civ5Audio_SoundScapes0.maxVolume;
        }
        if((v & 8) != 0) {
            double0 = civ5Audio_SoundScapes0.minGridDistance;
        }
        if((v & 16) != 0) {
            double1 = civ5Audio_SoundScapes0.maxGridDistance;
        }
        if((v & 0x20) != 0) {
            double2 = civ5Audio_SoundScapes0.priority;
        }
        return civ5Audio_SoundScapes0.copy(s, integer0, integer1, double0, double1, double2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Audio_SoundScapes)) {
            return false;
        }
        if(!j.a(this.scriptID, ((Civ5Audio_SoundScapes)object0).scriptID)) {
            return false;
        }
        if(!j.a(this.minVolume, ((Civ5Audio_SoundScapes)object0).minVolume)) {
            return false;
        }
        if(!j.a(this.maxVolume, ((Civ5Audio_SoundScapes)object0).maxVolume)) {
            return false;
        }
        if(!j.a(this.minGridDistance, ((Civ5Audio_SoundScapes)object0).minGridDistance)) {
            return false;
        }
        return j.a(this.maxGridDistance, ((Civ5Audio_SoundScapes)object0).maxGridDistance) ? j.a(this.priority, ((Civ5Audio_SoundScapes)object0).priority) : false;
    }

    public final Double getMaxGridDistance() {
        return this.maxGridDistance;
    }

    public final Integer getMaxVolume() {
        return this.maxVolume;
    }

    public final Double getMinGridDistance() {
        return this.minGridDistance;
    }

    public final Integer getMinVolume() {
        return this.minVolume;
    }

    public final Double getPriority() {
        return this.priority;
    }

    public final String getScriptID() {
        return this.scriptID;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.scriptID == null ? 0 : this.scriptID.hashCode();
        int v2 = this.minVolume == null ? 0 : this.minVolume.hashCode();
        int v3 = this.maxVolume == null ? 0 : this.maxVolume.hashCode();
        int v4 = this.minGridDistance == null ? 0 : this.minGridDistance.hashCode();
        int v5 = this.maxGridDistance == null ? 0 : this.maxGridDistance.hashCode();
        Double double0 = this.priority;
        if(double0 != null) {
            v = double0.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.i("Civ5Audio_SoundScapes(scriptID=", this.scriptID, ", minVolume=", this.minVolume, ", maxVolume=");
        stringBuilder0.append(this.maxVolume);
        stringBuilder0.append(", minGridDistance=");
        stringBuilder0.append(this.minGridDistance);
        stringBuilder0.append(", maxGridDistance=");
        stringBuilder0.append(this.maxGridDistance);
        stringBuilder0.append(", priority=");
        stringBuilder0.append(this.priority);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

