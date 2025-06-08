package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzcjj implements zzbom {
    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzchr zzchr0 = (zzchr)object0;
        zzcme zzcme0 = zzchr0.zzs();
        try {
            if(zzcme0 == null) {
                zzcme zzcme1 = new zzcme(zzchr0, Float.parseFloat(((String)map0.get("duration"))), "1".equals(map0.get("customControlsAllowed")), "1".equals(map0.get("clickToExpandAllowed")));
                zzchr0.zzE(zzcme1);
                zzcme0 = zzcme1;
            }
            float f = Float.parseFloat(((String)map0.get("duration")));
            boolean z = "1".equals(map0.get("muted"));
            float f1 = Float.parseFloat(((String)map0.get("currentTime")));
            int v = Integer.parseInt(((String)map0.get("playbackState")));
            if(v < 0 || v > 3) {
                v = 0;
            }
            String s = (String)map0.get("aspectRatio");
            float f2 = TextUtils.isEmpty(s) ? 0.0f : Float.parseFloat(s);
            if(zzcfi.zzm(3)) {
                zzcfi.zze(("Video Meta GMSG: currentTime : " + f1 + " , duration : " + f + " , isMuted : " + z + " , playbackState : " + v + " , aspectRatio : " + s));
            }
            zzcme0.zzc(f1, f, v, z, f2);
            return;
        }
        catch(NullPointerException | NumberFormatException nullPointerException0) {
        }
        zzcfi.zzh("Unable to parse videoMeta message.", nullPointerException0);
        zzt.zzo().zzt(nullPointerException0, "VideoMetaGmsgHandler.onGmsg");
    }
}

