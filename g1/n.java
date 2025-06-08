package g1;

import A3.h;
import C1.d;
import I3.e;
import J2.j;
import J2.r;
import L3.l;
import L3.m;
import T1.c;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.u;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzfv;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzko;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.spears.civilopedia.db.tables.FrontendCivilizationItems;
import com.spears.civilopedia.db.tables.FrontendLeaderItems;
import f0.g;
import g3.A;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import m0.x;
import o0.a;
import o2.C;
import q0.o;
import q3.I;
import q3.J;
import q3.K;
import q3.L;
import s0.b;
import s3.f;
import w2.i;
import x2.k;
import z1.a0;

public final class n implements e, RemoteCall, zzo, zzhe, OnTokenCanceledListener, A, x, b, f {
    public final int i;
    public Object j;
    public Object k;

    public n(int v) {
        this.i = v;
        super();
    }

    public n(int v, int v1) {
        this.i = 29;
        super();
        this.j = new int[]{v, v1};
        this.k = new float[]{0.0f, 1.0f};
    }

    public n(int v, int v1, int v2) {
        this.i = 29;
        super();
        this.j = new int[]{v, v1, v2};
        this.k = new float[]{0.0f, 0.5f, 1.0f};
    }

    public n(int v, Object object0, Object object1) {
        this.i = v;
        this.k = object0;
        this.j = object1;
        super();
    }

    public n(d d0, HashMap hashMap0, HashMap hashMap1) {
        this.i = 19;
        super();
        this.j = d0;
        this.k = hashMap0;
    }

    public n(c c0) {
        this.i = 18;
        super();
        this.j = c0.U("CivilizationItems", r.a.b(FrontendCivilizationItems.class));
        this.k = c0.U("LeaderItems", r.a.b(FrontendLeaderItems.class));
    }

    public n(Context context0, int v) {
        this.i = v;
        this.k = null;
        this.j = context0;
        super();
    }

    public n(Context context0, zzku zzku0) {
        this.i = 15;
        l l0 = new l();
        try {
            o.b(context0);
            l0.c = o.a().c(a.e).t("PLAY_BILLING_LIBRARY", new n0.b("proto"), new J3.d(17));
        }
        catch(Throwable unused_ex) {
            l0.b = true;
        }
        super();
        this.k = l0;
        this.j = zzku0;
    }

    public n(SharedPreferences sharedPreferences0) {
        this.i = 21;
        super();
        this.j = sharedPreferences0;
    }

    public n(WorkDatabase_Impl workDatabase_Impl0, int v) {
        this.i = v;
        switch(v) {
            case 8: {
                super();
                this.j = workDatabase_Impl0;
                this.k = new h0.b(workDatabase_Impl0, 1);
                return;
            }
            case 9: {
                super();
                this.j = workDatabase_Impl0;
                this.k = new h0.b(workDatabase_Impl0, 3);
                return;
            }
            case 10: {
                super();
                this.j = workDatabase_Impl0;
                this.k = new h0.b(workDatabase_Impl0, 6);
                return;
            }
            default: {
                super();
                this.j = workDatabase_Impl0;
                this.k = new h0.b(workDatabase_Impl0, 0);
            }
        }
    }

    public n(zzko zzko0) {
        this.i = 12;
        super();
        this.k = zzko0;
    }

    public n(n n0) {
        this.i = 27;
        super();
        int v = x1.e.e(((Context)n0.j), "com.google.firebase.crashlytics.unity_version", "string");
        Context context0 = (Context)n0.j;
        if(v != 0) {
            this.j = "Unity";
            String s = context0.getResources().getString(v);
            this.k = s;
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Unity Editor version is: " + s, null);
            }
        }
        else if(context0.getAssets() != null) {
            try {
                InputStream inputStream0 = context0.getAssets().open("flutter_assets/NOTICES.Z");
                if(inputStream0 != null) {
                    inputStream0.close();
                }
            }
            catch(IOException unused_ex) {
                this.j = null;
                this.k = null;
                return;
            }
            this.j = "Flutter";
            this.k = null;
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
            }
        }
        else {
            this.j = null;
            this.k = null;
        }
    }

    public n(Object object0, Object object1, int v, boolean z) {
        this.i = v;
        this.j = object0;
        this.k = object1;
        super();
    }

    public n(Object object0, Object object1, Object object2, int v) {
        this.i = v;
        this.j = object1;
        this.k = object2;
        super();
    }

    public n(ArrayList arrayList0, ArrayList arrayList1) {
        this.i = 29;
        super();
        int v = arrayList0.size();
        this.j = new int[v];
        this.k = new float[v];
        for(int v1 = 0; v1 < v; ++v1) {
            int[] arr_v = (int[])this.j;
            arr_v[v1] = (int)(((Integer)arrayList0.get(v1)));
            float[] arr_f = (float[])this.k;
            arr_f[v1] = (float)(((Float)arrayList1.get(v1)));
        }
    }

    public n(Map map0) {
        this.i = 6;
        super();
        this.j = map0;
        this.k = new m("Java nullability annotation states").c(new h(this, 15));
    }

    public n(k.d d0, String s) {
        this.i = 17;
        super();
        j.f(s, "className");
        this.k = d0;
        this.j = s;
    }

    public n(L l0, K k0) {
        this.i = 24;
        j.f(l0, "strings");
        j.f(k0, "qualifiedNames");
        super();
        this.j = l0;
        this.k = k0;
    }

    @Override  // s3.f
    public boolean a(int v) {
        return ((Boolean)this.q(v).k).booleanValue();
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object object0, Object object1) {
        if(this.i != 0) {
            q q0 = new q(((TaskCompletionSource)object1));
            ((zzaz)object0).zzr(((ActivityTransitionRequest)this.k), ((PendingIntent)this.j), q0);
            return;
        }
        p p0 = new p(((TaskCompletionSource)object1));
        ((zzam)((zzaz)object0).getService()).zzv(((PendingIntent)this.j), ((SleepSegmentRequest)this.k), p0);
    }

    @Override  // s3.f
    public String b(int v) {
        i i0 = this.q(v);
        List list0 = (List)i0.i;
        String s = x2.i.Y(((List)i0.j), ".", null, null, null, 62);
        return list0.isEmpty() ? s : x2.i.Y(list0, "/", null, null, null, 62) + '/' + s;
    }

    @Override  // I3.e
    public I3.d c(v3.b b0) {
        j.f(b0, "classId");
        o3.d d0 = (o3.d)this.k;
        j.f(d0.c().c, "<this>");
        c3.b b1 = C.j(((c)this.j), b0, u3.f.g);
        if(b1 == null) {
            return null;
        }
        d3.d.a(b1.a).equals(b0);
        return d0.f(b1);
    }

    public void d() {
        SharedPreferences sharedPreferences0 = (SharedPreferences)this.j;
        sharedPreferences0.edit().remove("premium_enititled").apply();
        this.n(new q2.f(sharedPreferences0.getBoolean("premium_enititled", false)));
    }

    public void e(String s, I2.b b0) {
        LinkedHashMap linkedHashMap0 = (LinkedHashMap)((k.d)this.k).j;
        n3.n n0 = new n3.n(this, s);
        b0.b(n0);
        ArrayList arrayList0 = n0.b;
        ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
        for(Object object0: arrayList0) {
            arrayList1.add(((String)((w2.e)object0).i));
        }
        String s1 = (String)n0.c.i;
        j.f(s1, "ret");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(n0.a);
        stringBuilder0.append('(');
        stringBuilder0.append(x2.i.Y(arrayList1, "", null, null, o3.p.i, 30));
        stringBuilder0.append(')');
        if(s1.length() > 1) {
            s1 = "L" + s1 + ';';
        }
        stringBuilder0.append(s1);
        String s2 = stringBuilder0.toString();
        String s3 = (String)this.j;
        j.f(s3, "internalName");
        j.f(s2, "jvmDescriptor");
        n3.p p0 = (n3.p)n0.c.j;
        ArrayList arrayList2 = new ArrayList(k.E(arrayList0));
        for(Object object1: arrayList0) {
            arrayList2.add(((n3.p)((w2.e)object1).j));
        }
        linkedHashMap0.put(s3 + '.' + s2, new n3.l(p0, arrayList2));
    }

    public CctBackendFactory f(String s) {
        Map map0;
        Bundle bundle0;
        if(((Map)this.k) == null) {
            Context context0 = (Context)this.j;
            try {
                PackageManager packageManager0 = context0.getPackageManager();
                if(packageManager0 == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    goto label_13;
                }
                else {
                    ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, TransportBackendDiscovery.class), 0x80);
                    if(serviceInfo0 == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        goto label_13;
                    }
                    else {
                        bundle0 = serviceInfo0.metaData;
                    }
                }
                goto label_14;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            label_12:
                Log.w("BackendRegistry", "Application info not found.");
            }
            try {
            label_13:
                bundle0 = null;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                goto label_12;
            }
        label_14:
            if(bundle0 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map0 = Collections.emptyMap();
            }
            else {
                HashMap hashMap0 = new HashMap();
                for(Object object0: bundle0.keySet()) {
                    String s1 = (String)object0;
                    Object object1 = bundle0.get(s1);
                    if(object1 instanceof String && s1.startsWith("backend:")) {
                        String[] arr_s = ((String)object1).split(",", -1);
                        for(int v = 0; v < arr_s.length; ++v) {
                            String s2 = arr_s[v].trim();
                            if(!s2.isEmpty()) {
                                hashMap0.put(s2, s1.substring(8));
                            }
                        }
                    }
                }
                map0 = hashMap0;
            }
            this.k = map0;
        }
        String s3 = (String)((Map)this.k).get(s);
        if(s3 == null) {
            return null;
        }
        try {
            return (CctBackendFactory)Class.forName(s3).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            Log.w("BackendRegistry", "Class " + s3 + " is not found.", classNotFoundException0);
            return null;
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("BackendRegistry", "Could not instantiate " + s3 + ".", illegalAccessException0);
            return null;
        }
        catch(InstantiationException instantiationException0) {
            Log.w("BackendRegistry", "Could not instantiate " + s3 + ".", instantiationException0);
            return null;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.w("BackendRegistry", "Could not instantiate " + s3, noSuchMethodException0);
            return null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.w("BackendRegistry", "Could not instantiate " + s3, invocationTargetException0);
            return null;
        }
    }

    public List g() {
        return this.j;
    }

    @Override  // v2.a
    public Object get() {
        return new r0.f(((Context)((k.d)this.j).j), ((r0.d)((r0.e)this.k).get()));
    }

    @Override  // s3.f
    public String getString(int v) {
        String s = (String)((L)this.j).j.get(v);
        j.e(s, "getString(...)");
        return s;
    }

    public ArrayList h(String s) {
        O.k k0 = O.k.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if(s == null) {
            k0.e(1);
        }
        else {
            k0.f(1, s);
        }
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.j;
        workDatabase_Impl0.b();
        Cursor cursor0 = workDatabase_Impl0.g(k0);
        try {
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                arrayList0.add(cursor0.getString(0));
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            k0.release();
        }
    }

    public List i() {
        return this.k;
    }

    @Override  // com.google.android.gms.measurement.internal.zzhe
    public void interceptEvent(String s, String s1, Bundle bundle0, long v) {
        try {
            ((zzci)this.j).zze(s, s1, bundle0, v);
        }
        catch(RemoteException remoteException0) {
            zzge zzge0 = ((AppMeasurementDynamiteService)this.k).i;
            if(zzge0 != null) {
                zzge0.zzay().zzk().zzb("Event interceptor threw exception", remoteException0);
            }
        }
    }

    public Long j(String s) {
        Long long0 = null;
        O.k k0 = O.k.c(1, "SELECT long_value FROM Preference where `key`=?");
        k0.f(1, s);
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.j;
        workDatabase_Impl0.b();
        Cursor cursor0 = workDatabase_Impl0.g(k0);
        try {
            if(cursor0.moveToFirst() && !cursor0.isNull(0)) {
                long0 = cursor0.getLong(0);
            }
            return long0;
        }
        finally {
            cursor0.close();
            k0.release();
        }
    }

    public ArrayList k(String s) {
        O.k k0 = O.k.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if(s == null) {
            k0.e(1);
        }
        else {
            k0.f(1, s);
        }
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.j;
        workDatabase_Impl0.b();
        Cursor cursor0 = workDatabase_Impl0.g(k0);
        try {
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                arrayList0.add(cursor0.getString(0));
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            k0.release();
        }
    }

    public static n l(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        View view0 = layoutInflater0.inflate(0x7F0A006E, viewGroup0, false);  // layout:tree_leader_list_item
        View view1 = a0.r(view0, 0x7F070094);  // id:include
        if(view1 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F070094));  // id:include
        }
        return new n(((RelativeLayout)view0), B.f.b(view1), 5, false);
    }

    public void m(h0.c c0) {
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.j;
        workDatabase_Impl0.b();
        workDatabase_Impl0.c();
        try {
            ((h0.b)this.k).e(c0);
            workDatabase_Impl0.h();
        }
        finally {
            workDatabase_Impl0.f();
        }
    }

    public void n(q2.f f0) {
        u u0 = (u)this.k;
        if(u0 == null) {
            this.k = new u(f0);  // 初始化器: Landroidx/lifecycle/t;-><init>(Lq2/f;)V
            return;
        }
        u0.e(f0);
    }

    public void o(int v, Bundle bundle0) {
        if(Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Analytics listener received message. ID: " + v + ", Extras: " + bundle0, null);
        }
        String s = bundle0.getString("name");
        if(s != null) {
            Bundle bundle1 = bundle0.getBundle("params");
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            g g0 = "clx".equals(bundle1.getString("_o")) ? ((g)this.j) : ((o3.k)this.k);
            if(g0 != null) {
                g0.b(s, bundle1);
            }
        }
    }

    @Override  // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        ((FusedLocationProviderClient)this.j).removeLocationUpdates(((g1.g)this.k));
    }

    public void p(u.h h0) {
        if(((u.h)this.j) != h0) {
            this.j = h0;
            if(h0 != null && h0.j != this) {
                h0.j = this;
                this.p(h0);
            }
        }
    }

    public i q(int v) {
        LinkedList linkedList0 = new LinkedList();
        LinkedList linkedList1 = new LinkedList();
        boolean z = false;
        while(v != -1) {
            J j0 = (J)((K)this.k).j.get(v);
            String s = (String)((L)this.j).j.get(j0.l);
            I i0 = j0.m;
            j.c(i0);
            switch(i0.ordinal()) {
                case 0: {
                    linkedList1.addFirst(s);
                    break;
                }
                case 1: {
                    linkedList0.addFirst(s);
                    break;
                }
                case 2: {
                    linkedList1.addFirst(s);
                    z = true;
                }
            }
            v = j0.k;
        }
        return new i(linkedList0, linkedList1, Boolean.valueOf(z));
    }

    public g r(v3.f f0, String s) {
        j.f(f0, "name");
        String s1 = f0.b();
        j.e(s1, "asString(...)");
        return new g(this, new o3.o(s1 + s));
    }

    public void s(zzjz zzjz0) {
        if(zzjz0 == null) {
            return;
        }
        try {
            zzli zzli0 = zzlk.zzc();
            zzli0.zzo(((zzku)this.j));
            zzli0.zza(zzjz0);
            ((l)this.k).b(((zzlk)zzli0.zzf()));
        }
        catch(Throwable throwable0) {
            zze.zzm("BillingLogger", "Unable to log.", throwable0);
        }
    }

    public void t(zzkd zzkd0) {
        if(zzkd0 == null) {
            return;
        }
        try {
            zzli zzli0 = zzlk.zzc();
            zzli0.zzo(((zzku)this.j));
            zzli0.zzm(zzkd0);
            ((l)this.k).b(((zzlk)zzli0.zzf()));
        }
        catch(Throwable throwable0) {
            zze.zzm("BillingLogger", "Unable to log.", throwable0);
        }
    }

    public void u(zzlq zzlq0) {
        try {
            l l0 = (l)this.k;
            zzli zzli0 = zzlk.zzc();
            zzli0.zzo(((zzku)this.j));
            zzli0.zzp(zzlq0);
            l0.b(((zzlk)zzli0.zzf()));
        }
        catch(Throwable throwable0) {
            zze.zzm("BillingLogger", "Unable to log.", throwable0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzo
    public String zza(String s) {
        Map map0 = (Map)((zzfv)this.k).d.getOrDefault(((String)this.j), null);
        return map0 == null || !map0.containsKey(s) ? null : ((String)map0.get(s));
    }
}

