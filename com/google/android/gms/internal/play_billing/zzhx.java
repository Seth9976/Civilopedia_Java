package com.google.android.gms.internal.play_billing;

public class zzhx {
    public volatile zzim a;
    public volatile zzgk b;

    public final void a(zzim zzim0) {
        if(this.a != null) {
            return;
        }
        synchronized(this) {
            if(this.a != null) {
                return;
            }
            this.a = zzim0;
            this.b = zzgk.zzb;
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzhx)) {
            return false;
        }
        zzim zzim0 = this.a;
        zzim zzim1 = ((zzhx)object0).a;
        if(zzim0 == null && zzim1 == null) {
            return this.zzb().equals(((zzhx)object0).zzb());
        }
        if(zzim0 != null && zzim1 != null) {
            return zzim0.equals(zzim1);
        }
        if(zzim0 != null) {
            ((zzhx)object0).a(zzim0.zzi());
            return zzim0.equals(((zzhx)object0).a);
        }
        this.a(zzim1.zzi());
        return this.a.equals(zzim1);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if(this.b != null) {
            return ((i0)this.b).j.length;
        }
        return this.a == null ? 0 : this.a.zzk();
    }

    public final zzgk zzb() {
        if(this.b != null) {
            return this.b;
        }
        synchronized(this) {
            if(this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? zzgk.zzb : this.a.zzf();
            return this.b;
        }
    }

    public final zzim zzc(zzim zzim0) {
        zzim zzim1 = this.a;
        this.b = null;
        this.a = zzim0;
        return zzim1;
    }
}

