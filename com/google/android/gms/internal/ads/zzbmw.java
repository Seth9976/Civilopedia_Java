package com.google.android.gms.internal.ads;

import A.f;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbmw extends zzaqw implements zzbmy {
    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzA() throws RemoteException {
        this.c(this.a(), 28);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzB(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, bundle0);
        this.c(parcel0, 17);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzC() throws RemoteException {
        this.c(this.a(), 27);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzD(zzcq zzcq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzcq0);
        this.c(parcel0, 26);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzE(zzde zzde0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzde0);
        this.c(parcel0, 0x20);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzF(zzbmv zzbmv0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbmv0);
        this.c(parcel0, 21);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzG() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 30);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzH() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 24);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzI(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, bundle0);
        Parcel parcel1 = this.b(parcel0, 16);
        boolean z = zzaqy.zzh(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final double zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 8);
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final Bundle zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 20);
        Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzdh zzg() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 0x1F);
        zzdh zzdh0 = zzdg.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzdk zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 11);
        zzdk zzdk0 = zzdj.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzbkt zzi() throws RemoteException {
        zzbkt zzbkt0;
        Parcel parcel0 = this.b(this.a(), 14);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbkt0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbkt0 = iInterface0 instanceof zzbkt ? ((zzbkt)iInterface0) : new zzbkr(iBinder0);
        }
        parcel0.recycle();
        return zzbkt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzbky zzj() throws RemoteException {
        zzbky zzbky0;
        Parcel parcel0 = this.b(this.a(), 29);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbky0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbky0 = iInterface0 instanceof zzbky ? ((zzbky)iInterface0) : new zzbkw(iBinder0);
        }
        parcel0.recycle();
        return zzbky0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzblb zzk() throws RemoteException {
        zzblb zzblb0;
        Parcel parcel0 = this.b(this.a(), 5);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzblb0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzblb0 = iInterface0 instanceof zzblb ? ((zzblb)iInterface0) : new zzbkz(iBinder0);
        }
        parcel0.recycle();
        return zzblb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final IObjectWrapper zzl() throws RemoteException {
        return f.c(this.b(this.a(), 19));
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final IObjectWrapper zzm() throws RemoteException {
        return f.c(this.b(this.a(), 18));
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzn() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 7);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzo() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 4);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzp() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 6);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzq() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzr() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 12);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzs() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 10);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzt() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 9);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final List zzu() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        List list0 = zzaqy.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final List zzv() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 23);
        List list0 = zzaqy.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzw() throws RemoteException {
        this.c(this.a(), 22);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzx() throws RemoteException {
        this.c(this.a(), 13);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzy(zzcu zzcu0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzcu0);
        this.c(parcel0, 25);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzz(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, bundle0);
        this.c(parcel0, 15);
    }
}

