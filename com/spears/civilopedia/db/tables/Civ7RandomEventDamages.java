package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001A\u00020\u0006HÆ\u0003JD\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\b\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000B¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7RandomEventDamages;", "", "damageType", "", "randomEventType", "maxHP", "", "minHP", "percentage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "getDamageType", "()Ljava/lang/String;", "getMaxHP", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinHP", "getPercentage", "()I", "getRandomEventType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/spears/civilopedia/db/tables/Civ7RandomEventDamages;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7RandomEventDamages {
    private final String damageType;
    private final Integer maxHP;
    private final Integer minHP;
    private final int percentage;
    private final String randomEventType;

    public Civ7RandomEventDamages(String s, String s1, Integer integer0, Integer integer1, int v) {
        j.f(s, "damageType");
        j.f(s1, "randomEventType");
        super();
        this.damageType = s;
        this.randomEventType = s1;
        this.maxHP = integer0;
        this.minHP = integer1;
        this.percentage = v;
    }

    public final String component1() {
        return this.damageType;
    }

    public final String component2() {
        return this.randomEventType;
    }

    public final Integer component3() {
        return this.maxHP;
    }

    public final Integer component4() {
        return this.minHP;
    }

    public final int component5() {
        return this.percentage;
    }

    public final Civ7RandomEventDamages copy(String s, String s1, Integer integer0, Integer integer1, int v) {
        j.f(s, "damageType");
        j.f(s1, "randomEventType");
        return new Civ7RandomEventDamages(s, s1, integer0, integer1, v);
    }

    public static Civ7RandomEventDamages copy$default(Civ7RandomEventDamages civ7RandomEventDamages0, String s, String s1, Integer integer0, Integer integer1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7RandomEventDamages0.damageType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7RandomEventDamages0.randomEventType;
        }
        if((v1 & 4) != 0) {
            integer0 = civ7RandomEventDamages0.maxHP;
        }
        if((v1 & 8) != 0) {
            integer1 = civ7RandomEventDamages0.minHP;
        }
        if((v1 & 16) != 0) {
            v = civ7RandomEventDamages0.percentage;
        }
        return civ7RandomEventDamages0.copy(s, s1, integer0, integer1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7RandomEventDamages)) {
            return false;
        }
        if(!j.a(this.damageType, ((Civ7RandomEventDamages)object0).damageType)) {
            return false;
        }
        if(!j.a(this.randomEventType, ((Civ7RandomEventDamages)object0).randomEventType)) {
            return false;
        }
        if(!j.a(this.maxHP, ((Civ7RandomEventDamages)object0).maxHP)) {
            return false;
        }
        return j.a(this.minHP, ((Civ7RandomEventDamages)object0).minHP) ? this.percentage == ((Civ7RandomEventDamages)object0).percentage : false;
    }

    public final String getDamageType() {
        return this.damageType;
    }

    public final Integer getMaxHP() {
        return this.maxHP;
    }

    public final Integer getMinHP() {
        return this.minHP;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    public final String getRandomEventType() {
        return this.randomEventType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.damageType.hashCode() * 0x1F, 0x1F, this.randomEventType);
        int v1 = 0;
        int v2 = this.maxHP == null ? 0 : this.maxHP.hashCode();
        Integer integer0 = this.minHP;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return ((v + v2) * 0x1F + v1) * 0x1F + this.percentage;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7RandomEventDamages(damageType=", this.damageType, ", randomEventType=", this.randomEventType, ", maxHP=");
        u9.w(stringBuilder0, this.maxHP, ", minHP=", this.minHP, ", percentage=");
        return e.g(stringBuilder0, this.percentage, ")");
    }
}

