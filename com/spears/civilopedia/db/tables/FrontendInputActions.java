package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendInputActions;", "", "actionId", "", "name", "description", "deviceType", "eventType", "sortIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "getDescription", "getDeviceType", "getEventType", "getName", "getSortIndex", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendInputActions {
    private final String actionId;
    private final String description;
    private final String deviceType;
    private final String eventType;
    private final String name;
    private final String sortIndex;

    public FrontendInputActions(String s, String s1, String s2, String s3, String s4, String s5) {
        j.f(s, "actionId");
        j.f(s3, "deviceType");
        j.f(s4, "eventType");
        super();
        this.actionId = s;
        this.name = s1;
        this.description = s2;
        this.deviceType = s3;
        this.eventType = s4;
        this.sortIndex = s5;
    }

    public final String component1() {
        return this.actionId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.deviceType;
    }

    public final String component5() {
        return this.eventType;
    }

    public final String component6() {
        return this.sortIndex;
    }

    public final FrontendInputActions copy(String s, String s1, String s2, String s3, String s4, String s5) {
        j.f(s, "actionId");
        j.f(s3, "deviceType");
        j.f(s4, "eventType");
        return new FrontendInputActions(s, s1, s2, s3, s4, s5);
    }

    public static FrontendInputActions copy$default(FrontendInputActions frontendInputActions0, String s, String s1, String s2, String s3, String s4, String s5, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendInputActions0.actionId;
        }
        if((v & 2) != 0) {
            s1 = frontendInputActions0.name;
        }
        if((v & 4) != 0) {
            s2 = frontendInputActions0.description;
        }
        if((v & 8) != 0) {
            s3 = frontendInputActions0.deviceType;
        }
        if((v & 16) != 0) {
            s4 = frontendInputActions0.eventType;
        }
        if((v & 0x20) != 0) {
            s5 = frontendInputActions0.sortIndex;
        }
        return frontendInputActions0.copy(s, s1, s2, s3, s4, s5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendInputActions)) {
            return false;
        }
        if(!j.a(this.actionId, ((FrontendInputActions)object0).actionId)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendInputActions)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((FrontendInputActions)object0).description)) {
            return false;
        }
        if(!j.a(this.deviceType, ((FrontendInputActions)object0).deviceType)) {
            return false;
        }
        return j.a(this.eventType, ((FrontendInputActions)object0).eventType) ? j.a(this.sortIndex, ((FrontendInputActions)object0).sortIndex) : false;
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(f.b(((this.actionId.hashCode() * 0x1F + (this.name == null ? 0 : this.name.hashCode())) * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F, 0x1F, this.deviceType), 0x1F, this.eventType);
        String s = this.sortIndex;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendInputActions(actionId=", this.actionId, ", name=", this.name, ", description=");
        f.t(stringBuilder0, this.description, ", deviceType=", this.deviceType, ", eventType=");
        return e.i(stringBuilder0, this.eventType, ", sortIndex=", this.sortIndex, ")");
    }
}

