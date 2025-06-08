package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7GameCapabilityDependencies;", "", "ID", "", "dependsOnCapability", "", "gameCapability", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDependsOnCapability", "()Ljava/lang/String;", "getGameCapability", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ7GameCapabilityDependencies;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7GameCapabilityDependencies {
    private final Integer ID;
    private final String dependsOnCapability;
    private final Integer gameCapability;

    public Civ7GameCapabilityDependencies(Integer integer0, String s, Integer integer1) {
        this.ID = integer0;
        this.dependsOnCapability = s;
        this.gameCapability = integer1;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.dependsOnCapability;
    }

    public final Integer component3() {
        return this.gameCapability;
    }

    public final Civ7GameCapabilityDependencies copy(Integer integer0, String s, Integer integer1) {
        return new Civ7GameCapabilityDependencies(integer0, s, integer1);
    }

    public static Civ7GameCapabilityDependencies copy$default(Civ7GameCapabilityDependencies civ7GameCapabilityDependencies0, Integer integer0, String s, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ7GameCapabilityDependencies0.ID;
        }
        if((v & 2) != 0) {
            s = civ7GameCapabilityDependencies0.dependsOnCapability;
        }
        if((v & 4) != 0) {
            integer1 = civ7GameCapabilityDependencies0.gameCapability;
        }
        return civ7GameCapabilityDependencies0.copy(integer0, s, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7GameCapabilityDependencies)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ7GameCapabilityDependencies)object0).ID)) {
            return false;
        }
        return j.a(this.dependsOnCapability, ((Civ7GameCapabilityDependencies)object0).dependsOnCapability) ? j.a(this.gameCapability, ((Civ7GameCapabilityDependencies)object0).gameCapability) : false;
    }

    public final String getDependsOnCapability() {
        return this.dependsOnCapability;
    }

    public final Integer getGameCapability() {
        return this.gameCapability;
    }

    public final Integer getID() {
        return this.ID;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.ID == null ? 0 : this.ID.hashCode();
        int v2 = this.dependsOnCapability == null ? 0 : this.dependsOnCapability.hashCode();
        Integer integer0 = this.gameCapability;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return u9.f(u9.h("Civ7GameCapabilityDependencies(ID=", this.ID, ", dependsOnCapability=", this.dependsOnCapability, ", gameCapability="), this.gameCapability, ")");
    }
}

