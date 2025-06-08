package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class zzakg extends zzajb {
    public final Object u;
    public final zzajg v;

    public zzakg(int v, String s, zzajg zzajg0, zzajf zzajf0) {
        super(v, s, zzajf0);
        this.u = new Object();
        this.v = zzajg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzajb
    public final zzajh a(zzaix zzaix0) {
        try {
            byte[] arr_b = zzaix0.zzb;
            Map map0 = zzaix0.zzc;
            String s = "ISO-8859-1";
            if(map0 != null) {
                String s1 = (String)map0.get("Content-Type");
                if(s1 != null) {
                    String[] arr_s = s1.split(";", 0);
                    int v = 1;
                    while(v < arr_s.length) {
                        String[] arr_s1 = arr_s[v].trim().split("=", 0);
                        if(arr_s1.length != 2 || !arr_s1[0].equals("charset")) {
                            ++v;
                        }
                        else {
                            s = arr_s1[1];
                            if(true) {
                                break;
                            }
                        }
                    }
                }
            }
            return zzajh.zzb(new String(arr_b, s), zzajy.zzb(zzaix0));
        }
        catch(UnsupportedEncodingException unused_ex) {
            return zzajh.zzb(new String(zzaix0.zzb), zzajy.zzb(zzaix0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzajb
    public void b(Object object0) {
        this.h(((String)object0));
    }

    public void h(String s) {
        synchronized(this.u) {
        }
        this.v.zza(s);
    }
}

