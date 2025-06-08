package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

public final class zzetq implements Callable {
    public final zzetr zza;

    public zzetq(zzetr zzetr0) {
        this.zza = zzetr0;
    }

    @Override
    public final Object call() {
        int v2;
        Context context0 = this.zza.b;
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        String s = telephonyManager0.getNetworkOperator();
        int v = telephonyManager0.getPhoneType();
        int v1 = -1;
        if(zzs.zzx(context0, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 == null) {
                v2 = -1;
            }
            else {
                v2 = networkInfo0.getType();
                v1 = networkInfo0.getDetailedState().ordinal();
            }
            boolean z = connectivityManager0.isActiveNetworkMetered();
            return new zzetp(s, v2, zzt.zzq().zzl(context0), v, z, v1);
        }
        return new zzetp(s, -2, zzt.zzq().zzl(context0), v, false, -1);
    }
}

