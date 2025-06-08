package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzcud implements zzo, zzban, zzdcn, zzdco {
    public final zzcty i;
    public final zzctz j;
    public final HashSet k;
    public final zzbtm l;
    public final Executor m;
    public final Clock n;
    public final AtomicBoolean o;
    public final zzcuc p;
    public boolean q;
    public WeakReference r;

    public zzcud(zzbtj zzbtj0, zzctz zzctz0, Executor executor0, zzcty zzcty0, Clock clock0) {
        this.k = new HashSet();
        this.o = new AtomicBoolean(false);
        this.p = new zzcuc();
        this.q = false;
        this.r = new WeakReference(this);
        this.i = zzcty0;
        this.l = zzbtj0.zza("google.afma.activeView.handleUpdate", zzbsx.zza, zzbsx.zza);
        this.j = zzctz0;
        this.m = executor0;
        this.n = clock0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        synchronized(this) {
            this.p.zzb = false;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(Context context0) {
        zzcty zzcty0;
        synchronized(this) {
            this.p.zze = "u";
            this.zzg();
            Iterator iterator0 = this.k.iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                zzcty0 = this.i;
                if(!z) {
                    break;
                }
                Object object0 = iterator0.next();
                zzcty0.zzf(((zzcli)object0));
            }
            zzcty0.zze();
            this.q = true;
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        synchronized(this) {
            this.p.zzb = true;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(Context context0) {
        synchronized(this) {
            this.p.zzb = true;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(Context context0) {
        synchronized(this) {
            this.p.zzb = false;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbam0) {
        synchronized(this) {
            this.p.zza = zzbam0.zzj;
            this.p.zzf = zzbam0;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int v) {
    }

    public final void zzg() {
        synchronized(this) {
            if(this.r.get() != null) {
                if(!this.q && this.o.get()) {
                    try {
                        this.p.zzd = this.n.elapsedRealtime();
                        JSONObject jSONObject0 = this.j.zza(this.p);
                        for(Object object0: this.k) {
                            zzcub zzcub0 = new zzcub(((zzcli)object0), jSONObject0);
                            this.m.execute(zzcub0);
                        }
                        zzcfy.zzb(this.l.zzb(jSONObject0), "ActiveViewListener.callActiveViewJs");
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    zze.zzb("Failed to call ActiveViewJS", exception0);
                    return;
                }
                return;
            }
            this.zzj();
        }
    }

    public final void zzh(zzcli zzcli0) {
        synchronized(this) {
            this.k.add(zzcli0);
            this.i.zzd(zzcli0);
        }
    }

    public final void zzi(Object object0) {
        this.r = new WeakReference(object0);
    }

    public final void zzj() {
        zzcty zzcty0;
        synchronized(this) {
            Iterator iterator0 = this.k.iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                zzcty0 = this.i;
                if(!z) {
                    break;
                }
                Object object0 = iterator0.next();
                zzcty0.zzf(((zzcli)object0));
            }
            zzcty0.zze();
            this.q = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        synchronized(this) {
            if(this.o.compareAndSet(false, true)) {
                this.i.zzc(this);
                this.zzg();
            }
        }
    }
}

