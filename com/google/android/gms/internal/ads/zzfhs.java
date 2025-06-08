package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzfhs implements Runnable {
    public final ArrayList i;
    public final zzfhu j;
    public String k;
    public String l;
    public zzfbw m;
    public zze n;
    public ScheduledFuture o;
    public int p;

    public zzfhs(zzfhu zzfhu0) {
        this.i = new ArrayList();
        this.p = 2;
        this.j = zzfhu0;
    }

    @Override
    public final void run() {
        synchronized(this) {
            this.zzg();
        }
    }

    public final zzfhs zza(zzfhh zzfhh0) {
        synchronized(this) {
            if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
                zzfhh0.zzg();
                this.i.add(zzfhh0);
                ScheduledFuture scheduledFuture0 = this.o;
                if(scheduledFuture0 != null) {
                    scheduledFuture0.cancel(false);
                }
                long v1 = (long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhq)))));
                this.o = zzcfv.zzd.schedule(this, v1, TimeUnit.MILLISECONDS);
            }
            return this;
        }
    }

    public final zzfhs zzb(String s) {
        synchronized(this) {
            if(((Boolean)zzbji.zzc.zze()).booleanValue() && zzfhr.zze(s)) {
                this.k = s;
            }
            return this;
        }
    }

    public final zzfhs zzc(zze zze0) {
        synchronized(this) {
            if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
                this.n = zze0;
            }
            return this;
        }
    }

    public final zzfhs zzd(ArrayList arrayList0) {
        synchronized(this) {
            if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
                if(arrayList0.contains("banner") || arrayList0.contains(AdFormat.BANNER.name())) {
                    this.p = 3;
                }
                else if(arrayList0.contains("interstitial") || arrayList0.contains(AdFormat.INTERSTITIAL.name())) {
                    this.p = 4;
                }
                else if(arrayList0.contains("native") || arrayList0.contains(AdFormat.NATIVE.name())) {
                    this.p = 8;
                }
                else if(arrayList0.contains("rewarded") || arrayList0.contains(AdFormat.REWARDED.name())) {
                    this.p = 5;
                }
                else if(arrayList0.contains("app_open_ad")) {
                    this.p = 7;
                }
                else if(arrayList0.contains("rewarded_interstitial") || arrayList0.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.p = 6;
                }
            }
            return this;
        }
    }

    public final zzfhs zze(String s) {
        synchronized(this) {
            if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
                this.l = s;
            }
            return this;
        }
    }

    public final zzfhs zzf(zzfbw zzfbw0) {
        synchronized(this) {
            if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
                this.m = zzfbw0;
            }
            return this;
        }
    }

    public final void zzg() {
        synchronized(this) {
            if(!((Boolean)zzbji.zzc.zze()).booleanValue()) {
                return;
            }
            ScheduledFuture scheduledFuture0 = this.o;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
            }
            for(Object object0: this.i) {
                zzfhh zzfhh0 = (zzfhh)object0;
                int v1 = this.p;
                if(v1 != 2) {
                    zzfhh0.zzk(v1);
                }
                if(!TextUtils.isEmpty(this.k)) {
                    zzfhh0.zzd(this.k);
                }
                if(!TextUtils.isEmpty(this.l) && !zzfhh0.zzi()) {
                    zzfhh0.zzc(this.l);
                }
                zzfbw zzfbw0 = this.m;
                if(zzfbw0 == null) {
                    zze zze0 = this.n;
                    if(zze0 != null) {
                        zzfhh0.zza(zze0);
                    }
                }
                else {
                    zzfhh0.zzb(zzfbw0);
                }
                zzfhl zzfhl0 = zzfhh0.zzj();
                this.j.zzb(zzfhl0);
            }
            this.i.clear();
        }
    }

    public final zzfhs zzh(int v) {
        synchronized(this) {
            if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
                this.p = v;
            }
            return this;
        }
    }
}

