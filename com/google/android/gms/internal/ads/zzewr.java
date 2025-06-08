package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;

public abstract class zzewr implements zzemx {
    public final Context a;
    public final Executor b;
    public final zzcnf c;
    public final zzexh d;
    public final zzeza e;
    public final zzcfo f;
    public final FrameLayout g;
    public final zzfhu h;
    public final zzfcb i;
    public zzfvl j;

    public zzewr(Context context0, Executor executor0, zzcnf zzcnf0, zzeza zzeza0, zzexh zzexh0, zzfcb zzfcb0, zzcfo zzcfo0) {
        this.a = context0;
        this.b = executor0;
        this.c = zzcnf0;
        this.e = zzeza0;
        this.d = zzexh0;
        this.i = zzfcb0;
        this.f = zzcfo0;
        this.g = new FrameLayout(context0);
        this.h = zzcnf0.zzy();
    }

    public abstract zzdbb a(zzdbf arg1, zzdhf arg2);

    public final zzdbb b(zzeyy zzeyy0) {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzgQ)).booleanValue()) {
                new zzcvs(this.g);
                zzdbd zzdbd0 = new zzdbd();
                zzdbd0.zzc(this.a);
                zzdbd0.zzf(((I5)zzeyy0).a);
                zzdbf zzdbf0 = zzdbd0.zzg();
                zzdhd zzdhd0 = new zzdhd();
                zzdhd0.zzc(this.d, this.b);
                zzdhd0.zzl(this.d, this.b);
                return this.a(zzdbf0, zzdhd0.zzn());
            }
            zzexh zzexh0 = zzexh.zzi(this.d);
            zzdhd zzdhd1 = new zzdhd();
            zzdhd1.zzb(zzexh0, this.b);
            zzdhd1.zzg(zzexh0, this.b);
            zzdhd1.zzh(zzexh0, this.b);
            zzdhd1.zzi(zzexh0, this.b);
            zzdhd1.zzc(zzexh0, this.b);
            zzdhd1.zzl(zzexh0, this.b);
            zzdhd1.zzm(zzexh0);
            new zzcvs(this.g);
            zzdbd zzdbd1 = new zzdbd();
            zzdbd1.zzc(this.a);
            zzdbd1.zzf(((I5)zzeyy0).a);
            return this.a(zzdbd1.zzg(), zzdhd1.zzn());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        return this.j != null && !this.j.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zzb(zzl zzl0, String s, zzemv zzemv0, zzemw zzemw0) throws RemoteException {
        zzfhs zzfhs1;
        synchronized(this) {
            boolean z = ((Boolean)zzbjn.zzd.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue();
            if(this.f.zzc < ((int)(((Integer)zzay.zzc().zzb(zzbhz.zziw)))) || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(s == null) {
                zzcfi.zzg("Ad unit ID should not be null for app open ad.");
                zzewl zzewl0 = new zzewl(this);
                this.b.execute(zzewl0);
                return false;
            }
            if(this.j != null) {
                return false;
            }
            if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
                zzeza zzeza0 = this.e;
                if(zzeza0.zzd() == null) {
                    zzfhs1 = null;
                }
                else {
                    zzfhs zzfhs0 = ((zzcvd)zzeza0.zzd()).zzh();
                    zzfhs0.zzh(7);
                    zzfhs0.zzb(zzl0.zzp);
                    zzfhs1 = zzfhs0;
                }
            }
            else {
                zzfhs1 = null;
            }
            zzfcx.zza(this.a, zzl0.zzf);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzl0.zzf) {
                this.c.zzk().zzl(true);
            }
            this.i.zzs(s);
            zzq zzq0 = zzq.zzb();
            this.i.zzr(zzq0);
            this.i.zzE(zzl0);
            zzfcd zzfcd0 = this.i.zzG();
            int v1 = zzfhr.zzf(zzfcd0);
            zzfhh zzfhh0 = zzfhg.zzb(this.a, v1, 7, zzl0);
            I5 i50 = new I5();  // 初始化器: Ljava/lang/Object;-><init>()V
            i50.a = zzfcd0;
            zzezb zzezb0 = new zzezb(i50, null);
            zzewm zzewm0 = (zzeyy zzeyy0) -> this.b(zzeyy0);
            zzfvl zzfvl0 = this.e.zzc(zzezb0, zzewm0, null);
            this.j = zzfvl0;
            zzfvc.zzr(zzfvl0, new H5(this, zzemw0, zzfhs1, zzfhh0, i50), this.b);
            return true;
        }
    }

    public final void zzl(zzw zzw0) {
        this.i.zzt(zzw0);
    }
}

