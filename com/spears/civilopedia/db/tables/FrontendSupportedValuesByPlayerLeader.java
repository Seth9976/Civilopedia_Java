package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000FJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003JB\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendSupportedValuesByPlayerLeader;", "", "leaderDomain", "", "leaderType", "playerID", "", "domain", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getLeaderDomain", "getLeaderType", "getPlayerID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/FrontendSupportedValuesByPlayerLeader;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendSupportedValuesByPlayerLeader {
    private final String domain;
    private final String leaderDomain;
    private final String leaderType;
    private final Integer playerID;
    private final String value;

    public FrontendSupportedValuesByPlayerLeader(String s, String s1, Integer integer0, String s2, String s3) {
        j.f(s, "leaderDomain");
        j.f(s1, "leaderType");
        j.f(s2, "domain");
        j.f(s3, "value");
        super();
        this.leaderDomain = s;
        this.leaderType = s1;
        this.playerID = integer0;
        this.domain = s2;
        this.value = s3;
    }

    public final String component1() {
        return this.leaderDomain;
    }

    public final String component2() {
        return this.leaderType;
    }

    public final Integer component3() {
        return this.playerID;
    }

    public final String component4() {
        return this.domain;
    }

    public final String component5() {
        return this.value;
    }

    public final FrontendSupportedValuesByPlayerLeader copy(String s, String s1, Integer integer0, String s2, String s3) {
        j.f(s, "leaderDomain");
        j.f(s1, "leaderType");
        j.f(s2, "domain");
        j.f(s3, "value");
        return new FrontendSupportedValuesByPlayerLeader(s, s1, integer0, s2, s3);
    }

    public static FrontendSupportedValuesByPlayerLeader copy$default(FrontendSupportedValuesByPlayerLeader frontendSupportedValuesByPlayerLeader0, String s, String s1, Integer integer0, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendSupportedValuesByPlayerLeader0.leaderDomain;
        }
        if((v & 2) != 0) {
            s1 = frontendSupportedValuesByPlayerLeader0.leaderType;
        }
        if((v & 4) != 0) {
            integer0 = frontendSupportedValuesByPlayerLeader0.playerID;
        }
        if((v & 8) != 0) {
            s2 = frontendSupportedValuesByPlayerLeader0.domain;
        }
        if((v & 16) != 0) {
            s3 = frontendSupportedValuesByPlayerLeader0.value;
        }
        return frontendSupportedValuesByPlayerLeader0.copy(s, s1, integer0, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendSupportedValuesByPlayerLeader)) {
            return false;
        }
        if(!j.a(this.leaderDomain, ((FrontendSupportedValuesByPlayerLeader)object0).leaderDomain)) {
            return false;
        }
        if(!j.a(this.leaderType, ((FrontendSupportedValuesByPlayerLeader)object0).leaderType)) {
            return false;
        }
        if(!j.a(this.playerID, ((FrontendSupportedValuesByPlayerLeader)object0).playerID)) {
            return false;
        }
        return j.a(this.domain, ((FrontendSupportedValuesByPlayerLeader)object0).domain) ? j.a(this.value, ((FrontendSupportedValuesByPlayerLeader)object0).value) : false;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getLeaderDomain() {
        return this.leaderDomain;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final Integer getPlayerID() {
        return this.playerID;
    }

    public final String getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.leaderDomain.hashCode() * 0x1F, 0x1F, this.leaderType);
        return this.playerID == null ? this.value.hashCode() + f.b(v * 0x1F, 0x1F, this.domain) : this.value.hashCode() + f.b((v + this.playerID.hashCode()) * 0x1F, 0x1F, this.domain);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendSupportedValuesByPlayerLeader(leaderDomain=", this.leaderDomain, ", leaderType=", this.leaderType, ", playerID=");
        e.l(this.playerID, ", domain=", this.domain, ", value=", stringBuilder0);
        return e.h(stringBuilder0, this.value, ")");
    }
}

