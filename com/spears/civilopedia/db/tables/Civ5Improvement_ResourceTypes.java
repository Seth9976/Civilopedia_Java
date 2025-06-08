package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001A\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000BJ\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001A\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001B\u001A\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001C\u001A\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJV\u0010\u001D\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001EJ\u0013\u0010\u001F\u001A\u00020\u00062\b\u0010 \u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001A\u00020\tHÖ\u0001J\t\u0010\"\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0015\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\u0011\u0010\rR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0010¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Improvement_ResourceTypes;", "", "improvementType", "", "resourceType", "resourceMakesValid", "", "resourceTrade", "discoveryRand", "", "quantityRequirement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDiscoveryRand", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImprovementType", "()Ljava/lang/String;", "getQuantityRequirement", "getResourceMakesValid", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getResourceTrade", "getResourceType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Improvement_ResourceTypes;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Improvement_ResourceTypes {
    private final Integer discoveryRand;
    private final String improvementType;
    private final Integer quantityRequirement;
    private final Boolean resourceMakesValid;
    private final Boolean resourceTrade;
    private final String resourceType;

    public Civ5Improvement_ResourceTypes(String s, String s1, Boolean boolean0, Boolean boolean1, Integer integer0, Integer integer1) {
        this.improvementType = s;
        this.resourceType = s1;
        this.resourceMakesValid = boolean0;
        this.resourceTrade = boolean1;
        this.discoveryRand = integer0;
        this.quantityRequirement = integer1;
    }

    public final String component1() {
        return this.improvementType;
    }

    public final String component2() {
        return this.resourceType;
    }

    public final Boolean component3() {
        return this.resourceMakesValid;
    }

    public final Boolean component4() {
        return this.resourceTrade;
    }

    public final Integer component5() {
        return this.discoveryRand;
    }

    public final Integer component6() {
        return this.quantityRequirement;
    }

    public final Civ5Improvement_ResourceTypes copy(String s, String s1, Boolean boolean0, Boolean boolean1, Integer integer0, Integer integer1) {
        return new Civ5Improvement_ResourceTypes(s, s1, boolean0, boolean1, integer0, integer1);
    }

    public static Civ5Improvement_ResourceTypes copy$default(Civ5Improvement_ResourceTypes civ5Improvement_ResourceTypes0, String s, String s1, Boolean boolean0, Boolean boolean1, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Improvement_ResourceTypes0.improvementType;
        }
        if((v & 2) != 0) {
            s1 = civ5Improvement_ResourceTypes0.resourceType;
        }
        if((v & 4) != 0) {
            boolean0 = civ5Improvement_ResourceTypes0.resourceMakesValid;
        }
        if((v & 8) != 0) {
            boolean1 = civ5Improvement_ResourceTypes0.resourceTrade;
        }
        if((v & 16) != 0) {
            integer0 = civ5Improvement_ResourceTypes0.discoveryRand;
        }
        if((v & 0x20) != 0) {
            integer1 = civ5Improvement_ResourceTypes0.quantityRequirement;
        }
        return civ5Improvement_ResourceTypes0.copy(s, s1, boolean0, boolean1, integer0, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Improvement_ResourceTypes)) {
            return false;
        }
        if(!j.a(this.improvementType, ((Civ5Improvement_ResourceTypes)object0).improvementType)) {
            return false;
        }
        if(!j.a(this.resourceType, ((Civ5Improvement_ResourceTypes)object0).resourceType)) {
            return false;
        }
        if(!j.a(this.resourceMakesValid, ((Civ5Improvement_ResourceTypes)object0).resourceMakesValid)) {
            return false;
        }
        if(!j.a(this.resourceTrade, ((Civ5Improvement_ResourceTypes)object0).resourceTrade)) {
            return false;
        }
        return j.a(this.discoveryRand, ((Civ5Improvement_ResourceTypes)object0).discoveryRand) ? j.a(this.quantityRequirement, ((Civ5Improvement_ResourceTypes)object0).quantityRequirement) : false;
    }

    public final Integer getDiscoveryRand() {
        return this.discoveryRand;
    }

    public final String getImprovementType() {
        return this.improvementType;
    }

    public final Integer getQuantityRequirement() {
        return this.quantityRequirement;
    }

    public final Boolean getResourceMakesValid() {
        return this.resourceMakesValid;
    }

    public final Boolean getResourceTrade() {
        return this.resourceTrade;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.improvementType == null ? 0 : this.improvementType.hashCode();
        int v2 = this.resourceType == null ? 0 : this.resourceType.hashCode();
        int v3 = this.resourceMakesValid == null ? 0 : this.resourceMakesValid.hashCode();
        int v4 = this.resourceTrade == null ? 0 : this.resourceTrade.hashCode();
        int v5 = this.discoveryRand == null ? 0 : this.discoveryRand.hashCode();
        Integer integer0 = this.quantityRequirement;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Improvement_ResourceTypes(improvementType=", this.improvementType, ", resourceType=", this.resourceType, ", resourceMakesValid=");
        u9.s(stringBuilder0, this.resourceMakesValid, ", resourceTrade=", this.resourceTrade, ", discoveryRand=");
        stringBuilder0.append(this.discoveryRand);
        stringBuilder0.append(", quantityRequirement=");
        stringBuilder0.append(this.quantityRequirement);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

