package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import i1.c0;

public final class zzfa extends c0 {
    public zzfa(zzlf zzlf0) {
        super(zzlf0);
    }

    @Override  // i1.c0
    public final void b() {
    }

    public final boolean zza() {
        this.a();
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.a.zzau().getSystemService("connectivity");
        NetworkInfo networkInfo0 = null;
        if(connectivityManager0 != null) {
            try {
                networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            }
            catch(SecurityException unused_ex) {
            }
        }
        return networkInfo0 != null && networkInfo0.isConnected();
    }
}

