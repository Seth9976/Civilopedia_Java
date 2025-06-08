package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7TradeYields;", "", "domain", "", "resourceCount", "", "amount", "yieldType", "(Ljava/lang/String;IILjava/lang/String;)V", "getAmount", "()I", "getDomain", "()Ljava/lang/String;", "getResourceCount", "getYieldType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7TradeYields {
    private final int amount;
    private final String domain;
    private final int resourceCount;
    private final String yieldType;

    public Civ7TradeYields(String s, int v, int v1, String s1) {
        j.f(s, "domain");
        j.f(s1, "yieldType");
        super();
        this.domain = s;
        this.resourceCount = v;
        this.amount = v1;
        this.yieldType = s1;
    }

    public final String component1() {
        return this.domain;
    }

    public final int component2() {
        return this.resourceCount;
    }

    public final int component3() {
        return this.amount;
    }

    public final String component4() {
        return this.yieldType;
    }

    public final Civ7TradeYields copy(String s, int v, int v1, String s1) {
        j.f(s, "domain");
        j.f(s1, "yieldType");
        return new Civ7TradeYields(s, v, v1, s1);
    }

    public static Civ7TradeYields copy$default(Civ7TradeYields civ7TradeYields0, String s, int v, int v1, String s1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7TradeYields0.domain;
        }
        if((v2 & 2) != 0) {
            v = civ7TradeYields0.resourceCount;
        }
        if((v2 & 4) != 0) {
            v1 = civ7TradeYields0.amount;
        }
        if((v2 & 8) != 0) {
            s1 = civ7TradeYields0.yieldType;
        }
        return civ7TradeYields0.copy(s, v, v1, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7TradeYields)) {
            return false;
        }
        if(!j.a(this.domain, ((Civ7TradeYields)object0).domain)) {
            return false;
        }
        if(this.resourceCount != ((Civ7TradeYields)object0).resourceCount) {
            return false;
        }
        return this.amount == ((Civ7TradeYields)object0).amount ? j.a(this.yieldType, ((Civ7TradeYields)object0).yieldType) : false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final int getResourceCount() {
        return this.resourceCount;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        return this.yieldType.hashCode() + ((this.domain.hashCode() * 0x1F + this.resourceCount) * 0x1F + this.amount) * 0x1F;
    }

    @Override
    public String toString() {
        return u9.e(f.m(this.resourceCount, "Civ7TradeYields(domain=", this.domain, ", resourceCount=", ", amount="), this.amount, ", yieldType=", this.yieldType, ")");
    }
}

