package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001A\u00020\n¢\u0006\u0002\u0010\u000BJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001B\u001A\u00020\nHÆ\u0003JU\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001A\u00020\nHÆ\u0001J\u0013\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001A\u00020\nHÖ\u0001J\t\u0010!\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\rR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendDataPointAggregateUpdates;", "", "aggregateDataPoint", "", "scope", "operation", "query", "dataPoint", "extraData", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAggregateDataPoint", "()Ljava/lang/String;", "getDataPoint", "getExtraData", "getOperation", "getQuery", "getScope", "getSortIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendDataPointAggregateUpdates {
    private final String aggregateDataPoint;
    private final String dataPoint;
    private final String extraData;
    private final String operation;
    private final String query;
    private final String scope;
    private final int sortIndex;

    public FrontendDataPointAggregateUpdates(String s, String s1, String s2, String s3, String s4, String s5, int v) {
        j.f(s, "aggregateDataPoint");
        j.f(s1, "scope");
        j.f(s2, "operation");
        super();
        this.aggregateDataPoint = s;
        this.scope = s1;
        this.operation = s2;
        this.query = s3;
        this.dataPoint = s4;
        this.extraData = s5;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.aggregateDataPoint;
    }

    public final String component2() {
        return this.scope;
    }

    public final String component3() {
        return this.operation;
    }

    public final String component4() {
        return this.query;
    }

    public final String component5() {
        return this.dataPoint;
    }

    public final String component6() {
        return this.extraData;
    }

    public final int component7() {
        return this.sortIndex;
    }

    public final FrontendDataPointAggregateUpdates copy(String s, String s1, String s2, String s3, String s4, String s5, int v) {
        j.f(s, "aggregateDataPoint");
        j.f(s1, "scope");
        j.f(s2, "operation");
        return new FrontendDataPointAggregateUpdates(s, s1, s2, s3, s4, s5, v);
    }

    public static FrontendDataPointAggregateUpdates copy$default(FrontendDataPointAggregateUpdates frontendDataPointAggregateUpdates0, String s, String s1, String s2, String s3, String s4, String s5, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendDataPointAggregateUpdates0.aggregateDataPoint;
        }
        if((v1 & 2) != 0) {
            s1 = frontendDataPointAggregateUpdates0.scope;
        }
        if((v1 & 4) != 0) {
            s2 = frontendDataPointAggregateUpdates0.operation;
        }
        if((v1 & 8) != 0) {
            s3 = frontendDataPointAggregateUpdates0.query;
        }
        if((v1 & 16) != 0) {
            s4 = frontendDataPointAggregateUpdates0.dataPoint;
        }
        if((v1 & 0x20) != 0) {
            s5 = frontendDataPointAggregateUpdates0.extraData;
        }
        if((v1 & 0x40) != 0) {
            v = frontendDataPointAggregateUpdates0.sortIndex;
        }
        return frontendDataPointAggregateUpdates0.copy(s, s1, s2, s3, s4, s5, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendDataPointAggregateUpdates)) {
            return false;
        }
        if(!j.a(this.aggregateDataPoint, ((FrontendDataPointAggregateUpdates)object0).aggregateDataPoint)) {
            return false;
        }
        if(!j.a(this.scope, ((FrontendDataPointAggregateUpdates)object0).scope)) {
            return false;
        }
        if(!j.a(this.operation, ((FrontendDataPointAggregateUpdates)object0).operation)) {
            return false;
        }
        if(!j.a(this.query, ((FrontendDataPointAggregateUpdates)object0).query)) {
            return false;
        }
        if(!j.a(this.dataPoint, ((FrontendDataPointAggregateUpdates)object0).dataPoint)) {
            return false;
        }
        return j.a(this.extraData, ((FrontendDataPointAggregateUpdates)object0).extraData) ? this.sortIndex == ((FrontendDataPointAggregateUpdates)object0).sortIndex : false;
    }

    public final String getAggregateDataPoint() {
        return this.aggregateDataPoint;
    }

    public final String getDataPoint() {
        return this.dataPoint;
    }

    public final String getExtraData() {
        return this.extraData;
    }

    public final String getOperation() {
        return this.operation;
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
        int v = f.b(f.b(this.aggregateDataPoint.hashCode() * 0x1F, 0x1F, this.scope), 0x1F, this.operation);
        int v1 = 0;
        int v2 = this.query == null ? 0 : this.query.hashCode();
        int v3 = this.dataPoint == null ? 0 : this.dataPoint.hashCode();
        String s = this.extraData;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendDataPointAggregateUpdates(aggregateDataPoint=", this.aggregateDataPoint, ", scope=", this.scope, ", operation=");
        f.t(stringBuilder0, this.operation, ", query=", this.query, ", dataPoint=");
        f.t(stringBuilder0, this.dataPoint, ", extraData=", this.extraData, ", sortIndex=");
        return e.g(stringBuilder0, this.sortIndex, ")");
    }
}

