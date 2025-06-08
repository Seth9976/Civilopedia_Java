package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendQueryParameters;", "", "queryID", "", "index", "", "configurationGroup", "configurationKey", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getConfigurationGroup", "()Ljava/lang/String;", "getConfigurationKey", "getIndex", "()I", "getQueryID", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendQueryParameters {
    private final String configurationGroup;
    private final String configurationKey;
    private final int index;
    private final String queryID;

    public FrontendQueryParameters(String s, int v, String s1, String s2) {
        j.f(s, "queryID");
        j.f(s1, "configurationGroup");
        j.f(s2, "configurationKey");
        super();
        this.queryID = s;
        this.index = v;
        this.configurationGroup = s1;
        this.configurationKey = s2;
    }

    public final String component1() {
        return this.queryID;
    }

    public final int component2() {
        return this.index;
    }

    public final String component3() {
        return this.configurationGroup;
    }

    public final String component4() {
        return this.configurationKey;
    }

    public final FrontendQueryParameters copy(String s, int v, String s1, String s2) {
        j.f(s, "queryID");
        j.f(s1, "configurationGroup");
        j.f(s2, "configurationKey");
        return new FrontendQueryParameters(s, v, s1, s2);
    }

    public static FrontendQueryParameters copy$default(FrontendQueryParameters frontendQueryParameters0, String s, int v, String s1, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendQueryParameters0.queryID;
        }
        if((v1 & 2) != 0) {
            v = frontendQueryParameters0.index;
        }
        if((v1 & 4) != 0) {
            s1 = frontendQueryParameters0.configurationGroup;
        }
        if((v1 & 8) != 0) {
            s2 = frontendQueryParameters0.configurationKey;
        }
        return frontendQueryParameters0.copy(s, v, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendQueryParameters)) {
            return false;
        }
        if(!j.a(this.queryID, ((FrontendQueryParameters)object0).queryID)) {
            return false;
        }
        if(this.index != ((FrontendQueryParameters)object0).index) {
            return false;
        }
        return j.a(this.configurationGroup, ((FrontendQueryParameters)object0).configurationGroup) ? j.a(this.configurationKey, ((FrontendQueryParameters)object0).configurationKey) : false;
    }

    public final String getConfigurationGroup() {
        return this.configurationGroup;
    }

    public final String getConfigurationKey() {
        return this.configurationKey;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getQueryID() {
        return this.queryID;
    }

    @Override
    public int hashCode() {
        return this.configurationKey.hashCode() + f.b((this.queryID.hashCode() * 0x1F + this.index) * 0x1F, 0x1F, this.configurationGroup);
    }

    @Override
    public String toString() {
        return e.i(f.m(this.index, "FrontendQueryParameters(queryID=", this.queryID, ", index=", ", configurationGroup="), this.configurationGroup, ", configurationKey=", this.configurationKey, ")");
    }
}

