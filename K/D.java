package k;

import J2.j;
import X2.O;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.a;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f0.g;
import f2.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k3.p;
import l.L0;
import l.h0;
import l.m;
import m0.B;
import o2.q;
import o3.l;
import r2.h;
import s0.b;
import t1.c;
import w3.k;
import x1.i;
import x1.s;

public final class d implements O, a, Continuation, OnCanceledListener, OnFailureListener, OnSuccessListener, C, w, h0, m, l, b, v1.a {
    public final int i;
    public Object j;

    public d(int v) {
        this.i = v;
        if(v != 6) {
            super();
            this.j = new CountDownLatch(1);
            return;
        }
        super();
        this.j = new LinkedHashMap();
    }

    public d(int v, boolean z) {
        this.i = v;
        super();
    }

    public d(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    public d(p p0) {
        this.i = 7;
        j.f(p0, "packageFragment");
        super();
        this.j = p0;
    }

    public d(boolean z) {
        this.i = 17;
        super();
        new AtomicReference(null);
        this.j = new AtomicMarkableReference(new y1.b((z ? 0x2000 : 0x400)), false);
    }

    @Override  // k.w
    public void a(k.l l0, boolean z) {
        if(l0 instanceof D) {
            ((D)l0).z.k().c(false);
        }
        w w0 = ((l.j)this.j).m;
        if(w0 != null) {
            w0.a(l0, z);
        }
    }

    @Override  // androidx.activity.result.a
    public void b(Object object0) {
        ProxyBillingActivityV2 proxyBillingActivityV20 = (ProxyBillingActivityV2)this.j;
        proxyBillingActivityV20.getClass();
        Intent intent0 = ((ActivityResult)object0).j;
        int v = zze.zzf(intent0, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver0 = proxyBillingActivityV20.s;
        if(resultReceiver0 != null) {
            resultReceiver0.send(v, (intent0 == null ? null : intent0.getExtras()));
        }
        int v1 = ((ActivityResult)object0).i;
        if(v1 != -1 || v != 0) {
            zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + v1 + " and billing\'s responseCode: " + v);
        }
        proxyBillingActivityV20.finish();
    }

    @Override  // l.h0
    public void c(k.l l0, n n0) {
        f f0 = (f)this.j;
        e e0 = null;
        f0.n.removeCallbacksAndMessages(null);
        ArrayList arrayList0 = f0.p;
        int v = arrayList0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(l0 == ((e)arrayList0.get(v1)).b) {
                break;
            }
        }
        if(v1 == -1) {
            return;
        }
        if(v1 + 1 < arrayList0.size()) {
            e0 = (e)arrayList0.get(v1 + 1);
        }
        i0.n n1 = new i0.n(this, e0, n0, l0, 5);
        long v2 = SystemClock.uptimeMillis();
        f0.n.postAtTime(n1, l0, v2 + 200L);
    }

    @Override  // k.w
    public boolean d(D d0) {
        if(d0 == null) {
            return false;
        }
        d0.A.getClass();
        l.j j0 = (l.j)this.j;
        j0.getClass();
        return j0.m == null ? false : j0.m.d(d0);
    }

    @Override  // v1.a
    public void e(Bundle bundle0) {
        q1.b b0 = (q1.b)(((q1.a)this.j));
        b0.getClass();
        if(!r1.b.c.contains("clx") && !r1.b.b.contains("_ae")) {
            for(Object object0: r1.b.d) {
                if(bundle0.containsKey(((String)object0))) {
                    return;
                }
                if(false) {
                    break;
                }
            }
            bundle0.putLong("_r", 1L);
            b0.a.logEvent("clx", "_ae", bundle0);
        }
    }

    public q0.j f() {
        Context context0 = (Context)this.j;
        if(context0 == null) {
            throw new IllegalStateException("android.content.Context must be set");
        }
        q0.j j0 = new q0.j();  // 初始化器: Ljava/lang/Object;-><init>()V
        j0.i = s0.a.a(q0.m.a);
        d d0 = new d(context0, 11);
        j0.j = d0;
        j0.k = s0.a.a(new g1.n(d0, new r0.e(d0, 0), 23, false));
        d d1 = j0.j;
        j0.l = new d(d1, 14);
        v2.a a0 = s0.a.a(new r0.e(d1, 1));
        v2.a a1 = s0.a.a(new k(1, j0.l, a0));
        j0.m = a1;
        c c0 = new c(18);
        d d2 = j0.j;
        q0.p p0 = new q0.p(d2, a1, c0, 1);
        v2.a a2 = j0.i;
        v2.a a3 = j0.k;
        j0.n = s0.a.a(new q0.p(new B.f(a2, a3, p0, a1, a1, 10), new L0(d2, a3, a1, p0, a2, a1, a1, 6), new g(a2, a1, p0, a1, 24), 0));
        return j0;
    }

    public Map g() {
        y1.b b0 = (y1.b)((AtomicMarkableReference)this.j).getReference();
        synchronized(b0) {
            return Collections.unmodifiableMap(new HashMap(b0.a));
        }
    }

    @Override  // v2.a
    public Object get() {
        return this.i != 11 ? new x0.j(((Context)((d)this.j).j), x0.j.l, "com.google.android.datatransport.events") : this.j;
    }

    public void h(E1.d d0, Thread thread0, Throwable throwable0) {
        i i0 = (i)this.j;
        synchronized(i0) {
            String s = "Handling uncaught exception \"" + throwable0 + "\" from thread " + thread0.getName();
            if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", s, null);
            }
            x1.f f0 = new x1.f(i0, System.currentTimeMillis(), throwable0, thread0, d0);
            Task task0 = i0.d.r(f0);
            try {
                s.a(task0);
            }
            catch(TimeoutException unused_ex) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            }
            catch(Exception exception0) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", exception0);
            }
        }
    }

    @Override  // o3.l
    public void i() {
    }

    @Override  // l.h0
    public void j(k.l l0, n n0) {
        ((f)this.j).n.removeCallbacksAndMessages(l0);
    }

    @Override  // o3.l
    public void k(v3.f f0, A3.f f1) {
    }

    @Override  // o3.l
    public void l(v3.f f0, Object object0) {
    }

    @Override  // f2.C
    public void m(int v) {
        B.f f0 = (B.f)this.j;
        String s = ((q)((List)f0.l).get(v)).b;
        ((f2.l)f0.n).a.edit().putString("tree-selected-leader", s).apply();
        o2.f f1 = ((f2.l)f0.n).b.b();
        f0.j = s;
        B.f f2 = (B.f)f0.k;
        new B.f(((B.f)f2.m), 0).x(((List)f0.l), s, ((List)f1.D), null);
        RelativeLayout relativeLayout0 = (RelativeLayout)f2.l;
        relativeLayout0.setVisibility((relativeLayout0.getVisibility() == 8 ? 0 : 8));
        o3.k k0 = (o3.k)f0.m;
        if(k0 != null) {
            h h0 = (h)k0.i;
            o2.f f3 = h0.r();
            B.f f4 = h0.I;
            if(f4 != null) {
                h0.C = o2.C.k(f3, ((String)f4.j));
                h0.x();
                return;
            }
            j.l("leaderDropDownView");
            throw null;
        }
    }

    @Override  // o3.l
    public void n(v3.f f0, v3.b b0, v3.f f1) {
    }

    @Override  // o3.l
    public l o(v3.b b0, v3.f f0) {
        return null;
    }

    @Override  // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch)this.j).countDown();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception0) {
        ((CountDownLatch)this.j).countDown();
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        ((CountDownLatch)this.j).countDown();
    }

    @Override  // o3.l
    public o3.m p(v3.f f0) {
        return "b".equals(f0.b()) ? new p3.b(this, 2) : null;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        if(this.i != 3) {
            boolean z = task0.isSuccessful();
            B b0 = (B)this.j;
            if(z) {
                Object object0 = task0.getResult();
                ((TaskCompletionSource)b0.k).setResult(object0);
                return null;
            }
            Exception exception0 = task0.getException();
            ((TaskCompletionSource)b0.k).setException(exception0);
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((Collection)this.j)) {
            arrayList0.add(((Task)object1).getResult());
        }
        return arrayList0;
    }

    @Override
    public String toString() {
        if(this.i != 7) {
            return super.toString();
        }
        p p0 = (p)this.j;
        return p0 + ": " + ((Map)android.support.v4.media.session.a.A(p0.q, p.u[0])).keySet();
    }
}

