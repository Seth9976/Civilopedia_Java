package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbos implements zzbom {
    public final Context a;

    public zzbos(Context context0) {
        this.a = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        Context context0 = this.a;
        if(!zzt.zzn().zzu(context0)) {
            return;
        }
        String s = (String)map0.get("eventName");
        String s1 = (String)map0.get("eventId");
        switch(s) {
            case "_aa": {
                zzt.zzn().zzk(context0, s1);
                return;
            }
            case "_ac": {
                zzt.zzn().zzm(context0, s1);
                return;
            }
            case "_ai": {
                zzt.zzn().zzn(context0, s1);
                return;
            }
            default: {
                zzcfi.zzg("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}

