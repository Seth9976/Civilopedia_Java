package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J7\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendDomainOverrides;", "", "key1", "", "key2", "parameterID", "domainOverride", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDomainOverride", "()Ljava/lang/String;", "getKey1", "getKey2", "getParameterID", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendDomainOverrides {
    private final String domainOverride;
    private final String key1;
    private final String key2;
    private final String parameterID;

    public FrontendDomainOverrides(String s, String s1, String s2, String s3) {
        j.f(s3, "domainOverride");
        super();
        this.key1 = s;
        this.key2 = s1;
        this.parameterID = s2;
        this.domainOverride = s3;
    }

    public final String component1() {
        return this.key1;
    }

    public final String component2() {
        return this.key2;
    }

    public final String component3() {
        return this.parameterID;
    }

    public final String component4() {
        return this.domainOverride;
    }

    public final FrontendDomainOverrides copy(String s, String s1, String s2, String s3) {
        j.f(s3, "domainOverride");
        return new FrontendDomainOverrides(s, s1, s2, s3);
    }

    public static FrontendDomainOverrides copy$default(FrontendDomainOverrides frontendDomainOverrides0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendDomainOverrides0.key1;
        }
        if((v & 2) != 0) {
            s1 = frontendDomainOverrides0.key2;
        }
        if((v & 4) != 0) {
            s2 = frontendDomainOverrides0.parameterID;
        }
        if((v & 8) != 0) {
            s3 = frontendDomainOverrides0.domainOverride;
        }
        return frontendDomainOverrides0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendDomainOverrides)) {
            return false;
        }
        if(!j.a(this.key1, ((FrontendDomainOverrides)object0).key1)) {
            return false;
        }
        if(!j.a(this.key2, ((FrontendDomainOverrides)object0).key2)) {
            return false;
        }
        return j.a(this.parameterID, ((FrontendDomainOverrides)object0).parameterID) ? j.a(this.domainOverride, ((FrontendDomainOverrides)object0).domainOverride) : false;
    }

    public final String getDomainOverride() {
        return this.domainOverride;
    }

    public final String getKey1() {
        return this.key1;
    }

    public final String getKey2() {
        return this.key2;
    }

    public final String getParameterID() {
        return this.parameterID;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.key1 == null ? 0 : this.key1.hashCode();
        int v2 = this.key2 == null ? 0 : this.key2.hashCode();
        String s = this.parameterID;
        if(s != null) {
            v = s.hashCode();
        }
        return this.domainOverride.hashCode() + ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F;
    }

    @Override
    public String toString() {
        return e.i(e.j("FrontendDomainOverrides(key1=", this.key1, ", key2=", this.key2, ", parameterID="), this.parameterID, ", domainOverride=", this.domainOverride, ")");
    }
}

