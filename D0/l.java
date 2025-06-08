package D0;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzar;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import java.util.HashMap;

public final class l extends n {
    public final View b;
    public final HashMap c;
    public final HashMap d;
    public final zzau e;

    public l(zzau zzau0, View view0, HashMap hashMap0, HashMap hashMap1) {
        this.e = zzau0;
        this.b = view0;
        this.c = hashMap0;
        this.d = hashMap1;
    }

    @Override  // D0.n
    public final Object a() {
        zzau.a(this.b.getContext(), "native_ad_view_holder_delegate");
        return new zzeu();
    }

    @Override  // D0.n
    public final Object b(zzcc zzcc0) {
        return zzcc0.zzi(ObjectWrapper.wrap(this.b), ObjectWrapper.wrap(this.c), ObjectWrapper.wrap(this.d));
    }

    @Override  // D0.n
    public final Object c() {
        View view0 = this.b;
        zzbhz.zzc(view0.getContext());
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzif)).booleanValue();
        HashMap hashMap0 = this.d;
        HashMap hashMap1 = this.c;
        zzau zzau0 = this.e;
        if(z) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(hashMap1);
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(hashMap0);
                return zzblk.zze(((zzblo)zzcfm.zzb(view0.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzar.zza)).zze(iObjectWrapper0, iObjectWrapper1, iObjectWrapper2));
            }
            catch(zzcfl | RemoteException | NullPointerException zzcfl0) {
                zzau0.g = zzbyy.zza(view0.getContext());
                zzau0.g.zzd(zzcfl0, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        return zzau0.f.zza(view0, hashMap1, hashMap0);
    }
}

