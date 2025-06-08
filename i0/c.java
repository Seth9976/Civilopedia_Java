package i0;

import E1.d;
import O2.A;
import S.f;
import Y.m;
import Y.n;
import Y.o;
import Y.r;
import Z.e;
import Z.k;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import h0.h;
import h0.i;
import h0.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import o1.a;

public final class c implements Runnable {
    public final e i;
    public final B.c j;
    public static final String k;

    static {
        c.k = "WM-EnqueueRunnable";
    }

    public c(e e0) {
        this.i = e0;
        this.j = new B.c(19);
    }

    public static boolean a(e e0) {
        Iterator iterator4;
        String[] arr_s2;
        boolean z6;
        String[] arr_s1;
        boolean z5;
        boolean z3;
        boolean z2;
        int v2;
        boolean z = false;
        String[] arr_s = (String[])e.p0(e0).toArray(new String[0]);
        long v = System.currentTimeMillis();
        k k0 = e0.c;
        WorkDatabase workDatabase0 = k0.m;
        boolean z1 = arr_s != null && arr_s.length > 0;
        if(z1) {
            v2 = 1;
            z2 = false;
            z3 = false;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s = arr_s[v1];
                i i0 = workDatabase0.n().l(s);
                if(i0 == null) {
                    m.d().b("WM-EnqueueRunnable", i3.e.f("Prerequisite ", s, " doesn\'t exist; not enqueuing"), new Throwable[0]);
                    e0.g = true;
                    return z;
                }
                int v3 = i0.b;
                v2 &= (v3 == 3 ? 1 : 0);
                if(v3 == 4) {
                    z3 = true;
                }
                else if(v3 == 6) {
                    z2 = true;
                }
            }
        }
        else {
            v2 = 1;
            z2 = false;
            z3 = false;
        }
        boolean z4 = TextUtils.isEmpty(null);
        if(z4 || z1) {
            arr_s1 = arr_s;
            z5 = z4;
            z6 = false;
        }
        else {
            d d0 = workDatabase0.n();
            d0.getClass();
            O.k k1 = O.k.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            k1.e(1);
            WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)d0.i;
            workDatabase_Impl0.b();
            Cursor cursor0 = workDatabase_Impl0.g(k1);
            try {
                int v5 = a.v(cursor0, "id");
                int v6 = a.v(cursor0, "state");
                z5 = false;
                ArrayList arrayList0 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    h h0 = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
                    h0.a = cursor0.getString(v5);
                    h0.b = A.N(cursor0.getInt(v6));
                    arrayList0.add(h0);
                }
                arr_s1 = arr_s;
            }
            finally {
                cursor0.close();
                k1.release();
            }
            if(arrayList0.isEmpty()) {
                z6 = false;
            }
            else {
                for(Object object0: arrayList0) {
                    switch(((h)object0).b) {
                        case 1: 
                        case 2: {
                            e0.g = true;
                            return z;
                        }
                    }
                }
                new b(k0, 1).run();
                d d1 = workDatabase0.n();
                for(Object object1: arrayList0) {
                    String s1 = ((h)object1).a;
                    WorkDatabase_Impl workDatabase_Impl1 = (WorkDatabase_Impl)d1.i;
                    workDatabase_Impl1.b();
                    h0.e e1 = (h0.e)d1.k;
                    f f0 = e1.a();
                    if(s1 == null) {
                        f0.d(1);
                    }
                    else {
                        f0.e(1, s1);
                    }
                    workDatabase_Impl1.c();
                    try {
                        f0.l();
                        workDatabase_Impl1.h();
                    }
                    finally {
                        workDatabase_Impl1.f();
                        e1.c(f0);
                    }
                }
                z6 = true;
            }
        }
        boolean z7 = z6;
        Iterator iterator2 = e0.d.iterator();
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            i i1 = ((n)object2).b;
            if(!z1 || v2 != 0) {
                i1.n = i1.c() ? 0L : v;
            }
            else if(z3) {
                i1.b = 4;
            }
            else if(z2) {
                i1.b = 6;
            }
            else {
                i1.b = 5;
            }
            int v8 = Build.VERSION.SDK_INT;
            if(v8 >= 23 && v8 <= 25) {
                c.b(i1);
            }
            else if(v8 <= 22) {
                try {
                    Class class0 = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                    Iterator iterator3 = k0.o.iterator();
                    while(true) {
                    label_116:
                        if(!iterator3.hasNext()) {
                            goto label_122;
                        }
                        Object object3 = iterator3.next();
                        if(class0.isAssignableFrom(((Z.c)object3).getClass())) {
                            break;
                        }
                        goto label_121;
                    }
                }
                catch(ClassNotFoundException unused_ex) {
                    goto label_122;
                }
                c.b(i1);
                goto label_122;
            label_121:
                if(false) {
                    goto label_122;
                }
                goto label_116;
            }
        label_122:
            if(i1.b == 1) {
                z7 = true;
            }
            d d2 = workDatabase0.n();
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl)d2.i;
            workDatabase_Impl2.b();
            workDatabase_Impl2.c();
            try {
                ((h0.b)d2.j).e(i1);
                workDatabase_Impl2.h();
            }
            finally {
                workDatabase_Impl2.f();
            }
            UUID uUID0 = ((n)object2).a;
            if(z1) {
                arr_s2 = arr_s1;
                int v10 = arr_s2.length;
                int v11 = 0;
                while(true) {
                    iterator4 = iterator2;
                    if(v11 >= v10) {
                        break;
                    }
                    h0.a a0 = new h0.a(uUID0.toString(), arr_s2[v11]);
                    g1.n n0 = workDatabase0.i();
                    WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl)n0.j;
                    workDatabase_Impl3.b();
                    workDatabase_Impl3.c();
                    try {
                        ((h0.b)n0.k).e(a0);
                        workDatabase_Impl3.h();
                    }
                    finally {
                        workDatabase_Impl3.f();
                    }
                    ++v11;
                    iterator2 = iterator4;
                }
            }
            else {
                arr_s2 = arr_s1;
                iterator4 = iterator2;
            }
            for(Object object4: ((n)object2).c) {
                g1.n n1 = workDatabase0.o();
                j j0 = new j(((String)object4), uUID0.toString());
                WorkDatabase_Impl workDatabase_Impl4 = (WorkDatabase_Impl)n1.j;
                workDatabase_Impl4.b();
                workDatabase_Impl4.c();
                try {
                    ((h0.b)n1.k).e(j0);
                    workDatabase_Impl4.h();
                }
                finally {
                    workDatabase_Impl4.f();
                }
            }
            if(!z5) {
                g1.n n2 = workDatabase0.l();
                h0.f f1 = new h0.f(uUID0.toString());
                WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl)n2.j;
                workDatabase_Impl5.b();
                workDatabase_Impl5.c();
                try {
                    ((h0.b)n2.k).e(f1);
                    workDatabase_Impl5.h();
                }
                finally {
                    workDatabase_Impl5.f();
                }
            }
            iterator2 = iterator4;
            arr_s1 = arr_s2;
        }
        e0.g = true;
        return z7;
    }

    public static void b(i i0) {
        String s = i0.c;
        Class class0 = ConstraintTrackingWorker.class;
        if(!s.equals(class0.getName()) && (i0.j.d || i0.j.e)) {
            O.i i1 = new O.i();
            i1.a(i0.e.a);
            i1.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", s);
            i0.c = class0.getName();
            Y.f f0 = new Y.f(i1.a);
            Y.f.b(f0);
            i0.e = f0;
        }
    }

    @Override
    public final void run() {
        B.c c0;
        try {
            c0 = this.j;
            e e0 = this.i;
            if(e.o0(e0, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + e0 + ")");
            }
            k k0 = e0.c;
            k0.m.c();
            try {
                boolean z = c.a(e0);
                k0.m.h();
            }
            finally {
                k0.m.f();
            }
            if(z) {
                i0.f.a(k0.k, RescheduleReceiver.class, true);
                Z.d.a(k0.l, k0.m, k0.o);
            }
            c0.K(r.c);
            return;
        }
        catch(Throwable throwable0) {
        }
        c0.K(new o(throwable0));
    }
}

