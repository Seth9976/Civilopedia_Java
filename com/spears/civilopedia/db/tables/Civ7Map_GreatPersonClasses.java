package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Map_GreatPersonClasses;", "", "greatPersonClassType", "", "mapSizeType", "maxWorldInstances", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getGreatPersonClassType", "()Ljava/lang/String;", "getMapSizeType", "getMaxWorldInstances", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ7Map_GreatPersonClasses;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Map_GreatPersonClasses {
    private final String greatPersonClassType;
    private final String mapSizeType;
    private final Integer maxWorldInstances;

    public Civ7Map_GreatPersonClasses(String s, String s1, Integer integer0) {
        j.f(s, "greatPersonClassType");
        j.f(s1, "mapSizeType");
        super();
        this.greatPersonClassType = s;
        this.mapSizeType = s1;
        this.maxWorldInstances = integer0;
    }

    public final String component1() {
        return this.greatPersonClassType;
    }

    public final String component2() {
        return this.mapSizeType;
    }

    public final Integer component3() {
        return this.maxWorldInstances;
    }

    public final Civ7Map_GreatPersonClasses copy(String s, String s1, Integer integer0) {
        j.f(s, "greatPersonClassType");
        j.f(s1, "mapSizeType");
        return new Civ7Map_GreatPersonClasses(s, s1, integer0);
    }

    public static Civ7Map_GreatPersonClasses copy$default(Civ7Map_GreatPersonClasses civ7Map_GreatPersonClasses0, String s, String s1, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Map_GreatPersonClasses0.greatPersonClassType;
        }
        if((v & 2) != 0) {
            s1 = civ7Map_GreatPersonClasses0.mapSizeType;
        }
        if((v & 4) != 0) {
            integer0 = civ7Map_GreatPersonClasses0.maxWorldInstances;
        }
        return civ7Map_GreatPersonClasses0.copy(s, s1, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Map_GreatPersonClasses)) {
            return false;
        }
        if(!j.a(this.greatPersonClassType, ((Civ7Map_GreatPersonClasses)object0).greatPersonClassType)) {
            return false;
        }
        return j.a(this.mapSizeType, ((Civ7Map_GreatPersonClasses)object0).mapSizeType) ? j.a(this.maxWorldInstances, ((Civ7Map_GreatPersonClasses)object0).maxWorldInstances) : false;
    }

    public final String getGreatPersonClassType() {
        return this.greatPersonClassType;
    }

    public final String getMapSizeType() {
        return this.mapSizeType;
    }

    public final Integer getMaxWorldInstances() {
        return this.maxWorldInstances;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.greatPersonClassType.hashCode() * 0x1F, 0x1F, this.mapSizeType);
        return this.maxWorldInstances == null ? v : v + this.maxWorldInstances.hashCode();
    }

    @Override
    public String toString() {
        return u9.f(e.j("Civ7Map_GreatPersonClasses(greatPersonClassType=", this.greatPersonClassType, ", mapSizeType=", this.mapSizeType, ", maxWorldInstances="), this.maxWorldInstances, ")");
    }
}

