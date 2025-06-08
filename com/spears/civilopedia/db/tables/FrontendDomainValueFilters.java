package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J5\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendDomainValueFilters;", "", "key1", "", "key2", "domain", "filter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getFilter", "getKey1", "getKey2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendDomainValueFilters {
    private final String domain;
    private final String filter;
    private final String key1;
    private final String key2;

    public FrontendDomainValueFilters(String s, String s1, String s2, String s3) {
        j.f(s2, "domain");
        j.f(s3, "filter");
        super();
        this.key1 = s;
        this.key2 = s1;
        this.domain = s2;
        this.filter = s3;
    }

    public final String component1() {
        return this.key1;
    }

    public final String component2() {
        return this.key2;
    }

    public final String component3() {
        return this.domain;
    }

    public final String component4() {
        return this.filter;
    }

    public final FrontendDomainValueFilters copy(String s, String s1, String s2, String s3) {
        j.f(s2, "domain");
        j.f(s3, "filter");
        return new FrontendDomainValueFilters(s, s1, s2, s3);
    }

    public static FrontendDomainValueFilters copy$default(FrontendDomainValueFilters frontendDomainValueFilters0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendDomainValueFilters0.key1;
        }
        if((v & 2) != 0) {
            s1 = frontendDomainValueFilters0.key2;
        }
        if((v & 4) != 0) {
            s2 = frontendDomainValueFilters0.domain;
        }
        if((v & 8) != 0) {
            s3 = frontendDomainValueFilters0.filter;
        }
        return frontendDomainValueFilters0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendDomainValueFilters)) {
            return false;
        }
        if(!j.a(this.key1, ((FrontendDomainValueFilters)object0).key1)) {
            return false;
        }
        if(!j.a(this.key2, ((FrontendDomainValueFilters)object0).key2)) {
            return false;
        }
        return j.a(this.domain, ((FrontendDomainValueFilters)object0).domain) ? j.a(this.filter, ((FrontendDomainValueFilters)object0).filter) : false;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getFilter() {
        return this.filter;
    }

    public final String getKey1() {
        return this.key1;
    }

    public final String getKey2() {
        return this.key2;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.key1 == null ? 0 : this.key1.hashCode();
        String s = this.key2;
        if(s != null) {
            v = s.hashCode();
        }
        return this.filter.hashCode() + f.b((v1 * 0x1F + v) * 0x1F, 0x1F, this.domain);
    }

    @Override
    public String toString() {
        return e.i(e.j("FrontendDomainValueFilters(key1=", this.key1, ", key2=", this.key2, ", domain="), this.domain, ", filter=", this.filter, ")");
    }
}

