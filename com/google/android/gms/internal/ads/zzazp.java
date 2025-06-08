package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class zzazp {
    public final List zza;
    public final int zzb;
    public final float zzc;

    public zzazp(ArrayList arrayList0, int v, float f) {
        this.zza = arrayList0;
        this.zzb = v;
        this.zzc = f;
    }

    public static zzazp zza(zzazh zzazh0) throws zzarw {
        float f;
        try {
            zzazh0.zzw(4);
            int v = (zzazh0.zzg() & 3) + 1;
            if(v == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList0 = new ArrayList();
            int v1 = zzazh0.zzg();
            for(int v3 = 0; v3 < (v1 & 0x1F); ++v3) {
                int v4 = zzazh0.zzj();
                zzazh0.zzw(v4);
                arrayList0.add(zzaza.zzb(zzazh0.zza, zzazh0.zzc(), v4));
            }
            int v5 = zzazh0.zzg();
            for(int v6 = 0; true; ++v6) {
                f = 1.0f;
                if(v6 >= v5) {
                    break;
                }
                int v7 = zzazh0.zzj();
                zzazh0.zzw(v7);
                arrayList0.add(zzaza.zzb(zzazh0.zza, zzazh0.zzc(), v7));
            }
            if((v1 & 0x1F) > 0) {
                byte[] arr_b = (byte[])arrayList0.get(0);
                zzazi zzazi0 = new zzazi(((byte[])arrayList0.get(0)), v, arr_b.length);
                zzazi0.zzd(8);
                int v8 = zzazi0.zza(8);
                zzazi0.zzd(16);
                zzazi0.zzc();
                switch(v8) {
                    case 44: 
                    case 83: 
                    case 86: 
                    case 100: 
                    case 110: 
                    case 0x76: 
                    case 0x7A: 
                    case 0x80: 
                    case 0x8A: 
                    case 0xF4: {
                        int v9 = zzazi0.zzc();
                        if(v9 == 3) {
                            zzazi0.zze();
                            v9 = 3;
                        }
                        zzazi0.zzc();
                        zzazi0.zzc();
                        zzazi0.zzd(1);
                        if(zzazi0.zze()) {
                            for(int v10 = 0; v10 < (v9 == 3 ? 12 : 8); ++v10) {
                                if(zzazi0.zze()) {
                                    int v11 = v10 >= 6 ? 0x40 : 16;
                                    int v13 = 8;
                                    int v14 = 8;
                                    for(int v12 = 0; v12 < v11; ++v12) {
                                        if(v13 != 0) {
                                            v13 = (zzazi0.zzb() + v14 + 0x100) % 0x100;
                                        }
                                        if(v13 != 0) {
                                            v14 = v13;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                zzazi0.zzc();
                int v15 = zzazi0.zzc();
                if(v15 == 0) {
                    zzazi0.zzc();
                }
                else if(v15 == 1) {
                    zzazi0.zze();
                    zzazi0.zzb();
                    zzazi0.zzb();
                    long v16 = (long)zzazi0.zzc();
                    for(int v2 = 0; ((long)v2) < v16; ++v2) {
                        zzazi0.zzc();
                    }
                }
                zzazi0.zzc();
                zzazi0.zzd(1);
                zzazi0.zzc();
                zzazi0.zzc();
                if(!zzazi0.zze()) {
                    zzazi0.zzd(1);
                }
                zzazi0.zzd(1);
                if(zzazi0.zze()) {
                    zzazi0.zzc();
                    zzazi0.zzc();
                    zzazi0.zzc();
                    zzazi0.zzc();
                }
                if(zzazi0.zze() && zzazi0.zze()) {
                    int v17 = zzazi0.zza(8);
                    if(v17 == 0xFF) {
                        int v18 = zzazi0.zza(16);
                        int v19 = zzazi0.zza(16);
                        if(v18 != 0 && v19 != 0) {
                            f = ((float)v18) / ((float)v19);
                        }
                    }
                    else if(v17 < 17) {
                        f = zzazf.zzb[v17];
                    }
                    else {
                        Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + v17);
                    }
                }
            }
            return new zzazp(arrayList0, v, f);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw new zzarw("Error parsing AVC config", arrayIndexOutOfBoundsException0);
    }
}

