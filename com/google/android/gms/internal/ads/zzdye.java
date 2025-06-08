package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;

public final class zzdye implements Runnable {
    public final zzdyj zza;
    public final zzfcy zzb;
    public final zzbqk zzc;
    public final List zzd;
    public final String zze;

    public zzdye(zzdyj zzdyj0, zzfcy zzfcy0, zzbqk zzbqk0, List list0, String s) {
        this.zza = zzdyj0;
        this.zzb = zzfcy0;
        this.zzc = zzbqk0;
        this.zzd = list0;
        this.zze = s;
    }

    @Override
    public final void run() {
        zzdyj zzdyj0 = this.zza;
        zzfcy zzfcy0 = this.zzb;
        zzbqk zzbqk0 = this.zzc;
        List list0 = this.zzd;
        String s = this.zze;
        zzdyj0.getClass();
        try {
            Context context0 = (Context)zzdyj0.g.get();
            if(context0 == null) {
                context0 = zzdyj0.f;
            }
            zzfcy0.zzi(context0, zzbqk0, list0);
        }
        catch(zzfci unused_ex) {
            try {
                zzbqk0.zze("Failed to initialize adapter. " + s + " does not implement the initialize() method.");
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("", remoteException0);
            }
        }
    }
}

