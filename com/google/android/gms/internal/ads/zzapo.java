package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class zzapo extends zzaqn {
    public final Context h;
    public static final zzaqo i;

    static {
        zzapo.i = new zzaqo();
    }

    public zzapo(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1, Context context0) {
        super(zzapc0, "jP+6II/RqbFgO1yXDlTKTZh3PSPs7B8S68QmevSn/bVP2NzeS5BO3umQKUdsHS/c", "GLyIO6R2q01pjCn0D3/H49YHLEvqvbC5vDeJpi09sqQ=", zzali0, v, 29);
        this.h = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        this.d.zzm("E");
        AtomicReference atomicReference0 = zzapo.i.zza("com.spears.civilopedia");
        if(atomicReference0.get() == null) {
            synchronized(atomicReference0) {
                if(atomicReference0.get() == null) {
                    atomicReference0.set(((String)this.e.invoke(null, this.h)));
                }
            }
        }
        String s = (String)atomicReference0.get();
        synchronized(this.d) {
            String s1 = zzamn.zza(s.getBytes(), true);
            this.d.zzm(s1);
        }
    }
}

