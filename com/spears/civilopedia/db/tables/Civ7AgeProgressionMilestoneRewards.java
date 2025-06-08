package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0006HÆ\u0003J\'\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001A\u00020\u00062\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u000B¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeProgressionMilestoneRewards;", "", "ageProgressionMilestoneType", "", "ageProgressionRewardType", "isImmediate", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAgeProgressionMilestoneType", "()Ljava/lang/String;", "getAgeProgressionRewardType", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeProgressionMilestoneRewards {
    private final String ageProgressionMilestoneType;
    private final String ageProgressionRewardType;
    private final boolean isImmediate;

    public Civ7AgeProgressionMilestoneRewards(String s, String s1, boolean z) {
        j.f(s, "ageProgressionMilestoneType");
        j.f(s1, "ageProgressionRewardType");
        super();
        this.ageProgressionMilestoneType = s;
        this.ageProgressionRewardType = s1;
        this.isImmediate = z;
    }

    public final String component1() {
        return this.ageProgressionMilestoneType;
    }

    public final String component2() {
        return this.ageProgressionRewardType;
    }

    public final boolean component3() {
        return this.isImmediate;
    }

    public final Civ7AgeProgressionMilestoneRewards copy(String s, String s1, boolean z) {
        j.f(s, "ageProgressionMilestoneType");
        j.f(s1, "ageProgressionRewardType");
        return new Civ7AgeProgressionMilestoneRewards(s, s1, z);
    }

    public static Civ7AgeProgressionMilestoneRewards copy$default(Civ7AgeProgressionMilestoneRewards civ7AgeProgressionMilestoneRewards0, String s, String s1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AgeProgressionMilestoneRewards0.ageProgressionMilestoneType;
        }
        if((v & 2) != 0) {
            s1 = civ7AgeProgressionMilestoneRewards0.ageProgressionRewardType;
        }
        if((v & 4) != 0) {
            z = civ7AgeProgressionMilestoneRewards0.isImmediate;
        }
        return civ7AgeProgressionMilestoneRewards0.copy(s, s1, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeProgressionMilestoneRewards)) {
            return false;
        }
        if(!j.a(this.ageProgressionMilestoneType, ((Civ7AgeProgressionMilestoneRewards)object0).ageProgressionMilestoneType)) {
            return false;
        }
        return j.a(this.ageProgressionRewardType, ((Civ7AgeProgressionMilestoneRewards)object0).ageProgressionRewardType) ? this.isImmediate == ((Civ7AgeProgressionMilestoneRewards)object0).isImmediate : false;
    }

    public final String getAgeProgressionMilestoneType() {
        return this.ageProgressionMilestoneType;
    }

    public final String getAgeProgressionRewardType() {
        return this.ageProgressionRewardType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.ageProgressionMilestoneType.hashCode() * 0x1F, 0x1F, this.ageProgressionRewardType);
        return this.isImmediate ? v + 0x4CF : v + 0x4D5;
    }

    public final boolean isImmediate() {
        return this.isImmediate;
    }

    @Override
    public String toString() {
        return u9.g(e.j("Civ7AgeProgressionMilestoneRewards(ageProgressionMilestoneType=", this.ageProgressionMilestoneType, ", ageProgressionRewardType=", this.ageProgressionRewardType, ", isImmediate="), this.isImmediate, ")");
    }
}

