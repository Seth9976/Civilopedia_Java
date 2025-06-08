package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

public abstract class zzvj extends zzvm {
    public abstract Pair a(zzvi arg1, int[][][] arg2, int[] arg3);

    @Override  // com.google.android.gms.internal.ads.zzvm
    public final zzvn zzj(zzju[] arr_zzju, zzty zzty0, zzsa zzsa0, zzci zzci0) throws zzgt {
        boolean z1;
        int[] arr_v = new int[3];
        zzck[][] arr2_zzck = new zzck[3][];
        int[][][] arr3_v = new int[3][][];
        for(int v = 0; v < 3; ++v) {
            arr2_zzck[v] = new zzck[zzty0.zzc];
            arr3_v[v] = new int[zzty0.zzc][];
        }
        int[] arr_v1 = new int[2];
        for(int v1 = 0; v1 < 2; ++v1) {
            arr_v1[v1] = arr_zzju[v1].zze();
        }
        for(int v2 = 0; v2 < zzty0.zzc; ++v2) {
            zzck zzck0 = zzty0.zzb(v2);
            int v3 = zzck0.zzd;
            int v4 = 2;
            int v5 = 0;
            int v6 = 1;
            for(int v7 = 0; v7 < 2; ++v7) {
                zzju zzju0 = arr_zzju[v7];
                int v8 = 0;
                for(int v9 = 0; v9 <= 0; ++v9) {
                    v8 = Math.max(v8, zzju0.zzO(zzck0.zzb(v9)) & 7);
                }
                int v10 = arr_v[v7] == 0 ? 1 : 0;
                if(v8 > v5) {
                    v6 = v10;
                    v4 = v7;
                    v5 = v8;
                }
                else if(v8 == v5 && v3 == 5 && v6 == 0 && v10 != 0) {
                    v4 = v7;
                    v5 = v8;
                    v6 = 1;
                }
            }
            int[] arr_v2 = v4 == 2 ? new int[1] : new int[]{arr_zzju[v4].zzO(zzck0.zzb(0))};
            int v11 = arr_v[v4];
            arr2_zzck[v4][v11] = zzck0;
            arr3_v[v4][v11] = arr_v2;
            arr_v[v4] = v11 + 1;
        }
        zzty[] arr_zzty = new zzty[2];
        int[] arr_v3 = new int[2];
        for(int v12 = 0; v12 < 2; ++v12) {
            int v13 = arr_v[v12];
            arr_zzty[v12] = new zzty(((zzck[])zzeg.zzad(arr2_zzck[v12], v13)));
            arr3_v[v12] = (int[][])zzeg.zzad(arr3_v[v12], v13);
            new String[2][v12] = arr_zzju[v12].zzK();
            arr_v3[v12] = arr_zzju[v12].zzb();
        }
        zzvi zzvi0 = new zzvi(arr_v3, arr_zzty, arr_v1, arr3_v, new zzty(((zzck[])zzeg.zzad(arr2_zzck[2], arr_v[2]))));
        Pair pair0 = this.a(zzvi0, arr3_v, arr_v1);
        zzvk[] arr_zzvk = (zzvk[])pair0.second;
        List[] arr_list = new List[arr_zzvk.length];
        for(int v14 = 0; v14 < arr_zzvk.length; ++v14) {
            zzvk zzvk0 = arr_zzvk[v14];
            arr_list[v14] = zzvk0 == null ? zzfrj.zzo() : zzfrj.zzp(zzvk0);
        }
        zzfrg zzfrg0 = new zzfrg();
        int v15 = 0;
        while(v15 < 2) {
            zzty zzty1 = zzvi0.zzd(v15);
            List list0 = arr_list[v15];
            int v16 = 0;
            while(v16 < zzty1.zzc) {
                zzck zzck1 = zzty1.zzb(v16);
                boolean z = zzvi0.zza(v15, v16, false) != 0;
                int[] arr_v4 = new int[1];
                boolean[] arr_z = new boolean[1];
                int v17 = 0;
                while(v17 <= 0) {
                    arr_v4[v17] = zzvi0.zzb(v15, v16, v17) & 7;
                    int v18 = 0;
                    while(true) {
                        z1 = false;
                        if(v18 < list0.size()) {
                            zzvk zzvk1 = (zzvk)list0.get(v18);
                            if(!zzvk1.zze().equals(zzck1) || zzvk1.zzb(v17) == -1) {
                                ++v18;
                                continue;
                            }
                            else {
                                z1 = true;
                            }
                        }
                        break;
                    }
                    arr_z[v17] = z1;
                    ++v17;
                }
                zzfrg0.zze(new zzcs(zzck1, z, arr_v4, arr_z));
                ++v16;
            }
            ++v15;
        }
        zzty zzty2 = zzvi0.zze();
        for(int v19 = 0; v19 < zzty2.zzc; ++v19) {
            zzck zzck2 = zzty2.zzb(v19);
            int[] arr_v5 = new int[1];
            Arrays.fill(arr_v5, 0);
            zzfrg0.zze(new zzcs(zzck2, false, arr_v5, new boolean[1]));
        }
        zzct zzct0 = new zzct(zzfrg0.zzg());
        return new zzvn(((zzjv[])pair0.first), ((zzvg[])pair0.second), zzct0, zzvi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzvm
    public final void zzk(Object object0) {
        zzvi zzvi0 = (zzvi)object0;
    }
}

