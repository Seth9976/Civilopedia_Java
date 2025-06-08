package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000B\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000E\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\fJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\fJ\u0010\u0010\u0010\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JF\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001B\u001A\u00020\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001D\u001A\u0004\b\u001E\u0010\fR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001D\u001A\u0004\b\u001F\u0010\fR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001D\u001A\u0004\b \u0010\fR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001A\u0004\b\"\u0010\u0011R\u0017\u0010\b\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001A\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lcom/spears/civilopedia/db/tables/Policies_XP1;", "Lo2/m;", "", "policyType", "minimumGameEra", "maximumGameEra", "", "requiresDarkAge", "requiresGoldenAge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/spears/civilopedia/db/tables/Policies_XP1;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPolicyType", "getMinimumGameEra", "getMaximumGameEra", "Z", "getRequiresDarkAge", "getRequiresGoldenAge", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Policies_XP1 implements m {
    private final String maximumGameEra;
    private final String minimumGameEra;
    private final String policyType;
    private final boolean requiresDarkAge;
    private final boolean requiresGoldenAge;

    public Policies_XP1(String s, String s1, String s2, boolean z, boolean z1) {
        j.f(s, "policyType");
        super();
        this.policyType = s;
        this.minimumGameEra = s1;
        this.maximumGameEra = s2;
        this.requiresDarkAge = z;
        this.requiresGoldenAge = z1;
    }

    public final String component1() {
        return this.policyType;
    }

    public final String component2() {
        return this.minimumGameEra;
    }

    public final String component3() {
        return this.maximumGameEra;
    }

    public final boolean component4() {
        return this.requiresDarkAge;
    }

    public final boolean component5() {
        return this.requiresGoldenAge;
    }

    public final Policies_XP1 copy(String s, String s1, String s2, boolean z, boolean z1) {
        j.f(s, "policyType");
        return new Policies_XP1(s, s1, s2, z, z1);
    }

    public static Policies_XP1 copy$default(Policies_XP1 policies_XP10, String s, String s1, String s2, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            s = policies_XP10.policyType;
        }
        if((v & 2) != 0) {
            s1 = policies_XP10.minimumGameEra;
        }
        if((v & 4) != 0) {
            s2 = policies_XP10.maximumGameEra;
        }
        if((v & 8) != 0) {
            z = policies_XP10.requiresDarkAge;
        }
        if((v & 16) != 0) {
            z1 = policies_XP10.requiresGoldenAge;
        }
        return policies_XP10.copy(s, s1, s2, z, z1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Policies_XP1)) {
            return false;
        }
        if(!j.a(this.policyType, ((Policies_XP1)object0).policyType)) {
            return false;
        }
        if(!j.a(this.minimumGameEra, ((Policies_XP1)object0).minimumGameEra)) {
            return false;
        }
        if(!j.a(this.maximumGameEra, ((Policies_XP1)object0).maximumGameEra)) {
            return false;
        }
        return this.requiresDarkAge == ((Policies_XP1)object0).requiresDarkAge ? this.requiresGoldenAge == ((Policies_XP1)object0).requiresGoldenAge : false;
    }

    public final String getMaximumGameEra() {
        return this.maximumGameEra;
    }

    public final String getMinimumGameEra() {
        return this.minimumGameEra;
    }

    public final String getPolicyType() {
        return this.policyType;
    }

    public final boolean getRequiresDarkAge() {
        return this.requiresDarkAge;
    }

    public final boolean getRequiresGoldenAge() {
        return this.requiresGoldenAge;
    }

    @Override
    public int hashCode() {
        int v = this.policyType.hashCode();
        int v1 = 0;
        int v2 = this.minimumGameEra == null ? 0 : this.minimumGameEra.hashCode();
        String s = this.maximumGameEra;
        if(s != null) {
            v1 = s.hashCode();
        }
        int v3 = 0x4D5;
        int v4 = this.requiresDarkAge ? 0x4CF : 0x4D5;
        if(this.requiresGoldenAge) {
            v3 = 0x4CF;
        }
        return (((v * 0x1F + v2) * 0x1F + v1) * 0x1F + v4) * 0x1F + v3;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.policyType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Policies_XP1(policyType=", this.policyType, ", minimumGameEra=", this.minimumGameEra, ", maximumGameEra=");
        u9.x(stringBuilder0, this.maximumGameEra, ", requiresDarkAge=", this.requiresDarkAge, ", requiresGoldenAge=");
        return u9.g(stringBuilder0, this.requiresGoldenAge, ")");
    }
}

