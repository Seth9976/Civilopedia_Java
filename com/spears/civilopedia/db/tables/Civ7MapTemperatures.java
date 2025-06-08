package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000BJ\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000BJD\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u001DHÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000ER\u0015\u0010\b\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\u0011\u0010\u000B¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7MapTemperatures;", "", "mapTemperatureType", "", "averageStartingTemperature", "", "description", "name", "scale", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getAverageStartingTemperature", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDescription", "()Ljava/lang/String;", "getMapTemperatureType", "getName", "getScale", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Civ7MapTemperatures;", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7MapTemperatures {
    private final Double averageStartingTemperature;
    private final String description;
    private final String mapTemperatureType;
    private final String name;
    private final Double scale;

    public Civ7MapTemperatures(String s, Double double0, String s1, String s2, Double double1) {
        j.f(s, "mapTemperatureType");
        j.f(s1, "description");
        j.f(s2, "name");
        super();
        this.mapTemperatureType = s;
        this.averageStartingTemperature = double0;
        this.description = s1;
        this.name = s2;
        this.scale = double1;
    }

    public final String component1() {
        return this.mapTemperatureType;
    }

    public final Double component2() {
        return this.averageStartingTemperature;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.name;
    }

    public final Double component5() {
        return this.scale;
    }

    public final Civ7MapTemperatures copy(String s, Double double0, String s1, String s2, Double double1) {
        j.f(s, "mapTemperatureType");
        j.f(s1, "description");
        j.f(s2, "name");
        return new Civ7MapTemperatures(s, double0, s1, s2, double1);
    }

    public static Civ7MapTemperatures copy$default(Civ7MapTemperatures civ7MapTemperatures0, String s, Double double0, String s1, String s2, Double double1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7MapTemperatures0.mapTemperatureType;
        }
        if((v & 2) != 0) {
            double0 = civ7MapTemperatures0.averageStartingTemperature;
        }
        if((v & 4) != 0) {
            s1 = civ7MapTemperatures0.description;
        }
        if((v & 8) != 0) {
            s2 = civ7MapTemperatures0.name;
        }
        if((v & 16) != 0) {
            double1 = civ7MapTemperatures0.scale;
        }
        return civ7MapTemperatures0.copy(s, double0, s1, s2, double1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7MapTemperatures)) {
            return false;
        }
        if(!j.a(this.mapTemperatureType, ((Civ7MapTemperatures)object0).mapTemperatureType)) {
            return false;
        }
        if(!j.a(this.averageStartingTemperature, ((Civ7MapTemperatures)object0).averageStartingTemperature)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7MapTemperatures)object0).description)) {
            return false;
        }
        return j.a(this.name, ((Civ7MapTemperatures)object0).name) ? j.a(this.scale, ((Civ7MapTemperatures)object0).scale) : false;
    }

    public final Double getAverageStartingTemperature() {
        return this.averageStartingTemperature;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMapTemperatureType() {
        return this.mapTemperatureType;
    }

    public final String getName() {
        return this.name;
    }

    public final Double getScale() {
        return this.scale;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(f.b((this.mapTemperatureType.hashCode() * 0x1F + (this.averageStartingTemperature == null ? 0 : this.averageStartingTemperature.hashCode())) * 0x1F, 0x1F, this.description), 0x1F, this.name);
        Double double0 = this.scale;
        if(double0 != null) {
            v = double0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7MapTemperatures(mapTemperatureType=");
        stringBuilder0.append(this.mapTemperatureType);
        stringBuilder0.append(", averageStartingTemperature=");
        stringBuilder0.append(this.averageStartingTemperature);
        stringBuilder0.append(", description=");
        f.t(stringBuilder0, this.description, ", name=", this.name, ", scale=");
        stringBuilder0.append(this.scale);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

