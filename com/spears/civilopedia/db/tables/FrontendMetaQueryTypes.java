package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0006\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001A\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000B\u0010\u0007J\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendMetaQueryTypes;", "Lo2/m;", "", "metaQueryType", "<init>", "(Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/FrontendMetaQueryTypes;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMetaQueryType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendMetaQueryTypes implements m {
    private final String metaQueryType;

    public FrontendMetaQueryTypes(String s) {
        j.f(s, "metaQueryType");
        super();
        this.metaQueryType = s;
    }

    public final String component1() {
        return this.metaQueryType;
    }

    public final FrontendMetaQueryTypes copy(String s) {
        j.f(s, "metaQueryType");
        return new FrontendMetaQueryTypes(s);
    }

    public static FrontendMetaQueryTypes copy$default(FrontendMetaQueryTypes frontendMetaQueryTypes0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendMetaQueryTypes0.metaQueryType;
        }
        return frontendMetaQueryTypes0.copy(s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FrontendMetaQueryTypes ? j.a(this.metaQueryType, ((FrontendMetaQueryTypes)object0).metaQueryType) : false;
    }

    public final String getMetaQueryType() {
        return this.metaQueryType;
    }

    @Override
    public int hashCode() {
        return this.metaQueryType.hashCode();
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.metaQueryType;
    }

    @Override
    public String toString() {
        return e.f("FrontendMetaQueryTypes(metaQueryType=", this.metaQueryType, ")");
    }
}

