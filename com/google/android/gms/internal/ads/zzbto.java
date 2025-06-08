package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzbto extends zzcfn {
    public final zzbtn b;

    public zzbto(zzbtn zzbtn0, String s) {
        super(s);
        this.b = zzbtn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfn
    public final boolean zza(String s) {
        zzcfi.zze(("LeibnizHttpUrlPinger pinging URL: " + s));
        if("oda".equals(Uri.parse(s).getScheme())) {
            return true;
        }
        zzcfi.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(s);
    }
}

