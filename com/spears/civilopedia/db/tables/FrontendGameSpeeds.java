package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\bHÆ\u0003J?\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\bHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendGameSpeeds;", "", "domain", "", "gameSpeedType", "name", "description", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getDomain", "getGameSpeedType", "getName", "getSortIndex", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendGameSpeeds {
    private final String description;
    private final String domain;
    private final String gameSpeedType;
    private final String name;
    private final int sortIndex;

    public FrontendGameSpeeds(String s, String s1, String s2, String s3, int v) {
        j.f(s, "domain");
        j.f(s1, "gameSpeedType");
        super();
        this.domain = s;
        this.gameSpeedType = s1;
        this.name = s2;
        this.description = s3;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.gameSpeedType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final int component5() {
        return this.sortIndex;
    }

    public final FrontendGameSpeeds copy(String s, String s1, String s2, String s3, int v) {
        j.f(s, "domain");
        j.f(s1, "gameSpeedType");
        return new FrontendGameSpeeds(s, s1, s2, s3, v);
    }

    public static FrontendGameSpeeds copy$default(FrontendGameSpeeds frontendGameSpeeds0, String s, String s1, String s2, String s3, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendGameSpeeds0.domain;
        }
        if((v1 & 2) != 0) {
            s1 = frontendGameSpeeds0.gameSpeedType;
        }
        if((v1 & 4) != 0) {
            s2 = frontendGameSpeeds0.name;
        }
        if((v1 & 8) != 0) {
            s3 = frontendGameSpeeds0.description;
        }
        if((v1 & 16) != 0) {
            v = frontendGameSpeeds0.sortIndex;
        }
        return frontendGameSpeeds0.copy(s, s1, s2, s3, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendGameSpeeds)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendGameSpeeds)object0).domain)) {
            return false;
        }
        if(!j.a(this.gameSpeedType, ((FrontendGameSpeeds)object0).gameSpeedType)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendGameSpeeds)object0).name)) {
            return false;
        }
        return j.a(this.description, ((FrontendGameSpeeds)object0).description) ? this.sortIndex == ((FrontendGameSpeeds)object0).sortIndex : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getGameSpeedType() {
        return this.gameSpeedType;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.domain.hashCode() * 0x1F, 0x1F, this.gameSpeedType);
        int v1 = 0;
        int v2 = this.name == null ? 0 : this.name.hashCode();
        String s = this.description;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + v2) * 0x1F + v1) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendGameSpeeds(domain=", this.domain, ", gameSpeedType=", this.gameSpeedType, ", name=");
        f.t(stringBuilder0, this.name, ", description=", this.description, ", sortIndex=");
        return e.g(stringBuilder0, this.sortIndex, ")");
    }
}

