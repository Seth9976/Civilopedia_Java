package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzexp extends zzbr implements zzo, zzbca {
    public final zzcnf i;
    public final Context j;
    public AtomicBoolean k;
    public final String l;
    public final zzexj m;
    public final zzexh n;
    public final zzcfo o;
    public long p;
    public zzcup q;
    public zzcvo r;

    public zzexp(zzcnf zzcnf0, Context context0, String s, zzexj zzexj0, zzexh zzexh0, zzcfo zzcfo0) {
        this.k = new AtomicBoolean();
        this.p = -1L;
        this.i = zzcnf0;
        this.j = context0;
        this.l = s;
        this.m = zzexj0;
        this.n = zzexh0;
        this.o = zzcfo0;
        zzexh0.zzo(this);
    }

    // 检测为 lambda 实现。
    public final void b(int v) {
        synchronized(this) {
            if(this.k.compareAndSet(false, true)) {
                this.n.zzj();
                zzcup zzcup0 = this.q;
                if(zzcup0 != null) {
                    zzt.zzb().zze(zzcup0);
                }
                long v2 = -1L;
                if(this.r != null) {
                    if(this.p != -1L) {
                        v2 = zzt.zzA().elapsedRealtime() - this.p;
                    }
                    this.r.zze(v2, v);
                }
                this.zzx();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbc0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbf0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(zzbw zzbw0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(zzq zzq0) {
        synchronized(this) {
            Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbz0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcj0) {
        this.n.zzr(zzbcj0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(zzw zzw0) {
        this.m.zzl(zzw0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcg0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdo0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbye0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbiu zzbiu0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzde0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyh0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcar0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(zzff zzff0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() {
        synchronized(this) {
            return this.m.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbca
    public final void zza() {
        this.b(3);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(zzl zzl0) throws RemoteException {
        synchronized(this) {
            boolean z = ((Boolean)zzbjn.zzd.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue();
            if(this.o.zzc < ((int)(((Integer)zzay.zzc().zzb(zzbhz.zziw)))) || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(zzs.zzD(this.j) && zzl0.zzs == null) {
                zzcfi.zzg("Failed to load the ad because app ID is missing.");
                zze zze0 = zzfdc.zzd(4, null, null);
                this.n.zza(zze0);
                return false;
            }
            if(this.zzY()) {
                return false;
            }
            this.k = new AtomicBoolean();
            G5 g50 = new G5();  // 初始化器: Lcom/google/android/gms/internal/ads/zzemv;-><init>()V
            J5 j50 = new J5(this, 0);
            return this.m.zzb(zzl0, this.l, g50, j50);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcd0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        synchronized(this) {
            if(this.r == null) {
                return;
            }
            this.p = zzt.zzA().elapsedRealtime();
            int v1 = this.r.zza();
            if(v1 <= 0) {
                return;
            }
            zzcup zzcup0 = new zzcup(this.i.zzB(), zzt.zzA());
            this.q = zzcup0;
            zzcup0.zzd(v1, () -> this.i.zzA().execute(() -> synchronized(this) {
                if(this.k.compareAndSet(false, true)) {
                    this.n.zzj();
                    zzcup zzcup0 = this.q;
                    if(zzcup0 != null) {
                        zzt.zzb().zze(zzcup0);
                    }
                    long v2 = -1L;
                    if(this.r != null) {
                        if(this.p != -1L) {
                            v2 = zzt.zzA().elapsedRealtime() - this.p;
                        }
                        this.r.zze(v2, 5);
                    }
                    this.zzx();
                }
            }));
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

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        synchronized(this) {
            zzcvo zzcvo0 = this.r;
            if(zzcvo0 != null) {
                zzcvo0.zze(zzt.zzA().elapsedRealtime() - this.p, 1);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int v) {
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    this.b(2);
                    return;
                }
                case 1: {
                    this.b(4);
                    return;
                }
                default: {
                    switch(v - 1) {
                        case 2: {
                            this.b(3);
                            return;
                        }
                        case 3: {
                            this.b(6);
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
            }
        }
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzq zzg() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdh zzk() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdk zzl() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        return null;
    }

    // 检测为 lambda 实现。
    @VisibleForTesting
    public final void zzo() {
        this.i.zzA().execute(() -> synchronized(this) {
            if(this.k.compareAndSet(false, true)) {
                this.n.zzj();
                zzcup zzcup0 = this.q;
                if(zzcup0 != null) {
                    zzt.zzb().zze(zzcup0);
                }
                long v2 = -1L;
                if(this.r != null) {
                    if(this.p != -1L) {
                        v2 = zzt.zzA().elapsedRealtime() - this.p;
                    }
                    this.r.zze(v2, 5);
                }
                this.zzx();
            }
        });
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        synchronized(this) {
        }
        return this.l;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            zzcvo zzcvo0 = this.r;
            if(zzcvo0 != null) {
                zzcvo0.zzV();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(zzl zzl0, zzbi zzbi0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
        }
    }
}

