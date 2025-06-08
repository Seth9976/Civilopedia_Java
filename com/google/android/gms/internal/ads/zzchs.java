package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

public final class zzchs {
    public final Context a;
    public final String b;
    public final zzcfo c;
    public final zzbil d;
    public final zzbio e;
    public final zzbf f;
    public final long[] g;
    public final String[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public zzcgx n;
    public boolean o;
    public boolean p;
    public long q;

    public zzchs(Context context0, zzcfo zzcfo0, String s, zzbio zzbio0, zzbil zzbil0) {
        zzbd zzbd0 = new zzbd();
        zzbd0.zza("min_1", 4.900000E-324, 1.0);
        zzbd0.zza("1_5", 1.0, 5.0);
        zzbd0.zza("5_10", 5.0, 10.0);
        zzbd0.zza("10_20", 10.0, 20.0);
        zzbd0.zza("20_30", 20.0, 30.0);
        zzbd0.zza("30_max", 30.0, 1.797693E+308);
        this.f = zzbd0.zzb();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context0;
        this.c = zzcfo0;
        this.b = s;
        this.e = zzbio0;
        this.d = zzbil0;
        String s1 = (String)zzay.zzc().zzb(zzbhz.zzy);
        if(s1 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] arr_s = TextUtils.split(s1, ",");
        this.h = new String[arr_s.length];
        this.g = new long[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            try {
                this.g[v] = Long.parseLong(arr_s[v]);
            }
            catch(NumberFormatException numberFormatException0) {
                zzcfi.zzk("Unable to parse frame hash target time number.", numberFormatException0);
                this.g[v] = -1L;
            }
        }
    }

    public final void zza(zzcgx zzcgx0) {
        zzbig.zza(this.e, this.d, new String[]{"vpc2"});
        this.i = true;
        String s = zzcgx0.zzj();
        this.e.zzd("vpn", s);
        this.n = zzcgx0;
    }

    public final void zzb() {
        if(this.i && !this.j) {
            zzbig.zza(this.e, this.d, new String[]{"vfr2"});
            this.j = true;
        }
    }

    public final void zzc() {
        this.m = true;
        if(this.j && !this.k) {
            zzbig.zza(this.e, this.d, new String[]{"vfp2"});
            this.k = true;
        }
    }

    public final void zzd() {
        if(((Boolean)zzbkd.zza.zze()).booleanValue() && !this.o) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("type", "native-player-metrics");
            bundle0.putString("request", this.b);
            bundle0.putString("player", this.n.zzj());
            for(Object object0: this.f.zza()) {
                bundle0.putString("fps_c_" + ((zzbc)object0).zza, Integer.toString(((zzbc)object0).zze));
                bundle0.putString("fps_p_" + ((zzbc)object0).zza, Double.toString(((zzbc)object0).zzd));
            }
            for(int v = 0; true; ++v) {
                long[] arr_v = this.g;
                if(v >= arr_v.length) {
                    break;
                }
                String s = this.h[v];
                if(s != null) {
                    bundle0.putString("fh_" + ((long)arr_v[v]).toString(), s);
                }
            }
            String s1 = this.c.zza;
            bundle0.putString("device", zzs.zzq());
            bundle0.putString("eids", TextUtils.join(",", zzbhz.zza()));
            zzk zzk0 = new zzk(this.a, s1);
            zzcfb.zzv(this.a, s1, "gmob-apps", bundle0, true, zzk0);
            this.o = true;
        }
    }

    public final void zze() {
        this.m = false;
    }

    public final void zzf(zzcgx zzcgx0) {
        if(this.k && !this.l) {
            if(zze.zzc() && !this.l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            zzbig.zza(this.e, this.d, new String[]{"vff2"});
            this.l = true;
        }
        long v = zzt.zzA().nanoTime();
        if(this.m && this.p && this.q != -1L) {
            long v1 = TimeUnit.SECONDS.toNanos(1L);
            this.f.zzb(((double)v1) / ((double)(v - this.q)));
        }
        this.p = this.m;
        this.q = v;
        long v2 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzz)));
        long v3 = (long)zzcgx0.zza();
        for(int v4 = 0; true; ++v4) {
            String[] arr_s = this.h;
            if(v4 >= arr_s.length) {
                break;
            }
            if(arr_s[v4] == null && v2 > Math.abs(v3 - this.g[v4])) {
                Bitmap bitmap0 = zzcgx0.getBitmap(8, 8);
                long v6 = 0L;
                for(int v7 = 0; v7 < 8; ++v7) {
                    int v8 = 0;
                    for(long v5 = 0x3FL; v8 < 8; --v5) {
                        int v9 = bitmap0.getPixel(v8, v7);
                        int v10 = Color.blue(v9);
                        int v11 = Color.red(v9);
                        v6 |= (Color.green(v9) + (v11 + v10) <= 0x80 ? 0L : 1L) << ((int)v5);
                        ++v8;
                    }
                }
                arr_s[v4] = String.format("%016X", v6);
                return;
            }
        }
    }
}

