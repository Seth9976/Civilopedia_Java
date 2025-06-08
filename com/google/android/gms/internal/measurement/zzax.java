package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

public final class zzax {
    public final HashMap a;
    public final zzbj b;

    public zzax() {
        this.a = new HashMap();
        this.b = new zzbj();
        this.a(new zzav());
        this.a(new zzay());
        zzaz zzaz0 = new zzaz();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzaw;-><init>()V
        zzaz0.a.add(zzbl.zzc);
        zzaz0.a.add(zzbl.zzl);
        zzaz0.a.add(zzbl.zzm);
        zzaz0.a.add(zzbl.zzn);
        zzaz0.a.add(zzbl.zzt);
        zzaz0.a.add(zzbl.zzp);
        zzaz0.a.add(zzbl.zzu);
        zzaz0.a.add(zzbl.zzz);
        zzaz0.a.add(zzbl.zzP);
        zzaz0.a.add(zzbl.zzac);
        zzaz0.a.add(zzbl.zzaf);
        zzaz0.a.add(zzbl.zzai);
        zzaz0.a.add(zzbl.zzaj);
        this.a(zzaz0);
        zzbc zzbc0 = new zzbc();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzaw;-><init>()V
        zzbc0.a.add(zzbl.zzb);
        zzbc0.a.add(zzbl.zzV);
        zzbc0.a.add(zzbl.zzY);
        this.a(zzbc0);
        zzbh zzbh0 = new zzbh();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzaw;-><init>()V
        zzbh0.a.add(zzbl.zzA);
        zzbh0.a.add(zzbl.zzB);
        zzbh0.a.add(zzbl.zzC);
        zzbh0.a.add(zzbl.zzD);
        zzbh0.a.add(zzbl.zzE);
        zzbh0.a.add(zzbl.zzF);
        zzbh0.a.add(zzbl.zzG);
        zzbh0.a.add(zzbl.zzan);
        this.a(zzbh0);
        zzbi zzbi0 = new zzbi();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzaw;-><init>()V
        zzbi0.a.add(zzbl.zza);
        zzbi0.a.add(zzbl.zzv);
        zzbi0.a.add(zzbl.zzS);
        zzbi0.a.add(zzbl.zzT);
        zzbi0.a.add(zzbl.zzU);
        zzbi0.a.add(zzbl.zzaa);
        zzbi0.a.add(zzbl.zzab);
        zzbi0.a.add(zzbl.zzad);
        zzbi0.a.add(zzbl.zzae);
        zzbi0.a.add(zzbl.zzah);
        this.a(zzbi0);
        zzbk zzbk0 = new zzbk();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzaw;-><init>()V
        zzbk0.a.add(zzbl.zzd);
        zzbk0.a.add(zzbl.zzo);
        zzbk0.a.add(zzbl.zzr);
        zzbk0.a.add(zzbl.zzs);
        zzbk0.a.add(zzbl.zzy);
        zzbk0.a.add(zzbl.zzH);
        zzbk0.a.add(zzbl.zzJ);
        zzbk0.a.add(zzbl.zzK);
        zzbk0.a.add(zzbl.zzX);
        zzbk0.a.add(zzbl.zzag);
        zzbk0.a.add(zzbl.zzak);
        zzbk0.a.add(zzbl.zzal);
        zzbk0.a.add(zzbl.zzam);
        this.a(zzbk0);
    }

    public final void a(zzaw zzaw0) {
        for(Object object0: zzaw0.a) {
            String s = ((zzbl)object0).zzb().toString();
            this.a.put(s, zzaw0);
        }
    }

    public final zzap zza(zzg zzg0, zzap zzap0) {
        zzh.zzc(zzg0);
        if(zzap0 instanceof zzaq) {
            ArrayList arrayList0 = ((zzaq)zzap0).zzc();
            String s = ((zzaq)zzap0).zzb();
            return this.a.containsKey(s) ? ((zzaw)this.a.get(s)).zza(s, zzg0, arrayList0) : this.b.zza(s, zzg0, arrayList0);
        }
        return zzap0;
    }
}

