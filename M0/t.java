package m0;

import J3.d;
import X2.z;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzel;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzew;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzv;
import f2.J;
import f2.j;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import q2.e;

public final class t extends b {
    public volatile int A;
    public volatile zzav B;
    public volatile s C;
    public volatile zzew D;
    public final Application z;

    public t(d d0, Application application0) {
        super(d0, application0);
        this.A = 0;
        this.z = application0;
    }

    public t(d d0, Application application0, e e0) {
        super(d0, application0, e0);
        this.A = 0;
        this.z = application0;
    }

    public final boolean A() {
        synchronized(this) {
            if(this.A == 2 && this.B != null && this.C != null) {
                return true;
            }
        }
        return false;
    }

    public final zzeu B(int v) {
        if(!this.A()) {
            zze.zzl("BillingClientTesting", "Billing Override Service is not ready.");
            this.C(106, 28, y.a(-1, "Billing Override Service connection is disconnected."));
            return zzel.zza(0);
        }
        return zzv.zza(new p(this, v));
    }

    public final void C(int v, int v1, m0.e e0) {
        zzjz zzjz0 = w.b(v, v1, e0);
        Objects.requireNonNull(zzjz0, "ApiFailure should not be null");
        this.g.s(zzjz0);
    }

    public final void D(int v, Consumer consumer0, Runnable runnable0) {
        zzeu zzeu0 = this.B(v);
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        synchronized(this) {
            if(this.D == null) {
                this.D = zzfb.zzb(Executors.newSingleThreadScheduledExecutor());
            }
        }
        zzel.zzc(zzel.zzb(zzeu0, 28500L, timeUnit0, this.D), new q(this, v, consumer0, runnable0), this.x());
    }

    @Override  // m0.b
    public final void a(z z0, D1.b b0) {
        this.D(3, new o(b0, 1), new B.o(this, z0, b0, 21, false));
    }

    @Override  // m0.b
    public final m0.e c(j j0, m0.d d0) {
        o o0 = new o(this, 2);
        zzeu zzeu0 = this.B(2);
        int v = 0;
        try {
            v = (int)(((Integer)zzeu0.get(28500L, TimeUnit.MILLISECONDS)));
        }
        catch(TimeoutException timeoutException0) {
            this.C(0x72, 28, y.s);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", timeoutException0);
        }
        catch(Exception exception0) {
            if(exception0 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.C(107, 28, y.s);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", exception0);
        }
        if(v > 0) {
            m0.e e0 = y.a(v, "Billing override value was set by a license tester.");
            this.C(105, 2, e0);
            o0.accept(e0);
            return e0;
        }
        try {
            return super.c(j0, d0);
        }
        catch(Exception exception1) {
            this.C(0x73, 2, y.i);
            zze.zzm("BillingClientTesting", "An internal error occurred.", exception1);
            return y.i;
        }
    }

    @Override  // m0.b
    public final void d(i i0, J j0) {
        this.D(7, new o(j0, 0), new B.o(this, i0, j0, 20, false));
    }

    @Override  // m0.b
    public final void e(e e0) {
        int v = 1;
        synchronized(this) {
            if(this.A()) {
                zze.zzk("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                zzkd zzkd0 = w.d(26);
                Objects.requireNonNull(zzkd0, "ApiSuccess should not be null");
                this.g.t(zzkd0);
            }
            else {
                switch(this.A) {
                    case 1: {
                        zze.zzl("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                        break;
                    }
                    case 3: {
                        zze.zzl("BillingClientTesting", "Billing Override Service Client was already closed and can\'t be reused. Please create another instance.");
                        this.C(38, 26, y.a(-1, "Billing Override Service connection is disconnected."));
                        break;
                    }
                    default: {
                        this.A = 1;
                        zze.zzk("BillingClientTesting", "Starting Billing Override Service setup.");
                        this.C = new s(this);
                        Intent intent0 = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                        intent0.setPackage("com.google.android.apps.play.billingtestcompanion");
                        List list0 = this.z.getPackageManager().queryIntentServices(intent0, 0);
                        if(list0 == null || list0.isEmpty()) {
                            v = 41;
                        label_35:
                            this.A = 0;
                            zze.zzk("BillingClientTesting", "Billing Override Service unavailable on device.");
                            this.C(v, 26, y.a(2, "Billing Override Service unavailable on device."));
                        }
                        else {
                            ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
                            if(serviceInfo0 == null) {
                                goto label_35;
                            }
                            else {
                                String s = serviceInfo0.packageName;
                                String s1 = serviceInfo0.name;
                                if(!Objects.equals(s, "com.google.android.apps.play.billingtestcompanion") || s1 == null) {
                                    zze.zzl("BillingClientTesting", "The device doesn\'t have valid Play Billing Lab.");
                                    v = 39;
                                    goto label_35;
                                }
                                else {
                                    ComponentName componentName0 = new ComponentName(s, s1);
                                    Intent intent1 = new Intent(intent0);
                                    intent1.setComponent(componentName0);
                                    if(this.z.bindService(intent1, this.C, 1)) {
                                        zze.zzk("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                    }
                                    else {
                                        zze.zzl("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                        v = 39;
                                        goto label_35;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        super.e(e0);
    }

    public final void y(z z0, D1.b b0) {
        super.a(z0, b0);
    }

    public final void z(i i0, J j0) {
        super.d(i0, j0);
    }
}

