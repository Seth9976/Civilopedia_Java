package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendXrVersion;", "", "type", "", "value", "", "(Ljava/lang/String;I)V", "getType", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendXrVersion {
    private final String type;
    private final int value;

    public FrontendXrVersion(String s, int v) {
        j.f(s, "type");
        super();
        this.type = s;
        this.value = v;
    }

    public final String component1() {
        return this.type;
    }

    public final int component2() {
        return this.value;
    }

    public final FrontendXrVersion copy(String s, int v) {
        j.f(s, "type");
        return new FrontendXrVersion(s, v);
    }

    public static FrontendXrVersion copy$default(FrontendXrVersion frontendXrVersion0, String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendXrVersion0.type;
        }
        if((v1 & 2) != 0) {
            v = frontendXrVersion0.value;
        }
        return frontendXrVersion0.copy(s, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendXrVersion)) {
            return false;
        }
        return j.a(this.type, ((FrontendXrVersion)object0).type) ? this.value == ((FrontendXrVersion)object0).value : false;
    }

    public final String getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return this.type.hashCode() * 0x1F + this.value;
    }

    @Override
    public String toString() {
        return f.f(this.value, "FrontendXrVersion(type=", this.type, ", value=", ")");
    }
}

