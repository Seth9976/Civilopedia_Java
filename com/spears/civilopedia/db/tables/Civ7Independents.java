package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u001B\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u0018\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0007H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0003H\u00C6\u0003J[\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\u0003H\u00C6\u0001J\u0013\u0010 \u001A\u00020\u00072\b\u0010!\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010\"\u001A\u00020#H\u00D6\u0001J\t\u0010$\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000ER\u0011\u0010\t\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000ER\u0011\u0010\n\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000ER\u0011\u0010\u000B\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000E\u00A8\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Independents;", "", "independentType", "", "affinity", "biomeType", "cityStateIsCity", "", "cityStateName", "cityStateType", "name", "tribeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAffinity", "()Ljava/lang/String;", "getBiomeType", "getCityStateIsCity", "()Z", "getCityStateName", "getCityStateType", "getIndependentType", "getName", "getTribeType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Independents {
    private final String affinity;
    private final String biomeType;
    private final boolean cityStateIsCity;
    private final String cityStateName;
    private final String cityStateType;
    private final String independentType;
    private final String name;
    private final String tribeType;

    public Civ7Independents(String s, String s1, String s2, boolean z, String s3, String s4, String s5, String s6) {
        j.f(s, "independentType");
        j.f(s1, "affinity");
        j.f(s3, "cityStateName");
        j.f(s4, "cityStateType");
        j.f(s5, "name");
        j.f(s6, "tribeType");
        super();
        this.independentType = s;
        this.affinity = s1;
        this.biomeType = s2;
        this.cityStateIsCity = z;
        this.cityStateName = s3;
        this.cityStateType = s4;
        this.name = s5;
        this.tribeType = s6;
    }

    public final String component1() {
        return this.independentType;
    }

    public final String component2() {
        return this.affinity;
    }

    public final String component3() {
        return this.biomeType;
    }

    public final boolean component4() {
        return this.cityStateIsCity;
    }

    public final String component5() {
        return this.cityStateName;
    }

    public final String component6() {
        return this.cityStateType;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.tribeType;
    }

    public final Civ7Independents copy(String s, String s1, String s2, boolean z, String s3, String s4, String s5, String s6) {
        j.f(s, "independentType");
        j.f(s1, "affinity");
        j.f(s3, "cityStateName");
        j.f(s4, "cityStateType");
        j.f(s5, "name");
        j.f(s6, "tribeType");
        return new Civ7Independents(s, s1, s2, z, s3, s4, s5, s6);
    }

    public static Civ7Independents copy$default(Civ7Independents civ7Independents0, String s, String s1, String s2, boolean z, String s3, String s4, String s5, String s6, int v, Object object0) {
        String s7 = (v & 1) == 0 ? s : civ7Independents0.independentType;
        String s8 = (v & 2) == 0 ? s1 : civ7Independents0.affinity;
        String s9 = (v & 4) == 0 ? s2 : civ7Independents0.biomeType;
        boolean z1 = (v & 8) == 0 ? z : civ7Independents0.cityStateIsCity;
        String s10 = (v & 16) == 0 ? s3 : civ7Independents0.cityStateName;
        String s11 = (v & 0x20) == 0 ? s4 : civ7Independents0.cityStateType;
        String s12 = (v & 0x40) == 0 ? s5 : civ7Independents0.name;
        return (v & 0x80) == 0 ? civ7Independents0.copy(s7, s8, s9, z1, s10, s11, s12, s6) : civ7Independents0.copy(s7, s8, s9, z1, s10, s11, s12, civ7Independents0.tribeType);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Independents)) {
            return false;
        }
        if(!j.a(this.independentType, ((Civ7Independents)object0).independentType)) {
            return false;
        }
        if(!j.a(this.affinity, ((Civ7Independents)object0).affinity)) {
            return false;
        }
        if(!j.a(this.biomeType, ((Civ7Independents)object0).biomeType)) {
            return false;
        }
        if(this.cityStateIsCity != ((Civ7Independents)object0).cityStateIsCity) {
            return false;
        }
        if(!j.a(this.cityStateName, ((Civ7Independents)object0).cityStateName)) {
            return false;
        }
        if(!j.a(this.cityStateType, ((Civ7Independents)object0).cityStateType)) {
            return false;
        }
        return j.a(this.name, ((Civ7Independents)object0).name) ? j.a(this.tribeType, ((Civ7Independents)object0).tribeType) : false;
    }

    public final String getAffinity() {
        return this.affinity;
    }

    public final String getBiomeType() {
        return this.biomeType;
    }

    public final boolean getCityStateIsCity() {
        return this.cityStateIsCity;
    }

    public final String getCityStateName() {
        return this.cityStateName;
    }

    public final String getCityStateType() {
        return this.cityStateType;
    }

    public final String getIndependentType() {
        return this.independentType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTribeType() {
        return this.tribeType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.independentType.hashCode() * 0x1F, 0x1F, this.affinity);
        int v1 = this.biomeType == null ? 0 : this.biomeType.hashCode();
        return this.cityStateIsCity ? this.tribeType.hashCode() + f.b(f.b(f.b(((v + v1) * 0x1F + 0x4CF) * 0x1F, 0x1F, this.cityStateName), 0x1F, this.cityStateType), 0x1F, this.name) : this.tribeType.hashCode() + f.b(f.b(f.b(((v + v1) * 0x1F + 0x4D5) * 0x1F, 0x1F, this.cityStateName), 0x1F, this.cityStateType), 0x1F, this.name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Independents(independentType=", this.independentType, ", affinity=", this.affinity, ", biomeType=");
        u9.x(stringBuilder0, this.biomeType, ", cityStateIsCity=", this.cityStateIsCity, ", cityStateName=");
        f.t(stringBuilder0, this.cityStateName, ", cityStateType=", this.cityStateType, ", name=");
        return e.i(stringBuilder0, this.name, ", tribeType=", this.tribeType, ")");
    }
}

