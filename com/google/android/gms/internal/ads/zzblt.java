package com.google.android.gms.internal.ads;

import A.f;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzblt extends zzaqw implements zzblv {
    public zzblt(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final zzdk zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 7);
        zzdk zzdk0 = zzdj.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final zzblb zzf(String s) throws RemoteException {
        zzblb zzblb0;
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        Parcel parcel1 = this.b(parcel0, 2);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzblb0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzblb0 = iInterface0 instanceof zzblb ? ((zzblb)iInterface0) : new zzbkz(iBinder0);
        }
        parcel1.recycle();
        return zzblb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final IObjectWrapper zzg() throws RemoteException {
        return f.c(this.b(this.a(), 9));
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final String zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 4);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final String zzi(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        Parcel parcel1 = this.b(parcel0, 1);
        String s1 = parcel1.readString();
        parcel1.recycle();
        return s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final List zzj() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        List list0 = parcel0.createStringArrayList();
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzk() throws RemoteException {
        this.c(this.a(), 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzl() throws RemoteException {
        this.c(this.a(), 15);
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzm(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzn() throws RemoteException {
        this.c(this.a(), 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzo(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final boolean zzp() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 12);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final boolean zzq(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.b(parcel0, 10);
        boolean z = zzaqy.zzh(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final boolean zzr() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 13);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }
}

