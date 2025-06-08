package i1;

import com.google.android.gms.internal.ads.K;
import com.google.android.gms.measurement.internal.zzko;
import com.google.android.gms.measurement.internal.zzkr;

public final class a0 extends f {
    public final int e;
    public final Object f;

    public a0(Object object0, C c0, int v) {
        this.e = v;
        this.f = object0;
        super(c0);
    }

    @Override  // i1.f
    public final void b() {
        if(this.e != 0) {
            ((zzkr)this.f).zza();
            ((zzkr)this.f).a.zzay().zzj().zza("Starting upload from DelayedRunnable");
            ((zzkr)this.f).b.p();
            return;
        }
        ((zzko)((K)this.f).l).zzg();
        zzko zzko0 = (zzko)((K)this.f).l;
        long v = zzko0.a.zzav().elapsedRealtime();
        ((K)this.f).a(v, false, false);
        zzko0.a.zzd().zzf(zzko0.a.zzav().elapsedRealtime());
    }
}

