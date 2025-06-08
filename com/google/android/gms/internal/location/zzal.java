package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzbq;

public final class zzal extends zza implements zzam {
    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzd(GeofencingRequest geofencingRequest0, PendingIntent pendingIntent0, zzak zzak0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, geofencingRequest0);
        zzc.zzc(parcel0, pendingIntent0);
        zzc.zzd(parcel0, zzak0);
        this.c(parcel0, 57);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zze(PendingIntent pendingIntent0, zzak zzak0, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, pendingIntent0);
        zzc.zzd(parcel0, zzak0);
        parcel0.writeString(s);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzf(String[] arr_s, zzak zzak0, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeStringArray(arr_s);
        zzc.zzd(parcel0, zzak0);
        parcel0.writeString(s);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzg(zzbq zzbq0, zzak zzak0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, zzbq0);
        zzc.zzd(parcel0, zzak0);
        this.c(parcel0, 74);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzh(long v, boolean z, PendingIntent pendingIntent0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeLong(v);
        zzc.zza(parcel0, true);
        zzc.zzc(parcel0, pendingIntent0);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzi(ActivityTransitionRequest activityTransitionRequest0, PendingIntent pendingIntent0, IStatusCallback iStatusCallback0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, activityTransitionRequest0);
        zzc.zzc(parcel0, pendingIntent0);
        zzc.zzd(parcel0, iStatusCallback0);
        this.c(parcel0, 72);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzj(PendingIntent pendingIntent0, IStatusCallback iStatusCallback0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, pendingIntent0);
        zzc.zzd(parcel0, iStatusCallback0);
        this.c(parcel0, 73);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzk(PendingIntent pendingIntent0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, pendingIntent0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzl(PendingIntent pendingIntent0, IStatusCallback iStatusCallback0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, pendingIntent0);
        zzc.zzd(parcel0, iStatusCallback0);
        this.c(parcel0, 69);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final Location zzm() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 7);
        Location location0 = (Location)zzc.zzb(parcel0, Location.CREATOR);
        parcel0.recycle();
        return location0;
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final Location zzn(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        Parcel parcel1 = this.b(parcel0, 80);
        Location location0 = (Location)zzc.zzb(parcel1, Location.CREATOR);
        parcel1.recycle();
        return location0;
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzo(zzbc zzbc0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, zzbc0);
        this.c(parcel0, 59);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzp(boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zza(parcel0, z);
        this.c(parcel0, 12);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzq(Location location0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, location0);
        this.c(parcel0, 13);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzr(zzai zzai0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzd(parcel0, zzai0);
        this.c(parcel0, 67);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final LocationAvailability zzs(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        Parcel parcel1 = this.b(parcel0, 34);
        LocationAvailability locationAvailability0 = (LocationAvailability)zzc.zzb(parcel1, LocationAvailability.CREATOR);
        parcel1.recycle();
        return locationAvailability0;
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzt(LocationSettingsRequest locationSettingsRequest0, zzao zzao0, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, locationSettingsRequest0);
        zzc.zzd(parcel0, zzao0);
        parcel0.writeString(null);
        this.c(parcel0, 0x3F);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzu(zzl zzl0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, zzl0);
        this.c(parcel0, 75);
    }

    @Override  // com.google.android.gms.internal.location.zzam
    public final void zzv(PendingIntent pendingIntent0, SleepSegmentRequest sleepSegmentRequest0, IStatusCallback iStatusCallback0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzc.zzc(parcel0, pendingIntent0);
        zzc.zzc(parcel0, sleepSegmentRequest0);
        zzc.zzd(parcel0, iStatusCallback0);
        this.c(parcel0, 0x4F);
    }
}

