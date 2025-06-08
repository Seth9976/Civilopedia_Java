package h1;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzik;
import java.util.List;
import java.util.Map;

public final class b extends c {
    public final zzik a;

    public b(zzik zzik0) {
        Preconditions.checkNotNull(zzik0);
        this.a = zzik0;
    }

    @Override  // h1.c
    public final Boolean a() {
        return (Boolean)this.a.zzg(4);
    }

    @Override  // h1.c
    public final Double b() {
        return (Double)this.a.zzg(2);
    }

    @Override  // h1.c
    public final Integer c() {
        return (Integer)this.a.zzg(3);
    }

    @Override  // h1.c
    public final Long d() {
        return (Long)this.a.zzg(1);
    }

    @Override  // h1.c
    public final String e() {
        return (String)this.a.zzg(0);
    }

    @Override  // h1.c
    public final Map f(boolean z) {
        return this.a.zzo(null, null, z);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final int zza(String s) {
        return this.a.zza(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final long zzb() {
        return this.a.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final Object zzg(int v) {
        return this.a.zzg(v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final String zzh() {
        return this.a.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final String zzi() {
        return this.a.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final String zzj() {
        return this.a.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final String zzk() {
        return this.a.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final List zzm(String s, String s1) {
        return this.a.zzm(s, s1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final Map zzo(String s, String s1, boolean z) {
        return this.a.zzo(s, s1, z);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzp(String s) {
        this.a.zzp(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzq(String s, String s1, Bundle bundle0) {
        this.a.zzq(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzr(String s) {
        this.a.zzr(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzs(String s, String s1, Bundle bundle0) {
        this.a.zzs(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzt(String s, String s1, Bundle bundle0, long v) {
        this.a.zzt(s, s1, bundle0, v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzu(zzhf zzhf0) {
        this.a.zzu(zzhf0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzv(Bundle bundle0) {
        this.a.zzv(bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzw(zzhe zzhe0) {
        this.a.zzw(zzhe0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzik
    public final void zzx(zzhf zzhf0) {
        this.a.zzx(zzhf0);
    }
}

