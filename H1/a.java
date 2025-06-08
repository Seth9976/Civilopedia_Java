package h1;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzli;
import java.util.List;
import java.util.Map;
import p.b;
import p.k;

public final class a extends c {
    public final zzge a;
    public final zzij b;

    public a(zzge zzge0) {
        Preconditions.checkNotNull(zzge0);
        this.a = zzge0;
        this.b = zzge0.zzq();
    }

    @Override  // h1.c
    public final Boolean a() {
        return this.b.zzi();
    }

    @Override  // h1.c
    public final Double b() {
        return this.b.zzj();
    }

    @Override  // h1.c
    public final Integer c() {
        return this.b.zzl();
    }

    @Override  // h1.c
    public final Long d() {
        return this.b.zzm();
    }

    @Override  // h1.c
    public final String e() {
        return this.b.zzr();
    }

    @Override  // h1.c
    public final Map f(boolean z) {
        List list0 = this.b.zzt(z);
        Map map0 = new b(list0.size());
        for(Object object0: list0) {
            zzli zzli0 = (zzli)object0;
            Object object1 = zzli0.zza();
            if(object1 != null) {
                ((k)map0).put(zzli0.zzb, object1);
            }
        }
        return map0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final int zza(String s) {
        this.b.zzh(s);
        return 25;
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final long zzb() {
        return this.a.zzv().zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final Object zzg(int v) {
        zzij zzij0 = this.b;
        switch(v) {
            case 0: {
                return zzij0.zzr();
            }
            case 1: {
                return zzij0.zzm();
            }
            case 2: {
                return zzij0.zzj();
            }
            case 3: {
                return zzij0.zzl();
            }
            default: {
                return zzij0.zzi();
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final String zzh() {
        return this.b.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final String zzi() {
        return this.b.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final String zzj() {
        return this.b.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final String zzk() {
        return this.b.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final List zzm(String s, String s1) {
        return this.b.zzs(s, s1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final Map zzo(String s, String s1, boolean z) {
        return this.b.zzu(s, s1, z);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzp(String s) {
        this.a.zzd().zzd(s, this.a.zzav().elapsedRealtime());
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzq(String s, String s1, Bundle bundle0) {
        this.a.zzq().zzA(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzr(String s) {
        this.a.zzd().zze(s, this.a.zzav().elapsedRealtime());
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzs(String s, String s1, Bundle bundle0) {
        this.b.zzD(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzt(String s, String s1, Bundle bundle0, long v) {
        this.b.zzE(s, s1, bundle0, true, false, v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzu(zzhf zzhf0) {
        this.b.zzJ(zzhf0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzv(Bundle bundle0) {
        this.b.zzP(bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzw(zzhe zzhe0) {
        this.b.zzT(zzhe0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzx(zzhf zzhf0) {
        this.b.zzZ(zzhf0);
    }
}

