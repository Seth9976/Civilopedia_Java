package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

public final class i3 implements DialogInterface.OnCancelListener {
    public final int i;
    public final JsResult j;

    public i3(JsResult jsResult0, int v) {
        this.i = v;
        this.j = jsResult0;
        super();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        if(this.i != 0) {
            ((JsPromptResult)this.j).cancel();
            return;
        }
        this.j.cancel();
    }
}

