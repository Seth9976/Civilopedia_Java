package m0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzkd;
import java.util.Objects;

public final class s implements ServiceConnection {
    public final t i;

    public s(t t0) {
        this.i = t0;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zze.zzk("BillingClientTesting", "Billing Override Service connected.");
        this.i.B = zzau.zzc(iBinder0);
        this.i.A = 2;
        this.i.getClass();
        zzkd zzkd0 = w.d(26);
        Objects.requireNonNull(zzkd0, "ApiSuccess should not be null");
        this.i.g.t(zzkd0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
        this.i.B = null;
        this.i.A = 0;
    }
}

