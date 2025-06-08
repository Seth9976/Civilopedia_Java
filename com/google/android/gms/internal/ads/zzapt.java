package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

public final class zzapt extends zzaqn {
    public zzapt(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "Za6LxNnVxz2lEtZQYrJ2QLB5PwaCpmcdWBAdgk+Rc+b6fjcW8QKpJ7ITar8M3xU9", "2mbuydE9pw99Ld1EHQbedo6oUJcW1o/QWNiH9X+lcIw=", zzali0, v, 24);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        if(!this.a.zzq()) {
            synchronized(this.d) {
                String s = (String)this.e.invoke(null, this.a.zzb());
                this.d.zzr(s);
            }
            return;
        }
        this.b();
    }

    public final void b() {
        AdvertisingIdClient advertisingIdClient0 = this.a.zzh();
        if(advertisingIdClient0 == null) {
            return;
        }
        try {
            Info advertisingIdClient$Info0 = advertisingIdClient0.getInfo();
            String s = zzapf.zzd(advertisingIdClient$Info0.getId());
            if(s != null) {
                synchronized(this.d) {
                    this.d.zzr(s);
                    this.d.zzq(advertisingIdClient$Info0.isLimitAdTrackingEnabled());
                    this.d.zzaa(6);
                }
            }
        }
        catch(IOException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final Object call() throws Exception {
        this.zzk();
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final Void zzk() throws Exception {
        zzapc zzapc0 = this.a;
        if(zzapc0.zzr()) {
            super.zzk();
            return null;
        }
        if(zzapc0.zzq()) {
            this.b();
        }
        return null;
    }
}

