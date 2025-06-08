package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7TypeQuotes;", "", "type", "", "quote", "quoteAudio", "quoteAuthor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuote", "()Ljava/lang/String;", "getQuoteAudio", "getQuoteAuthor", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7TypeQuotes {
    private final String quote;
    private final String quoteAudio;
    private final String quoteAuthor;
    private final String type;

    public Civ7TypeQuotes(String s, String s1, String s2, String s3) {
        j.f(s, "type");
        j.f(s1, "quote");
        super();
        this.type = s;
        this.quote = s1;
        this.quoteAudio = s2;
        this.quoteAuthor = s3;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.quote;
    }

    public final String component3() {
        return this.quoteAudio;
    }

    public final String component4() {
        return this.quoteAuthor;
    }

    public final Civ7TypeQuotes copy(String s, String s1, String s2, String s3) {
        j.f(s, "type");
        j.f(s1, "quote");
        return new Civ7TypeQuotes(s, s1, s2, s3);
    }

    public static Civ7TypeQuotes copy$default(Civ7TypeQuotes civ7TypeQuotes0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7TypeQuotes0.type;
        }
        if((v & 2) != 0) {
            s1 = civ7TypeQuotes0.quote;
        }
        if((v & 4) != 0) {
            s2 = civ7TypeQuotes0.quoteAudio;
        }
        if((v & 8) != 0) {
            s3 = civ7TypeQuotes0.quoteAuthor;
        }
        return civ7TypeQuotes0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7TypeQuotes)) {
            return false;
        }
        if(!j.a(this.type, ((Civ7TypeQuotes)object0).type)) {
            return false;
        }
        if(!j.a(this.quote, ((Civ7TypeQuotes)object0).quote)) {
            return false;
        }
        return j.a(this.quoteAudio, ((Civ7TypeQuotes)object0).quoteAudio) ? j.a(this.quoteAuthor, ((Civ7TypeQuotes)object0).quoteAuthor) : false;
    }

    public final String getQuote() {
        return this.quote;
    }

    public final String getQuoteAudio() {
        return this.quoteAudio;
    }

    public final String getQuoteAuthor() {
        return this.quoteAuthor;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.type.hashCode() * 0x1F, 0x1F, this.quote);
        int v1 = 0;
        int v2 = this.quoteAudio == null ? 0 : this.quoteAudio.hashCode();
        String s = this.quoteAuthor;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ7TypeQuotes(type=", this.type, ", quote=", this.quote, ", quoteAudio="), this.quoteAudio, ", quoteAuthor=", this.quoteAuthor, ")");
    }
}

