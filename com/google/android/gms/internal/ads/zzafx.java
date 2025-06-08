package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzafx implements zzahl {
    public final zzfrj a;

    public zzafx() {
        this(0);
    }

    public zzafx(int v) {
        this.a = zzfrj.zzo();
    }

    public final List a(zzahk zzahk0) {
        String s1;
        int v6;
        zzdy zzdy0 = new zzdy(zzahk0.zzd);
        List list0 = this.a;
        while(zzdy0.zza() > 0) {
            int v = zzdy0.zzk();
            int v1 = zzdy0.zzk();
            int v2 = zzdy0.zzc();
            if(v == 0x86) {
                list0 = new ArrayList();
                int v3 = zzdy0.zzk();
                for(int v4 = 0; v4 < (v3 & 0x1F); ++v4) {
                    String s = zzdy0.zzx(3, zzfoi.zzc);
                    int v5 = zzdy0.zzk();
                    if((v5 & 0x80) == 0) {
                        s1 = "application/cea-608";
                        v6 = 1;
                    }
                    else {
                        v6 = v5 & 0x3F;
                        s1 = "application/cea-708";
                    }
                    int v7 = (byte)zzdy0.zzk();
                    zzdy0.zzG(1);
                    List list1 = (v5 & 0x80) == 0 ? null : Collections.singletonList(((v7 & 0x40) == 0 ? new byte[]{0} : new byte[]{1}));
                    zzab zzab0 = new zzab();
                    zzab0.zzS(s1);
                    zzab0.zzK(s);
                    zzab0.zzu(v6);
                    zzab0.zzI(list1);
                    ((ArrayList)list0).add(zzab0.zzY());
                }
            }
            zzdy0.zzF(v2 + v1);
        }
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzahl
    public final zzahn zza(int v, zzahk zzahk0) {
        switch(v) {
            case 3: 
            case 4: {
                return new zzagr(new zzago(zzahk0.zzb));
            }
            case 15: {
                return new zzagr(new zzafw(false, zzahk0.zzb));
            }
            case 16: {
                return new zzagr(new zzagf(new Q(this.a(zzahk0))));
            }
            case 17: {
                return new zzagr(new zzagn(zzahk0.zzb));
            }
            case 21: {
                return new zzagr(new zzagm());
            }
            case 27: {
                return new zzagr(new zzagj(new zzahb(this.a(zzahk0)), false, false));
            }
            case 36: {
                return new zzagr(new zzagl(new zzahb(this.a(zzahk0))));
            }
            case 89: {
                return new zzagr(new zzafz(zzahk0.zzc));
            }
            case 2: 
            case 0x80: {
                return new zzagr(new zzagc(new Q(this.a(zzahk0))));
            }
            case 0x86: {
                return new zzaha(new zzagq("application/x-scte35"));
            }
            case 0x81: 
            case 0x87: {
                return new zzagr(new zzafq(zzahk0.zzb));
            }
            case 0x8A: {
                return new zzagr(new zzafy(zzahk0.zzb));
            }
            case 0xAC: {
                return new zzagr(new zzaft(zzahk0.zzb));
            }
            case 0x101: {
                return new zzaha(new zzagq("application/vnd.dvb.ait"));
            }
            default: {
                return null;
            }
        }
    }
}

