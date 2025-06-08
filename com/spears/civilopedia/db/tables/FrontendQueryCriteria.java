package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendQueryCriteria;", "", "queryID", "", "configurationGroup", "configurationKey", "operator", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfigurationGroup", "()Ljava/lang/String;", "getConfigurationKey", "getOperator", "getQueryID", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendQueryCriteria {
    private final String configurationGroup;
    private final String configurationKey;
    private final String operator;
    private final String queryID;

    public FrontendQueryCriteria(String s, String s1, String s2, String s3) {
        j.f(s, "queryID");
        j.f(s1, "configurationGroup");
        j.f(s2, "configurationKey");
        j.f(s3, "operator");
        super();
        this.queryID = s;
        this.configurationGroup = s1;
        this.configurationKey = s2;
        this.operator = s3;
    }

    public final String component1() {
        return this.queryID;
    }

    public final String component2() {
        return this.configurationGroup;
    }

    public final String component3() {
        return this.configurationKey;
    }

    public final String component4() {
        return this.operator;
    }

    public final FrontendQueryCriteria copy(String s, String s1, String s2, String s3) {
        j.f(s, "queryID");
        j.f(s1, "configurationGroup");
        j.f(s2, "configurationKey");
        j.f(s3, "operator");
        return new FrontendQueryCriteria(s, s1, s2, s3);
    }

    public static FrontendQueryCriteria copy$default(FrontendQueryCriteria frontendQueryCriteria0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendQueryCriteria0.queryID;
        }
        if((v & 2) != 0) {
            s1 = frontendQueryCriteria0.configurationGroup;
        }
        if((v & 4) != 0) {
            s2 = frontendQueryCriteria0.configurationKey;
        }
        if((v & 8) != 0) {
            s3 = frontendQueryCriteria0.operator;
        }
        return frontendQueryCriteria0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendQueryCriteria)) {
            return false;
        }
        if(!j.a(this.queryID, ((FrontendQueryCriteria)object0).queryID)) {
            return false;
        }
        if(!j.a(this.configurationGroup, ((FrontendQueryCriteria)object0).configurationGroup)) {
            return false;
        }
        return j.a(this.configurationKey, ((FrontendQueryCriteria)object0).configurationKey) ? j.a(this.operator, ((FrontendQueryCriteria)object0).operator) : false;
    }

    public final String getConfigurationGroup() {
        return this.configurationGroup;
    }

    public final String getConfigurationKey() {
        return this.configurationKey;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final String getQueryID() {
        return this.queryID;
    }

    @Override
    public int hashCode() {
        return this.operator.hashCode() + f.b(f.b(this.queryID.hashCode() * 0x1F, 0x1F, this.configurationGroup), 0x1F, this.configurationKey);
    }

    @Override
    public String toString() {
        return e.i(e.j("FrontendQueryCriteria(queryID=", this.queryID, ", configurationGroup=", this.configurationGroup, ", configurationKey="), this.configurationKey, ", operator=", this.operator, ")");
    }
}

