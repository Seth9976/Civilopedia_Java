package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J+\u0010\u0010\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Project_Flavors;", "", "projectType", "", "flavorType", "flavor", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getFlavor", "()I", "getFlavorType", "()Ljava/lang/String;", "getProjectType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Project_Flavors {
    private final int flavor;
    private final String flavorType;
    private final String projectType;

    public Civ5Project_Flavors(String s, String s1, int v) {
        this.projectType = s;
        this.flavorType = s1;
        this.flavor = v;
    }

    public final String component1() {
        return this.projectType;
    }

    public final String component2() {
        return this.flavorType;
    }

    public final int component3() {
        return this.flavor;
    }

    public final Civ5Project_Flavors copy(String s, String s1, int v) {
        return new Civ5Project_Flavors(s, s1, v);
    }

    public static Civ5Project_Flavors copy$default(Civ5Project_Flavors civ5Project_Flavors0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5Project_Flavors0.projectType;
        }
        if((v1 & 2) != 0) {
            s1 = civ5Project_Flavors0.flavorType;
        }
        if((v1 & 4) != 0) {
            v = civ5Project_Flavors0.flavor;
        }
        return civ5Project_Flavors0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Project_Flavors)) {
            return false;
        }
        if(!j.a(this.projectType, ((Civ5Project_Flavors)object0).projectType)) {
            return false;
        }
        return j.a(this.flavorType, ((Civ5Project_Flavors)object0).flavorType) ? this.flavor == ((Civ5Project_Flavors)object0).flavor : false;
    }

    public final int getFlavor() {
        return this.flavor;
    }

    public final String getFlavorType() {
        return this.flavorType;
    }

    public final String getProjectType() {
        return this.projectType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.projectType == null ? 0 : this.projectType.hashCode();
        String s = this.flavorType;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v) * 0x1F + this.flavor;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ5Project_Flavors(projectType=", this.projectType, ", flavorType=", this.flavorType, ", flavor="), this.flavor, ")");
    }
}

