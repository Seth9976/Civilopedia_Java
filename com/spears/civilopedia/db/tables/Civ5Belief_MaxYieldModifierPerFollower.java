package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000F\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000BJ\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000BJ2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\r\u0010\u000B¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Belief_MaxYieldModifierPerFollower;", "", "beliefType", "", "yieldType", "", "max", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBeliefType", "()Ljava/lang/String;", "getMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getYieldType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Belief_MaxYieldModifierPerFollower;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Belief_MaxYieldModifierPerFollower {
    private final String beliefType;
    private final Integer max;
    private final Integer yieldType;

    public Civ5Belief_MaxYieldModifierPerFollower(String s, Integer integer0, Integer integer1) {
        this.beliefType = s;
        this.yieldType = integer0;
        this.max = integer1;
    }

    public final String component1() {
        return this.beliefType;
    }

    public final Integer component2() {
        return this.yieldType;
    }

    public final Integer component3() {
        return this.max;
    }

    public final Civ5Belief_MaxYieldModifierPerFollower copy(String s, Integer integer0, Integer integer1) {
        return new Civ5Belief_MaxYieldModifierPerFollower(s, integer0, integer1);
    }

    public static Civ5Belief_MaxYieldModifierPerFollower copy$default(Civ5Belief_MaxYieldModifierPerFollower civ5Belief_MaxYieldModifierPerFollower0, String s, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Belief_MaxYieldModifierPerFollower0.beliefType;
        }
        if((v & 2) != 0) {
            integer0 = civ5Belief_MaxYieldModifierPerFollower0.yieldType;
        }
        if((v & 4) != 0) {
            integer1 = civ5Belief_MaxYieldModifierPerFollower0.max;
        }
        return civ5Belief_MaxYieldModifierPerFollower0.copy(s, integer0, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Belief_MaxYieldModifierPerFollower)) {
            return false;
        }
        if(!j.a(this.beliefType, ((Civ5Belief_MaxYieldModifierPerFollower)object0).beliefType)) {
            return false;
        }
        return j.a(this.yieldType, ((Civ5Belief_MaxYieldModifierPerFollower)object0).yieldType) ? j.a(this.max, ((Civ5Belief_MaxYieldModifierPerFollower)object0).max) : false;
    }

    public final String getBeliefType() {
        return this.beliefType;
    }

    public final Integer getMax() {
        return this.max;
    }

    public final Integer getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.beliefType == null ? 0 : this.beliefType.hashCode();
        int v2 = this.yieldType == null ? 0 : this.yieldType.hashCode();
        Integer integer0 = this.max;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return u9.f(u9.i("Civ5Belief_MaxYieldModifierPerFollower(beliefType=", this.beliefType, ", yieldType=", this.yieldType, ", max="), this.max, ")");
    }
}

