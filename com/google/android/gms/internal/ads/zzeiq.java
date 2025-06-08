package com.google.android.gms.internal.ads;

import A.f;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzeiq {
    public final Clock a;
    public final zzeir b;
    public final zzfii c;
    public final List d;
    public final boolean e;
    public final zzefi f;

    public zzeiq(Clock clock0, zzeir zzeir0, zzefi zzefi0, zzfii zzfii0) {
        this.d = Collections.synchronizedList(new ArrayList());
        this.a = clock0;
        this.b = zzeir0;
        this.e = ((Boolean)zzay.zzc().zzb(zzbhz.zzfP)).booleanValue();
        this.f = zzefi0;
        this.c = zzfii0;
    }

    public static void a(zzeiq zzeiq0, String s, int v, long v1, String s1) {
        String s2 = TextUtils.isEmpty(s1) ? s + "." + v + "." + v1 : f.i((s + "." + v + "." + v1), ".", s1);
        zzeiq0.d.add(s2);
    }

    public final String zzf() {
        return TextUtils.join("_", this.d);
    }
}

