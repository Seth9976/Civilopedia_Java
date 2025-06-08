package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzerz implements zzetf {
    public final String a;
    public final String b;

    public zzerz(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfT)).booleanValue()) {
            ((Bundle)object0).putString("request_id", this.b);
            return;
        }
        ((Bundle)object0).putString("request_id", this.a);
    }
}

