package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000FJ\u0010\u0010\u0016\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000FJD\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u001DHÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u0015\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u0011\u0010\u000F¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7MapWorldAges;", "", "mapWorldAgeType", "", "description", "name", "scale", "", "yearsOld", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getDescription", "()Ljava/lang/String;", "getMapWorldAgeType", "getName", "getScale", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getYearsOld", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Civ7MapWorldAges;", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7MapWorldAges {
    private final String description;
    private final String mapWorldAgeType;
    private final String name;
    private final Double scale;
    private final Double yearsOld;

    public Civ7MapWorldAges(String s, String s1, String s2, Double double0, Double double1) {
        j.f(s, "mapWorldAgeType");
        j.f(s1, "description");
        j.f(s2, "name");
        super();
        this.mapWorldAgeType = s;
        this.description = s1;
        this.name = s2;
        this.scale = double0;
        this.yearsOld = double1;
    }

    public final String component1() {
        return this.mapWorldAgeType;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.name;
    }

    public final Double component4() {
        return this.scale;
    }

    public final Double component5() {
        return this.yearsOld;
    }

    public final Civ7MapWorldAges copy(String s, String s1, String s2, Double double0, Double double1) {
        j.f(s, "mapWorldAgeType");
        j.f(s1, "description");
        j.f(s2, "name");
        return new Civ7MapWorldAges(s, s1, s2, double0, double1);
    }

    public static Civ7MapWorldAges copy$default(Civ7MapWorldAges civ7MapWorldAges0, String s, String s1, String s2, Double double0, Double double1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7MapWorldAges0.mapWorldAgeType;
        }
        if((v & 2) != 0) {
            s1 = civ7MapWorldAges0.description;
        }
        if((v & 4) != 0) {
            s2 = civ7MapWorldAges0.name;
        }
        if((v & 8) != 0) {
            double0 = civ7MapWorldAges0.scale;
        }
        if((v & 16) != 0) {
            double1 = civ7MapWorldAges0.yearsOld;
        }
        return civ7MapWorldAges0.copy(s, s1, s2, double0, double1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7MapWorldAges)) {
            return false;
        }
        if(!j.a(this.mapWorldAgeType, ((Civ7MapWorldAges)object0).mapWorldAgeType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7MapWorldAges)object0).description)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7MapWorldAges)object0).name)) {
            return false;
        }
        return j.a(this.scale, ((Civ7MapWorldAges)object0).scale) ? j.a(this.yearsOld, ((Civ7MapWorldAges)object0).yearsOld) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMapWorldAgeType() {
        return this.mapWorldAgeType;
    }

    public final String getName() {
        return this.name;
    }

    public final Double getScale() {
        return this.scale;
    }

    public final Double getYearsOld() {
        return this.yearsOld;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.mapWorldAgeType.hashCode() * 0x1F, 0x1F, this.description), 0x1F, this.name);
        int v1 = 0;
        int v2 = this.scale == null ? 0 : this.scale.hashCode();
        Double double0 = this.yearsOld;
        if(double0 != null) {
            v1 = double0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7MapWorldAges(mapWorldAgeType=", this.mapWorldAgeType, ", description=", this.description, ", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", scale=");
        stringBuilder0.append(this.scale);
        stringBuilder0.append(", yearsOld=");
        stringBuilder0.append(this.yearsOld);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

