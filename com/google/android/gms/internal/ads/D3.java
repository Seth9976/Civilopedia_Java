package com.google.android.gms.internal.ads;

import A.f;
import Y.g;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzln;
import com.google.android.gms.measurement.internal.zzq;
import i0.m;
import j0.a;
import j0.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

public final class d3 implements Runnable {
    public final int i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public d3(zzjy zzjy0, AtomicReference atomicReference0, String s, String s1, zzq zzq0) {
        this.i = 2;
        super();
        this.n = zzjy0;
        this.l = atomicReference0;
        this.j = s;
        this.k = s1;
        this.m = zzq0;
    }

    public d3(Object object0, Object object1, Object object2, Object object3, Object object4, int v) {
        this.i = v;
        this.n = object0;
        this.j = object1;
        this.k = object2;
        this.l = object3;
        this.m = object4;
        super();
    }

    @Override
    public final void run() {
        String s4;
        switch(this.i) {
            case 0: {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("event", "precacheCanceled");
                hashMap0.put("src", ((String)this.j));
                String s2 = (String)this.k;
                if(!TextUtils.isEmpty(s2)) {
                    hashMap0.put("cachedSrc", s2);
                }
                String s3 = (String)this.l;
                switch(s3) {
                    case "badUrl": {
                        s4 = "network";
                        break;
                    }
                    case "contentLengthMissing": {
                        s4 = "internal";
                        break;
                    }
                    case "downloadTimeout": {
                        s4 = "network";
                        break;
                    }
                    case "error": {
                        s4 = "internal";
                        break;
                    }
                    case "expireFailed": {
                        s4 = "io";
                        break;
                    }
                    case "externalAbort": {
                        s4 = "policy";
                        break;
                    }
                    case "inProgress": 
                    case "interrupted": 
                    case "noop": 
                    case "playerFailed": {
                        s4 = "internal";
                        break;
                    }
                    case "noCacheDir": {
                        s4 = "io";
                        break;
                    }
                    case "sizeExceeded": {
                        s4 = "policy";
                        break;
                    }
                    default: {
                        s4 = "internal";
                    }
                }
                hashMap0.put("type", s4);
                hashMap0.put("reason", s3);
                String s5 = (String)this.m;
                if(!TextUtils.isEmpty(s5)) {
                    hashMap0.put("message", s5);
                }
                zzcju.a(((zzcju)this.n), hashMap0);
                return;
            }
            case 1: {
                try {
                    if(!(((j)this.j).i instanceof a)) {
                        String s6 = ((UUID)this.k).toString();
                        int v1 = ((m)this.n).c.i(s6);
                        if(v1 == 0 || f.a(v1)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((m)this.n).b.g(s6, ((g)this.l));
                        Intent intent0 = g0.a.b(((Context)this.m), s6, ((g)this.l));
                        ((Context)this.m).startService(intent0);
                    }
                    ((j)this.j).j(null);
                    return;
                }
                catch(Throwable throwable0) {
                }
                ((j)this.j).k(throwable0);
                return;
            }
            case 2: {
                AtomicReference atomicReference0 = (AtomicReference)this.l;
                __monitor_enter(atomicReference0);
                try {
                    try {
                        zzjy zzjy1 = (zzjy)this.n;
                        zzek zzek1 = zzjy1.d;
                        if(zzek1 != null) {
                            if(TextUtils.isEmpty(null)) {
                                Preconditions.checkNotNull(((zzq)this.m));
                                List list0 = zzek1.zzf(((String)this.j), ((String)this.k), ((zzq)this.m));
                                ((AtomicReference)this.l).set(list0);
                            }
                            else {
                                List list1 = zzek1.zzg(null, ((String)this.j), ((String)this.k));
                                ((AtomicReference)this.l).set(list1);
                            }
                            ((zzjy)this.n).i();
                            goto label_92;
                        }
                        zzjy1.a.zzay().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, ((String)this.j), ((String)this.k));
                        List list2 = Collections.emptyList();
                        ((AtomicReference)this.l).set(list2);
                        goto label_98;
                    }
                    catch(RemoteException remoteException1) {
                        ((zzjy)this.n).a.zzay().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, ((String)this.j), remoteException1);
                        List list3 = Collections.emptyList();
                        ((AtomicReference)this.l).set(list3);
                    }
                }
                catch(Throwable throwable1) {
                    goto label_96;
                }
                try {
                label_92:
                    ((AtomicReference)this.l).notify();
                }
                catch(Throwable throwable2) {
                    __monitor_exit(atomicReference0);
                    throw throwable2;
                }
                __monitor_exit(atomicReference0);
                try {
                    return;
                label_96:
                    ((AtomicReference)this.l).notify();
                    throw throwable1;
                label_98:
                    ((AtomicReference)this.l).notify();
                }
                catch(Throwable throwable2) {
                    __monitor_exit(atomicReference0);
                    throw throwable2;
                }
                __monitor_exit(atomicReference0);
                return;
            }
            default: {
                zzq zzq0 = (zzq)this.l;
                String s = (String)this.k;
                String s1 = (String)this.j;
                zzcf zzcf0 = (zzcf)this.m;
                zzjy zzjy0 = (zzjy)this.n;
                ArrayList arrayList0 = new ArrayList();
                try {
                    zzek zzek0 = zzjy0.d;
                    if(zzek0 == null) {
                        zzjy0.a.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", s1, s);
                    }
                    else {
                        Preconditions.checkNotNull(zzq0);
                        arrayList0 = zzln.zzH(zzek0.zzf(s1, s, zzq0));
                        zzjy0.i();
                    }
                }
                catch(RemoteException remoteException0) {
                    zzjy0.a.zzay().zzd().zzd("Failed to get conditional properties; remote exception", s1, s, remoteException0);
                }
                finally {
                    zzjy0.a.zzv().zzQ(zzcf0, arrayList0);
                }
            }
        }
    }
}

