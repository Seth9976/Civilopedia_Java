package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

public final class zzepe implements Callable {
    public final zzepf zza;

    public zzepe(zzepf zzepf0) {
        this.zza = zzepf0;
    }

    @Override
    public final Object call() {
        AudioManager audioManager0 = (AudioManager)this.zza.b.getSystemService("audio");
        int v = audioManager0.getMode();
        boolean z = audioManager0.isMusicActive();
        boolean z1 = audioManager0.isSpeakerphoneOn();
        int v1 = audioManager0.getStreamVolume(3);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zziq)).booleanValue()) {
            int v2 = audioManager0.getStreamMaxVolume(3);
            return new zzepg(v, z, z1, v1, zzt.zzq().zzi(audioManager0), v2, audioManager0.getRingerMode(), audioManager0.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
        }
        return new zzepg(v, z, z1, v1, -1, -1, audioManager0.getRingerMode(), audioManager0.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
    }
}

