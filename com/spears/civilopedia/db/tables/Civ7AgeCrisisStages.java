package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\u0005¢\u0006\u0002\u0010\u000BJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001A\u00020\tHÆ\u0003J\t\u0010\u001A\u001A\u00020\u0005HÆ\u0003JE\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u001C\u001A\u00020\t2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001E\u001A\u00020\u0005HÖ\u0001J\t\u0010\u001F\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000F¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeCrisisStages;", "", "ageCrisisEventType", "", "stage", "", "ageProgressEndPercent", "ageProgressTriggerPercent", "finalStage", "", "minDuration", "(Ljava/lang/String;IIIZI)V", "getAgeCrisisEventType", "()Ljava/lang/String;", "getAgeProgressEndPercent", "()I", "getAgeProgressTriggerPercent", "getFinalStage", "()Z", "getMinDuration", "getStage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeCrisisStages {
    private final String ageCrisisEventType;
    private final int ageProgressEndPercent;
    private final int ageProgressTriggerPercent;
    private final boolean finalStage;
    private final int minDuration;
    private final int stage;

    public Civ7AgeCrisisStages(String s, int v, int v1, int v2, boolean z, int v3) {
        j.f(s, "ageCrisisEventType");
        super();
        this.ageCrisisEventType = s;
        this.stage = v;
        this.ageProgressEndPercent = v1;
        this.ageProgressTriggerPercent = v2;
        this.finalStage = z;
        this.minDuration = v3;
    }

    public final String component1() {
        return this.ageCrisisEventType;
    }

    public final int component2() {
        return this.stage;
    }

    public final int component3() {
        return this.ageProgressEndPercent;
    }

    public final int component4() {
        return this.ageProgressTriggerPercent;
    }

    public final boolean component5() {
        return this.finalStage;
    }

    public final int component6() {
        return this.minDuration;
    }

    public final Civ7AgeCrisisStages copy(String s, int v, int v1, int v2, boolean z, int v3) {
        j.f(s, "ageCrisisEventType");
        return new Civ7AgeCrisisStages(s, v, v1, v2, z, v3);
    }

    public static Civ7AgeCrisisStages copy$default(Civ7AgeCrisisStages civ7AgeCrisisStages0, String s, int v, int v1, int v2, boolean z, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            s = civ7AgeCrisisStages0.ageCrisisEventType;
        }
        if((v4 & 2) != 0) {
            v = civ7AgeCrisisStages0.stage;
        }
        if((v4 & 4) != 0) {
            v1 = civ7AgeCrisisStages0.ageProgressEndPercent;
        }
        if((v4 & 8) != 0) {
            v2 = civ7AgeCrisisStages0.ageProgressTriggerPercent;
        }
        if((v4 & 16) != 0) {
            z = civ7AgeCrisisStages0.finalStage;
        }
        if((v4 & 0x20) != 0) {
            v3 = civ7AgeCrisisStages0.minDuration;
        }
        return civ7AgeCrisisStages0.copy(s, v, v1, v2, z, v3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeCrisisStages)) {
            return false;
        }
        if(!j.a(this.ageCrisisEventType, ((Civ7AgeCrisisStages)object0).ageCrisisEventType)) {
            return false;
        }
        if(this.stage != ((Civ7AgeCrisisStages)object0).stage) {
            return false;
        }
        if(this.ageProgressEndPercent != ((Civ7AgeCrisisStages)object0).ageProgressEndPercent) {
            return false;
        }
        if(this.ageProgressTriggerPercent != ((Civ7AgeCrisisStages)object0).ageProgressTriggerPercent) {
            return false;
        }
        return this.finalStage == ((Civ7AgeCrisisStages)object0).finalStage ? this.minDuration == ((Civ7AgeCrisisStages)object0).minDuration : false;
    }

    public final String getAgeCrisisEventType() {
        return this.ageCrisisEventType;
    }

    public final int getAgeProgressEndPercent() {
        return this.ageProgressEndPercent;
    }

    public final int getAgeProgressTriggerPercent() {
        return this.ageProgressTriggerPercent;
    }

    public final boolean getFinalStage() {
        return this.finalStage;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final int getStage() {
        return this.stage;
    }

    @Override
    public int hashCode() {
        int v = (((this.ageCrisisEventType.hashCode() * 0x1F + this.stage) * 0x1F + this.ageProgressEndPercent) * 0x1F + this.ageProgressTriggerPercent) * 0x1F;
        return this.finalStage ? (v + 0x4CF) * 0x1F + this.minDuration : (v + 0x4D5) * 0x1F + this.minDuration;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.stage, "Civ7AgeCrisisStages(ageCrisisEventType=", this.ageCrisisEventType, ", stage=", ", ageProgressEndPercent=");
        f.q(stringBuilder0, this.ageProgressEndPercent, ", ageProgressTriggerPercent=", this.ageProgressTriggerPercent, ", finalStage=");
        stringBuilder0.append(this.finalStage);
        stringBuilder0.append(", minDuration=");
        stringBuilder0.append(this.minDuration);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

