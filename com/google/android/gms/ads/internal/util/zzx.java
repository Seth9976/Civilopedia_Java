package com.google.android.gms.ads.internal.util;

import C.a;
import android.annotation.TargetApi;
import android.app.Activity;
import android.media.AudioManager;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhz;
import javax.annotation.ParametersAreNonnullByDefault;

@TargetApi(28)
@ParametersAreNonnullByDefault
public class zzx extends zzv {
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final int zzi(AudioManager audioManager0) {
        return a.a(audioManager0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final void zzj(Activity activity0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzaZ)).booleanValue() && zzt.zzo().zzh().zzm() == null && !activity0.isInMultiWindowMode()) {
            Window window0 = activity0.getWindow();
            WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
            if(1 != windowManager$LayoutParams0.layoutInDisplayCutoutMode) {
                windowManager$LayoutParams0.layoutInDisplayCutoutMode = 1;
                window0.setAttributes(windowManager$LayoutParams0);
            }
            activity0.getWindow().getDecorView().setOnApplyWindowInsetsListener(new zzw(this, activity0));
        }
    }
}

