package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J=\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendInputActionDefaultGestures;", "", "actionId", "", "contextOverrideId", "index", "", "gestureType", "gestureData", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "getContextOverrideId", "getGestureData", "getGestureType", "getIndex", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendInputActionDefaultGestures {
    private final String actionId;
    private final String contextOverrideId;
    private final String gestureData;
    private final String gestureType;
    private final int index;

    public FrontendInputActionDefaultGestures(String s, String s1, int v, String s2, String s3) {
        j.f(s, "actionId");
        j.f(s2, "gestureType");
        j.f(s3, "gestureData");
        super();
        this.actionId = s;
        this.contextOverrideId = s1;
        this.index = v;
        this.gestureType = s2;
        this.gestureData = s3;
    }

    public final String component1() {
        return this.actionId;
    }

    public final String component2() {
        return this.contextOverrideId;
    }

    public final int component3() {
        return this.index;
    }

    public final String component4() {
        return this.gestureType;
    }

    public final String component5() {
        return this.gestureData;
    }

    public final FrontendInputActionDefaultGestures copy(String s, String s1, int v, String s2, String s3) {
        j.f(s, "actionId");
        j.f(s2, "gestureType");
        j.f(s3, "gestureData");
        return new FrontendInputActionDefaultGestures(s, s1, v, s2, s3);
    }

    public static FrontendInputActionDefaultGestures copy$default(FrontendInputActionDefaultGestures frontendInputActionDefaultGestures0, String s, String s1, int v, String s2, String s3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendInputActionDefaultGestures0.actionId;
        }
        if((v1 & 2) != 0) {
            s1 = frontendInputActionDefaultGestures0.contextOverrideId;
        }
        if((v1 & 4) != 0) {
            v = frontendInputActionDefaultGestures0.index;
        }
        if((v1 & 8) != 0) {
            s2 = frontendInputActionDefaultGestures0.gestureType;
        }
        if((v1 & 16) != 0) {
            s3 = frontendInputActionDefaultGestures0.gestureData;
        }
        return frontendInputActionDefaultGestures0.copy(s, s1, v, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendInputActionDefaultGestures)) {
            return false;
        }
        if(!j.a(this.actionId, ((FrontendInputActionDefaultGestures)object0).actionId)) {
            return false;
        }
        if(!j.a(this.contextOverrideId, ((FrontendInputActionDefaultGestures)object0).contextOverrideId)) {
            return false;
        }
        if(this.index != ((FrontendInputActionDefaultGestures)object0).index) {
            return false;
        }
        return j.a(this.gestureType, ((FrontendInputActionDefaultGestures)object0).gestureType) ? j.a(this.gestureData, ((FrontendInputActionDefaultGestures)object0).gestureData) : false;
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getContextOverrideId() {
        return this.contextOverrideId;
    }

    public final String getGestureData() {
        return this.gestureData;
    }

    public final String getGestureType() {
        return this.gestureType;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override
    public int hashCode() {
        int v = this.actionId.hashCode();
        return this.contextOverrideId == null ? this.gestureData.hashCode() + f.b((v * 961 + this.index) * 0x1F, 0x1F, this.gestureType) : this.gestureData.hashCode() + f.b(((v * 0x1F + this.contextOverrideId.hashCode()) * 0x1F + this.index) * 0x1F, 0x1F, this.gestureType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendInputActionDefaultGestures(actionId=", this.actionId, ", contextOverrideId=", this.contextOverrideId, ", index=");
        f.r(stringBuilder0, this.index, ", gestureType=", this.gestureType, ", gestureData=");
        return e.h(stringBuilder0, this.gestureData, ")");
    }
}

