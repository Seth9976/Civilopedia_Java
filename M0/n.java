package m0;

import C0.c;
import L3.l;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlu;
import l1.d;
import q2.e;

public final class n implements ServiceConnection {
    public final e i;
    public final b j;

    public n(b b0, e e0) {
        this.j = b0;
        this.i = e0;
    }

    public final void a(m0.e e0) {
        synchronized(this.j.a) {
            if(this.j.b == 3) {
                return;
            }
        }
        this.i.e(e0);
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        zze.zzl("BillingClient", "Billing service died.");
        try {
            if(b.r(this.j)) {
                zzjx zzjx0 = zzjz.zzc();
                zzjx0.zzn(6);
                zzke zzke0 = zzki.zzc();
                zzke0.zzo(0x7A);
                zzjx0.zza(zzke0);
                zzjz zzjz0 = (zzjz)zzjx0.zzf();
                this.j.g.s(zzjz0);
            }
            else {
                this.j.g.getClass();
                goto label_11;
            }
            goto label_22;
        }
        catch(Throwable throwable0) {
            goto label_21;
        }
        try {
        label_11:
            zzli zzli0 = zzlk.zzc();
            zzli0.zzo(((zzku)this.j.g.j));
            zzli0.zzn(zzkl.zzB());
            zzlk zzlk0 = (zzlk)zzli0.zzf();
            ((l)this.j.g.k).b(zzlk0);
            goto label_22;
        }
        catch(Throwable throwable1) {
            try {
                zze.zzm("BillingLogger", "Unable to log.", throwable1);
                goto label_22;
            }
            catch(Throwable throwable0) {
            }
        }
    label_21:
        zze.zzm("BillingClient", "Unable to log.", throwable0);
    label_22:
        synchronized(this.j.a) {
            if(this.j.b != 0 && this.j.b != 3) {
                this.j.m(0);
                this.j.n();
                e e0 = this.i;
                e0.d("billing_service_disconnected", null);
                b b0 = e0.d;
                if(!b0.b()) {
                    b0.e(e0);
                }
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zze.zzk("BillingClient", "Billing service connected.");
        synchronized(this.j.a) {
            if(this.j.b == 3) {
                return;
            }
            this.j.h = zzam.zzu(iBinder0);
        }
        if(b.f(new c(this, 2), 30000L, new d(this, 1), this.j.s(), this.j.j()) == null) {
            m0.e e0 = this.j.g();
            this.j.u(25, 6, e0);
            this.a(e0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        zzlu zzlu0;
        g1.n n0;
        zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            if(b.r(this.j)) {
                zzjx zzjx0 = zzjz.zzc();
                zzjx0.zzn(6);
                zzke zzke0 = zzki.zzc();
                zzke0.zzo(0x79);
                zzjx0.zza(zzke0);
                zzjz zzjz0 = (zzjz)zzjx0.zzf();
                this.j.g.s(zzjz0);
            }
            else {
                n0 = this.j.g;
                zzlu0 = zzlu.zzB();
                n0.getClass();
                if(zzlu0 != null) {
                    goto label_14;
                }
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_23;
        }
        try {
        label_14:
            zzli zzli0 = zzlk.zzc();
            zzli0.zzo(((zzku)n0.j));
            zzli0.zzq(zzlu0);
            ((l)n0.k).b(((zzlk)zzli0.zzf()));
            goto label_24;
        }
        catch(Throwable throwable1) {
            try {
                zze.zzm("BillingLogger", "Unable to log.", throwable1);
                goto label_24;
            }
            catch(Throwable throwable0) {
            }
        }
    label_23:
        zze.zzm("BillingClient", "Unable to log.", throwable0);
    label_24:
        synchronized(this.j.a) {
            if(this.j.b == 3) {
                return;
            }
            this.j.m(0);
        }
        e e0 = this.i;
        e0.d("billing_service_disconnected", null);
        b b0 = e0.d;
        if(!b0.b()) {
            b0.e(e0);
        }
    }
}

