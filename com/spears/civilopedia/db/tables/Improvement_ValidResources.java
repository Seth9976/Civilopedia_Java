package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Improvement_ValidResources;", "", "improvementType", "", "resourceType", "mustRemoveFeature", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getImprovementType", "()Ljava/lang/String;", "getMustRemoveFeature", "()Z", "getResourceType", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Improvement_ValidResources {
    private final String improvementType;
    private final boolean mustRemoveFeature;
    private final String resourceType;

    public Improvement_ValidResources(String s, String s1, boolean z) {
        j.f(s, "improvementType");
        j.f(s1, "resourceType");
        super();
        this.improvementType = s;
        this.resourceType = s1;
        this.mustRemoveFeature = z;
    }

    public final String component1() {
        return this.improvementType;
    }

    public final String component2() {
        return this.resourceType;
    }

    public final boolean component3() {
        return this.mustRemoveFeature;
    }

    public final Improvement_ValidResources copy(String s, String s1, boolean z) {
        j.f(s, "improvementType");
        j.f(s1, "resourceType");
        return new Improvement_ValidResources(s, s1, z);
    }

    public static Improvement_ValidResources copy$default(Improvement_ValidResources improvement_ValidResources0, String s, String s1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = improvement_ValidResources0.improvementType;
        }
        if((v & 2) != 0) {
            s1 = improvement_ValidResources0.resourceType;
        }
        if((v & 4) != 0) {
            z = improvement_ValidResources0.mustRemoveFeature;
        }
        return improvement_ValidResources0.copy(s, s1, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Improvement_ValidResources)) {
            return false;
        }
        if(!j.a(this.improvementType, ((Improvement_ValidResources)object0).improvementType)) {
            return false;
        }
        return j.a(this.resourceType, ((Improvement_ValidResources)object0).resourceType) ? this.mustRemoveFeature == ((Improvement_ValidResources)object0).mustRemoveFeature : false;
    }

    public final String getImprovementType() {
        return this.improvementType;
    }

    public final boolean getMustRemoveFeature() {
        return this.mustRemoveFeature;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.improvementType.hashCode() * 0x1F, 0x1F, this.resourceType);
        return this.mustRemoveFeature ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public String toString() {
        return u9.g(e.j("Improvement_ValidResources(improvementType=", this.improvementType, ", resourceType=", this.resourceType, ", mustRemoveFeature="), this.mustRemoveFeature, ")");
    }
}

