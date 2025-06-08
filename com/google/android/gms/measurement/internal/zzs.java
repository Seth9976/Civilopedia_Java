package com.google.android.gms.measurement.internal;

import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import i1.r;

public final class zzs {
    public final zzge a;

    public zzs(zzge zzge0) {
        this.a = zzge0;
    }

    public final void a(String s, Bundle bundle0) {
        CharSequence charSequence0;
        zzge zzge0 = this.a;
        zzge0.zzaz().zzg();
        if(!zzge0.zzJ()) {
            if(bundle0.isEmpty()) {
                charSequence0 = null;
            }
            else {
                if(s.isEmpty()) {
                    s = "auto";
                }
                Uri.Builder uri$Builder0 = new Uri.Builder();
                uri$Builder0.path(s);
                for(Object object0: bundle0.keySet()) {
                    uri$Builder0.appendQueryParameter(((String)object0), bundle0.getString(((String)object0)));
                }
                charSequence0 = uri$Builder0.build().toString();
            }
            if(!TextUtils.isEmpty(charSequence0)) {
                zzge0.zzm().t.zzb(((String)charSequence0));
                r r0 = zzge0.zzm();
                long v = zzge0.zzav().currentTimeMillis();
                r0.u.zzb(v);
            }
        }
    }

    public final boolean b() {
        return this.a.zzm().u.zza() > 0L;
    }

    public final boolean c() {
        return this.b() ? this.a.zzav().currentTimeMillis() - this.a.zzm().u.zza() > this.a.zzf().zzi(null, zzeh.zzQ) : false;
    }
}

