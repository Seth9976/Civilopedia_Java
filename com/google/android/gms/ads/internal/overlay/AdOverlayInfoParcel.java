package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdwh;
import com.google.android.gms.internal.ads.zzees;
import com.google.android.gms.internal.ads.zzfgp;

@Class(creator = "AdOverlayInfoCreator")
@Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final zzc zza;
    @Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final zza zzb;
    @Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzo zzc;
    @Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzcli zzd;
    @Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzbno zze;
    @Field(id = 7)
    public final String zzf;
    @Field(id = 8)
    public final boolean zzg;
    @Field(id = 9)
    public final String zzh;
    @Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzw zzi;
    @Field(id = 11)
    public final int zzj;
    @Field(id = 12)
    public final int zzk;
    @Field(id = 13)
    public final String zzl;
    @Field(id = 14)
    public final zzcfo zzm;
    @Field(id = 16)
    public final String zzn;
    @Field(id = 17)
    public final zzj zzo;
    @Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzbnm zzp;
    @Field(id = 19)
    public final String zzq;
    @Field(getter = "getOfflineDatabaseManagerAsBinder", id = 20, type = "android.os.IBinder")
    public final zzees zzr;
    @Field(getter = "getCsiReporterAsBinder", id = 21, type = "android.os.IBinder")
    public final zzdwh zzs;
    @Field(getter = "getLoggerAsBinder", id = 22, type = "android.os.IBinder")
    public final zzfgp zzt;
    @Field(getter = "getWorkManagerUtilAsBinder", id = 23, type = "android.os.IBinder")
    public final zzbr zzu;
    @Field(id = 24)
    public final String zzv;
    @Field(id = 25)
    public final String zzw;
    @Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = 26, type = "android.os.IBinder")
    public final zzdcg zzx;
    @Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final zzdjg zzy;

    static {
        AdOverlayInfoParcel.CREATOR = new zzn();
    }

    public AdOverlayInfoParcel(zza zza0, zzo zzo0, zzw zzw0, zzcli zzcli0, int v, zzcfo zzcfo0, String s, zzj zzj0, String s1, String s2, String s3, zzdcg zzdcg0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzo0;
        this.zzd = zzcli0;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzaC)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        }
        else {
            this.zzf = s1;
            this.zzh = s2;
        }
        this.zzi = null;
        this.zzj = v;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzcfo0;
        this.zzn = s;
        this.zzo = zzj0;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = s3;
        this.zzx = zzdcg0;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(zza zza0, zzo zzo0, zzw zzw0, zzcli zzcli0, boolean z, int v, zzcfo zzcfo0, zzdjg zzdjg0) {
        this.zza = null;
        this.zzb = zza0;
        this.zzc = zzo0;
        this.zzd = zzcli0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzw0;
        this.zzj = v;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcfo0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjg0;
    }

    public AdOverlayInfoParcel(zza zza0, zzo zzo0, zzbnm zzbnm0, zzbno zzbno0, zzw zzw0, zzcli zzcli0, boolean z, int v, String s, zzcfo zzcfo0, zzdjg zzdjg0) {
        this.zza = null;
        this.zzb = zza0;
        this.zzc = zzo0;
        this.zzd = zzcli0;
        this.zzp = zzbnm0;
        this.zze = zzbno0;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzw0;
        this.zzj = v;
        this.zzk = 3;
        this.zzl = s;
        this.zzm = zzcfo0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjg0;
    }

    public AdOverlayInfoParcel(zza zza0, zzo zzo0, zzbnm zzbnm0, zzbno zzbno0, zzw zzw0, zzcli zzcli0, boolean z, int v, String s, String s1, zzcfo zzcfo0, zzdjg zzdjg0) {
        this.zza = null;
        this.zzb = zza0;
        this.zzc = zzo0;
        this.zzd = zzcli0;
        this.zzp = zzbnm0;
        this.zze = zzbno0;
        this.zzf = s1;
        this.zzg = z;
        this.zzh = s;
        this.zzi = zzw0;
        this.zzj = v;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcfo0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjg0;
    }

    public AdOverlayInfoParcel(zzc zzc0, IBinder iBinder0, IBinder iBinder1, IBinder iBinder2, IBinder iBinder3, String s, boolean z, String s1, IBinder iBinder4, int v, int v1, String s2, zzcfo zzcfo0, String s3, zzj zzj0, IBinder iBinder5, String s4, IBinder iBinder6, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, String s5, String s6, IBinder iBinder10, IBinder iBinder11) {
        this.zza = zzc0;
        this.zzb = (zza)ObjectWrapper.unwrap(Stub.asInterface(iBinder0));
        this.zzc = (zzo)ObjectWrapper.unwrap(Stub.asInterface(iBinder1));
        this.zzd = (zzcli)ObjectWrapper.unwrap(Stub.asInterface(iBinder2));
        this.zzp = (zzbnm)ObjectWrapper.unwrap(Stub.asInterface(iBinder5));
        this.zze = (zzbno)ObjectWrapper.unwrap(Stub.asInterface(iBinder3));
        this.zzf = s;
        this.zzg = z;
        this.zzh = s1;
        this.zzi = (zzw)ObjectWrapper.unwrap(Stub.asInterface(iBinder4));
        this.zzj = v;
        this.zzk = v1;
        this.zzl = s2;
        this.zzm = zzcfo0;
        this.zzn = s3;
        this.zzo = zzj0;
        this.zzq = s4;
        this.zzv = s5;
        this.zzr = (zzees)ObjectWrapper.unwrap(Stub.asInterface(iBinder6));
        this.zzs = (zzdwh)ObjectWrapper.unwrap(Stub.asInterface(iBinder7));
        this.zzt = (zzfgp)ObjectWrapper.unwrap(Stub.asInterface(iBinder8));
        this.zzu = (zzbr)ObjectWrapper.unwrap(Stub.asInterface(iBinder9));
        this.zzw = s6;
        this.zzx = (zzdcg)ObjectWrapper.unwrap(Stub.asInterface(iBinder10));
        this.zzy = (zzdjg)ObjectWrapper.unwrap(Stub.asInterface(iBinder11));
    }

    public AdOverlayInfoParcel(zzc zzc0, zza zza0, zzo zzo0, zzw zzw0, zzcfo zzcfo0, zzcli zzcli0, zzdjg zzdjg0) {
        this.zza = zzc0;
        this.zzb = zza0;
        this.zzc = zzo0;
        this.zzd = zzcli0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzw0;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcfo0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjg0;
    }

    public AdOverlayInfoParcel(zzo zzo0, zzcli zzcli0, int v, zzcfo zzcfo0) {
        this.zzc = zzo0;
        this.zzd = zzcli0;
        this.zzj = 1;
        this.zzm = zzcfo0;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(zzcli zzcli0, zzcfo zzcfo0, zzbr zzbr0, zzees zzees0, zzdwh zzdwh0, zzfgp zzfgp0, String s, String s1, int v) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcli0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcfo0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = s;
        this.zzv = s1;
        this.zzr = zzees0;
        this.zzs = zzdwh0;
        this.zzt = zzfgp0;
        this.zzu = zzbr0;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zza, v, false);
        SafeParcelWriter.writeIBinder(parcel0, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzg);
        SafeParcelWriter.writeString(parcel0, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel0, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel0, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel0, 12, this.zzk);
        SafeParcelWriter.writeString(parcel0, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel0, 14, this.zzm, v, false);
        SafeParcelWriter.writeString(parcel0, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel0, 17, this.zzo, v, false);
        SafeParcelWriter.writeIBinder(parcel0, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel0, 19, this.zzq, false);
        SafeParcelWriter.writeIBinder(parcel0, 20, ObjectWrapper.wrap(this.zzr).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 21, ObjectWrapper.wrap(this.zzs).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 22, ObjectWrapper.wrap(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 23, ObjectWrapper.wrap(this.zzu).asBinder(), false);
        SafeParcelWriter.writeString(parcel0, 24, this.zzv, false);
        SafeParcelWriter.writeString(parcel0, 25, this.zzw, false);
        SafeParcelWriter.writeIBinder(parcel0, 26, ObjectWrapper.wrap(this.zzx).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 27, ObjectWrapper.wrap(this.zzy).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static AdOverlayInfoParcel zza(Intent intent0) {
        try {
            Bundle bundle0 = intent0.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundle0.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel)bundle0.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

