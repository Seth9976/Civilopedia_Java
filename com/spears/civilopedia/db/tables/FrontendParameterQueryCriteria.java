package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendParameterQueryCriteria;", "", "parameterQueryID", "", "configurationGroup", "configurationKey", "operator", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfigurationGroup", "()Ljava/lang/String;", "getConfigurationKey", "getOperator", "getParameterQueryID", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendParameterQueryCriteria {
    private final String configurationGroup;
    private final String configurationKey;
    private final String operator;
    private final String parameterQueryID;

    public FrontendParameterQueryCriteria(String s, String s1, String s2, String s3) {
        j.f(s, "parameterQueryID");
        j.f(s1, "configurationGroup");
        j.f(s2, "configurationKey");
        j.f(s3, "operator");
        super();
        this.parameterQueryID = s;
        this.configurationGroup = s1;
        this.configurationKey = s2;
        this.operator = s3;
    }

    public final String component1() {
        return this.parameterQueryID;
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

    public final FrontendParameterQueryCriteria copy(String s, String s1, String s2, String s3) {
        j.f(s, "parameterQueryID");
        j.f(s1, "configurationGroup");
        j.f(s2, "configurationKey");
        j.f(s3, "operator");
        return new FrontendParameterQueryCriteria(s, s1, s2, s3);
    }

    public static FrontendParameterQueryCriteria copy$default(FrontendParameterQueryCriteria frontendParameterQueryCriteria0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendParameterQueryCriteria0.parameterQueryID;
        }
        if((v & 2) != 0) {
            s1 = frontendParameterQueryCriteria0.configurationGroup;
        }
        if((v & 4) != 0) {
            s2 = frontendParameterQueryCriteria0.configurationKey;
        }
        if((v & 8) != 0) {
            s3 = frontendParameterQueryCriteria0.operator;
        }
        return frontendParameterQueryCriteria0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendParameterQueryCriteria)) {
            return false;
        }
        if(!j.a(this.parameterQueryID, ((FrontendParameterQueryCriteria)object0).parameterQueryID)) {
            return false;
        }
        if(!j.a(this.configurationGroup, ((FrontendParameterQueryCriteria)object0).configurationGroup)) {
            return false;
        }
        return j.a(this.configurationKey, ((FrontendParameterQueryCriteria)object0).configurationKey) ? j.a(this.operator, ((FrontendParameterQueryCriteria)object0).operator) : false;
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

    public final String getParameterQueryID() {
        return this.parameterQueryID;
    }

    @Override
    public int hashCode() {
        return this.operator.hashCode() + f.b(f.b(this.parameterQueryID.hashCode() * 0x1F, 0x1F, this.configurationGroup), 0x1F, this.configurationKey);
    }

    @Override
    public String toString() {
        return e.i(e.j("FrontendParameterQueryCriteria(parameterQueryID=", this.parameterQueryID, ", configurationGroup=", this.configurationGroup, ", configurationKey="), this.configurationKey, ", operator=", this.operator, ")");
    }
}

