package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzccj;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzb {
    public final Context a;
    public boolean b;
    public final zzccj c;
    public final zzbzj d;

    public zzb(Context context0, zzccj zzccj0, zzbzj zzbzj0) {
        this.a = context0;
        this.c = zzccj0;
        this.d = new zzbzj(false, Collections.emptyList());
    }

    public final void zza() {
        this.b = true;
    }

    public final void zzb(String s) {
        zzbzj zzbzj0 = this.d;
        zzccj zzccj0 = this.c;
        if(zzccj0 != null && zzccj0.zza().zzf || zzbzj0.zza) {
            if(s == null) {
                s = "";
            }
            if(zzccj0 != null) {
                zzccj0.zzd(s, null, 3);
                return;
            }
            if(zzbzj0.zza) {
                List list0 = zzbzj0.zzb;
                if(list0 != null) {
                    for(Object object0: list0) {
                        String s1 = (String)object0;
                        if(!TextUtils.isEmpty(s1)) {
                            String s2 = s1.replace("{NAVIGATION_URL}", Uri.encode(s));
                            zzs.zzG(this.a, "", s2);
                        }
                    }
                }
            }
        }
    }

    // 去混淆评级： 低(40)
    public final boolean zzc() {
        return (this.c == null || !this.c.zza().zzf) && !this.d.zza || this.b;
    }
}

