package com.google.android.gms.internal.measurement;

public class zzkr {
    public volatile zzll a;
    public volatile zzjd b;

    static {
        zzjq.zza();
    }

    public final void a(zzll zzll0) {
        if(this.a != null) {
            return;
        }
        synchronized(this) {
            if(this.a == null) {
                this.a = zzll0;
                this.b = zzjd.zzb;
            }
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzkr)) {
            return false;
        }
        zzll zzll0 = this.a;
        zzll zzll1 = ((zzkr)object0).a;
        if(zzll0 == null && zzll1 == null) {
            return this.zzb().equals(((zzkr)object0).zzb());
        }
        if(zzll0 != null && zzll1 != null) {
            return zzll0.equals(zzll1);
        }
        if(zzll0 != null) {
            ((zzkr)object0).a(zzll0.zzbO());
            return zzll0.equals(((zzkr)object0).a);
        }
        this.a(zzll1.zzbO());
        return this.a.equals(zzll1);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if(this.b != null) {
            return ((O)this.b).j.length;
        }
        return this.a == null ? 0 : this.a.zzbw();
    }

    public final zzjd zzb() {
        if(this.b != null) {
            return this.b;
        }
        synchronized(this) {
            if(this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? zzjd.zzb : this.a.zzbs();
            return this.b;
        }
    }
}

