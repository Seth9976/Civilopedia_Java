package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
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
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzewh extends zzbr implements zzaa, zzbca, zzdds {
    public final zzcnf i;
    public final Context j;
    public final FrameLayout k;
    public AtomicBoolean l;
    public final String m;
    public final zzewb n;
    public final zzexh o;
    public final zzcfo p;
    public long q;
    public zzcup r;
    public zzcve s;

    public zzewh(zzcnf zzcnf0, Context context0, String s, zzewb zzewb0, zzexh zzexh0, zzcfo zzcfo0) {
        this.l = new AtomicBoolean();
        this.q = -1L;
        this.k = new FrameLayout(context0);
        this.i = zzcnf0;
        this.j = context0;
        this.m = s;
        this.n = zzewb0;
        this.o = zzexh0;
        zzexh0.zzn(this);
        this.p = zzcfo0;
    }

    // 检测为 lambda 实现。
    public final void b(int v) {
        synchronized(this) {
            if(this.l.compareAndSet(false, true)) {
                zzcve zzcve0 = this.s;
                if(zzcve0 != null && zzcve0.zzj() != null) {
                    this.o.zzt(zzcve0.zzj());
                }
                this.o.zzj();
                this.k.removeAllViews();
                zzcup zzcup0 = this.r;
                if(zzcup0 != null) {
                    zzt.zzb().zze(zzcup0);
                }
                long v2 = -1L;
                if(this.s != null) {
                    if(this.q != -1L) {
                        v2 = zzt.zzA().elapsedRealtime() - this.q;
                    }
                    this.s.zzi(v2, v);
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
        this.o.zzr(zzbcj0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(zzw zzw0) {
        this.n.zzl(zzw0);
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
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() {
        synchronized(this) {
            return this.n.zza();
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
            if(this.p.zzc < ((int)(((Integer)zzay.zzc().zzb(zzbhz.zziw)))) || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(zzs.zzD(this.j) && zzl0.zzs == null) {
                zzcfi.zzg("Failed to load the ad because app ID is missing.");
                zze zze0 = zzfdc.zzd(4, null, null);
                this.o.zza(zze0);
                return false;
            }
            if(this.zzY()) {
                return false;
            }
            this.l = new AtomicBoolean();
            G5 g50 = new G5();  // 初始化器: Lcom/google/android/gms/internal/ads/zzemv;-><init>()V
            E9 e90 = new E9(this, 29);
            return this.n.zzb(zzl0, this.m, g50, e90);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcd0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzbJ() {
        this.b(4);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzq zzg() {
        synchronized(this) {
            Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
            zzcve zzcve0 = this.s;
            if(zzcve0 != null) {
                List list0 = Collections.singletonList(zzcve0.zzc());
                return zzfch.zza(this.j, list0);
            }
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzh() {
        if(this.s == null) {
            return;
        }
        this.q = zzt.zzA().elapsedRealtime();
        int v = this.s.zza();
        if(v <= 0) {
            return;
        }
        zzcup zzcup0 = new zzcup(this.i.zzB(), zzt.zzA());
        this.r = zzcup0;
        zzcup0.zzd(v, () -> {
            if(zzcfb.zzt()) {
                this.b(5);
                return;
            }
            this.i.zzA().execute(() -> synchronized(this) {
                if(this.l.compareAndSet(false, true)) {
                    zzcve zzcve0 = this.s;
                    if(zzcve0 != null && zzcve0.zzj() != null) {
                        this.o.zzt(zzcve0.zzj());
                    }
                    this.o.zzj();
                    this.k.removeAllViews();
                    zzcup zzcup0 = this.r;
                    if(zzcup0 != null) {
                        zzt.zzb().zze(zzcup0);
                    }
                    long v2 = -1L;
                    if(this.s != null) {
                        if(this.q != -1L) {
                            v2 = zzt.zzA().elapsedRealtime() - this.q;
                        }
                        this.s.zzi(v2, 5);
                    }
                    this.zzx();
                }
            });
        });
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
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.k);
    }

    // 检测为 lambda 实现。
    @VisibleForTesting
    public final void zzp() {
        if(zzcfb.zzt()) {
            this.b(5);
            return;
        }
        this.i.zzA().execute(() -> synchronized(this) {
            if(this.l.compareAndSet(false, true)) {
                zzcve zzcve0 = this.s;
                if(zzcve0 != null && zzcve0.zzj() != null) {
                    this.o.zzt(zzcve0.zzj());
                }
                this.o.zzj();
                this.k.removeAllViews();
                zzcup zzcup0 = this.r;
                if(zzcup0 != null) {
                    zzt.zzb().zze(zzcup0);
                }
                long v2 = -1L;
                if(this.s != null) {
                    if(this.q != -1L) {
                        v2 = zzt.zzA().elapsedRealtime() - this.q;
                    }
                    this.s.zzi(v2, 5);
                }
                this.zzx();
            }
        });
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        synchronized(this) {
        }
        return this.m;
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
            zzcve zzcve0 = this.s;
            if(zzcve0 != null) {
                zzcve0.zzV();
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

