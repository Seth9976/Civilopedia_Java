package D0;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzal;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

public final class i extends n {
    public final Context b;
    public final String c;
    public final zzbua d;
    public final zzau e;

    public i(zzau zzau0, Context context0, String s, zzbua zzbua0) {
        this.e = zzau0;
        this.b = context0;
        this.c = s;
        this.d = zzbua0;
    }

    @Override  // D0.n
    public final Object a() {
        zzau.a(this.b, "native_ad");
        return new zzeo();
    }

    @Override  // D0.n
    public final Object b(zzcc zzcc0) {
        return zzcc0.zzb(ObjectWrapper.wrap(this.b), this.c, this.d, 221908000);
    }

    @Override  // D0.n
    public final Object c() {
        Context context0 = this.b;
        zzbhz.zzc(context0);
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzif)).booleanValue();
        zzau zzau0 = this.e;
        zzbua zzbua0 = this.d;
        String s = this.c;
        if(z) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                IBinder iBinder0 = ((zzbp)zzcfm.zzb(context0, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzal.zza)).zze(iObjectWrapper0, s, zzbua0, 221908000);
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    return iInterface0 instanceof zzbo ? ((zzbo)iInterface0) : new zzbm(iBinder0);
                }
                return null;
            }
            catch(zzcfl | RemoteException | NullPointerException zzcfl0) {
            }
            zzbza zzbza0 = zzbyy.zza(context0);
            zzau0.g = zzbza0;
            zzbza0.zzd(zzcfl0, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
        return zzau0.b.zza(context0, s, zzbua0);
    }
}

