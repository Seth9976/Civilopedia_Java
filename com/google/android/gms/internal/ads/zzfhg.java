package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

public final class zzfhg {
    public static zzfhh zza(Context context0, int v) {
        boolean z;
        if(zzfhu.zza()) {
            if(v - 2 == 20 || v - 2 == 21) {
                z = ((Boolean)zzbji.zze.zze()).booleanValue();
            }
            else {
                switch(v - 2) {
                    case 5: {
                        z = ((Boolean)zzbji.zzb.zze()).booleanValue();
                        break;
                    }
                    case 2: 
                    case 3: 
                    case 6: 
                    case 7: 
                    case 8: {
                        z = ((Boolean)zzbji.zzc.zze()).booleanValue();
                        break;
                    }
                    case 4: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: {
                        z = ((Boolean)zzbji.zzd.zze()).booleanValue();
                        break;
                    }
                    default: {
                        return new zzfid();  // 初始化器: Ljava/lang/Object;-><init>()V
                    }
                }
            }
            if(z) {
                return new zzfhj(context0, v);
            }
        }
        return new zzfid();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static zzfhh zzb(Context context0, int v, int v1, zzl zzl0) {
        zzfhh zzfhh0 = zzfhg.zza(context0, v);
        if(!(zzfhh0 instanceof zzfhj)) {
            return zzfhh0;
        }
        zzfhh0.zzf();
        zzfhh0.zzk(v1);
        if(zzfhr.zze(zzl0.zzp)) {
            zzfhh0.zzd(zzl0.zzp);
        }
        return zzfhh0;
    }
}

