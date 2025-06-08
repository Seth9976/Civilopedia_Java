package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7EnvoysInStageModifiers;", "", "modifierId", "", "stageType", "numEnvoys", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getModifierId", "()Ljava/lang/String;", "getNumEnvoys", "()I", "getStageType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7EnvoysInStageModifiers {
    private final String modifierId;
    private final int numEnvoys;
    private final String stageType;

    public Civ7EnvoysInStageModifiers(String s, String s1, int v) {
        j.f(s, "modifierId");
        j.f(s1, "stageType");
        super();
        this.modifierId = s;
        this.stageType = s1;
        this.numEnvoys = v;
    }

    public final String component1() {
        return this.modifierId;
    }

    public final String component2() {
        return this.stageType;
    }

    public final int component3() {
        return this.numEnvoys;
    }

    public final Civ7EnvoysInStageModifiers copy(String s, String s1, int v) {
        j.f(s, "modifierId");
        j.f(s1, "stageType");
        return new Civ7EnvoysInStageModifiers(s, s1, v);
    }

    public static Civ7EnvoysInStageModifiers copy$default(Civ7EnvoysInStageModifiers civ7EnvoysInStageModifiers0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7EnvoysInStageModifiers0.modifierId;
        }
        if((v1 & 2) != 0) {
            s1 = civ7EnvoysInStageModifiers0.stageType;
        }
        if((v1 & 4) != 0) {
            v = civ7EnvoysInStageModifiers0.numEnvoys;
        }
        return civ7EnvoysInStageModifiers0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7EnvoysInStageModifiers)) {
            return false;
        }
        if(!j.a(this.modifierId, ((Civ7EnvoysInStageModifiers)object0).modifierId)) {
            return false;
        }
        return j.a(this.stageType, ((Civ7EnvoysInStageModifiers)object0).stageType) ? this.numEnvoys == ((Civ7EnvoysInStageModifiers)object0).numEnvoys : false;
    }

    public final String getModifierId() {
        return this.modifierId;
    }

    public final int getNumEnvoys() {
        return this.numEnvoys;
    }

    public final String getStageType() {
        return this.stageType;
    }

    @Override
    public int hashCode() {
        return f.b(this.modifierId.hashCode() * 0x1F, 0x1F, this.stageType) + this.numEnvoys;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ7EnvoysInStageModifiers(modifierId=", this.modifierId, ", stageType=", this.stageType, ", numEnvoys="), this.numEnvoys, ")");
    }
}

