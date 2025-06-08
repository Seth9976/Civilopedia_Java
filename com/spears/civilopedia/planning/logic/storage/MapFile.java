package com.spears.civilopedia.planning.logic.storage;

import J2.j;
import com.spears.civilopedia.db.tables.CityNames;
import f2.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import n2.A;
import n2.b;
import n2.c;
import n2.m;
import n2.s;
import n2.t;
import n2.v;
import n2.x;
import o2.f;
import x2.i;
import x2.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\fR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B¨\u0006\r"}, d2 = {"Lcom/spears/civilopedia/planning/logic/storage/MapFile;", "", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "Lcom/spears/civilopedia/planning/logic/storage/MapObject;", "object", "Lcom/spears/civilopedia/planning/logic/storage/MapObject;", "getObject", "()Lcom/spears/civilopedia/planning/logic/storage/MapObject;", "Companion", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MapFile {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spears/civilopedia/planning/logic/storage/MapFile$Companion;", "", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
    }

    public static final Companion Companion;
    private final MapObject object;
    private final String version;

    static {
        MapFile.Companion = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public MapFile(MapObject mapObject0) {
        this.version = "1";
        this.object = mapObject0;
    }

    public final A a(l l0) {
        String s2;
        j.f(l0, "environment");
        String s = new m(l0, this.object.b()).b();
        f f0 = l0.b.b();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f0.x)) {
            if(j.a(((CityNames)object0).getCivilizationType(), s)) {
                arrayList0.add(object0);
            }
        }
        List list0 = i.m0(arrayList0, new MapFile.buildWorld..inlined.sortedBy.1());  // 初始化器: Ljava/lang/Object;-><init>()V
        Map map0 = this.object.a();
        ArrayList arrayList1 = new ArrayList(map0.size());
        for(Object object1: map0.entrySet()) {
            int v = ((Number)((Map.Entry)object1).getKey()).intValue();
            List list1 = (List)((Map.Entry)object1).getValue();
            CityNames cityNames0 = (CityNames)i.V(v, list0);
            if(cityNames0 == null) {
                s2 = "??";
            }
            else {
                String s1 = cityNames0.getCityName();
                if(s1 != null) {
                    s2 = s1;
                }
            }
            ArrayList arrayList2 = new ArrayList(k.E(list1));
            for(Object object2: list1) {
                arrayList2.add(new t(((List)object2)));
            }
            arrayList1.add(new b(v, s2, i.p0(arrayList2)));
        }
        Iterable iterable0 = this.object.c();
        ArrayList arrayList3 = new ArrayList(k.E(iterable0));
        for(Object object3: iterable0) {
            arrayList3.add(new v(new t(((SimplifiedPlot)object3).b()), ((SimplifiedPlot)object3).a()));
        }
        Iterable iterable1 = this.object.d();
        ArrayList arrayList4 = new ArrayList(k.E(iterable1));
        for(Object object4: iterable1) {
            arrayList4.add(new x(new t(((List)((List)object4).get(0))), new t(((List)((List)object4).get(1)))));
        }
        String s3 = this.object.b();
        s s4 = new s(i.p0(arrayList3));
        c c0 = new c(0, arrayList1);
        c c1 = new c(1, i.p0(arrayList4));
        j.f(l0, "environment");
        j.f(s3, "leaderType");
        A a0 = new A();  // 初始化器: Ljava/lang/Object;-><init>()V
        a0.h = new HashMap();
        a0.g = l0;
        a0.a = s3;
        a0.d = c0;
        a0.c = s4;
        a0.b = c1;
        for(Object object5: c0.a) {
            a0.d(((b)object5));
        }
        a0.f = new m(l0, s3);
        return a0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MapFile)) {
            return false;
        }
        return j.a(this.version, ((MapFile)object0).version) ? j.a(this.object, ((MapFile)object0).object) : false;
    }

    @Override
    public final int hashCode() {
        return this.object.hashCode() + this.version.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "MapFile(version=" + this.version + ", object=" + this.object + ")";
    }
}

