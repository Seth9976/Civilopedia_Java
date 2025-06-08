package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzzg {
    public static final Pattern a;
    public int zza;
    public int zzb;

    static {
        zzzg.a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }

    public zzzg() {
        this.zza = -1;
        this.zzb = -1;
    }

    public final boolean a(String s) {
        Matcher matcher0 = zzzg.a.matcher(s);
        if(matcher0.find()) {
            try {
                int v = Integer.parseInt(matcher0.group(1), 16);
                int v1 = Integer.parseInt(matcher0.group(2), 16);
                if(v > 0 || v1 > 0) {
                    this.zza = v;
                    this.zzb = v1;
                    return true;
                }
                return false;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return false;
    }

    public final boolean zza() {
        return this.zza != -1 && this.zzb != -1;
    }

    public final boolean zzb(zzbl zzbl0) {
        for(int v = 0; v < zzbl0.zza(); ++v) {
            zzbk zzbk0 = zzbl0.zzb(v);
            if(zzbk0 instanceof zzabu) {
                if("iTunSMPB".equals(((zzabu)zzbk0).zzb) && this.a(((zzabu)zzbk0).zzc)) {
                    return true;
                }
            }
            else if(zzbk0 instanceof zzacd && "com.apple.iTunes".equals(((zzacd)zzbk0).zza) && "iTunSMPB".equals(((zzacd)zzbk0).zzb) && this.a(((zzacd)zzbk0).zzc)) {
                return true;
            }
        }
        return false;
    }
}

