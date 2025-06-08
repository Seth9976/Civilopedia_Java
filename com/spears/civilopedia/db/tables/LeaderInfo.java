package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/LeaderInfo;", "", "leaderType", "", "header", "caption", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCaption", "()Ljava/lang/String;", "getHeader", "getLeaderType", "getSortIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LeaderInfo {
    private final String caption;
    private final String header;
    private final String leaderType;
    private final int sortIndex;

    public LeaderInfo(String s, String s1, String s2, int v) {
        j.f(s, "leaderType");
        j.f(s1, "header");
        j.f(s2, "caption");
        super();
        this.leaderType = s;
        this.header = s1;
        this.caption = s2;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.leaderType;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.caption;
    }

    public final int component4() {
        return this.sortIndex;
    }

    public final LeaderInfo copy(String s, String s1, String s2, int v) {
        j.f(s, "leaderType");
        j.f(s1, "header");
        j.f(s2, "caption");
        return new LeaderInfo(s, s1, s2, v);
    }

    public static LeaderInfo copy$default(LeaderInfo leaderInfo0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = leaderInfo0.leaderType;
        }
        if((v1 & 2) != 0) {
            s1 = leaderInfo0.header;
        }
        if((v1 & 4) != 0) {
            s2 = leaderInfo0.caption;
        }
        if((v1 & 8) != 0) {
            v = leaderInfo0.sortIndex;
        }
        return leaderInfo0.copy(s, s1, s2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LeaderInfo)) {
            return false;
        }
        if(!j.a(this.leaderType, ((LeaderInfo)object0).leaderType)) {
            return false;
        }
        if(!j.a(this.header, ((LeaderInfo)object0).header)) {
            return false;
        }
        return j.a(this.caption, ((LeaderInfo)object0).caption) ? this.sortIndex == ((LeaderInfo)object0).sortIndex : false;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        return f.b(f.b(this.leaderType.hashCode() * 0x1F, 0x1F, this.header), 0x1F, this.caption) + this.sortIndex;
    }

    @Override
    public String toString() {
        return f.l(e.j("LeaderInfo(leaderType=", this.leaderType, ", header=", this.header, ", caption="), this.sortIndex, this.caption, ", sortIndex=", ")");
    }
}

