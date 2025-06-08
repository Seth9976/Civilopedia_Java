package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000BJ\u0010\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001A\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001B\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001C\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010JT\u0010\u001D\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001EJ\u0013\u0010\u001F\u001A\u00020 2\b\u0010!\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001A\u00020\u0003HÖ\u0001J\t\u0010#\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0015\u0010\n\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u000F\u0010\u0010R\u0015\u0010\t\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u0012\u0010\u0010R\u0015\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Colors;", "", "ID", "", "type", "", "red", "", "green", "blue", "alpha", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAlpha", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBlue", "getGreen", "getRed", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Civ5Colors;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Colors {
    private final Integer ID;
    private final Double alpha;
    private final Double blue;
    private final Double green;
    private final Double red;
    private final String type;

    public Civ5Colors(Integer integer0, String s, Double double0, Double double1, Double double2, Double double3) {
        j.f(s, "type");
        super();
        this.ID = integer0;
        this.type = s;
        this.red = double0;
        this.green = double1;
        this.blue = double2;
        this.alpha = double3;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.type;
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

    public final Civ5Colors copy(Integer integer0, String s, Double double0, Double double1, Double double2, Double double3) {
        j.f(s, "type");
        return new Civ5Colors(integer0, s, double0, double1, double2, double3);
    }

    public static Civ5Colors copy$default(Civ5Colors civ5Colors0, Integer integer0, String s, Double double0, Double double1, Double double2, Double double3, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5Colors0.ID;
        }
        if((v & 2) != 0) {
            s = civ5Colors0.type;
        }
        if((v & 4) != 0) {
            double0 = civ5Colors0.red;
        }
        if((v & 8) != 0) {
            double1 = civ5Colors0.green;
        }
        if((v & 16) != 0) {
            double2 = civ5Colors0.blue;
        }
        if((v & 0x20) != 0) {
            double3 = civ5Colors0.alpha;
        }
        return civ5Colors0.copy(integer0, s, double0, double1, double2, double3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Colors)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5Colors)object0).ID)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5Colors)object0).type)) {
            return false;
        }
        if(!j.a(this.red, ((Civ5Colors)object0).red)) {
            return false;
        }
        if(!j.a(this.green, ((Civ5Colors)object0).green)) {
            return false;
        }
        return j.a(this.blue, ((Civ5Colors)object0).blue) ? j.a(this.alpha, ((Civ5Colors)object0).alpha) : false;
    }

    public final Double getAlpha() {
        return this.alpha;
    }

    public final Double getBlue() {
        return this.blue;
    }

    public final Double getGreen() {
        return this.green;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final Double getRed() {
        return this.red;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.type);
        int v2 = this.red == null ? 0 : this.red.hashCode();
        int v3 = this.green == null ? 0 : this.green.hashCode();
        int v4 = this.blue == null ? 0 : this.blue.hashCode();
        Double double0 = this.alpha;
        if(double0 != null) {
            v = double0.hashCode();
        }
        return (((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5Colors(ID=", this.ID, ", type=", this.type, ", red=");
        u9.u(stringBuilder0, this.red, ", green=", this.green, ", blue=");
        stringBuilder0.append(this.blue);
        stringBuilder0.append(", alpha=");
        stringBuilder0.append(this.alpha);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

