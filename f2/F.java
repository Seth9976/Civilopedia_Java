package f2;

import J2.j;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Date;

public final class f extends AppOpenAdLoadCallback {
    public final g a;

    public f(g g0) {
        this.a = g0;
        super();
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        j.f(loadAdError0, "loadAdError");
        this.a.b = false;
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(Object object0) {
        j.f(((AppOpenAd)object0), "ad");
        this.a.a = (AppOpenAd)object0;
        this.a.b = false;
        this.a.d = new Date().getTime();
    }
}

