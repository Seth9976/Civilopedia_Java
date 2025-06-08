package com.google.android.gms.internal.ads;

public final class zzfih implements Runnable {
    public final zzfii zza;
    public final String zzb;
    public final zzfhs zzc;

    public zzfih(zzfii zzfii0, String s, zzfhs zzfhs0) {
        this.zza = zzfii0;
        this.zzb = s;
        this.zzc = zzfhs0;
    }

    @Override
    public final void run() {
        zzfii zzfii0 = this.zza;
        zzfhs zzfhs0 = this.zzc;
        zzfhh zzfhh0 = zzfhg.zza(zzfii0.a, 14);
        zzfhh0.zzf();
        zzfhh0.zze(zzfii0.c.zza(this.zzb));
        if(zzfhs0 == null) {
            zzfhl zzfhl0 = zzfhh0.zzj();
            zzfii0.d.zzb(zzfhl0);
            return;
        }
        zzfhs0.zza(zzfhh0);
        zzfhs0.zzg();
    }
}

