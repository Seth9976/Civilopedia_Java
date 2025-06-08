package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzaix;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzaje;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzajq;
import com.google.android.gms.internal.ads.zzajx;
import com.google.android.gms.internal.ads.zzakc;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzcfb;
import java.io.File;
import java.util.regex.Pattern;

public final class zzax extends zzajq {
    public final Context b;

    public zzax(Context context0, zzakc zzakc0) {
        super(zzakc0);
        this.b = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzajq
    public final zzaix zza(zzajb zzajb0) throws zzajk {
        if(zzajb0.zza() == 0 && Pattern.matches(((String)zzay.zzc().zzb(zzbhz.zzdy)), zzajb0.zzk())) {
            Context context0 = this.b;
            if(zzcfb.zzr(context0, 13400000)) {
                zzaix zzaix0 = new zzbqf(context0).zza(zzajb0);
                if(zzaix0 != null) {
                    zze.zza(("Got gmscore asset response: " + zzajb0.zzk()));
                    return zzaix0;
                }
                zze.zza(("Failed to get gmscore asset response: " + zzajb0.zzk()));
            }
        }
        return super.zza(zzajb0);
    }

    public static zzaje zzb(Context context0) {
        zzax zzax0 = new zzax(context0, new zzakc(null, null));
        zzaje zzaje0 = new zzaje(new zzajx(new File(context0.getCacheDir(), "admob_volley"), 0x1400000), zzax0, 4);
        zzaje0.zzd();
        return zzaje0;
    }
}

