package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public final class zzmo implements zzms {
    public final zzch a;
    public final zzcf b;
    public final HashMap c;
    public final zzfpj d;
    public zzmr e;
    public zzci f;
    public String g;
    public static final Random h;
    public static final zzfpj zza;

    static {
        zzmo.zza = () -> {
            byte[] arr_b = new byte[12];
            zzmo.h.nextBytes(arr_b);
            return Base64.encodeToString(arr_b, 10);
        };
        zzmo.h = new Random();
    }

    public zzmo() {
        throw null;
    }

    public zzmo(zzfpj zzfpj0) {
        this.d = zzfpj0;
        this.a = new zzch();
        this.b = new zzcf();
        this.c = new HashMap();
        this.f = zzci.zza;
    }

    public final Ia a(int v, zzsa zzsa0) {
        HashMap hashMap0 = this.c;
        Ia ia0 = null;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(Object object0: hashMap0.values()) {
            Ia ia1 = (Ia)object0;
            if(ia1.c == -1L && v == ia1.b && zzsa0 != null) {
                ia1.c = zzsa0.zzd;
            }
            zzsa zzsa1 = ia1.d;
            if(zzsa0 == null) {
                if(v != ia1.b) {
                    continue;
                }
            }
            else if(zzsa1 != null) {
                if(zzsa0.zzd == zzsa1.zzd && zzsa0.zzb == zzsa1.zzb && zzsa0.zzc == zzsa1.zzc) {
                    goto label_17;
                }
                continue;
            }
            else if(zzsa0.zzb() || zzsa0.zzd != ia1.c) {
                continue;
            }
        label_17:
            long v2 = ia1.c;
            if(v2 != -1L) {
                int v3 = Long.compare(v2, v1);
                if(v3 >= 0) {
                    if(v3 != 0 || ia0.d == null || zzsa1 == null) {
                        continue;
                    }
                    ia0 = ia1;
                    continue;
                }
            }
            ia0 = ia1;
            v1 = v2;
        }
        if(ia0 == null) {
            byte[] arr_b = new byte[12];
            zzmo.h.nextBytes(arr_b);
            String s = Base64.encodeToString(arr_b, 10);
            ia0 = new Ia(this, s, v, zzsa0);
            hashMap0.put(s, ia0);
        }
        return ia0;
    }

    public final void b(zzki zzki0) {
        if(zzki0.zzb.zzo()) {
            this.g = null;
            return;
        }
        Ia ia0 = (Ia)this.c.get(this.g);
        this.g = this.a(zzki0.zzc, zzki0.zzd).a;
        this.zzh(zzki0);
        if(zzki0.zzd != null && zzki0.zzd.zzb() && (ia0 == null || (ia0.c != zzki0.zzd.zzd || (ia0.d == null || ia0.d.zzb != zzki0.zzd.zzb || ia0.d.zzc != zzki0.zzd.zzc)))) {
            zzsa zzsa0 = new zzsa(zzki0.zzd.zza, zzki0.zzd.zzd);
            this.a(zzki0.zzc, zzsa0);
        }
    }

    // 检测为 lambda 实现。
    public static String zzc() {
        byte[] arr_b = new byte[12];
        zzmo.h.nextBytes(arr_b);
        return Base64.encodeToString(arr_b, 10);
    }

    @Override  // com.google.android.gms.internal.ads.zzms
    public final String zzd() {
        synchronized(this) {
        }
        return this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzms
    public final String zze(zzci zzci0, zzsa zzsa0) {
        synchronized(this) {
            Ia ia0 = this.a(zzci0.zzn(zzsa0.zza, this.b).zzd, zzsa0);
            return ia0.a;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzms
    public final void zzf(zzki zzki0) {
        synchronized(this) {
            this.g = null;
            Iterator iterator0 = this.c.values().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Ia ia0 = (Ia)object0;
                iterator0.remove();
                if(ia0.e) {
                    zzmr zzmr0 = this.e;
                    if(zzmr0 != null) {
                        zzmr0.zzd(zzki0, ia0.a, false);
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzms
    public final void zzg(zzmr zzmr0) {
        this.e = zzmr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzms
    public final void zzh(zzki zzki0) {
        synchronized(this) {
            if(this.e != null) {
                if(zzki0.zzb.zzo()) {
                    return;
                }
                Ia ia0 = (Ia)this.c.get(this.g);
                zzsa zzsa0 = zzki0.zzd;
                if(zzsa0 != null && ia0 != null && !(ia0.c == -1L ? ia0.b == zzki0.zzc : zzsa0.zzd >= ia0.c)) {
                    return;
                }
                Ia ia1 = this.a(zzki0.zzc, zzsa0);
                if(this.g == null) {
                    this.g = ia1.a;
                }
                zzsa zzsa1 = zzki0.zzd;
                if(zzsa1 != null && zzsa1.zzb()) {
                    zzsa zzsa2 = new zzsa(zzsa1.zza, zzsa1.zzd, zzsa1.zzb);
                    Ia ia2 = this.a(zzki0.zzc, zzsa2);
                    if(!ia2.e) {
                        ia2.e = true;
                        zzki0.zzb.zzn(zzki0.zzd.zza, this.b);
                        zzeg.zzz(0L);
                        zzeg.zzz(0L);
                    }
                }
                if(!ia1.e) {
                    ia1.e = true;
                }
                if(ia1.a.equals(this.g) && !ia1.f) {
                    ia1.f = true;
                    this.e.zzc(zzki0, ia1.a);
                    return;
                }
                return;
            }
        }
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzms
    public final void zzi(zzki zzki0, int v) {
        synchronized(this) {
            if(this.e != null) {
                Iterator iterator0 = this.c.values().iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    Ia ia0 = (Ia)object0;
                    if(ia0.a(zzki0)) {
                        iterator0.remove();
                        if(ia0.e) {
                            boolean z = ia0.a.equals(this.g);
                            boolean z1 = v == 0 && z && ia0.f;
                            if(z) {
                                this.g = null;
                            }
                            this.e.zzd(zzki0, ia0.a, z1);
                        }
                    }
                }
                this.b(zzki0);
                return;
            }
        }
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzms
    public final void zzj(zzki zzki0) {
        synchronized(this) {
            if(this.e != null) {
                zzci zzci0 = this.f;
                this.f = zzki0.zzb;
                Iterator iterator0 = this.c.values().iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    Ia ia0 = (Ia)object0;
                    if(!ia0.b(zzci0, this.f) || ia0.a(zzki0)) {
                        iterator0.remove();
                        if(ia0.e) {
                            if(ia0.a.equals(this.g)) {
                                this.g = null;
                            }
                            this.e.zzd(zzki0, ia0.a, false);
                        }
                    }
                }
                this.b(zzki0);
                return;
            }
        }
        throw null;
    }
}

