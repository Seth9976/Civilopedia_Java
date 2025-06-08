package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;

public final class zzeny implements zzfok {
    public final zzenz zza;

    public zzeny(zzenz zzenz0) {
        this.zza = zzenz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        float f1;
        int v3;
        String s1;
        int v1;
        boolean z;
        String s;
        zzenz zzenz0 = this.zza;
        zzetl zzetl0 = (zzetl)object0;
        zzfcd zzfcd0 = zzenz0.b;
        zzq zzq0 = zzfcd0.zze;
        zzq[] arr_zzq = zzq0.zzg;
        if(arr_zzq == null) {
            s = zzq0.zza;
            z = zzq0.zzi;
        }
        else {
            s = null;
            boolean z1 = false;
            boolean z2 = false;
            z = false;
            for(int v = 0; v < arr_zzq.length; ++v) {
                zzq zzq1 = arr_zzq[v];
                boolean z3 = zzq1.zzi;
                if(!z3 && !z1) {
                    s = zzq1.zza;
                    z1 = true;
                }
                if(z3) {
                    if(z2) {
                        z2 = true;
                    }
                    else {
                        z2 = true;
                        z = true;
                    }
                }
                if(z1 && z2) {
                    break;
                }
            }
        }
        Resources resources0 = zzenz0.c.getResources();
        if(resources0 == null) {
        label_40:
            s1 = null;
            f1 = 0.0f;
            v1 = 0;
            v3 = 0;
        }
        else {
            DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
            if(displayMetrics0 != null) {
                float f = displayMetrics0.density;
                v1 = displayMetrics0.widthPixels;
                int v2 = displayMetrics0.heightPixels;
                s1 = zzenz0.d.zzh().zzm();
                v3 = v2;
                f1 = f;
                goto label_44;
            }
            goto label_40;
        }
    label_44:
        StringBuilder stringBuilder0 = new StringBuilder();
        zzq[] arr_zzq1 = zzq0.zzg;
        if(arr_zzq1 != null) {
            boolean z4 = false;
            for(int v4 = 0; v4 < arr_zzq1.length; ++v4) {
                zzq zzq2 = arr_zzq1[v4];
                if(zzq2.zzi) {
                    z4 = true;
                }
                else {
                    if(stringBuilder0.length() != 0) {
                        stringBuilder0.append("|");
                    }
                    int v5 = zzq2.zze;
                    if(v5 == -1) {
                        v5 = f1 == 0.0f ? -1 : ((int)(((float)zzq2.zzf) / f1));
                    }
                    stringBuilder0.append(v5);
                    stringBuilder0.append("x");
                    int v6 = zzq2.zzb;
                    if(v6 == -2) {
                        v6 = f1 == 0.0f ? -2 : ((int)(((float)zzq2.zzc) / f1));
                    }
                    stringBuilder0.append(v6);
                }
            }
            if(z4) {
                if(stringBuilder0.length() != 0) {
                    stringBuilder0.insert(0, "|");
                }
                stringBuilder0.insert(0, "320x50");
            }
        }
        return new zzeoa(zzq0, s, z, stringBuilder0.toString(), f1, v1, v3, s1, zzfcd0.zzp);
    }
}

