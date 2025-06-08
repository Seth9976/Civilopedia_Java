package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\t\u0010\u000E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u000F"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendDomainRanges;", "", "domain", "", "(Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendDomainRanges {
    private final String domain;

    public FrontendDomainRanges(String s) {
        j.f(s, "domain");
        super();
        this.domain = s;
    }

    public final String component1() {
        return this.domain;
    }

    public final FrontendDomainRanges copy(String s) {
        j.f(s, "domain");
        return new FrontendDomainRanges(s);
    }

    public static FrontendDomainRanges copy$default(FrontendDomainRanges frontendDomainRanges0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendDomainRanges0.domain;
        }
        return frontendDomainRanges0.copy(s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FrontendDomainRanges ? j.a(this.domain, ((FrontendDomainRanges)object0).domain) : false;
    }

    public final String getDomain() {
        return this.domain;
    }

    @Override
    public int hashCode() {
        return this.domain.hashCode();
    }

    @Override
    public String toString() {
        return e.f("FrontendDomainRanges(domain=", this.domain, ")");
    }
}

