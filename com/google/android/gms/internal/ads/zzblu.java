package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzblu extends zzaqx implements zzblv {
    public zzblu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                String s1 = this.zzi(s);
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 2: {
                String s2 = parcel0.readString();
                zzaqy.zzc(parcel0);
                zzblb zzblb0 = this.zzf(s2);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzblb0);
                return true;
            }
            case 3: {
                List list0 = this.zzj();
                parcel1.writeNoException();
                parcel1.writeStringList(list0);
                return true;
            }
            case 4: {
                String s3 = this.zzh();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 5: {
                String s4 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzm(s4);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                this.zzn();
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzdk zzdk0 = this.zze();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdk0);
                return true;
            }
            case 8: {
                this.zzk();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper0 = this.zzg();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, iObjectWrapper0);
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                boolean z = this.zzq(iObjectWrapper1);
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 11: {
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, null);
                return true;
            }
            case 12: {
                boolean z1 = this.zzp();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z1);
                return true;
            }
            case 13: {
                boolean z2 = this.zzr();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z2);
                return true;
            }
            case 14: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzo(iObjectWrapper2);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                this.zzl();
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzblv zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterface0 instanceof zzblv ? ((zzblv)iInterface0) : new zzblt(iBinder0);
    }
}

