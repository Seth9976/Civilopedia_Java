package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u001B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u000BJ\t\u0010\u0015\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u0016\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u0017\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003J_\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u0003H\u00C6\u0001J\u0013\u0010\u001E\u001A\u00020\u001F2\b\u0010 \u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010!\u001A\u00020\"H\u00D6\u0001J\t\u0010#\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\r\u00A8\u0006$"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Quests;", "", "questType", "", "description", "iconString", "instanceDescription", "instanceName", "instanceReward", "name", "reward", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getIconString", "getInstanceDescription", "getInstanceName", "getInstanceReward", "getName", "getQuestType", "getReward", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Quests {
    private final String description;
    private final String iconString;
    private final String instanceDescription;
    private final String instanceName;
    private final String instanceReward;
    private final String name;
    private final String questType;
    private final String reward;

    public Civ7Quests(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
        j.f(s, "questType");
        j.f(s1, "description");
        j.f(s2, "iconString");
        j.f(s6, "name");
        j.f(s7, "reward");
        super();
        this.questType = s;
        this.description = s1;
        this.iconString = s2;
        this.instanceDescription = s3;
        this.instanceName = s4;
        this.instanceReward = s5;
        this.name = s6;
        this.reward = s7;
    }

    public final String component1() {
        return this.questType;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.iconString;
    }

    public final String component4() {
        return this.instanceDescription;
    }

    public final String component5() {
        return this.instanceName;
    }

    public final String component6() {
        return this.instanceReward;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.reward;
    }

    public final Civ7Quests copy(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
        j.f(s, "questType");
        j.f(s1, "description");
        j.f(s2, "iconString");
        j.f(s6, "name");
        j.f(s7, "reward");
        return new Civ7Quests(s, s1, s2, s3, s4, s5, s6, s7);
    }

    public static Civ7Quests copy$default(Civ7Quests civ7Quests0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, Object object0) {
        String s8 = (v & 1) == 0 ? s : civ7Quests0.questType;
        String s9 = (v & 2) == 0 ? s1 : civ7Quests0.description;
        String s10 = (v & 4) == 0 ? s2 : civ7Quests0.iconString;
        String s11 = (v & 8) == 0 ? s3 : civ7Quests0.instanceDescription;
        String s12 = (v & 16) == 0 ? s4 : civ7Quests0.instanceName;
        String s13 = (v & 0x20) == 0 ? s5 : civ7Quests0.instanceReward;
        String s14 = (v & 0x40) == 0 ? s6 : civ7Quests0.name;
        return (v & 0x80) == 0 ? civ7Quests0.copy(s8, s9, s10, s11, s12, s13, s14, s7) : civ7Quests0.copy(s8, s9, s10, s11, s12, s13, s14, civ7Quests0.reward);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Quests)) {
            return false;
        }
        if(!j.a(this.questType, ((Civ7Quests)object0).questType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7Quests)object0).description)) {
            return false;
        }
        if(!j.a(this.iconString, ((Civ7Quests)object0).iconString)) {
            return false;
        }
        if(!j.a(this.instanceDescription, ((Civ7Quests)object0).instanceDescription)) {
            return false;
        }
        if(!j.a(this.instanceName, ((Civ7Quests)object0).instanceName)) {
            return false;
        }
        if(!j.a(this.instanceReward, ((Civ7Quests)object0).instanceReward)) {
            return false;
        }
        return j.a(this.name, ((Civ7Quests)object0).name) ? j.a(this.reward, ((Civ7Quests)object0).reward) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconString() {
        return this.iconString;
    }

    public final String getInstanceDescription() {
        return this.instanceDescription;
    }

    public final String getInstanceName() {
        return this.instanceName;
    }

    public final String getInstanceReward() {
        return this.instanceReward;
    }

    public final String getName() {
        return this.name;
    }

    public final String getQuestType() {
        return this.questType;
    }

    public final String getReward() {
        return this.reward;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.questType.hashCode() * 0x1F, 0x1F, this.description), 0x1F, this.iconString);
        int v1 = 0;
        int v2 = this.instanceDescription == null ? 0 : this.instanceDescription.hashCode();
        int v3 = this.instanceName == null ? 0 : this.instanceName.hashCode();
        String s = this.instanceReward;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.reward.hashCode() + f.b((((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F, 0x1F, this.name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Quests(questType=", this.questType, ", description=", this.description, ", iconString=");
        f.t(stringBuilder0, this.iconString, ", instanceDescription=", this.instanceDescription, ", instanceName=");
        f.t(stringBuilder0, this.instanceName, ", instanceReward=", this.instanceReward, ", name=");
        return e.i(stringBuilder0, this.name, ", reward=", this.reward, ")");
    }
}

