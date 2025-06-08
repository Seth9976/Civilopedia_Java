package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.ads.zzcfb;

@Class(creator = "AdSizeParcelCreator")
@Reserved({1})
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final int zzb;
    @Field(id = 4)
    public final int zzc;
    @Field(id = 5)
    public final boolean zzd;
    @Field(id = 6)
    public final int zze;
    @Field(id = 7)
    public final int zzf;
    @Field(id = 8)
    public final zzq[] zzg;
    @Field(id = 9)
    public final boolean zzh;
    @Field(id = 10)
    public final boolean zzi;
    @Field(id = 11)
    public boolean zzj;
    @Field(id = 12)
    public boolean zzk;
    @Field(id = 13)
    public boolean zzl;
    @Field(id = 14)
    public boolean zzm;
    @Field(id = 15)
    public boolean zzn;
    @Field(id = 16)
    public boolean zzo;

    static {
        zzq.CREATOR = new zzr();
    }

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzq(Context context0, AdSize adSize0) {
        this(context0, new AdSize[]{adSize0});
    }

    public zzq(Context context0, AdSize[] arr_adSize) {
        int v9;
        int v7;
        int v6;
        int v;
        AdSize adSize0 = arr_adSize[0];
        this.zzd = false;
        boolean z = adSize0.isFluid();
        this.zzi = z;
        this.zzm = zzb.zzf(adSize0);
        this.zzn = zzb.zzg(adSize0);
        boolean z1 = zzb.zzh(adSize0);
        this.zzo = z1;
        if(z) {
            this.zze = AdSize.BANNER.getWidth();
            v = AdSize.BANNER.getHeight();
        }
        else if(this.zzn) {
            this.zze = adSize0.getWidth();
            v = zzb.zza(adSize0);
        }
        else if(z1) {
            this.zze = adSize0.getWidth();
            v = zzb.zzb(adSize0);
        }
        else {
            this.zze = adSize0.getWidth();
            v = adSize0.getHeight();
        }
        this.zzb = v;
        int v1 = this.zze;
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        if(v1 == -1) {
            if(context0.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics1 = context0.getResources().getDisplayMetrics();
                if(((int)(((float)displayMetrics1.heightPixels) / displayMetrics1.density)) < 600) {
                    DisplayMetrics displayMetrics2 = context0.getResources().getDisplayMetrics();
                    WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
                    if(windowManager0 == null) {
                        v6 = displayMetrics0.widthPixels;
                    }
                    else {
                        Display display0 = windowManager0.getDefaultDisplay();
                        display0.getRealMetrics(displayMetrics2);
                        int v2 = displayMetrics2.heightPixels;
                        int v3 = displayMetrics2.widthPixels;
                        display0.getMetrics(displayMetrics2);
                        if(displayMetrics2.heightPixels != v2 || displayMetrics2.widthPixels != v3) {
                            v6 = displayMetrics0.widthPixels;
                        }
                        else {
                            int v4 = displayMetrics0.widthPixels;
                            int v5 = context0.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            v6 = v4 - (v5 <= 0 ? 0 : context0.getResources().getDimensionPixelSize(v5));
                        }
                    }
                }
                else {
                    v6 = displayMetrics0.widthPixels;
                }
            }
            else {
                v6 = displayMetrics0.widthPixels;
            }
            this.zzf = v6;
            double f = (double)(((float)v6) / displayMetrics0.density);
            v7 = (int)f;
            if(f - ((double)v7) >= 0.01) {
                ++v7;
            }
        }
        else {
            v7 = this.zze;
            this.zzf = zzcfb.zzo(displayMetrics0, this.zze);
        }
        if(v == -2) {
            int v8 = (int)(((float)displayMetrics0.heightPixels) / displayMetrics0.density);
            if(v8 <= 400) {
                v9 = 0x20;
            }
            else if(v8 <= 720) {
                v9 = 50;
            }
            else {
                v9 = 90;
            }
        }
        else {
            v9 = this.zzb;
        }
        this.zzc = zzcfb.zzo(displayMetrics0, v9);
        if(v1 == -1 || v == -2) {
            this.zza = v7 + "x" + v9 + "_as";
        }
        else if(this.zzn || this.zzo) {
            this.zza = this.zze + "x" + this.zzb + "_as";
        }
        else if(z) {
            this.zza = "320x50_mb";
        }
        else {
            this.zza = adSize0.toString();
        }
        if(arr_adSize.length > 1) {
            this.zzg = new zzq[arr_adSize.length];
            for(int v10 = 0; v10 < arr_adSize.length; ++v10) {
                this.zzg[v10] = new zzq(context0, arr_adSize[v10]);
            }
        }
        else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public zzq(String s, int v, int v1, boolean z, int v2, int v3, zzq[] arr_zzq, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = z;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = arr_zzq;
        this.zzh = z1;
        this.zzi = z2;
        this.zzj = z3;
        this.zzk = z4;
        this.zzl = z5;
        this.zzm = z6;
        this.zzn = z7;
        this.zzo = z8;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel0, 6, this.zze);
        SafeParcelWriter.writeInt(parcel0, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel0, 8, this.zzg, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel0, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel0, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel0, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel0, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel0, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel0, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel0, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static int zza(DisplayMetrics displayMetrics0) {
        float f = displayMetrics0.density;
        int v = (int)(((float)displayMetrics0.heightPixels) / f);
        if(v <= 400) {
            return (int)(32.0f * f);
        }
        return v > 720 ? ((int)(90.0f * f)) : ((int)(50.0f * f));
    }

    public static zzq zzb() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzq zzc() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzq zzd() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzq zze() {
        return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }
}

