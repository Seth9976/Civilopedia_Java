package B;

import D.c;
import J2.j;
import N.x;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzekp;
import com.google.android.gms.internal.ads.zzeku;
import com.google.android.gms.internal.ads.zzfbl;
import com.google.android.gms.internal.ads.zzfbx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.spears.civilopedia.db.tables.CivilizationLeaders;
import f2.D;
import f2.G;
import f2.J;
import j3.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.d;
import k2.g;
import l.L0;
import n2.m;
import o2.q;
import o2.s;
import o3.l;
import q0.i;
import q0.o;
import q0.p;
import r2.a;
import r2.h;
import s0.b;
import x2.k;
import z1.F;
import z1.H;
import z1.M;
import z1.N;
import z1.O;
import z1.a0;
import z1.r0;

public final class f implements zzf, l, b {
    public final int i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public f(int v) {
        this.i = v;
        super();
    }

    public f(f f0) {
        this.i = 8;
        super();
        this.k = f0;
        Context context0 = ((LinearLayout)f0.j).getContext();
        j.d(context0, "null cannot be cast to non-null type com.spears.civilopedia.tree.TreeActivity");
        f2.l l0 = ((h)context0).l();
        this.n = l0;
        m m0 = new m(l0, "");
        this.l = m0.c();
        List list0 = m0.c();
        String s = l0.a.getString("tree-selected-leader", null);
        if(s == null) {
            s = ((q)list0.get(0)).b;
        }
        else {
            ArrayList arrayList0 = new ArrayList(k.E(list0));
            for(Object object0: list0) {
                arrayList0.add(((q)object0).b);
            }
            if(!arrayList0.contains(s)) {
                s = ((q)list0.get(0)).b;
            }
        }
        this.j = s;
        o2.f f1 = ((f2.l)this.n).b.b();
        String s1 = (String)this.j;
        this.j = s1;
        new f(((f)((f)this.k).m), 0).x(((List)this.l), s1, ((List)f1.D), null);
        ((RelativeLayout)((f)this.k).k).setOnClickListener(new a(this, 0));
        RecyclerView recyclerView0 = (RecyclerView)((f)this.k).n;
        recyclerView0.getContext();
        recyclerView0.setLayoutManager(new LinearLayoutManager());
        recyclerView0.setAdapter(new G(((List)this.l), ((List)((f2.l)this.n).b.b().D)));
        d d0 = new d(this, 10);
        recyclerView0.f(new D(recyclerView0.getContext(), recyclerView0, d0));
    }

    public f(f f0, byte b) {
        this.i = 9;
        super();
        this.j = f0;
        this.k = (ImageView)f0.l;
        this.l = (ImageView)f0.k;
        this.m = (TextView)f0.n;
        this.n = (ImageView)f0.m;
    }

    public f(x x0) {
        this.i = 1;
        super();
        this.j = new c(30);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = x0;
        this.n = new T1.c(this, 9);
    }

    public f(zzekp zzekp0, zzcga zzcga0, zzfbx zzfbx0, zzfbl zzfbl0, zzeku zzeku0) {
        this.i = 2;
        super();
        this.n = zzekp0;
        this.j = zzcga0;
        this.k = zzfbx0;
        this.l = zzfbl0;
        this.m = zzeku0;
    }

    public f(j3.a a0, e e0, w2.c c0) {
        this.i = 5;
        j.f(e0, "typeParameterResolver");
        super();
        this.j = a0;
        this.k = e0;
        this.l = c0;
        this.m = c0;
        this.n = new B1.a(this, e0);
    }

    public f(Object object0, Object object1, Object object2, Object object3, Object object4, int v) {
        this.i = v;
        this.j = object0;
        this.k = object1;
        this.l = object2;
        this.m = object3;
        this.n = object4;
        super();
    }

    public f(String s, String s1, String s2, List list0) {
        this.i = 0;
        super();
        this.j = s;
        this.k = s1;
        this.l = s2;
        list0.getClass();
        this.n = list0;
        this.m = A.f.k(s, "-", s1, "-", s2);
    }

    public f(L0 l00, L0 l01, v3.f f0, ArrayList arrayList0) {
        this.i = 6;
        super();
        this.k = l00;
        this.l = l01;
        this.m = f0;
        this.n = arrayList0;
        this.j = l00;
    }

    public f(i i0, String s, n0.b b0, n0.d d0, o o0) {
        this.i = 7;
        super();
        this.k = i0;
        this.j = s;
        this.l = b0;
        this.m = d0;
        this.n = o0;
    }

    public static F a(F f0, y1.c c0, p p0) {
        f f1 = new f(12);
        f1.k = f0.a;
        f1.j = f0.b;
        z1.G g0 = f0.c;
        f1.l = g0;
        f1.m = f0.d;
        f1.n = f0.e;
        String s = ((y1.a)c0.b).b();
        if(s != null) {
            f1.n = new O(s);
        }
        else if(Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        ArrayList arrayList0 = f.q(((d)p0.j).g());
        ArrayList arrayList1 = f.q(((d)p0.k).g());
        if(!arrayList0.isEmpty() || !arrayList1.isEmpty()) {
            H h0 = g0.a;
            r0 r00 = new r0(arrayList0);
            r0 r01 = new r0(arrayList1);
            String s1 = h0 == null ? " execution" : "";
            if(!s1.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s1);
            }
            f1.l = new z1.G(h0, r00, r01, g0.d, g0.e);
            return f1.c();
        }
        return f1.c();
    }

    public static f b(View view0) {
        int v = 0x7F070061;  // id:civIcon
        View view1 = a0.r(view0, 0x7F070061);  // id:civIcon
        if(((ImageView)view1) != null) {
            v = 0x7F070062;  // id:civIconBG
            View view2 = a0.r(view0, 0x7F070062);  // id:civIconBG
            if(((ImageView)view2) != null) {
                v = 0x7F07009D;  // id:leaderIcon
                View view3 = a0.r(view0, 0x7F07009D);  // id:leaderIcon
                if(((ImageView)view3) != null) {
                    v = 0x7F07010F;  // id:text
                    View view4 = a0.r(view0, 0x7F07010F);  // id:text
                    if(((TextView)view4) != null) {
                        return new f(((LinearLayout)view0), ((ImageView)view1), ((ImageView)view2), ((ImageView)view3), ((TextView)view4), 3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    public F c() {
        String s = ((Long)this.k) == null ? " timestamp" : "";
        if(((String)this.j) == null) {
            s = s + " type";
        }
        if(((z1.G)this.l) == null) {
            s = q.e.b(s, " app");
        }
        if(((N)this.m) == null) {
            s = q.e.b(s, " device");
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new F(((long)(((Long)this.k))), ((String)this.j), ((z1.G)this.l), ((N)this.m), ((O)this.n));
    }

    public M d() {
        String s = ((Long)this.l) == null ? " pc" : "";
        if(((String)this.j) == null) {
            s = s + " symbol";
        }
        if(((Long)this.m) == null) {
            s = q.e.b(s, " offset");
        }
        if(((Integer)this.n) == null) {
            s = q.e.b(s, " importance");
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new M(((long)(((Long)this.l))), ((String)this.j), ((String)this.k), ((long)(((Long)this.m))), ((int)(((Integer)this.n))));
    }

    public boolean e(int v) {
        ArrayList arrayList0 = (ArrayList)this.l;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            N.a a0 = (N.a)arrayList0.get(v2);
            int v3 = a0.a;
            if(v3 == 8) {
                if(this.m(a0.c, v2 + 1) == v) {
                    return true;
                }
            }
            else if(v3 == 1) {
                int v4 = a0.b;
                int v5 = a0.c + v4;
                while(v4 < v5) {
                    if(this.m(v4, v2 + 1) == v) {
                        return true;
                    }
                    ++v4;
                }
            }
        }
        return false;
    }

    public void f() {
        ArrayList arrayList0 = (ArrayList)this.l;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            N.a a0 = (N.a)arrayList0.get(v1);
            ((x)this.m).a(a0);
        }
        this.u(arrayList0);
        ArrayList arrayList1 = (ArrayList)this.k;
        int v2 = arrayList1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            N.a a1 = (N.a)arrayList1.get(v3);
            int v4 = a1.a;
            x x0 = (x)this.m;
            switch(v4) {
                case 1: {
                    x0.a(a1);
                    x0.d(a1.b, a1.c);
                    break;
                }
                case 2: {
                    x0.a(a1);
                    int v5 = a1.c;
                    x0.a.L(a1.b, v5, true);
                    x0.a.m0 = true;
                    x0.a.j0.b += v5;
                    break;
                }
                case 4: {
                    x0.a(a1);
                    x0.c(a1.b, a1.c);
                    break;
                }
                case 8: {
                    x0.a(a1);
                    x0.e(a1.b, a1.c);
                }
            }
        }
        this.u(arrayList1);
    }

    public static f g(Context context0, x1.q q0, C1.d d0, L0 l00, y1.c c0, p p0, B.c c1, E1.d d1, w3.k k0) {
        x1.m m0 = new x1.m(context0, q0, l00, c1);
        C1.c c2 = new C1.c(d0, d1);
        o.b(context0);
        return new f(m0, c2, new D1.a(new D1.c(o.a().c(new o0.a("https://crashlyticsreports-pa.googleapis.com/v1/firelog/legacy/batchlog", "AIzaSyBrpSYT4FFL09reHJi6H9FYdeiSnUTOv2M")).t("FIREBASE_CRASHLYTICS_REPORT", new n0.b("json"), D1.a.e), ((E1.c)((AtomicReference)d1.p).get()), k0)), c0, p0, 11);
    }

    @Override  // v2.a
    public Object get() {
        return new v0.b(((Executor)((v2.a)this.j).get()), ((r0.f)((v2.a)this.k).get()), ((w0.d)((p)this.l).get()), ((x0.d)((v2.a)this.m).get()), ((y0.b)((v2.a)this.n).get()));
    }

    public void h(N.a a0) {
        int v3;
        int v = a0.a;
        if(v == 1 || v == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v1 = this.y(a0.b, v);
        int v2 = a0.b;
        switch(a0.a) {
            case 2: {
                v3 = 0;
                break;
            }
            case 4: {
                v3 = 1;
                break;
            }
            default: {
                throw new IllegalArgumentException("op should be remove or update." + a0);
            }
        }
        int v5 = 1;
        for(int v4 = 1; v4 < a0.c; ++v4) {
            int v6 = this.y(v3 * v4 + a0.b, a0.a);
            int v7 = a0.a;
            switch(v7) {
                case 2: {
                    if(v6 == v1) {
                        ++v5;
                        continue;
                    }
                    break;
                }
                case 4: {
                    if(v6 == v1 + 1) {
                        ++v5;
                        continue;
                    }
                }
            }
            N.a a1 = this.s(v7, v1, v5);
            this.j(a1, v2);
            ((c)this.j).b(a1);
            if(a0.a == 4) {
                v2 += v5;
            }
            v1 = v6;
            v5 = 1;
        }
        ((c)this.j).b(a0);
        if(v5 > 0) {
            N.a a2 = this.s(a0.a, v1, v5);
            this.j(a2, v2);
            ((c)this.j).b(a2);
        }
    }

    @Override  // o3.l
    public void i() {
        ((L0)this.k).i();
        A3.a a0 = new A3.a(((Y2.b)x2.i.i0(((ArrayList)this.n))));
        ((HashMap)((L0)this.l).k).put(((v3.f)this.m), a0);
    }

    public void j(N.a a0, int v) {
        x x0 = (x)this.m;
        x0.a(a0);
        switch(a0.a) {
            case 2: {
                int v1 = a0.c;
                x0.a.L(v, v1, true);
                x0.a.m0 = true;
                x0.a.j0.b += v1;
                return;
            }
            case 4: {
                x0.c(v, a0.c);
                return;
            }
            default: {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
        }
    }

    @Override  // o3.l
    public void k(v3.f f0, A3.f f1) {
        ((L0)this.j).k(f0, f1);
    }

    @Override  // o3.l
    public void l(v3.f f0, Object object0) {
        ((L0)this.j).l(f0, object0);
    }

    public int m(int v, int v1) {
        ArrayList arrayList0 = (ArrayList)this.l;
        int v2 = arrayList0.size();
        while(v1 < v2) {
            N.a a0 = (N.a)arrayList0.get(v1);
            int v3 = a0.a;
            if(v3 == 8) {
                int v4 = a0.b;
                if(v4 == v) {
                    v = a0.c;
                }
                else {
                    if(v4 < v) {
                        --v;
                    }
                    if(a0.c <= v) {
                        ++v;
                    }
                }
            }
            else {
                int v5 = a0.b;
                if(v5 <= v) {
                    switch(v3) {
                        case 1: {
                            v += a0.c;
                            break;
                        }
                        case 2: {
                            int v6 = a0.c;
                            if(v < v5 + v6) {
                                return -1;
                            }
                            v -= v6;
                        }
                    }
                }
            }
            ++v1;
        }
        return v;
    }

    @Override  // o3.l
    public void n(v3.f f0, v3.b b0, v3.f f1) {
        ((L0)this.j).n(f0, b0, f1);
    }

    @Override  // o3.l
    public l o(v3.b b0, v3.f f0) {
        return ((L0)this.j).o(b0, f0);
    }

    @Override  // o3.l
    public o3.m p(v3.f f0) {
        return ((L0)this.j).p(f0);
    }

    public static ArrayList q(Map map0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.ensureCapacity(map0.size());
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            if(s == null) {
                throw new NullPointerException("Null key");
            }
            String s1 = (String)((Map.Entry)object0).getValue();
            if(s1 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList0.add(new z1.x(s, s1));
        }
        Collections.sort(arrayList0, new C1.a(23));
        return arrayList0;
    }

    public boolean r() {
        return ((ArrayList)this.k).size() > 0;
    }

    public N.a s(int v, int v1, int v2) {
        N.a a0 = (N.a)((c)this.j).a();
        if(a0 == null) {
            a0 = new N.a();  // 初始化器: Ljava/lang/Object;-><init>()V
            a0.a = v;
            a0.b = v1;
            a0.c = v2;
            return a0;
        }
        a0.a = v;
        a0.b = v1;
        a0.c = v2;
        return a0;
    }

    public void t(N.a a0) {
        ((ArrayList)this.l).add(a0);
        int v = a0.a;
        x x0 = (x)this.m;
        switch(v) {
            case 1: {
                x0.d(a0.b, a0.c);
                return;
            }
            case 2: {
                x0.a.L(a0.b, a0.c, false);
                x0.a.m0 = true;
                return;
            }
            case 4: {
                x0.c(a0.b, a0.c);
                return;
            }
            case 8: {
                x0.e(a0.b, a0.c);
                return;
            }
            default: {
                throw new IllegalArgumentException("Unknown update op type for " + a0);
            }
        }
    }

    @Override
    public String toString() {
        if(this.i != 0) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("FontRequest {mProviderAuthority: " + ((String)this.j) + ", mProviderPackage: " + ((String)this.k) + ", mQuery: " + ((String)this.l) + ", mCertificates:");
        for(int v = 0; true; ++v) {
            List list0 = (List)this.n;
            if(v >= list0.size()) {
                break;
            }
            stringBuilder0.append(" [");
            List list1 = (List)list0.get(v);
            for(int v1 = 0; v1 < list1.size(); ++v1) {
                stringBuilder0.append(" \"");
                stringBuilder0.append(Base64.encodeToString(((byte[])list1.get(v1)), 0));
                stringBuilder0.append("\"");
            }
            stringBuilder0.append(" ]");
        }
        stringBuilder0.append("}mCertificatesArray: 0");
        return stringBuilder0.toString();
    }

    public void u(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            N.a a0 = (N.a)arrayList0.get(v1);
            a0.getClass();
            ((c)this.j).b(a0);
        }
        arrayList0.clear();
    }

    public void v(n0.a a0, n0.e e0) {
        i i0 = (i)this.k;
        String s = (String)this.j;
        n0.d d0 = (n0.d)this.m;
        if(d0 == null) {
            throw new NullPointerException("Null transformer");
        }
        n0.b b0 = (n0.b)this.l;
        o o0 = (o)this.n;
        B1.a a1 = i.a();
        a1.E(i0.a);
        a1.l = a0.b;
        a1.k = i0.b;
        i i1 = a1.e();
        C1.d d1 = new C1.d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d1.n = new HashMap();
        d1.l = o0.a.d();
        d1.m = o0.b.d();
        d1.i = s;
        d1.k = new q0.l(b0, ((byte[])d0.apply(a0.a)));
        d1.j = null;
        q0.h h0 = d1.o();
        ((v0.b)o0.c).getClass();
        g g0 = new g(((v0.b)o0.c), i1, e0, h0, 1);
        ((v0.b)o0.c).b.execute(g0);
    }

    public Task w(ExecutorService executorService0, String s) {
        TaskCompletionSource taskCompletionSource0;
        ArrayList arrayList0 = ((C1.c)this.k).b();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            File file0 = (File)object0;
            try {
                String s1 = C1.c.e(file0);
                C1.c.f.getClass();
                arrayList1.add(new x1.a(A1.b.g(s1), file0.getName(), file0));
            }
            catch(IOException iOException0) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file0 + "; deleting", iOException0);
                file0.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object1: arrayList1) {
            x1.a a0 = (x1.a)object1;
            if(s == null || s.equals(a0.b)) {
                D1.c c0 = ((D1.a)this.l).a;
                synchronized(c0.e) {
                    taskCompletionSource0 = new TaskCompletionSource();
                    if(s == null) {
                        c0.b(a0, taskCompletionSource0);
                    }
                    else {
                        ((AtomicInteger)c0.h.j).getAndIncrement();
                        if(c0.e.size() < c0.d) {
                            u1.c.a.b("Enqueueing report: " + a0.b);
                            u1.c.a.b("Queue size: " + c0.e.size());
                            B.o o0 = new B.o(c0, a0, taskCompletionSource0, 1);
                            c0.f.execute(o0);
                            u1.c.a.b("Closing task for report: " + a0.b);
                        }
                        else {
                            c0.a();
                            String s2 = "Dropping report due to queue being full: " + a0.b;
                            if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", s2, null);
                            }
                            ((AtomicInteger)c0.h.k).getAndIncrement();
                        }
                        taskCompletionSource0.trySetResult(a0);
                    }
                }
                arrayList2.add(taskCompletionSource0.getTask().continueWith(executorService0, new J(this, 10)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    public void x(List list0, String s, List list1, String s1) {
        Object object1;
        Object object0 = null;
        j.f(s, "leaderType");
        j.f(list0, "leaders");
        j.f(list1, "civilizationLeaders");
        ((LinearLayout)((f)this.j).j).setContentDescription(s);
        Iterator iterator0 = list0.iterator();
        while(true) {
            object1 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object2 = iterator0.next();
            if(j.a(((q)object2).b, s)) {
                object0 = object2;
                break;
            }
        }
        if(((q)object0) == null) {
            return;
        }
        if(s1 == null) {
            s1 = ((q)object0).i;
        }
        ((TextView)this.m).setText(s1);
        o1.a.S(((ImageView)this.n), "ICON_" + s);
        s s2 = (s)((Map)m.e).get(s);
        if(s2 == null) {
            throw new IllegalStateException("");
        }
        for(Object object3: list1) {
            if(j.a(((CivilizationLeaders)object3).getLeaderType(), s)) {
                object1 = object3;
                break;
            }
            if(false) {
                break;
            }
        }
        if(((CivilizationLeaders)object1) != null) {
            String s3 = ((CivilizationLeaders)object1).getCivilizationType();
            if(s3 != null) {
                ImageView imageView0 = (ImageView)this.l;
                o1.a.R(imageView0, "ICON_" + s3, 50);
                imageView0.setColorFilter(s2.b, PorterDuff.Mode.MULTIPLY);
            }
        }
        ((ImageView)this.k).setColorFilter(s2.a, PorterDuff.Mode.MULTIPLY);
    }

    public int y(int v, int v1) {
        int v7;
        int v6;
        ArrayList arrayList0 = (ArrayList)this.l;
        for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
            N.a a0 = (N.a)arrayList0.get(v2);
            int v3 = a0.a;
            if(v3 == 8) {
                int v4 = a0.b;
                int v5 = a0.c;
                if(v4 < v5) {
                    v6 = v4;
                    v7 = v5;
                }
                else {
                    v7 = v4;
                    v6 = v5;
                }
                if(v < v6 || v > v7) {
                    if(v < v4) {
                        if(v1 == 1) {
                            a0.b = v4 + 1;
                            a0.c = v5 + 1;
                        }
                        else if(v1 == 2) {
                            a0.b = v4 - 1;
                            a0.c = v5 - 1;
                        }
                    }
                }
                else if(v6 == v4) {
                    if(v1 == 1) {
                        a0.c = v5 + 1;
                    }
                    else if(v1 == 2) {
                        a0.c = v5 - 1;
                    }
                    ++v;
                }
                else {
                    if(v1 == 1) {
                        a0.b = v4 + 1;
                    }
                    else if(v1 == 2) {
                        a0.b = v4 - 1;
                    }
                    --v;
                }
            }
            else {
                int v8 = a0.b;
                if(v8 > v) {
                    if(v1 == 1) {
                        a0.b = v8 + 1;
                    }
                    else if(v1 == 2) {
                        a0.b = v8 - 1;
                    }
                }
                else if(v3 == 1) {
                    v -= a0.c;
                }
                else if(v3 == 2) {
                    v += a0.c;
                }
            }
        }
        for(int v9 = arrayList0.size() - 1; v9 >= 0; --v9) {
            N.a a1 = (N.a)arrayList0.get(v9);
            if(a1.a != 8) {
                if(a1.c <= 0) {
                    arrayList0.remove(v9);
                    ((c)this.j).b(a1);
                }
            }
            else if(a1.c == a1.b || a1.c < 0) {
                arrayList0.remove(v9);
                ((c)this.j).b(a1);
            }
        }
        return v;
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public void zza(View view0) {
        Object object0 = ((zzekp)this.n).d.zza(((zzfbx)this.k), ((zzfbl)this.l), view0, ((zzeku)this.m));
        ((zzcga)this.j).zzd(object0);
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public void zzb() {
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public void zzc() {
    }
}

