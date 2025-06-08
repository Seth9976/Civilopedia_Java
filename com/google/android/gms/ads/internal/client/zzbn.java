package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbrb;

public abstract class zzbn extends zzaqx implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbf zzbf0 = null;
        switch(v) {
            case 1: {
                zzbl zzbl0 = this.zze();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbl0);
                return true;
            }
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbf0 = iInterface0 instanceof zzbf ? ((zzbf)iInterface0) : new zzbd(iBinder0);
                }
                zzaqy.zzc(parcel0);
                this.zzl(zzbf0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                zzblz zzblz0 = zzbly.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzf(zzblz0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                zzbmc zzbmc0 = zzbmb.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzg(zzbmc0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s = parcel0.readString();
                zzbmi zzbmi0 = zzbmh.zzb(parcel0.readStrongBinder());
                zzbmf zzbmf0 = zzbme.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzh(s, zzbmi0, zzbmf0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                zzbkp zzbkp0 = (zzbkp)zzaqy.zza(parcel0, zzbkp.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzo(zzbkp0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzbf0 = iInterface1 instanceof zzcd ? ((zzcd)iInterface1) : new zzcd(iBinder1);
                }
                zzaqy.zzc(parcel0);
                this.zzq(((zzcd)zzbf0));
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                zzbmm zzbmm0 = zzbml.zzb(parcel0.readStrongBinder());
                zzq zzq0 = (zzq)zzaqy.zza(parcel0, zzq.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzj(zzbmm0, zzq0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                PublisherAdViewOptions publisherAdViewOptions0 = (PublisherAdViewOptions)zzaqy.zza(parcel0, PublisherAdViewOptions.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzp(publisherAdViewOptions0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                zzbmp zzbmp0 = zzbmo.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzk(zzbmp0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                zzbqs zzbqs0 = (zzbqs)zzaqy.zza(parcel0, zzbqs.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzn(zzbqs0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzbrb zzbrb0 = zzbra.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzi(zzbrb0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                AdManagerAdViewOptions adManagerAdViewOptions0 = (AdManagerAdViewOptions)zzaqy.zza(parcel0, AdManagerAdViewOptions.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzm(adManagerAdViewOptions0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

