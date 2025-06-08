package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ.\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0012\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000EJ\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001B\u001A\u0004\b\u001C\u0010\u000E¨\u0006\u001D"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7HandicapSystems;", "Lo2/m;", "", "handicapSystemType", "name", "", "numLevels", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/spears/civilopedia/db/tables/Civ7HandicapSystems;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHandicapSystemType", "getName", "I", "getNumLevels", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7HandicapSystems implements m {
    private final String handicapSystemType;
    private final String name;
    private final int numLevels;

    public Civ7HandicapSystems(String s, String s1, int v) {
        j.f(s, "handicapSystemType");
        j.f(s1, "name");
        super();
        this.handicapSystemType = s;
        this.name = s1;
        this.numLevels = v;
    }

    public final String component1() {
        return this.handicapSystemType;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.numLevels;
    }

    public final Civ7HandicapSystems copy(String s, String s1, int v) {
        j.f(s, "handicapSystemType");
        j.f(s1, "name");
        return new Civ7HandicapSystems(s, s1, v);
    }

    public static Civ7HandicapSystems copy$default(Civ7HandicapSystems civ7HandicapSystems0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7HandicapSystems0.handicapSystemType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7HandicapSystems0.name;
        }
        if((v1 & 4) != 0) {
            v = civ7HandicapSystems0.numLevels;
        }
        return civ7HandicapSystems0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7HandicapSystems)) {
            return false;
        }
        if(!j.a(this.handicapSystemType, ((Civ7HandicapSystems)object0).handicapSystemType)) {
            return false;
        }
        return j.a(this.name, ((Civ7HandicapSystems)object0).name) ? this.numLevels == ((Civ7HandicapSystems)object0).numLevels : false;
    }

    public final String getHandicapSystemType() {
        return this.handicapSystemType;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumLevels() {
        return this.numLevels;
    }

    @Override
    public int hashCode() {
        return f.b(this.handicapSystemType.hashCode() * 0x1F, 0x1F, this.name) + this.numLevels;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.handicapSystemType;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ7HandicapSystems(handicapSystemType=", this.handicapSystemType, ", name=", this.name, ", numLevels="), this.numLevels, ")");
    }
}

