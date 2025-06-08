package com.google.android.gms.common.images;

import O0.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;

public abstract class zag {
    public final a a;
    public int b;

    public zag(Uri uri0, int v) {
        this.a = new a(uri0);
        this.b = v;
    }

    public abstract void a(Drawable arg1, boolean arg2, boolean arg3, boolean arg4);

    public final void b(Context context0, boolean z) {
        int v = this.b;
        this.a((v == 0 ? null : context0.getResources().getDrawable(v)), z, false, false);
    }
}

