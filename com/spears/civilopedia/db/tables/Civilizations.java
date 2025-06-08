package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0012\u0010\u0011\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u000EJ\u0010\u0010\u0013\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000EJ\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u000EJZ\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00022\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u000EJ\u0010\u0010\u001A\u001A\u00020\u0007H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0014J\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010 \u001A\u0004\b!\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010 \u001A\u0004\b\"\u0010\u000ER\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010 \u001A\u0004\b#\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010 \u001A\u0004\b$\u0010\u000ER\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b\b\u0010%\u001A\u0004\b&\u0010\u0014R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010 \u001A\u0004\b\'\u0010\u000ER\u0019\u0010\n\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010 \u001A\u0004\b(\u0010\u000E\u00A8\u0006)"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civilizations;", "Lo2/m;", "", "civilizationType", "name", "description", "adjective", "", "randomCityNameDepth", "startingCivilizationLevelType", "ethnicity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()I", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civilizations;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCivilizationType", "getName", "getDescription", "getAdjective", "I", "getRandomCityNameDepth", "getStartingCivilizationLevelType", "getEthnicity", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civilizations implements m {
    private final String adjective;
    private final String civilizationType;
    private final String description;
    private final String ethnicity;
    private final String name;
    private final int randomCityNameDepth;
    private final String startingCivilizationLevelType;

    public Civilizations(String s, String s1, String s2, String s3, int v, String s4, String s5) {
        j.f(s, "civilizationType");
        j.f(s1, "name");
        j.f(s3, "adjective");
        j.f(s4, "startingCivilizationLevelType");
        super();
        this.civilizationType = s;
        this.name = s1;
        this.description = s2;
        this.adjective = s3;
        this.randomCityNameDepth = v;
        this.startingCivilizationLevelType = s4;
        this.ethnicity = s5;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.adjective;
    }

    public final int component5() {
        return this.randomCityNameDepth;
    }

    public final String component6() {
        return this.startingCivilizationLevelType;
    }

    public final String component7() {
        return this.ethnicity;
    }

    public final Civilizations copy(String s, String s1, String s2, String s3, int v, String s4, String s5) {
        j.f(s, "civilizationType");
        j.f(s1, "name");
        j.f(s3, "adjective");
        j.f(s4, "startingCivilizationLevelType");
        return new Civilizations(s, s1, s2, s3, v, s4, s5);
    }

    public static Civilizations copy$default(Civilizations civilizations0, String s, String s1, String s2, String s3, int v, String s4, String s5, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civilizations0.civilizationType;
        }
        if((v1 & 2) != 0) {
            s1 = civilizations0.name;
        }
        if((v1 & 4) != 0) {
            s2 = civilizations0.description;
        }
        if((v1 & 8) != 0) {
            s3 = civilizations0.adjective;
        }
        if((v1 & 16) != 0) {
            v = civilizations0.randomCityNameDepth;
        }
        if((v1 & 0x20) != 0) {
            s4 = civilizations0.startingCivilizationLevelType;
        }
        if((v1 & 0x40) != 0) {
            s5 = civilizations0.ethnicity;
        }
        return civilizations0.copy(s, s1, s2, s3, v, s4, s5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civilizations)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civilizations)object0).civilizationType)) {
            return false;
        }
        if(!j.a(this.name, ((Civilizations)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((Civilizations)object0).description)) {
            return false;
        }
        if(!j.a(this.adjective, ((Civilizations)object0).adjective)) {
            return false;
        }
        if(this.randomCityNameDepth != ((Civilizations)object0).randomCityNameDepth) {
            return false;
        }
        return j.a(this.startingCivilizationLevelType, ((Civilizations)object0).startingCivilizationLevelType) ? j.a(this.ethnicity, ((Civilizations)object0).ethnicity) : false;
    }

    public final String getAdjective() {
        return this.adjective;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEthnicity() {
        return this.ethnicity;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRandomCityNameDepth() {
        return this.randomCityNameDepth;
    }

    public final String getStartingCivilizationLevelType() {
        return this.startingCivilizationLevelType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((f.b((f.b(this.civilizationType.hashCode() * 0x1F, 0x1F, this.name) + (this.description == null ? 0 : this.description.hashCode())) * 0x1F, 0x1F, this.adjective) + this.randomCityNameDepth) * 0x1F, 0x1F, this.startingCivilizationLevelType);
        String s = this.ethnicity;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.civilizationType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civilizations(civilizationType=", this.civilizationType, ", name=", this.name, ", description=");
        f.t(stringBuilder0, this.description, ", adjective=", this.adjective, ", randomCityNameDepth=");
        f.r(stringBuilder0, this.randomCityNameDepth, ", startingCivilizationLevelType=", this.startingCivilizationLevelType, ", ethnicity=");
        return e.h(stringBuilder0, this.ethnicity, ")");
    }
}

