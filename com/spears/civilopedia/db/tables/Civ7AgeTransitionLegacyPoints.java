package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeTransitionLegacyPoints;", "", "age", "", "amount", "", "pointType", "unlock", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAge", "()Ljava/lang/String;", "getAmount", "()I", "getPointType", "getUnlock", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeTransitionLegacyPoints {
    private final String age;
    private final int amount;
    private final String pointType;
    private final String unlock;

    public Civ7AgeTransitionLegacyPoints(String s, int v, String s1, String s2) {
        j.f(s, "age");
        j.f(s1, "pointType");
        super();
        this.age = s;
        this.amount = v;
        this.pointType = s1;
        this.unlock = s2;
    }

    public final String component1() {
        return this.age;
    }

    public final int component2() {
        return this.amount;
    }

    public final String component3() {
        return this.pointType;
    }

    public final String component4() {
        return this.unlock;
    }

    public final Civ7AgeTransitionLegacyPoints copy(String s, int v, String s1, String s2) {
        j.f(s, "age");
        j.f(s1, "pointType");
        return new Civ7AgeTransitionLegacyPoints(s, v, s1, s2);
    }

    public static Civ7AgeTransitionLegacyPoints copy$default(Civ7AgeTransitionLegacyPoints civ7AgeTransitionLegacyPoints0, String s, int v, String s1, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7AgeTransitionLegacyPoints0.age;
        }
        if((v1 & 2) != 0) {
            v = civ7AgeTransitionLegacyPoints0.amount;
        }
        if((v1 & 4) != 0) {
            s1 = civ7AgeTransitionLegacyPoints0.pointType;
        }
        if((v1 & 8) != 0) {
            s2 = civ7AgeTransitionLegacyPoints0.unlock;
        }
        return civ7AgeTransitionLegacyPoints0.copy(s, v, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeTransitionLegacyPoints)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7AgeTransitionLegacyPoints)object0).age)) {
            return false;
        }
        if(this.amount != ((Civ7AgeTransitionLegacyPoints)object0).amount) {
            return false;
        }
        return j.a(this.pointType, ((Civ7AgeTransitionLegacyPoints)object0).pointType) ? j.a(this.unlock, ((Civ7AgeTransitionLegacyPoints)object0).unlock) : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getPointType() {
        return this.pointType;
    }

    public final String getUnlock() {
        return this.unlock;
    }

    @Override
    public int hashCode() {
        int v = f.b((this.age.hashCode() * 0x1F + this.amount) * 0x1F, 0x1F, this.pointType);
        return this.unlock == null ? v : v + this.unlock.hashCode();
    }

    @Override
    public String toString() {
        return e.i(f.m(this.amount, "Civ7AgeTransitionLegacyPoints(age=", this.age, ", amount=", ", pointType="), this.pointType, ", unlock=", this.unlock, ")");
    }
}

