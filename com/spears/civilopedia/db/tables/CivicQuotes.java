package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/CivicQuotes;", "", "civicType", "", "quote", "quoteAudio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCivicType", "()Ljava/lang/String;", "getQuote", "getQuoteAudio", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CivicQuotes {
    private final String civicType;
    private final String quote;
    private final String quoteAudio;

    public CivicQuotes(String s, String s1, String s2) {
        j.f(s, "civicType");
        j.f(s1, "quote");
        super();
        this.civicType = s;
        this.quote = s1;
        this.quoteAudio = s2;
    }

    public final String component1() {
        return this.civicType;
    }

    public final String component2() {
        return this.quote;
    }

    public final String component3() {
        return this.quoteAudio;
    }

    public final CivicQuotes copy(String s, String s1, String s2) {
        j.f(s, "civicType");
        j.f(s1, "quote");
        return new CivicQuotes(s, s1, s2);
    }

    public static CivicQuotes copy$default(CivicQuotes civicQuotes0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civicQuotes0.civicType;
        }
        if((v & 2) != 0) {
            s1 = civicQuotes0.quote;
        }
        if((v & 4) != 0) {
            s2 = civicQuotes0.quoteAudio;
        }
        return civicQuotes0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CivicQuotes)) {
            return false;
        }
        if(!j.a(this.civicType, ((CivicQuotes)object0).civicType)) {
            return false;
        }
        return j.a(this.quote, ((CivicQuotes)object0).quote) ? j.a(this.quoteAudio, ((CivicQuotes)object0).quoteAudio) : false;
    }

    public final String getCivicType() {
        return this.civicType;
    }

    public final String getQuote() {
        return this.quote;
    }

    public final String getQuoteAudio() {
        return this.quoteAudio;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.civicType.hashCode() * 0x1F, 0x1F, this.quote);
        return this.quoteAudio == null ? v : v + this.quoteAudio.hashCode();
    }

    @Override
    public String toString() {
        return e.h(e.j("CivicQuotes(civicType=", this.civicType, ", quote=", this.quote, ", quoteAudio="), this.quoteAudio, ")");
    }
}

