package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

public final class zzces {
    public long a;
    public long b;
    public int c;
    public int d;
    public long e;
    public final Object f;
    public final String g;
    public final zzg h;
    public int i;
    public int j;

    public zzces(String s, zzg zzg0) {
        this.a = -1L;
        this.b = -1L;
        this.c = -1;
        this.d = -1;
        this.e = 0L;
        this.f = new Object();
        this.i = 0;
        this.j = 0;
        this.g = s;
        this.h = zzg0;
    }

    public final void a() {
        if(((Boolean)zzbjv.zza.zze()).booleanValue()) {
            synchronized(this.f) {
                --this.c;
                --this.d;
            }
        }
    }

    public final Bundle zza(Context context0, String s) {
        synchronized(this.f) {
            Bundle bundle0 = new Bundle();
            if(!this.h.zzP()) {
                bundle0.putString("session_id", this.g);
            }
            bundle0.putLong("basets", this.b);
            bundle0.putLong("currts", this.a);
            bundle0.putString("seq_num", s);
            bundle0.putInt("preqs", this.c);
            bundle0.putInt("preqs_in_session", this.d);
            bundle0.putLong("time_in_session", this.e);
            bundle0.putInt("pclick", this.i);
            bundle0.putInt("pimp", this.j);
            Context context1 = zzcaj.zza(context0);
            int v1 = context1.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if(v1 == 0) {
                zzcfi.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            }
            else {
                ComponentName componentName0 = new ComponentName("com.spears.civilopedia", "com.google.android.gms.ads.AdActivity");
                try {
                    if(v1 == context1.getPackageManager().getActivityInfo(componentName0, 0).theme) {
                        z = true;
                    }
                    else {
                        zzcfi.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    zzcfi.zzj("Fail to fetch AdActivity theme");
                    zzcfi.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle0.putBoolean("support_transparent_background", z);
            return bundle0;
        }
    }

    public final void zzb() {
        synchronized(this.f) {
            ++this.i;
        }
    }

    public final void zzc() {
        synchronized(this.f) {
            ++this.j;
        }
    }

    public final void zzd() {
        this.a();
    }

    public final void zze() {
        this.a();
    }

    public final void zzf(zzl zzl0, long v) {
        synchronized(this.f) {
            long v2 = this.h.zzd();
            long v3 = zzt.zzA().currentTimeMillis();
            if(this.b == -1L) {
                this.d = v3 - v2 > ((long)(((Long)zzay.zzc().zzb(zzbhz.zzaN)))) ? -1 : this.h.zzc();
                this.b = v;
            }
            this.a = v;
            if(zzl0.zzc != null && zzl0.zzc.getInt("gw", 2) == 1) {
                return;
            }
            ++this.c;
            int v4 = this.d + 1;
            this.d = v4;
            if(v4 == 0) {
                this.e = 0L;
                this.h.zzD(v3);
            }
            else {
                this.e = v3 - this.h.zze();
            }
        }
    }
}

