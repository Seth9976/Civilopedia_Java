package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbnp implements zzbom {
    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        long v2;
        long v1;
        long v;
        String s = (String)map0.get("action");
        if("tick".equals(s)) {
            String s1 = (String)map0.get("label");
            String s2 = (String)map0.get("start_label");
            String s3 = (String)map0.get("timestamp");
            if(TextUtils.isEmpty(s1)) {
                zzcfi.zzj("No label given for CSI tick.");
                return;
            }
            if(TextUtils.isEmpty(s3)) {
                zzcfi.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                v = Long.parseLong(s3);
                v1 = zzt.zzA().currentTimeMillis();
                v2 = zzt.zzA().elapsedRealtime();
            }
            catch(NumberFormatException numberFormatException0) {
                zzcfi.zzk("Malformed timestamp for CSI tick.", numberFormatException0);
                return;
            }
            if(TextUtils.isEmpty(s2)) {
                s2 = "native:view_load";
            }
            ((zzcli)object0).zzo().zzc(s1, s2, v - v1 + v2);
            return;
        }
        if("experiment".equals(s)) {
            String s4 = (String)map0.get("value");
            if(TextUtils.isEmpty(s4)) {
                zzcfi.zzj("No value given for CSI experiment.");
                return;
            }
            ((zzcli)object0).zzo().zza().zzd("e", s4);
            return;
        }
        if("extra".equals(s)) {
            String s5 = (String)map0.get("name");
            String s6 = (String)map0.get("value");
            if(TextUtils.isEmpty(s6)) {
                zzcfi.zzj("No value given for CSI extra.");
                return;
            }
            if(TextUtils.isEmpty(s5)) {
                zzcfi.zzj("No name given for CSI extra.");
                return;
            }
            ((zzcli)object0).zzo().zza().zzd(s5, s6);
        }
    }
}

