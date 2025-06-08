package D0;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzap;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzet;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzbli;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

public final class k extends n {
    public final FrameLayout b;
    public final FrameLayout c;
    public final Context d;
    public final zzau e;

    public k(zzau zzau0, FrameLayout frameLayout0, FrameLayout frameLayout1, Context context0) {
        this.e = zzau0;
        this.b = frameLayout0;
        this.c = frameLayout1;
        this.d = context0;
    }

    @Override  // D0.n
    public final Object a() {
        zzau.a(this.d, "native_ad_view_delegate");
        return new zzet();
    }

    @Override  // D0.n
    public final Object b(zzcc zzcc0) {
        return zzcc0.zzh(ObjectWrapper.wrap(this.b), ObjectWrapper.wrap(this.c));
    }

    @Override  // D0.n
    public final Object c() {
        Context context0 = this.d;
        zzbhz.zzc(context0);
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzif)).booleanValue();
        FrameLayout frameLayout0 = this.c;
        FrameLayout frameLayout1 = this.b;
        zzau zzau0 = this.e;
        if(z) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(frameLayout1);
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(frameLayout0);
                return zzble.zzbB(((zzbli)zzcfm.zzb(context0, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzap.zza)).zze(iObjectWrapper0, iObjectWrapper1, iObjectWrapper2, 221908000));
            }
            catch(zzcfl | RemoteException | NullPointerException zzcfl0) {
                zzau0.g = zzbyy.zza(context0);
                zzau0.g.zzd(zzcfl0, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        return zzau0.d.zza(context0, frameLayout1, frameLayout0);
    }
}

