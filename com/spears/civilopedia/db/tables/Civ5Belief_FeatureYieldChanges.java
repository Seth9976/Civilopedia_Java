package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\u000F\u0010\r¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Belief_FeatureYieldChanges;", "", "beliefType", "", "featureType", "yieldType", "", "yield", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBeliefType", "()Ljava/lang/String;", "getFeatureType", "getYield", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getYieldType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Belief_FeatureYieldChanges;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Belief_FeatureYieldChanges {
    private final String beliefType;
    private final String featureType;
    private final Integer yield;
    private final Integer yieldType;

    public Civ5Belief_FeatureYieldChanges(String s, String s1, Integer integer0, Integer integer1) {
        this.beliefType = s;
        this.featureType = s1;
        this.yieldType = integer0;
        this.yield = integer1;
    }

    public final String component1() {
        return this.beliefType;
    }

    public final String component2() {
        return this.featureType;
    }

    public final Integer component3() {
        return this.yieldType;
    }

    public final Integer component4() {
        return this.yield;
    }

    public final Civ5Belief_FeatureYieldChanges copy(String s, String s1, Integer integer0, Integer integer1) {
        return new Civ5Belief_FeatureYieldChanges(s, s1, integer0, integer1);
    }

    public static Civ5Belief_FeatureYieldChanges copy$default(Civ5Belief_FeatureYieldChanges civ5Belief_FeatureYieldChanges0, String s, String s1, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Belief_FeatureYieldChanges0.beliefType;
        }
        if((v & 2) != 0) {
            s1 = civ5Belief_FeatureYieldChanges0.featureType;
        }
        if((v & 4) != 0) {
            integer0 = civ5Belief_FeatureYieldChanges0.yieldType;
        }
        if((v & 8) != 0) {
            integer1 = civ5Belief_FeatureYieldChanges0.yield;
        }
        return civ5Belief_FeatureYieldChanges0.copy(s, s1, integer0, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Belief_FeatureYieldChanges)) {
            return false;
        }
        if(!j.a(this.beliefType, ((Civ5Belief_FeatureYieldChanges)object0).beliefType)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ5Belief_FeatureYieldChanges)object0).featureType)) {
            return false;
        }
        return j.a(this.yieldType, ((Civ5Belief_FeatureYieldChanges)object0).yieldType) ? j.a(this.yield, ((Civ5Belief_FeatureYieldChanges)object0).yield) : false;
    }

    public final String getBeliefType() {
        return this.beliefType;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final Integer getYield() {
        return this.yield;
    }

    public final Integer getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.beliefType == null ? 0 : this.beliefType.hashCode();
        int v2 = this.featureType == null ? 0 : this.featureType.hashCode();
        int v3 = this.yieldType == null ? 0 : this.yieldType.hashCode();
        Integer integer0 = this.yield;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Belief_FeatureYieldChanges(beliefType=", this.beliefType, ", featureType=", this.featureType, ", yieldType=");
        stringBuilder0.append(this.yieldType);
        stringBuilder0.append(", yield=");
        stringBuilder0.append(this.yield);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

