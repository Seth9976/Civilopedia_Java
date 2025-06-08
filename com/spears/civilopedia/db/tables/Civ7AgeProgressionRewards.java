package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeProgressionRewards;", "", "ageProgressionRewardType", "", "description", "icon", "modifierId", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgeProgressionRewardType", "()Ljava/lang/String;", "getDescription", "getIcon", "getModifierId", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeProgressionRewards {
    private final String ageProgressionRewardType;
    private final String description;
    private final String icon;
    private final String modifierId;
    private final String name;

    public Civ7AgeProgressionRewards(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "ageProgressionRewardType");
        j.f(s3, "modifierId");
        super();
        this.ageProgressionRewardType = s;
        this.description = s1;
        this.icon = s2;
        this.modifierId = s3;
        this.name = s4;
    }

    public final String component1() {
        return this.ageProgressionRewardType;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return this.modifierId;
    }

    public final String component5() {
        return this.name;
    }

    public final Civ7AgeProgressionRewards copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "ageProgressionRewardType");
        j.f(s3, "modifierId");
        return new Civ7AgeProgressionRewards(s, s1, s2, s3, s4);
    }

    public static Civ7AgeProgressionRewards copy$default(Civ7AgeProgressionRewards civ7AgeProgressionRewards0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AgeProgressionRewards0.ageProgressionRewardType;
        }
        if((v & 2) != 0) {
            s1 = civ7AgeProgressionRewards0.description;
        }
        if((v & 4) != 0) {
            s2 = civ7AgeProgressionRewards0.icon;
        }
        if((v & 8) != 0) {
            s3 = civ7AgeProgressionRewards0.modifierId;
        }
        if((v & 16) != 0) {
            s4 = civ7AgeProgressionRewards0.name;
        }
        return civ7AgeProgressionRewards0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeProgressionRewards)) {
            return false;
        }
        if(!j.a(this.ageProgressionRewardType, ((Civ7AgeProgressionRewards)object0).ageProgressionRewardType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7AgeProgressionRewards)object0).description)) {
            return false;
        }
        if(!j.a(this.icon, ((Civ7AgeProgressionRewards)object0).icon)) {
            return false;
        }
        return j.a(this.modifierId, ((Civ7AgeProgressionRewards)object0).modifierId) ? j.a(this.name, ((Civ7AgeProgressionRewards)object0).name) : false;
    }

    public final String getAgeProgressionRewardType() {
        return this.ageProgressionRewardType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getModifierId() {
        return this.modifierId;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(((this.ageProgressionRewardType.hashCode() * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F + (this.icon == null ? 0 : this.icon.hashCode())) * 0x1F, 0x1F, this.modifierId);
        String s = this.name;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7AgeProgressionRewards(ageProgressionRewardType=", this.ageProgressionRewardType, ", description=", this.description, ", icon=");
        f.t(stringBuilder0, this.icon, ", modifierId=", this.modifierId, ", name=");
        return e.h(stringBuilder0, this.name, ")");
    }
}

