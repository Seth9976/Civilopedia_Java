package q2;

import J2.j;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import m0.e;

public final class c implements Runnable {
    public final e i;
    public final q2.e j;
    public final Purchase k;

    public c(e e0, q2.e e1, Purchase purchase0) {
        this.i = e0;
        this.j = e1;
        this.k = purchase0;
    }

    @Override
    public final void run() {
        e e0 = this.i;
        j.f(e0, "$billingResult");
        q2.e e1 = this.j;
        j.f(e1, "this$0");
        Purchase purchase0 = this.k;
        j.f(purchase0, "$purchase");
        if(e0.a == 0) {
            e1.a(purchase0);
            return;
        }
        e1.a.d();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("value", e0.a);
        e1.d("billing_purchase_acknowledge_failed", bundle0);
    }
}

