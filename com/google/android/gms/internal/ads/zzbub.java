package com.google.android.gms.internal.ads;

import A.f;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbub extends zzaqw implements zzbud {
    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzA(zzl zzl0, String s, String s1) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzB(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbug zzbug0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzl0);
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, zzbug0);
        this.c(parcel0, 0x20);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzC(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 21);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzD() throws RemoteException {
        this.c(this.a(), 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzE() throws RemoteException {
        this.c(this.a(), 9);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzF(boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzd(parcel0, z);
        this.c(parcel0, 25);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzG() throws RemoteException {
        this.c(this.a(), 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzH(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 37);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzI(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 30);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzJ() throws RemoteException {
        this.c(this.a(), 12);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final boolean zzK() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 22);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final boolean zzL() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 13);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbul zzM() throws RemoteException {
        zzbul zzbul0;
        Parcel parcel0 = this.b(this.a(), 15);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbul0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbul0 = iInterface0 instanceof zzbul ? ((zzbul)iInterface0) : new zzbul(iBinder0, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }
        parcel0.recycle();
        return zzbul0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbum zzN() throws RemoteException {
        zzbum zzbum0;
        Parcel parcel0 = this.b(this.a(), 16);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbum0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbum0 = iInterface0 instanceof zzbum ? ((zzbum)iInterface0) : new zzbum(iBinder0, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }
        parcel0.recycle();
        return zzbum0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzdk zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 26);
        zzdk zzdk0 = zzdj.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzblv zzi() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbuj zzj() throws RemoteException {
        zzbuj zzbuj0;
        Parcel parcel0 = this.b(this.a(), 36);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbuj0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbuj0 = iInterface0 instanceof zzbuj ? ((zzbuj)iInterface0) : new zzbuh(iBinder0);
        }
        parcel0.recycle();
        return zzbuj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbup zzk() throws RemoteException {
        zzbup zzbup0;
        Parcel parcel0 = this.b(this.a(), 27);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbup0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbup0 = iInterface0 instanceof zzbup ? ((zzbup)iInterface0) : new zzbun(iBinder0);
        }
        parcel0.recycle();
        return zzbup0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbwg zzl() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 33);
        zzbwg zzbwg0 = (zzbwg)zzaqy.zza(parcel0, zzbwg.CREATOR);
        parcel0.recycle();
        return zzbwg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbwg zzm() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 34);
        zzbwg zzbwg0 = (zzbwg)zzaqy.zza(parcel0, zzbwg.CREATOR);
        parcel0.recycle();
        return zzbwg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final IObjectWrapper zzn() throws RemoteException {
        return f.c(this.b(this.a(), 2));
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzo() throws RemoteException {
        this.c(this.a(), 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzp(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzcaw zzcaw0, String s1) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzl0);
        parcel0.writeString(null);
        zzaqy.zzg(parcel0, zzcaw0);
        parcel0.writeString(s1);
        this.c(parcel0, 10);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzq(IObjectWrapper iObjectWrapper0, zzbqk zzbqk0, List list0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbqk0);
        parcel0.writeTypedList(list0);
        this.c(parcel0, 0x1F);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzr(IObjectWrapper iObjectWrapper0, zzcaw zzcaw0, List list0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzcaw0);
        parcel0.writeStringList(list0);
        this.c(parcel0, 23);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzs(zzl zzl0, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzl0);
        parcel0.writeString(s);
        this.c(parcel0, 11);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzt(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, zzbug zzbug0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzu(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, String s1, zzbug zzbug0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzq0);
        zzaqy.zze(parcel0, zzl0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zzg(parcel0, zzbug0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzv(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, String s1, zzbug zzbug0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzq0);
        zzaqy.zze(parcel0, zzl0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zzg(parcel0, zzbug0);
        this.c(parcel0, 35);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzw(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbug zzbug0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzx(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, String s1, zzbug zzbug0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzl0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zzg(parcel0, zzbug0);
        this.c(parcel0, 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzy(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, String s1, zzbug zzbug0, zzbkp zzbkp0, List list0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzl0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zzg(parcel0, zzbug0);
        zzaqy.zze(parcel0, zzbkp0);
        parcel0.writeStringList(list0);
        this.c(parcel0, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzz(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbug zzbug0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzl0);
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, zzbug0);
        this.c(parcel0, 28);
    }
}

