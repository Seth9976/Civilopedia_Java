package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001A\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JH\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001F\u001A\u00020\u0005HÖ\u0001J\t\u0010 \u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0015\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7MapRainfalls;", "", "mapRainfallType", "", "averageAmountPerYear", "", "description", "name", "scale", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getAverageAmountPerYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "()Ljava/lang/String;", "getMapRainfallType", "getName", "getScale", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Civ7MapRainfalls;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7MapRainfalls {
    private final Integer averageAmountPerYear;
    private final String description;
    private final String mapRainfallType;
    private final String name;
    private final Double scale;

    public Civ7MapRainfalls(String s, Integer integer0, String s1, String s2, Double double0) {
        j.f(s, "mapRainfallType");
        super();
        this.mapRainfallType = s;
        this.averageAmountPerYear = integer0;
        this.description = s1;
        this.name = s2;
        this.scale = double0;
    }

    public final String component1() {
        return this.mapRainfallType;
    }

    public final Integer component2() {
        return this.averageAmountPerYear;
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

    public final Civ7MapRainfalls copy(String s, Integer integer0, String s1, String s2, Double double0) {
        j.f(s, "mapRainfallType");
        return new Civ7MapRainfalls(s, integer0, s1, s2, double0);
    }

    public static Civ7MapRainfalls copy$default(Civ7MapRainfalls civ7MapRainfalls0, String s, Integer integer0, String s1, String s2, Double double0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7MapRainfalls0.mapRainfallType;
        }
        if((v & 2) != 0) {
            integer0 = civ7MapRainfalls0.averageAmountPerYear;
        }
        if((v & 4) != 0) {
            s1 = civ7MapRainfalls0.description;
        }
        if((v & 8) != 0) {
            s2 = civ7MapRainfalls0.name;
        }
        if((v & 16) != 0) {
            double0 = civ7MapRainfalls0.scale;
        }
        return civ7MapRainfalls0.copy(s, integer0, s1, s2, double0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7MapRainfalls)) {
            return false;
        }
        if(!j.a(this.mapRainfallType, ((Civ7MapRainfalls)object0).mapRainfallType)) {
            return false;
        }
        if(!j.a(this.averageAmountPerYear, ((Civ7MapRainfalls)object0).averageAmountPerYear)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7MapRainfalls)object0).description)) {
            return false;
        }
        return j.a(this.name, ((Civ7MapRainfalls)object0).name) ? j.a(this.scale, ((Civ7MapRainfalls)object0).scale) : false;
    }

    public final Integer getAverageAmountPerYear() {
        return this.averageAmountPerYear;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMapRainfallType() {
        return this.mapRainfallType;
    }

    public final String getName() {
        return this.name;
    }

    public final Double getScale() {
        return this.scale;
    }

    @Override
    public int hashCode() {
        int v = this.mapRainfallType.hashCode();
        int v1 = 0;
        int v2 = this.averageAmountPerYear == null ? 0 : this.averageAmountPerYear.hashCode();
        int v3 = this.description == null ? 0 : this.description.hashCode();
        int v4 = this.name == null ? 0 : this.name.hashCode();
        Double double0 = this.scale;
        if(double0 != null) {
            v1 = double0.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.i("Civ7MapRainfalls(mapRainfallType=", this.mapRainfallType, ", averageAmountPerYear=", this.averageAmountPerYear, ", description=");
        f.t(stringBuilder0, this.description, ", name=", this.name, ", scale=");
        stringBuilder0.append(this.scale);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

