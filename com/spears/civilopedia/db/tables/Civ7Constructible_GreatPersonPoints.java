package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Constructible_GreatPersonPoints;", "", "constructibleType", "", "greatPersonClassType", "pointsPerTurn", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getConstructibleType", "()Ljava/lang/String;", "getGreatPersonClassType", "getPointsPerTurn", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Constructible_GreatPersonPoints {
    private final String constructibleType;
    private final String greatPersonClassType;
    private final int pointsPerTurn;

    public Civ7Constructible_GreatPersonPoints(String s, String s1, int v) {
        j.f(s, "constructibleType");
        j.f(s1, "greatPersonClassType");
        super();
        this.constructibleType = s;
        this.greatPersonClassType = s1;
        this.pointsPerTurn = v;
    }

    public final String component1() {
        return this.constructibleType;
    }

    public final String component2() {
        return this.greatPersonClassType;
    }

    public final int component3() {
        return this.pointsPerTurn;
    }

    public final Civ7Constructible_GreatPersonPoints copy(String s, String s1, int v) {
        j.f(s, "constructibleType");
        j.f(s1, "greatPersonClassType");
        return new Civ7Constructible_GreatPersonPoints(s, s1, v);
    }

    public static Civ7Constructible_GreatPersonPoints copy$default(Civ7Constructible_GreatPersonPoints civ7Constructible_GreatPersonPoints0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7Constructible_GreatPersonPoints0.constructibleType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7Constructible_GreatPersonPoints0.greatPersonClassType;
        }
        if((v1 & 4) != 0) {
            v = civ7Constructible_GreatPersonPoints0.pointsPerTurn;
        }
        return civ7Constructible_GreatPersonPoints0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Constructible_GreatPersonPoints)) {
            return false;
        }
        if(!j.a(this.constructibleType, ((Civ7Constructible_GreatPersonPoints)object0).constructibleType)) {
            return false;
        }
        return j.a(this.greatPersonClassType, ((Civ7Constructible_GreatPersonPoints)object0).greatPersonClassType) ? this.pointsPerTurn == ((Civ7Constructible_GreatPersonPoints)object0).pointsPerTurn : false;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final String getGreatPersonClassType() {
        return this.greatPersonClassType;
    }

    public final int getPointsPerTurn() {
        return this.pointsPerTurn;
    }

    @Override
    public int hashCode() {
        return f.b(this.constructibleType.hashCode() * 0x1F, 0x1F, this.greatPersonClassType) + this.pointsPerTurn;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ7Constructible_GreatPersonPoints(constructibleType=", this.constructibleType, ", greatPersonClassType=", this.greatPersonClassType, ", pointsPerTurn="), this.pointsPerTurn, ")");
    }
}

