package com.google.android.gms.internal.ads;

import android.net.Uri;
import i3.e;
import java.util.Arrays;

public final class zzayl {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzayl(Uri uri0, byte[] arr_b, long v, long v1, long v2, String s, int v3) {
        boolean z = false;
        zzayz.zzc(v >= 0L);
        zzayz.zzc(v1 >= 0L);
        if(v2 > 0L) {
            z = true;
        }
        else if(v2 == -1L) {
            v2 = -1L;
            z = true;
        }
        zzayz.zzc(z);
        this.zza = uri0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(null);
        StringBuilder stringBuilder0 = e.j("DataSpec[", String.valueOf(this.zza), ", ", s, ", ");
        stringBuilder0.append(this.zzb);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzc);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzd);
        stringBuilder0.append(", null, 0]");
        return stringBuilder0.toString();
    }
}

