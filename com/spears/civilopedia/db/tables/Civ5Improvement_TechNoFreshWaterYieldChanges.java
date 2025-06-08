package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Improvement_TechNoFreshWaterYieldChanges;", "", "improvementType", "", "techType", "yieldType", "yield", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getImprovementType", "()Ljava/lang/String;", "getTechType", "getYield", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getYieldType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Improvement_TechNoFreshWaterYieldChanges;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Improvement_TechNoFreshWaterYieldChanges {
    private final String improvementType;
    private final String techType;
    private final Integer yield;
    private final String yieldType;

    public Civ5Improvement_TechNoFreshWaterYieldChanges(String s, String s1, String s2, Integer integer0) {
        this.improvementType = s;
        this.techType = s1;
        this.yieldType = s2;
        this.yield = integer0;
    }

    public final String component1() {
        return this.improvementType;
    }

    public final String component2() {
        return this.techType;
    }

    public final String component3() {
        return this.yieldType;
    }

    public final Integer component4() {
        return this.yield;
    }

    public final Civ5Improvement_TechNoFreshWaterYieldChanges copy(String s, String s1, String s2, Integer integer0) {
        return new Civ5Improvement_TechNoFreshWaterYieldChanges(s, s1, s2, integer0);
    }

    public static Civ5Improvement_TechNoFreshWaterYieldChanges copy$default(Civ5Improvement_TechNoFreshWaterYieldChanges civ5Improvement_TechNoFreshWaterYieldChanges0, String s, String s1, String s2, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Improvement_TechNoFreshWaterYieldChanges0.improvementType;
        }
        if((v & 2) != 0) {
            s1 = civ5Improvement_TechNoFreshWaterYieldChanges0.techType;
        }
        if((v & 4) != 0) {
            s2 = civ5Improvement_TechNoFreshWaterYieldChanges0.yieldType;
        }
        if((v & 8) != 0) {
            integer0 = civ5Improvement_TechNoFreshWaterYieldChanges0.yield;
        }
        return civ5Improvement_TechNoFreshWaterYieldChanges0.copy(s, s1, s2, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Improvement_TechNoFreshWaterYieldChanges)) {
            return false;
        }
        if(!j.a(this.improvementType, ((Civ5Improvement_TechNoFreshWaterYieldChanges)object0).improvementType)) {
            return false;
        }
        if(!j.a(this.techType, ((Civ5Improvement_TechNoFreshWaterYieldChanges)object0).techType)) {
            return false;
        }
        return j.a(this.yieldType, ((Civ5Improvement_TechNoFreshWaterYieldChanges)object0).yieldType) ? j.a(this.yield, ((Civ5Improvement_TechNoFreshWaterYieldChanges)object0).yield) : false;
    }

    public final String getImprovementType() {
        return this.improvementType;
    }

    public final String getTechType() {
        return this.techType;
    }

    public final Integer getYield() {
        return this.yield;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.improvementType == null ? 0 : this.improvementType.hashCode();
        int v2 = this.techType == null ? 0 : this.techType.hashCode();
        int v3 = this.yieldType == null ? 0 : this.yieldType.hashCode();
        Integer integer0 = this.yield;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Improvement_TechNoFreshWaterYieldChanges(improvementType=", this.improvementType, ", techType=", this.techType, ", yieldType=");
        return u9.d(this.yield, this.yieldType, ", yield=", ")", stringBuilder0);
    }
}

