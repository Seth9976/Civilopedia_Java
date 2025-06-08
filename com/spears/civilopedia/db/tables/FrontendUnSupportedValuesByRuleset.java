package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J8\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0005HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendUnSupportedValuesByRuleset;", "", "rulesetType", "", "playerID", "", "domain", "value", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getPlayerID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRulesetType", "getValue", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/FrontendUnSupportedValuesByRuleset;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendUnSupportedValuesByRuleset {
    private final String domain;
    private final Integer playerID;
    private final String rulesetType;
    private final String value;

    public FrontendUnSupportedValuesByRuleset(String s, Integer integer0, String s1, String s2) {
        j.f(s, "rulesetType");
        j.f(s1, "domain");
        j.f(s2, "value");
        super();
        this.rulesetType = s;
        this.playerID = integer0;
        this.domain = s1;
        this.value = s2;
    }

    public final String component1() {
        return this.rulesetType;
    }

    public final Integer component2() {
        return this.playerID;
    }

    public final String component3() {
        return this.domain;
    }

    public final String component4() {
        return this.value;
    }

    public final FrontendUnSupportedValuesByRuleset copy(String s, Integer integer0, String s1, String s2) {
        j.f(s, "rulesetType");
        j.f(s1, "domain");
        j.f(s2, "value");
        return new FrontendUnSupportedValuesByRuleset(s, integer0, s1, s2);
    }

    public static FrontendUnSupportedValuesByRuleset copy$default(FrontendUnSupportedValuesByRuleset frontendUnSupportedValuesByRuleset0, String s, Integer integer0, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendUnSupportedValuesByRuleset0.rulesetType;
        }
        if((v & 2) != 0) {
            integer0 = frontendUnSupportedValuesByRuleset0.playerID;
        }
        if((v & 4) != 0) {
            s1 = frontendUnSupportedValuesByRuleset0.domain;
        }
        if((v & 8) != 0) {
            s2 = frontendUnSupportedValuesByRuleset0.value;
        }
        return frontendUnSupportedValuesByRuleset0.copy(s, integer0, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendUnSupportedValuesByRuleset)) {
            return false;
        }
        if(!j.a(this.rulesetType, ((FrontendUnSupportedValuesByRuleset)object0).rulesetType)) {
            return false;
        }
        if(!j.a(this.playerID, ((FrontendUnSupportedValuesByRuleset)object0).playerID)) {
            return false;
        }
        return j.a(this.domain, ((FrontendUnSupportedValuesByRuleset)object0).domain) ? j.a(this.value, ((FrontendUnSupportedValuesByRuleset)object0).value) : false;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final Integer getPlayerID() {
        return this.playerID;
    }

    public final String getRulesetType() {
        return this.rulesetType;
    }

    public final String getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = this.rulesetType.hashCode();
        return this.playerID == null ? this.value.hashCode() + f.b(v * 961, 0x1F, this.domain) : this.value.hashCode() + f.b((v * 0x1F + this.playerID.hashCode()) * 0x1F, 0x1F, this.domain);
    }

    @Override
    public String toString() {
        return e.i(u9.i("FrontendUnSupportedValuesByRuleset(rulesetType=", this.rulesetType, ", playerID=", this.playerID, ", domain="), this.domain, ", value=", this.value, ")");
    }
}

