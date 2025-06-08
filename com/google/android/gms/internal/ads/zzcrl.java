package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

public final class zzcrl implements Runnable {
    public final zzcrp zza;

    public zzcrl(zzcrp zzcrp0) {
        this.zza = zzcrp0;
    }

    @Override
    public final void run() {
        zzcrp zzcrp0 = this.zza;
        zzcrp0.getClass();
        if(zzt.zzo().zzh().zzO()) {
            String s = zzt.zzo().zzh().zzl();
            if(!zzt.zzs().zzj(zzcrp0.i, s, zzcrp0.j.zza)) {
                zzt.zzo().zzh().zzB(false);
                zzt.zzo().zzh().zzA("");
            }
        }
    }
}

