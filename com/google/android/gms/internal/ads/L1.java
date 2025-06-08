package com.google.android.gms.internal.ads;

import android.util.SparseArray;

public final class l1 implements Runnable {
    public final int i;
    public final o1 j;

    public l1(o1 o10, int v) {
        this.i = v;
        this.j = o10;
        super();
    }

    @Override
    public final void run() {
        o1 o10 = this.j;
        if(this.i != 0) {
            if(!o10.N) {
                o10.w.zze(o10);
            }
            return;
        }
        if(!o10.N && !o10.z && o10.x != null && o10.y) {
            SparseArray sparseArray0 = o10.v;
            int v = sparseArray0.size();
            for(int v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    o10.r.zzb();
                    zzaxp[] arr_zzaxp = new zzaxp[v];
                    o10.G = new boolean[v];
                    o10.F = new boolean[v];
                    o10.E = o10.x.zza();
                    for(int v2 = 0; v2 < v; ++v2) {
                        zzart zzart0 = ((zzaxk)sparseArray0.valueAt(v2)).zzh();
                        arr_zzaxp[v2] = new zzaxp(new zzart[]{zzart0});
                        boolean z = zzaze.zzb(zzart0.zzf) || zzaze.zza(zzart0.zzf);
                        o10.G[v2] = z;
                        o10.H |= z;
                    }
                    o10.D = new zzaxq(arr_zzaxp);
                    o10.z = true;
                    zzaxo zzaxo0 = new zzaxo(o10.E, o10.x.zzc());
                    o10.n.zzg(zzaxo0, null);
                    o10.w.zzf(o10);
                    break;
                }
                if(((zzaxk)sparseArray0.valueAt(v1)).zzh() == null) {
                    break;
                }
            }
        }
    }
}

