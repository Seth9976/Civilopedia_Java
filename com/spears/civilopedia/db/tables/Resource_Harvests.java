package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Resource_Harvests;", "", "resourceType", "", "yieldType", "amount", "", "prereqTech", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAmount", "()I", "getPrereqTech", "()Ljava/lang/String;", "getResourceType", "getYieldType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Resource_Harvests {
    private final int amount;
    private final String prereqTech;
    private final String resourceType;
    private final String yieldType;

    public Resource_Harvests(String s, String s1, int v, String s2) {
        j.f(s, "resourceType");
        j.f(s1, "yieldType");
        super();
        this.resourceType = s;
        this.yieldType = s1;
        this.amount = v;
        this.prereqTech = s2;
    }

    public final String component1() {
        return this.resourceType;
    }

    public final String component2() {
        return this.yieldType;
    }

    public final int component3() {
        return this.amount;
    }

    public final String component4() {
        return this.prereqTech;
    }

    public final Resource_Harvests copy(String s, String s1, int v, String s2) {
        j.f(s, "resourceType");
        j.f(s1, "yieldType");
        return new Resource_Harvests(s, s1, v, s2);
    }

    public static Resource_Harvests copy$default(Resource_Harvests resource_Harvests0, String s, String s1, int v, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = resource_Harvests0.resourceType;
        }
        if((v1 & 2) != 0) {
            s1 = resource_Harvests0.yieldType;
        }
        if((v1 & 4) != 0) {
            v = resource_Harvests0.amount;
        }
        if((v1 & 8) != 0) {
            s2 = resource_Harvests0.prereqTech;
        }
        return resource_Harvests0.copy(s, s1, v, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Resource_Harvests)) {
            return false;
        }
        if(!j.a(this.resourceType, ((Resource_Harvests)object0).resourceType)) {
            return false;
        }
        if(!j.a(this.yieldType, ((Resource_Harvests)object0).yieldType)) {
            return false;
        }
        return this.amount == ((Resource_Harvests)object0).amount ? j.a(this.prereqTech, ((Resource_Harvests)object0).prereqTech) : false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = (f.b(this.resourceType.hashCode() * 0x1F, 0x1F, this.yieldType) + this.amount) * 0x1F;
        return this.prereqTech == null ? v : v + this.prereqTech.hashCode();
    }

    @Override
    public String toString() {
        return u9.e(e.j("Resource_Harvests(resourceType=", this.resourceType, ", yieldType=", this.yieldType, ", amount="), this.amount, ", prereqTech=", this.prereqTech, ")");
    }
}

