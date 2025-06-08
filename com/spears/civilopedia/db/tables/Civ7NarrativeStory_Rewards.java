package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00072\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7NarrativeStory_Rewards;", "", "narrativeRewardType", "", "narrativeStoryType", "activation", "bonusEligible", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getActivation", "()Ljava/lang/String;", "getBonusEligible", "()Z", "getNarrativeRewardType", "getNarrativeStoryType", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7NarrativeStory_Rewards {
    private final String activation;
    private final boolean bonusEligible;
    private final String narrativeRewardType;
    private final String narrativeStoryType;

    public Civ7NarrativeStory_Rewards(String s, String s1, String s2, boolean z) {
        j.f(s, "narrativeRewardType");
        j.f(s1, "narrativeStoryType");
        j.f(s2, "activation");
        super();
        this.narrativeRewardType = s;
        this.narrativeStoryType = s1;
        this.activation = s2;
        this.bonusEligible = z;
    }

    public final String component1() {
        return this.narrativeRewardType;
    }

    public final String component2() {
        return this.narrativeStoryType;
    }

    public final String component3() {
        return this.activation;
    }

    public final boolean component4() {
        return this.bonusEligible;
    }

    public final Civ7NarrativeStory_Rewards copy(String s, String s1, String s2, boolean z) {
        j.f(s, "narrativeRewardType");
        j.f(s1, "narrativeStoryType");
        j.f(s2, "activation");
        return new Civ7NarrativeStory_Rewards(s, s1, s2, z);
    }

    public static Civ7NarrativeStory_Rewards copy$default(Civ7NarrativeStory_Rewards civ7NarrativeStory_Rewards0, String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7NarrativeStory_Rewards0.narrativeRewardType;
        }
        if((v & 2) != 0) {
            s1 = civ7NarrativeStory_Rewards0.narrativeStoryType;
        }
        if((v & 4) != 0) {
            s2 = civ7NarrativeStory_Rewards0.activation;
        }
        if((v & 8) != 0) {
            z = civ7NarrativeStory_Rewards0.bonusEligible;
        }
        return civ7NarrativeStory_Rewards0.copy(s, s1, s2, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7NarrativeStory_Rewards)) {
            return false;
        }
        if(!j.a(this.narrativeRewardType, ((Civ7NarrativeStory_Rewards)object0).narrativeRewardType)) {
            return false;
        }
        if(!j.a(this.narrativeStoryType, ((Civ7NarrativeStory_Rewards)object0).narrativeStoryType)) {
            return false;
        }
        return j.a(this.activation, ((Civ7NarrativeStory_Rewards)object0).activation) ? this.bonusEligible == ((Civ7NarrativeStory_Rewards)object0).bonusEligible : false;
    }

    public final String getActivation() {
        return this.activation;
    }

    public final boolean getBonusEligible() {
        return this.bonusEligible;
    }

    public final String getNarrativeRewardType() {
        return this.narrativeRewardType;
    }

    public final String getNarrativeStoryType() {
        return this.narrativeStoryType;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.narrativeRewardType.hashCode() * 0x1F, 0x1F, this.narrativeStoryType), 0x1F, this.activation);
        return this.bonusEligible ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7NarrativeStory_Rewards(narrativeRewardType=", this.narrativeRewardType, ", narrativeStoryType=", this.narrativeStoryType, ", activation=");
        stringBuilder0.append(this.activation);
        stringBuilder0.append(", bonusEligible=");
        stringBuilder0.append(this.bonusEligible);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

