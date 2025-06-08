package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J5\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendDataPointAggregateScopes;", "", "scope", "", "query", "extraData", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getExtraData", "()Ljava/lang/String;", "getQuery", "getScope", "getSortIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendDataPointAggregateScopes {
    private final String extraData;
    private final String query;
    private final String scope;
    private final int sortIndex;

    public FrontendDataPointAggregateScopes(String s, String s1, String s2, int v) {
        j.f(s, "scope");
        super();
        this.scope = s;
        this.query = s1;
        this.extraData = s2;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.scope;
    }

    public final String component2() {
        return this.query;
    }

    public final String component3() {
        return this.extraData;
    }

    public final int component4() {
        return this.sortIndex;
    }

    public final FrontendDataPointAggregateScopes copy(String s, String s1, String s2, int v) {
        j.f(s, "scope");
        return new FrontendDataPointAggregateScopes(s, s1, s2, v);
    }

    public static FrontendDataPointAggregateScopes copy$default(FrontendDataPointAggregateScopes frontendDataPointAggregateScopes0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendDataPointAggregateScopes0.scope;
        }
        if((v1 & 2) != 0) {
            s1 = frontendDataPointAggregateScopes0.query;
        }
        if((v1 & 4) != 0) {
            s2 = frontendDataPointAggregateScopes0.extraData;
        }
        if((v1 & 8) != 0) {
            v = frontendDataPointAggregateScopes0.sortIndex;
        }
        return frontendDataPointAggregateScopes0.copy(s, s1, s2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendDataPointAggregateScopes)) {
            return false;
        }
        if(!j.a(this.scope, ((FrontendDataPointAggregateScopes)object0).scope)) {
            return false;
        }
        if(!j.a(this.query, ((FrontendDataPointAggregateScopes)object0).query)) {
            return false;
        }
        return j.a(this.extraData, ((FrontendDataPointAggregateScopes)object0).extraData) ? this.sortIndex == ((FrontendDataPointAggregateScopes)object0).sortIndex : false;
    }

    public final String getExtraData() {
        return this.extraData;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getScope() {
        return this.scope;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = this.scope.hashCode();
        int v1 = 0;
        int v2 = this.query == null ? 0 : this.query.hashCode();
        String s = this.extraData;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v1) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        return f.l(e.j("FrontendDataPointAggregateScopes(scope=", this.scope, ", query=", this.query, ", extraData="), this.sortIndex, this.extraData, ", sortIndex=", ")");
    }
}

