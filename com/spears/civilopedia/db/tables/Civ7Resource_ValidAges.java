package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Resource_ValidAges;", "", "ageType", "", "resourceType", "aIModifierHint", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAIModifierHint", "()Ljava/lang/String;", "getAgeType", "getResourceType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Resource_ValidAges {
    private final String aIModifierHint;
    private final String ageType;
    private final String resourceType;

    public Civ7Resource_ValidAges(String s, String s1, String s2) {
        j.f(s, "ageType");
        j.f(s1, "resourceType");
        super();
        this.ageType = s;
        this.resourceType = s1;
        this.aIModifierHint = s2;
    }

    public final String component1() {
        return this.ageType;
    }

    public final String component2() {
        return this.resourceType;
    }

    public final String component3() {
        return this.aIModifierHint;
    }

    public final Civ7Resource_ValidAges copy(String s, String s1, String s2) {
        j.f(s, "ageType");
        j.f(s1, "resourceType");
        return new Civ7Resource_ValidAges(s, s1, s2);
    }

    public static Civ7Resource_ValidAges copy$default(Civ7Resource_ValidAges civ7Resource_ValidAges0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Resource_ValidAges0.ageType;
        }
        if((v & 2) != 0) {
            s1 = civ7Resource_ValidAges0.resourceType;
        }
        if((v & 4) != 0) {
            s2 = civ7Resource_ValidAges0.aIModifierHint;
        }
        return civ7Resource_ValidAges0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Resource_ValidAges)) {
            return false;
        }
        if(!j.a(this.ageType, ((Civ7Resource_ValidAges)object0).ageType)) {
            return false;
        }
        return j.a(this.resourceType, ((Civ7Resource_ValidAges)object0).resourceType) ? j.a(this.aIModifierHint, ((Civ7Resource_ValidAges)object0).aIModifierHint) : false;
    }

    public final String getAIModifierHint() {
        return this.aIModifierHint;
    }

    public final String getAgeType() {
        return this.ageType;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.ageType.hashCode() * 0x1F, 0x1F, this.resourceType);
        return this.aIModifierHint == null ? v : v + this.aIModifierHint.hashCode();
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7Resource_ValidAges(ageType=", this.ageType, ", resourceType=", this.resourceType, ", aIModifierHint="), this.aIModifierHint, ")");
    }
}

