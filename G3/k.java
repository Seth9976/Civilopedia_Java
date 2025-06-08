package g3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import v3.b;
import v3.c;
import v3.i;
import w2.e;
import x2.w;

public abstract class k {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        k.a = linkedHashMap0;
        ArrayList arrayList0 = k.a(new String[]{"java.util.ArrayList", "java.util.LinkedList"});
        k.b(i.q, arrayList0);
        ArrayList arrayList1 = k.a(new String[]{"java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"});
        k.b(i.r, arrayList1);
        ArrayList arrayList2 = k.a(new String[]{"java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"});
        k.b(i.s, arrayList2);
        k.b(b.j(new c("java.util.function.Function")), k.a(new String[]{"java.util.function.UnaryOperator"}));
        k.b(b.j(new c("java.util.function.BiFunction")), k.a(new String[]{"java.util.function.BinaryOperator"}));
        ArrayList arrayList3 = new ArrayList(linkedHashMap0.size());
        for(Object object0: linkedHashMap0.entrySet()) {
            b b0 = (b)((Map.Entry)object0).getKey();
            b b1 = (b)((Map.Entry)object0).getValue();
            arrayList3.add(new e(b0.b(), b1.b()));
        }
        k.b = w.z(arrayList3);
    }

    public static ArrayList a(String[] arr_s) {
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            arrayList0.add(b.j(new c(arr_s[v])));
        }
        return arrayList0;
    }

    public static void b(b b0, ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            b b1 = (b)object0;
            k.a.put(object0, b0);
        }
    }
}

