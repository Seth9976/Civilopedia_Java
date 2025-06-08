package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzble extends zzaqx implements zzblf {
    public zzble() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbky zzbky0;
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzbw(s, iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                zzaqy.zzc(parcel0);
                IObjectWrapper iObjectWrapper1 = this.zzb(s1);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, iObjectWrapper1);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzbA(iObjectWrapper2);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.zzc();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                Stub.asInterface(parcel0.readStrongBinder());
                parcel0.readInt();
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzbx(iObjectWrapper3);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzd(iObjectWrapper4);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbky0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbky0 = iInterface0 instanceof zzbky ? ((zzbky)iInterface0) : new zzbkw(iBinder0);
                }
                zzaqy.zzc(parcel0);
                this.zzby(zzbky0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzbz(iObjectWrapper5);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzblf zzbB(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterface0 instanceof zzblf ? ((zzblf)iInterface0) : new zzbld(iBinder0);
    }
}

