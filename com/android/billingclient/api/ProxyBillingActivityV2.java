package com.android.billingclient.api;

import D3.b;
import M1.f;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.e;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.c;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;
import k.d;

@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends e {
    public c q;
    public c r;
    public ResultReceiver s;
    public ResultReceiver t;

    @Override  // androidx.activity.e
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        f f0 = new f(13);
        d d0 = new d(this, 5);
        this.q = this.p.b("activity_rq#" + this.o.getAndIncrement(), this, f0, d0);
        f f1 = new f(13);
        b b0 = new b(this, 29);
        this.r = this.p.b("activity_rq#" + this.o.getAndIncrement(), this, f1, b0);
        if(bundle0 == null) {
            zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if(this.getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent0 = (PendingIntent)this.getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.s = (ResultReceiver)this.getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                this.q.a(new IntentSenderRequest(pendingIntent0.getIntentSender()));
                return;
            }
            if(this.getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent1 = (PendingIntent)this.getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.t = (ResultReceiver)this.getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                this.r.a(new IntentSenderRequest(pendingIntent1.getIntentSender()));
            }
        }
        else {
            if(bundle0.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.s = (ResultReceiver)bundle0.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            }
            if(bundle0.containsKey("external_payment_dialog_result_receiver")) {
                this.t = (ResultReceiver)bundle0.getParcelable("external_payment_dialog_result_receiver");
            }
        }
    }

    @Override  // androidx.activity.e
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        ResultReceiver resultReceiver0 = this.s;
        if(resultReceiver0 != null) {
            bundle0.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver0);
        }
        ResultReceiver resultReceiver1 = this.t;
        if(resultReceiver1 != null) {
            bundle0.putParcelable("external_payment_dialog_result_receiver", resultReceiver1);
        }
    }
}

