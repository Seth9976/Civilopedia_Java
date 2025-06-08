package com.google.android.gms.measurement.internal;

import A.f;
import B.o;
import N.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzpo;
import i0.n;
import i1.S;
import i1.U;
import i1.p;
import i1.r;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
public final class zzjy extends p {
    public final zzjx c;
    public zzek d;
    public volatile Boolean e;
    public final U f;
    public final b g;
    public final ArrayList h;
    public final U i;

    public zzjy(zzge zzge0) {
        super(zzge0);
        this.h = new ArrayList();
        this.g = new b(zzge0.zzav());
        this.c = new zzjx(this);
        this.f = new U(this, zzge0, 0);
        this.i = new U(this, zzge0, 1);
    }

    @Override  // i1.p
    public final boolean b() {
        return false;
    }

    public final void c(zzek zzek0, AbstractSafeParcelable abstractSafeParcelable0, zzq zzq0) {
        int v2;
        this.zzg();
        this.zza();
        zzge zzge0 = this.a;
        int v = 0;
        for(int v1 = 100; v < 1001 && v1 == 100; v1 = v2) {
            ArrayList arrayList0 = new ArrayList();
            List list0 = zzge0.zzi().zzi(100);
            if(list0 == null) {
                v2 = 0;
            }
            else {
                arrayList0.addAll(list0);
                v2 = list0.size();
            }
            if(abstractSafeParcelable0 != null && v2 < 100) {
                arrayList0.add(abstractSafeParcelable0);
            }
            int v3 = arrayList0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                AbstractSafeParcelable abstractSafeParcelable1 = (AbstractSafeParcelable)arrayList0.get(v4);
                if(abstractSafeParcelable1 instanceof zzaw) {
                    try {
                        zzek0.zzk(((zzaw)abstractSafeParcelable1), zzq0);
                    }
                    catch(RemoteException remoteException0) {
                        zzge0.zzay().zzd().zzb("Failed to send event to the service", remoteException0);
                    }
                }
                else if(abstractSafeParcelable1 instanceof zzli) {
                    try {
                        zzek0.zzt(((zzli)abstractSafeParcelable1), zzq0);
                    }
                    catch(RemoteException remoteException1) {
                        zzge0.zzay().zzd().zzb("Failed to send user property to the service", remoteException1);
                    }
                }
                else if(abstractSafeParcelable1 instanceof zzac) {
                    try {
                        zzek0.zzn(((zzac)abstractSafeParcelable1), zzq0);
                    }
                    catch(RemoteException remoteException2) {
                        zzge0.zzay().zzd().zzb("Failed to send conditional user property to the service", remoteException2);
                    }
                }
                else {
                    u9.o(zzge0, "Discarding data. Unrecognized parcel type.");
                }
            }
            ++v;
        }
    }

    public final void d(zzac zzac0) {
        Preconditions.checkNotNull(zzac0);
        this.zzg();
        this.zza();
        boolean z = this.a.zzi().zzn(zzac0);
        zzac zzac1 = new zzac(zzac0);
        this.j(new S(this, this.g(true), z, zzac1, 3));
    }

    public final boolean e() {
        this.zzg();
        this.zza();
        return !this.f() || this.a.zzv().zzm() >= ((int)(((Integer)zzeh.zzaf.zza(null))));
    }

    public final boolean f() {
        this.zzg();
        this.zza();
        if(this.e == null) {
            this.zzg();
            this.zza();
            r r0 = this.a.zzm();
            r0.zzg();
            boolean z = false;
            Boolean boolean0 = r0.d().contains("use_service") ? Boolean.valueOf(r0.d().getBoolean("use_service", false)) : null;
            boolean z1 = true;
            if(boolean0 == null || !boolean0.booleanValue()) {
                zzel zzel0 = this.a.zzh();
                zzel0.zza();
                if(zzel0.k == 1) {
                    z = true;
                }
                else {
                    this.a.zzay().zzj().zza("Checking service availability");
                    int v = this.a.zzv().zzo(12451000);
                    switch(v) {
                        case 0: {
                            this.a.zzay().zzj().zza("Service available");
                            z = true;
                            break;
                        }
                        case 1: {
                            this.a.zzay().zzj().zza("Service missing");
                            break;
                        }
                        case 2: {
                            this.a.zzay().zzc().zza("Service container out of date");
                            if(this.a.zzv().zzm() >= 0x4423) {
                                if(boolean0 != null) {
                                    z1 = false;
                                }
                                z = z1;
                                z1 = false;
                            }
                            break;
                        }
                        case 3: {
                            this.a.zzay().zzk().zza("Service disabled");
                            z1 = false;
                            break;
                        }
                        case 9: {
                            this.a.zzay().zzk().zza("Service invalid");
                            z1 = false;
                            break;
                        }
                        case 18: {
                            this.a.zzay().zzk().zza("Service updating");
                            z = true;
                            break;
                        }
                        default: {
                            this.a.zzay().zzk().zzb("Unexpected service status", v);
                            z1 = false;
                        }
                    }
                }
                if(!z && this.a.zzf().d()) {
                    u9.o(this.a, "No way to upload. Consider using the full version of Analytics");
                }
                else if(z1) {
                    r r1 = this.a.zzm();
                    r1.zzg();
                    SharedPreferences.Editor sharedPreferences$Editor0 = r1.d().edit();
                    sharedPreferences$Editor0.putBoolean("use_service", z);
                    sharedPreferences$Editor0.apply();
                }
                z1 = z;
            }
            this.e = Boolean.valueOf(z1);
        }
        return this.e.booleanValue();
    }

    public final zzq g(boolean z) {
        long v8;
        String s8;
        List list1;
        int v7;
        Object object0;
        String s5;
        Class class0;
        String s;
        zzge zzge0 = this.a;
        zzel zzel0 = zzge0.zzh();
        if(z) {
            zzeu zzeu0 = zzge0.zzay();
            if(zzeu0.a.zzm().d == null) {
                s = null;
            }
            else {
                Pair pair0 = zzeu0.a.zzm().d.zza();
                s = pair0 == null || pair0 == r.w ? null : f.i(String.valueOf(pair0.second), ":", ((String)pair0.first));
            }
        }
        else {
            s = null;
        }
        zzel0.zzg();
        String s1 = zzel0.zzl();
        String s2 = zzel0.zzm();
        zzel0.zza();
        String s3 = zzel0.d;
        zzel0.zza();
        long v = (long)zzel0.e;
        zzel0.zza();
        Preconditions.checkNotNull(zzel0.f);
        String s4 = zzel0.f;
        zzge zzge1 = zzel0.a;
        zzge1.zzf().zzh();
        zzel0.zza();
        zzel0.zzg();
        long v1 = zzel0.g;
        if(v1 == 0L) {
            zzln zzln0 = zzge1.zzv();
            Context context0 = zzge1.zzau();
            zzln0.zzg();
            Preconditions.checkNotNull(context0);
            new String("com.spears.civilopedia");
            PackageManager packageManager0 = context0.getPackageManager();
            MessageDigest messageDigest0 = zzln.f();
            long v2 = -1L;
            zzge zzge2 = zzln0.a;
            if(messageDigest0 == null) {
                u9.o(zzge2, "Could not get MD5 instance");
                v1 = -1L;
            }
            else if(packageManager0 == null) {
                v1 = 0L;
            }
            else {
                try {
                    if(zzln0.x(context0, "com.spears.civilopedia")) {
                        v2 = 0L;
                    }
                    else {
                        Signature[] arr_signature = Wrappers.packageManager(context0).getPackageInfo("com.spears.civilopedia", 0x40).signatures;
                        if(arr_signature == null || arr_signature.length <= 0) {
                            zzge2.zzay().zzk().zza("Could not get signatures");
                        }
                        else {
                            v2 = zzln.N(messageDigest0.digest(arr_signature[0].toByteArray()));
                        }
                    }
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    zzge2.zzay().zzd().zzb("Package name not found", packageManager$NameNotFoundException0);
                    v1 = 0L;
                    goto label_60;
                }
                v1 = v2;
            }
        label_60:
            zzel0.g = v1;
        }
        boolean z1 = zzge1.zzJ();
        int v3 = !zzge1.zzm().o;
        zzel0.zzg();
        if(zzge1.zzJ()) {
            zzpo.zzc();
            if(zzge1.zzf().zzs(null, zzeh.zzaa)) {
                zzge1.zzay().zzj().zza("Disabled IID for tests.");
                s5 = null;
            }
            else {
                try {
                    class0 = zzge1.zzau().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                }
                catch(ClassNotFoundException unused_ex) {
                    s5 = null;
                    goto label_87;
                }
                if(class0 == null) {
                    s5 = null;
                }
                else {
                    try {
                        object0 = class0.getDeclaredMethod("getInstance", Context.class).invoke(null, zzge1.zzau());
                    }
                    catch(Exception unused_ex) {
                        zzge1.zzay().zzm().zza("Failed to obtain Firebase Analytics instance");
                        goto label_82;
                    }
                    if(object0 == null) {
                    label_82:
                        s5 = null;
                    }
                    else {
                        try {
                            s5 = (String)class0.getDeclaredMethod("getFirebaseInstanceId", null).invoke(object0, null);
                        }
                        catch(Exception unused_ex) {
                            zzge1.zzay().zzl().zza("Failed to retrieve Firebase Instance Id");
                            goto label_82;
                        }
                    }
                }
            }
        }
        else {
            s5 = null;
        }
    label_87:
        long v4 = zzge1.zzm().e.zza();
        long v5 = v4 == 0L ? zzge1.G : Math.min(zzge1.G, v4);
        zzel0.zza();
        int v6 = zzel0.k;
        boolean z2 = zzge1.zzf().zzr();
        r r0 = zzge1.zzm();
        r0.zzg();
        boolean z3 = r0.d().getBoolean("deferred_analytics_collection", false);
        zzel0.zza();
        String s6 = zzel0.m;
        Boolean boolean0 = zzge1.zzf().c("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolean1 = boolean0 == null ? null : Boolean.valueOf(!boolean0.booleanValue());
        List list0 = zzel0.i;
        String s7 = zzge1.zzm().e().zzh();
        if(zzel0.j == null) {
            v7 = v6;
            list1 = list0;
            if(zzge1.zzf().zzs(null, zzeh.zzaE)) {
                zzln zzln1 = zzge1.zzv();
                byte[] arr_b = new byte[16];
                zzln1.g().nextBytes(arr_b);
                s8 = s6;
                zzel0.j = String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
            }
            else {
                s8 = s6;
                zzel0.j = "";
            }
        }
        else {
            s8 = s6;
            v7 = v6;
            list1 = list0;
        }
        String s9 = zzel0.j;
        zzpi.zzc();
        if(zzge1.zzf().zzs(null, zzeh.zzaz)) {
            zzel0.zzg();
            if(zzel0.o == 0L) {
                v8 = v5;
            }
            else {
                v8 = v5;
                long v9 = zzge1.zzav().currentTimeMillis() - zzel0.o;
                if(zzel0.n != null && v9 > 86400000L && zzel0.p == null) {
                    zzel0.c();
                }
            }
            if(zzel0.n == null) {
                zzel0.c();
            }
            return new zzq(s1, s2, s3, v, s4, 68000L, v1, s, z1, ((boolean)v3), s5, v8, v7, z2, z3, s8, boolean1, zzel0.h, list1, s7, s9, zzel0.n);
        }
        return new zzq(s1, s2, s3, v, s4, 68000L, v1, s, z1, ((boolean)v3), s5, v5, v7, z2, z3, s8, boolean1, zzel0.h, list1, s7, s9, null);
    }

    public final void h() {
        this.zzg();
        zzge zzge0 = this.a;
        zzes zzes0 = zzge0.zzay().zzj();
        ArrayList arrayList0 = this.h;
        zzes0.zzb("Processing queued up service tasks", arrayList0.size());
        for(Object object0: arrayList0) {
            Runnable runnable0 = (Runnable)object0;
            try {
                runnable0.run();
            }
            catch(RuntimeException runtimeException0) {
                zzge0.zzay().zzd().zzb("Task exception while flushing queue", runtimeException0);
            }
        }
        arrayList0.clear();
        this.i.a();
    }

    public final void i() {
        this.zzg();
        this.g.j = ((Clock)this.g.k).elapsedRealtime();
        long v = (long)(((Long)zzeh.zzI.zza(null)));
        this.f.c(v);
    }

    public final void j(Runnable runnable0) {
        this.zzg();
        if(this.zzL()) {
            runnable0.run();
            return;
        }
        ArrayList arrayList0 = this.h;
        zzge zzge0 = this.a;
        if(((long)arrayList0.size()) >= 1000L) {
            u9.o(zzge0, "Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList0.add(runnable0);
        this.i.c(60000L);
        this.m();
    }

    public final Boolean k() {
        return this.e;
    }

    public static void l(zzjy zzjy0, ComponentName componentName0) {
        zzjy0.zzg();
        if(zzjy0.d != null) {
            zzjy0.d = null;
            zzjy0.a.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName0);
            zzjy0.zzg();
            zzjy0.m();
        }
    }

    public final void m() {
        this.zzg();
        this.zza();
        if(this.zzL()) {
            return;
        }
        boolean z = this.f();
        zzjx zzjx0 = this.c;
        if(!z) {
            zzge zzge0 = this.a;
            if(!zzge0.zzf().d()) {
                List list0 = zzge0.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(zzge0.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 0x10000);
                if(list0 != null && !list0.isEmpty()) {
                    Intent intent0 = new Intent("com.google.android.gms.measurement.START");
                    intent0.setComponent(new ComponentName(zzge0.zzau(), "com.google.android.gms.measurement.AppMeasurementService"));
                    zzjx0.zzb(intent0);
                    return;
                }
                u9.o(zzge0, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
            return;
        }
        zzjx0.zzc();
    }

    public final void zzB(zzcf zzcf0, zzaw zzaw0, String s) {
        this.zzg();
        this.zza();
        zzge zzge0 = this.a;
        if(zzge0.zzv().zzo(12451000) != 0) {
            zzge0.zzay().zzk().zza("Not bundling data. Service unavailable or out of date");
            zzge0.zzv().zzS(zzcf0, new byte[0]);
            return;
        }
        this.j(new n(this, zzaw0, s, zzcf0, 3));
    }

    public final void zzH(Bundle bundle0) {
        this.zzg();
        this.zza();
        this.j(new o(this, this.g(false), bundle0, 18));
    }

    public final boolean zzL() {
        this.zzg();
        this.zza();
        return this.d != null;
    }

    public final void zzs() {
        this.zzg();
        this.zza();
        this.c.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.a.zzau(), this.c);
        }
        catch(IllegalStateException | IllegalArgumentException unused_ex) {
        }
        this.d = null;
    }

    public final void zzt(zzcf zzcf0) {
        this.zzg();
        this.zza();
        this.j(new o(this, this.g(false), zzcf0, 17));
    }

    public final void zzu(AtomicReference atomicReference0) {
        this.zzg();
        this.zza();
        this.j(new o(this, atomicReference0, this.g(false), 16));
    }
}

