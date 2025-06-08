package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.PriorityQueue;

public final class zzbbr {
    public final int a;
    public final zzbbt b;

    public zzbbr(int v) {
        this.b = new zzbbt();
        this.a = v;
    }

    public final String zza(ArrayList arrayList0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(((String)arrayList0.get(v1)).toLowerCase(Locale.US));
            stringBuilder0.append('\n');
        }
        String[] arr_s = stringBuilder0.toString().split("\n");
        if(arr_s.length != 0) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x1000);
            Base64OutputStream base64OutputStream0 = new Base64OutputStream(byteArrayOutputStream0, 10);
            s0 s00 = new s0(2);
            int v2 = this.a;
            PriorityQueue priorityQueue0 = new PriorityQueue(v2, s00);
            for(int v3 = 0; v3 < arr_s.length; ++v3) {
                String[] arr_s1 = zzbbs.zzb(arr_s[v3], false);
                if(arr_s1.length != 0) {
                    zzbbw.zzc(arr_s1, v2, 6, priorityQueue0);
                }
            }
            for(Object object0: priorityQueue0) {
                zzbbv zzbbv0 = (zzbbv)object0;
                try {
                    base64OutputStream0.write(this.b.zzb(zzbbv0.b));
                }
                catch(IOException iOException0) {
                    zzcfi.zzh("Error while writing hash to byteStream", iOException0);
                    if(true) {
                        break;
                    }
                }
            }
            try {
                base64OutputStream0.close();
            }
            catch(IOException iOException1) {
                zzcfi.zzh("HashManager: Unable to convert to Base64.", iOException1);
            }
            try {
                byteArrayOutputStream0.close();
                return byteArrayOutputStream0.toString();
            }
            catch(IOException iOException2) {
                zzcfi.zzh("HashManager: Unable to convert to Base64.", iOException2);
            }
        }
        return "";
    }
}

