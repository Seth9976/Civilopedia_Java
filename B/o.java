package B;

import D1.c;
import X2.z;
import Y.m;
import Z.k;
import Z.l;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;
import com.google.android.gms.common.api.internal.zzd;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.b;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzfv;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzlf;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzln;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.J;
import h0.i;
import i0.f;
import i1.d0;
import j0.j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m0.t;

public final class o implements Runnable {
    public final int i;
    public Object j;
    public Object k;
    public Object l;

    public o(int v) {
        this.i = v;
        super();
    }

    public o(Object object0, Object object1, Object object2, int v) {
        this.i = v;
        this.l = object0;
        this.j = object1;
        this.k = object2;
        super();
    }

    public o(Object object0, Object object1, Object object2, int v, boolean z) {
        this.i = v;
        this.j = object0;
        this.k = object1;
        this.l = object2;
        super();
    }

    private final void a() {
        AtomicReference atomicReference0 = (AtomicReference)this.j;
        __monitor_enter(atomicReference0);
        try {
            if(((zzjy)this.l).a.zzm().e().zzi(zzah.zzb)) {
                zzjy zzjy0 = (zzjy)this.l;
                zzek zzek0 = zzjy0.d;
                if(zzek0 != null) {
                    Preconditions.checkNotNull(((zzq)this.k));
                    ((AtomicReference)this.j).set(zzek0.zzd(((zzq)this.k)));
                    String s = (String)((AtomicReference)this.j).get();
                    if(s != null) {
                        ((zzjy)this.l).a.zzq().g.set(s);
                        ((zzjy)this.l).a.zzm().f.zzb(s);
                    }
                    ((zzjy)this.l).i();
                    goto label_25;
                }
                zzjy0.a.zzay().zzd().zza("Failed to get app instance id");
                goto label_15;
            }
            goto label_18;
        }
        catch(RemoteException remoteException0) {
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
        try {
        label_15:
            ((AtomicReference)this.j).notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        return;
        try {
            try {
            label_18:
                ((zzjy)this.l).a.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                ((zzjy)this.l).a.zzq().g.set(null);
                ((zzjy)this.l).a.zzm().f.zzb(null);
                ((AtomicReference)this.j).set(null);
                goto label_31;
            }
            catch(RemoteException remoteException0) {
            label_24:
                ((zzjy)this.l).a.zzay().zzd().zzb("Failed to get app instance id", remoteException0);
            }
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
        try {
        label_25:
            ((AtomicReference)this.j).notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        return;
        try {
        label_29:
            ((AtomicReference)this.j).notify();
            throw throwable0;
        label_31:
            ((AtomicReference)this.j).notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
    }

    @Override
    public final void run() {
        Object object0 = null;
        boolean z = true;
        switch(this.i) {
            case 0: {
                try {
                    object0 = ((g)this.j).call();
                }
                catch(Exception unused_ex) {
                }
                a a0 = new a(1, ((h)this.k), object0);
                ((Handler)this.l).post(a0);
                return;
            }
            case 1: {
                c c0 = (c)this.l;
                x1.a a1 = (x1.a)this.j;
                c0.b(a1, ((TaskCompletionSource)this.k));
                ((AtomicInteger)c0.h.k).set(0);
                double f = (double)c0.a();
                double f1 = Math.min(3600000.0, Math.pow(c0.b, f) * (60000.0 / c0.a));
                String s = "Delay for: " + String.format(Locale.US, "%.2f", ((double)(f1 / 1000.0))) + " s for report: " + a1.b;
                if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", s, null);
                }
                try {
                    Thread.sleep(((long)f1));
                }
                catch(InterruptedException unused_ex) {
                }
                return;
            }
            case 2: {
                zzb zzb0 = (zzb)this.l;
                int v = zzb0.j;
                LifecycleCallback lifecycleCallback0 = (LifecycleCallback)this.j;
                if(v > 0) {
                    Bundle bundle0 = zzb0.k;
                    if(bundle0 != null) {
                        object0 = bundle0.getBundle(((String)this.k));
                    }
                    lifecycleCallback0.onCreate(((Bundle)object0));
                }
                if(zzb0.j >= 2) {
                    lifecycleCallback0.onStart();
                }
                if(zzb0.j >= 3) {
                    lifecycleCallback0.onResume();
                }
                if(zzb0.j >= 4) {
                    lifecycleCallback0.onStop();
                }
                if(zzb0.j >= 5) {
                    lifecycleCallback0.onDestroy();
                }
                return;
            }
            case 3: {
                zzd zzd0 = (zzd)this.l;
                int v1 = zzd0.g0;
                LifecycleCallback lifecycleCallback1 = (LifecycleCallback)this.j;
                if(v1 > 0) {
                    Bundle bundle1 = zzd0.h0;
                    if(bundle1 != null) {
                        object0 = bundle1.getBundle(((String)this.k));
                    }
                    lifecycleCallback1.onCreate(((Bundle)object0));
                }
                if(zzd0.g0 >= 2) {
                    lifecycleCallback1.onStart();
                }
                if(zzd0.g0 >= 3) {
                    lifecycleCallback1.onResume();
                }
                if(zzd0.g0 >= 4) {
                    lifecycleCallback1.onStop();
                }
                if(zzd0.g0 >= 5) {
                    lifecycleCallback1.onDestroy();
                }
                return;
            }
            case 4: {
                Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can\'t be executed in the main thread");
                Uri uri0 = (Uri)this.j;
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)this.k;
                if(parcelFileDescriptor0 != null) {
                    try {
                        object0 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor0.getFileDescriptor());
                    }
                    catch(OutOfMemoryError outOfMemoryError0) {
                        Log.e("ImageManager", "OOM while loading bitmap for uri: " + uri0, outOfMemoryError0);
                    }
                    try {
                        parcelFileDescriptor0.close();
                    }
                    catch(IOException iOException0) {
                        Log.e("ImageManager", "closed failed", iOException0);
                    }
                }
                CountDownLatch countDownLatch0 = new CountDownLatch(1);
                ((ImageManager)this.l).b.post(new b(((ImageManager)this.l), uri0, ((Bitmap)object0), countDownLatch0));
                try {
                    countDownLatch0.await();
                }
                catch(InterruptedException unused_ex) {
                    Log.w("ImageManager", "Latch interrupted while posting " + uri0);
                }
                return;
            }
            case 5: {
                try {
                    z = ((Boolean)((j)this.l).get()).booleanValue();
                }
                catch(InterruptedException | ExecutionException unused_ex) {
                }
                ((Z.b)this.j).a(((String)this.k), z);
                return;
            }
            case 6: {
                j j0 = (j)this.k;
                l l0 = (l)this.l;
                try {
                    ((j)this.j).get();
                    m.d().a("WM-WorkerWrapper", "Starting work for " + l0.m.c, new Throwable[0]);
                    n1.a a2 = l0.n.startWork();
                    l0.z = a2;
                    j0.l(a2);
                }
                catch(Throwable throwable0) {
                    j0.k(throwable0);
                }
                return;
            }
            case 7: {
                String s1 = (String)this.k;
                l l1 = (l)this.l;
                try {
                    Y.l l2 = (Y.l)((j)this.j).get();
                    if(l2 == null) {
                        m.d().b("WM-WorkerWrapper", l1.m.c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                    }
                    else {
                        m.d().a("WM-WorkerWrapper", String.format("%s returned a %s result.", l1.m.c, l2), new Throwable[0]);
                        l1.p = l2;
                        return;
                    }
                    return;
                }
                catch(CancellationException cancellationException0) {
                }
                catch(InterruptedException | ExecutionException interruptedException0) {
                    m.d().b("WM-WorkerWrapper", s1 + " failed because it threw an exception/error", new Throwable[]{interruptedException0});
                    return;
                }
                finally {
                    l1.b();
                }
                m.d().e("WM-WorkerWrapper", s1 + " was cancelled", new Throwable[]{cancellationException0});
                return;
            }
            case 8: {
                BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = (BroadcastReceiver.PendingResult)this.l;
                Context context0 = (Context)this.k;
                Intent intent0 = (Intent)this.j;
                try {
                    boolean z1 = intent0.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean z2 = intent0.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean z3 = intent0.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean z4 = intent0.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    m.d().a("WM-ConstrntProxyUpdtRec", "Updating proxies: BatteryNotLowProxy enabled (" + z1 + "), BatteryChargingProxy enabled (" + z2 + "), StorageNotLowProxy (" + z3 + "), NetworkStateProxy enabled (" + z4 + ")", new Throwable[0]);
                    f.a(context0, ConstraintProxy.BatteryNotLowProxy.class, z1);
                    f.a(context0, ConstraintProxy.BatteryChargingProxy.class, z2);
                    f.a(context0, ConstraintProxy.StorageNotLowProxy.class, z3);
                    f.a(context0, ConstraintProxy.NetworkStateProxy.class, z4);
                }
                finally {
                    broadcastReceiver$PendingResult0.finish();
                }
                return;
            }
            case 9: {
                f.f.a(((f.f)this.l).e, ((View)this.j), ((View)this.k));
                return;
            }
            case 10: {
                i i0 = ((WorkDatabase)this.j).n().l(((String)this.k));
                if(i0 != null && i0.b()) {
                    synchronized(((g0.a)this.l).k) {
                        ((g0.a)this.l).n.put(((String)this.k), i0);
                        ((g0.a)this.l).o.add(i0);
                        ((g0.a)this.l).p.c(((g0.a)this.l).o);
                    }
                    return;
                }
                return;
            }
            case 11: {
                ((k)this.j).p.h(((String)this.k), ((B1.a)this.l));
                return;
            }
            case 12: {
                zzlf zzlf0 = ((zzgw)this.l).i;
                zzlf0.a();
                zzac zzac0 = (zzac)this.j;
                Object object2 = zzac0.zzc.zza();
                zzq zzq0 = (zzq)this.k;
                if(object2 == null) {
                    zzlf0.j(zzac0, zzq0);
                    return;
                }
                zzlf0.m(zzac0, zzq0);
                return;
            }
            case 13: {
                zzgw zzgw0 = (zzgw)this.l;
                zzaw zzaw0 = (zzaw)this.j;
                zzlf zzlf1 = zzgw0.i;
                if("_cmp".equals(zzaw0.zza) && (zzaw0.zzb != null && zzaw0.zzb.zza() != 0)) {
                    String s2 = zzaw0.zzb.i.getString("_cis");
                    if("referrer broadcast".equals(s2) || "referrer API".equals(s2)) {
                        zzlf1.zzay().zzi().zzb("Event has been filtered ", zzaw0.toString());
                        zzaw0 = new zzaw("_cmpx", zzaw0.zzb, zzaw0.zzc, zzaw0.zzd);
                    }
                }
                zzfv zzfv0 = zzlf1.zzo();
                zzq zzq1 = (zzq)this.k;
                if(!zzfv0.zzo(zzq1.zza)) {
                    zzgw0.b(zzaw0, zzq1);
                    return;
                }
                zzlf1.zzay().zzj().zzb("EES config found for", zzq1.zza);
                zzfv zzfv1 = zzlf1.zzo();
                String s3 = zzq1.zza;
                if(!TextUtils.isEmpty(s3)) {
                    object0 = (zzc)zzfv1.j.get(s3);
                }
                if(object0 == null) {
                    zzlf1.zzay().zzj().zzb("EES not loaded for", zzq1.zza);
                    zzgw0.b(zzaw0, zzq1);
                }
                else {
                    try {
                        HashMap hashMap0 = zzlf1.zzu().w(zzaw0.zzb.zzc(), true);
                        String s4 = zzhb.zza(zzaw0.zza);
                        if(s4 == null) {
                            s4 = zzaw0.zza;
                        }
                        if(!((zzc)object0).zze(new zzaa(s4, zzaw0.zzd, hashMap0))) {
                            goto label_190;
                        }
                    }
                    catch(com.google.android.gms.internal.measurement.zzd unused_ex) {
                        zzlf1.zzay().zzd().zzc("EES error. appId, eventName", zzq1.zzb, zzaw0.zza);
                        goto label_190;
                    }
                    if(((zzc)object0).zzg()) {
                        zzlf1.zzay().zzj().zzb("EES edited event", zzaw0.zza);
                        zzgw0.b(zzlf1.zzu().p(((zzc)object0).zza().zzb()), zzq1);
                    }
                    else {
                        zzgw0.b(zzaw0, zzq1);
                    }
                    if(((zzc)object0).zzf()) {
                        for(Object object3: ((zzc)object0).zza().zzc()) {
                            zzlf1.zzay().zzj().zzb("EES logging created event", ((zzaa)object3).zzd());
                            zzgw0.b(zzlf1.zzu().p(((zzaa)object3)), zzq1);
                        }
                        return;
                    label_190:
                        zzlf1.zzay().zzj().zzb("EES was not applied to event", zzaw0.zza);
                        zzgw0.b(zzaw0, zzq1);
                        return;
                    }
                }
                return;
            }
            case 14: {
                zzlf zzlf2 = ((zzgw)this.l).i;
                zzlf2.a();
                zzlf2.f(((zzaw)this.j), ((String)this.k));
                return;
            }
            case 15: {
                zzlf zzlf3 = ((zzgw)this.l).i;
                zzlf3.a();
                zzli zzli0 = (zzli)this.j;
                Object object4 = zzli0.zza();
                zzq zzq2 = (zzq)this.k;
                if(object4 == null) {
                    zzlf3.k(zzli0, zzq2);
                    return;
                }
                zzlf3.o(zzli0, zzq2);
                return;
            }
            case 16: {
                this.a();
                return;
            }
            case 17: {
                zzq zzq3 = (zzq)this.j;
                zzcf zzcf0 = (zzcf)this.k;
                zzjy zzjy0 = (zzjy)this.l;
                zzge zzge0 = zzjy0.a;
                try {
                    if(zzge0.zzm().e().zzi(zzah.zzb)) {
                        zzek zzek0 = zzjy0.d;
                        if(zzek0 == null) {
                            zzge0.zzay().zzd().zza("Failed to get app instance id");
                        }
                        else {
                            Preconditions.checkNotNull(zzq3);
                            object0 = zzek0.zzd(zzq3);
                            if(object0 != null) {
                                zzge0.zzq().g.set(object0);
                                zzge0.zzm().f.zzb(((String)object0));
                            }
                            zzjy0.i();
                        }
                    }
                    else {
                        zzge0.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        zzge0.zzq().g.set(null);
                        zzge0.zzm().f.zzb(null);
                    }
                }
                catch(RemoteException remoteException0) {
                    zzge0.zzay().zzd().zzb("Failed to get app instance id", remoteException0);
                }
                finally {
                    zzge0.zzv().zzV(zzcf0, ((String)object0));
                }
                return;
            }
            case 18: {
                zzq zzq4 = (zzq)this.j;
                zzjy zzjy1 = (zzjy)this.l;
                zzek zzek1 = zzjy1.d;
                if(zzek1 == null) {
                    u9.o(zzjy1.a, "Failed to send default event parameters to service");
                    return;
                }
                try {
                    Preconditions.checkNotNull(zzq4);
                    zzek1.zzr(((Bundle)this.k), zzq4);
                }
                catch(RemoteException remoteException1) {
                    zzjy1.a.zzay().zzd().zzb("Failed to send default event parameters to service", remoteException1);
                }
                return;
            }
            case 19: {
                d0 d00 = (d0)this.l;
                zzln zzln0 = d00.i.zzv();
                long v6 = d00.i.zzav().currentTimeMillis();
                zzaw zzaw1 = (zzaw)Preconditions.checkNotNull(zzln0.R("_err", ((Bundle)this.k), "auto", v6, false));
                d00.i.f(zzaw1, ((String)this.j));
                return;
            }
            case 20: {
                ((t)this.j).z(((m0.i)this.k), ((J)this.l));
                return;
            }
            default: {
                ((t)this.j).y(((z)this.k), ((D1.b)this.l));
            }
        }
    }
}

