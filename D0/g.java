package D0;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzeq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class g extends n {
    public final Context b;
    public final zzq c;
    public final String d;
    public final zzau e;

    public g(zzau zzau0, Context context0, zzq zzq0, String s) {
        this.e = zzau0;
        this.b = context0;
        this.c = zzq0;
        this.d = s;
    }

    @Override  // D0.n
    public final Object a() {
        zzau.a(this.b, "search");
        return new zzeq();
    }

    @Override  // D0.n
    public final Object b(zzcc zzcc0) {
        return zzcc0.zzf(ObjectWrapper.wrap(this.b), this.c, this.d, 221908000);
    }

    @Override  // D0.n
    public final Object c() {
        return this.e.a.zza(this.b, this.c, this.d, null, 3);
    }
}

