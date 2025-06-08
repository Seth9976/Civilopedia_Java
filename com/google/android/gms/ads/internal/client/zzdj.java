package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

public abstract class zzdj extends zzaqx implements zzdk {
    public zzdj() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzdn zzdn0;
        switch(v) {
            case 1: {
                this.zzl();
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                this.zzk();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                boolean z = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzj(z);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                boolean z1 = this.zzq();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z1);
                return true;
            }
            case 5: {
                int v1 = this.zzh();
                parcel1.writeNoException();
                parcel1.writeInt(v1);
                return true;
            }
            case 6: {
                float f = this.zzg();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;
            }
            case 7: {
                float f1 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;
            }
            case 8: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzdn0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzdn0 = iInterface0 instanceof zzdn ? ((zzdn)iInterface0) : new zzdl(iBinder0);
                }
                zzaqy.zzc(parcel0);
                this.zzm(zzdn0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                float f2 = this.zze();
                parcel1.writeNoException();
                parcel1.writeFloat(f2);
                return true;
            }
            case 10: {
                boolean z2 = this.zzp();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z2);
                return true;
            }
            case 11: {
                zzdn zzdn1 = this.zzi();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdn1);
                return true;
            }
            case 12: {
                boolean z3 = this.zzo();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z3);
                return true;
            }
            case 13: {
                this.zzn();
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzdk zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterface0 instanceof zzdk ? ((zzdk)iInterface0) : new zzdi(iBinder0);
    }
}

