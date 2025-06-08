package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000BJ\u0010\u0010\u000E\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000FJ8\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0014\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000FJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001A\u001A\u0004\b\u001C\u0010\u000BR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001D\u001A\u0004\b\u001E\u0010\u000FR\u0017\u0010\u0007\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001D\u001A\u0004\b\u001F\u0010\u000F¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/BeliefClasses;", "Lo2/m;", "", "beliefClassType", "name", "", "maxInReligion", "adoptionOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;II)Lcom/spears/civilopedia/db/tables/BeliefClasses;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBeliefClassType", "getName", "I", "getMaxInReligion", "getAdoptionOrder", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BeliefClasses implements m {
    private final int adoptionOrder;
    private final String beliefClassType;
    private final int maxInReligion;
    private final String name;

    public BeliefClasses(String s, String s1, int v, int v1) {
        j.f(s, "beliefClassType");
        j.f(s1, "name");
        super();
        this.beliefClassType = s;
        this.name = s1;
        this.maxInReligion = v;
        this.adoptionOrder = v1;
    }

    public final String component1() {
        return this.beliefClassType;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.maxInReligion;
    }

    public final int component4() {
        return this.adoptionOrder;
    }

    public final BeliefClasses copy(String s, String s1, int v, int v1) {
        j.f(s, "beliefClassType");
        j.f(s1, "name");
        return new BeliefClasses(s, s1, v, v1);
    }

    public static BeliefClasses copy$default(BeliefClasses beliefClasses0, String s, String s1, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = beliefClasses0.beliefClassType;
        }
        if((v2 & 2) != 0) {
            s1 = beliefClasses0.name;
        }
        if((v2 & 4) != 0) {
            v = beliefClasses0.maxInReligion;
        }
        if((v2 & 8) != 0) {
            v1 = beliefClasses0.adoptionOrder;
        }
        return beliefClasses0.copy(s, s1, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BeliefClasses)) {
            return false;
        }
        if(!j.a(this.beliefClassType, ((BeliefClasses)object0).beliefClassType)) {
            return false;
        }
        if(!j.a(this.name, ((BeliefClasses)object0).name)) {
            return false;
        }
        return this.maxInReligion == ((BeliefClasses)object0).maxInReligion ? this.adoptionOrder == ((BeliefClasses)object0).adoptionOrder : false;
    }

    public final int getAdoptionOrder() {
        return this.adoptionOrder;
    }

    public final String getBeliefClassType() {
        return this.beliefClassType;
    }

    public final int getMaxInReligion() {
        return this.maxInReligion;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return (f.b(this.beliefClassType.hashCode() * 0x1F, 0x1F, this.name) + this.maxInReligion) * 0x1F + this.adoptionOrder;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.beliefClassType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("BeliefClasses(beliefClassType=", this.beliefClassType, ", name=", this.name, ", maxInReligion=");
        stringBuilder0.append(this.maxInReligion);
        stringBuilder0.append(", adoptionOrder=");
        stringBuilder0.append(this.adoptionOrder);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

