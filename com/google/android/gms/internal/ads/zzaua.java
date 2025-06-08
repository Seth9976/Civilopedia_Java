package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzaua {
    public static final Pattern a;
    public static final zzawj zza;
    public int zzb;
    public int zzc;

    static {
        zzaua.zza = new S(1);
        zzaua.a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }

    public zzaua() {
        this.zzb = -1;
        this.zzc = -1;
    }

    public final boolean zza() {
        return this.zzb != -1 && this.zzc != -1;
    }

    public final boolean zzb(zzawe zzawe0) {
        for(int v = 0; v < zzawe0.zza(); ++v) {
            zzawd zzawd0 = zzawe0.zzb(v);
            if(zzawd0 instanceof zzawi) {
                String s = ((zzawi)zzawd0).zzc;
                if("iTunSMPB".equals(((zzawi)zzawd0).zzb)) {
                    Matcher matcher0 = zzaua.a.matcher(s);
                    if(matcher0.find()) {
                        try {
                            int v1 = Integer.parseInt(matcher0.group(1), 16);
                            int v2 = Integer.parseInt(matcher0.group(2), 16);
                            if(v1 > 0 || v2 > 0) {
                                this.zzb = v1;
                                this.zzc = v2;
                                return true;
                            }
                        }
                        catch(NumberFormatException unused_ex) {
                        }
                    }
                }
            }
        }
        return false;
    }
}

