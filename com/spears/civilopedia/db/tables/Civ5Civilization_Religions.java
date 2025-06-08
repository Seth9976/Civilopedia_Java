package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Civilization_Religions;", "", "civilizationType", "", "religionType", "(Ljava/lang/String;Ljava/lang/String;)V", "getCivilizationType", "()Ljava/lang/String;", "getReligionType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Civilization_Religions {
    private final String civilizationType;
    private final String religionType;

    public Civ5Civilization_Religions(String s, String s1) {
        this.civilizationType = s;
        this.religionType = s1;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.religionType;
    }

    public final Civ5Civilization_Religions copy(String s, String s1) {
        return new Civ5Civilization_Religions(s, s1);
    }

    public static Civ5Civilization_Religions copy$default(Civ5Civilization_Religions civ5Civilization_Religions0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Civilization_Religions0.civilizationType;
        }
        if((v & 2) != 0) {
            s1 = civ5Civilization_Religions0.religionType;
        }
        return civ5Civilization_Religions0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Civilization_Religions)) {
            return false;
        }
        return j.a(this.civilizationType, ((Civ5Civilization_Religions)object0).civilizationType) ? j.a(this.religionType, ((Civ5Civilization_Religions)object0).religionType) : false;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getReligionType() {
        return this.religionType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.civilizationType == null ? 0 : this.civilizationType.hashCode();
        String s = this.religionType;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return f.k("Civ5Civilization_Religions(civilizationType=", this.civilizationType, ", religionType=", this.religionType, ")");
    }
}

