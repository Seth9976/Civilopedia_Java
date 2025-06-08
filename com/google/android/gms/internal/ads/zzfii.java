package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

public final class zzfii {
    public final Context a;
    public final zzfvm b;
    public final zzcfn c;
    public final zzfhu d;

    public zzfii(Context context0, zzfvm zzfvm0, zzcfn zzcfn0, zzfhu zzfhu0) {
        this.a = context0;
        this.b = zzfvm0;
        this.c = zzcfn0;
        this.d = zzfhu0;
    }

    public final void zzc(String s, zzfhs zzfhs0) {
        boolean z = zzfhu.zza();
        zzfvm zzfvm0 = this.b;
        if(z && ((Boolean)zzbji.zzd.zze()).booleanValue()) {
            zzfvm0.execute(new zzfih(this, s, zzfhs0));
            return;
        }
        zzfvm0.execute(new zzfig(this, s));
    }

    public final void zzd(List list0) {
        for(Object object0: list0) {
            this.zzc(((String)object0), null);
        }
    }
}

