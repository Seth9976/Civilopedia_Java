package com.spears.civilopedia.planning.logic.storage;

import J2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR/\u0010\u000F\u001A\u001A\u0012\u0004\u0012\u00020\u000E\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\u00070\u00070\r8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R)\u0010\u0013\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\u00070\u00070\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001A\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/planning/logic/storage/MapObject;", "", "", "leaderType", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "Lcom/spears/civilopedia/planning/logic/storage/SimplifiedPlot;", "plots", "Ljava/util/List;", "c", "()Ljava/util/List;", "", "", "cities", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "rivers", "d", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MapObject {
    private final Map cities;
    private final String leaderType;
    private final List plots;
    private final List rivers;

    public MapObject(String s, ArrayList arrayList0, HashMap hashMap0, ArrayList arrayList1) {
        j.f(s, "leaderType");
        super();
        this.leaderType = s;
        this.plots = arrayList0;
        this.cities = hashMap0;
        this.rivers = arrayList1;
    }

    public final Map a() {
        return this.cities;
    }

    public final String b() {
        return this.leaderType;
    }

    public final List c() {
        return this.plots;
    }

    public final List d() {
        return this.rivers;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MapObject)) {
            return false;
        }
        if(!j.a(this.leaderType, ((MapObject)object0).leaderType)) {
            return false;
        }
        if(!j.a(this.plots, ((MapObject)object0).plots)) {
            return false;
        }
        return j.a(this.cities, ((MapObject)object0).cities) ? j.a(this.rivers, ((MapObject)object0).rivers) : false;
    }

    @Override
    public final int hashCode() {
        return this.rivers.hashCode() + (this.cities.hashCode() + (this.plots.hashCode() + this.leaderType.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "MapObject(leaderType=" + this.leaderType + ", plots=" + this.plots + ", cities=" + this.cities + ", rivers=" + this.rivers + ")";
    }
}

