package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbbh {
    public final Object a;
    public z1 b;
    public boolean c;

    public zzbbh() {
        this.a = new Object();
        this.b = null;
        this.c = false;
    }

    public final Activity zza() {
        synchronized(this.a) {
            z1 z10 = this.b;
            if(z10 != null) {
                return z10.i;
            }
        }
        return null;
    }

    public final Context zzb() {
        synchronized(this.a) {
            z1 z10 = this.b;
            if(z10 != null) {
                return z10.j;
            }
        }
        return null;
    }

    public final void zzc(zzbbg zzbbg0) {
        synchronized(this.a) {
            if(this.b == null) {
                this.b = new z1();
            }
            this.b.a(zzbbg0);
        }
    }

    public final void zzd(Context context0) {
        synchronized(this.a) {
            if(!this.c) {
                Context context1 = context0.getApplicationContext();
                if(context1 == null) {
                    context1 = context0;
                }
                Application application0 = context1 instanceof Application ? ((Application)context1) : null;
                if(application0 == null) {
                    zzcfi.zzj("Can not cast Context to Application");
                    return;
                }
                if(this.b == null) {
                    this.b = new z1();
                }
                z1 z10 = this.b;
                if(!z10.q) {
                    application0.registerActivityLifecycleCallbacks(z10);
                    if(context0 instanceof Activity) {
                        z10.c(((Activity)context0));
                    }
                    z10.j = application0;
                    z10.r = (long)(((Long)zzay.zzc().zzb(zzbhz.zzaM)));
                    z10.q = true;
                }
                this.c = true;
            }
        }
    }

    public final void zze(zzbbg zzbbg0) {
        synchronized(this.a) {
            z1 z10 = this.b;
            if(z10 == null) {
                return;
            }
            z10.b(zzbbg0);
        }
    }
}

