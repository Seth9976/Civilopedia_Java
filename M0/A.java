package m0;

import J3.d;
import android.app.Application;
import com.google.android.gms.internal.play_billing.zze;
import java.util.ArrayList;
import s1.n;
import w1.b;

public final class a {
    public volatile Object a;
    public volatile Object b;
    public final Object c;

    public a(Application application0) {
        this.c = application0;
    }

    public a(n n0) {
        b b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        d d0 = new d(19);
        super();
        this.b = b0;
        this.c = new ArrayList();
        this.a = d0;
        n0.a(new t1.a(this));
    }

    public boolean a() {
        Application application0 = (Application)this.c;
        try {
            return application0.getPackageManager().getApplicationInfo("com.spears.civilopedia", 0x80).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        }
        catch(Exception exception0) {
            zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", exception0);
            return false;
        }
    }
}

