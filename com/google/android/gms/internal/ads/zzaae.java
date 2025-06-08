package com.google.android.gms.internal.ads;

import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class zzaae {
    public static int zza(int v) {
        int v1 = 0;
        while(v > 0) {
            ++v1;
            v >>>= 1;
        }
        return v1;
    }

    public static zzbl zzb(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            String s = (String)list0.get(v);
            String[] arr_s = zzeg.zzag(s, "=");
            if(arr_s.length != 2) {
                Log.w("VorbisUtil", "Failed to parse Vorbis comment: " + s);
            }
            else if(arr_s[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList0.add(zzabg.zzb(new zzdy(Base64.decode(arr_s[1], 0))));
                }
                catch(RuntimeException runtimeException0) {
                    zzdn.zzb("VorbisUtil", "Failed to parse vorbis picture", runtimeException0);
                }
            }
            else {
                arrayList0.add(new zzacw(arr_s[0], arr_s[1]));
            }
        }
        return arrayList0.isEmpty() ? null : new zzbl(arrayList0);
    }

    public static zzaab zzc(zzdy zzdy0, boolean z, boolean z1) throws zzbp {
        if(z) {
            zzaae.zzd(3, zzdy0, false);
        }
        String s = zzdy0.zzx(((int)zzdy0.zzq()), zzfoi.zzc);
        long v1 = zzdy0.zzq();
        String[] arr_s = new String[((int)v1)];
        int v2 = s.length() + 15;
        for(int v = 0; ((long)v) < v1; ++v) {
            String s1 = zzdy0.zzx(((int)zzdy0.zzq()), zzfoi.zzc);
            arr_s[v] = s1;
            v2 = v2 + 4 + s1.length();
        }
        if(z1 && (zzdy0.zzk() & 1) == 0) {
            throw zzbp.zza("framing bit expected to be set", null);
        }
        return new zzaab(s, arr_s, v2 + 1);
    }

    public static boolean zzd(int v, zzdy zzdy0, boolean z) throws zzbp {
        if(zzdy0.zza() < 7) {
            if(!z) {
                throw zzbp.zza(("too short header: " + zzdy0.zza()), null);
            }
            return false;
        }
        if(zzdy0.zzk() != v) {
            if(!z) {
                throw zzbp.zza(("expected header type " + Integer.toHexString(v)), null);
            }
            return false;
        }
        if(zzdy0.zzk() == 0x76 && zzdy0.zzk() == 0x6F && zzdy0.zzk() == 0x72 && zzdy0.zzk() == 98 && zzdy0.zzk() == 105 && zzdy0.zzk() == 0x73) {
            return true;
        }
        if(!z) {
            throw zzbp.zza("expected characters \'vorbis\'", null);
        }
        return false;
    }
}

