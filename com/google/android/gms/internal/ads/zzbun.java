package com.google.android.gms.internal.ads;

import A.f;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbun extends zzaqw implements zzbup {
    public zzbun(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final boolean zzA() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 18);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final boolean zzB() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 17);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final double zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 8);
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final float zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 23);
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final float zzg() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 25);
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final float zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 24);
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final Bundle zzi() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 16);
        Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final zzdk zzj() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 11);
        zzdk zzdk0 = zzdj.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final zzbkt zzk() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 12);
        zzbkt zzbkt0 = zzbks.zzj(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbkt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final zzblb zzl() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 5);
        zzblb zzblb0 = zzbla.zzg(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzblb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final IObjectWrapper zzm() throws RemoteException {
        return f.c(this.b(this.a(), 13));
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final IObjectWrapper zzn() throws RemoteException {
        return f.c(this.b(this.a(), 14));
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final IObjectWrapper zzo() throws RemoteException {
        return f.c(this.b(this.a(), 15));
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzp() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 7);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzq() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 4);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzr() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 6);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzs() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzt() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 10);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzu() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 9);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final List zzv() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        List list0 = zzaqy.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final void zzw(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 20);
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final void zzx() throws RemoteException {
        this.c(this.a(), 19);
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final void zzy(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, iObjectWrapper1);
        zzaqy.zzg(parcel0, iObjectWrapper2);
        this.c(parcel0, 21);
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final void zzz(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 22);
    }
}

