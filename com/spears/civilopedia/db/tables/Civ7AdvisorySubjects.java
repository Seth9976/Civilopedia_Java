package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AdvisorySubjects;", "", "advisorySubjectType", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvisorySubjectType", "()Ljava/lang/String;", "getDescription", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AdvisorySubjects {
    private final String advisorySubjectType;
    private final String description;
    private final String name;

    public Civ7AdvisorySubjects(String s, String s1, String s2) {
        j.f(s, "advisorySubjectType");
        super();
        this.advisorySubjectType = s;
        this.description = s1;
        this.name = s2;
    }

    public final String component1() {
        return this.advisorySubjectType;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.name;
    }

    public final Civ7AdvisorySubjects copy(String s, String s1, String s2) {
        j.f(s, "advisorySubjectType");
        return new Civ7AdvisorySubjects(s, s1, s2);
    }

    public static Civ7AdvisorySubjects copy$default(Civ7AdvisorySubjects civ7AdvisorySubjects0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AdvisorySubjects0.advisorySubjectType;
        }
        if((v & 2) != 0) {
            s1 = civ7AdvisorySubjects0.description;
        }
        if((v & 4) != 0) {
            s2 = civ7AdvisorySubjects0.name;
        }
        return civ7AdvisorySubjects0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AdvisorySubjects)) {
            return false;
        }
        if(!j.a(this.advisorySubjectType, ((Civ7AdvisorySubjects)object0).advisorySubjectType)) {
            return false;
        }
        return j.a(this.description, ((Civ7AdvisorySubjects)object0).description) ? j.a(this.name, ((Civ7AdvisorySubjects)object0).name) : false;
    }

    public final String getAdvisorySubjectType() {
        return this.advisorySubjectType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = this.advisorySubjectType.hashCode();
        int v1 = 0;
        int v2 = this.description == null ? 0 : this.description.hashCode();
        String s = this.name;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7AdvisorySubjects(advisorySubjectType=", this.advisorySubjectType, ", description=", this.description, ", name="), this.name, ")");
    }
}

