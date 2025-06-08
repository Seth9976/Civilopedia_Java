package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzctf implements zzcsp {
    public final CookieManager a;

    public zzctf(Context context0) {
        this.a = zzt.zzq().zzb(context0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map0) {
        CookieManager cookieManager0 = this.a;
        if(cookieManager0 == null) {
            return;
        }
        if(((String)map0.get("clear")) != null) {
            String s = (String)zzay.zzc().zzb(zzbhz.zzaH);
            String s1 = cookieManager0.getCookie(s);
            if(s1 != null) {
                List list0 = zzfpg.zzc(zzfoh.zzc(';')).zzf(s1);
                for(int v = 0; v < list0.size(); ++v) {
                    String s2 = (String)list0.get(v);
                    Iterator iterator0 = zzfpg.zzc(zzfoh.zzc('=')).zzd(s2).iterator();
                    iterator0.getClass();
                    if(!iterator0.hasNext()) {
                        throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                    }
                    Object object0 = iterator0.next();
                    cookieManager0.setCookie(s, ((String)object0) + ((String)zzay.zzc().zzb(zzbhz.zzau)));
                }
            }
            return;
        }
        String s3 = (String)map0.get("cookie");
        if(TextUtils.isEmpty(s3)) {
            return;
        }
        cookieManager0.setCookie(((String)zzay.zzc().zzb(zzbhz.zzaH)), s3);
    }
}

