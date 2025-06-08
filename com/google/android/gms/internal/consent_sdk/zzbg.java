package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import d1.g;
import i3.e;

public final class zzbg extends WebView {
    public final Handler i;
    public final g j;
    public boolean k;
    public static final int l;

    public zzbg(zzbi zzbi0, Handler handler0, g g0) {
        super(zzbi0);
        this.k = false;
        this.i = handler0;
        this.j = g0;
    }

    public final void zzb(String s, String s1) {
        zzbd zzbd0 = new zzbd(this, e.i(new StringBuilder(s.length() + 3 + String.valueOf(s1).length()), s, "(", s1, ");"));
        this.i.post(zzbd0);
    }
}

