package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeProgressionEvents;", "", "ageProgressionEventType", "", "mapSizeType", "ageType", "points", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAgeProgressionEventType", "()Ljava/lang/String;", "getAgeType", "getMapSizeType", "getPoints", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeProgressionEvents {
    private final String ageProgressionEventType;
    private final String ageType;
    private final String mapSizeType;
    private final int points;

    public Civ7AgeProgressionEvents(String s, String s1, String s2, int v) {
        j.f(s, "ageProgressionEventType");
        j.f(s1, "mapSizeType");
        j.f(s2, "ageType");
        super();
        this.ageProgressionEventType = s;
        this.mapSizeType = s1;
        this.ageType = s2;
        this.points = v;
    }

    public final String component1() {
        return this.ageProgressionEventType;
    }

    public final String component2() {
        return this.mapSizeType;
    }

    public final String component3() {
        return this.ageType;
    }

    public final int component4() {
        return this.points;
    }

    public final Civ7AgeProgressionEvents copy(String s, String s1, String s2, int v) {
        j.f(s, "ageProgressionEventType");
        j.f(s1, "mapSizeType");
        j.f(s2, "ageType");
        return new Civ7AgeProgressionEvents(s, s1, s2, v);
    }

    public static Civ7AgeProgressionEvents copy$default(Civ7AgeProgressionEvents civ7AgeProgressionEvents0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7AgeProgressionEvents0.ageProgressionEventType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7AgeProgressionEvents0.mapSizeType;
        }
        if((v1 & 4) != 0) {
            s2 = civ7AgeProgressionEvents0.ageType;
        }
        if((v1 & 8) != 0) {
            v = civ7AgeProgressionEvents0.points;
        }
        return civ7AgeProgressionEvents0.copy(s, s1, s2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeProgressionEvents)) {
            return false;
        }
        if(!j.a(this.ageProgressionEventType, ((Civ7AgeProgressionEvents)object0).ageProgressionEventType)) {
            return false;
        }
        if(!j.a(this.mapSizeType, ((Civ7AgeProgressionEvents)object0).mapSizeType)) {
            return false;
        }
        return j.a(this.ageType, ((Civ7AgeProgressionEvents)object0).ageType) ? this.points == ((Civ7AgeProgressionEvents)object0).points : false;
    }

    public final String getAgeProgressionEventType() {
        return this.ageProgressionEventType;
    }

    public final String getAgeType() {
        return this.ageType;
    }

    public final String getMapSizeType() {
        return this.mapSizeType;
    }

    public final int getPoints() {
        return this.points;
    }

    @Override
    public int hashCode() {
        return f.b(f.b(this.ageProgressionEventType.hashCode() * 0x1F, 0x1F, this.mapSizeType), 0x1F, this.ageType) + this.points;
    }

    @Override
    public String toString() {
        return f.l(e.j("Civ7AgeProgressionEvents(ageProgressionEventType=", this.ageProgressionEventType, ", mapSizeType=", this.mapSizeType, ", ageType="), this.points, this.ageType, ", points=", ")");
    }
}

