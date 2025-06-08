package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@Class(creator = "NonagonRequestParcelCreator")
@ParametersAreNonnullByDefault
public final class zzbzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final Bundle zza;
    @Field(id = 2)
    public final zzcfo zzb;
    @Field(id = 3)
    public final ApplicationInfo zzc;
    @Field(id = 4)
    public final String zzd;
    @Field(id = 5)
    public final List zze;
    @Field(id = 6)
    public final PackageInfo zzf;
    @Field(id = 7)
    public final String zzg;
    @Field(id = 9)
    public final String zzh;
    @Field(id = 10)
    public zzfdv zzi;
    @Field(id = 11)
    public String zzj;

    static {
        zzbzv.CREATOR = new zzbzw();
    }

    @Constructor
    public zzbzv(@Param(id = 1) Bundle bundle0, @Param(id = 2) zzcfo zzcfo0, @Param(id = 3) ApplicationInfo applicationInfo0, @Param(id = 4) String s, @Param(id = 5) List list0, @Param(id = 6) PackageInfo packageInfo0, @Param(id = 7) String s1, @Param(id = 9) String s2, @Param(id = 10) zzfdv zzfdv0, @Param(id = 11) String s3) {
        this.zza = bundle0;
        this.zzb = zzcfo0;
        this.zzd = s;
        this.zzc = applicationInfo0;
        this.zze = list0;
        this.zzf = packageInfo0;
        this.zzg = s1;
        this.zzh = s2;
        this.zzi = zzfdv0;
        this.zzj = s3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBundle(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zzb, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzc, v, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel0, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.zzf, v, false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel0, 9, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel0, 10, this.zzi, v, false);
        SafeParcelWriter.writeString(parcel0, 11, this.zzj, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

