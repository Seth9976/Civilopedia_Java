package m0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import g1.n;
import java.util.List;
import java.util.Objects;

public final class z extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final A c;

    public z(A a0, boolean z) {
        this.c = a0;
        super();
        this.b = z;
    }

    public final void a(Context context0, IntentFilter intentFilter0) {
        synchronized(this) {
            if(this.a) {
                return;
            }
            if(Build.VERSION.SDK_INT >= 33) {
                context0.registerReceiver(this, intentFilter0, (this.b ? 2 : 4));
            }
            else {
                context0.registerReceiver(this, intentFilter0);
            }
            this.a = true;
        }
    }

    public final void b(Bundle bundle0, e e0, int v) {
        try {
            byte[] arr_b = bundle0.getByteArray("FAILURE_LOGGING_PAYLOAD");
            A a0 = this.c;
            if(arr_b != null) {
                zzjz zzjz0 = zzjz.zzC(bundle0.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza());
                ((n)a0.d).s(zzjz0);
                return;
            }
            zzjz zzjz1 = w.b(23, v, e0);
            ((n)a0.d).s(zzjz1);
        }
        catch(Throwable unused_ex) {
            zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        int v = 1;
        A a0 = this.c;
        if(bundle0 == null) {
            zze.zzl("BillingBroadcastManager", "Bundle is null.");
            e e0 = y.i;
            zzjz zzjz0 = w.b(11, 1, e0);
            ((n)a0.d).s(zzjz0);
            q2.e e1 = (q2.e)a0.c;
            if(e1 == null) {
                return;
            }
            e1.f(e0, null);
            return;
        }
        e e2 = zze.zzf(intent0, "BillingBroadcastManager");
        String s = intent0.getAction();
        if(Objects.equals(bundle0.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW")) {
            v = 2;
        }
        if(!s.equals("com.android.vending.billing.PURCHASES_UPDATED") && !s.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if(s.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if(e2.a != 0) {
                    this.b(bundle0, e2, v);
                    ((q2.e)a0.c).f(e2, zzco.zzl());
                    return;
                }
                a0.getClass();
                zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                zzjz zzjz1 = w.b(77, v, y.i);
                ((n)a0.d).s(zzjz1);
                ((q2.e)a0.c).f(y.i, zzco.zzl());
            }
            return;
        }
        List list0 = zze.zzj(bundle0);
        if(e2.a == 0) {
            zzkd zzkd0 = w.d(v);
            ((n)a0.d).t(zzkd0);
        }
        else {
            this.b(bundle0, e2, v);
        }
        ((q2.e)a0.c).f(e2, list0);
    }
}

