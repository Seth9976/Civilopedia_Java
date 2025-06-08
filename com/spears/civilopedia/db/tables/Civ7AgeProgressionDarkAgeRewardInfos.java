package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeProgressionDarkAgeRewardInfos;", "", "description", "", "icon", "legacyPathType", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getIcon", "getLegacyPathType", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeProgressionDarkAgeRewardInfos {
    private final String description;
    private final String icon;
    private final String legacyPathType;
    private final String name;

    public Civ7AgeProgressionDarkAgeRewardInfos(String s, String s1, String s2, String s3) {
        j.f(s2, "legacyPathType");
        super();
        this.description = s;
        this.icon = s1;
        this.legacyPathType = s2;
        this.name = s3;
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.icon;
    }

    public final String component3() {
        return this.legacyPathType;
    }

    public final String component4() {
        return this.name;
    }

    public final Civ7AgeProgressionDarkAgeRewardInfos copy(String s, String s1, String s2, String s3) {
        j.f(s2, "legacyPathType");
        return new Civ7AgeProgressionDarkAgeRewardInfos(s, s1, s2, s3);
    }

    public static Civ7AgeProgressionDarkAgeRewardInfos copy$default(Civ7AgeProgressionDarkAgeRewardInfos civ7AgeProgressionDarkAgeRewardInfos0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AgeProgressionDarkAgeRewardInfos0.description;
        }
        if((v & 2) != 0) {
            s1 = civ7AgeProgressionDarkAgeRewardInfos0.icon;
        }
        if((v & 4) != 0) {
            s2 = civ7AgeProgressionDarkAgeRewardInfos0.legacyPathType;
        }
        if((v & 8) != 0) {
            s3 = civ7AgeProgressionDarkAgeRewardInfos0.name;
        }
        return civ7AgeProgressionDarkAgeRewardInfos0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeProgressionDarkAgeRewardInfos)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7AgeProgressionDarkAgeRewardInfos)object0).description)) {
            return false;
        }
        if(!j.a(this.icon, ((Civ7AgeProgressionDarkAgeRewardInfos)object0).icon)) {
            return false;
        }
        return j.a(this.legacyPathType, ((Civ7AgeProgressionDarkAgeRewardInfos)object0).legacyPathType) ? j.a(this.name, ((Civ7AgeProgressionDarkAgeRewardInfos)object0).name) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLegacyPathType() {
        return this.legacyPathType;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(((this.description == null ? 0 : this.description.hashCode()) * 0x1F + (this.icon == null ? 0 : this.icon.hashCode())) * 0x1F, 0x1F, this.legacyPathType);
        String s = this.name;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ7AgeProgressionDarkAgeRewardInfos(description=", this.description, ", icon=", this.icon, ", legacyPathType="), this.legacyPathType, ", name=", this.name, ")");
    }
}

