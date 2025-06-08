package f2;

import J2.j;
import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Date;

public final class g {
    public AppOpenAd a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;

    public final void a(Context context0) {
        j.f(context0, "context");
        if(!this.b && (this.a == null || new Date().getTime() - this.d >= 14400000L)) {
            this.b = true;
            AdManagerAdRequest adManagerAdRequest0 = new Builder().build();
            j.e(adManagerAdRequest0, "build(...)");
            AppOpenAd.load(context0, "ca-app-pub-8598481467084652/7811489567", adManagerAdRequest0, 1, new f(this));
        }
    }
}

