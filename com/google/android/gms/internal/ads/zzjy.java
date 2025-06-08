package com.google.android.gms.internal.ads;

import F0.g;
import android.media.AudioTrack;
import android.util.Log;
import android.view.Surface;
import i3.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jeb.synthetic.FIN;

@Deprecated
public final class zzjy extends zzk implements zzhe {
    public final ta b;
    public final zzcz c;

    public zzjy(zzhd zzhd0) {
        zzcz zzcz0 = new zzcz(zzcx.zza);
        this.c = zzcz0;
        try {
            this.b = new ta(zzhd0, this);
        }
        catch(Throwable throwable0) {
            this.c.zze();
            throw throwable0;
        }
        zzcz0.zze();
    }

    public final void zzA(zzkk zzkk0) {
        this.c.zzb();
        this.b.o.zzR(zzkk0);
    }

    public final void zzB(zzsc zzsc0) {
        this.c.zzb();
        ta ta0 = this.b;
        ta0.m();
        List list0 = Collections.singletonList(zzsc0);
        ta0.m();
        ta0.m();
        ta0.a();
        ta0.zzl();
        ++ta0.v;
        ArrayList arrayList0 = ta0.m;
        if(!arrayList0.isEmpty()) {
            int v = arrayList0.size();
            for(int v1 = v - 1; v1 >= 0; --v1) {
                arrayList0.remove(v1);
            }
            ta0.R = ta0.R.zzh(0, v);
        }
        ArrayList arrayList1 = new ArrayList();
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            Da da0 = new Da(((zzsc)list0.get(v2)), ta0.n);
            arrayList1.add(da0);
            arrayList0.add(v2, new sa(da0.b, da0.a.zzA()));
        }
        ta0.R = ta0.R.zzg(0, arrayList1.size());
        Ga ga0 = new Ga(arrayList0, ta0.R);
        boolean z = ga0.zzo();
        int v3 = ga0.c;
        if(!z && v3 < 0) {
            throw new zzae(ga0, -1, 0x8000000000000001L);
        }
        int v4 = ga0.zzg(false);
        Fa fa0 = ta0.f(ta0.N, ga0, ta0.d(ga0, v4, 0x8000000000000001L));
        Fa fa1 = fa0.f((v4 == -1 || fa0.e == 1 || (ga0.zzo() || v4 >= v3) ? fa0.e : 2));
        zztt zztt0 = ta0.R;
        ta0.i.getClass();
        va va0 = new va(arrayList1, zztt0, v4, zzeg.zzv(0x8000000000000001L));
        ta0.i.p.zzb(17, va0).zza();
        ta0.l(fa1, 0, 1, false, !ta0.N.b.zza.equals(fa1.b.zza) && !ta0.N.a.zzo(), 4, ta0.b(fa1), -1);
    }

    public final void zzC(boolean z) {
        this.c.zzb();
        this.b.m();
        this.b.zzh();
        this.b.s.a();
        this.b.k((z ? 1 : -1), 1, z);
    }

    public final void zzE(Surface surface0) {
        this.c.zzb();
        this.b.m();
        this.b.i(surface0);
        int v = surface0 == null ? 0 : -1;
        this.b.g(v, v);
    }

    public final void zzF(float f) {
        this.c.zzb();
        ta ta0 = this.b;
        ta0.m();
        float f1 = zzeg.zza(f, 0.0f, 1.0f);
        if(ta0.H != f1) {
            ta0.H = f1;
            ta0.h(1, 2, ((float)(ta0.s.e * f1)));
            zzht zzht0 = new zzht(f1);
            ta0.j.zzd(22, zzht0);
            ta0.j.zzc();
        }
    }

    public final void zzG() {
        this.c.zzb();
        this.b.m();
        this.b.m();
        this.b.zzq();
        this.b.s.a();
        this.b.j(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzd() {
        this.c.zzb();
        return this.b.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zze() {
        this.c.zzb();
        return this.b.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzf() {
        this.c.zzb();
        return this.b.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzg() {
        this.c.zzb();
        return this.b.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzh() {
        this.c.zzb();
        return this.b.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzi() {
        this.c.zzb();
        return this.b.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzj() {
        this.c.zzb();
        this.b.m();
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final long zzk() {
        this.c.zzb();
        return this.b.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final long zzl() {
        this.c.zzb();
        return this.b.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final long zzm() {
        this.c.zzb();
        return this.b.zzm();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final zzci zzn() {
        this.c.zzb();
        return this.b.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final zzct zzo() {
        this.c.zzb();
        return this.b.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final void zzp(int v, long v1) {
        this.c.zzb();
        this.b.zzp(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final boolean zzq() {
        this.c.zzb();
        return this.b.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final boolean zzr() {
        this.c.zzb();
        this.b.m();
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final boolean zzs() {
        this.c.zzb();
        return this.b.zzs();
    }

    public final int zzt() {
        this.c.zzb();
        this.b.m();
        return 2;
    }

    public final long zzu() {
        this.c.zzb();
        ta ta0 = this.b;
        ta0.m();
        if(ta0.zzs()) {
            return ta0.N.k.equals(ta0.N.b) ? zzeg.zzz(ta0.N.q) : ta0.o();
        }
        ta0.m();
        if(ta0.N.a.zzo()) {
            return ta0.P;
        }
        Fa fa0 = ta0.N;
        long v = 0L;
        if(fa0.k.zzd != fa0.b.zzd) {
            int v1 = ta0.zzf();
            return zzeg.zzz(fa0.a.zze(v1, ta0.a, 0L).zzn);
        }
        long v2 = fa0.q;
        if(ta0.N.k.zzb()) {
            ta0.N.a.zzn(ta0.N.k.zza, ta0.l).zzh(ta0.N.k.zzb);
        }
        else {
            v = v2;
        }
        ta0.N.a.zzn(ta0.N.k.zza, ta0.l);
        return zzeg.zzz(v);
    }

    public final long zzv() {
        this.c.zzb();
        return this.b.o();
    }

    public final zzgt zzw() {
        this.c.zzb();
        this.b.m();
        return this.b.N.f;
    }

    public final void zzx(zzkk zzkk0) {
        this.c.zzb();
        this.b.getClass();
        zzkk0.getClass();
        this.b.o.zzw(zzkk0);
    }

    public final void zzy() {
        this.c.zzb();
        ta ta0 = this.b;
        ta0.m();
        boolean z = ta0.zzq();
        ta0.s.a();
        int v = 2;
        ta0.k((z ? 1 : -1), 1, z);
        Fa fa0 = ta0.N;
        if(fa0.e == 1) {
            Fa fa1 = fa0.e(null);
            if(fa1.a.zzo()) {
                v = 4;
            }
            Fa fa2 = fa1.f(v);
            ++ta0.v;
            ta0.i.p.zza(0).zza();
            ta0.l(fa2, 1, 1, false, false, 5, 0x8000000000000001L, -1);
        }
    }

    public final void zzz() {
        boolean z;
        this.c.zzb();
        ta ta0 = this.b;
        ta0.getClass();
        StringBuilder stringBuilder0 = e.j("Release ", Integer.toHexString(System.identityHashCode(ta0)), " [AndroidXMedia3/1.0.0-alpha03] [", zzeg.zze, "] [");
        stringBuilder0.append("media3.common");
        stringBuilder0.append("]");
        Log.i("ExoPlayerImpl", stringBuilder0.toString());
        ta0.m();
        if(zzeg.zza < 21) {
            AudioTrack audioTrack0 = ta0.B;
            if(audioTrack0 != null) {
                audioTrack0.release();
                ta0.B = null;
            }
        }
        Ha ha0 = ta0.t;
        g g0 = ha0.e;
        if(g0 != null) {
            try {
                ha0.a.unregisterReceiver(g0);
            }
            catch(RuntimeException runtimeException0) {
                zzdn.zzb("StreamVolumeManager", "Error unregistering stream volume receiver", runtimeException0);
            }
            ha0.e = null;
        }
        ta0.s.c = null;
        ta0.s.a();
        xa xa0 = ta0.i;
        __monitor_enter(xa0);
        int v = FIN.finallyOpen$NT();
        if(xa0.D || !xa0.q.isAlive()) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(xa0);
            FIN.finallyCodeEnd$NT(v);
            z = true;
        }
        else {
            xa0.p.zzh(7);
            xa0.w(new zzin(xa0));
            z = xa0.D;
            FIN.finallyExec$NT(v);
        }
        if(!z) {
            ta0.j.zzd(10, zzhr.zza);
            ta0.j.zzc();
        }
        ta0.j.zze();
        ta0.h.zzd(null);
        ta0.q.zzf(ta0.o);
        Fa fa0 = ta0.N.f(1);
        ta0.N = fa0;
        Fa fa1 = fa0.a(fa0.b);
        ta0.N = fa1;
        fa1.q = fa1.s;
        ta0.N.r = 0L;
        ta0.o.zzQ();
        ta0.g.zzo();
        Surface surface0 = ta0.D;
        if(surface0 != null) {
            surface0.release();
            ta0.D = null;
        }
    }
}

