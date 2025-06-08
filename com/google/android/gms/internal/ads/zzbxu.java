package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbxu extends zzaqx implements zzbxv {
    public zzbxu() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzk(bundle0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                this.zzr();
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.zzp();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                this.zzn();
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                Bundle bundle1 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzq(bundle1);
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, bundle1);
                return true;
            }
            case 7: {
                this.zzs();
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.zzl();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                this.zzv();
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                this.zzh();
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                boolean z = this.zzE();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 12: {
                parcel0.readInt();
                parcel0.readInt();
                Intent intent0 = (Intent)zzaqy.zza(parcel0, Intent.CREATOR);
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzj(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                this.zzt();
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbxv zzF(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterface0 instanceof zzbxv ? ((zzbxv)iInterface0) : new zzbxt(iBinder0);
    }
}

