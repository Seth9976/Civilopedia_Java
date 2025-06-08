package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzaap implements zzyr {
    public final zzdy a;
    public final zzdy b;
    public final zzdy c;
    public final zzdy d;
    public final c e;
    public zzyu f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public b o;
    public e p;
    public static final zzyy zza;

    static {
        zzaap.zza = zzaao.zza;
    }

    public zzaap() {
        this.a = new zzdy(4);
        this.b = new zzdy(9);
        this.c = new zzdy(11);
        this.d = new zzdy();
        c c0 = new c(new zzyq());  // 初始化器: Lcom/google/android/gms/internal/ads/d;-><init>(Lcom/google/android/gms/internal/ads/zzzy;)V
        c0.j = 0x8000000000000001L;
        c0.k = new long[0];
        c0.l = new long[0];
        this.e = c0;
        this.g = 1;
    }

    public final zzdy a(zzys zzys0) {
        zzdy zzdy0 = this.d;
        if(this.l > zzdy0.zzb()) {
            int v = zzdy0.zzb();
            zzdy0.zzD(new byte[Math.max(v + v, this.l)], 0);
        }
        else {
            zzdy0.zzF(0);
        }
        zzdy0.zzE(this.l);
        ((zzyl)zzys0).zzn(zzdy0.zzH(), 0, this.l, false);
        return zzdy0;
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        boolean z1;
        boolean z;
        long v2;
        zzcw.zzb(this.f);
        while(true) {
            int v = this.g;
            int v1 = 8;
            if(v != 1) {
                switch(v) {
                    case 2: {
                        ((zzyl)zzys0).zzo(this.j, false);
                        this.j = 0;
                        this.g = 3;
                        continue;
                    }
                    case 3: {
                        zzdy zzdy0 = this.c;
                        if(!zzys0.zzn(zzdy0.zzH(), 0, 11, true)) {
                            return -1;
                        }
                        zzdy0.zzF(0);
                        this.k = zzdy0.zzk();
                        this.l = zzdy0.zzm();
                        this.m = (long)zzdy0.zzm();
                        this.m = (((long)(zzdy0.zzk() << 24)) | this.m) * 1000L;
                        zzdy0.zzG(3);
                        this.g = 4;
                        continue;
                    }
                    case 4: {
                        c c0 = this.e;
                        if(this.h) {
                            v2 = this.i + this.m;
                        }
                        else {
                            v2 = c0.j == 0x8000000000000001L ? 0L : this.m;
                        }
                        int v3 = this.k;
                        if(v3 != 8) {
                            v1 = v3;
                        }
                        else if(this.o != null) {
                            if(!this.n) {
                                this.f.zzL(new zzzt(0x8000000000000001L, 0L));
                                this.n = true;
                            }
                            b b0 = this.o;
                            zzdy zzdy1 = this.a(zzys0);
                            if(b0.j) {
                                zzdy1.zzG(1);
                            }
                            else {
                                int v4 = zzdy1.zzk();
                                int v5 = v4 >> 4;
                                b0.l = v5;
                                zzzy zzzy0 = (zzzy)b0.i;
                                if(v5 == 2) {
                                    int v6 = b.m[v4 >> 2 & 3];
                                    zzab zzab0 = new zzab();
                                    zzab0.zzS("audio/mpeg");
                                    zzab0.zzw(1);
                                    zzab0.zzT(v6);
                                    zzzy0.zzk(zzab0.zzY());
                                    b0.k = true;
                                }
                                else {
                                    switch(v5) {
                                        case 7: 
                                        case 8: {
                                            zzab zzab1 = new zzab();
                                            zzab1.zzS((v5 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw"));
                                            zzab1.zzw(1);
                                            zzab1.zzT(8000);
                                            zzzy0.zzk(zzab1.zzY());
                                            b0.k = true;
                                            break;
                                        }
                                        case 10: {
                                            break;
                                        }
                                        default: {
                                            throw new zzaar("Audio format not supported: " + v5);
                                        }
                                    }
                                }
                                b0.j = true;
                            }
                            int v7 = b0.l;
                            zzzy zzzy1 = (zzzy)b0.i;
                            z = true;
                            if(v7 == 2) {
                                int v8 = zzdy1.zza();
                                zzzy1.zzq(zzdy1, v8);
                                ((zzzy)b0.i).zzs(v2, 1, v8, 0, null);
                            }
                            else {
                                int v9 = zzdy1.zzk();
                                if(v9 == 0 && !b0.k) {
                                    int v10 = zzdy1.zza();
                                    byte[] arr_b = new byte[v10];
                                    zzdy1.zzB(arr_b, 0, v10);
                                    zzxs zzxs0 = zzxt.zza(arr_b);
                                    zzab zzab2 = new zzab();
                                    zzab2.zzS("audio/mp4a-latm");
                                    zzab2.zzx(zzxs0.zzc);
                                    zzab2.zzw(zzxs0.zzb);
                                    zzab2.zzT(zzxs0.zza);
                                    zzab2.zzI(Collections.singletonList(arr_b));
                                    zzzy1.zzk(zzab2.zzY());
                                    b0.k = true;
                                }
                                else if(b0.l != 10 || v9 == 1) {
                                    int v11 = zzdy1.zza();
                                    zzzy1.zzq(zzdy1, v11);
                                    ((zzzy)b0.i).zzs(v2, 1, v11, 0, null);
                                    z1 = true;
                                    goto label_191;
                                }
                                z = false;
                            }
                            z1 = true;
                            goto label_191;
                        }
                        if(v1 == 9) {
                            if(this.p != null) {
                                if(!this.n) {
                                    this.f.zzL(new zzzt(0x8000000000000001L, 0L));
                                    this.n = true;
                                }
                                e e0 = this.p;
                                zzdy zzdy2 = this.a(zzys0);
                                e0.getClass();
                                int v12 = zzdy2.zzk();
                                int v13 = v12 & 15;
                                if(v13 != 7) {
                                    throw new zzaar("Video format not supported: " + v13);
                                }
                                e0.o = v12 >> 4;
                                if(v12 >> 4 == 5) {
                                    z = false;
                                }
                                else {
                                    int v14 = zzdy2.zzk();
                                    long v15 = ((long)zzdy2.zzf()) * 1000L + v2;
                                    zzzy zzzy2 = (zzzy)e0.i;
                                    if(v14 != 0) {
                                        if(v14 == 1 && e0.m) {
                                            int v16 = e0.o == 1 ? 1 : 0;
                                            if(e0.n || v16 != 0) {
                                                zzdy zzdy4 = e0.k;
                                                byte[] arr_b1 = zzdy4.zzH();
                                                arr_b1[0] = 0;
                                                arr_b1[1] = 0;
                                                arr_b1[2] = 0;
                                                int v17 = 4 - e0.l;
                                                int v18;
                                                for(v18 = 0; zzdy2.zza() > 0; v18 = v18 + 4 + v19) {
                                                    zzdy2.zzB(zzdy4.zzH(), v17, e0.l);
                                                    zzdy4.zzF(0);
                                                    int v19 = zzdy4.zzn();
                                                    e0.j.zzF(0);
                                                    zzzy2.zzq(e0.j, 4);
                                                    zzzy2.zzq(zzdy2, v19);
                                                }
                                                ((zzzy)e0.i).zzs(v15, v16, v18, 0, null);
                                                e0.n = true;
                                                z = true;
                                            }
                                        }
                                    }
                                    else if(!e0.m) {
                                        zzdy zzdy3 = new zzdy(new byte[zzdy2.zza()]);
                                        zzdy2.zzB(zzdy3.zzH(), 0, zzdy2.zza());
                                        zzya zzya0 = zzya.zza(zzdy3);
                                        e0.l = zzya0.zzb;
                                        zzab zzab3 = new zzab();
                                        zzab3.zzS("video/avc");
                                        zzab3.zzx(zzya0.zzf);
                                        zzab3.zzX(zzya0.zzc);
                                        zzab3.zzF(zzya0.zzd);
                                        zzab3.zzP(zzya0.zze);
                                        zzab3.zzI(zzya0.zza);
                                        zzzy2.zzk(zzab3.zzY());
                                        e0.m = true;
                                        z = false;
                                        z1 = true;
                                        goto label_191;
                                    }
                                }
                                z1 = true;
                                goto label_191;
                            }
                        }
                        else if(v1 == 18 && !this.n) {
                            zzdy zzdy5 = this.a(zzys0);
                            c0.getClass();
                            c0.getClass();
                            if(zzdy5.zzk() == 2 && "onMetaData".equals(c.b(zzdy5)) && zzdy5.zza() != 0 && zzdy5.zzk() == 8) {
                                HashMap hashMap0 = c.c(zzdy5);
                                Object object0 = hashMap0.get("duration");
                                if(object0 instanceof Double) {
                                    double f = (double)(((Double)object0));
                                    if(f > 0.0) {
                                        c0.j = (long)(f * 1000000.0);
                                    }
                                }
                                Object object1 = hashMap0.get("keyframes");
                                if(object1 instanceof Map) {
                                    Object object2 = ((Map)object1).get("filepositions");
                                    Object object3 = ((Map)object1).get("times");
                                    if(object2 instanceof List && object3 instanceof List) {
                                        List list0 = (List)object2;
                                        List list1 = (List)object3;
                                        int v20 = list1.size();
                                        c0.k = new long[v20];
                                        c0.l = new long[v20];
                                        int v21 = 0;
                                        while(v21 < v20) {
                                            Object object4 = list0.get(v21);
                                            Object object5 = list1.get(v21);
                                            if(object5 instanceof Double && object4 instanceof Double) {
                                                c0.k[v21] = (long)(((double)(((Double)object5))) * 1000000.0);
                                                c0.l[v21] = ((Double)object4).longValue();
                                                ++v21;
                                            }
                                            else {
                                                c0.k = new long[0];
                                                c0.l = new long[0];
                                                if(true) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            long v22 = c0.j;
                            if(v22 != 0x8000000000000001L) {
                                this.f.zzL(new zzzj(c0.l, c0.k, v22));
                                this.n = true;
                            }
                            z1 = true;
                        }
                        else {
                            ((zzyl)zzys0).zzo(this.l, false);
                            z1 = false;
                        }
                        z = false;
                    label_191:
                        if(!this.h && z) {
                            this.h = true;
                            this.i = c0.j == 0x8000000000000001L ? -this.m : 0L;
                        }
                        this.j = 4;
                        this.g = 2;
                        if(!z1) {
                            continue;
                        }
                        return 0;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
            }
            zzdy zzdy6 = this.b;
            if(!zzys0.zzn(zzdy6.zzH(), 0, 9, true)) {
                return -1;
            }
            zzdy6.zzF(0);
            zzdy6.zzG(4);
            int v23 = zzdy6.zzk();
            if((4 & v23) != 0 && this.o == null) {
                this.o = new b(this.f.zzv(8, 1));  // 初始化器: Lcom/google/android/gms/internal/ads/d;-><init>(Lcom/google/android/gms/internal/ads/zzzy;)V
            }
            if((v23 & 1) != 0 && this.p == null) {
                this.p = new e(this.f.zzv(9, 2));
            }
            this.f.zzB();
            this.j = zzdy6.zze() - 5;
            this.g = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.f = zzyu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        if(v == 0L) {
            this.g = 1;
            this.h = false;
        }
        else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        zzdy zzdy0 = this.a;
        ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 3, false);
        zzdy0.zzF(0);
        if(zzdy0.zzm() != 4607062) {
            return false;
        }
        ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 2, false);
        zzdy0.zzF(0);
        if((zzdy0.zzo() & 0xFA) != 0) {
            return false;
        }
        ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 4, false);
        zzdy0.zzF(0);
        int v = zzdy0.zze();
        zzys0.zzj();
        ((zzyl)zzys0).zzl(v, false);
        ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 4, false);
        zzdy0.zzF(0);
        return zzdy0.zze() == 0;
    }
}

