package f0;

import A3.h;
import A3.r;
import A3.y;
import B.c;
import C1.d;
import I3.e;
import I3.i;
import J2.j;
import X2.A;
import X2.C;
import X2.E;
import X2.O;
import X2.S;
import X2.h0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.Da;
import com.google.android.gms.internal.ads.E3;
import com.google.android.gms.internal.ads.Ea;
import com.google.android.gms.internal.ads.b2;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.zzain;
import com.google.android.gms.internal.ads.zzais;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzajn;
import com.google.android.gms.internal.ads.zzamk;
import com.google.android.gms.internal.ads.zzaml;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzclp;
import com.google.android.gms.internal.ads.zzcvv;
import com.google.android.gms.internal.ads.zzcxd;
import com.google.android.gms.internal.ads.zzcxe;
import com.google.android.gms.internal.ads.zzcxf;
import com.google.android.gms.internal.ads.zzcxg;
import com.google.android.gms.internal.ads.zzcxh;
import com.google.android.gms.internal.ads.zzcxi;
import com.google.android.gms.internal.ads.zzcym;
import com.google.android.gms.internal.ads.zzcyn;
import com.google.android.gms.internal.ads.zzcyo;
import com.google.android.gms.internal.ads.zzcyp;
import com.google.android.gms.internal.ads.zzcyq;
import com.google.android.gms.internal.ads.zzczs;
import com.google.android.gms.internal.ads.zzdbc;
import com.google.android.gms.internal.ads.zzdbn;
import com.google.android.gms.internal.ads.zzdct;
import com.google.android.gms.internal.ads.zzddg;
import com.google.android.gms.internal.ads.zzddk;
import com.google.android.gms.internal.ads.zzdgb;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzfdo;
import com.google.android.gms.internal.ads.zzfku;
import com.google.android.gms.internal.ads.zzfkx;
import com.google.android.gms.internal.ads.zzfmr;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzfuy;
import com.google.android.gms.internal.ads.zzgji;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.android.gms.internal.ads.zzgrc;
import com.google.android.gms.internal.ads.zzgre;
import com.google.android.gms.internal.ads.zzgrf;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzpc;
import com.google.android.gms.internal.ads.zzpd;
import com.google.android.gms.internal.ads.zzrj;
import com.google.android.gms.internal.ads.zzrr;
import com.google.android.gms.internal.ads.zzrw;
import com.google.android.gms.internal.ads.zzsa;
import com.google.android.gms.internal.ads.zzsj;
import com.google.android.gms.internal.ads.zzsk;
import com.google.android.gms.internal.ads.zzty;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g1.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import k.s;
import l.L0;
import o3.l;
import o3.m;
import o3.o;
import org.json.JSONObject;
import q0.p;
import q3.t;
import s0.b;
import v1.a;
import v3.f;
import x2.k;
import x2.w;
import z1.P;

public final class g implements e, zzcge, zzcxe, zzfkx, zzfuy, zzpd, zzsk, l, m, b, a, v1.b {
    public final int i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public static g n;

    public g(int v) {
        this.i = v;
        super();
    }

    public g(d d0, f f0, L0 l00) {
        this.i = 21;
        super();
        this.k = d0;
        this.l = f0;
        this.m = l00;
        this.j = new ArrayList();
    }

    public g(K3.l l0) {
        this.i = 3;
        super();
        this.m = l0;
        List list0 = l0.m.B;
        j.e(list0, "getEnumEntryList(...)");
        int v = w.q(k.E(list0));
        if(v < 16) {
            v = 16;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
        for(Object object0: list0) {
            linkedHashMap0.put(android.support.v4.media.session.a.w(((s3.f)l0.t.j), ((t)object0).l), object0);
        }
        this.j = linkedHashMap0;
        K3.l l1 = (K3.l)this.m;
        this.k = ((i)l1.t.i).a.c(new K3.j(0, this, l1));
        L3.m m0 = ((i)((K3.l)this.m).t.i).a;
        A3.m m1 = new A3.m(this, 5);
        m0.getClass();
        this.l = new L3.i(m0, m1);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    public g(L3.m m0, A a0) {
        this.i = 5;
        j.f(a0, "module");
        super();
        this.j = m0;
        this.k = a0;
        this.l = m0.b(new E(this, 1));
        this.m = m0.b(new E(this, 0));
    }

    public g(Context context0, ActionMode.Callback actionMode$Callback0) {
        this.i = 18;
        super();
        this.k = context0;
        this.j = actionMode$Callback0;
        this.l = new ArrayList();
        this.m = new p.k();
    }

    public g(WorkDatabase_Impl workDatabase_Impl0) {
        this.i = 17;
        super();
        this.j = workDatabase_Impl0;
        this.k = new h0.b(workDatabase_Impl0, 4);
        this.l = new h0.e(workDatabase_Impl0, 1);
        this.m = new h0.e(workDatabase_Impl0, 2);
    }

    public g(Ea ea0, Da da0) {
        this.i = 12;
        super();
        this.m = ea0;
        this.k = ea0.f;
        this.l = ea0.g;
        this.j = da0;
    }

    public g(v3 v30, E3 e30, zzcym zzcym0, zzcxf zzcxf0) {
        this.i = 9;
        super();
        zzcyq zzcyq0 = new zzcyq(zzcym0);
        zzcyn zzcyn0 = new zzcyn(zzcym0);
        zzgre zzgre0 = zzgrf.zza(0, 2);
        zzgre0.zza(e30.v0);
        zzgre0.zza(e30.w0);
        zzgrh zzgrh0 = zzgqt.zzc(new zzdct(zzgre0.zzc()));
        this.j = zzgrh0;
        zzgre zzgre1 = zzgrf.zza(4, 3);
        zzgre1.zzb(e30.L0);
        zzgre1.zzb(e30.M0);
        zzgre1.zzb(e30.N0);
        zzgre1.zza(e30.V0);
        zzgre1.zza(e30.W0);
        zzgre1.zza(e30.X0);
        zzgre1.zzb(e30.O0);
        zzgrh zzgrh1 = zzgqt.zzc(new zzddg(zzgre1.zzc()));
        this.k = zzgrh1;
        zzcyo zzcyo0 = new zzcyo(zzcym0);
        zzcyp zzcyp0 = new zzcyp(zzcym0);
        zzdbn zzdbn0 = new zzdbn(zzcyn0, zzcyo0, e30.b0, zzcyp0);
        zzgrh zzgrh2 = zzgqt.zzc(zzdgb.zza());
        this.l = zzgrh2;
        zzgre zzgre2 = zzgrf.zza(1, 1);
        zzgre2.zza(e30.Z0);
        zzgre2.zzb(e30.a1);
        zzddk zzddk0 = new zzddk(zzgre2.zzc());
        this.m = zzgqt.zzc(new zzcxi(new zzczs(zzcyq0, zzcyn0, zzgrh0, zzgrh1, e30.Y0, zzdbn0, zzgrh2, zzddk0), new zzcxh(zzcxf0), new zzcxg(zzcxf0), v30.m));
    }

    public g(zzain zzain0, BlockingQueue blockingQueue0, zzais zzais0) {
        this.i = 6;
        super();
        this.j = new HashMap();
        this.m = zzais0;
        this.k = zzain0;
        this.l = blockingQueue0;
    }

    public g(zzfdo zzfdo0, zzdbc zzdbc0, Executor executor0) {
        this.i = 10;
        super();
        this.j = zzfdo0;
        this.k = zzdbc0;
        this.l = executor0;
    }

    public g(zzrj zzrj0, Integer integer0) {
        this.i = 13;
        super();
        this.m = zzrj0;
        this.k = zzrj0.c.zza(0, null, 0L);
        this.l = zzrj0.d.zza(0, null);
        this.j = integer0;
    }

    public g(zzty zzty0, boolean[] arr_z) {
        this.i = 14;
        super();
        this.j = zzty0;
        this.k = arr_z;
        this.l = new boolean[zzty0.zzc];
        this.m = new boolean[zzty0.zzc];
    }

    public g(n n0, o o0) {
        this.m = n0;
        this.i = 19;
        super();
        this.l = n0;
        this.j = o0;
        this.k = new ArrayList();
    }

    public g(Object object0, Object object1, Object object2, Object object3, int v) {
        this.i = v;
        this.j = object0;
        this.k = object1;
        this.l = object2;
        this.m = object3;
        super();
    }

    public g(Object object0, Object object1, Object object2, Object object3, int v, boolean z) {
        this.i = v;
        this.m = object0;
        this.j = object1;
        this.k = object2;
        this.l = object3;
        super();
    }

    public g(Throwable throwable0, c c0) {
        this.i = 1;
        super();
        this.j = throwable0.getLocalizedMessage();
        this.k = throwable0.getClass().getName();
        this.l = c0.h(throwable0.getStackTrace());
        Throwable throwable1 = throwable0.getCause();
        this.m = throwable1 == null ? null : new g(throwable1, c0);
    }

    public g(ExecutorService executorService0) {
        this.i = 25;
        super();
        this.k = Tasks.forResult(null);
        this.l = new Object();
        this.m = new ThreadLocal();
        this.j = executorService0;
        executorService0.execute(new l1.d(this, 4));
    }

    public g(k.d d0, TimeUnit timeUnit0) {
        this.i = 23;
        super();
        this.l = new Object();
        this.j = d0;
        this.k = timeUnit0;
    }

    public g(L0 l00, g g0, ArrayList arrayList0) {
        this.i = 20;
        super();
        this.k = l00;
        this.l = g0;
        this.m = arrayList0;
        this.j = l00;
    }

    public g(q3.E e0, n n0, r3.a a0, h h0) {
        this.i = 2;
        super();
        this.j = n0;
        this.k = a0;
        this.l = h0;
        List list0 = e0.o;
        j.e(list0, "getClass_List(...)");
        int v = w.q(k.E(list0));
        if(v < 16) {
            v = 16;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
        for(Object object0: list0) {
            linkedHashMap0.put(android.support.v4.media.session.a.r(((n)this.j), ((q3.j)object0).m), object0);
        }
        this.m = linkedHashMap0;
    }

    public boolean A() {
        synchronized(this) {
            try {
                return ((Boolean)this.j.getClass().getDeclaredMethod("init", null).invoke(this.j, null)).booleanValue();
            }
            catch(Exception exception0) {
                throw new zzfmr(2001, exception0);
            }
        }
    }

    @Override  // o3.m
    public void A0(A3.f f0) {
        ((ArrayList)this.j).add(new A3.t(new r(f0)));  // 初始化器: LA3/g;-><init>(Ljava/lang/Object;)V
    }

    public static String B(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        zzamk zzamk0 = zzaml.zza();
        zzamk0.zzc(5);
        zzamk0.zza(zzgji.zzv(arr_b));
        return Base64.encodeToString(((zzaml)zzamk0.zzal()).zzaw(), 11);
    }

    public byte[] C(Map map0) {
        synchronized(this) {
            long v1 = System.currentTimeMillis();
            try {
                return (byte[])this.j.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.j, null, map0);
            }
            catch(Exception exception0) {
                ((zzfku)this.m).zzc(2007, System.currentTimeMillis() - v1, exception0);
                return null;
            }
        }
    }

    @Override  // o3.m
    public void L(v3.b b0, f f0) {
        ((ArrayList)this.j).add(new A3.j(b0, f0));
    }

    public P a() {
        String s = ((Integer)this.j) == null ? " platform" : "";
        if(((String)this.k) == null) {
            s = s + " version";
        }
        if(((String)this.l) == null) {
            s = q.e.b(s, " buildVersion");
        }
        if(((Boolean)this.m) == null) {
            s = q.e.b(s, " jailbroken");
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new P(((String)this.k), ((int)(((Integer)this.j))), ((String)this.l), ((Boolean)this.m).booleanValue());
    }

    @Override  // v1.b
    public void b(String s, Bundle bundle0) {
        CountDownLatch countDownLatch0 = (CountDownLatch)this.m;
        if(countDownLatch0 == null) {
            return;
        }
        if("_ae".equals(s)) {
            countDownLatch0.countDown();
        }
    }

    @Override  // I3.e
    public I3.d c(v3.b b0) {
        j.f(b0, "classId");
        q3.j j0 = (q3.j)((LinkedHashMap)this.m).get(b0);
        if(j0 == null) {
            return null;
        }
        ((h)this.l).b(b0);
        return new I3.d(((n)this.j), j0, ((r3.a)this.k), O.b);
    }

    public j.d d(h0 h00) {
        ArrayList arrayList0 = (ArrayList)this.l;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            j.d d0 = (j.d)arrayList0.get(v1);
            if(d0 != null && d0.b == h00) {
                return d0;
            }
        }
        j.d d1 = new j.d(((Context)this.k), h00);
        arrayList0.add(d1);
        return d1;
    }

    @Override  // o3.m
    public l d0(v3.b b0) {
        ArrayList arrayList0 = new ArrayList();
        return new g(((d)this.k).y(b0, O.b, arrayList0), this, arrayList0);
    }

    @Override  // v1.a
    public void e(Bundle bundle0) {
        synchronized(this.l) {
            u1.c c0 = u1.c.a;
            c0.c("Logging event _ae to Firebase Analytics with params " + bundle0);
            this.m = new CountDownLatch(1);
            ((k.d)this.j).e(bundle0);
            c0.c("Awaiting app exception callback from Analytics...");
            try {
                if(((CountDownLatch)this.m).await(500L, ((TimeUnit)this.k))) {
                    c0.c("App exception callback received from Analytics listener.");
                }
                else {
                    c0.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            }
            catch(InterruptedException unused_ex) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.m = null;
        }
    }

    public X2.e f(v3.b b0, List list0) {
        j.f(b0, "classId");
        C c0 = new C(b0, list0);
        return (X2.e)((L3.e)this.m).b(c0);
    }

    public static g g(Context context0, k0.a a0) {
        synchronized(g.class) {
            if(g.n == null) {
                g g0 = new g(0);
                Context context1 = context0.getApplicationContext();
                g0.j = new f0.a(context1, a0);  // 初始化器: Lf0/c;-><init>(Landroid/content/Context;Lk0/a;)V
                g0.k = new f0.b(context1, a0);  // 初始化器: Lf0/c;-><init>(Landroid/content/Context;Lk0/a;)V
                g0.l = new f0.e(context1, a0);
                g0.m = new f0.f(context1, a0);  // 初始化器: Lf0/c;-><init>(Landroid/content/Context;Lk0/a;)V
                g.n = g0;
            }
            return g.n;
        }
    }

    @Override  // v2.a
    public Object get() {
        return new w0.k(((Executor)((v2.a)this.j).get()), ((x0.d)((v2.a)this.k).get()), ((w0.d)((p)this.l).get()), ((y0.b)((v2.a)this.m).get()));
    }

    public boolean h(S s0) {
        j.f(s0, "descriptor");
        if(!j.a(((S)this.k), s0)) {
            g g0 = (g)this.j;
            return g0 == null ? false : g0.h(s0);
        }
        return true;
    }

    @Override  // o3.l, o3.m
    public void i() {
        switch(this.i) {
            case 19: {
                ArrayList arrayList2 = (ArrayList)this.k;
                if(!arrayList2.isEmpty()) {
                    ((HashMap)((n)this.l).k).put(((o)this.j), arrayList2);
                }
                return;
            }
            case 20: {
                ((L0)this.k).i();
                ((ArrayList)((g)this.l).j).add(new A3.a(((Y2.b)x2.i.i0(((ArrayList)this.m)))));
                return;
            }
            default: {
                ArrayList arrayList0 = (ArrayList)this.j;
                L0 l00 = (L0)this.m;
                l00.getClass();
                j.f(arrayList0, "elements");
                f f0 = (f)this.l;
                if(f0 != null) {
                    a3.S s0 = android.support.v4.media.session.a.p(f0, ((X2.e)l00.m));
                    if(s0 != null) {
                        HashMap hashMap0 = (HashMap)l00.k;
                        List list0 = V3.k.d(arrayList0);
                        M3.w w0 = s0.getType();
                        j.e(w0, "getType(...)");
                        hashMap0.put(f0, new y(list0, w0));
                        return;
                    }
                    if(((d)l00.l).x(((v3.b)l00.n)) && j.a(f0.b(), "value")) {
                        ArrayList arrayList1 = new ArrayList();
                        for(Object object0: arrayList0) {
                            if(object0 instanceof A3.a) {
                                arrayList1.add(object0);
                            }
                        }
                        Collection collection0 = (List)l00.o;
                        for(Object object1: arrayList1) {
                            collection0.add(((Y2.b)((A3.a)object1).a));
                        }
                    }
                }
            }
        }
    }

    public boolean j(h0 h00, MenuItem menuItem0) {
        j.d d0 = this.d(h00);
        s s0 = new s(((Context)this.k), ((z.a)menuItem0));
        return ((ActionMode.Callback)this.j).onActionItemClicked(d0, s0);
    }

    @Override  // o3.l
    public void k(f f0, A3.f f1) {
        ((L0)this.j).k(f0, f1);
    }

    @Override  // o3.l
    public void l(f f0, Object object0) {
        ((L0)this.j).l(f0, object0);
    }

    public boolean m(h0 h00, k.l l0) {
        j.d d0 = this.d(h00);
        p.k k0 = (p.k)this.m;
        Menu menu0 = (Menu)k0.getOrDefault(l0, null);
        if(menu0 == null) {
            menu0 = new k.A(((Context)this.k), l0);
            k0.put(l0, menu0);
        }
        return ((ActionMode.Callback)this.j).onCreateActionMode(d0, menu0);
    }

    @Override  // o3.l
    public void n(f f0, v3.b b0, f f1) {
        ((L0)this.j).n(f0, b0, f1);
    }

    @Override  // o3.l
    public l o(v3.b b0, f f0) {
        return ((L0)this.j).o(b0, f0);
    }

    @Override  // o3.l
    public m p(f f0) {
        return ((L0)this.j).p(f0);
    }

    public Task q(Callable callable0) {
        synchronized(this.l) {
            Task task0 = ((Task)this.k).continueWith(((ExecutorService)this.j), new o3.k(callable0));
            t1.c c0 = new t1.c(19);
            this.k = task0.continueWith(((ExecutorService)this.j), c0);
            return task0;
        }
    }

    public Task r(Callable callable0) {
        synchronized(this.l) {
            Task task0 = ((Task)this.k).continueWithTask(((ExecutorService)this.j), new o3.k(callable0));
            t1.c c0 = new t1.c(19);
            this.k = task0.continueWith(((ExecutorService)this.j), c0);
            return task0;
        }
    }

    public L0 s(int v, v3.b b0, c3.a a0) {
        o o0 = new o(((o)this.j).a + '@' + v);
        n n0 = (n)this.m;
        List list0 = (List)((HashMap)n0.k).get(o0);
        if(list0 == null) {
            list0 = new ArrayList();
            ((HashMap)n0.k).put(o0, list0);
        }
        return ((d)n0.j).z(b0, a0, list0);
    }

    public void t(zzajb zzajb0) {
        synchronized(this) {
            String s = zzajb0.zzj();
            List list0 = (List)((HashMap)this.j).remove(s);
            if(list0 != null && !list0.isEmpty()) {
                if(zzajn.zzb) {
                    zzajn.zzd("%d waiting requests for cacheKey=%s; resend to network", new Object[]{list0.size(), s});
                }
                zzajb zzajb1 = (zzajb)list0.remove(0);
                ((HashMap)this.j).put(s, list0);
                zzajb1.g(this);
                try {
                    ((BlockingQueue)this.l).put(zzajb1);
                }
                catch(InterruptedException interruptedException0) {
                    zzajn.zzb("Couldn\'t add request to queue. %s", new Object[]{interruptedException0.toString()});
                    Thread.currentThread().interrupt();
                    ((zzain)this.k).zzb();
                }
            }
        }
    }

    public void u(zzajb zzajb0, zzajh zzajh0) {
        List list0;
        if(zzajh0.zzb != null && zzajh0.zzb.zze >= System.currentTimeMillis()) {
            String s = zzajb0.zzj();
            synchronized(this) {
                list0 = (List)((HashMap)this.j).remove(s);
            }
            if(list0 != null) {
                if(zzajn.zzb) {
                    zzajn.zzd("Releasing %d waiting requests for cacheKey=%s.", new Object[]{list0.size(), s});
                }
                for(Object object0: list0) {
                    ((zzais)this.m).zzb(((zzajb)object0), zzajh0, null);
                }
            }
            return;
        }
        this.t(zzajb0);
    }

    public boolean v(zzajb zzajb0) {
        synchronized(this) {
            String s = zzajb0.zzj();
            if(((HashMap)this.j).containsKey(s)) {
                List list0 = (List)((HashMap)this.j).get(s);
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                zzajb0.zzm("waiting-for-response");
                list0.add(zzajb0);
                ((HashMap)this.j).put(s, list0);
                if(zzajn.zzb) {
                    zzajn.zza("Request for cacheKey=%s is in flight, putting on hold.", new Object[]{s});
                }
                return true;
            }
            ((HashMap)this.j).put(s, null);
            zzajb0.g(this);
            if(zzajn.zzb) {
                zzajn.zza("new request, sending to network %s", new Object[]{s});
            }
            return false;
        }
    }

    public int w() {
        synchronized(this) {
            try {
                return (int)(((Integer)this.j.getClass().getDeclaredMethod("lcs", null).invoke(this.j, null)));
            }
            catch(Exception exception0) {
                throw new zzfmr(2006, exception0);
            }
        }
    }

    @Override  // o3.m
    public void w0(Object object0) {
        ((ArrayList)this.j).add(d.h(((d)this.k), ((f)this.l), object0));
    }

    public boolean x(int v, zzsa zzsa0) {
        zzsa zzsa1 = null;
        Da da0 = (Da)this.j;
        if(zzsa0 != null) {
            for(int v1 = 0; v1 < da0.c.size(); ++v1) {
                if(((zzsa)da0.c.get(v1)).zzd == zzsa0.zzd) {
                    zzsa1 = zzsa0.zzc(Pair.create(da0.b, zzsa0.zza));
                    break;
                }
            }
            if(zzsa1 == null) {
                return false;
            }
        }
        int v2 = v + da0.d;
        zzsj zzsj0 = (zzsj)this.k;
        Ea ea0 = (Ea)this.m;
        if(zzsj0.zza != v2 || !zzeg.zzS(zzsj0.zzb, zzsa1)) {
            this.k = ea0.f.zza(v2, zzsa1, 0L);
        }
        zzpc zzpc0 = (zzpc)this.l;
        if(zzpc0.zza != v2 || !zzeg.zzS(zzpc0.zzb, zzsa1)) {
            this.l = ea0.g.zza(v2, zzsa1);
        }
        return true;
    }

    public boolean y(int v, zzsa zzsa0) {
        zzsa zzsa1;
        zzrj zzrj0 = (zzrj)this.m;
        if(zzsa0 == null) {
            zzsa1 = null;
        }
        else {
            zzsa1 = zzrj0.d(((Integer)this.j), zzsa0);
            if(zzsa1 == null) {
                return false;
            }
        }
        zzsj zzsj0 = (zzsj)this.k;
        if(zzsj0.zza != v || !zzeg.zzS(zzsj0.zzb, zzsa1)) {
            this.k = zzrj0.c.zza(v, zzsa1, 0L);
        }
        zzpc zzpc0 = (zzpc)this.l;
        if(zzpc0.zza != v || !zzeg.zzS(zzpc0.zzb, zzsa1)) {
            this.l = zzrj0.d.zza(v, zzsa1);
        }
        return true;
    }

    public void z() {
        synchronized(this) {
            try {
                this.j.getClass().getDeclaredMethod("close", null).invoke(this.j, null);
                ((zzfku)this.m).zzd(3001, 0L);
            }
            catch(Exception exception0) {
                throw new zzfmr(2003, exception0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxe
    public zzcvv zza() {
        zzcvv zzcvv0 = (zzcxd)((zzgrh)this.m).zzb();
        zzgrc.zzb(zzcvv0);
        return zzcvv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfkx
    public String zza(Context context0, String s, String s1, View view0, Activity activity0) {
        synchronized(this) {
            Map map0 = ((zzfmt)this.l).zza();
            map0.put("f", "c");
            map0.put("ctx", context0);
            map0.put("cs", s1);
            map0.put("aid", null);
            map0.put("view", view0);
            map0.put("act", activity0);
            return g.B(this.C(map0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcge
    public void zza(Object object0) {
        zzbsn zzbsn0 = (zzbsn)object0;
        zzbte zzbte0 = (zzbte)this.m;
        zzbsg zzbsg0 = (zzbsg)this.j;
        Object object1 = this.k;
        zzcga zzcga0 = (zzcga)this.l;
        try {
            b2 b20 = new b2(zzbte0, zzbsg0, zzcga0);
            zzbol.zzo.zzc("6eb1c57b-8893-4194-b6b7-69ebeab623ba", b20);
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("id", "6eb1c57b-8893-4194-b6b7-69ebeab623ba");
            jSONObject0.put("args", zzbte0.b.zzb(object1));
            zzbsn0.zzl(zzbte0.d, jSONObject0);
        }
        catch(Exception unused_ex) {
            try {
                zzcga0.zze(exception0);
                zzcfi.zzh("Unable to invokeJavascript", exception0);
            }
            finally {
                zzbsg0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public void zza(Throwable throwable0) {
        zzcfi.zzj(("Failed to parse gmsg params for: " + ((Uri)this.l)));
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public void zzaf(int v, zzsa zzsa0, zzrw zzrw0) {
        if(this.i != 12) {
            if(this.y(v, zzsa0)) {
                ((zzsj)this.k).zzc(zzrw0);
            }
            return;
        }
        if(this.x(v, zzsa0)) {
            ((zzsj)this.k).zzc(zzrw0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public void zzag(int v, zzsa zzsa0, zzrr zzrr0, zzrw zzrw0) {
        if(this.i != 12) {
            if(this.y(v, zzsa0)) {
                ((zzsj)this.k).zze(zzrr0, zzrw0);
            }
            return;
        }
        if(this.x(v, zzsa0)) {
            ((zzsj)this.k).zze(zzrr0, zzrw0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public void zzah(int v, zzsa zzsa0, zzrr zzrr0, zzrw zzrw0) {
        if(this.i != 12) {
            if(this.y(v, zzsa0)) {
                ((zzsj)this.k).zzg(zzrr0, zzrw0);
            }
            return;
        }
        if(this.x(v, zzsa0)) {
            ((zzsj)this.k).zzg(zzrr0, zzrw0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public void zzai(int v, zzsa zzsa0, zzrr zzrr0, zzrw zzrw0, IOException iOException0, boolean z) {
        if(this.i != 12) {
            if(this.y(v, zzsa0)) {
                ((zzsj)this.k).zzi(zzrr0, zzrw0, iOException0, z);
            }
            return;
        }
        if(this.x(v, zzsa0)) {
            ((zzsj)this.k).zzi(zzrr0, zzrw0, iOException0, z);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public void zzaj(int v, zzsa zzsa0, zzrr zzrr0, zzrw zzrw0) {
        if(this.i != 12) {
            if(this.y(v, zzsa0)) {
                ((zzsj)this.k).zzk(zzrr0, zzrw0);
            }
            return;
        }
        if(this.x(v, zzsa0)) {
            ((zzsj)this.k).zzk(zzrr0, zzrw0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfkx
    public String zzb(Context context0, String s, View view0, Activity activity0) {
        synchronized(this) {
            Map map0 = ((zzfmt)this.l).zzc();
            map0.put("f", "v");
            map0.put("ctx", context0);
            map0.put("aid", null);
            map0.put("view", view0);
            map0.put("act", activity0);
            return g.B(this.C(map0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public void zzb(Object object0) {
        ((zzclp)this.m).c(((Map)object0), ((List)this.j), ((String)this.k));
    }

    @Override  // com.google.android.gms.internal.ads.zzfkx
    public String zzc(Context context0, String s) {
        synchronized(this) {
            Map map0 = ((zzfmt)this.l).zzb();
            map0.put("f", "q");
            map0.put("ctx", context0);
            map0.put("aid", null);
            return g.B(this.C(map0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfkx
    public void zzd(String s, MotionEvent motionEvent0) {
        synchronized(this) {
            try {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("t", new Throwable());
                hashMap0.put("aid", null);
                hashMap0.put("evt", motionEvent0);
                this.j.getClass().getDeclaredMethod("he", Map.class).invoke(this.j, hashMap0);
                ((zzfku)this.m).zzd(3003, 0L);
            }
            catch(Exception exception0) {
                throw new zzfmr(2005, exception0);
            }
        }
    }
}

