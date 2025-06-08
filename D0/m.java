package D0;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcbq;

public final class m extends n {
    public final Context b;
    public final String c;
    public final zzbua d;

    public m(Context context0, String s, zzbua zzbua0) {
        this.b = context0;
        this.c = s;
        this.d = zzbua0;
    }

    @Override  // D0.n
    public final Object a() {
        zzau.a(this.b, "rewarded");
        return new zzew();
    }

    @Override  // D0.n
    public final Object b(zzcc zzcc0) {
        return zzcc0.zzn(ObjectWrapper.wrap(this.b), this.c, this.d, 221908000);
    }

    @Override  // D0.n
    public final Object c() {
        return zzcbq.zza(this.b, this.c, this.d);
    }
}

