package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00052\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7NarrativeRewardIcons;", "", "narrativeStoryType", "", "negative", "", "rewardIconType", "(Ljava/lang/String;ZLjava/lang/String;)V", "getNarrativeStoryType", "()Ljava/lang/String;", "getNegative", "()Z", "getRewardIconType", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7NarrativeRewardIcons {
    private final String narrativeStoryType;
    private final boolean negative;
    private final String rewardIconType;

    public Civ7NarrativeRewardIcons(String s, boolean z, String s1) {
        j.f(s, "narrativeStoryType");
        j.f(s1, "rewardIconType");
        super();
        this.narrativeStoryType = s;
        this.negative = z;
        this.rewardIconType = s1;
    }

    public final String component1() {
        return this.narrativeStoryType;
    }

    public final boolean component2() {
        return this.negative;
    }

    public final String component3() {
        return this.rewardIconType;
    }

    public final Civ7NarrativeRewardIcons copy(String s, boolean z, String s1) {
        j.f(s, "narrativeStoryType");
        j.f(s1, "rewardIconType");
        return new Civ7NarrativeRewardIcons(s, z, s1);
    }

    public static Civ7NarrativeRewardIcons copy$default(Civ7NarrativeRewardIcons civ7NarrativeRewardIcons0, String s, boolean z, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7NarrativeRewardIcons0.narrativeStoryType;
        }
        if((v & 2) != 0) {
            z = civ7NarrativeRewardIcons0.negative;
        }
        if((v & 4) != 0) {
            s1 = civ7NarrativeRewardIcons0.rewardIconType;
        }
        return civ7NarrativeRewardIcons0.copy(s, z, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7NarrativeRewardIcons)) {
            return false;
        }
        if(!j.a(this.narrativeStoryType, ((Civ7NarrativeRewardIcons)object0).narrativeStoryType)) {
            return false;
        }
        return this.negative == ((Civ7NarrativeRewardIcons)object0).negative ? j.a(this.rewardIconType, ((Civ7NarrativeRewardIcons)object0).rewardIconType) : false;
    }

    public final String getNarrativeStoryType() {
        return this.narrativeStoryType;
    }

    public final boolean getNegative() {
        return this.negative;
    }

    public final String getRewardIconType() {
        return this.rewardIconType;
    }

    @Override
    public int hashCode() {
        int v = this.narrativeStoryType.hashCode();
        return this.negative ? this.rewardIconType.hashCode() + (v * 0x1F + 0x4CF) * 0x1F : this.rewardIconType.hashCode() + (v * 0x1F + 0x4D5) * 0x1F;
    }

    @Override
    public String toString() {
        return e.h(u9.j("Civ7NarrativeRewardIcons(narrativeStoryType=", this.narrativeStoryType, this.negative, ", negative=", ", rewardIconType="), this.rewardIconType, ")");
    }
}

