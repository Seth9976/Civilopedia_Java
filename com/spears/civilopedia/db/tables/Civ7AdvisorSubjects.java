package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AdvisorSubjects;", "", "advisorType", "", "advisoryClassType", "advisorySubjectType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvisorType", "()Ljava/lang/String;", "getAdvisoryClassType", "getAdvisorySubjectType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AdvisorSubjects {
    private final String advisorType;
    private final String advisoryClassType;
    private final String advisorySubjectType;

    public Civ7AdvisorSubjects(String s, String s1, String s2) {
        j.f(s, "advisorType");
        j.f(s1, "advisoryClassType");
        j.f(s2, "advisorySubjectType");
        super();
        this.advisorType = s;
        this.advisoryClassType = s1;
        this.advisorySubjectType = s2;
    }

    public final String component1() {
        return this.advisorType;
    }

    public final String component2() {
        return this.advisoryClassType;
    }

    public final String component3() {
        return this.advisorySubjectType;
    }

    public final Civ7AdvisorSubjects copy(String s, String s1, String s2) {
        j.f(s, "advisorType");
        j.f(s1, "advisoryClassType");
        j.f(s2, "advisorySubjectType");
        return new Civ7AdvisorSubjects(s, s1, s2);
    }

    public static Civ7AdvisorSubjects copy$default(Civ7AdvisorSubjects civ7AdvisorSubjects0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AdvisorSubjects0.advisorType;
        }
        if((v & 2) != 0) {
            s1 = civ7AdvisorSubjects0.advisoryClassType;
        }
        if((v & 4) != 0) {
            s2 = civ7AdvisorSubjects0.advisorySubjectType;
        }
        return civ7AdvisorSubjects0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AdvisorSubjects)) {
            return false;
        }
        if(!j.a(this.advisorType, ((Civ7AdvisorSubjects)object0).advisorType)) {
            return false;
        }
        return j.a(this.advisoryClassType, ((Civ7AdvisorSubjects)object0).advisoryClassType) ? j.a(this.advisorySubjectType, ((Civ7AdvisorSubjects)object0).advisorySubjectType) : false;
    }

    public final String getAdvisorType() {
        return this.advisorType;
    }

    public final String getAdvisoryClassType() {
        return this.advisoryClassType;
    }

    public final String getAdvisorySubjectType() {
        return this.advisorySubjectType;
    }

    @Override
    public int hashCode() {
        return this.advisorySubjectType.hashCode() + f.b(this.advisorType.hashCode() * 0x1F, 0x1F, this.advisoryClassType);
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7AdvisorSubjects(advisorType=", this.advisorType, ", advisoryClassType=", this.advisoryClassType, ", advisorySubjectType="), this.advisorySubjectType, ")");
    }
}

