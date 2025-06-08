package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0017"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7RandomEventFrequencies;", "", "randomEventType", "", "realismSettingType", "occurrencesPerAge", "", "(Ljava/lang/String;Ljava/lang/String;D)V", "getOccurrencesPerAge", "()D", "getRandomEventType", "()Ljava/lang/String;", "getRealismSettingType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7RandomEventFrequencies {
    private final double occurrencesPerAge;
    private final String randomEventType;
    private final String realismSettingType;

    public Civ7RandomEventFrequencies(String s, String s1, double f) {
        j.f(s, "randomEventType");
        j.f(s1, "realismSettingType");
        super();
        this.randomEventType = s;
        this.realismSettingType = s1;
        this.occurrencesPerAge = f;
    }

    public final String component1() {
        return this.randomEventType;
    }

    public final String component2() {
        return this.realismSettingType;
    }

    public final double component3() {
        return this.occurrencesPerAge;
    }

    public final Civ7RandomEventFrequencies copy(String s, String s1, double f) {
        j.f(s, "randomEventType");
        j.f(s1, "realismSettingType");
        return new Civ7RandomEventFrequencies(s, s1, f);
    }

    public static Civ7RandomEventFrequencies copy$default(Civ7RandomEventFrequencies civ7RandomEventFrequencies0, String s, String s1, double f, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7RandomEventFrequencies0.randomEventType;
        }
        if((v & 2) != 0) {
            s1 = civ7RandomEventFrequencies0.realismSettingType;
        }
        if((v & 4) != 0) {
            f = civ7RandomEventFrequencies0.occurrencesPerAge;
        }
        return civ7RandomEventFrequencies0.copy(s, s1, f);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7RandomEventFrequencies)) {
            return false;
        }
        if(!j.a(this.randomEventType, ((Civ7RandomEventFrequencies)object0).randomEventType)) {
            return false;
        }
        return j.a(this.realismSettingType, ((Civ7RandomEventFrequencies)object0).realismSettingType) ? Double.compare(this.occurrencesPerAge, ((Civ7RandomEventFrequencies)object0).occurrencesPerAge) == 0 : false;
    }

    public final double getOccurrencesPerAge() {
        return this.occurrencesPerAge;
    }

    public final String getRandomEventType() {
        return this.randomEventType;
    }

    public final String getRealismSettingType() {
        return this.realismSettingType;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.occurrencesPerAge);
        return f.b(this.randomEventType.hashCode() * 0x1F, 0x1F, this.realismSettingType) + ((int)(v ^ v >>> 0x20));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7RandomEventFrequencies(randomEventType=", this.randomEventType, ", realismSettingType=", this.realismSettingType, ", occurrencesPerAge=");
        stringBuilder0.append(this.occurrencesPerAge);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

