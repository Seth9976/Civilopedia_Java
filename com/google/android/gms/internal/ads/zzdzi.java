package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzdzi implements zzo, zzcmt {
    public final Context i;
    public final zzcfo j;
    public zzdzb k;
    public zzcli l;
    public boolean m;
    public boolean n;
    public long o;
    public zzcy p;
    public boolean q;

    public zzdzi(Context context0, zzcfo zzcfo0) {
        this.i = context0;
        this.j = zzcfo0;
    }

    public final void a() {
        synchronized(this) {
            if(this.m && this.n) {
                zzdzh zzdzh0 = new zzdzh(this);
                zzcfv.zze.execute(zzdzh0);
            }
        }
    }

    public final boolean b(zzcy zzcy0) {
        synchronized(this) {
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
                zzcfi.zzj("Ad inspector had an internal error.");
                try {
                    zzcy0.zze(zzfdc.zzd(16, null, null));
                }
                catch(RemoteException unused_ex) {
                }
                return false;
            }
            if(this.k == null) {
                zzcfi.zzj("Ad inspector had an internal error.");
                try {
                    zzcy0.zze(zzfdc.zzd(16, null, null));
                }
                catch(RemoteException unused_ex) {
                }
                return false;
            }
            if(!this.m && !this.n && zzt.zzA().currentTimeMillis() >= this.o + ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhy))))))) {
                return true;
            }
            zzcfi.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzcy0.zze(zzfdc.zzd(19, null, null));
            }
            catch(RemoteException unused_ex) {
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcmt
    public final void zza(boolean z) {
        synchronized(this) {
            if(z) {
                zze.zza("Ad inspector loaded.");
                this.m = true;
                this.a();
                return;
            }
            zzcfi.zzj("Ad inspector failed to load.");
            zzcy zzcy0 = this.p;
            if(zzcy0 != null) {
                try {
                    zzcy0.zze(zzfdc.zzd(17, null, null));
                }
                catch(RemoteException unused_ex) {
                }
            }
            this.q = true;
            this.l.destroy();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        synchronized(this) {
            this.n = true;
            this.a();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int v) {
        synchronized(this) {
            this.l.destroy();
            if(!this.q) {
                zze.zza("Inspector closed.");
                zzcy zzcy0 = this.p;
                if(zzcy0 != null) {
                    try {
                        zzcy0.zze(null);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
            }
            this.n = false;
            this.m = false;
            this.o = 0L;
            this.q = false;
            this.p = null;
        }
    }

    public final void zzg(zzdzb zzdzb0) {
        this.k = zzdzb0;
    }

    public final void zzi(zzcy zzcy0, zzbon zzbon0) {
        zzcli zzcli0;
        synchronized(this) {
            if(!this.b(zzcy0)) {
                return;
            }
            try {
                zzcmx zzcmx0 = zzcmx.zza();
                zzbdm zzbdm0 = zzbdm.zza();
                zzcli0 = zzclu.zza(this.i, zzcmx0, "", false, false, null, null, this.j, null, null, null, zzbdm0, null, null);
                this.l = zzcli0;
            }
            catch(zzclt zzclt0) {
                zzcfi.zzk("Failed to obtain a web view for the ad inspector", zzclt0);
                try {
                    zzcy0.zze(zzfdc.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                }
                catch(RemoteException unused_ex) {
                }
                return;
            }
            zzcmv zzcmv0 = zzcli0.zzP();
            if(zzcmv0 == null) {
                zzcfi.zzj("Failed to obtain a web view for the ad inspector");
                try {
                    zzcy0.zze(zzfdc.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                }
                catch(RemoteException unused_ex) {
                }
                return;
            }
            this.p = zzcy0;
            zzcmv0.zzL(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbon0, null);
            zzcmv0.zzz(this);
            this.l.loadUrl(((String)zzay.zzc().zzb(zzbhz.zzhw)));
            AdOverlayInfoParcel adOverlayInfoParcel0 = new AdOverlayInfoParcel(this, this.l, 1, this.j);
            zzm.zza(this.i, adOverlayInfoParcel0, true);
            this.o = zzt.zzA().currentTimeMillis();
        }
    }
}

