package s1;

import L1.b;
import M1.c;
import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o1.d;
import o2.C;
import o2.I;

public final class g extends I {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final k d;
    public final AtomicReference e;
    public static final f f;

    static {
        g.f = new f(0);
    }

    public g(d d0, ArrayList arrayList0, ArrayList arrayList1) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new AtomicReference();
        k k0 = new k(d0);
        this.d = k0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(a.a(k0, k.class, new Class[]{b.class, L1.a.class}));
        arrayList2.add(a.a(this, g.class, new Class[0]));
        for(Object object0: arrayList1) {
            a a0 = (a)object0;
            if(a0 != null) {
                arrayList2.add(a0);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object1: arrayList0) {
            arrayList3.add(object1);
        }
        ArrayList arrayList4 = new ArrayList();
        synchronized(this) {
            Iterator iterator2 = arrayList3.iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                N1.b b0 = (N1.b)object2;
                try {
                    e e0 = (e)b0.get();
                    if(e0 == null) {
                        continue;
                    }
                    arrayList2.addAll(e0.getComponents());
                    iterator2.remove();
                }
                catch(InvalidRegistrarException invalidRegistrarException0) {
                    iterator2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", invalidRegistrarException0);
                }
            }
            if(this.a.isEmpty()) {
                C.h(arrayList2);
            }
            else {
                ArrayList arrayList5 = new ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList2);
                C.h(arrayList5);
            }
            for(Object object3: arrayList2) {
                l l0 = new l(new c(2, this, ((a)object3)));
                this.a.put(((a)object3), l0);
            }
            arrayList4.addAll(this.y(arrayList2));
            arrayList4.addAll(this.z());
            this.x();
        }
        for(Object object4: arrayList4) {
            ((Runnable)object4).run();
        }
        Boolean boolean0 = (Boolean)this.e.get();
        if(boolean0 != null) {
            this.w(this.a, boolean0.booleanValue());
        }
    }

    @Override  // s1.b
    public final N1.b c(Class class0) {
        synchronized(this) {
            return (N1.b)this.b.get(class0);
        }
    }

    @Override  // s1.b
    public final N1.b d(Class class0) {
        synchronized(this) {
            N1.b b0 = (m)this.c.get(class0);
            return b0 != null ? b0 : g.f;
        }
    }

    @Override  // s1.b
    public final n e(Class class0) {
        N1.b b0 = this.c(class0);
        if(b0 == null) {
            return new n(n.c, n.d);
        }
        return b0 instanceof n ? ((n)b0) : new n(null, b0);
    }

    public final void w(HashMap hashMap0, boolean z) {
        ArrayDeque arrayDeque0;
        for(Object object0: hashMap0.entrySet()) {
            a a0 = (a)((Map.Entry)object0).getKey();
            N1.b b0 = (N1.b)((Map.Entry)object0).getValue();
            if(a0.c == 1 || a0.c == 2 && z) {
                b0.get();
            }
        }
        k k0 = this.d;
        synchronized(k0) {
            arrayDeque0 = k0.b;
            if(arrayDeque0 == null) {
                arrayDeque0 = null;
            }
            else {
                k0.b = null;
            }
        }
        if(arrayDeque0 != null) {
            Iterator iterator1 = arrayDeque0.iterator();
            if(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                object1.getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void x() {
        for(Object object0: this.a.keySet()) {
            a a0 = (a)object0;
            for(Object object1: a0.b) {
                j j0 = (j)object1;
                Class class0 = j0.a;
                if(j0.b == 2) {
                    HashMap hashMap0 = this.c;
                    if(!hashMap0.containsKey(class0)) {
                        Set set0 = Collections.emptySet();
                        m m0 = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
                        m0.b = null;
                        m0.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        m0.a.addAll(set0);
                        hashMap0.put(class0, m0);
                        continue;
                    }
                }
                HashMap hashMap1 = this.b;
                if(!hashMap1.containsKey(class0)) {
                    switch(j0.b) {
                        case 1: {
                            throw new MissingDependencyException("Unsatisfied dependency for component " + a0 + ": " + class0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        case 2: {
                            continue;
                        }
                    }
                    hashMap1.put(class0, new n(n.c, n.d));
                }
            }
        }
    }

    public final ArrayList y(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            a a0 = (a)object0;
            if(a0.d == 0) {
                N1.b b0 = (N1.b)this.a.get(a0);
                for(Object object1: a0.a) {
                    Class class0 = (Class)object1;
                    HashMap hashMap0 = this.b;
                    if(hashMap0.containsKey(class0)) {
                        arrayList1.add(new q2.b(1, ((n)(((N1.b)hashMap0.get(class0)))), b0));
                    }
                    else {
                        hashMap0.put(class0, b0);
                    }
                }
            }
        }
        return arrayList1;
    }

    public final ArrayList z() {
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            a a0 = (a)map$Entry0.getKey();
            if(a0.d != 0) {
                N1.b b0 = (N1.b)map$Entry0.getValue();
                for(Object object1: a0.a) {
                    Class class0 = (Class)object1;
                    if(!hashMap0.containsKey(class0)) {
                        hashMap0.put(class0, new HashSet());
                    }
                    ((Set)hashMap0.get(class0)).add(b0);
                }
            }
        }
        for(Object object2: hashMap0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object2;
            Object object3 = map$Entry1.getKey();
            HashMap hashMap1 = this.c;
            if(hashMap1.containsKey(object3)) {
                m m1 = (m)hashMap1.get(map$Entry1.getKey());
                for(Object object4: ((Set)map$Entry1.getValue())) {
                    arrayList0.add(new q2.b(2, m1, ((N1.b)object4)));
                }
            }
            else {
                Class class1 = (Class)map$Entry1.getKey();
                Set set0 = (Set)(((Collection)map$Entry1.getValue()));
                m m0 = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
                m0.b = null;
                m0.a = Collections.newSetFromMap(new ConcurrentHashMap());
                m0.a.addAll(set0);
                hashMap1.put(class1, m0);
            }
        }
        return arrayList0;
    }
}

