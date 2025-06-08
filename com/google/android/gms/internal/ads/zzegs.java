package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Executor;

public final class zzegs implements zzefd {
    public final Context a;
    public final zzdky b;
    public final Executor c;
    public final zzfbk d;

    public zzegs(Context context0, Executor executor0, zzdky zzdky0, zzfbk zzfbk0) {
        this.a = context0;
        this.b = zzdky0;
        this.c = executor0;
        this.d = zzfbk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        String s = null;
        try {
            s = zzfbl0.zzw.getString("tab_url");
        }
        catch(Exception unused_ex) {
        }
        if(s != null) {
            Uri uri0 = Uri.parse(s);
            return zzfvc.zzn(zzfvc.zzi(null), new zzegq(this, uri0, zzfbx0, zzfbl0), this.c);
        }
        return zzfvc.zzn(zzfvc.zzi(null), new zzegq(this, null, zzfbx0, zzfbl0), this.c);
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        String s;
        if(this.a instanceof Activity && zzbix.zzg(this.a)) {
            try {
                s = null;
                s = zzfbl0.zzw.getString("tab_url");
            }
            catch(Exception unused_ex) {
            }
            return !TextUtils.isEmpty(s);
        }
        return false;
    }
}

