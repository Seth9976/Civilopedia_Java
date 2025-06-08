package com.google.android.gms.internal.ads;

import android.os.Handler;
import f0.g;
import java.io.IOException;
import java.util.HashMap;

public abstract class zzrj extends zzrb {
    public final HashMap h;
    public Handler i;
    public zzfs j;

    public zzrj() {
        this.h = new HashMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzrb
    public final void a() {
        for(Object object0: this.h.values()) {
            ((lb)object0).a.zzi(((lb)object0).b);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzrb
    public final void b() {
        for(Object object0: this.h.values()) {
            ((lb)object0).a.zzk(((lb)object0).b);
        }
    }

    public zzsa d(Integer integer0, zzsa zzsa0) {
        throw null;
    }

    // 检测为 lambda 实现。
    public abstract void e(Object arg1, zzsc arg2, zzci arg3);

    public final void f(Integer integer0, zzsc zzsc0) {
        zzcw.zzd(!this.h.containsKey(integer0));
        zzrg zzrg0 = (zzsc arg2, zzci arg3) -> ;;
        g g0 = new g(this, integer0);
        lb lb0 = new lb(zzsc0, zzrg0, g0);
        this.h.put(integer0, lb0);
        Handler handler0 = this.i;
        handler0.getClass();
        zzsc0.zzh(handler0, g0);
        Handler handler1 = this.i;
        handler1.getClass();
        zzsc0.zzg(handler1, g0);
        zzfs zzfs0 = this.j;
        zzmu zzmu0 = this.g;
        zzcw.zzb(zzmu0);
        zzsc0.zzm(zzrg0, zzfs0, zzmu0);
        if(this.b.isEmpty()) {
            zzsc0.zzi(zzrg0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzrb
    public void zzn(zzfs zzfs0) {
        this.j = zzfs0;
        this.i = zzeg.zzC(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzrb
    public void zzq() {
        HashMap hashMap0 = this.h;
        for(Object object0: hashMap0.values()) {
            ((lb)object0).a.zzp(((lb)object0).b);
            ((lb)object0).a.zzs(((lb)object0).c);
            ((lb)object0).a.zzr(((lb)object0).c);
        }
        hashMap0.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public void zzw() throws IOException {
        for(Object object0: this.h.values()) {
            ((lb)object0).a.zzw();
        }
    }
}

