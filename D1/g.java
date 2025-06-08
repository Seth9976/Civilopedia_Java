package d1;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.zzak;
import com.google.android.gms.internal.consent_sdk.zzam;
import com.google.android.gms.internal.consent_sdk.zzay;
import com.google.android.gms.internal.consent_sdk.zzbi;
import com.google.android.gms.internal.consent_sdk.zzbk;
import com.google.android.gms.internal.consent_sdk.zzbl;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.gms.internal.consent_sdk.zzh;
import com.google.android.gms.internal.consent_sdk.zzj;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class g implements zzg {
    public final Application a;
    public final zzbi b;
    public final Handler c;
    public final Executor d;
    public final zzh e;
    public final zzak f;
    public final zzay g;
    public final zzam h;

    public g(Application application0, zzbi zzbi0, Handler handler0, Executor executor0, zzh zzh0, zzak zzak0, zzay zzay0, zzam zzam0) {
        this.a = application0;
        this.b = zzbi0;
        this.c = handler0;
        this.d = executor0;
        this.e = zzh0;
        this.f = zzak0;
        this.g = zzay0;
        this.h = zzam0;
    }

    public final void a(String s) {
        String s1 = String.valueOf(s);
        Log.d("UserMessagingPlatform", (s1.length() == 0 ? new String("Receive consent action: ") : "Receive consent action: " + s1));
        Uri uri0 = Uri.parse(s);
        String s2 = uri0.getQueryParameter("action");
        String s3 = uri0.getQueryParameter("args");
        this.e.zzb(s2, s3, new zzg[]{this, this.f});
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzg
    public final Executor zza() {
        return new zzbl(this.c);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzg
    public final boolean zzb(String s, JSONObject jSONObject0) {
        int v1;
        int v = -1;
        switch(s) {
            case "browser": {
                v1 = 2;
                break;
            }
            case "configure_app_assets": {
                v1 = 3;
                break;
            }
            case "dismiss": {
                v1 = 1;
                break;
            }
            case "load_complete": {
                v1 = 0;
                break;
            }
            default: {
                v1 = -1;
            }
        }
        zzay zzay0 = this.g;
        switch(v1) {
            case 0: {
                boolean z = ((e)zzay0.h.getAndSet(null)) == null;
                return true;
            }
            case 1: {
                switch(jSONObject0.optString("status")) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS": {
                        v = 3;
                        break;
                    }
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS": {
                        v = 1;
                        break;
                    }
                    case "CONSENT_SIGNAL_SUFFICIENT": {
                        v = 4;
                        break;
                    }
                    case "non_personalized": {
                        v = 2;
                        break;
                    }
                    case "personalized": {
                        v = 0;
                    }
                }
                if(v != 0 && v != 1 && v != 2 && v != 3 && v != 4) {
                    new zzj(1, "We are getting something wrong with the webview.");
                    zzay0.a();
                    if(zzay0.i.getAndSet(null) != null) {
                        throw new ClassCastException();
                    }
                    return true;
                }
                zzay0.a();
                if(zzay0.i.getAndSet(null) != null) {
                    throw new ClassCastException();
                }
                return true;
            }
            case 2: {
                String s1 = jSONObject0.optString("url");
                if(TextUtils.isEmpty(s1)) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
                }
                Uri uri0 = Uri.parse(s1);
                if(uri0.getScheme() == null) {
                    String s2 = String.valueOf(s1);
                    Log.d("UserMessagingPlatform", (s2.length() == 0 ? new String("Action[browser]: empty scheme: ") : "Action[browser]: empty scheme: " + s2));
                }
                try {
                    Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
                    this.b.startActivity(intent0);
                }
                catch(ActivityNotFoundException activityNotFoundException0) {
                    String s3 = String.valueOf(s1);
                    Log.d("UserMessagingPlatform", (s3.length() == 0 ? new String("Action[browser]: can not open url: ") : "Action[browser]: can not open url: " + s3), activityNotFoundException0);
                }
                return true;
            }
            case 3: {
                zzbk zzbk0 = new zzbk(this);
                this.d.execute(zzbk0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

