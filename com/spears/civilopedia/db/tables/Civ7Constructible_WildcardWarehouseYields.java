package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J)\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Constructible_WildcardWarehouseYields;", "", "yieldChangeId", "", "constructibleTag", "requiresActivation", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getConstructibleTag", "()Ljava/lang/String;", "getRequiresActivation", "()Z", "getYieldChangeId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Constructible_WildcardWarehouseYields {
    private final String constructibleTag;
    private final boolean requiresActivation;
    private final String yieldChangeId;

    public Civ7Constructible_WildcardWarehouseYields(String s, String s1, boolean z) {
        j.f(s, "yieldChangeId");
        super();
        this.yieldChangeId = s;
        this.constructibleTag = s1;
        this.requiresActivation = z;
    }

    public final String component1() {
        return this.yieldChangeId;
    }

    public final String component2() {
        return this.constructibleTag;
    }

    public final boolean component3() {
        return this.requiresActivation;
    }

    public final Civ7Constructible_WildcardWarehouseYields copy(String s, String s1, boolean z) {
        j.f(s, "yieldChangeId");
        return new Civ7Constructible_WildcardWarehouseYields(s, s1, z);
    }

    public static Civ7Constructible_WildcardWarehouseYields copy$default(Civ7Constructible_WildcardWarehouseYields civ7Constructible_WildcardWarehouseYields0, String s, String s1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Constructible_WildcardWarehouseYields0.yieldChangeId;
        }
        if((v & 2) != 0) {
            s1 = civ7Constructible_WildcardWarehouseYields0.constructibleTag;
        }
        if((v & 4) != 0) {
            z = civ7Constructible_WildcardWarehouseYields0.requiresActivation;
        }
        return civ7Constructible_WildcardWarehouseYields0.copy(s, s1, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Constructible_WildcardWarehouseYields)) {
            return false;
        }
        if(!j.a(this.yieldChangeId, ((Civ7Constructible_WildcardWarehouseYields)object0).yieldChangeId)) {
            return false;
        }
        return j.a(this.constructibleTag, ((Civ7Constructible_WildcardWarehouseYields)object0).constructibleTag) ? this.requiresActivation == ((Civ7Constructible_WildcardWarehouseYields)object0).requiresActivation : false;
    }

    public final String getConstructibleTag() {
        return this.constructibleTag;
    }

    public final boolean getRequiresActivation() {
        return this.requiresActivation;
    }

    public final String getYieldChangeId() {
        return this.yieldChangeId;
    }

    @Override
    public int hashCode() {
        int v = this.yieldChangeId.hashCode();
        int v1 = this.constructibleTag == null ? 0 : this.constructibleTag.hashCode();
        return this.requiresActivation ? (v * 0x1F + v1) * 0x1F + 0x4CF : (v * 0x1F + v1) * 0x1F + 0x4D5;
    }

    @Override
    public String toString() {
        return u9.g(e.j("Civ7Constructible_WildcardWarehouseYields(yieldChangeId=", this.yieldChangeId, ", constructibleTag=", this.constructibleTag, ", requiresActivation="), this.requiresActivation, ")");
    }
}

