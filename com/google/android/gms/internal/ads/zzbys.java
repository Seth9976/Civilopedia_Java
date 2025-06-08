package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class zzbys {
    public final View a;
    public final zzcdz b;

    public zzbys(zzbyr zzbyr0) {
        View view0 = zzbyr0.a;
        this.a = view0;
        HashMap hashMap0 = zzbyr0.b;
        zzcdz zzcdz0 = zzbym.zza(view0.getContext());
        this.b = zzcdz0;
        if(zzcdz0 != null && !hashMap0.isEmpty()) {
            try {
                zzcdz0.zzf(new zzbyt(ObjectWrapper.wrap(view0).asBinder(), ObjectWrapper.wrap(hashMap0).asBinder()));
            }
            catch(RemoteException unused_ex) {
                zzcfi.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            zzcdz zzcdz0 = this.b;
            if(zzcdz0 == null) {
                zzcfi.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                zzcdz0.zzg(list0, ObjectWrapper.wrap(this.a), new n2(list0, 1));
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzg(("RemoteException recording click: " + remoteException0.toString()));
            }
            return;
        }
        zzcfi.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            zzcdz zzcdz0 = this.b;
            if(zzcdz0 != null) {
                try {
                    zzcdz0.zzh(list0, ObjectWrapper.wrap(this.a), new n2(list0, 0));
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzg(("RemoteException recording impression urls: " + remoteException0.toString()));
                }
                return;
            }
            zzcfi.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        zzcfi.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent0) {
        zzcdz zzcdz0 = this.b;
        if(zzcdz0 != null) {
            try {
                zzcdz0.zzj(ObjectWrapper.wrap(motionEvent0));
            }
            catch(RemoteException unused_ex) {
                zzcfi.zzg("Failed to call remote method.");
            }
            return;
        }
        zzcfi.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri0, UpdateClickUrlCallback updateClickUrlCallback0) {
        try {
            this.b.zzk(new ArrayList(Arrays.asList(new Uri[]{uri0})), ObjectWrapper.wrap(this.a), new m2(updateClickUrlCallback0, 1));
        }
        catch(RemoteException unused_ex) {
        }
    }

    public final void zze(List list0, UpdateImpressionUrlsCallback updateImpressionUrlsCallback0) {
        try {
            this.b.zzl(list0, ObjectWrapper.wrap(this.a), new m2(updateImpressionUrlsCallback0, 0));
        }
        catch(RemoteException unused_ex) {
        }
    }
}

