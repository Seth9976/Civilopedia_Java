package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import javax.annotation.ParametersAreNonnullByDefault;

@TargetApi(30)
@ParametersAreNonnullByDefault
public final class zzy extends zzx {
    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final int zzl(Context context0) {
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzhe)).booleanValue() ? 0 : super.zzl(context0);
    }
}

