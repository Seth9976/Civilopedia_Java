package com.google.android.gms.internal.play_billing;

public class zzhg extends zzfu {
    public final zzhk i;
    public zzhk j;

    public zzhg(zzhk zzhk0) {
        this.i = zzhk0;
        if(zzhk0.b()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.j = (zzhk)zzhk0.c(4);
    }

    public final void b() {
        if(!this.j.b()) {
            zzhk zzhk0 = (zzhk)this.i.c(4);
            zzhk zzhk1 = this.j;
            Class class0 = zzhk0.getClass();
            F0.c.a(class0).e(zzhk0, zzhk1);
            this.j = zzhk0;
        }
    }

    @Override  // com.google.android.gms.internal.play_billing.zzfu
    public final Object clone() throws CloneNotSupportedException {
        return this.zzd();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzfu
    public final zzfu zzb() {
        return this.zzd();
    }

    public final zzhg zzd() {
        zzhg zzhg0 = (zzhg)this.i.c(5);
        zzhg0.j = this.zzg();
        return zzhg0;
    }

    public final zzhg zze(zzhk zzhk0) {
        zzhk zzhk1 = this.i;
        if(!zzhk1.equals(zzhk0)) {
            if(!this.j.b()) {
                zzhk zzhk2 = (zzhk)zzhk1.c(4);
                zzhk zzhk3 = this.j;
                Class class0 = zzhk2.getClass();
                F0.c.a(class0).e(zzhk2, zzhk3);
                this.j = zzhk2;
            }
            zzhk zzhk4 = this.j;
            Class class1 = zzhk4.getClass();
            F0.c.a(class1).e(zzhk4, zzhk0);
        }
        return this;
    }

    public final zzhk zzf() {
        zzhk zzhk0 = this.zzg();
        if(!zzhk.j(zzhk0, true)) {
            throw new zzji(zzhk0);
        }
        return zzhk0;
    }

    public zzhk zzg() {
        if(!this.j.b()) {
            return this.j;
        }
        zzhk zzhk0 = this.j;
        zzhk0.getClass();
        Class class0 = zzhk0.getClass();
        F0.c.a(class0).zzf(zzhk0);
        zzhk0.g();
        return this.j;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzil
    public zzim zzh() {
        return this.zzg();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzin
    public final zzim zzi() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzin
    public final boolean zzl() {
        return zzhk.j(this.j, false);
    }
}

