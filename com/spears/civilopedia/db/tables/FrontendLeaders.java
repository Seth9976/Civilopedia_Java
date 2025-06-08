package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001A\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JN\u0010\u001A\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001F\u001A\u00020\tHÖ\u0001J\t\u0010 \u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0015\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendLeaders;", "", "domain", "", "leaderType", "leaderName", "leaderDescription", "leaderIcon", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDomain", "()Ljava/lang/String;", "getLeaderDescription", "getLeaderIcon", "getLeaderName", "getLeaderType", "getSortIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/FrontendLeaders;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendLeaders {
    private final String domain;
    private final String leaderDescription;
    private final String leaderIcon;
    private final String leaderName;
    private final String leaderType;
    private final Integer sortIndex;

    public FrontendLeaders(String s, String s1, String s2, String s3, String s4, Integer integer0) {
        j.f(s1, "leaderType");
        j.f(s2, "leaderName");
        j.f(s3, "leaderDescription");
        j.f(s4, "leaderIcon");
        super();
        this.domain = s;
        this.leaderType = s1;
        this.leaderName = s2;
        this.leaderDescription = s3;
        this.leaderIcon = s4;
        this.sortIndex = integer0;
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.leaderType;
    }

    public final String component3() {
        return this.leaderName;
    }

    public final String component4() {
        return this.leaderDescription;
    }

    public final String component5() {
        return this.leaderIcon;
    }

    public final Integer component6() {
        return this.sortIndex;
    }

    public final FrontendLeaders copy(String s, String s1, String s2, String s3, String s4, Integer integer0) {
        j.f(s1, "leaderType");
        j.f(s2, "leaderName");
        j.f(s3, "leaderDescription");
        j.f(s4, "leaderIcon");
        return new FrontendLeaders(s, s1, s2, s3, s4, integer0);
    }

    public static FrontendLeaders copy$default(FrontendLeaders frontendLeaders0, String s, String s1, String s2, String s3, String s4, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendLeaders0.domain;
        }
        if((v & 2) != 0) {
            s1 = frontendLeaders0.leaderType;
        }
        if((v & 4) != 0) {
            s2 = frontendLeaders0.leaderName;
        }
        if((v & 8) != 0) {
            s3 = frontendLeaders0.leaderDescription;
        }
        if((v & 16) != 0) {
            s4 = frontendLeaders0.leaderIcon;
        }
        if((v & 0x20) != 0) {
            integer0 = frontendLeaders0.sortIndex;
        }
        return frontendLeaders0.copy(s, s1, s2, s3, s4, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendLeaders)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendLeaders)object0).domain)) {
            return false;
        }
        if(!j.a(this.leaderType, ((FrontendLeaders)object0).leaderType)) {
            return false;
        }
        if(!j.a(this.leaderName, ((FrontendLeaders)object0).leaderName)) {
            return false;
        }
        if(!j.a(this.leaderDescription, ((FrontendLeaders)object0).leaderDescription)) {
            return false;
        }
        return j.a(this.leaderIcon, ((FrontendLeaders)object0).leaderIcon) ? j.a(this.sortIndex, ((FrontendLeaders)object0).sortIndex) : false;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getLeaderDescription() {
        return this.leaderDescription;
    }

    public final String getLeaderIcon() {
        return this.leaderIcon;
    }

    public final String getLeaderName() {
        return this.leaderName;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final Integer getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(f.b(f.b(f.b((this.domain == null ? 0 : this.domain.hashCode()) * 0x1F, 0x1F, this.leaderType), 0x1F, this.leaderName), 0x1F, this.leaderDescription), 0x1F, this.leaderIcon);
        Integer integer0 = this.sortIndex;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendLeaders(domain=", this.domain, ", leaderType=", this.leaderType, ", leaderName=");
        f.t(stringBuilder0, this.leaderName, ", leaderDescription=", this.leaderDescription, ", leaderIcon=");
        return u9.d(this.sortIndex, this.leaderIcon, ", sortIndex=", ")", stringBuilder0);
    }
}

