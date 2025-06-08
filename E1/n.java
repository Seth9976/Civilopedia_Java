package e1;

import com.google.android.gms.internal.location.zzbm;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

public final class n extends zzbs {
    public final transient int k;
    public final transient int l;
    public final zzbs m;

    public n(zzbs zzbs0, int v, int v1) {
        this.m = zzbs0;
        super();
        this.k = v;
        this.l = v1;
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final Object[] a() {
        return this.m.a();
    }

    @Override
    public final Object get(int v) {
        zzbm.zza(v, this.l, "index");
        return this.m.get(v + this.k);
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final int h() {
        return this.m.h() + this.k;
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final int i() {
        return this.m.h() + this.k + this.l;
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final boolean j() {
        return true;
    }

    @Override
    public final int size() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.location.zzbs
    public final List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.location.zzbs
    public final zzbs zzh(int v, int v1) {
        zzbm.zzc(v, v1, this.l);
        return this.m.zzh(v + this.k, v1 + this.k);
    }
}

