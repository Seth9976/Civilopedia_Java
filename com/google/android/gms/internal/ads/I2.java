package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;

public final class i2 implements DialogInterface.OnClickListener {
    public final int i;
    public final Object j;

    public i2(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        if(this.i != 0) {
            ((JsPromptResult)this.j).cancel();
            return;
        }
        ((zzbws)this.j).zzg("User canceled the download.");
    }
}

