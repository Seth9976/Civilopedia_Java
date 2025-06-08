package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzal extends zzaq implements zzan {
    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final int zza(int v, String s, String s1) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(3);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        Parcel parcel1 = this.b(parcel0, 5);
        int v1 = parcel1.readInt();
        parcel1.recycle();
        return v1;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final int zzc(int v, String s, String s1, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzas.zzc(parcel0, bundle0);
        Parcel parcel1 = this.b(parcel0, 10);
        int v1 = parcel1.readInt();
        parcel1.recycle();
        return v1;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzd(int v, String s, String s1, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(9);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzas.zzc(parcel0, bundle0);
        Parcel parcel1 = this.b(parcel0, 902);
        Bundle bundle1 = (Bundle)zzas.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zze(int v, String s, String s1, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(9);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzas.zzc(parcel0, bundle0);
        Parcel parcel1 = this.b(parcel0, 12);
        Bundle bundle1 = (Bundle)zzas.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzf(int v, String s, String s1, String s2, String s3) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(3);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        parcel0.writeString(null);
        Parcel parcel1 = this.b(parcel0, 3);
        Bundle bundle0 = (Bundle)zzas.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzg(int v, String s, String s1, String s2, String s3, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        parcel0.writeString(null);
        zzas.zzc(parcel0, bundle0);
        Parcel parcel1 = this.b(parcel0, 8);
        Bundle bundle1 = (Bundle)zzas.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzh(int v, String s, String s1, String s2, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(6);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        zzas.zzc(parcel0, bundle0);
        Parcel parcel1 = this.b(parcel0, 9);
        Bundle bundle1 = (Bundle)zzas.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzi(int v, String s, String s1, String s2) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(3);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        Parcel parcel1 = this.b(parcel0, 4);
        Bundle bundle0 = (Bundle)zzas.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzj(int v, String s, String s1, String s2, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        zzas.zzc(parcel0, bundle0);
        Parcel parcel1 = this.b(parcel0, 11);
        Bundle bundle1 = (Bundle)zzas.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzk(int v, String s, String s1, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(3);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzas.zzc(parcel0, bundle0);
        Parcel parcel1 = this.b(parcel0, 2);
        Bundle bundle1 = (Bundle)zzas.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzl(int v, String s, String s1, Bundle bundle0, Bundle bundle1) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzas.zzc(parcel0, bundle0);
        zzas.zzc(parcel0, bundle1);
        Parcel parcel1 = this.b(parcel0, 901);
        Bundle bundle2 = (Bundle)zzas.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle2;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final void zzm(int v, String s, Bundle bundle0, zzy zzy0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(21);
        parcel0.writeString(s);
        zzas.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzy0));
        this.d(parcel0, 1501);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final void zzn(int v, String s, Bundle bundle0, zzaa zzaa0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(22);
        parcel0.writeString(s);
        zzas.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzaa0));
        this.d(parcel0, 0x709);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final void zzo(int v, String s, Bundle bundle0, zzac zzac0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(21);
        parcel0.writeString(s);
        zzas.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzac0));
        this.d(parcel0, 1601);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final void zzp(int v, String s, Bundle bundle0, zzae zzae0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(18);
        parcel0.writeString(s);
        zzas.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzae0));
        this.c(parcel0, 1301);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final void zzq(int v, String s, Bundle bundle0, zzag zzag0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(22);
        parcel0.writeString(s);
        zzas.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzag0));
        this.d(parcel0, 1901);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final void zzr(int v, String s, Bundle bundle0, zzai zzai0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(21);
        parcel0.writeString(s);
        zzas.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzai0));
        this.d(parcel0, 1401);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final void zzs(int v, String s, Bundle bundle0, zzak zzak0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(22);
        parcel0.writeString(s);
        zzas.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzak0));
        this.d(parcel0, 1701);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final void zzt(int v, String s, Bundle bundle0, zzap zzap0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(12);
        parcel0.writeString(s);
        zzas.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzap0));
        this.c(parcel0, 1201);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzan
    public final int zzy(int v, String s, String s1) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        Parcel parcel1 = this.b(parcel0, 1);
        int v1 = parcel1.readInt();
        parcel1.recycle();
        return v1;
    }
}

