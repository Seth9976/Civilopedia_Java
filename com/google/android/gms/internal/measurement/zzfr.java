package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzfr extends zzka implements zzlm {
    public final int zza() {
        return ((zzfs)this.j).zzb();
    }

    public final long zzb() {
        return ((zzfs)this.j).zzc();
    }

    public final long zzc() {
        return ((zzfs)this.j).zzd();
    }

    public final zzfr zzd(Iterable iterable0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.l(((zzfs)this.j), iterable0);
        return this;
    }

    public final zzfr zze(zzfv zzfv0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.k(((zzfs)this.j), ((zzfw)zzfv0.zzaE()));
        return this;
    }

    public final zzfr zzf(zzfw zzfw0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.k(((zzfs)this.j), zzfw0);
        return this;
    }

    public final zzfr zzg() {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.m(((zzfs)this.j));
        return this;
    }

    public final zzfr zzh(int v) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.n(((zzfs)this.j), v);
        return this;
    }

    public final zzfr zzi(String s) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.o(((zzfs)this.j), s);
        return this;
    }

    public final zzfr zzj(int v, zzfv zzfv0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.j(((zzfs)this.j), v, ((zzfw)zzfv0.zzaE()));
        return this;
    }

    public final zzfr zzk(int v, zzfw zzfw0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.j(((zzfs)this.j), v, zzfw0);
        return this;
    }

    public final zzfr zzl(long v) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.q(v, ((zzfs)this.j));
        return this;
    }

    public final zzfr zzm(long v) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfs.p(v, ((zzfs)this.j));
        return this;
    }

    public final zzfw zzn(int v) {
        return ((zzfs)this.j).zzg(v);
    }

    // 去混淆评级： 低(20)
    public final String zzo() {
        return "";
    }

    public final List zzp() {
        return Collections.unmodifiableList(((zzfs)this.j).zzi());
    }

    public final boolean zzq() {
        return ((zzfs)this.j).zzu();
    }
}

