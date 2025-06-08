package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzdoo implements zzbom {
    public final zzdos zza;

    public zzdoo(zzdos zzdos0) {
        this.zza = zzdos0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        ((zzcli)object0).zzP().zzz(new zzdor(this.zza, map0));
        Object object1 = map0.get("overlayHtml");
        Object object2 = map0.get("baseUrl");
        if(TextUtils.isEmpty(((String)object2))) {
            ((zzcli)object0).loadData(((String)object1), "text/html", "UTF-8");
            return;
        }
        ((zzcli)object0).loadDataWithBaseURL(((String)object2), ((String)object1), "text/html", "UTF-8", null);
    }
}

