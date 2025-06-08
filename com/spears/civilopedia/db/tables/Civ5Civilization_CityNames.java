package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001F\u0010\u000B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Civilization_CityNames;", "", "civilizationType", "", "cityName", "(Ljava/lang/String;Ljava/lang/String;)V", "getCityName", "()Ljava/lang/String;", "getCivilizationType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Civilization_CityNames {
    private final String cityName;
    private final String civilizationType;

    public Civ5Civilization_CityNames(String s, String s1) {
        j.f(s1, "cityName");
        super();
        this.civilizationType = s;
        this.cityName = s1;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.cityName;
    }

    public final Civ5Civilization_CityNames copy(String s, String s1) {
        j.f(s1, "cityName");
        return new Civ5Civilization_CityNames(s, s1);
    }

    public static Civ5Civilization_CityNames copy$default(Civ5Civilization_CityNames civ5Civilization_CityNames0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Civilization_CityNames0.civilizationType;
        }
        if((v & 2) != 0) {
            s1 = civ5Civilization_CityNames0.cityName;
        }
        return civ5Civilization_CityNames0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Civilization_CityNames)) {
            return false;
        }
        return j.a(this.civilizationType, ((Civ5Civilization_CityNames)object0).civilizationType) ? j.a(this.cityName, ((Civ5Civilization_CityNames)object0).cityName) : false;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    @Override
    public int hashCode() {
        return this.civilizationType == null ? this.cityName.hashCode() : this.cityName.hashCode() + this.civilizationType.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        return f.k("Civ5Civilization_CityNames(civilizationType=", this.civilizationType, ", cityName=", this.cityName, ")");
    }
}

