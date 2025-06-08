package D0;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzan;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzes;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

public final class j extends n {
    public final Context b;
    public final zzau c;

    public j(zzau zzau0, Context context0) {
        this.c = zzau0;
        this.b = context0;
    }

    @Override  // D0.n
    public final Object a() {
        zzau.a(this.b, "mobile_ads_settings");
        return new zzes();
    }

    @Override  // D0.n
    public final Object b(zzcc zzcc0) {
        return zzcc0.zzg(ObjectWrapper.wrap(this.b), 221908000);
    }

    @Override  // D0.n
    public final Object c() {
        Context context0 = this.b;
        zzbhz.zzc(context0);
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzif)).booleanValue();
        zzau zzau0 = this.c;
        if(z) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                IBinder iBinder0 = ((zzcn)zzcfm.zzb(context0, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzan.zza)).zze(iObjectWrapper0, 221908000);
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    return iInterface0 instanceof zzcm ? ((zzcm)iInterface0) : new zzck(iBinder0);
                }
                return null;
            }
            catch(zzcfl | RemoteException | NullPointerException zzcfl0) {
            }
            zzbza zzbza0 = zzbyy.zza(context0);
            zzau0.g = zzbza0;
            zzbza0.zzd(zzcfl0, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
        return zzau0.c.zza(context0);
    }
}

