package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001A\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0018\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001A\u0010\u001B\u001A\u00020\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001D\u001A\u0004\b\u001E\u0010\rR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001F\u001A\u0004\b \u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001F\u001A\u0004\b!\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001F\u001A\u0004\b\"\u0010\u0010R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001A\u0004\b$\u0010\u0014¨\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7TradeSystemParameterSets;", "Lo2/m;", "", "type", "", "baseResourceCapacity", "landRouteRange", "seaRouteRange", "", "startRoutesAtDistance", "<init>", "(Ljava/lang/String;IIIZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;IIIZ)Lcom/spears/civilopedia/db/tables/Civ7TradeSystemParameterSets;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "I", "getBaseResourceCapacity", "getLandRouteRange", "getSeaRouteRange", "Z", "getStartRoutesAtDistance", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7TradeSystemParameterSets implements m {
    private final int baseResourceCapacity;
    private final int landRouteRange;
    private final int seaRouteRange;
    private final boolean startRoutesAtDistance;
    private final String type;

    public Civ7TradeSystemParameterSets(String s, int v, int v1, int v2, boolean z) {
        j.f(s, "type");
        super();
        this.type = s;
        this.baseResourceCapacity = v;
        this.landRouteRange = v1;
        this.seaRouteRange = v2;
        this.startRoutesAtDistance = z;
    }

    public final String component1() {
        return this.type;
    }

    public final int component2() {
        return this.baseResourceCapacity;
    }

    public final int component3() {
        return this.landRouteRange;
    }

    public final int component4() {
        return this.seaRouteRange;
    }

    public final boolean component5() {
        return this.startRoutesAtDistance;
    }

    public final Civ7TradeSystemParameterSets copy(String s, int v, int v1, int v2, boolean z) {
        j.f(s, "type");
        return new Civ7TradeSystemParameterSets(s, v, v1, v2, z);
    }

    public static Civ7TradeSystemParameterSets copy$default(Civ7TradeSystemParameterSets civ7TradeSystemParameterSets0, String s, int v, int v1, int v2, boolean z, int v3, Object object0) {
        if((v3 & 1) != 0) {
            s = civ7TradeSystemParameterSets0.type;
        }
        if((v3 & 2) != 0) {
            v = civ7TradeSystemParameterSets0.baseResourceCapacity;
        }
        if((v3 & 4) != 0) {
            v1 = civ7TradeSystemParameterSets0.landRouteRange;
        }
        if((v3 & 8) != 0) {
            v2 = civ7TradeSystemParameterSets0.seaRouteRange;
        }
        if((v3 & 16) != 0) {
            z = civ7TradeSystemParameterSets0.startRoutesAtDistance;
        }
        return civ7TradeSystemParameterSets0.copy(s, v, v1, v2, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7TradeSystemParameterSets)) {
            return false;
        }
        if(!j.a(this.type, ((Civ7TradeSystemParameterSets)object0).type)) {
            return false;
        }
        if(this.baseResourceCapacity != ((Civ7TradeSystemParameterSets)object0).baseResourceCapacity) {
            return false;
        }
        if(this.landRouteRange != ((Civ7TradeSystemParameterSets)object0).landRouteRange) {
            return false;
        }
        return this.seaRouteRange == ((Civ7TradeSystemParameterSets)object0).seaRouteRange ? this.startRoutesAtDistance == ((Civ7TradeSystemParameterSets)object0).startRoutesAtDistance : false;
    }

    public final int getBaseResourceCapacity() {
        return this.baseResourceCapacity;
    }

    public final int getLandRouteRange() {
        return this.landRouteRange;
    }

    public final int getSeaRouteRange() {
        return this.seaRouteRange;
    }

    public final boolean getStartRoutesAtDistance() {
        return this.startRoutesAtDistance;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = (((this.type.hashCode() * 0x1F + this.baseResourceCapacity) * 0x1F + this.landRouteRange) * 0x1F + this.seaRouteRange) * 0x1F;
        return this.startRoutesAtDistance ? v + 0x4CF : v + 0x4D5;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.type;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.baseResourceCapacity, "Civ7TradeSystemParameterSets(type=", this.type, ", baseResourceCapacity=", ", landRouteRange=");
        f.q(stringBuilder0, this.landRouteRange, ", seaRouteRange=", this.seaRouteRange, ", startRoutesAtDistance=");
        return u9.g(stringBuilder0, this.startRoutesAtDistance, ")");
    }
}

