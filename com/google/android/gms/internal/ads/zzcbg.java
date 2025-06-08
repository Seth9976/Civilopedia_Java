package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzcbg extends zzaqx implements zzcbh {
    public zzcbg() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzcbb zzcbb0;
        switch(v) {
            case 1: {
                this.zzj();
                break;
            }
            case 2: {
                this.zzg();
                break;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzcbb0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzcbb0 = iInterface0 instanceof zzcbb ? ((zzcbb)iInterface0) : new zzcaz(iBinder0);
                }
                zzaqy.zzc(parcel0);
                this.zzk(zzcbb0);
                break;
            }
            case 4: {
                int v1 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                this.zzh(v1);
                break;
            }
            case 5: {
                zze zze0 = (zze)zzaqy.zza(parcel0, zze.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzi(zze0);
                break;
            }
            case 6: {
                this.zzf();
                break;
            }
            case 7: {
                this.zze();
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

