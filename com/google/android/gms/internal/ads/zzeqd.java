package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

public final class zzeqd implements Callable {
    public final zzeqe zza;

    public zzeqd(zzeqe zzeqe0) {
        this.zza = zzeqe0;
    }

    @Override
    public final Object call() {
        String s2;
        String s1;
        String s;
        zzbbm zzbbm0 = zzt.zzo().zzh().zzg();
        Bundle bundle0 = null;
        if(zzbbm0 != null && (!zzt.zzo().zzh().zzM() || !zzt.zzo().zzh().zzN())) {
            if(zzbbm0.zzh()) {
                zzbbm0.zzg();
            }
            zzbbc zzbbc0 = zzbbm0.zza();
            if(zzbbc0 == null) {
                s = zzt.zzo().zzh().zzj();
                s2 = zzt.zzo().zzh().zzk();
                s1 = null;
            }
            else {
                s = zzbbc0.zzd();
                s1 = zzbbc0.zze();
                s2 = zzbbc0.zzf();
                if(s != null) {
                    zzt.zzo().zzh().zzw(s);
                }
                if(s2 != null) {
                    zzt.zzo().zzh().zzy(s2);
                }
            }
            Bundle bundle1 = new Bundle(1);
            if(!zzt.zzo().zzh().zzN()) {
                if(s2 == null || TextUtils.isEmpty(s2)) {
                    bundle1.putString("v_fp_vertical", "no_hash");
                }
                else {
                    bundle1.putString("v_fp_vertical", s2);
                }
            }
            if(s != null && !zzt.zzo().zzh().zzM()) {
                bundle1.putString("fingerprint", s);
                if(!s.equals(s1)) {
                    bundle1.putString("v_fp", s1);
                }
            }
            if(!bundle1.isEmpty()) {
                bundle0 = bundle1;
            }
        }
        return new zzeqf(bundle0);
    }
}

