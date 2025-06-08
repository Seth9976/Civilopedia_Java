package m0;

import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzej;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

public final class q implements zzej {
    public final Consumer a;
    public final Runnable b;
    public final t c;
    public final int d;

    public q(t t0, int v, Consumer consumer0, Runnable runnable0) {
        this.d = v;
        this.a = consumer0;
        this.b = runnable0;
        this.c = t0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzej
    public final void zza(Throwable throwable0) {
        t t0 = this.c;
        if(throwable0 instanceof TimeoutException) {
            t0.C(0x72, 28, y.s);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", throwable0);
        }
        else {
            t0.C(107, 28, y.s);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", throwable0);
        }
        this.b.run();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzej
    public final void zzb(Object object0) {
        if(((int)(((Integer)object0))) > 0) {
            this.c.getClass();
            e e0 = y.a(((int)(((Integer)object0))), "Billing override value was set by a license tester.");
            this.c.C(105, this.d, e0);
            this.a.accept(e0);
            return;
        }
        this.b.run();
    }
}

