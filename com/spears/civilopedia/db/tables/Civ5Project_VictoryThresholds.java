package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0006HÆ\u0003J\u0010\u0010\u0014\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ<\u0010\u0015\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\r¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Project_VictoryThresholds;", "", "projectType", "", "victoryType", "threshold", "", "minThreshold", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "getMinThreshold", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProjectType", "()Ljava/lang/String;", "getThreshold", "()I", "getVictoryType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Project_VictoryThresholds;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Project_VictoryThresholds {
    private final Integer minThreshold;
    private final String projectType;
    private final int threshold;
    private final String victoryType;

    public Civ5Project_VictoryThresholds(String s, String s1, int v, Integer integer0) {
        this.projectType = s;
        this.victoryType = s1;
        this.threshold = v;
        this.minThreshold = integer0;
    }

    public final String component1() {
        return this.projectType;
    }

    public final String component2() {
        return this.victoryType;
    }

    public final int component3() {
        return this.threshold;
    }

    public final Integer component4() {
        return this.minThreshold;
    }

    public final Civ5Project_VictoryThresholds copy(String s, String s1, int v, Integer integer0) {
        return new Civ5Project_VictoryThresholds(s, s1, v, integer0);
    }

    public static Civ5Project_VictoryThresholds copy$default(Civ5Project_VictoryThresholds civ5Project_VictoryThresholds0, String s, String s1, int v, Integer integer0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5Project_VictoryThresholds0.projectType;
        }
        if((v1 & 2) != 0) {
            s1 = civ5Project_VictoryThresholds0.victoryType;
        }
        if((v1 & 4) != 0) {
            v = civ5Project_VictoryThresholds0.threshold;
        }
        if((v1 & 8) != 0) {
            integer0 = civ5Project_VictoryThresholds0.minThreshold;
        }
        return civ5Project_VictoryThresholds0.copy(s, s1, v, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Project_VictoryThresholds)) {
            return false;
        }
        if(!j.a(this.projectType, ((Civ5Project_VictoryThresholds)object0).projectType)) {
            return false;
        }
        if(!j.a(this.victoryType, ((Civ5Project_VictoryThresholds)object0).victoryType)) {
            return false;
        }
        return this.threshold == ((Civ5Project_VictoryThresholds)object0).threshold ? j.a(this.minThreshold, ((Civ5Project_VictoryThresholds)object0).minThreshold) : false;
    }

    public final Integer getMinThreshold() {
        return this.minThreshold;
    }

    public final String getProjectType() {
        return this.projectType;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public final String getVictoryType() {
        return this.victoryType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (((this.projectType == null ? 0 : this.projectType.hashCode()) * 0x1F + (this.victoryType == null ? 0 : this.victoryType.hashCode())) * 0x1F + this.threshold) * 0x1F;
        Integer integer0 = this.minThreshold;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Project_VictoryThresholds(projectType=", this.projectType, ", victoryType=", this.victoryType, ", threshold=");
        stringBuilder0.append(this.threshold);
        stringBuilder0.append(", minThreshold=");
        stringBuilder0.append(this.minThreshold);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

