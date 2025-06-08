package com.google.android.gms.ads.internal.offline.buffering;

import Y.f;
import Y.i;
import Y.k;
import Y.l;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbxl;

@KeepForSdk
public class OfflineNotificationPoster extends Worker {
    public final zzbxl o;

    public OfflineNotificationPoster(Context context0, WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
        this.o = zzaw.zza().zzl(context0, new zzbtx());
    }

    @Override  // androidx.work.Worker
    public final l doWork() {
        Object object0 = this.getInputData().a.get("uri");
        String s = null;
        String s1 = object0 instanceof String ? ((String)object0) : null;
        Object object1 = this.getInputData().a.get("gws_query_id");
        if(object1 instanceof String) {
            s = (String)object1;
        }
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.getApplicationContext());
            this.o.zzg(iObjectWrapper0, s1, s);
            return new k(f.c);
        }
        catch(RemoteException unused_ex) {
            return new i();
        }
    }
}

