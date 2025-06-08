package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\tJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ.\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\tJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001A\u0004\b\u001B\u0010\t¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendMetaQueries;", "Lo2/m;", "", "metaQueryID", "metaQueryType", "SQL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/FrontendMetaQueries;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMetaQueryID", "getMetaQueryType", "getSQL", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendMetaQueries implements m {
    private final String SQL;
    private final String metaQueryID;
    private final String metaQueryType;

    public FrontendMetaQueries(String s, String s1, String s2) {
        j.f(s, "metaQueryID");
        j.f(s1, "metaQueryType");
        j.f(s2, "SQL");
        super();
        this.metaQueryID = s;
        this.metaQueryType = s1;
        this.SQL = s2;
    }

    public final String component1() {
        return this.metaQueryID;
    }

    public final String component2() {
        return this.metaQueryType;
    }

    public final String component3() {
        return this.SQL;
    }

    public final FrontendMetaQueries copy(String s, String s1, String s2) {
        j.f(s, "metaQueryID");
        j.f(s1, "metaQueryType");
        j.f(s2, "SQL");
        return new FrontendMetaQueries(s, s1, s2);
    }

    public static FrontendMetaQueries copy$default(FrontendMetaQueries frontendMetaQueries0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendMetaQueries0.metaQueryID;
        }
        if((v & 2) != 0) {
            s1 = frontendMetaQueries0.metaQueryType;
        }
        if((v & 4) != 0) {
            s2 = frontendMetaQueries0.SQL;
        }
        return frontendMetaQueries0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendMetaQueries)) {
            return false;
        }
        if(!j.a(this.metaQueryID, ((FrontendMetaQueries)object0).metaQueryID)) {
            return false;
        }
        return j.a(this.metaQueryType, ((FrontendMetaQueries)object0).metaQueryType) ? j.a(this.SQL, ((FrontendMetaQueries)object0).SQL) : false;
    }

    public final String getMetaQueryID() {
        return this.metaQueryID;
    }

    public final String getMetaQueryType() {
        return this.metaQueryType;
    }

    public final String getSQL() {
        return this.SQL;
    }

    @Override
    public int hashCode() {
        return this.SQL.hashCode() + f.b(this.metaQueryID.hashCode() * 0x1F, 0x1F, this.metaQueryType);
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.metaQueryID;
    }

    @Override
    public String toString() {
        return e.h(e.j("FrontendMetaQueries(metaQueryID=", this.metaQueryID, ", metaQueryType=", this.metaQueryType, ", SQL="), this.SQL, ")");
    }
}

