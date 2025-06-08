package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbym {
    public final Context a;
    public final AdFormat b;
    public final zzdr c;
    public static zzcdz d;

    public zzbym(Context context0, AdFormat adFormat0, zzdr zzdr0) {
        this.a = context0;
        this.b = adFormat0;
        this.c = zzdr0;
    }

    public static zzcdz zza(Context context0) {
        synchronized(zzbym.class) {
            if(zzbym.d == null) {
                zzbym.d = zzaw.zza().zzq(context0, new zzbtx());
            }
            return zzbym.d;
        }
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        Context context0 = this.a;
        zzcdz zzcdz0 = zzbym.zza(context0);
        if(zzcdz0 == null) {
            queryInfoGenerationCallback0.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
        zzl zzl0 = this.c == null ? new zzm().zza() : zzp.zza.zza(context0, this.c);
        zzced zzced0 = new zzced(null, this.b.name(), null, zzl0);
        try {
            zzcdz0.zze(iObjectWrapper0, zzced0, new l2(queryInfoGenerationCallback0));
        }
        catch(RemoteException unused_ex) {
            queryInfoGenerationCallback0.onFailure("Internal Error.");
        }
    }
}

