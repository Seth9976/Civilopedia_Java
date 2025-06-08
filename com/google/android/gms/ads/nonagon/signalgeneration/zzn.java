package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfok;
import java.util.ArrayList;
import java.util.List;

public final class zzn implements zzfok {
    public final zzaa zza;
    public final List zzb;

    public zzn(zzaa zzaa0, List list0) {
        this.zza = zzaa0;
        this.zzb = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        zzaa zzaa0 = this.zza;
        zzaa0.getClass();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: this.zzb) {
            Uri uri0 = (Uri)object1;
            if(zzaa.g(uri0, zzaa0.I, zzaa0.J) && !TextUtils.isEmpty(((String)object0))) {
                arrayList0.add(zzaa.h(uri0, "nas", ((String)object0)));
            }
            else {
                arrayList0.add(uri0);
            }
        }
        return arrayList0;
    }
}

