package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0018\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001A\u001A\u00020\u0003HÆ\u0003JR\u0010\u001B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001A\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001CJ\u0013\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001A\u00020\u0003HÖ\u0001J\t\u0010!\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000FR\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CityNames;", "", "ID", "", "cityName", "", "civilizationType", "continentType", "leaderType", "sortIndex", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCityName", "()Ljava/lang/String;", "getCivilizationType", "getContinentType", "getLeaderType", "getSortIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/spears/civilopedia/db/tables/Civ7CityNames;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CityNames {
    private final Integer ID;
    private final String cityName;
    private final String civilizationType;
    private final String continentType;
    private final String leaderType;
    private final int sortIndex;

    public Civ7CityNames(Integer integer0, String s, String s1, String s2, String s3, int v) {
        j.f(s, "cityName");
        super();
        this.ID = integer0;
        this.cityName = s;
        this.civilizationType = s1;
        this.continentType = s2;
        this.leaderType = s3;
        this.sortIndex = v;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.cityName;
    }

    public final String component3() {
        return this.civilizationType;
    }

    public final String component4() {
        return this.continentType;
    }

    public final String component5() {
        return this.leaderType;
    }

    public final int component6() {
        return this.sortIndex;
    }

    public final Civ7CityNames copy(Integer integer0, String s, String s1, String s2, String s3, int v) {
        j.f(s, "cityName");
        return new Civ7CityNames(integer0, s, s1, s2, s3, v);
    }

    public static Civ7CityNames copy$default(Civ7CityNames civ7CityNames0, Integer integer0, String s, String s1, String s2, String s3, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            integer0 = civ7CityNames0.ID;
        }
        if((v1 & 2) != 0) {
            s = civ7CityNames0.cityName;
        }
        if((v1 & 4) != 0) {
            s1 = civ7CityNames0.civilizationType;
        }
        if((v1 & 8) != 0) {
            s2 = civ7CityNames0.continentType;
        }
        if((v1 & 16) != 0) {
            s3 = civ7CityNames0.leaderType;
        }
        if((v1 & 0x20) != 0) {
            v = civ7CityNames0.sortIndex;
        }
        return civ7CityNames0.copy(integer0, s, s1, s2, s3, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CityNames)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ7CityNames)object0).ID)) {
            return false;
        }
        if(!j.a(this.cityName, ((Civ7CityNames)object0).cityName)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civ7CityNames)object0).civilizationType)) {
            return false;
        }
        if(!j.a(this.continentType, ((Civ7CityNames)object0).continentType)) {
            return false;
        }
        return j.a(this.leaderType, ((Civ7CityNames)object0).leaderType) ? this.sortIndex == ((Civ7CityNames)object0).sortIndex : false;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getContinentType() {
        return this.continentType;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.cityName);
        int v2 = this.civilizationType == null ? 0 : this.civilizationType.hashCode();
        int v3 = this.continentType == null ? 0 : this.continentType.hashCode();
        String s = this.leaderType;
        if(s != null) {
            v = s.hashCode();
        }
        return (((v1 + v2) * 0x1F + v3) * 0x1F + v) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ7CityNames(ID=", this.ID, ", cityName=", this.cityName, ", civilizationType=");
        f.t(stringBuilder0, this.civilizationType, ", continentType=", this.continentType, ", leaderType=");
        return f.l(stringBuilder0, this.sortIndex, this.leaderType, ", sortIndex=", ")");
    }
}

