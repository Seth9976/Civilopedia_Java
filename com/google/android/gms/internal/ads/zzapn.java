package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class zzapn extends zzaqn {
    public zzapn(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "HKJ68+GFVOzzlXIErXZFscWEuic4IS+F1/JC4SL0ZBjl5Wpepiw6AwYzzVdq4ZK/", "QnEQ5Lj6VZj+ZyIvg9+5D3/xHwfXHkc5MHdc8LLlnMs=", zzali0, v, 49);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        int v = 1;
        zzali zzali0 = this.d;
        zzali0.zzZ(3);
        try {
            if(((Boolean)this.e.invoke(null, new Object[]{this.a.zzb()})).booleanValue()) {
                v = 2;
            }
            zzali0.zzZ(v);
        }
        catch(InvocationTargetException invocationTargetException0) {
            if(!(invocationTargetException0.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw invocationTargetException0;
            }
        }
    }
}

