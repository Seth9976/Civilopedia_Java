package com.google.android.gms.measurement.internal;

import B.a;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.p0;
import i1.O;
import i1.P;
import i1.i;
import i1.p;
import i1.z;
import java.util.concurrent.ConcurrentHashMap;

public final class zziy extends p {
    public volatile zziq c;
    public volatile zziq d;
    public zziq e;
    public final ConcurrentHashMap f;
    public Activity g;
    public volatile boolean h;
    public volatile zziq i;
    public zziq j;
    public boolean k;
    public final Object l;
    public String m;

    public zziy(zzge zzge0) {
        super(zzge0);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    @Override  // i1.p
    public final boolean b() {
        return false;
    }

    public final void c(Activity activity0, zziq zziq0, boolean z) {
        zziq zziq2;
        zziq zziq1 = this.c == null ? this.d : this.c;
        if(zziq0.zzb == null) {
            String s = activity0 == null ? null : this.f(activity0.getClass());
            zziq2 = new zziq(zziq0.zza, s, zziq0.zzc, zziq0.zze, zziq0.zzf);
        }
        else {
            zziq2 = zziq0;
        }
        this.d = this.c;
        this.c = zziq2;
        long v = this.a.zzav().elapsedRealtime();
        this.a.zzaz().zzp(new O(this, zziq2, zziq1, v, z));
    }

    public final void d(zziq zziq0, zziq zziq1, long v, boolean z, Bundle bundle0) {
        this.zzg();
        boolean z1 = false;
        boolean z2 = zziq1 == null || zziq1.zzc != zziq0.zzc || !zzir.zza(zziq1.zzb, zziq0.zzb) || !zzir.zza(zziq1.zza, zziq0.zza);
        if(z && this.e != null) {
            z1 = true;
        }
        zzge zzge0 = this.a;
        if(z2) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            zzln.zzK(zziq0, bundle1, true);
            if(zziq1 != null) {
                String s = zziq1.zza;
                if(s != null) {
                    bundle1.putString("_pn", s);
                }
                String s1 = zziq1.zzb;
                if(s1 != null) {
                    bundle1.putString("_pc", s1);
                }
                bundle1.putLong("_pi", zziq1.zzc);
            }
            if(z1) {
                zzko zzko0 = zzge0.zzu();
                long v1 = v - zzko0.e.j;
                zzko0.e.j = v;
                if(v1 > 0L) {
                    zzge0.zzv().h(bundle1, v1);
                }
            }
            if(!zzge0.zzf().zzu()) {
                bundle1.putLong("_mst", 1L);
            }
            String s2 = zziq0.zze ? "app" : "auto";
            long v2 = zzge0.zzav().currentTimeMillis();
            if(zziq0.zze) {
                long v3 = zziq0.zzf;
                if(v3 != 0L) {
                    v2 = v3;
                }
            }
            zzge0.zzq().d(s2, "_vs", bundle1, v2);
        }
        if(z1) {
            this.e(this.e, true, v);
        }
        this.e = zziq0;
        if(zziq0.zze) {
            this.j = zziq0;
        }
        zzjy zzjy0 = zzge0.zzt();
        zzjy0.zzg();
        zzjy0.zza();
        zzjy0.j(new a(zzjy0, zziq0, 14, false));
    }

    public final void e(zziq zziq0, boolean z, long v) {
        this.a.zzd().zzf(this.a.zzav().elapsedRealtime());
        boolean z1 = zziq0 != null && zziq0.a;
        if(this.a.zzu().e.a(v, z1, z) && zziq0 != null) {
            zziq0.a = false;
        }
    }

    public final String f(Class class0) {
        String s = class0.getCanonicalName();
        if(s == null) {
            return "Activity";
        }
        String[] arr_s = s.split("\\.");
        String s1 = arr_s.length <= 0 ? "" : arr_s[arr_s.length - 1];
        return s1.length() <= 100 ? s1 : s1.substring(0, 100);
    }

    public final zziq g(Activity activity0) {
        Preconditions.checkNotNull(activity0);
        zziq zziq0 = (zziq)this.f.get(activity0);
        if(zziq0 == null) {
            zziq zziq1 = new zziq(null, this.f(activity0.getClass()), this.a.zzv().zzq());
            this.f.put(activity0, zziq1);
            zziq0 = zziq1;
        }
        return this.i == null ? zziq0 : this.i;
    }

    public final zziq zzi() {
        return this.c;
    }

    public final zziq zzj(boolean z) {
        this.zza();
        this.zzg();
        if(!z) {
            return this.e;
        }
        return this.e == null ? this.j : this.e;
    }

    public final void zzr(Activity activity0, Bundle bundle0) {
        if(!this.a.zzf().zzu()) {
            return;
        }
        if(bundle0 == null) {
            return;
        }
        Bundle bundle1 = bundle0.getBundle("com.google.app_measurement.screen_service");
        if(bundle1 == null) {
            return;
        }
        zziq zziq0 = new zziq(bundle1.getString("name"), bundle1.getString("referrer_name"), bundle1.getLong("id"));
        this.f.put(activity0, zziq0);
    }

    public final void zzs(Activity activity0) {
        synchronized(this.l) {
            if(activity0 == this.g) {
                this.g = null;
            }
        }
        if(!this.a.zzf().zzu()) {
            return;
        }
        this.f.remove(activity0);
    }

    public final void zzt(Activity activity0) {
        synchronized(this.l) {
            this.k = false;
            this.h = true;
        }
        long v = this.a.zzav().elapsedRealtime();
        if(!this.a.zzf().zzu()) {
            this.c = null;
            this.a.zzaz().zzp(new i(this, v, 1));
            return;
        }
        zziq zziq0 = this.g(activity0);
        this.d = this.c;
        this.c = null;
        this.a.zzaz().zzp(new p0(this, zziq0, v, 1));
    }

    public final void zzu(Activity activity0) {
        synchronized(this.l) {
            this.k = true;
            if(activity0 != this.g) {
                synchronized(this.l) {
                    this.g = activity0;
                    this.h = false;
                }
                if(this.a.zzf().zzu()) {
                    this.i = null;
                    this.a.zzaz().zzp(new P(this, 1));
                }
            }
        }
        if(!this.a.zzf().zzu()) {
            this.c = this.i;
            this.a.zzaz().zzp(new P(this, 0));
            return;
        }
        this.c(activity0, this.g(activity0), false);
        zzd zzd0 = this.a.zzd();
        long v1 = zzd0.a.zzav().elapsedRealtime();
        zzd0.a.zzaz().zzp(new i(zzd0, v1, 0));
    }

    public final void zzv(Activity activity0, Bundle bundle0) {
        if(!this.a.zzf().zzu()) {
            return;
        }
        if(bundle0 == null) {
            return;
        }
        zziq zziq0 = (zziq)this.f.get(activity0);
        if(zziq0 == null) {
            return;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putLong("id", zziq0.zzc);
        bundle1.putString("name", zziq0.zza);
        bundle1.putString("referrer_name", zziq0.zzb);
        bundle0.putBundle("com.google.app_measurement.screen_service", bundle1);
    }

    @Deprecated
    public final void zzw(Activity activity0, String s, String s1) {
        if(!this.a.zzf().zzu()) {
            this.a.zzay().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zziq zziq0 = this.c;
        if(zziq0 == null) {
            this.a.zzay().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if(this.f.get(activity0) == null) {
            this.a.zzay().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if(s1 == null) {
            s1 = this.f(activity0.getClass());
        }
        if(zzir.zza(zziq0.zzb, s1) && zzir.zza(zziq0.zza, s)) {
            this.a.zzay().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if(s != null && (s.length() <= 0 || s.length() > 100)) {
            this.a.zzay().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", s.length());
            return;
        }
        if(s1 != null && (s1.length() <= 0 || s1.length() > 100)) {
            this.a.zzay().zzl().zzb("Invalid class name length in setCurrentScreen. Length", s1.length());
            return;
        }
        this.a.zzay().zzj().zzc("Setting current screen to name, class", (s == null ? "null" : s), s1);
        zziq zziq1 = new zziq(s, s1, this.a.zzv().zzq());
        this.f.put(activity0, zziq1);
        this.c(activity0, zziq1, true);
    }

    public final void zzx(Bundle bundle0, long v) {
        String s;
        String s2;
        synchronized(this.l) {
            if(!this.k) {
                this.a.zzay().zzl().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            s = bundle0.getString("screen_name");
            if(s != null && (s.length() <= 0 || s.length() > 100)) {
                this.a.zzay().zzl().zzb("Invalid screen name length for screen view. Length", s.length());
                return;
            }
            String s1 = bundle0.getString("screen_class");
            if(s1 != null && (s1.length() <= 0 || s1.length() > 100)) {
                this.a.zzay().zzl().zzb("Invalid screen class length for screen view. Length", s1.length());
                return;
            }
            if(s1 == null) {
                s2 = this.g == null ? "Activity" : this.f(this.g.getClass());
            }
            else {
                s2 = s1;
            }
            zziq zziq0 = this.c;
            if(this.h && zziq0 != null) {
                this.h = false;
                if(zzir.zza(zziq0.zzb, s2) && zzir.zza(zziq0.zza, s)) {
                    this.a.zzay().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
        }
        this.a.zzay().zzj().zzc("Logging screen view with name, class", (s == null ? "null" : s), (s2 == null ? "null" : s2));
        zziq zziq1 = this.c == null ? this.d : this.c;
        zziq zziq2 = new zziq(s, s2, this.a.zzv().zzq(), true, v);
        this.c = zziq2;
        this.d = zziq1;
        this.i = zziq2;
        long v2 = this.a.zzav().elapsedRealtime();
        this.a.zzaz().zzp(new z(this, bundle0, zziq2, zziq1, v2, 2));
    }

    public final void zzy(String s, zziq zziq0) {
        this.zzg();
        synchronized(this) {
            if(this.m == null || this.m.equals(s) || zziq0 != null) {
                this.m = s;
            }
        }
    }
}

