package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00072\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Constructible_Adjacencies;", "", "constructibleType", "", "yieldChangeId", "name", "requiresActivation", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getConstructibleType", "()Ljava/lang/String;", "getName", "getRequiresActivation", "()Z", "getYieldChangeId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Constructible_Adjacencies {
    private final String constructibleType;
    private final String name;
    private final boolean requiresActivation;
    private final String yieldChangeId;

    public Civ7Constructible_Adjacencies(String s, String s1, String s2, boolean z) {
        j.f(s, "constructibleType");
        j.f(s1, "yieldChangeId");
        j.f(s2, "name");
        super();
        this.constructibleType = s;
        this.yieldChangeId = s1;
        this.name = s2;
        this.requiresActivation = z;
    }

    public final String component1() {
        return this.constructibleType;
    }

    public final String component2() {
        return this.yieldChangeId;
    }

    public final String component3() {
        return this.name;
    }

    public final boolean component4() {
        return this.requiresActivation;
    }

    public final Civ7Constructible_Adjacencies copy(String s, String s1, String s2, boolean z) {
        j.f(s, "constructibleType");
        j.f(s1, "yieldChangeId");
        j.f(s2, "name");
        return new Civ7Constructible_Adjacencies(s, s1, s2, z);
    }

    public static Civ7Constructible_Adjacencies copy$default(Civ7Constructible_Adjacencies civ7Constructible_Adjacencies0, String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Constructible_Adjacencies0.constructibleType;
        }
        if((v & 2) != 0) {
            s1 = civ7Constructible_Adjacencies0.yieldChangeId;
        }
        if((v & 4) != 0) {
            s2 = civ7Constructible_Adjacencies0.name;
        }
        if((v & 8) != 0) {
            z = civ7Constructible_Adjacencies0.requiresActivation;
        }
        return civ7Constructible_Adjacencies0.copy(s, s1, s2, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Constructible_Adjacencies)) {
            return false;
        }
        if(!j.a(this.constructibleType, ((Civ7Constructible_Adjacencies)object0).constructibleType)) {
            return false;
        }
        if(!j.a(this.yieldChangeId, ((Civ7Constructible_Adjacencies)object0).yieldChangeId)) {
            return false;
        }
        return j.a(this.name, ((Civ7Constructible_Adjacencies)object0).name) ? this.requiresActivation == ((Civ7Constructible_Adjacencies)object0).requiresActivation : false;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getRequiresActivation() {
        return this.requiresActivation;
    }

    public final String getYieldChangeId() {
        return this.yieldChangeId;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.constructibleType.hashCode() * 0x1F, 0x1F, this.yieldChangeId), 0x1F, this.name);
        return this.requiresActivation ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Constructible_Adjacencies(constructibleType=", this.constructibleType, ", yieldChangeId=", this.yieldChangeId, ", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", requiresActivation=");
        stringBuilder0.append(this.requiresActivation);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

