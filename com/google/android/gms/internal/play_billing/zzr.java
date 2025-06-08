package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.M7;
import java.io.Serializable;

public final class zzr {
    public Serializable a;
    public Z0 b;
    public zzw c;
    public boolean d;

    @Override
    public final void finalize() {
        Z0 z00 = this.b;
        if(z00 != null) {
            Y0 y00 = z00.j;
            if(!y00.isDone()) {
                u0 u00 = new u0(new M7("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 3));
                if(zzq.n.W(y00, null, u00)) {
                    zzq.b(y00);
                }
            }
        }
        if(!this.d) {
            zzw zzw0 = this.c;
            if(zzw0 != null) {
                zzw0.zzd(null);
            }
        }
    }

    public final boolean zzb(Object object0) {
        boolean z = true;
        this.d = true;
        Z0 z00 = this.b;
        if(z00 == null) {
            z = false;
        }
        else {
            Y0 y00 = z00.j;
            y00.getClass();
            if(object0 == null) {
                object0 = zzq.o;
            }
            if(zzq.n.W(y00, null, object0)) {
                zzq.b(y00);
            }
            else {
                z = false;
            }
        }
        if(z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }
}

