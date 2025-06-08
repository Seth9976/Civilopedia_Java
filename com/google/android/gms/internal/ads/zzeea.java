package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo.DetailedState;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzeea extends zzeeb {
    public final Context c;
    public final zzdaz d;
    public final TelephonyManager e;
    public final zzeds f;
    public int g;
    public static final SparseArray h;

    static {
        SparseArray sparseArray0 = new SparseArray();
        zzeea.h = sparseArray0;
        sparseArray0.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbfz.zzc);
        sparseArray0.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbfz.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbfz.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbfz.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbfz.zzd);
        sparseArray0.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbfz.zze);
        sparseArray0.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbfz.zze);
        sparseArray0.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbfz.zze);
        sparseArray0.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbfz.zze);
        sparseArray0.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbfz.zze);
        sparseArray0.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbfz.zzf);
        sparseArray0.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbfz.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbfz.zzb);
    }

    public zzeea(Context context0, zzdaz zzdaz0, zzeds zzeds0, zzedo zzedo0, zzg zzg0) {
        super(zzedo0, zzg0);
        this.c = context0;
        this.d = zzdaz0;
        this.f = zzeds0;
        this.e = (TelephonyManager)context0.getSystemService("phone");
    }

    public final void zzd(boolean z) {
        zzfvc.zzr(this.d.zzb(), new h5(this, z), zzcfv.zzf);
    }
}

