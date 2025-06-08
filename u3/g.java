package u3;

import X3.b;
import X3.o;
import Y3.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import s3.f;
import t3.h;
import w3.e;
import x2.i;
import x2.j;
import x2.k;
import x2.t;
import x2.u;
import x2.w;

public final class g implements f {
    public final String[] i;
    public final Set j;
    public final ArrayList k;
    public static final List l;

    // 去混淆评级： 中等(70)
    static {
        List list0 = j.z(new String[]{"kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator"});
        g.l = list0;
        o o0 = i.u0(list0);
        int v = w.q(k.E(o0));
        if(v < 16) {
            v = 16;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
        Iterator iterator0 = o0.iterator();
        while(((b)iterator0).j.hasNext()) {
            u u0 = (u)((b)iterator0).next();
            linkedHashMap0.put(((String)u0.b), u0.a);
        }
    }

    public g(t3.j j0, String[] arr_s) {
        J2.j.f(arr_s, "strings");
        List list0 = j0.k;
        Set set0 = list0.isEmpty() ? t.i : i.s0(list0);
        List list1 = j0.j;
        J2.j.e(list1, "getRecordList(...)");
        ArrayList arrayList0 = new ArrayList();
        arrayList0.ensureCapacity(list1.size());
        for(Object object0: list1) {
            t3.i i0 = (t3.i)object0;
            int v = i0.k;
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add(i0);
            }
        }
        arrayList0.trimToSize();
        super();
        this.i = arr_s;
        this.j = set0;
        this.k = arrayList0;
    }

    @Override  // s3.f
    public final boolean a(int v) {
        return this.j.contains(v);
    }

    @Override  // s3.f
    public final String b(int v) {
        return this.getString(v);
    }

    @Override  // s3.f
    public final String getString(int v) {
        String s;
        t3.i i0 = (t3.i)this.k.get(v);
        int v1 = i0.j;
        if((v1 & 4) == 4) {
            Object object0 = i0.m;
            if(object0 instanceof String) {
                s = (String)object0;
            }
            else {
                String s1 = ((e)object0).s();
                if(((e)object0).m()) {
                    i0.m = s1;
                }
                s = s1;
            }
        }
        else if((v1 & 2) == 2) {
            List list0 = g.l;
            int v2 = i0.l;
            s = v2 < 0 || v2 >= list0.size() ? this.i[v] : ((String)list0.get(v2));
        }
        else {
            s = this.i[v];
        }
        if(i0.o.size() >= 2) {
            List list1 = i0.o;
            J2.j.c(list1);
            Integer integer0 = (Integer)list1.get(0);
            Integer integer1 = (Integer)list1.get(1);
            J2.j.c(integer0);
            if(((int)integer0) >= 0) {
                J2.j.c(integer1);
                if(((int)integer0) <= ((int)integer1) && ((int)integer1) <= s.length()) {
                    s = s.substring(((int)integer0), ((int)integer1));
                    J2.j.e(s, "substring(...)");
                }
            }
        }
        if(i0.q.size() >= 2) {
            List list2 = i0.q;
            J2.j.c(list2);
            Integer integer2 = (Integer)list2.get(0);
            Integer integer3 = (Integer)list2.get(1);
            J2.j.c(s);
            s = n.E0(s, ((char)(((int)integer2))), ((char)(((int)integer3))));
        }
        switch((i0.n == null ? h.j : i0.n).ordinal()) {
            case 1: {
                J2.j.c(s);
                s = n.E0(s, '$', '.');
                break;
            }
            case 2: {
                if(s.length() >= 2) {
                    s = s.substring(1, s.length() - 1);
                    J2.j.e(s, "substring(...)");
                }
                s = n.E0(s, '$', '.');
            }
        }
        J2.j.c(s);
        return s;
    }
}

