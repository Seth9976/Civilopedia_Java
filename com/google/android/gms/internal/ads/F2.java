package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import com.google.android.gms.ads.internal.util.zzs;

public final class f2 implements DialogInterface.OnClickListener {
    public final int i;
    public final zzbwn j;

    public f2(zzbwn zzbwn0, int v) {
        this.i = v;
        this.j = zzbwn0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        if(this.i != 0) {
            this.j.zzg("Operation denied by user.");
            return;
        }
        zzbwn zzbwn0 = this.j;
        Intent intent0 = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        intent0.putExtra("title", zzbwn0.e);
        intent0.putExtra("eventLocation", zzbwn0.i);
        intent0.putExtra("description", zzbwn0.h);
        long v1 = zzbwn0.f;
        if(v1 > -1L) {
            intent0.putExtra("beginTime", v1);
        }
        long v2 = zzbwn0.g;
        if(v2 > -1L) {
            intent0.putExtra("endTime", v2);
        }
        intent0.setFlags(0x10000000);
        zzs.zzI(zzbwn0.d, intent0);
    }
}

