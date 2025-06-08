package com.google.android.gms.internal.ads;

import jeb.synthetic.FIN;

public final class zzcz {
    public final zzcx a;
    public boolean b;

    public zzcz() {
        throw null;
    }

    public zzcz(zzcx zzcx0) {
        this.a = zzcx0;
    }

    public final void zza() throws InterruptedException {
        synchronized(this) {
            while(!this.b) {
                this.wait();
            }
        }
    }

    public final void zzb() {
        int v;
        __monitor_enter(this);
        boolean z = false;
    alab1:
        while(true) {
            v = FIN.finallyOpen$NT();
            while(true) {
                if(this.b) {
                    break alab1;
                }
                try {
                    this.wait();
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                    break;
                }
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
            FIN.finallyExec$NT(v);
            return;
        }
        FIN.finallyCodeBegin$NT(v);
        __monitor_exit(this);
        FIN.finallyCodeEnd$NT(v);
    }

    public final boolean zzc() {
        boolean z;
        synchronized(this) {
            z = this.b;
            this.b = false;
        }
        return z;
    }

    public final boolean zzd() {
        synchronized(this) {
        }
        return this.b;
    }

    public final boolean zze() {
        synchronized(this) {
            if(this.b) {
                return false;
            }
            this.b = true;
            this.notifyAll();
            return true;
        }
    }
}

