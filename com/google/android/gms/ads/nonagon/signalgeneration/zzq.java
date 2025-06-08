package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaod;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.concurrent.Callable;

public final class zzq implements Callable {
    public final zzaa zza;
    public final Uri zzb;
    public final IObjectWrapper zzc;

    public zzq(zzaa zzaa0, Uri uri0, IObjectWrapper iObjectWrapper0) {
        this.zza = zzaa0;
        this.zzb = uri0;
        this.zzc = iObjectWrapper0;
    }

    @Override
    public final Object call() {
        Uri uri0 = this.zzb;
        this.zza.getClass();
        try {
            Context context0 = this.zza.j;
            View view0 = (View)ObjectWrapper.unwrap(this.zzc);
            uri0 = this.zza.k.zza(uri0, context0, view0, null);
        }
        catch(zzaod zzaod0) {
            zzcfi.zzk("", zzaod0);
        }
        if(uri0.getQueryParameter("ms") == null) {
            throw new Exception("Failed to append spam signals to click url.");
        }
        return uri0;
    }
}

