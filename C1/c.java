package c1;

import com.google.android.gms.internal.common.zzag;
import com.google.android.gms.internal.common.zzs;
import java.util.List;

public final class c extends zzag {
    public final transient int k;
    public final transient int l;
    public final zzag m;

    public c(zzag zzag0, int v, int v1) {
        this.m = zzag0;
        super();
        this.k = v;
        this.l = v1;
    }

    @Override
    public final Object get(int v) {
        zzs.zza(v, this.l, "index");
        return this.m.get(v + this.k);
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final int h() {
        return this.m.i() + this.k + this.l;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final int i() {
        return this.m.i() + this.k;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final boolean j() {
        return true;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final Object[] k() {
        return this.m.k();
    }

    @Override
    public final int size() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    public final List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.common.zzag
    public final zzag zzh(int v, int v1) {
        zzs.zzc(v, v1, this.l);
        return this.m.zzh(v + this.k, v1 + this.k);
    }
}

