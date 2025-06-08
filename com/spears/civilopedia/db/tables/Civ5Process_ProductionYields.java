package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J+\u0010\u0010\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Process_ProductionYields;", "", "processType", "", "yieldType", "yield", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getProcessType", "()Ljava/lang/String;", "getYield", "()I", "getYieldType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Process_ProductionYields {
    private final String processType;
    private final int yield;
    private final String yieldType;

    public Civ5Process_ProductionYields(String s, String s1, int v) {
        this.processType = s;
        this.yieldType = s1;
        this.yield = v;
    }

    public final String component1() {
        return this.processType;
    }

    public final String component2() {
        return this.yieldType;
    }

    public final int component3() {
        return this.yield;
    }

    public final Civ5Process_ProductionYields copy(String s, String s1, int v) {
        return new Civ5Process_ProductionYields(s, s1, v);
    }

    public static Civ5Process_ProductionYields copy$default(Civ5Process_ProductionYields civ5Process_ProductionYields0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5Process_ProductionYields0.processType;
        }
        if((v1 & 2) != 0) {
            s1 = civ5Process_ProductionYields0.yieldType;
        }
        if((v1 & 4) != 0) {
            v = civ5Process_ProductionYields0.yield;
        }
        return civ5Process_ProductionYields0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Process_ProductionYields)) {
            return false;
        }
        if(!j.a(this.processType, ((Civ5Process_ProductionYields)object0).processType)) {
            return false;
        }
        return j.a(this.yieldType, ((Civ5Process_ProductionYields)object0).yieldType) ? this.yield == ((Civ5Process_ProductionYields)object0).yield : false;
    }

    public final String getProcessType() {
        return this.processType;
    }

    public final int getYield() {
        return this.yield;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.processType == null ? 0 : this.processType.hashCode();
        String s = this.yieldType;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v) * 0x1F + this.yield;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ5Process_ProductionYields(processType=", this.processType, ", yieldType=", this.yieldType, ", yield="), this.yield, ")");
    }
}

