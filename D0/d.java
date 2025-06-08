package D0;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzaf;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

public final class d extends n {
    public final Context b;
    public final zzbua c;
    public final OnH5AdsEventListener d;

    public d(Context context0, zzbua zzbua0, OnH5AdsEventListener onH5AdsEventListener0) {
        this.b = context0;
        this.c = zzbua0;
        this.d = onH5AdsEventListener0;
    }

    @Override  // D0.n
    public final Object a() {
        return new zzbpr();
    }

    @Override  // D0.n
    public final Object b(zzcc zzcc0) {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.b);
        zzbpe zzbpe0 = new zzbpe(this.d);
        return zzcc0.zzj(iObjectWrapper0, this.c, 221908000, zzbpe0);
    }

    @Override  // D0.n
    public final Object c() {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.b);
        try {
            zzbpn zzbpn0 = (zzbpn)zzcfm.zzb(this.b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzaf.zza);
            zzbpe zzbpe0 = new zzbpe(this.d);
            return zzbpn0.zze(iObjectWrapper0, this.c, 221908000, zzbpe0);
        }
        catch(zzcfl | RemoteException | NullPointerException unused_ex) {
            return null;
        }
    }
}

