package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsResult;

public final class j3 implements DialogInterface.OnClickListener {
    public final int i;
    public final JsResult j;

    public j3(JsResult jsResult0, int v) {
        this.i = v;
        this.j = jsResult0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        if(this.i != 0) {
            this.j.confirm();
            return;
        }
        this.j.cancel();
    }
}

