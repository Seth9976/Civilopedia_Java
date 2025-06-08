package com.spears.civilopedia.db.tables;

import A.f;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\nJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001A\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendInputVersion;", "Lo2/m;", "", "value", "<init>", "(I)V", "", "primaryKey", "()Ljava/lang/String;", "component1", "()I", "copy", "(I)Lcom/spears/civilopedia/db/tables/FrontendInputVersion;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getValue", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendInputVersion implements m {
    private final int value;

    public FrontendInputVersion(int v) {
        this.value = v;
    }

    public final int component1() {
        return this.value;
    }

    public final FrontendInputVersion copy(int v) {
        return new FrontendInputVersion(v);
    }

    public static FrontendInputVersion copy$default(FrontendInputVersion frontendInputVersion0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = frontendInputVersion0.value;
        }
        return frontendInputVersion0.copy(v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FrontendInputVersion ? this.value == ((FrontendInputVersion)object0).value : false;
    }

    public final int getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return this.value;
    }

    @Override  // o2.m
    public String primaryKey() {
        return "Value";
    }

    @Override
    public String toString() {
        return f.e(this.value, "FrontendInputVersion(value=", ")");
    }
}

