package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.io.IOException;

public final class zzahu implements zzyr {
    public zzyu a;
    public zzzy b;
    public int c;
    public long d;
    public e0 e;
    public int f;
    public long g;
    public static final zzyy zza;

    static {
        zzahu.zza = zzahq.zza;
    }

    public zzahu() {
        this.c = 0;
        this.d = -1L;
        this.f = -1;
        this.g = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        int v10;
        byte[] arr_b1;
        long v = -1L;
        zzcw.zzb(this.b);
        boolean z = true;
        switch(this.c) {
            case 0: {
                zzcw.zzf(zzys0.zzf() == 0L);
                int v3 = this.f;
                if(v3 != -1) {
                    ((zzyl)zzys0).zzo(v3, false);
                    this.c = 4;
                    return 0;
                }
                if(!h.F(zzys0)) {
                    throw zzbp.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzyl)zzys0).zzo(((int)(zzys0.zze() - zzys0.zzf())), false);
                this.c = 1;
                return 0;
            }
            case 1: {
                zzdy zzdy0 = new zzdy(8);
                g0 g00 = g0.a(zzys0, zzdy0);
                if(g00.a == 0x64733634) {
                    ((zzyl)zzys0).zzl(8, false);
                    zzdy0.zzF(0);
                    ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 8, false);
                    v = zzdy0.zzp();
                    ((zzyl)zzys0).zzo(((int)g00.b) + 8, false);
                }
                else {
                    zzys0.zzj();
                }
                this.d = v;
                this.c = 2;
                return 0;
            }
            case 2: {
                zzdy zzdy1 = new zzdy(16);
                long v4 = h.K(0x666D7420, zzys0, zzdy1).b;
                zzcw.zzf(v4 >= 16L);
                ((zzyl)zzys0).zzm(zzdy1.zzH(), 0, 16, false);
                zzdy1.zzF(0);
                int v5 = zzdy1.zzi();
                int v6 = zzdy1.zzi();
                int v7 = zzdy1.zzh();
                zzdy1.zzh();
                int v8 = zzdy1.zzi();
                int v9 = zzdy1.zzi();
                if(((int)v4) - 16 > 0) {
                    byte[] arr_b = new byte[((int)v4) - 16];
                    ((zzyl)zzys0).zzm(arr_b, 0, ((int)v4) - 16, false);
                    arr_b1 = arr_b;
                }
                else {
                    arr_b1 = zzeg.zzf;
                }
                ((zzyl)zzys0).zzo(((int)(zzys0.zze() - zzys0.zzf())), false);
                z z1 = new z(v5, v6, v7, v8, v9, arr_b1);
                if(v5 == 17) {
                    this.e = new d0(this.a, this.b, z1);
                }
                else {
                    switch(v5) {
                        case 1: {
                            v10 = zzeg.zzn(v9);
                            goto label_67;
                        }
                        case 3: {
                            v10 = v9 == 0x20 ? 4 : 0;
                        label_67:
                            if(v10 == 0) {
                                throw zzbp.zzc(("Unsupported WAV format type: " + v5));
                            }
                            this.e = new f0(this.a, this.b, z1, "audio/raw", v10);
                            break;
                        }
                        case 6: {
                            this.e = new f0(this.a, this.b, z1, "audio/g711-alaw", -1);
                            break;
                        }
                        case 7: {
                            this.e = new f0(this.a, this.b, z1, "audio/g711-mlaw", -1);
                            break;
                        }
                        default: {
                            v10 = v5 == 0xFFFE ? zzeg.zzn(v9) : 0;
                            goto label_67;
                        }
                    }
                }
                this.c = 3;
                return 0;
            }
            case 3: {
                zzys0.zzj();
                g0 g01 = h.K(1684108385, zzys0, new zzdy(8));
                ((zzyl)zzys0).zzo(8, false);
                Pair pair0 = Pair.create(zzys0.zzf(), g01.b);
                this.f = ((Long)pair0.first).intValue();
                long v11 = (long)(((Long)pair0.second));
                long v12 = this.d;
                if(v12 != -1L && v11 == 0xFFFFFFFFL) {
                    v11 = v12;
                }
                long v13 = ((long)this.f) + v11;
                this.g = v13;
                long v14 = zzys0.zzd();
                if(v14 != -1L && v13 > v14) {
                    Log.w("WavExtractor", "Data exceeds input length: " + v13 + ", " + v14);
                    this.g = v14;
                    v13 = v14;
                }
                e0 e01 = this.e;
                e01.getClass();
                e01.zza(this.f, v13);
                this.c = 4;
                return 0;
            }
            default: {
                if(this.g == -1L) {
                    z = false;
                }
                zzcw.zzf(z);
                long v1 = this.g;
                long v2 = zzys0.zzf();
                e0 e00 = this.e;
                e00.getClass();
                return e00.a(zzys0, v1 - v2) ? -1 : 0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.a = zzyu0;
        this.b = zzyu0.zzv(0, 1);
        zzyu0.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        this.c = v == 0L ? 0 : 4;
        e0 e00 = this.e;
        if(e00 != null) {
            e00.zzb(v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        return h.F(zzys0);
    }
}

