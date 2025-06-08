package com.google.android.gms.internal.ads;

public final class zzbsg extends zzcgh {
    public final Object c;
    public final zzbsl d;
    public boolean e;

    public zzbsg(zzbsl zzbsl0) {
        this.c = new Object();
        this.d = zzbsl0;
    }

    public final void zzb() {
        synchronized(this.c) {
            if(this.e) {
                return;
            }
            this.e = true;
            this.zzi(new S(9), new zzcgd());
            this.zzi(new Z1(this, 0), new Z1(this, 1));
        }
    }
}

