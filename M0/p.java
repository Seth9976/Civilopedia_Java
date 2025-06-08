package m0;

import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzr;

public final class p {
    public final t a;
    public final int b;

    public p(t t0, int v) {
        this.a = t0;
        this.b = v;
    }

    public final void a(zzr zzr0) {
        String s;
        t t0 = this.a;
        int v = this.b;
        t0.getClass();
        try {
            if(t0.B == null) {
                throw null;
            }
            zzav zzav0 = t0.B;
            switch(v) {
                case 2: {
                    s = "LAUNCH_BILLING_FLOW";
                    break;
                }
                case 3: {
                    s = "ACKNOWLEDGE_PURCHASE";
                    break;
                }
                case 6: {
                    s = "START_CONNECTION";
                    break;
                }
                case 7: {
                    s = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                }
                default: {
                    s = "QUERY_SKU_DETAILS_ASYNC";
                }
            }
            zzav0.zza("com.spears.civilopedia", s, new r(zzr0));
            return;
        }
        catch(Exception exception0) {
        }
        t0.C(107, 28, y.s);
        zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", exception0);
        zzr0.zzb(0);
    }
}

