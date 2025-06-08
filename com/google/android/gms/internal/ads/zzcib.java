package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzcib implements Runnable {
    public final zzcij zza;

    public zzcib(zzcij zzcij0) {
        this.zza = zzcij0;
    }

    @Override
    public final void run() {
        float f = this.zza.j.zza();
        zzchi zzchi0 = this.zza.p;
        if(zzchi0 != null) {
            try {
                zzchi0.zzP(f, false);
            }
            catch(IOException iOException0) {
                zzcfi.zzk("", iOException0);
            }
            return;
        }
        zzcfi.zzj("Trying to set volume before player is initialized.");
    }
}

