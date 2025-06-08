package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000E\u0010\rJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\rJ\u0012\u0010\u0010\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0011JV\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0005H\u00C6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001A\u00020\u0018H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010 \u001A\u0004\b!\u0010\rR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010 \u001A\u0004\b\"\u0010\rR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010#\u001A\u0004\b$\u0010\u0011R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010#\u001A\u0004\b%\u0010\u0011R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b\b\u0010#\u001A\u0004\b&\u0010\u0011R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b\t\u0010#\u001A\u0004\b\'\u0010\u0011\u00A8\u0006("}, d2 = {"Lcom/spears/civilopedia/db/tables/Colors;", "Lo2/m;", "", "type", "color", "", "red", "green", "blue", "alpha", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()Ljava/lang/Double;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Colors;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getColor", "Ljava/lang/Double;", "getRed", "getGreen", "getBlue", "getAlpha", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Colors implements m {
    private final Double alpha;
    private final Double blue;
    private final String color;
    private final Double green;
    private final Double red;
    private final String type;

    public Colors(String s, String s1, Double double0, Double double1, Double double2, Double double3) {
        j.f(s, "type");
        super();
        this.type = s;
        this.color = s1;
        this.red = double0;
        this.green = double1;
        this.blue = double2;
        this.alpha = double3;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.color;
    }

    public final Double component3() {
        return this.red;
    }

    public final Double component4() {
        return this.green;
    }

    public final Double component5() {
        return this.blue;
    }

    public final Double component6() {
        return this.alpha;
    }

    public final Colors copy(String s, String s1, Double double0, Double double1, Double double2, Double double3) {
        j.f(s, "type");
        return new Colors(s, s1, double0, double1, double2, double3);
    }

    public static Colors copy$default(Colors colors0, String s, String s1, Double double0, Double double1, Double double2, Double double3, int v, Object object0) {
        if((v & 1) != 0) {
            s = colors0.type;
        }
        if((v & 2) != 0) {
            s1 = colors0.color;
        }
        if((v & 4) != 0) {
            double0 = colors0.red;
        }
        if((v & 8) != 0) {
            double1 = colors0.green;
        }
        if((v & 16) != 0) {
            double2 = colors0.blue;
        }
        if((v & 0x20) != 0) {
            double3 = colors0.alpha;
        }
        return colors0.copy(s, s1, double0, double1, double2, double3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Colors)) {
            return false;
        }
        if(!j.a(this.type, ((Colors)object0).type)) {
            return false;
        }
        if(!j.a(this.color, ((Colors)object0).color)) {
            return false;
        }
        if(!j.a(this.red, ((Colors)object0).red)) {
            return false;
        }
        if(!j.a(this.green, ((Colors)object0).green)) {
            return false;
        }
        return j.a(this.blue, ((Colors)object0).blue) ? j.a(this.alpha, ((Colors)object0).alpha) : false;
    }

    public final Double getAlpha() {
        return this.alpha;
    }

    public final Double getBlue() {
        return this.blue;
    }

    public final String getColor() {
        return this.color;
    }

    public final Double getGreen() {
        return this.green;
    }

    public final Double getRed() {
        return this.red;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = this.type.hashCode();
        int v1 = 0;
        int v2 = this.color == null ? 0 : this.color.hashCode();
        int v3 = this.red == null ? 0 : this.red.hashCode();
        int v4 = this.green == null ? 0 : this.green.hashCode();
        int v5 = this.blue == null ? 0 : this.blue.hashCode();
        Double double0 = this.alpha;
        if(double0 != null) {
            v1 = double0.hashCode();
        }
        return ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.type;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Colors(type=", this.type, ", color=", this.color, ", red=");
        u9.u(stringBuilder0, this.red, ", green=", this.green, ", blue=");
        stringBuilder0.append(this.blue);
        stringBuilder0.append(", alpha=");
        stringBuilder0.append(this.alpha);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

