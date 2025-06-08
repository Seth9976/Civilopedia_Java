package com.android.billingclient.api;

import B1.b;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;
import m0.e;
import m0.w;

@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {
    public ResultReceiver i;
    public ResultReceiver j;
    public boolean k;
    public boolean l;
    public int m;

    public final Intent a() {
        Intent intent0 = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent0.setPackage("com.spears.civilopedia");
        return intent0;
    }

    @Override  // android.app.Activity
    public final void onActivityResult(int v, int v1, Intent intent0) {
        Intent intent1;
        super.onActivityResult(v, v1, intent0);
        Bundle bundle0 = null;
        if(v == 100 || v == 110) {
            int v3 = zze.zzf(intent0, "ProxyBillingActivity").a;
            if(v1 != -1) {
                zze.zzl("ProxyBillingActivity", "Activity finished with resultCode " + v1 + " and billing\'s responseCode: " + v3);
            }
            else if(v3 != 0) {
                zze.zzl("ProxyBillingActivity", "Activity finished with resultCode " + -1 + " and billing\'s responseCode: " + v3);
            }
            else {
                v3 = 0;
            }
            ResultReceiver resultReceiver1 = this.i;
            if(resultReceiver1 == null) {
                if(intent0 == null) {
                    intent1 = this.a();
                }
                else if(intent0.getExtras() != null) {
                    String s = intent0.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if(s == null) {
                        Intent intent2 = this.a();
                        intent2.putExtras(intent0.getExtras());
                        intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        intent1 = intent2;
                    }
                    else {
                        intent1 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                        intent1.setPackage("com.spears.civilopedia");
                        intent1.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", s);
                        intent1.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                }
                else {
                    intent1 = this.a();
                    zze.zzl("ProxyBillingActivity", "Got null bundle!");
                    intent1.putExtra("RESPONSE_CODE", 6);
                    intent1.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    b b0 = e.a();
                    b0.a = 6;
                    b0.b = "An internal error occurred.";
                    intent1.putExtra("FAILURE_LOGGING_PAYLOAD", w.b(22, 2, b0.a()).zzh());
                    intent1.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                if(v == 110) {
                    intent1.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                this.sendBroadcast(intent1);
            }
            else {
                if(intent0 != null) {
                    bundle0 = intent0.getExtras();
                }
                resultReceiver1.send(v3, bundle0);
            }
        }
        else if(v == 101) {
            int v2 = zze.zza(intent0, "ProxyBillingActivity");
            ResultReceiver resultReceiver0 = this.j;
            if(resultReceiver0 != null) {
                if(intent0 != null) {
                    bundle0 = intent0.getExtras();
                }
                resultReceiver0.send(v2, bundle0);
            }
        }
        else {
            zze.zzl("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + v + "; skipping...");
        }
        this.k = false;
        this.finish();
    }

    @Override  // android.app.Activity
    public final void onCreate(Bundle bundle0) {
        PendingIntent pendingIntent0;
        super.onCreate(bundle0);
        if(bundle0 == null) {
            zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow");
            this.m = 100;
            if(this.getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent0 = (PendingIntent)this.getIntent().getParcelableExtra("BUY_INTENT");
                if(this.getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && this.getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.l = true;
                    this.m = 110;
                }
            }
            else if(this.getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent0 = (PendingIntent)this.getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.i = (ResultReceiver)this.getIntent().getParcelableExtra("result_receiver");
            }
            else if(this.getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent0 = (PendingIntent)this.getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.j = (ResultReceiver)this.getIntent().getParcelableExtra("in_app_message_result_receiver");
                this.m = 101;
            }
            else {
                pendingIntent0 = null;
            }
            try {
                this.k = true;
                this.startIntentSenderForResult(pendingIntent0.getIntentSender(), this.m, new Intent(), 0, 0, 0);
            }
            catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                zze.zzm("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", intentSender$SendIntentException0);
                ResultReceiver resultReceiver0 = this.i;
                if(resultReceiver0 == null) {
                    ResultReceiver resultReceiver1 = this.j;
                    if(resultReceiver1 == null) {
                        Intent intent0 = this.a();
                        if(this.l) {
                            intent0.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        intent0.putExtra("RESPONSE_CODE", 6);
                        intent0.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        this.sendBroadcast(intent0);
                    }
                    else {
                        resultReceiver1.send(0, null);
                    }
                }
                else {
                    resultReceiver0.send(6, null);
                }
                this.k = false;
                this.finish();
            }
            return;
        }
        zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.k = bundle0.getBoolean("send_cancelled_broadcast_if_finished", false);
        if(bundle0.containsKey("result_receiver")) {
            this.i = (ResultReceiver)bundle0.getParcelable("result_receiver");
        }
        else if(bundle0.containsKey("in_app_message_result_receiver")) {
            this.j = (ResultReceiver)bundle0.getParcelable("in_app_message_result_receiver");
        }
        this.l = bundle0.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
        this.m = bundle0.getInt("activity_code", 100);
    }

    @Override  // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if(this.isFinishing() && this.k) {
            Intent intent0 = this.a();
            intent0.putExtra("RESPONSE_CODE", 1);
            intent0.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if(this.m == 100 || this.m == 110) {
                intent0.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            this.sendBroadcast(intent0);
        }
    }

    @Override  // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        ResultReceiver resultReceiver0 = this.i;
        if(resultReceiver0 != null) {
            bundle0.putParcelable("result_receiver", resultReceiver0);
        }
        ResultReceiver resultReceiver1 = this.j;
        if(resultReceiver1 != null) {
            bundle0.putParcelable("in_app_message_result_receiver", resultReceiver1);
        }
        bundle0.putBoolean("send_cancelled_broadcast_if_finished", this.k);
        bundle0.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.l);
        bundle0.putInt("activity_code", this.m);
    }
}

