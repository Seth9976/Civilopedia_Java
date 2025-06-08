package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000BJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000BJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000BJB\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001C\u001A\u0004\b\u001D\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001C\u001A\u0004\b\u001E\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001C\u001A\u0004\b\u001F\u0010\u000BR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001C\u001A\u0004\b \u0010\u000BR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001C\u001A\u0004\b!\u0010\u000B¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7LegacyCivilizations;", "Lo2/m;", "", "civilizationType", "adjective", "age", "fullName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7LegacyCivilizations;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCivilizationType", "getAdjective", "getAge", "getFullName", "getName", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7LegacyCivilizations implements m {
    private final String adjective;
    private final String age;
    private final String civilizationType;
    private final String fullName;
    private final String name;

    public Civ7LegacyCivilizations(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "civilizationType");
        j.f(s1, "adjective");
        j.f(s2, "age");
        j.f(s3, "fullName");
        j.f(s4, "name");
        super();
        this.civilizationType = s;
        this.adjective = s1;
        this.age = s2;
        this.fullName = s3;
        this.name = s4;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.adjective;
    }

    public final String component3() {
        return this.age;
    }

    public final String component4() {
        return this.fullName;
    }

    public final String component5() {
        return this.name;
    }

    public final Civ7LegacyCivilizations copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "civilizationType");
        j.f(s1, "adjective");
        j.f(s2, "age");
        j.f(s3, "fullName");
        j.f(s4, "name");
        return new Civ7LegacyCivilizations(s, s1, s2, s3, s4);
    }

    public static Civ7LegacyCivilizations copy$default(Civ7LegacyCivilizations civ7LegacyCivilizations0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7LegacyCivilizations0.civilizationType;
        }
        if((v & 2) != 0) {
            s1 = civ7LegacyCivilizations0.adjective;
        }
        if((v & 4) != 0) {
            s2 = civ7LegacyCivilizations0.age;
        }
        if((v & 8) != 0) {
            s3 = civ7LegacyCivilizations0.fullName;
        }
        if((v & 16) != 0) {
            s4 = civ7LegacyCivilizations0.name;
        }
        return civ7LegacyCivilizations0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7LegacyCivilizations)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civ7LegacyCivilizations)object0).civilizationType)) {
            return false;
        }
        if(!j.a(this.adjective, ((Civ7LegacyCivilizations)object0).adjective)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7LegacyCivilizations)object0).age)) {
            return false;
        }
        return j.a(this.fullName, ((Civ7LegacyCivilizations)object0).fullName) ? j.a(this.name, ((Civ7LegacyCivilizations)object0).name) : false;
    }

    public final String getAdjective() {
        return this.adjective;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + f.b(f.b(f.b(this.civilizationType.hashCode() * 0x1F, 0x1F, this.adjective), 0x1F, this.age), 0x1F, this.fullName);
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.civilizationType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7LegacyCivilizations(civilizationType=", this.civilizationType, ", adjective=", this.adjective, ", age=");
        f.t(stringBuilder0, this.age, ", fullName=", this.fullName, ", name=");
        return e.h(stringBuilder0, this.name, ")");
    }
}

