package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;

public final class zzad implements DialogInterface.OnClickListener {
    public final zzas zza;
    public final String zzb;

    public zzad(zzas zzas0, String s) {
        this.zza = zzas0;
        this.zzb = s;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.getClass();
        Intent intent0 = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.zzb), "Share via");
        zzs.zzI(this.zza.a, intent0);
    }
}

