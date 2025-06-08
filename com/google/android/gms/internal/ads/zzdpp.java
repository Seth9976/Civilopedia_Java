package com.google.android.gms.internal.ads;

import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzdpp implements zzfok {
    public final zzdpq zza;
    public final double zzb;
    public final boolean zzc;

    public zzdpp(zzdpq zzdpq0, double f, boolean z) {
        this.zza = zzdpq0;
        this.zzb = f;
        this.zzc = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        zzdpq zzdpq0 = this.zza;
        zzdpq0.getClass();
        byte[] arr_b = ((zzaix)object0).zzb;
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inDensity = (int)(this.zzb * 160.0);
        if(!this.zzc) {
            bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfd)).booleanValue()) {
            bitmapFactory$Options0.inJustDecodeBounds = true;
            zzdpq0.a(arr_b, bitmapFactory$Options0);
            bitmapFactory$Options0.inJustDecodeBounds = false;
            int v = bitmapFactory$Options0.outWidth * bitmapFactory$Options0.outHeight;
            if(v > 0) {
                bitmapFactory$Options0.inSampleSize = 1 << (33 - Integer.numberOfLeadingZeros((v - 1) / ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfe)))))) / 2;
            }
        }
        return zzdpq0.a(arr_b, bitmapFactory$Options0);
    }
}

