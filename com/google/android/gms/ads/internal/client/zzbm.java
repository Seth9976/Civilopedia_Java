package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbrb;

public final class zzbm extends zzaqw implements zzbo {
    public zzbm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final zzbl zze() throws RemoteException {
        zzbl zzbl0;
        Parcel parcel0 = this.b(this.a(), 1);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbl0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbl0 = iInterface0 instanceof zzbl ? ((zzbl)iInterface0) : new zzbj(iBinder0, "com.google.android.gms.ads.internal.client.IAdLoader");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }
        parcel0.recycle();
        return zzbl0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzblz zzblz0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbmc zzbmc0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String s, zzbmi zzbmi0, zzbmf zzbmf0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, zzbmi0);
        zzaqy.zzg(parcel0, zzbmf0);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbrb zzbrb0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbmm zzbmm0, zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbmm0);
        zzaqy.zze(parcel0, zzq0);
        this.c(parcel0, 8);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbmp zzbmp0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbmp0);
        this.c(parcel0, 10);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(zzbf zzbf0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbf0);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, adManagerAdViewOptions0);
        this.c(parcel0, 15);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbqs zzbqs0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbkp zzbkp0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzbkp0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(zzcd zzcd0) throws RemoteException {
        throw null;
    }
}

