package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager.LayoutParams;
import com.google.android.gms.ads.internal.zzt;

public final class zzw implements View.OnApplyWindowInsetsListener {
    public final zzx zza;
    public final Activity zzb;

    public zzw(zzx zzx0, Activity activity0) {
        this.zza = zzx0;
        this.zzb = activity0;
    }

    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        Activity activity0 = this.zzb;
        if(zzt.zzo().zzh().zzm() == null) {
            DisplayCutout displayCutout0 = windowInsets0.getDisplayCutout();
            String s = "";
            if(displayCutout0 == null) {
                zzt.zzo().zzh().zzC("");
            }
            else {
                zzg zzg0 = zzt.zzo().zzh();
                for(Object object0: displayCutout0.getBoundingRects()) {
                    String s1 = ((Rect)object0).left + "," + ((Rect)object0).top + "," + ((Rect)object0).right + "," + ((Rect)object0).bottom;
                    if(!TextUtils.isEmpty(s)) {
                        s = s + "|";
                    }
                    s = s + s1;
                }
                zzg0.zzC(s);
            }
        }
        Window window0 = activity0.getWindow();
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        if(2 != windowManager$LayoutParams0.layoutInDisplayCutoutMode) {
            windowManager$LayoutParams0.layoutInDisplayCutoutMode = 2;
            window0.setAttributes(windowManager$LayoutParams0);
        }
        return view0.onApplyWindowInsets(windowInsets0);
    }
}

