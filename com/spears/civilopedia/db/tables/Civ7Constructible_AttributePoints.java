package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Constructible_AttributePoints;", "", "attributeType", "", "constructibleType", "points", "", "(Ljava/lang/String;Ljava/lang/String;D)V", "getAttributeType", "()Ljava/lang/String;", "getConstructibleType", "getPoints", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Constructible_AttributePoints {
    private final String attributeType;
    private final String constructibleType;
    private final double points;

    public Civ7Constructible_AttributePoints(String s, String s1, double f) {
        j.f(s, "attributeType");
        j.f(s1, "constructibleType");
        super();
        this.attributeType = s;
        this.constructibleType = s1;
        this.points = f;
    }

    public final String component1() {
        return this.attributeType;
    }

    public final String component2() {
        return this.constructibleType;
    }

    public final double component3() {
        return this.points;
    }

    public final Civ7Constructible_AttributePoints copy(String s, String s1, double f) {
        j.f(s, "attributeType");
        j.f(s1, "constructibleType");
        return new Civ7Constructible_AttributePoints(s, s1, f);
    }

    public static Civ7Constructible_AttributePoints copy$default(Civ7Constructible_AttributePoints civ7Constructible_AttributePoints0, String s, String s1, double f, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Constructible_AttributePoints0.attributeType;
        }
        if((v & 2) != 0) {
            s1 = civ7Constructible_AttributePoints0.constructibleType;
        }
        if((v & 4) != 0) {
            f = civ7Constructible_AttributePoints0.points;
        }
        return civ7Constructible_AttributePoints0.copy(s, s1, f);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Constructible_AttributePoints)) {
            return false;
        }
        if(!j.a(this.attributeType, ((Civ7Constructible_AttributePoints)object0).attributeType)) {
            return false;
        }
        return j.a(this.constructibleType, ((Civ7Constructible_AttributePoints)object0).constructibleType) ? Double.compare(this.points, ((Civ7Constructible_AttributePoints)object0).points) == 0 : false;
    }

    public final String getAttributeType() {
        return this.attributeType;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final double getPoints() {
        return this.points;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.points);
        return f.b(this.attributeType.hashCode() * 0x1F, 0x1F, this.constructibleType) + ((int)(v ^ v >>> 0x20));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Constructible_AttributePoints(attributeType=", this.attributeType, ", constructibleType=", this.constructibleType, ", points=");
        stringBuilder0.append(this.points);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

