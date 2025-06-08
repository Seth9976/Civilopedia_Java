package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.HashSet;
import java.util.concurrent.Executor;

public final class zzevr implements zzgqu {
    public static zzetj zza(Context context0, zzcef zzcef0, zzceg zzceg0, Object object0, zzeub zzeub0, zzeve zzeve0, zzgqo zzgqo0, zzgqo zzgqo1, zzgqo zzgqo2, zzgqo zzgqo3, zzgqo zzgqo4, zzgqo zzgqo5, zzgqo zzgqo6, zzgqo zzgqo7, zzgqo zzgqo8, Executor executor0, zzfhs zzfhs0, zzdwh zzdwh0) {
        HashSet hashSet0 = new HashSet();
        hashSet0.add(((F5)object0));
        hashSet0.add(zzeub0);
        hashSet0.add(zzeve0);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeI)).booleanValue()) {
            hashSet0.add(((zzetg)zzgqo0.zzb()));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeJ)).booleanValue()) {
            hashSet0.add(((zzetg)zzgqo1.zzb()));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeK)).booleanValue()) {
            hashSet0.add(((zzetg)zzgqo2.zzb()));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeL)).booleanValue()) {
            hashSet0.add(((zzetg)zzgqo3.zzb()));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeP)).booleanValue()) {
            hashSet0.add(((zzetg)zzgqo5.zzb()));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeQ)).booleanValue()) {
            hashSet0.add(((zzetg)zzgqo6.zzb()));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcq)).booleanValue()) {
            hashSet0.add(((zzetg)zzgqo8.zzb()));
        }
        return new zzetj(context0, executor0, hashSet0, zzfhs0, zzdwh0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        throw null;
    }
}

