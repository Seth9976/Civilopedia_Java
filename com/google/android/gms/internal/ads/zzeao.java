package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class zzeao implements zzebm {
    public final zzdzp a;
    public final zzfvm b;
    public final zzfcd c;
    public final ScheduledExecutorService d;
    public final zzeds e;
    public final zzfhs f;
    public final Context g;
    public static final Pattern h;

    static {
        zzeao.h = Pattern.compile("Received error HTTP response code: (.*)");
    }

    public zzeao(Context context0, zzfcd zzfcd0, zzdzp zzdzp0, zzfvm zzfvm0, ScheduledExecutorService scheduledExecutorService0, zzeds zzeds0, zzfhs zzfhs0) {
        this.g = context0;
        this.c = zzfcd0;
        this.a = zzdzp0;
        this.b = zzfvm0;
        this.d = scheduledExecutorService0;
        this.e = zzeds0;
        this.f = zzfhs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzebm
    public final zzfvl zzb(zzbzv zzbzv0) {
        zzfvl zzfvl0 = this.a.zzb(zzbzv0);
        zzfhh zzfhh0 = zzfhg.zza(this.g, 11);
        zzfhr.zzd(zzfvl0, zzfhh0);
        zzfvl zzfvl1 = zzfvc.zzn(zzfvl0, new zzeal(this), this.b);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzex)).booleanValue()) {
            zzfvl1 = zzfvc.zzg(zzfvc.zzo(zzfvl1, ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzey)))))), TimeUnit.SECONDS, this.d), TimeoutException.class, zzeam.zza, zzcfv.zzf);
        }
        zzfhr.zza(zzfvl1, this.f, zzfhh0);
        zzfvc.zzr(zzfvl1, new E9(this, 21), zzcfv.zzf);
        return zzfvl1;
    }
}

