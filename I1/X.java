package i1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzlf;
import com.google.android.gms.measurement.internal.zzq;

public final class x implements Runnable {
    public final int i;
    public final zzq j;
    public final zzgw k;

    public x(zzgw zzgw0, zzq zzq0, int v) {
        this.i = v;
        this.k = zzgw0;
        this.j = zzq0;
        super();
    }

    @Override
    public final void run() {
        switch(this.i) {
            case 0: {
                this.k.i.a();
                this.k.i.l(this.j);
                return;
            }
            case 1: {
                this.k.i.a();
                this.k.i.zzaz().zzg();
                this.k.i.b();
                Preconditions.checkNotEmpty(this.j.zza);
                this.k.i.E(this.j);
                return;
            }
            case 2: {
                zzlf zzlf0 = this.k.i;
                zzlf0.a();
                zzlf0.zzaz().zzg();
                zzlf0.b();
                zzq zzq0 = this.j;
                Preconditions.checkNotEmpty(zzq0.zza);
                zzai zzai0 = zzai.zzb(zzq0.zzv);
                zzai zzai1 = zzlf0.F(zzq0.zza);
                zzlf0.zzay().zzj().zzc("Setting consent, package, consent", zzq0.zza, zzai0);
                zzlf0.n(zzq0.zza, zzai0);
                if(zzai0.zzk(zzai1)) {
                    zzlf0.l(zzq0);
                }
                return;
            }
            default: {
                this.k.i.a();
                this.k.i.i(this.j);
            }
        }
    }
}

