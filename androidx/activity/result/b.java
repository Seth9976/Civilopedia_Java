package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.e;

public abstract class b {
    public final void a(IntentSenderRequest intentSenderRequest0) {
        Bundle bundle2;
        ((c)this).c.e.add(((c)this).a);
        androidx.activity.c c0 = (androidx.activity.c)((c)this).c;
        Intent intent0 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest0);
        Bundle bundle0 = intent0.getExtras();
        e e0 = c0.i;
        if(bundle0 != null && intent0.getExtras().getClassLoader() == null) {
            intent0.setExtrasClassLoader(e0.getClassLoader());
        }
        if(intent0.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundle1 = intent0.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intent0.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle2 = bundle1;
        }
        else {
            bundle2 = null;
        }
        boolean z = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intent0.getAction());
        int v = ((c)this).b;
        if(z) {
            String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if(arr_s == null) {
                arr_s = new String[0];
            }
            u.c.a(e0, arr_s, v);
            return;
        }
        if("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intent0.getAction())) {
            IntentSenderRequest intentSenderRequest1 = (IntentSenderRequest)intent0.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                e0.startIntentSenderForResult(intentSenderRequest1.i, v, intentSenderRequest1.j, intentSenderRequest1.k, intentSenderRequest1.l, 0, bundle2);
            }
            catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                new Handler(Looper.getMainLooper()).post(new androidx.activity.b(c0, v, intentSender$SendIntentException0, 0));
            }
            return;
        }
        e0.startActivityForResult(intent0, v, bundle2);
    }
}

