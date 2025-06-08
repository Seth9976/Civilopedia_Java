package D0;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzeq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;

public final class h extends n {
    public final Context b;
    public final zzq c;
    public final String d;
    public final zzbua e;
    public final zzau f;

    public h(zzau zzau0, Context context0, zzq zzq0, String s, zzbua zzbua0) {
        this.f = zzau0;
        this.b = context0;
        this.c = zzq0;
        this.d = s;
        this.e = zzbua0;
    }

    @Override  // D0.n
    public final Object a() {
        zzau.a(this.b, "interstitial");
        return new zzeq();
    }

    @Override  // D0.n
    public final Object b(zzcc zzcc0) {
        return zzcc0.zze(ObjectWrapper.wrap(this.b), this.c, this.d, this.e, 221908000);
    }

    @Override  // D0.n
    public final Object c() {
        return this.f.a.zza(this.b, this.c, this.d, this.e, 2);
    }
}

