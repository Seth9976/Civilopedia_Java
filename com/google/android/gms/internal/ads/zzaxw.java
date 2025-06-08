package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class zzaxw extends zzaya {
    public final AtomicReference d;

    public zzaxw() {
        this(null);
    }

    public zzaxw(zzayb zzayb0) {
        this.d = new AtomicReference(new zzaxv());
    }

    @Override  // com.google.android.gms.internal.ads.zzaya
    public final zzaxu[] a(zzarz[] arr_zzarz, zzaxq[] arr_zzaxq, int[][][] arr3_v) {
        int v14;
        int v13;
        int v12;
        int[] arr_v1;
        int v10;
        ArrayList arrayList1;
        int v9;
        zzaxp zzaxp2;
        zzaxu[] arr_zzaxu = new zzaxu[2];
        zzaxv zzaxv0 = (zzaxv)this.d.get();
        boolean z = false;
        int v = 0;
        while(v < 2) {
            if(arr_zzarz[v].zzc() == 2) {
                if(!z) {
                    zzarz zzarz0 = arr_zzarz[v];
                    zzaxq zzaxq0 = arr_zzaxq[v];
                    int[][] arr2_v = arr3_v[v];
                    int v1 = 0;
                    zzaxp zzaxp0 = null;
                    int v2 = 0;
                    int v3 = 0;
                    int v4 = -1;
                    int v5 = -1;
                    while(v1 < zzaxq0.zzb) {
                        zzaxp zzaxp1 = zzaxq0.zzb(v1);
                        ArrayList arrayList0 = new ArrayList(1);
                        for(int v6 = 0; v6 <= 0; ++v6) {
                            arrayList0.add(v6);
                        }
                        int[] arr_v = arr2_v[v1];
                        int v7 = v5;
                        int v8 = 0;
                        while(v8 <= 0) {
                            if(zzaxw.b(arr_v[v8], true)) {
                                zzart zzart0 = zzaxp1.zzb(v8);
                                if(arrayList0.contains(v8)) {
                                    zzaxp2 = zzaxp1;
                                    v9 = 1;
                                }
                                else {
                                    zzaxp2 = zzaxp1;
                                    v9 = 0;
                                }
                                if(1 == v9) {
                                    arrayList1 = arrayList0;
                                    v10 = 2;
                                }
                                else {
                                    arrayList1 = arrayList0;
                                    v10 = 1;
                                }
                                arr_v1 = arr_v;
                                boolean z1 = zzaxw.b(arr_v[v8], false);
                                if(z1) {
                                    v10 += 1000;
                                }
                                boolean z2 = v10 > v3;
                                if(v10 == v3) {
                                    if(zzart0.zza() == v7) {
                                        v12 = v10;
                                        v14 = -1;
                                        int v15 = zzart0.zzb;
                                        if(v15 != -1) {
                                            v14 = v4 == -1 ? 1 : v15 - v4;
                                        }
                                        else if(v4 == -1) {
                                            v14 = 0;
                                        }
                                    }
                                    else {
                                        int v11 = zzart0.zza();
                                        v12 = v10;
                                        if(v11 != -1) {
                                            v13 = v7 == -1 ? 1 : v11 - v7;
                                        }
                                        else if(v7 == -1) {
                                            v13 = 0;
                                        }
                                        else {
                                            v13 = -1;
                                        }
                                        v14 = v13;
                                    }
                                    if(!z1 || v9 == 0) {
                                        if(v14 < 0) {
                                            z2 = true;
                                            goto label_78;
                                        }
                                    }
                                    else if(v14 > 0) {
                                        z2 = true;
                                        goto label_78;
                                    }
                                    z2 = false;
                                }
                                else {
                                    v12 = v10;
                                }
                            label_78:
                                if(z2) {
                                    v4 = zzart0.zzb;
                                    v7 = zzart0.zza();
                                    v2 = v8;
                                    zzaxp0 = zzaxp2;
                                    v3 = v12;
                                }
                            }
                            else {
                                zzaxp2 = zzaxp1;
                                arr_v1 = arr_v;
                                arrayList1 = arrayList0;
                            }
                            ++v8;
                            zzaxp1 = zzaxp2;
                            arrayList0 = arrayList1;
                            arr_v = arr_v1;
                        }
                        ++v1;
                        v5 = v7;
                    }
                    zzaxx zzaxx0 = zzaxp0 == null ? null : new zzaxx(zzaxp0, v2, 0, null);
                    arr_zzaxu[v] = zzaxx0;
                    z = zzaxx0 != null;
                }
                zzaxq zzaxq1 = arr_zzaxq[v];
            }
            ++v;
        }
        boolean z3 = false;
        for(int v16 = 0; v16 < 2; ++v16) {
            if(arr_zzarz[v16].zzc() == 1 && !z3) {
                zzaxq zzaxq2 = arr_zzaxq[v16];
                int[][] arr2_v1 = arr3_v[v16];
                int v17 = -1;
                int v18 = -1;
                int v19 = 0;
                for(int v20 = 0; v19 < zzaxq2.zzb; v20 = v21) {
                    zzaxp zzaxp3 = zzaxq2.zzb(v19);
                    int[] arr_v2 = arr2_v1[v19];
                    int v21 = v20;
                    int v22 = v18;
                    int v23 = v17;
                    for(int v24 = 0; v24 <= 0; ++v24) {
                        if(zzaxw.b(arr_v2[v24], true)) {
                            int v25 = 1 == (zzaxp3.zzb(v24).zzx & 1) ? 2 : 1;
                            if(zzaxw.b(arr_v2[v24], false)) {
                                v25 += 1000;
                            }
                            if(v25 > v21) {
                                v22 = v24;
                                v23 = v19;
                                v21 = v25;
                            }
                        }
                    }
                    ++v19;
                    v17 = v23;
                    v18 = v22;
                }
                zzaxx zzaxx1 = v17 == -1 ? null : new zzaxx(zzaxq2.zzb(v17), v18, 0, null);
                arr_zzaxu[v16] = zzaxx1;
                z3 = zzaxx1 != null;
            }
        }
        return arr_zzaxu;
    }

    public static boolean b(int v, boolean z) {
        return (v & 3) == 3 || z && (v & 3) == 2;
    }
}

