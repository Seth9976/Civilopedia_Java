package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J)\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendLeaderQuotes;", "", "leaderDomain", "", "leaderType", "quote", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLeaderDomain", "()Ljava/lang/String;", "getLeaderType", "getQuote", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendLeaderQuotes {
    private final String leaderDomain;
    private final String leaderType;
    private final String quote;

    public FrontendLeaderQuotes(String s, String s1, String s2) {
        j.f(s1, "leaderType");
        j.f(s2, "quote");
        super();
        this.leaderDomain = s;
        this.leaderType = s1;
        this.quote = s2;
    }

    public final String component1() {
        return this.leaderDomain;
    }

    public final String component2() {
        return this.leaderType;
    }

    public final String component3() {
        return this.quote;
    }

    public final FrontendLeaderQuotes copy(String s, String s1, String s2) {
        j.f(s1, "leaderType");
        j.f(s2, "quote");
        return new FrontendLeaderQuotes(s, s1, s2);
    }

    public static FrontendLeaderQuotes copy$default(FrontendLeaderQuotes frontendLeaderQuotes0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendLeaderQuotes0.leaderDomain;
        }
        if((v & 2) != 0) {
            s1 = frontendLeaderQuotes0.leaderType;
        }
        if((v & 4) != 0) {
            s2 = frontendLeaderQuotes0.quote;
        }
        return frontendLeaderQuotes0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendLeaderQuotes)) {
            return false;
        }
        if(!j.a(this.leaderDomain, ((FrontendLeaderQuotes)object0).leaderDomain)) {
            return false;
        }
        return j.a(this.leaderType, ((FrontendLeaderQuotes)object0).leaderType) ? j.a(this.quote, ((FrontendLeaderQuotes)object0).quote) : false;
    }

    public final String getLeaderDomain() {
        return this.leaderDomain;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final String getQuote() {
        return this.quote;
    }

    @Override
    public int hashCode() {
        return this.leaderDomain == null ? this.quote.hashCode() + f.b(0, 0x1F, this.leaderType) : this.quote.hashCode() + f.b(this.leaderDomain.hashCode() * 0x1F, 0x1F, this.leaderType);
    }

    @Override
    public String toString() {
        return e.h(e.j("FrontendLeaderQuotes(leaderDomain=", this.leaderDomain, ", leaderType=", this.leaderType, ", quote="), this.quote, ")");
    }
}

