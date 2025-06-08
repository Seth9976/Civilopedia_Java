package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzs implements Callable {
    public final zzaa zza;
    public final List zzb;
    public final IObjectWrapper zzc;

    public zzs(zzaa zzaa0, List list0, IObjectWrapper iObjectWrapper0) {
        this.zza = zzaa0;
        this.zzb = list0;
        this.zzc = iObjectWrapper0;
    }

    @Override
    public final Object call() {
        zzaa zzaa0 = this.zza;
        List list0 = this.zzb;
        String s = zzaa0.k.zzc() == null ? "" : zzaa0.k.zzc().zzh(zzaa0.j, ((View)ObjectWrapper.unwrap(this.zzc)), null);
        if(TextUtils.isEmpty(s)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            Uri uri0 = (Uri)object0;
            if(zzaa.g(uri0, zzaa0.I, zzaa0.J)) {
                arrayList0.add(zzaa.h(uri0, "ms", s));
            }
            else {
                zzcfi.zzj(("Not a Google URL: " + uri0));
                arrayList0.add(uri0);
            }
        }
        if(arrayList0.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList0;
    }
}

