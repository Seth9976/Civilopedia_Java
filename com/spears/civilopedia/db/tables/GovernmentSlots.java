package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ.\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0017\u001A\u00020\u00052\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001A\u0004\b\u001B\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001C\u001A\u0004\b\u001D\u0010\u000E¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/GovernmentSlots;", "Lo2/m;", "", "governmentSlotType", "name", "", "allowsAnyPolicy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/spears/civilopedia/db/tables/GovernmentSlots;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGovernmentSlotType", "getName", "Z", "getAllowsAnyPolicy", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GovernmentSlots implements m {
    private final boolean allowsAnyPolicy;
    private final String governmentSlotType;
    private final String name;

    public GovernmentSlots(String s, String s1, boolean z) {
        j.f(s, "governmentSlotType");
        j.f(s1, "name");
        super();
        this.governmentSlotType = s;
        this.name = s1;
        this.allowsAnyPolicy = z;
    }

    public final String component1() {
        return this.governmentSlotType;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.allowsAnyPolicy;
    }

    public final GovernmentSlots copy(String s, String s1, boolean z) {
        j.f(s, "governmentSlotType");
        j.f(s1, "name");
        return new GovernmentSlots(s, s1, z);
    }

    public static GovernmentSlots copy$default(GovernmentSlots governmentSlots0, String s, String s1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = governmentSlots0.governmentSlotType;
        }
        if((v & 2) != 0) {
            s1 = governmentSlots0.name;
        }
        if((v & 4) != 0) {
            z = governmentSlots0.allowsAnyPolicy;
        }
        return governmentSlots0.copy(s, s1, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GovernmentSlots)) {
            return false;
        }
        if(!j.a(this.governmentSlotType, ((GovernmentSlots)object0).governmentSlotType)) {
            return false;
        }
        return j.a(this.name, ((GovernmentSlots)object0).name) ? this.allowsAnyPolicy == ((GovernmentSlots)object0).allowsAnyPolicy : false;
    }

    public final boolean getAllowsAnyPolicy() {
        return this.allowsAnyPolicy;
    }

    public final String getGovernmentSlotType() {
        return this.governmentSlotType;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.governmentSlotType.hashCode() * 0x1F, 0x1F, this.name);
        return this.allowsAnyPolicy ? v + 0x4CF : v + 0x4D5;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.governmentSlotType;
    }

    @Override
    public String toString() {
        return u9.g(e.j("GovernmentSlots(governmentSlotType=", this.governmentSlotType, ", name=", this.name, ", allowsAnyPolicy="), this.allowsAnyPolicy, ")");
    }
}

