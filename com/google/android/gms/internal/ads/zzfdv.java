package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@Class(creator = "PoolConfigurationCreator")
@ParametersAreNonnullByDefault
public final class zzfdv extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;
    public final int k;
    @Nullable
    public final Context zza;
    public final zzfds zzb;
    @Field(id = 2)
    public final int zzc;
    @Field(id = 3)
    public final int zzd;
    @Field(id = 4)
    public final int zze;
    @Field(id = 5)
    public final String zzf;
    public final int zzg;

    static {
        zzfdv.CREATOR = new zzfdw();
    }

    @Constructor
    public zzfdv(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) int v2, @Param(id = 4) int v3, @Param(id = 5) String s, @Param(id = 6) int v4, @Param(id = 7) int v5) {
        zzfds[] arr_zzfds = zzfds.values();
        this.zza = null;
        this.i = v;
        this.zzb = arr_zzfds[v];
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = s;
        this.j = v4;
        this.zzg = zzfdt.zza()[v4];
        this.k = v5;
        int v6 = zzfdu.zza()[v5];
    }

    public zzfdv(Context context0, zzfds zzfds0, int v, int v1, int v2, String s, String s1, String s2) {
        zzfds.values();
        int v3;
        this.zza = context0;
        this.i = zzfds0.ordinal();
        this.zzb = zzfds0;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = s;
        if("oldest".equals(s1)) {
            v3 = 1;
        }
        else if("lru".equals(s1)) {
            v3 = 2;
        }
        else if("lfu".equals(s1)) {
            v3 = 3;
        }
        else {
            v3 = 2;
        }
        this.zzg = v3;
        this.j = v3 - 1;
        "onAdClosed".equals(s2);
        this.k = 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel0, 4, this.zze);
        SafeParcelWriter.writeString(parcel0, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel0, 6, this.j);
        SafeParcelWriter.writeInt(parcel0, 7, this.k);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Nullable
    public static zzfdv zza(zzfds zzfds0, Context context0) {
        if(zzfds0 == zzfds.zza) {
            return new zzfdv(context0, zzfds0, ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfq)))), ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfw)))), ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfy)))), ((String)zzay.zzc().zzb(zzbhz.zzfA)), ((String)zzay.zzc().zzb(zzbhz.zzfs)), ((String)zzay.zzc().zzb(zzbhz.zzfu)));
        }
        if(zzfds0 == zzfds.zzb) {
            return new zzfdv(context0, zzfds0, ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfr)))), ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfx)))), ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfz)))), ((String)zzay.zzc().zzb(zzbhz.zzfB)), ((String)zzay.zzc().zzb(zzbhz.zzft)), ((String)zzay.zzc().zzb(zzbhz.zzfv)));
        }
        return zzfds0 == zzfds.zzc ? new zzfdv(context0, zzfds0, ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfE)))), ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfG)))), ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfH)))), ((String)zzay.zzc().zzb(zzbhz.zzfC)), ((String)zzay.zzc().zzb(zzbhz.zzfD)), ((String)zzay.zzc().zzb(zzbhz.zzfF))) : null;
    }
}

