package com.google.android.gms.internal.ads;

import Q1.b;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class zzahi implements zzyr {
    public final List a;
    public final zzdy b;
    public final SparseIntArray c;
    public final zzafx d;
    public final SparseArray e;
    public final SparseBooleanArray f;
    public final SparseBooleanArray g;
    public final b0 h;
    public a i;
    public zzyu j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public static final zzyy zza;

    static {
        zzahi.zza = zzahf.zza;
    }

    public zzahi() {
        this(0);
    }

    public zzahi(int v) {
        this(1, 0, 112800);
    }

    public zzahi(int v, int v1, int v2) {
        zzee zzee0 = new zzee(0L);
        zzafx zzafx0 = new zzafx(0);
        super();
        this.d = zzafx0;
        this.a = Collections.singletonList(zzee0);
        this.b = new zzdy(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray0 = new SparseBooleanArray();
        this.f = sparseBooleanArray0;
        this.g = new SparseBooleanArray();
        SparseArray sparseArray0 = new SparseArray();
        this.e = sparseArray0;
        this.c = new SparseIntArray();
        this.h = new b0(1);
        this.j = zzyu.zza;
        this.n = -1;
        sparseBooleanArray0.clear();
        sparseArray0.clear();
        SparseArray sparseArray1 = new SparseArray();
        int v3 = sparseArray1.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = sparseArray1.keyAt(v4);
            zzahn zzahn0 = (zzahn)sparseArray1.valueAt(v4);
            this.e.put(v5, zzahn0);
        }
        zzaha zzaha0 = new zzaha(new Q(this));
        this.e.put(0, zzaha0);
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        long v = zzys0.zzd();
        if(this.k) {
            long v1 = 0x8000000000000001L;
            b0 b00 = this.h;
            if(v != -1L && !b00.c) {
                int v2 = this.n;
                if(v2 <= 0) {
                    b00.b(zzys0);
                    return 0;
                }
                zzdy zzdy0 = b00.b;
                if(!b00.e) {
                    long v3 = zzys0.zzd();
                    int v4 = (int)Math.min(112800L, v3);
                    long v5 = v3 - ((long)v4);
                    if(zzys0.zzf() != v5) {
                        zzzr0.zza = v5;
                        return 1;
                    }
                    zzdy0.zzC(v4);
                    zzys0.zzj();
                    ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, v4, false);
                    int v6 = zzdy0.zzc();
                    int v7 = zzdy0.zzd();
                    int v8 = v7 - 0xBC;
                alab1:
                    while(v8 >= v6) {
                        byte[] arr_b = zzdy0.zzH();
                        int v9 = 0;
                        int v10 = -4;
                        while(v10 <= 4) {
                            int v11 = v10 * 0xBC + v8;
                            if(v11 < v6 || v11 >= v7 || arr_b[v11] != 71) {
                                v9 = 0;
                            }
                            else if(v9 + 1 == 5) {
                                goto label_36;
                            }
                            else {
                                ++v9;
                            }
                            ++v10;
                            continue;
                        label_36:
                            long v12 = zzaho.zzb(zzdy0, v8, v2);
                            if(v12 == 0x8000000000000001L) {
                                break;
                            }
                            v1 = v12;
                            break alab1;
                        }
                        --v8;
                    }
                    b00.g = v1;
                    b00.e = true;
                    return 0;
                }
                if(b00.g == 0x8000000000000001L) {
                    b00.b(zzys0);
                    return 0;
                }
                if(!b00.d) {
                    int v13 = (int)Math.min(112800L, zzys0.zzd());
                    if(zzys0.zzf() != 0L) {
                        zzzr0.zza = 0L;
                        return 1;
                    }
                    zzdy0.zzC(v13);
                    zzys0.zzj();
                    ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, v13, false);
                    int v14 = zzdy0.zzc();
                    int v15 = zzdy0.zzd();
                    while(v14 < v15) {
                        if(zzdy0.zzH()[v14] == 71) {
                            long v16 = zzaho.zzb(zzdy0, v14, v2);
                            if(v16 != 0x8000000000000001L) {
                                v1 = v16;
                                break;
                            }
                        }
                        ++v14;
                    }
                    b00.f = v1;
                    b00.d = true;
                    return 0;
                }
                long v17 = b00.f;
                if(v17 == 0x8000000000000001L) {
                    b00.b(zzys0);
                    return 0;
                }
                long v18 = b00.a.zzb(v17);
                long v19 = b00.a.zzb(b00.g) - v18;
                b00.h = v19;
                if(v19 < 0L) {
                    Log.w("TsDurationReader", "Invalid duration: " + v19 + ". Using TIME_UNSET instead.");
                    b00.h = 0x8000000000000001L;
                }
                b00.b(zzys0);
                return 0;
            }
            if(!this.l) {
                this.l = true;
                long v20 = b00.h;
                if(v20 == 0x8000000000000001L) {
                    this.j.zzL(new zzzt(0x8000000000000001L, 0L));
                }
                else {
                    int v21 = this.n;
                    a a0 = new a(new zzyc(), new b(v21, b00.a), v20, v20 + 1L, 0L, v, 0xBCL, 940);  // 初始化器: Lcom/google/android/gms/internal/ads/zzyh;-><init>(Lcom/google/android/gms/internal/ads/zzye;Lcom/google/android/gms/internal/ads/zzyg;JJJJJI)V
                    this.i = a0;
                    this.j.zzL(a0.zzb());
                }
            }
            if(this.m) {
                this.m = false;
                this.zzc(0L, 0L);
                if(zzys0.zzf() != 0L) {
                    zzzr0.zza = 0L;
                    return 1;
                }
            }
            a a1 = this.i;
            if(a1 != null && a1.zze()) {
                return a1.zza(zzys0, zzzr0);
            }
        }
        zzdy zzdy1 = this.b;
        byte[] arr_b1 = zzdy1.zzH();
        if(9400 - zzdy1.zzc() < 0xBC) {
            int v22 = zzdy1.zza();
            if(v22 > 0) {
                System.arraycopy(arr_b1, zzdy1.zzc(), arr_b1, 0, v22);
            }
            zzdy1.zzD(arr_b1, v22);
        }
        while(zzdy1.zza() < 0xBC) {
            int v23 = zzdy1.zzd();
            int v24 = zzys0.zza(arr_b1, v23, 9400 - v23);
            if(v24 == -1) {
                return -1;
            }
            zzdy1.zzE(v23 + v24);
        }
        int v25 = zzaho.zza(zzdy1.zzH(), zzdy1.zzc(), zzdy1.zzd());
        zzdy1.zzF(v25);
        int v26 = zzdy1.zzd();
        if(v25 + 0xBC > v26) {
            return 0;
        }
        int v27 = zzdy1.zze();
        if((0x800000 & v27) != 0) {
            zzdy1.zzF(v25 + 0xBC);
            return 0;
        }
        int v28 = (0x400000 & v27) == 0 ? 0 : 1;
        int v29 = v27 >> 8 & 0x1FFF;
        zzahn zzahn0 = (v27 & 16) == 0 ? null : ((zzahn)this.e.get(v29));
        if(zzahn0 == null) {
            zzdy1.zzF(v25 + 0xBC);
            return 0;
        }
        int v30 = this.c.get(v29, (v27 & 15) - 1);
        this.c.put(v29, v27 & 15);
        if(v30 == (v27 & 15)) {
            zzdy1.zzF(v25 + 0xBC);
            return 0;
        }
        if((v27 & 15) != (v30 + 1 & 15)) {
            zzahn0.zzc();
        }
        if((v27 & 0x20) != 0) {
            int v31 = zzdy1.zzk();
            v28 |= ((zzdy1.zzk() & 0x40) == 0 ? 0 : 2);
            zzdy1.zzG(v31 - 1);
        }
        boolean z = this.k;
        if(!z && this.g.get(v29, false)) {
        label_146:
            if(this.k && v != -1L) {
                this.m = true;
            }
        }
        else {
            zzdy1.zzE(v25 + 0xBC);
            zzahn0.zza(zzdy1, v28);
            zzdy1.zzE(v26);
            if(!z) {
                goto label_146;
            }
        }
        zzdy1.zzF(v25 + 0xBC);
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.j = zzyu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        List list0 = this.a;
        int v2 = list0.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            zzee zzee0 = (zzee)list0.get(v4);
            if(zzee0.zze() == 0x8000000000000001L) {
                zzee0.zzf(v1);
            }
            else {
                long v5 = zzee0.zzc();
                if(v5 != 0x8000000000000001L && v5 != 0L && v5 != v1) {
                    zzee0.zzf(v1);
                }
            }
        }
        if(v1 != 0L) {
            a a0 = this.i;
            if(a0 != null) {
                a0.zzd(v1);
            }
        }
        this.b.zzC(0);
        this.c.clear();
        for(int v3 = 0; true; ++v3) {
            SparseArray sparseArray0 = this.e;
            if(v3 >= sparseArray0.size()) {
                break;
            }
            ((zzahn)sparseArray0.valueAt(v3)).zzc();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        byte[] arr_b = this.b.zzH();
        ((zzyl)zzys0).zzm(arr_b, 0, 940, false);
        int v = 0;
    label_3:
        while(v < 0xBC) {
            int v1 = 0;
            while(v1 < 5) {
                if(arr_b[v1 * 0xBC + v] == 71) {
                    ++v1;
                    continue;
                }
                ++v;
                continue label_3;
            }
            ((zzyl)zzys0).zzo(v, false);
            return true;
        }
        return false;
    }
}

