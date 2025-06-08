package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

public abstract class zzcdy extends zzaqx implements zzcdz {
    public zzcdy() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzcdw zzcdw0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzced zzced0 = (zzced)zzaqy.zza(parcel0, zzced.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcdw0 = iInterface0 instanceof zzcdw ? ((zzcdw)iInterface0) : new zzcdu(iBinder0, "com.google.android.gms.ads.internal.signals.ISignalCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zze(iObjectWrapper0, zzced0, zzcdw0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzj(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                Stub.asInterface(parcel0.readStrongBinder());
                Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, null);
                return true;
            }
            case 4: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, null);
                return true;
            }
            case 5: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzbyk zzbyk0 = zzbyj.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzl(arrayList0, iObjectWrapper2, zzbyk0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                ArrayList arrayList1 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzbyk zzbyk1 = zzbyj.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzk(arrayList1, iObjectWrapper3, zzbyk1);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzbyt zzbyt0 = (zzbyt)zzaqy.zza(parcel0, zzbyt.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzf(zzbyt0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzi(iObjectWrapper4);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                ArrayList arrayList2 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzbyk zzbyk2 = zzbyj.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzh(arrayList2, iObjectWrapper5, zzbyk2);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                ArrayList arrayList3 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                zzbyk zzbyk3 = zzbyj.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzg(arrayList3, iObjectWrapper6, zzbyk3);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzcdz zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterface0 instanceof zzcdz ? ((zzcdz)iInterface0) : new zzcdx(iBinder0);
    }
}

