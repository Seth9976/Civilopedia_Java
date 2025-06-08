package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbsr {
    public final Object a;
    public final Object b;
    public zzbta c;
    public zzbta d;

    public zzbsr() {
        this.a = new Object();
        this.b = new Object();
    }

    public final zzbta zza(Context context0, zzcfo zzcfo0, zzfhu zzfhu0) {
        synchronized(this.a) {
            if(this.c == null) {
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    context0 = context1;
                }
                this.c = new zzbta(context0, zzcfo0, ((String)zzay.zzc().zzb(zzbhz.zza)), zzfhu0);
            }
            return this.c;
        }
    }

    public final zzbta zzb(Context context0, zzcfo zzcfo0, zzfhu zzfhu0) {
        synchronized(this.b) {
            if(this.d == null) {
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    context0 = context1;
                }
                this.d = new zzbta(context0, zzcfo0, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", zzfhu0);
            }
            return this.d;
        }
    }
}

