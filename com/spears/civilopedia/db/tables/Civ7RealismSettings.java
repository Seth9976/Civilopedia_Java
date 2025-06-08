package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000BJ.\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7RealismSettings;", "", "realismSettingType", "", "name", "percentVolcanoesActive", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getPercentVolcanoesActive", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRealismSettingType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ7RealismSettings;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7RealismSettings {
    private final String name;
    private final Integer percentVolcanoesActive;
    private final String realismSettingType;

    public Civ7RealismSettings(String s, String s1, Integer integer0) {
        j.f(s, "realismSettingType");
        j.f(s1, "name");
        super();
        this.realismSettingType = s;
        this.name = s1;
        this.percentVolcanoesActive = integer0;
    }

    public final String component1() {
        return this.realismSettingType;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component3() {
        return this.percentVolcanoesActive;
    }

    public final Civ7RealismSettings copy(String s, String s1, Integer integer0) {
        j.f(s, "realismSettingType");
        j.f(s1, "name");
        return new Civ7RealismSettings(s, s1, integer0);
    }

    public static Civ7RealismSettings copy$default(Civ7RealismSettings civ7RealismSettings0, String s, String s1, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7RealismSettings0.realismSettingType;
        }
        if((v & 2) != 0) {
            s1 = civ7RealismSettings0.name;
        }
        if((v & 4) != 0) {
            integer0 = civ7RealismSettings0.percentVolcanoesActive;
        }
        return civ7RealismSettings0.copy(s, s1, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7RealismSettings)) {
            return false;
        }
        if(!j.a(this.realismSettingType, ((Civ7RealismSettings)object0).realismSettingType)) {
            return false;
        }
        return j.a(this.name, ((Civ7RealismSettings)object0).name) ? j.a(this.percentVolcanoesActive, ((Civ7RealismSettings)object0).percentVolcanoesActive) : false;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPercentVolcanoesActive() {
        return this.percentVolcanoesActive;
    }

    public final String getRealismSettingType() {
        return this.realismSettingType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.realismSettingType.hashCode() * 0x1F, 0x1F, this.name);
        return this.percentVolcanoesActive == null ? v : v + this.percentVolcanoesActive.hashCode();
    }

    @Override
    public String toString() {
        return u9.f(e.j("Civ7RealismSettings(realismSettingType=", this.realismSettingType, ", name=", this.name, ", percentVolcanoesActive="), this.percentVolcanoesActive, ")");
    }
}

