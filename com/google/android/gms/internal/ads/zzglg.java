package com.google.android.gms.internal.ads;

public class zzglg {
    public volatile zzgma a;
    public volatile zzgji b;

    static {
        zzgkc.zza();
    }

    public final void a(zzgma zzgma0) {
        if(this.a != null) {
            return;
        }
        synchronized(this) {
            if(this.a == null) {
                this.a = zzgma0;
                this.b = zzgji.zzb;
            }
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzglg)) {
            return false;
        }
        zzgma zzgma0 = this.a;
        zzgma zzgma1 = ((zzglg)object0).a;
        if(zzgma0 == null && zzgma1 == null) {
            return this.zzb().equals(((zzglg)object0).zzb());
        }
        if(zzgma0 != null && zzgma1 != null) {
            return zzgma0.equals(zzgma1);
        }
        if(zzgma0 != null) {
            ((zzglg)object0).a(zzgma0.zzbh());
            return zzgma0.equals(((zzglg)object0).a);
        }
        this.a(zzgma1.zzbh());
        return this.a.equals(zzgma1);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if(this.b != null) {
            return ((h9)this.b).j.length;
        }
        return this.a == null ? 0 : this.a.zzax();
    }

    public final zzgji zzb() {
        if(this.b != null) {
            return this.b;
        }
        synchronized(this) {
            if(this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? zzgji.zzb : this.a.zzas();
            return this.b;
        }
    }
}

