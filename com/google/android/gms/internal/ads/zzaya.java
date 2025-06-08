package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

public abstract class zzaya extends zzaye {
    public final SparseArray b;
    public final SparseBooleanArray c;

    public zzaya() {
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
    }

    public abstract zzaxu[] a(zzarz[] arg1, zzaxq[] arg2, int[][][] arg3);

    @Override  // com.google.android.gms.internal.ads.zzaye
    public final zzayf zzc(zzarz[] arr_zzarz, zzaxq zzaxq0) throws zzarf {
        int[] arr_v = new int[3];
        zzaxp[][] arr2_zzaxp = new zzaxp[3][];
        int[][][] arr3_v = new int[3][][];
        for(int v = 0; v < 3; ++v) {
            arr2_zzaxp[v] = new zzaxp[zzaxq0.zzb];
            arr3_v[v] = new int[zzaxq0.zzb][];
        }
        for(int v1 = 0; v1 < 2; ++v1) {
            arr_zzarz[v1].zze();
            new int[2][v1] = 4;
        }
        for(int v2 = 0; v2 < zzaxq0.zzb; ++v2) {
            zzaxp zzaxp0 = zzaxq0.zzb(v2);
            int v3 = 0;
            int v4 = 2;
            int v5 = 0;
        alab1:
            while(true) {
                if(v5 >= 2) {
                    v5 = v4;
                    break;
                }
                zzarz zzarz0 = arr_zzarz[v5];
                for(int v6 = 0; v6 <= 0; ++v6) {
                    int v7 = zzarz0.zzG(zzaxp0.zzb(v6)) & 3;
                    if(v7 > v3) {
                        if(v7 == 3) {
                            break alab1;
                        }
                        else {
                            v3 = v7;
                            v4 = v5;
                        }
                    }
                }
                ++v5;
            }
            int[] arr_v1 = v5 == 2 ? new int[1] : new int[]{arr_zzarz[v5].zzG(zzaxp0.zzb(0))};
            int v8 = arr_v[v5];
            arr2_zzaxp[v5][v8] = zzaxp0;
            arr3_v[v5][v8] = arr_v1;
            arr_v[v5] = v8 + 1;
        }
        zzaxq[] arr_zzaxq = new zzaxq[2];
        for(int v9 = 0; v9 < 2; ++v9) {
            int v10 = arr_v[v9];
            arr_zzaxq[v9] = new zzaxq(((zzaxp[])Arrays.copyOf(arr2_zzaxp[v9], v10)));
            arr3_v[v9] = (int[][])Arrays.copyOf(arr3_v[v9], v10);
            new int[2][v9] = arr_zzarz[v9].zzc();
        }
        new zzaxq(((zzaxp[])Arrays.copyOf(arr2_zzaxp[2], arr_v[2])));
        zzaxu[] arr_zzaxu = this.a(arr_zzarz, arr_zzaxq, arr3_v);
        for(int v11 = 0; v11 < 2; ++v11) {
            if(this.c.get(v11)) {
                arr_zzaxu[v11] = null;
            }
            else {
                zzaxq zzaxq1 = arr_zzaxq[v11];
                Map map0 = (Map)this.b.get(v11);
                if((map0 == null ? null : ((zzaxz)map0.get(zzaxq1))) != null) {
                    throw null;
                }
                continue;
            }
        }
        zzaxy zzaxy0 = new zzaxy();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzasa[] arr_zzasa = new zzasa[2];
        for(int v12 = 0; v12 < 2; ++v12) {
            arr_zzasa[v12] = arr_zzaxu[v12] == null ? null : zzasa.zza;
        }
        return new zzayf(zzaxq0, new zzayc(arr_zzaxu, null), zzaxy0, arr_zzasa);
    }

    @Override  // com.google.android.gms.internal.ads.zzaye
    public final void zzd(Object object0) {
        zzaxy zzaxy0 = (zzaxy)object0;
    }

    public final void zze(int v, boolean z) {
        SparseBooleanArray sparseBooleanArray0 = this.c;
        if(sparseBooleanArray0.get(v) == z) {
            return;
        }
        sparseBooleanArray0.put(v, z);
        zzayd zzayd0 = this.a;
        if(zzayd0 != null) {
            zzayd0.zzh();
        }
    }
}

