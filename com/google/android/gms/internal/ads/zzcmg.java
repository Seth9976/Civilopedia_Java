package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzcmg implements Runnable {
    public final zzcmi zza;
    public final String zzb;

    public zzcmg(zzcmi zzcmi0, String s) {
        this.zza = zzcmi0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        Uri uri0 = Uri.parse(this.zzb);
        zzclp zzclp0 = ((o3)this.zza.b.zza).u;
        if(zzclp0 == null) {
            zzcfi.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
            return;
        }
        zzclp0.zzi(uri0);
    }
}

