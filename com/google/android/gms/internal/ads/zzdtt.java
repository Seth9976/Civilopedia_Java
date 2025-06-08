package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

public final class zzdtt {
    public Context a;
    public PopupWindow b;

    public final void zza(Context context0, View view0) {
    }

    public final void zzb() {
        Context context0 = this.a;
        if(context0 != null && this.b != null) {
            if((!(context0 instanceof Activity) || !((Activity)context0).isDestroyed()) && this.b.isShowing()) {
                this.b.dismiss();
            }
            this.a = null;
            this.b = null;
        }
    }
}

