package com.google.android.gms.internal.ads;

public final class zzapq extends zzaqn {
    public zzapq(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "zzBoiLmCSl4qpONTaYkbu2H1+be7dFpyqhOnbG674OZpERvkqiVrsp9nWT5kU4lr", "4H+WN9tI0y+WKEjRpYWQhzjGaRdS7qtgrPx+7wzXofs=", zzali0, v, 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        this.d.zzl(-1L);
        this.d.zzk(-1L);
        int[] arr_v = (int[])this.e.invoke(null, this.a.zzb());
        synchronized(this.d) {
            this.d.zzl(((long)arr_v[0]));
            this.d.zzk(((long)arr_v[1]));
            int v1 = arr_v[2];
            if(v1 != 0x80000000) {
                this.d.zzj(((long)v1));
            }
        }
    }
}

