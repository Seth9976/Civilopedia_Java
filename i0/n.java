package i0;

import Y.f;
import Y.m;
import android.os.RemoteException;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.d3;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzjy;
import h0.b;
import h0.g;
import h0.i;
import j0.j;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import k.d;
import k.e;
import k.l;

public final class n implements Runnable {
    public final int i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public n(Object object0, Object object1, Object object2, Object object3, int v) {
        this.i = v;
        this.m = object0;
        this.j = object1;
        this.k = object2;
        this.l = object3;
        super();
    }

    @Override
    public final void run() {
        zzek zzek0;
        byte[] arr_b = null;
        Object object0 = this.l;
        Object object1 = this.k;
        Object object2 = this.m;
        Object object3 = this.j;
        switch(this.i) {
            case 0: {
                j j0 = (j)object0;
                String s = ((UUID)object3).toString();
                m m0 = m.d();
                f f0 = (f)object1;
                m0.a("WM-WorkProgressUpdater", "Updating progress for " + ((UUID)object3) + " (" + f0 + ")", new Throwable[0]);
                WorkDatabase workDatabase0 = ((o)object2).a;
                ((o)object2).a.c();
                try {
                    i i0 = workDatabase0.n().l(s);
                    if(i0 == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if(i0.b == 2) {
                        g g0 = new g(s, f0);
                        f0.g g1 = workDatabase0.m();
                        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)g1.j;
                        workDatabase_Impl0.b();
                        workDatabase_Impl0.c();
                        try {
                            ((b)g1.k).e(g0);
                            workDatabase_Impl0.h();
                        }
                        finally {
                            workDatabase_Impl0.f();
                        }
                    }
                    else {
                        m.d().g("WM-WorkProgressUpdater", "Ignoring setProgressAsync(...). WorkSpec (" + s + ") is not in a RUNNING state.", new Throwable[0]);
                    }
                    j0.j(null);
                    workDatabase0.h();
                    goto label_47;
                }
                catch(Throwable throwable0) {
                }
                try {
                    m.d().b("WM-WorkProgressUpdater", "Error updating Worker progress", new Throwable[]{throwable0});
                    j0.k(throwable0);
                }
                catch(Throwable throwable1) {
                    workDatabase0.f();
                    throw throwable1;
                }
            label_47:
                workDatabase0.f();
                return;
            }
            case 1: {
                zzjy zzjy0 = ((zzij)object2).a.zzt();
                zzjy0.zzg();
                zzjy0.zza();
                zzjy0.j(new d3(zzjy0, ((AtomicReference)object3), ((String)object1), ((String)object0), zzjy0.g(false)));
                return;
            }
            case 2: {
                ((AppMeasurementDynamiteService)object2).i.zzt().zzB(((zzcf)object3), ((zzaw)object1), ((String)object0));
                return;
            }
            case 3: {
                zzjy zzjy1 = (zzjy)object2;
                try {
                    zzek0 = zzjy1.d;
                    if(zzek0 == null) {
                        zzjy1.a.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                        goto label_60;
                    }
                    goto label_62;
                }
                catch(RemoteException remoteException0) {
                    goto label_66;
                }
                catch(Throwable throwable2) {
                    zzjy1.a.zzv().zzS(((zzcf)object0), arr_b);
                    throw throwable2;
                }
            label_60:
                zzjy1.a.zzv().zzS(((zzcf)object0), null);
                return;
                try {
                    try {
                    label_62:
                        arr_b = zzek0.zzu(((zzaw)object3), ((String)object1));
                        zzjy1.i();
                        goto label_72;
                    }
                    catch(RemoteException remoteException0) {
                    }
                label_66:
                    zzjy1.a.zzay().zzd().zzb("Failed to send event to the service to bundle", remoteException0);
                }
                catch(Throwable throwable2) {
                    zzjy1.a.zzv().zzS(((zzcf)object0), arr_b);
                    throw throwable2;
                }
                zzjy1.a.zzv().zzS(((zzcf)object0), arr_b);
                return;
            label_72:
                zzjy1.a.zzv().zzS(((zzcf)object0), arr_b);
                return;
            }
            case 4: {
                zzjy zzjy2 = ((AppMeasurementDynamiteService)object2).i.zzt();
                zzjy2.zzg();
                zzjy2.zza();
                zzjy2.j(new d3(zzjy2, ((String)object1), ((String)object0), zzjy2.g(false), ((zzcf)object3), 3));
                return;
            }
            default: {
                if(((e)object3) != null) {
                    ((k.f)((d)object2).j).H = true;
                    ((e)object3).b.c(false);
                    ((k.f)((d)object2).j).H = false;
                }
                if(((k.n)object1).isEnabled() && ((k.n)object1).hasSubMenu()) {
                    ((l)object0).q(((k.n)object1), null, 4);
                }
            }
        }
    }
}

