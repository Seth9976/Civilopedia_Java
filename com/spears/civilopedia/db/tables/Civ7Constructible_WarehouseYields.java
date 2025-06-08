package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Constructible_WarehouseYields;", "", "constructibleType", "", "yieldChangeId", "requiresActivation", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getConstructibleType", "()Ljava/lang/String;", "getRequiresActivation", "()Z", "getYieldChangeId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Constructible_WarehouseYields {
    private final String constructibleType;
    private final boolean requiresActivation;
    private final String yieldChangeId;

    public Civ7Constructible_WarehouseYields(String s, String s1, boolean z) {
        j.f(s, "constructibleType");
        j.f(s1, "yieldChangeId");
        super();
        this.constructibleType = s;
        this.yieldChangeId = s1;
        this.requiresActivation = z;
    }

    public final String component1() {
        return this.constructibleType;
    }

    public final String component2() {
        return this.yieldChangeId;
    }

    public final boolean component3() {
        return this.requiresActivation;
    }

    public final Civ7Constructible_WarehouseYields copy(String s, String s1, boolean z) {
        j.f(s, "constructibleType");
        j.f(s1, "yieldChangeId");
        return new Civ7Constructible_WarehouseYields(s, s1, z);
    }

    public static Civ7Constructible_WarehouseYields copy$default(Civ7Constructible_WarehouseYields civ7Constructible_WarehouseYields0, String s, String s1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Constructible_WarehouseYields0.constructibleType;
        }
        if((v & 2) != 0) {
            s1 = civ7Constructible_WarehouseYields0.yieldChangeId;
        }
        if((v & 4) != 0) {
            z = civ7Constructible_WarehouseYields0.requiresActivation;
        }
        return civ7Constructible_WarehouseYields0.copy(s, s1, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Constructible_WarehouseYields)) {
            return false;
        }
        if(!j.a(this.constructibleType, ((Civ7Constructible_WarehouseYields)object0).constructibleType)) {
            return false;
        }
        return j.a(this.yieldChangeId, ((Civ7Constructible_WarehouseYields)object0).yieldChangeId) ? this.requiresActivation == ((Civ7Constructible_WarehouseYields)object0).requiresActivation : false;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final boolean getRequiresActivation() {
        return this.requiresActivation;
    }

    public final String getYieldChangeId() {
        return this.yieldChangeId;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.constructibleType.hashCode() * 0x1F, 0x1F, this.yieldChangeId);
        return this.requiresActivation ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public String toString() {
        return u9.g(e.j("Civ7Constructible_WarehouseYields(constructibleType=", this.constructibleType, ", yieldChangeId=", this.yieldChangeId, ", requiresActivation="), this.requiresActivation, ")");
    }
}

