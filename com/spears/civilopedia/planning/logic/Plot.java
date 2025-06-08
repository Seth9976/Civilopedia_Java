package com.spears.civilopedia.planning.logic;

import J2.j;
import android.util.Size;
import com.spears.civilopedia.db.tables.Building_YieldChanges;
import com.spears.civilopedia.db.tables.Feature_YieldChanges;
import com.spears.civilopedia.db.tables.Features;
import com.spears.civilopedia.db.tables.Improvement_YieldChanges;
import com.spears.civilopedia.db.tables.Resource_YieldChanges;
import com.spears.civilopedia.db.tables.Terrain_YieldChanges;
import i3.e;
import java.util.ArrayList;
import kotlin.Metadata;
import n2.E;
import n2.o;
import o2.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0018\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006\"\u0004\b\u000B\u0010\bR$\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001A\u0004\b\r\u0010\u0006\"\u0004\b\u000E\u0010\bR$\u0010\u000F\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000F\u0010\u0004\u001A\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001A\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001A\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001A"}, d2 = {"Lcom/spears/civilopedia/planning/logic/Plot;", "", "", "terrain", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "feature", "f", "p", "resource", "h", "r", "district", "e", "o", "building", "d", "n", "improvement", "g", "q", "Companion", "n2/o", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Plot {
    public static final o Companion;
    private String building;
    private String district;
    private String feature;
    private static final double hexagonHeight;
    private String improvement;
    private static final Size itemSize;
    private String resource;
    private String terrain;

    static {
        Plot.Companion = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
        Size size0 = new Size(0xAE, 0xAE);
        Plot.itemSize = size0;
        Plot.hexagonHeight = ((double)(size0.getHeight() * 2)) / 1.732051;
    }

    public Plot() {
        this("TERRAIN_PLAINS", null, null, null, null, null);
    }

    public Plot(String s, String s1, String s2, String s3, String s4, String s5) {
        this.terrain = s;
        this.feature = s1;
        this.resource = s2;
        this.district = s3;
        this.building = s4;
        this.improvement = s5;
    }

    public static final double a() [...] // Potential decryptor

    public static Plot c(Plot plot0) {
        String s = plot0.terrain;
        String s1 = plot0.feature;
        String s2 = plot0.resource;
        String s3 = plot0.district;
        String s4 = plot0.building;
        String s5 = plot0.improvement;
        plot0.getClass();
        j.f(s, "terrain");
        return new Plot(s, s1, s2, s3, s4, s5);
    }

    public final String d() {
        return this.building;
    }

    public final String e() {
        return this.district;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Plot)) {
            return false;
        }
        if(!j.a(this.terrain, ((Plot)object0).terrain)) {
            return false;
        }
        if(!j.a(this.feature, ((Plot)object0).feature)) {
            return false;
        }
        if(!j.a(this.resource, ((Plot)object0).resource)) {
            return false;
        }
        if(!j.a(this.district, ((Plot)object0).district)) {
            return false;
        }
        return j.a(this.building, ((Plot)object0).building) ? j.a(this.improvement, ((Plot)object0).improvement) : false;
    }

    public final String f() {
        return this.feature;
    }

    public final String g() {
        return this.improvement;
    }

    public final String h() {
        return this.resource;
    }

    @Override
    public final int hashCode() {
        int v = this.terrain.hashCode();
        int v1 = 0;
        int v2 = this.feature == null ? 0 : this.feature.hashCode();
        int v3 = this.resource == null ? 0 : this.resource.hashCode();
        int v4 = this.district == null ? 0 : this.district.hashCode();
        int v5 = this.building == null ? 0 : this.building.hashCode();
        String s = this.improvement;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    public final String i() [...] // Potential decryptor

    // 去混淆评级： 低(20)
    public final boolean j() {
        return (this.district == null || this.k()) && this.building == null;
    }

    public final boolean k() {
        return j.a(this.district, "DISTRICT_CITY_CENTER");
    }

    public final boolean l(f f0) {
        if(j.a(this.terrain, "TERRAIN_COAST")) {
            return true;
        }
        Features features0 = (Features)f0.j0.h(this.feature);
        return features0 == null ? false : features0.getLake();
    }

    public final boolean m() {
        return j.a(this.terrain, "TERRAIN_GRASS_MOUNTAIN");
    }

    public final void n(String s) {
        this.building = s;
    }

    public final void o(String s) {
        this.district = s;
    }

    public final void p(String s) {
        this.feature = s;
    }

    public final void q(String s) {
        this.improvement = s;
    }

    public final void r(String s) {
        this.resource = s;
    }

    public final void s(String s) {
        this.terrain = s;
    }

    public final void t(Plot plot0) {
        this.terrain = plot0.terrain;
        this.feature = plot0.feature;
        this.resource = plot0.resource;
        this.improvement = plot0.improvement;
        this.district = plot0.district;
        this.building = plot0.building;
    }

    @Override
    public final String toString() {
        String s = this.resource;
        String s1 = this.district;
        String s2 = this.building;
        String s3 = this.improvement;
        StringBuilder stringBuilder0 = e.j("Plot(terrain=", this.terrain, ", feature=", this.feature, ", resource=");
        A.f.t(stringBuilder0, s, ", district=", s1, ", building=");
        return e.i(stringBuilder0, s2, ", improvement=", s3, ")");
    }

    public final E u(f f0, boolean z) {
        j.f(f0, "gameInfo");
        E e0 = new E();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f0.y1)) {
            if(j.a(((Terrain_YieldChanges)object0).getTerrainType(), this.terrain)) {
                arrayList0.add(object0);
            }
        }
        for(Object object1: arrayList0) {
            String s = ((Terrain_YieldChanges)object1).getYieldType();
            int v = ((Terrain_YieldChanges)object1).getYieldChange();
            if(z) {
                v *= 2;
            }
            e0.a(v, s);
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: ((Iterable)f0.i0)) {
            if(j.a(((Feature_YieldChanges)object2).getFeatureType(), this.feature)) {
                arrayList1.add(object2);
            }
        }
        for(Object object3: arrayList1) {
            e0.a(((Feature_YieldChanges)object3).getYieldChange(), ((Feature_YieldChanges)object3).getYieldType());
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object4: ((Iterable)f0.n1)) {
            if(j.a(((Resource_YieldChanges)object4).getResourceType(), this.resource)) {
                arrayList2.add(object4);
            }
        }
        for(Object object5: arrayList2) {
            e0.a(((Resource_YieldChanges)object5).getYieldChange(), ((Resource_YieldChanges)object5).getYieldType());
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object6: ((Iterable)f0.J0)) {
            if(j.a(((Improvement_YieldChanges)object6).getImprovementType(), this.improvement)) {
                arrayList3.add(object6);
            }
        }
        for(Object object7: arrayList3) {
            e0.a(((Improvement_YieldChanges)object7).getYieldChange(), ((Improvement_YieldChanges)object7).getYieldType());
        }
        ArrayList arrayList4 = new ArrayList();
        for(Object object8: ((Iterable)f0.s)) {
            if(j.a(((Building_YieldChanges)object8).getBuildingType(), this.building)) {
                arrayList4.add(object8);
            }
        }
        for(Object object9: arrayList4) {
            e0.a(((Building_YieldChanges)object9).getYieldChange(), ((Building_YieldChanges)object9).getYieldType());
        }
        return e0;
    }
}

