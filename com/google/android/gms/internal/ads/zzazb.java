package com.google.android.gms.internal.ads;

public final class zzazb {
    public boolean a;

    public final void zza() throws InterruptedException {
        synchronized(this) {
            while(!this.a) {
                this.wait();
            }
        }
    }

    public final boolean zzb() {
        boolean z;
        synchronized(this) {
            z = this.a;
            this.a = false;
        }
        return z;
    }

    public final boolean zzc() {
        synchronized(this) {
            if(this.a) {
                return false;
            }
            this.a = true;
            this.notifyAll();
            return true;
        }
    }
}

