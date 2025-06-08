package com.google.android.gms.internal.ads;

public final class zzfgr implements Runnable {
    public final m6 zza;

    public zzfgr(m6 m60) {
        this.zza = m60;
    }

    @Override
    public final void run() {
        m6 m60 = this.zza;
        while(!m60.b.isEmpty()) {
            zzfgo zzfgo0 = (zzfgo)m60.b.remove();
            m60.a.zzb(zzfgo0);
        }
    }
}

