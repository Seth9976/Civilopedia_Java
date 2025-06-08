package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\bHÆ\u0003J;\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\bHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendTurnPhases;", "", "domain", "", "turnPhaseType", "name", "description", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getDomain", "getName", "getSortIndex", "()I", "getTurnPhaseType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendTurnPhases {
    private final String description;
    private final String domain;
    private final String name;
    private final int sortIndex;
    private final String turnPhaseType;

    public FrontendTurnPhases(String s, String s1, String s2, String s3, int v) {
        j.f(s, "domain");
        j.f(s1, "turnPhaseType");
        j.f(s2, "name");
        j.f(s3, "description");
        super();
        this.domain = s;
        this.turnPhaseType = s1;
        this.name = s2;
        this.description = s3;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.turnPhaseType;
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

    public final FrontendTurnPhases copy(String s, String s1, String s2, String s3, int v) {
        j.f(s, "domain");
        j.f(s1, "turnPhaseType");
        j.f(s2, "name");
        j.f(s3, "description");
        return new FrontendTurnPhases(s, s1, s2, s3, v);
    }

    public static FrontendTurnPhases copy$default(FrontendTurnPhases frontendTurnPhases0, String s, String s1, String s2, String s3, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendTurnPhases0.domain;
        }
        if((v1 & 2) != 0) {
            s1 = frontendTurnPhases0.turnPhaseType;
        }
        if((v1 & 4) != 0) {
            s2 = frontendTurnPhases0.name;
        }
        if((v1 & 8) != 0) {
            s3 = frontendTurnPhases0.description;
        }
        if((v1 & 16) != 0) {
            v = frontendTurnPhases0.sortIndex;
        }
        return frontendTurnPhases0.copy(s, s1, s2, s3, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendTurnPhases)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendTurnPhases)object0).domain)) {
            return false;
        }
        if(!j.a(this.turnPhaseType, ((FrontendTurnPhases)object0).turnPhaseType)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendTurnPhases)object0).name)) {
            return false;
        }
        return j.a(this.description, ((FrontendTurnPhases)object0).description) ? this.sortIndex == ((FrontendTurnPhases)object0).sortIndex : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final String getTurnPhaseType() {
        return this.turnPhaseType;
    }

    @Override
    public int hashCode() {
        return f.b(f.b(f.b(this.domain.hashCode() * 0x1F, 0x1F, this.turnPhaseType), 0x1F, this.name), 0x1F, this.description) + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendTurnPhases(domain=", this.domain, ", turnPhaseType=", this.turnPhaseType, ", name=");
        f.t(stringBuilder0, this.name, ", description=", this.description, ", sortIndex=");
        return e.g(stringBuilder0, this.sortIndex, ")");
    }
}

