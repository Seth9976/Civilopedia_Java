package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzfjw {
    public static float zza(View view0) {
        return view0.getZ();
    }

    public static String zzb(View view0) {
        if(view0.isAttachedToWindow()) {
            switch(view0.getVisibility()) {
                case 0: {
                    return view0.getAlpha() == 0.0f ? "viewAlphaZero" : null;
                }
                case 4: {
                    return "viewInvisible";
                }
                case 8: {
                    return "viewGone";
                }
                default: {
                    return "viewNotVisible";
                }
            }
        }
        return "notAttached";
    }
}

