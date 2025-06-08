package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.b9;
import java.io.IOException;

public class zzka extends zzim {
    public final zzke i;
    public zzke j;
    public boolean k;

    public zzka(zzke zzke0) {
        this.i = zzke0;
        this.j = (zzke)zzke0.i(4);
        this.k = false;
    }

    @Override  // com.google.android.gms.internal.measurement.zzim
    public final zzka a(zzin zzin0) {
        this.zzaC(((zzke)zzin0));
        return this;
    }

    public final void b() {
        zzke zzke0 = (zzke)this.j.i(4);
        zzke zzke1 = this.j;
        Class class0 = zzke0.getClass();
        p0.c.a(class0).e(zzke0, zzke1);
        this.j = zzke0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzim
    public final Object clone() throws CloneNotSupportedException {
        return this.zzaB();
    }

    public final zzka zzaB() {
        zzka zzka0 = (zzka)this.i.i(5);
        zzka0.zzaC(this.zzaF());
        return zzka0;
    }

    public final zzka zzaC(zzke zzke0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzke zzke1 = this.j;
        Class class0 = zzke1.getClass();
        p0.c.a(class0).e(zzke1, zzke0);
        return this;
    }

    public final zzka zzaD(byte[] arr_b, int v, int v1, zzjq zzjq0) throws zzko {
        if(this.k) {
            this.b();
            this.k = false;
        }
        try {
            Class class0 = this.j.getClass();
            p0.c.a(class0).b(this.j, arr_b, 0, v1, new b9(zzjq0));
            return this;
        }
        catch(zzko zzko0) {
            throw zzko0;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw zzko.d();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
        }
    }

    public final zzke zzaE() {
        zzke zzke0 = this.zzaF();
        switch(((byte)(((Byte)zzke0.i(1))))) {
            case 0: {
                break;
            }
            case 1: {
                return zzke0;
            }
            default: {
                Class class0 = zzke0.getClass();
                boolean z = p0.c.a(class0).a(zzke0);
                zzke0.i(2);
                if(z) {
                    return zzke0;
                }
            }
        }
        throw new zzmm(zzke0);
    }

    public zzke zzaF() {
        if(this.k) {
            return this.j;
        }
        zzke zzke0 = this.j;
        Class class0 = zzke0.getClass();
        p0.c.a(class0).zzf(zzke0);
        this.k = true;
        return this.j;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlk
    public zzll zzaG() {
        return this.zzaF();
    }

    @Override  // com.google.android.gms.internal.measurement.zzim
    public final zzim zzau() {
        return this.zzaB();
    }

    @Override  // com.google.android.gms.internal.measurement.zzim
    public final zzim zzaw(byte[] arr_b, int v, int v1) throws zzko {
        this.zzaD(arr_b, 0, v1, zzjq.zza());
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzim
    public final zzim zzax(byte[] arr_b, int v, int v1, zzjq zzjq0) throws zzko {
        this.zzaD(arr_b, 0, v1, zzjq0);
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlm
    public final zzll zzbO() {
        return this.i;
    }
}

