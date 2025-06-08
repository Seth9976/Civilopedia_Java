package Z;

import B1.a;
import E1.d;
import S.f;
import Y.b;
import Y.h;
import Y.k;
import Y.m;
import Y.s;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f0.g;
import g1.n;
import h0.e;
import h0.i;
import i0.o;
import j0.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public final class l implements Runnable {
    public volatile boolean A;
    public static final String B;
    public Context i;
    public String j;
    public List k;
    public a l;
    public i m;
    public ListenableWorker n;
    public a o;
    public Y.l p;
    public b q;
    public Z.b r;
    public WorkDatabase s;
    public d t;
    public n u;
    public n v;
    public ArrayList w;
    public String x;
    public j y;
    public n1.a z;

    static {
        l.B = "WM-WorkerWrapper";
    }

    public final void a(Y.l l0) {
        if(l0 instanceof k) {
            m.d().e("WM-WorkerWrapper", "Worker result SUCCESS for " + this.x, new Throwable[0]);
            if(this.m.c()) {
                this.d();
                return;
            }
            n n0 = this.u;
            String s = this.j;
            d d0 = this.t;
            WorkDatabase workDatabase0 = this.s;
            workDatabase0.c();
            try {
                d0.s(3, new String[]{s});
                d0.q(s, ((k)this.p).a);
                long v1 = System.currentTimeMillis();
                for(Object object0: n0.h(s)) {
                    String s1 = (String)object0;
                    if(d0.i(s1) == 5) {
                        O.k k0 = O.k.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                        if(s1 == null) {
                            k0.e(1);
                        }
                        else {
                            k0.f(1, s1);
                        }
                        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)n0.j;
                        workDatabase_Impl0.b();
                        Cursor cursor0 = workDatabase_Impl0.g(k0);
                        try {
                            boolean z = cursor0.moveToFirst() && cursor0.getInt(0) != 0;
                        }
                        finally {
                            cursor0.close();
                            k0.release();
                        }
                        if(z) {
                            m.d().e("WM-WorkerWrapper", "Setting status to enqueued for " + s1, new Throwable[0]);
                            d0.s(1, new String[]{s1});
                            d0.r(s1, v1);
                        }
                    }
                }
                workDatabase0.h();
            }
            finally {
                workDatabase0.f();
                this.e(false);
            }
            return;
        }
        if(l0 instanceof Y.j) {
            m.d().e("WM-WorkerWrapper", "Worker result RETRY for " + this.x, new Throwable[0]);
            this.c();
            return;
        }
        m.d().e("WM-WorkerWrapper", "Worker result FAILURE for " + this.x, new Throwable[0]);
        if(this.m.c()) {
            this.d();
            return;
        }
        this.g();
    }

    public final void b() {
        boolean z = this.h();
        String s = this.j;
        WorkDatabase workDatabase0 = this.s;
        if(!z) {
            workDatabase0.c();
            try {
                int v = this.t.i(s);
                g g0 = workDatabase0.m();
                WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)g0.j;
                workDatabase_Impl0.b();
                e e0 = (e)g0.l;
                f f0 = e0.a();
                if(s == null) {
                    f0.d(1);
                }
                else {
                    f0.e(1, s);
                }
                workDatabase_Impl0.c();
                try {
                    f0.l();
                    workDatabase_Impl0.h();
                }
                finally {
                    workDatabase_Impl0.f();
                    e0.c(f0);
                }
                switch(v) {
                    case 0: {
                        this.e(false);
                        break;
                    }
                    case 2: {
                        this.a(this.p);
                        break;
                    }
                    default: {
                        if(!A.f.a(v)) {
                            this.c();
                        }
                    }
                }
                workDatabase0.h();
            }
            catch(Throwable throwable0) {
                workDatabase0.f();
                throw throwable0;
            }
            workDatabase0.f();
        }
        List list0 = this.k;
        if(list0 != null) {
            for(Object object0: list0) {
                ((c)object0).b(s);
            }
            Z.d.a(this.q, workDatabase0, list0);
        }
    }

    public final void c() {
        String s = this.j;
        d d0 = this.t;
        WorkDatabase workDatabase0 = this.s;
        workDatabase0.c();
        try {
            d0.s(1, new String[]{s});
            d0.r(s, System.currentTimeMillis());
            d0.o(s, -1L);
            workDatabase0.h();
        }
        finally {
            workDatabase0.f();
            this.e(true);
        }
    }

    public final void d() {
        String s = this.j;
        d d0 = this.t;
        WorkDatabase workDatabase0 = this.s;
        workDatabase0.c();
        try {
            d0.r(s, System.currentTimeMillis());
            d0.s(1, new String[]{s});
            d0.p(s);
            d0.o(s, -1L);
            workDatabase0.h();
        }
        finally {
            workDatabase0.f();
            this.e(false);
        }
    }

    public final void e(boolean z) {
        this.s.c();
        try {
            d d0 = this.s.n();
            d0.getClass();
            O.k k0 = O.k.c(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)d0.i;
            workDatabase_Impl0.b();
            Cursor cursor0 = workDatabase_Impl0.g(k0);
            try {
                boolean z1 = cursor0.moveToFirst() && cursor0.getInt(0) != 0;
            }
            finally {
                cursor0.close();
                k0.release();
            }
            if(!z1) {
                i0.f.a(this.i, RescheduleReceiver.class, false);
            }
            if(z) {
                this.t.s(1, new String[]{this.j});
                this.t.o(this.j, -1L);
            }
            if(this.m != null && (this.n != null && this.n.isRunInForeground())) {
                Z.b b0 = this.r;
                synchronized(b0.s) {
                    b0.n.remove(this.j);
                    b0.i();
                }
            }
            this.s.h();
        }
        finally {
            this.s.f();
        }
        this.y.j(Boolean.valueOf(z));
    }

    public final void f() {
        String s = this.j;
        int v = this.t.i(s);
        if(v == 2) {
            m.d().a("WM-WorkerWrapper", i3.e.f("Status for ", s, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            this.e(true);
            return;
        }
        m.d().a("WM-WorkerWrapper", "Status for " + s + " is " + A.f.x(v) + "; not doing any work", new Throwable[0]);
        this.e(false);
    }

    public final void g() {
        String s = this.j;
        WorkDatabase workDatabase0 = this.s;
        workDatabase0.c();
        try {
            LinkedList linkedList0 = new LinkedList();
            linkedList0.add(s);
            while(!linkedList0.isEmpty()) {
                String s1 = (String)linkedList0.remove();
                d d0 = this.t;
                if(d0.i(s1) != 6) {
                    d0.s(4, new String[]{s1});
                }
                linkedList0.addAll(this.u.h(s1));
            }
            this.t.q(s, ((Y.i)this.p).a);
            workDatabase0.h();
        }
        finally {
            workDatabase0.f();
            this.e(false);
        }
    }

    public final boolean h() {
        if(this.A) {
            m.d().a("WM-WorkerWrapper", "Work interrupted for " + this.x, new Throwable[0]);
            int v = this.t.i(this.j);
            if(v == 0) {
                this.e(false);
                return true;
            }
            this.e(!A.f.a(v));
            return true;
        }
        return false;
    }

    @Override
    public final void run() {
        ArrayList arrayList2;
        h h0;
        Y.f f0;
        String s = this.j;
        ArrayList arrayList0 = this.v.k(s);
        this.w = arrayList0;
        StringBuilder stringBuilder0 = new StringBuilder("Work [ id=");
        stringBuilder0.append(s);
        stringBuilder0.append(", tags={ ");
        boolean z = true;
        for(Object object0: arrayList0) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((String)object0));
        }
        stringBuilder0.append(" } ]");
        this.x = stringBuilder0.toString();
        d d0 = this.t;
        if(!this.h()) {
            WorkDatabase workDatabase0 = this.s;
            workDatabase0.c();
            try {
                i i0 = d0.l(s);
                this.m = i0;
                if(i0 == null) {
                    goto label_126;
                }
                if(i0.b != 1) {
                    goto label_122;
                }
                if((i0.c() || this.m.b == 1 && this.m.k > 0) && (this.m.n != 0L && System.currentTimeMillis() < this.m.a())) {
                    m.d().a("WM-WorkerWrapper", "Delaying execution for " + this.m.c + " because it is being executed before schedule.", new Throwable[0]);
                    this.e(true);
                    workDatabase0.h();
                    goto label_133;
                }
                workDatabase0.h();
            }
            catch(Throwable throwable0) {
                workDatabase0.f();
                throw throwable0;
            }
            workDatabase0.f();
            b b0 = this.q;
            if(this.m.c()) {
                f0 = this.m.e;
            }
            else {
                String s1 = this.m.d;
                b0.d.getClass();
                try {
                    h0 = (h)Class.forName(s1).newInstance();
                }
                catch(Exception exception0) {
                    m.d().b("WM-InputMerger", "Trouble instantiating + " + s1, new Throwable[]{exception0});
                    h0 = null;
                }
                if(h0 == null) {
                    m.d().b("WM-WorkerWrapper", "Could not create Input Merger " + this.m.d, new Throwable[0]);
                    this.g();
                    return;
                }
                ArrayList arrayList1 = new ArrayList();
                arrayList1.add(this.m.e);
                O.k k0 = O.k.c(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if(s == null) {
                    k0.e(1);
                }
                else {
                    k0.f(1, s);
                }
                WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)d0.i;
                workDatabase_Impl0.b();
                Cursor cursor0 = workDatabase_Impl0.g(k0);
                try {
                    arrayList2 = new ArrayList(cursor0.getCount());
                    while(cursor0.moveToNext()) {
                        arrayList2.add(Y.f.a(cursor0.getBlob(0)));
                    }
                }
                finally {
                    cursor0.close();
                    k0.release();
                }
                arrayList1.addAll(arrayList2);
                f0 = h0.a(arrayList1);
            }
            UUID uUID0 = UUID.fromString(s);
            ArrayList arrayList3 = this.w;
            int v1 = this.m.k;
            a a0 = this.o;
            o o0 = new o(workDatabase0, a0);
            i0.m m0 = new i0.m(workDatabase0, this.r, a0);
            WorkerParameters workerParameters0 = new WorkerParameters();  // 初始化器: Ljava/lang/Object;-><init>()V
            workerParameters0.a = uUID0;
            workerParameters0.b = f0;
            workerParameters0.c = new HashSet(arrayList3);
            workerParameters0.d = this.l;
            workerParameters0.e = v1;
            workerParameters0.f = b0.a;
            workerParameters0.g = a0;
            s s2 = b0.c;
            workerParameters0.h = s2;
            workerParameters0.i = o0;
            workerParameters0.j = m0;
            if(this.n == null) {
                this.n = s2.a(this.i, this.m.c, workerParameters0);
            }
            ListenableWorker listenableWorker0 = this.n;
            if(listenableWorker0 == null) {
                m.d().b("WM-WorkerWrapper", "Could not create Worker " + this.m.c, new Throwable[0]);
                this.g();
                return;
            }
            if(listenableWorker0.isUsed()) {
                m.d().b("WM-WorkerWrapper", i3.e.f("Received an already-used Worker ", this.m.c, "; WorkerFactory should return new instances"), new Throwable[0]);
                this.g();
                return;
            }
            boolean z1 = true;
            this.n.setUsed();
            workDatabase0.c();
            try {
                if(d0.i(s) == 1) {
                    d0.s(2, new String[]{s});
                    d0.m(s);
                }
                else {
                    z1 = false;
                }
                workDatabase0.h();
            }
            finally {
                workDatabase0.f();
            }
            if(!z1) {
                this.f();
                return;
                try {
                label_122:
                    this.f();
                    workDatabase0.h();
                    m.d().a("WM-WorkerWrapper", this.m.c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
                    goto label_133;
                label_126:
                    m.d().b("WM-WorkerWrapper", "Didn\'t find WorkSpec for id " + s, new Throwable[0]);
                    this.e(false);
                    workDatabase0.h();
                }
                catch(Throwable throwable0) {
                    workDatabase0.f();
                    throw throwable0;
                }
            label_133:
                workDatabase0.f();
            }
            else if(!this.h()) {
                j j0 = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
                i0.l l0 = new i0.l(this.i, this.m, this.n, m0, this.o);
                ((A.c)a0.l).execute(l0);
                B.o o1 = new B.o(this, l0.i, j0, 6);
                l0.i.b(o1, ((A.c)a0.l));
                j0.b(new B.o(this, j0, this.x, 7), ((i0.h)a0.j));
            }
        }
    }
}

