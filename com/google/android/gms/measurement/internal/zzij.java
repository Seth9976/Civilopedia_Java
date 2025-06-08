package com.google.android.gms.measurement.internal;

import B.a;
import B.b;
import T1.c;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.B;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.internal.measurement.zzpi;
import i0.n;
import i1.E;
import i1.F;
import i1.G;
import i1.H;
import i1.J;
import i1.K;
import i1.L;
import i1.S;
import i1.T;
import i1.a0;
import i1.p;
import i1.r;
import i1.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zzij extends p {
    public L c;
    public zzhe d;
    public final CopyOnWriteArraySet e;
    public boolean f;
    public final AtomicReference g;
    public final Object h;
    public zzai i;
    public int j;
    public final AtomicLong k;
    public long l;
    public int m;
    public final zzs n;
    public boolean o;
    public final c p;

    public zzij(zzge zzge0) {
        super(zzge0);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.o = true;
        this.p = new c(this, 29);
        this.g = new AtomicReference();
        this.i = new zzai(null, null);
        this.j = 100;
        this.l = -1L;
        this.m = 100;
        this.k = new AtomicLong(0L);
        this.n = new zzs(zzge0);
    }

    @Override  // i1.p
    public final boolean b() {
        return false;
    }

    public final void c(String s, String s1, Bundle bundle0) {
        this.zzg();
        this.d(s, s1, bundle0, this.a.zzav().currentTimeMillis());
    }

    public final void d(String s, String s1, Bundle bundle0, long v) {
        this.zzg();
        this.e(s, s1, v, bundle0, true, this.d == null || zzln.y(s1), true);
    }

    public final void e(String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2) {
        Bundle[] arr_bundle;
        ArrayList arrayList1;
        boolean z5;
        zzge zzge1;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(bundle0);
        this.zzg();
        this.zza();
        zzge zzge0 = this.a;
        if(zzge0.zzJ()) {
            List list0 = zzge0.zzh().i;
            if(list0 != null && !list0.contains(s1)) {
                zzge0.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", s1, s);
                return;
            }
            if(!this.f) {
                try {
                    this.f = true;
                    Class class0 = zzge0.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService") : Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zzge0.zzau().getClassLoader());
                    try {
                        class0.getDeclaredMethod("initialize", Context.class).invoke(null, zzge0.zzau());
                    }
                    catch(Exception exception0) {
                        zzge0.zzay().zzk().zzb("Failed to invoke Tag Manager\'s initialize() method", exception0);
                    }
                }
                catch(ClassNotFoundException unused_ex) {
                    zzge0.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
                }
            }
            if(!"_cmp".equals(s1) || !bundle0.containsKey("gclid")) {
                zzge1 = zzge0;
            }
            else {
                String s2 = bundle0.getString("gclid");
                zzge1 = zzge0;
                this.h(zzge0.zzav().currentTimeMillis(), s2, "auto", "_lgclid");
            }
            if(z && zzln.zzal(s1)) {
                zzge1.zzv().j(bundle0, zzge1.zzm().v.zza());
            }
            c c0 = this.p;
            if(!z2 && !"_iap".equals(s1)) {
                zzln zzln0 = zzge1.zzv();
                int v1 = 2;
                if(zzln0.u("event", s1)) {
                    if(!zzln0.q("event", zzhb.zza, zzhb.zzb, s1)) {
                        v1 = 13;
                    }
                    else if(zzln0.p(40, "event", s1)) {
                        v1 = 0;
                    }
                }
                if(v1 != 0) {
                    zzge1.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", zzge1.zzj().d(s1));
                    String s3 = zzge1.zzv().zzD(s1, 40, true);
                    zzge1.zzv().getClass();
                    zzln.l(c0, null, v1, "_ev", s3, (s1 == null ? 0 : s1.length()));
                    return;
                }
            }
            zzpf.zzc();
            if(zzge1.zzf().zzs(null, zzeh.zzak)) {
                zziq zziq0 = zzge1.zzs().zzj(false);
                if(zziq0 != null && !bundle0.containsKey("_sc")) {
                    zziq0.a = true;
                }
                zzln.zzK(zziq0, bundle0, z && !z2);
            }
            else {
                zziq zziq1 = zzge1.zzs().zzj(false);
                if(zziq1 != null && !bundle0.containsKey("_sc")) {
                    zziq1.a = true;
                }
                zzln.zzK(zziq1, bundle0, z && !z2);
            }
            boolean z3 = "am".equals(s);
            boolean z4 = zzln.y(s1);
            if(!z || this.d == null || z4) {
                z5 = z3;
            }
            else {
                if(z3) {
                    z5 = true;
                    goto label_65;
                }
                zzge1.zzay().zzc().zzc("Passing event to registered event handler (FE)", zzge1.zzj().d(s1), zzge1.zzj().b(bundle0));
                Preconditions.checkNotNull(this.d);
                this.d.interceptEvent(s, s1, bundle0, v);
                return;
            }
        label_65:
            if(zzge1.a()) {
                int v2 = zzge1.zzv().zzh(s1);
                if(v2 != 0) {
                    zzge1.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", zzge1.zzj().d(s1));
                    String s4 = zzge1.zzv().zzD(s1, 40, true);
                    zzge1.zzv().getClass();
                    zzln.l(c0, null, v2, "_ev", s4, (s1 == null ? 0 : s1.length()));
                    return;
                }
                List list1 = CollectionUtils.listOf(new String[]{"_o", "_sn", "_sc", "_si"});
                Bundle bundle1 = zzge1.zzv().Q(s1, bundle0, list1, z2);
                Preconditions.checkNotNull(bundle1);
                if(zzge1.zzs().zzj(false) != null && "_ae".equals(s1)) {
                    zzko zzko0 = zzge1.zzu();
                    long v3 = ((zzko)zzko0.e.l).a.zzav().elapsedRealtime();
                    long v4 = v3 - zzko0.e.j;
                    zzko0.e.j = v3;
                    if(v4 > 0L) {
                        zzge1.zzv().h(bundle1, v4);
                    }
                }
                zzob.zzc();
                if(zzge1.zzf().zzs(null, zzeh.zzac)) {
                    if(!"auto".equals(s) && "_ssr".equals(s1)) {
                        zzln zzln1 = zzge1.zzv();
                        String s5 = bundle1.getString("_ffr");
                        if(Strings.isEmptyOrWhitespace(s5)) {
                            s5 = null;
                        }
                        else if(s5 != null) {
                            s5 = s5.trim();
                        }
                        boolean z6 = zzll.zza(s5, zzln1.a.zzm().s.zza());
                        zzge zzge2 = zzln1.a;
                        if(!z6) {
                            zzge2.zzm().s.zzb(s5);
                            goto label_104;
                        }
                        zzge2.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    else if("_ae".equals(s1)) {
                        String s6 = zzge1.zzv().a.zzm().s.zza();
                        if(!TextUtils.isEmpty(s6)) {
                            bundle1.putString("_ffr", s6);
                        }
                    }
                }
            label_104:
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(bundle1);
                if(zzge1.zzm().n.zza() <= 0L || !zzge1.zzm().g(v) || !zzge1.zzm().p.zzb()) {
                    arrayList1 = arrayList0;
                }
                else {
                    zzge1.zzay().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                    arrayList1 = arrayList0;
                    this.h(zzge1.zzav().currentTimeMillis(), null, "auto", "_sid");
                    this.h(zzge1.zzav().currentTimeMillis(), null, "auto", "_sno");
                    this.h(zzge1.zzav().currentTimeMillis(), null, "auto", "_se");
                }
                if(bundle1.getLong("extend_session", 0L) == 1L) {
                    zzge1.zzay().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    zzge1.zzu().d.k(v, true);
                }
                ArrayList arrayList2 = new ArrayList(bundle1.keySet());
                Collections.sort(arrayList2);
                int v5 = arrayList2.size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    String s7 = (String)arrayList2.get(v6);
                    if(s7 != null) {
                        zzge1.zzv();
                        Object object0 = bundle1.get(s7);
                        if(object0 instanceof Bundle) {
                            arr_bundle = new Bundle[]{((Bundle)object0)};
                        }
                        else if(object0 instanceof Parcelable[]) {
                            arr_bundle = (Bundle[])Arrays.copyOf(((Parcelable[])object0), ((Parcelable[])object0).length, Bundle[].class);
                        }
                        else {
                            arr_bundle = object0 instanceof ArrayList ? ((Bundle[])((ArrayList)object0).toArray(new Bundle[((ArrayList)object0).size()])) : null;
                        }
                        if(arr_bundle != null) {
                            bundle1.putParcelableArray(s7, arr_bundle);
                        }
                    }
                }
                for(int v7 = 0; v7 < arrayList1.size(); ++v7) {
                    Bundle bundle2 = (Bundle)arrayList1.get(v7);
                    bundle2.putString("_o", s);
                    if(z1) {
                        bundle2 = zzge1.zzv().P(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    zzaw zzaw0 = new zzaw((v7 == 0 ? s1 : "_ep"), new zzau(bundle3), s, v);
                    zzjy zzjy0 = zzge1.zzt();
                    zzjy0.getClass();
                    Preconditions.checkNotNull(zzaw0);
                    zzjy0.zzg();
                    zzjy0.zza();
                    boolean z7 = zzjy0.a.zzi().zzo(zzaw0);
                    zzjy0.j(new S(zzjy0, zzjy0.g(true), z7, zzaw0, 2));
                    if(!z5) {
                        for(Object object1: this.e) {
                            ((zzhf)object1).onEvent(s, s1, new Bundle(bundle3), v);
                        }
                    }
                }
                if(zzge1.zzs().zzj(false) != null && "_ae".equals(s1)) {
                    zzko zzko1 = zzge1.zzu();
                    long v8 = zzge1.zzav().elapsedRealtime();
                    zzko1.e.a(v8, true, true);
                }
            }
            return;
        }
        zzge0.zzay().zzc().zza("Event not sent since app measurement is disabled");
    }

    public final void f(long v, boolean z) {
        this.zzg();
        this.zza();
        zzge zzge0 = this.a;
        zzge0.zzay().zzc().zza("Resetting analytics data (FE)");
        zzko zzko0 = zzge0.zzu();
        zzko0.zzg();
        ((a0)zzko0.e.k).a();
        zzko0.e.i = 0L;
        zzko0.e.j = 0L;
        zzpi.zzc();
        if(zzge0.zzf().zzs(null, zzeh.zzaz)) {
            zzge0.zzh().c();
        }
        boolean z1 = zzge0.zzJ();
        r r0 = zzge0.zzm();
        r0.e.zzb(v);
        zzge zzge1 = r0.a;
        if(!TextUtils.isEmpty(zzge1.zzm().s.zza())) {
            r0.s.zzb(null);
        }
        zzok.zzc();
        zzeg zzeg0 = zzeh.zzad;
        if(zzge1.zzf().zzs(null, zzeg0)) {
            r0.n.zzb(0L);
        }
        if(!zzge1.zzf().zzv()) {
            r0.f(!z1);
        }
        r0.t.zzb(null);
        r0.u.zzb(0L);
        r0.v.zzb(null);
        if(z) {
            zzjy zzjy0 = zzge0.zzt();
            zzjy0.zzg();
            zzjy0.zza();
            zzq zzq0 = zzjy0.g(false);
            zzjy0.a.zzi().zzj();
            zzjy0.j(new T(zzjy0, zzq0, 0));
        }
        zzok.zzc();
        if(zzge0.zzf().zzs(null, zzeg0)) {
            zzge0.zzu().d.i();
        }
        this.o = !z1;
    }

    public final void g(zzai zzai0) {
        boolean z1;
        this.zzg();
        boolean z = zzai0.zzi(zzah.zzb);
        zzge zzge0 = this.a;
        if(z && zzai0.zzi(zzah.zza)) {
            z1 = true;
        }
        else if(!zzge0.zzt().e()) {
            z1 = false;
        }
        else {
            z1 = true;
        }
        if(z1 != zzge0.zzK()) {
            zzge0.zzG(z1);
            r r0 = zzge0.zzm();
            r0.zzg();
            Boolean boolean0 = r0.d().contains("measurement_enabled_from_api") ? Boolean.valueOf(r0.d().getBoolean("measurement_enabled_from_api", true)) : null;
            if(!z1 || boolean0 == null || boolean0.booleanValue()) {
                this.i(Boolean.valueOf(z1), false);
            }
        }
    }

    public final void h(long v, Object object0, String s, String s1) {
        String s3;
        Object object1;
        String s2 = "false";
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.zza();
        zzge zzge0 = this.a;
        if(!"allow_personalized_ads".equals(s1)) {
            object1 = object0;
            s3 = s1;
        }
        else if(object0 instanceof String && !TextUtils.isEmpty(((String)object0))) {
            long v1 = "false".equals(((String)object0).toLowerCase(Locale.ENGLISH)) ? 1L : 0L;
            object0 = v1;
            zzfi zzfi0 = zzge0.zzm().l;
            if(v1 == 1L) {
                s2 = "true";
            }
            zzfi0.zzb(s2);
            object1 = object0;
            s3 = "_npa";
        }
        else if(object0 == null) {
            zzge0.zzm().l.zzb("unset");
            object1 = null;
            s3 = "_npa";
        }
        else {
            object1 = object0;
            s3 = s1;
        }
        if(!zzge0.zzJ()) {
            zzge0.zzay().zzj().zza("User property not set since app measurement is disabled");
            return;
        }
        if(!zzge0.a()) {
            return;
        }
        zzli zzli0 = new zzli(v, object1, s3, s);
        zzjy zzjy0 = zzge0.zzt();
        zzjy0.zzg();
        zzjy0.zza();
        boolean z = zzjy0.a.zzi().zzp(zzli0);
        zzjy0.j(new S(zzjy0, zzjy0.g(true), z, zzli0, 0));
    }

    public final void i(Boolean boolean0, boolean z) {
        this.zzg();
        this.zza();
        zzge zzge0 = this.a;
        zzge0.zzay().zzc().zzb("Setting app measurement enabled (FE)", boolean0);
        r r0 = zzge0.zzm();
        r0.zzg();
        SharedPreferences.Editor sharedPreferences$Editor0 = r0.d().edit();
        if(boolean0 == null) {
            sharedPreferences$Editor0.remove("measurement_enabled");
        }
        else {
            sharedPreferences$Editor0.putBoolean("measurement_enabled", boolean0.booleanValue());
        }
        sharedPreferences$Editor0.apply();
        if(z) {
            r r1 = zzge0.zzm();
            r1.zzg();
            SharedPreferences.Editor sharedPreferences$Editor1 = r1.d().edit();
            if(boolean0 == null) {
                sharedPreferences$Editor1.remove("measurement_enabled_from_api");
            }
            else {
                sharedPreferences$Editor1.putBoolean("measurement_enabled_from_api", boolean0.booleanValue());
            }
            sharedPreferences$Editor1.apply();
        }
        if(!zzge0.zzK() && (boolean0 == null || boolean0.booleanValue())) {
            return;
        }
        this.j();
    }

    public final void j() {
        this.zzg();
        zzge zzge0 = this.a;
        String s = zzge0.zzm().l.zza();
        if(s != null) {
            if("unset".equals(s)) {
                this.h(zzge0.zzav().currentTimeMillis(), null, "app", "_npa");
            }
            else {
                this.h(zzge0.zzav().currentTimeMillis(), ((long)("true".equals(s) ? 1L : 0L)), "app", "_npa");
            }
        }
        if(zzge0.zzJ() && this.o) {
            zzge0.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            this.zzz();
            zzok.zzc();
            if(zzge0.zzf().zzs(null, zzeh.zzad)) {
                zzge0.zzu().d.i();
            }
            zzge0.zzaz().zzp(new b(this, 25));
            return;
        }
        zzge0.zzay().zzc().zza("Updating Scion state (FE)");
        zzjy zzjy0 = zzge0.zzt();
        zzjy0.zzg();
        zzjy0.zza();
        zzjy0.j(new T(zzjy0, zzjy0.g(true), 2));
    }

    public static void k(zzij zzij0, zzai zzai0, zzai zzai1) {
        zzah[] arr_zzah = {zzah.zzb, zzah.zza};
        for(int v = 0; true; ++v) {
            boolean z = false;
            if(v >= 2) {
                break;
            }
            zzah zzah0 = arr_zzah[v];
            if(!zzai1.zzi(zzah0) && zzai0.zzi(zzah0)) {
                z = true;
                break;
            }
        }
        if(!z && !zzai0.zzl(zzai1, new zzah[]{zzah.zzb, zzah.zza})) {
            return;
        }
        zzij0.a.zzh().c();
    }

    public static void l(zzij zzij0, zzai zzai0, int v, long v1, boolean z, boolean z1) {
        zzij0.zzg();
        zzij0.zza();
        zzge zzge0 = zzij0.a;
        if(v1 <= zzij0.l && zzai.zzj(zzij0.m, v)) {
            zzge0.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzai0);
            return;
        }
        r r0 = zzge0.zzm();
        r0.zzg();
        if(zzai.zzj(v, r0.d().getInt("consent_source", 100))) {
            SharedPreferences.Editor sharedPreferences$Editor0 = r0.d().edit();
            sharedPreferences$Editor0.putString("consent_settings", zzai0.zzh());
            sharedPreferences$Editor0.putInt("consent_source", v);
            sharedPreferences$Editor0.apply();
            zzij0.l = v1;
            zzij0.m = v;
            zzjy zzjy0 = zzge0.zzt();
            zzjy0.zzg();
            zzjy0.zza();
            if(z) {
                zzjy0.a.zzi().zzj();
            }
            if(zzjy0.e()) {
                zzjy0.j(new T(zzjy0, zzjy0.g(false), 3));
            }
            if(z1) {
                zzge0.zzt().zzu(new AtomicReference());
            }
            return;
        }
        zzge0.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", v);
    }

    public final void zzA(String s, String s1, Bundle bundle0) {
        zzge zzge0 = this.a;
        long v = zzge0.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(s);
        Bundle bundle1 = new Bundle();
        bundle1.putString("name", s);
        bundle1.putLong("creation_timestamp", v);
        if(s1 != null) {
            bundle1.putString("expired_event_name", s1);
            bundle1.putBundle("expired_event_params", bundle0);
        }
        zzge0.zzaz().zzp(new G(this, bundle1, 1));
    }

    public final void zzB() {
        zzge zzge0 = this.a;
        if(zzge0.zzau().getApplicationContext() instanceof Application && this.c != null) {
            ((Application)zzge0.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final void zzD(String s, String s1, Bundle bundle0) {
        this.zzE(s, s1, bundle0, true, true, this.a.zzav().currentTimeMillis());
    }

    public final void zzE(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) {
        Bundle bundle1 = bundle0 == null ? new Bundle() : bundle0;
        zzge zzge0 = this.a;
        switch(s1) {
            case 0: {
            label_4:
                boolean z2 = !z1 || this.d == null || zzln.y(s1);
                Bundle bundle2 = new Bundle(bundle1);
                for(Object object0: bundle2.keySet()) {
                    String s2 = (String)object0;
                    Object object1 = bundle2.get(s2);
                    if(object1 instanceof Bundle) {
                        bundle2.putBundle(s2, new Bundle(((Bundle)object1)));
                    }
                    else if(object1 instanceof Parcelable[]) {
                        Parcelable[] arr_parcelable = (Parcelable[])object1;
                        for(int v1 = 0; v1 < arr_parcelable.length; ++v1) {
                            Parcelable parcelable0 = arr_parcelable[v1];
                            if(parcelable0 instanceof Bundle) {
                                arr_parcelable[v1] = new Bundle(((Bundle)parcelable0));
                            }
                        }
                    }
                    else if(object1 instanceof List) {
                        List list0 = (List)object1;
                        for(int v2 = 0; v2 < list0.size(); ++v2) {
                            Object object2 = list0.get(v2);
                            if(object2 instanceof Bundle) {
                                list0.set(v2, new Bundle(((Bundle)object2)));
                            }
                        }
                    }
                }
                zzge0.zzaz().zzp(new F(this, (s == null ? "app" : s), s1, v, bundle2, z1, z2, z));
                return;
            }
            case 0xBF84: {
                break;
            }
            default: {
                if(!s1.equals("screen_view")) {
                    goto label_4;
                }
            }
        }
        zzge0.zzs().zzx(bundle1, v);
    }

    public final void zzF(String s, String s1, Bundle bundle0, String s2) {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void zzJ(zzhf zzhf0) {
        this.zza();
        Preconditions.checkNotNull(zzhf0);
        if(!this.e.add(zzhf0)) {
            this.a.zzay().zzk().zza("OnEventListener already registered");
        }
    }

    public final void zzK(long v) {
        this.g.set(null);
        this.a.zzaz().zzp(new E(this, v, 1));
    }

    public final void zzP(Bundle bundle0) {
        this.zzQ(bundle0, this.a.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle0, long v) {
        Preconditions.checkNotNull(bundle0);
        Bundle bundle1 = new Bundle(bundle0);
        boolean z = TextUtils.isEmpty(bundle1.getString("app_id"));
        zzge zzge0 = this.a;
        if(!z) {
            zzge0.zzay().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle1.remove("app_id");
        Preconditions.checkNotNull(bundle1);
        zzha.zza(bundle1, "app_id", String.class, null);
        zzha.zza(bundle1, "origin", String.class, null);
        zzha.zza(bundle1, "name", String.class, null);
        zzha.zza(bundle1, "value", Object.class, null);
        zzha.zza(bundle1, "trigger_event_name", String.class, null);
        zzha.zza(bundle1, "trigger_timeout", Long.class, 0L);
        zzha.zza(bundle1, "timed_out_event_name", String.class, null);
        zzha.zza(bundle1, "timed_out_event_params", Bundle.class, null);
        zzha.zza(bundle1, "triggered_event_name", String.class, null);
        zzha.zza(bundle1, "triggered_event_params", Bundle.class, null);
        zzha.zza(bundle1, "time_to_live", Long.class, 0L);
        zzha.zza(bundle1, "expired_event_name", String.class, null);
        zzha.zza(bundle1, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle1.getString("name"));
        Preconditions.checkNotEmpty(bundle1.getString("origin"));
        Preconditions.checkNotNull(bundle1.get("value"));
        bundle1.putLong("creation_timestamp", v);
        String s = bundle1.getString("name");
        Object object0 = bundle1.get("value");
        if(zzge0.zzv().M(s) == 0) {
            if(zzge0.zzv().J(object0, s) == 0) {
                Object object1 = zzge0.zzv().e(object0, s);
                if(object1 == null) {
                    zzge0.zzay().zzd().zzc("Unable to normalize conditional user property value", zzge0.zzj().f(s), object0);
                    return;
                }
                zzha.zzb(bundle1, object1);
                long v1 = bundle1.getLong("trigger_timeout");
                if(!TextUtils.isEmpty(bundle1.getString("trigger_event_name")) && (v1 > 15552000000L || v1 < 1L)) {
                    zzge0.zzay().zzd().zzc("Invalid conditional user property timeout", zzge0.zzj().f(s), v1);
                    return;
                }
                long v2 = bundle1.getLong("time_to_live");
                if(v2 <= 15552000000L && v2 >= 1L) {
                    zzge0.zzaz().zzp(new G(this, bundle1, 0));
                    return;
                }
                zzge0.zzay().zzd().zzc("Invalid conditional user property time to live", zzge0.zzj().f(s), v2);
                return;
            }
            zzge0.zzay().zzd().zzc("Invalid conditional user property value", zzge0.zzj().f(s), object0);
            return;
        }
        zzge0.zzay().zzd().zzb("Invalid conditional user property name", zzge0.zzj().f(s));
    }

    public final void zzR(Bundle bundle0, int v, long v1) {
        this.zza();
        String s = zzai.zzg(bundle0);
        if(s != null) {
            this.a.zzay().zzl().zzb("Ignoring invalid consent setting", s);
            this.a.zzay().zzl().zza("Valid consent values are \'granted\', \'denied\'");
        }
        this.zzS(zzai.zza(bundle0), v, v1);
    }

    public final void zzS(zzai zzai0, int v, long v1) {
        zzai zzai2;
        boolean z2;
        boolean z1;
        zzai zzai1 = zzai0;
        this.zza();
        if(v != -10 && zzai0.zze() == null && zzai0.zzf() == null) {
            this.a.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized(this.h) {
            zzai2 = this.i;
            boolean z = false;
            if(zzai.zzj(v, this.j)) {
                z1 = zzai1.zzk(this.i);
                if(zzai1.zzi(zzah.zzb) && !this.i.zzi(zzah.zzb)) {
                    z = true;
                }
                zzai1 = zzai1.zzd(this.i);
                this.i = zzai1;
                this.j = v;
                z2 = z;
                z = true;
            }
            else {
                z1 = false;
                z2 = false;
            }
        }
        if(!z) {
            this.a.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzai1);
            return;
        }
        long v3 = this.k.getAndIncrement();
        if(z1) {
            this.g.set(null);
            this.a.zzaz().zzq(new J(this, zzai1, v1, v, v3, z2, zzai2));
            return;
        }
        K k0 = new K(this, zzai1, v, v3, z2, zzai2);
        if(v != -10 && v != 30) {
            this.a.zzaz().zzp(k0);
            return;
        }
        this.a.zzaz().zzq(k0);
    }

    public final void zzT(zzhe zzhe0) {
        this.zzg();
        this.zza();
        if(zzhe0 != null) {
            zzhe zzhe1 = this.d;
            if(zzhe0 != zzhe1) {
                Preconditions.checkState(zzhe1 == null, "EventInterceptor already set.");
            }
        }
        this.d = zzhe0;
    }

    public final void zzU(Boolean boolean0) {
        this.zza();
        this.a.zzaz().zzp(new a(this, boolean0, 13, false));
    }

    public final void zzW(String s, String s1, Object object0, boolean z) {
        this.zzX("auto", "_ldl", object0, true, this.a.zzav().currentTimeMillis());
    }

    public final void zzX(String s, String s1, Object object0, boolean z, long v) {
        int v2;
        String s2 = s == null ? "app" : s;
        zzge zzge0 = this.a;
        int v1 = 0;
        if(z) {
            v2 = zzge0.zzv().M(s1);
        }
        else {
            zzln zzln0 = zzge0.zzv();
            v2 = 6;
            if(zzln0.u("user property", s1)) {
                if(!zzln0.q("user property", zzhd.zza, null, s1)) {
                    v2 = 15;
                }
                else if(zzln0.p(24, "user property", s1)) {
                    v2 = 0;
                }
            }
        }
        c c0 = this.p;
        if(v2 != 0) {
            String s3 = zzge0.zzv().zzD(s1, 24, true);
            if(s1 != null) {
                v1 = s1.length();
            }
            zzge0.zzv().getClass();
            zzln.l(c0, null, v2, "_ev", s3, v1);
            return;
        }
        if(object0 != null) {
            int v3 = zzge0.zzv().J(object0, s1);
            if(v3 != 0) {
                String s4 = zzge0.zzv().zzD(s1, 24, true);
                if(object0 instanceof String || object0 instanceof CharSequence) {
                    v1 = object0.toString().length();
                }
                zzge0.zzv().getClass();
                zzln.l(c0, null, v3, "_ev", s4, v1);
                return;
            }
            Object object1 = zzge0.zzv().e(object0, s1);
            if(object1 != null) {
                zzge0.zzaz().zzp(new z(this, s2, s1, object1, v, 1));
            }
            return;
        }
        zzge0.zzaz().zzp(new z(this, s2, s1, null, v, 1));
    }

    public final void zzZ(zzhf zzhf0) {
        this.zza();
        Preconditions.checkNotNull(zzhf0);
        if(!this.e.remove(zzhf0)) {
            this.a.zzay().zzk().zza("OnEventListener had not been registered");
        }
    }

    public final int zzh(String s) {
        Preconditions.checkNotEmpty(s);
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Boolean)this.a.zzaz().d(atomicReference0, 15000L, "boolean test flag value", new H(this, atomicReference0, 0));
    }

    public final Double zzj() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Double)this.a.zzaz().d(atomicReference0, 15000L, "double test flag value", new H(this, atomicReference0, 4));
    }

    public final Integer zzl() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Integer)this.a.zzaz().d(atomicReference0, 15000L, "int test flag value", new H(this, atomicReference0, 3));
    }

    public final Long zzm() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Long)this.a.zzaz().d(atomicReference0, 15000L, "long test flag value", new H(this, atomicReference0, 2));
    }

    public final String zzo() {
        return (String)this.g.get();
    }

    public final String zzp() {
        zziq zziq0 = this.a.zzs().zzi();
        return zziq0 == null ? null : zziq0.zzb;
    }

    public final String zzq() {
        zziq zziq0 = this.a.zzs().zzi();
        return zziq0 == null ? null : zziq0.zza;
    }

    public final String zzr() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (String)this.a.zzaz().d(atomicReference0, 15000L, "String test flag value", new H(this, atomicReference0, 1));
    }

    public final ArrayList zzs(String s, String s1) {
        zzge zzge0 = this.a;
        if(zzge0.zzaz().zzs()) {
            zzge0.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if(zzab.zza()) {
            zzge0.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference0 = new AtomicReference();
        zzge0.zzaz().d(atomicReference0, 5000L, "get conditional user properties", new n(this, atomicReference0, s, s1, 1));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            zzge0.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzln.zzH(list0);
    }

    public final List zzt(boolean z) {
        this.zza();
        zzge zzge0 = this.a;
        zzge0.zzay().zzj().zza("Getting user properties (FE)");
        if(!zzge0.zzaz().zzs()) {
            if(zzab.zza()) {
                zzge0.zzay().zzd().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference0 = new AtomicReference();
            zzge0.zzaz().d(atomicReference0, 5000L, "get user properties", new androidx.lifecycle.z(this, atomicReference0, z));
            List list0 = (List)atomicReference0.get();
            if(list0 == null) {
                zzge0.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyList();
            }
            return list0;
        }
        zzge0.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map zzu(String s, String s1, boolean z) {
        zzge zzge0 = this.a;
        if(zzge0.zzaz().zzs()) {
            zzge0.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if(zzab.zza()) {
            zzge0.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference0 = new AtomicReference();
        zzge0.zzaz().d(atomicReference0, 5000L, "get user properties", new B(this, atomicReference0, s, s1, z, 1));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            zzge0.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        p.b b0 = new p.b(list0.size());
        for(Object object0: list0) {
            zzli zzli0 = (zzli)object0;
            Object object1 = zzli0.zza();
            if(object1 != null) {
                b0.put(zzli0.zzb, object1);
            }
        }
        return b0;
    }

    public final void zzz() {
        this.zzg();
        this.zza();
        zzge zzge0 = this.a;
        if(zzge0.a()) {
            if(zzge0.zzf().zzs(null, zzeh.zzX)) {
                Boolean boolean0 = zzge0.zzf().c("google_analytics_deferred_deep_link_enabled");
                if(boolean0 != null && boolean0.booleanValue()) {
                    zzge0.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    zzge0.zzaz().zzp(new zzhl(this));
                }
            }
            zzjy zzjy0 = zzge0.zzt();
            zzjy0.zzg();
            zzjy0.zza();
            zzq zzq0 = zzjy0.g(true);
            zzjy0.a.zzi().zzk();
            zzjy0.j(new T(zzjy0, zzq0, 1));
            this.o = false;
            r r0 = zzge0.zzm();
            r0.zzg();
            String s = r0.d().getString("previous_os_version", null);
            r0.a.zzg().c();
            String s1 = Build.VERSION.RELEASE;
            if(!TextUtils.isEmpty(s1) && !s1.equals(s)) {
                SharedPreferences.Editor sharedPreferences$Editor0 = r0.d().edit();
                sharedPreferences$Editor0.putString("previous_os_version", s1);
                sharedPreferences$Editor0.apply();
            }
            if(!TextUtils.isEmpty(s)) {
                zzge0.zzg().c();
                if(!s.equals(s1)) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("_po", s);
                    this.c("auto", "_ou", bundle0);
                }
            }
        }
    }
}

