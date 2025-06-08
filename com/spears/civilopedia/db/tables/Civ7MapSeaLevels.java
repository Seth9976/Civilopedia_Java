package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000EJ8\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\r\u0010\u000E¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7MapSeaLevels;", "", "mapSeaLevelType", "", "description", "name", "scale", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getDescription", "()Ljava/lang/String;", "getMapSeaLevelType", "getName", "getScale", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Civ7MapSeaLevels;", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7MapSeaLevels {
    private final String description;
    private final String mapSeaLevelType;
    private final String name;
    private final Double scale;

    public Civ7MapSeaLevels(String s, String s1, String s2, Double double0) {
        j.f(s, "mapSeaLevelType");
        j.f(s1, "description");
        j.f(s2, "name");
        super();
        this.mapSeaLevelType = s;
        this.description = s1;
        this.name = s2;
        this.scale = double0;
    }

    public final String component1() {
        return this.mapSeaLevelType;
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

    public final Civ7MapSeaLevels copy(String s, String s1, String s2, Double double0) {
        j.f(s, "mapSeaLevelType");
        j.f(s1, "description");
        j.f(s2, "name");
        return new Civ7MapSeaLevels(s, s1, s2, double0);
    }

    public static Civ7MapSeaLevels copy$default(Civ7MapSeaLevels civ7MapSeaLevels0, String s, String s1, String s2, Double double0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7MapSeaLevels0.mapSeaLevelType;
        }
        if((v & 2) != 0) {
            s1 = civ7MapSeaLevels0.description;
        }
        if((v & 4) != 0) {
            s2 = civ7MapSeaLevels0.name;
        }
        if((v & 8) != 0) {
            double0 = civ7MapSeaLevels0.scale;
        }
        return civ7MapSeaLevels0.copy(s, s1, s2, double0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7MapSeaLevels)) {
            return false;
        }
        if(!j.a(this.mapSeaLevelType, ((Civ7MapSeaLevels)object0).mapSeaLevelType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7MapSeaLevels)object0).description)) {
            return false;
        }
        return j.a(this.name, ((Civ7MapSeaLevels)object0).name) ? j.a(this.scale, ((Civ7MapSeaLevels)object0).scale) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMapSeaLevelType() {
        return this.mapSeaLevelType;
    }

    public final String getName() {
        return this.name;
    }

    public final Double getScale() {
        return this.scale;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.mapSeaLevelType.hashCode() * 0x1F, 0x1F, this.description), 0x1F, this.name);
        return this.scale == null ? v : v + this.scale.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7MapSeaLevels(mapSeaLevelType=", this.mapSeaLevelType, ", description=", this.description, ", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", scale=");
        stringBuilder0.append(this.scale);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

