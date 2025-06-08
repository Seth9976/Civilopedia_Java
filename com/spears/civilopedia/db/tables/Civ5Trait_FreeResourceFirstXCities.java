package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\f\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000E¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Trait_FreeResourceFirstXCities;", "", "traitType", "", "resourceType", "resourceQuantity", "", "numCities", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getNumCities", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResourceQuantity", "getResourceType", "()Ljava/lang/String;", "getTraitType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Trait_FreeResourceFirstXCities;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Trait_FreeResourceFirstXCities {
    private final Integer numCities;
    private final Integer resourceQuantity;
    private final String resourceType;
    private final String traitType;

    public Civ5Trait_FreeResourceFirstXCities(String s, String s1, Integer integer0, Integer integer1) {
        this.traitType = s;
        this.resourceType = s1;
        this.resourceQuantity = integer0;
        this.numCities = integer1;
    }

    public final String component1() {
        return this.traitType;
    }

    public final String component2() {
        return this.resourceType;
    }

    public final Integer component3() {
        return this.resourceQuantity;
    }

    public final Integer component4() {
        return this.numCities;
    }

    public final Civ5Trait_FreeResourceFirstXCities copy(String s, String s1, Integer integer0, Integer integer1) {
        return new Civ5Trait_FreeResourceFirstXCities(s, s1, integer0, integer1);
    }

    public static Civ5Trait_FreeResourceFirstXCities copy$default(Civ5Trait_FreeResourceFirstXCities civ5Trait_FreeResourceFirstXCities0, String s, String s1, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Trait_FreeResourceFirstXCities0.traitType;
        }
        if((v & 2) != 0) {
            s1 = civ5Trait_FreeResourceFirstXCities0.resourceType;
        }
        if((v & 4) != 0) {
            integer0 = civ5Trait_FreeResourceFirstXCities0.resourceQuantity;
        }
        if((v & 8) != 0) {
            integer1 = civ5Trait_FreeResourceFirstXCities0.numCities;
        }
        return civ5Trait_FreeResourceFirstXCities0.copy(s, s1, integer0, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Trait_FreeResourceFirstXCities)) {
            return false;
        }
        if(!j.a(this.traitType, ((Civ5Trait_FreeResourceFirstXCities)object0).traitType)) {
            return false;
        }
        if(!j.a(this.resourceType, ((Civ5Trait_FreeResourceFirstXCities)object0).resourceType)) {
            return false;
        }
        return j.a(this.resourceQuantity, ((Civ5Trait_FreeResourceFirstXCities)object0).resourceQuantity) ? j.a(this.numCities, ((Civ5Trait_FreeResourceFirstXCities)object0).numCities) : false;
    }

    public final Integer getNumCities() {
        return this.numCities;
    }

    public final Integer getResourceQuantity() {
        return this.resourceQuantity;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final String getTraitType() {
        return this.traitType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.traitType == null ? 0 : this.traitType.hashCode();
        int v2 = this.resourceType == null ? 0 : this.resourceType.hashCode();
        int v3 = this.resourceQuantity == null ? 0 : this.resourceQuantity.hashCode();
        Integer integer0 = this.numCities;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Trait_FreeResourceFirstXCities(traitType=", this.traitType, ", resourceType=", this.resourceType, ", resourceQuantity=");
        stringBuilder0.append(this.resourceQuantity);
        stringBuilder0.append(", numCities=");
        stringBuilder0.append(this.numCities);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

