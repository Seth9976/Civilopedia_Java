package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

public final class zzfay implements zzemx {
    public final Context a;
    public final Executor b;
    public final zzcnf c;
    public final zzfao d;
    public final zzeza e;
    public final zzfby f;
    public final zzfhu g;
    public final zzfcb h;
    public zzfvl i;

    public zzfay(Context context0, Executor executor0, zzcnf zzcnf0, zzeza zzeza0, zzfao zzfao0, zzfcb zzfcb0, zzfby zzfby0) {
        this.a = context0;
        this.b = executor0;
        this.c = zzcnf0;
        this.e = zzeza0;
        this.d = zzfao0;
        this.h = zzfcb0;
        this.f = zzfby0;
        this.g = zzcnf0.zzy();
    }

    public final zzdsx a(zzeyy zzeyy0) {
        zzdsx zzdsx0 = this.c.zzi();
        zzdbd zzdbd0 = new zzdbd();
        zzdbd0.zzc(this.a);
        zzdbd0.zzf(((R5)zzeyy0).a);
        zzdbd0.zze(this.f);
        zzdsx0.zzd(zzdbd0.zzg());
        zzdsx0.zzc(new zzdhd().zzn());
        return zzdsx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zzb(zzl zzl0, String s, zzemv zzemv0, zzemw zzemw0) throws RemoteException {
        zzfhs zzfhs1;
        zzcas zzcas0 = new zzcas(zzl0, s);
        Executor executor0 = this.b;
        if(zzcas0.zzb == null) {
            zzcfi.zzg("Ad unit ID should not be null for rewarded video ad.");
            executor0.execute(new zzfar(this));
            return false;
        }
        if(this.i == null || this.i.isDone()) {
            boolean z = ((Boolean)zzbji.zzc.zze()).booleanValue();
            zzeza zzeza0 = this.e;
            if(!z || zzeza0.zzd() == null) {
                zzfhs1 = null;
            }
            else {
                zzfhs zzfhs0 = ((zzdsy)zzeza0.zzd()).zzh();
                zzfhs0.zzh(5);
                zzfhs0.zzb(zzcas0.zza.zzp);
                zzfhs1 = zzfhs0;
            }
            Context context0 = this.a;
            zzfcx.zza(context0, zzcas0.zza.zzf);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzcas0.zza.zzf) {
                this.c.zzk().zzl(true);
            }
            this.h.zzs(zzcas0.zzb);
            zzq zzq0 = zzq.zzd();
            this.h.zzr(zzq0);
            this.h.zzE(zzcas0.zza);
            zzfcd zzfcd0 = this.h.zzG();
            zzfhh zzfhh0 = zzfhg.zzb(context0, zzfhr.zzf(zzfcd0), 5, zzcas0.zza);
            R5 r50 = new R5();  // 初始化器: Ljava/lang/Object;-><init>()V
            r50.a = zzfcd0;
            zzfvl zzfvl0 = zzeza0.zzc(new zzezb(r50, null), (zzeyy zzeyy0) -> this.a(zzeyy0), null);
            this.i = zzfvl0;
            zzfvc.zzr(zzfvl0, new Q5(this, zzemw0, zzfhs1, zzfhh0, r50), executor0);
            return true;
        }
        return false;
    }
}

