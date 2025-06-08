package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J+\u0010\u0010\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Project_ResourceQuantityRequirements;", "", "projectType", "", "resourceType", "quantity", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getProjectType", "()Ljava/lang/String;", "getQuantity", "()I", "getResourceType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Project_ResourceQuantityRequirements {
    private final String projectType;
    private final int quantity;
    private final String resourceType;

    public Civ5Project_ResourceQuantityRequirements(String s, String s1, int v) {
        this.projectType = s;
        this.resourceType = s1;
        this.quantity = v;
    }

    public final String component1() {
        return this.projectType;
    }

    public final String component2() {
        return this.resourceType;
    }

    public final int component3() {
        return this.quantity;
    }

    public final Civ5Project_ResourceQuantityRequirements copy(String s, String s1, int v) {
        return new Civ5Project_ResourceQuantityRequirements(s, s1, v);
    }

    public static Civ5Project_ResourceQuantityRequirements copy$default(Civ5Project_ResourceQuantityRequirements civ5Project_ResourceQuantityRequirements0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5Project_ResourceQuantityRequirements0.projectType;
        }
        if((v1 & 2) != 0) {
            s1 = civ5Project_ResourceQuantityRequirements0.resourceType;
        }
        if((v1 & 4) != 0) {
            v = civ5Project_ResourceQuantityRequirements0.quantity;
        }
        return civ5Project_ResourceQuantityRequirements0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Project_ResourceQuantityRequirements)) {
            return false;
        }
        if(!j.a(this.projectType, ((Civ5Project_ResourceQuantityRequirements)object0).projectType)) {
            return false;
        }
        return j.a(this.resourceType, ((Civ5Project_ResourceQuantityRequirements)object0).resourceType) ? this.quantity == ((Civ5Project_ResourceQuantityRequirements)object0).quantity : false;
    }

    public final String getProjectType() {
        return this.projectType;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.projectType == null ? 0 : this.projectType.hashCode();
        String s = this.resourceType;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v) * 0x1F + this.quantity;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ5Project_ResourceQuantityRequirements(projectType=", this.projectType, ", resourceType=", this.resourceType, ", quantity="), this.quantity, ")");
    }
}

