package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7EnterStageModifiers;", "", "modifierId", "", "stageType", "oneShot", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getModifierId", "()Ljava/lang/String;", "getOneShot", "()Z", "getStageType", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7EnterStageModifiers {
    private final String modifierId;
    private final boolean oneShot;
    private final String stageType;

    public Civ7EnterStageModifiers(String s, String s1, boolean z) {
        j.f(s, "modifierId");
        j.f(s1, "stageType");
        super();
        this.modifierId = s;
        this.stageType = s1;
        this.oneShot = z;
    }

    public final String component1() {
        return this.modifierId;
    }

    public final String component2() {
        return this.stageType;
    }

    public final boolean component3() {
        return this.oneShot;
    }

    public final Civ7EnterStageModifiers copy(String s, String s1, boolean z) {
        j.f(s, "modifierId");
        j.f(s1, "stageType");
        return new Civ7EnterStageModifiers(s, s1, z);
    }

    public static Civ7EnterStageModifiers copy$default(Civ7EnterStageModifiers civ7EnterStageModifiers0, String s, String s1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7EnterStageModifiers0.modifierId;
        }
        if((v & 2) != 0) {
            s1 = civ7EnterStageModifiers0.stageType;
        }
        if((v & 4) != 0) {
            z = civ7EnterStageModifiers0.oneShot;
        }
        return civ7EnterStageModifiers0.copy(s, s1, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7EnterStageModifiers)) {
            return false;
        }
        if(!j.a(this.modifierId, ((Civ7EnterStageModifiers)object0).modifierId)) {
            return false;
        }
        return j.a(this.stageType, ((Civ7EnterStageModifiers)object0).stageType) ? this.oneShot == ((Civ7EnterStageModifiers)object0).oneShot : false;
    }

    public final String getModifierId() {
        return this.modifierId;
    }

    public final boolean getOneShot() {
        return this.oneShot;
    }

    public final String getStageType() {
        return this.stageType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.modifierId.hashCode() * 0x1F, 0x1F, this.stageType);
        return this.oneShot ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public String toString() {
        return u9.g(e.j("Civ7EnterStageModifiers(modifierId=", this.modifierId, ", stageType=", this.stageType, ", oneShot="), this.oneShot, ")");
    }
}

