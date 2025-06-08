package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

public final class p1 implements zzawy, zzawz {
    public final zzawz[] i;
    public final IdentityHashMap j;
    public zzawy k;
    public int l;
    public zzaxq m;
    public zzawz[] n;
    public zzawn o;

    public p1(zzawz[] arr_zzawz) {
        this.i = arr_zzawz;
        this.j = new IdentityHashMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zzB(zzaxu[] arr_zzaxu, boolean[] arr_z, zzaxl[] arr_zzaxl, boolean[] arr_z1, long v) {
        zzawz[] arr_zzawz;
        IdentityHashMap identityHashMap0;
        int[] arr_v = new int[arr_zzaxu.length];
        int[] arr_v1 = new int[arr_zzaxu.length];
        for(int v1 = 0; true; ++v1) {
            identityHashMap0 = this.j;
            arr_zzawz = this.i;
            if(v1 >= arr_zzaxu.length) {
                break;
            }
            zzaxl zzaxl0 = arr_zzaxl[v1];
            arr_v[v1] = zzaxl0 == null ? -1 : ((int)(((Integer)identityHashMap0.get(zzaxl0))));
            arr_v1[v1] = -1;
            zzaxu zzaxu0 = arr_zzaxu[v1];
            if(zzaxu0 != null) {
                zzaxp zzaxp0 = zzaxu0.zzd();
                for(int v2 = 0; v2 < arr_zzawz.length; ++v2) {
                    if(arr_zzawz[v2].zzn().zza(zzaxp0) != -1) {
                        arr_v1[v1] = v2;
                        break;
                    }
                }
            }
        }
        identityHashMap0.clear();
        zzaxl[] arr_zzaxl1 = new zzaxl[arr_zzaxu.length];
        zzaxl[] arr_zzaxl2 = new zzaxl[arr_zzaxu.length];
        zzaxu[] arr_zzaxu1 = new zzaxu[arr_zzaxu.length];
        ArrayList arrayList0 = new ArrayList(arr_zzawz.length);
        long v3 = v;
        for(int v4 = 0; v4 < arr_zzawz.length; v4 = v6 + 1) {
            for(int v5 = 0; true; ++v5) {
                zzaxu zzaxu1 = null;
                if(v5 >= arr_zzaxu.length) {
                    break;
                }
                arr_zzaxl2[v5] = arr_v[v5] == v4 ? arr_zzaxl[v5] : null;
                if(arr_v1[v5] == v4) {
                    zzaxu1 = arr_zzaxu[v5];
                }
                arr_zzaxu1[v5] = zzaxu1;
            }
            int v6 = v4;
            long v7 = arr_zzawz[v4].zzB(arr_zzaxu1, arr_z, arr_zzaxl2, arr_z1, v3);
            if(v6 == 0) {
                v3 = v7;
            }
            else if(v7 != v3) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for(int v8 = 0; true; ++v8) {
                boolean z1 = true;
                if(v8 >= arr_zzaxu.length) {
                    break;
                }
                if(arr_v1[v8] == v6) {
                    zzayz.zze(arr_zzaxl2[v8] != null);
                    zzaxl zzaxl1 = arr_zzaxl2[v8];
                    arr_zzaxl1[v8] = zzaxl1;
                    identityHashMap0.put(zzaxl1, v6);
                    z = true;
                }
                else if(arr_v[v8] == v6) {
                    if(arr_zzaxl2[v8] != null) {
                        z1 = false;
                    }
                    zzayz.zze(z1);
                }
            }
            if(z) {
                arrayList0.add(arr_zzawz[v6]);
            }
        }
        System.arraycopy(arr_zzaxl1, 0, arr_zzaxl, 0, arr_zzaxu.length);
        zzawz[] arr_zzawz1 = new zzawz[arrayList0.size()];
        this.n = arr_zzawz1;
        arrayList0.toArray(arr_zzawz1);
        this.o = new zzawn(this.n);
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zza() {
        return this.o.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final boolean zzbj(long v) {
        return this.o.zzbj(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxm
    public final void zze(zzaxn zzaxn0) {
        zzawz zzawz0 = (zzawz)zzaxn0;
        if(this.m == null) {
            return;
        }
        this.k.zze(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzawy
    public final void zzf(zzawz zzawz0) {
        int v = this.l - 1;
        this.l = v;
        if(v > 0) {
            return;
        }
        zzawz[] arr_zzawz = this.i;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_zzawz.length; ++v1) {
            v2 += arr_zzawz[v1].zzn().zzb;
        }
        zzaxp[] arr_zzaxp = new zzaxp[v2];
        for(int v3 = 0; v3 < arr_zzawz.length; ++v3) {
            zzaxq zzaxq0 = arr_zzawz[v3].zzn();
            int v5 = zzaxq0.zzb;
            int v6 = 0;
            for(int v4 = 0; v6 < v5; ++v4) {
                arr_zzaxp[v4] = zzaxq0.zzb(v6);
                ++v6;
            }
        }
        this.m = new zzaxq(arr_zzaxp);
        this.k.zzf(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zzg() {
        zzawz[] arr_zzawz = this.n;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < arr_zzawz.length; ++v) {
            long v2 = arr_zzawz[v].zzg();
            if(v2 != 0x8000000000000000L) {
                v1 = Math.min(v1, v2);
            }
        }
        return v1 == 0x7FFFFFFFFFFFFFFFL ? 0x8000000000000000L : v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zzh() {
        zzawz[] arr_zzawz = this.i;
        long v = arr_zzawz[0].zzh();
        for(int v1 = 1; v1 < arr_zzawz.length; ++v1) {
            if(arr_zzawz[v1].zzh() != 0x8000000000000001L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
        if(v != 0x8000000000000001L) {
            zzawz[] arr_zzawz1 = this.n;
            for(int v2 = 0; v2 < arr_zzawz1.length; ++v2) {
                zzawz zzawz0 = arr_zzawz1[v2];
                if(zzawz0 != arr_zzawz[0] && zzawz0.zzi(v) != v) {
                    throw new IllegalStateException("Children seeked to different positions");
                }
            }
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zzi(long v) {
        long v1 = this.n[0].zzi(v);
        for(int v2 = 1; true; ++v2) {
            zzawz[] arr_zzawz = this.n;
            if(v2 >= arr_zzawz.length) {
                break;
            }
            if(arr_zzawz[v2].zzi(v1) != v1) {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final zzaxq zzn() {
        return this.m;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final void zzq(long v) {
        zzawz[] arr_zzawz = this.n;
        for(int v1 = 0; v1 < arr_zzawz.length; ++v1) {
            arr_zzawz[v1].zzq(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final void zzs() {
        zzawz[] arr_zzawz = this.i;
        for(int v = 0; v < arr_zzawz.length; ++v) {
            arr_zzawz[v].zzs();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final void zzw(zzawy zzawy0, long v) {
        this.k = zzawy0;
        zzawz[] arr_zzawz = this.i;
        this.l = arr_zzawz.length;
        for(int v1 = 0; v1 < arr_zzawz.length; ++v1) {
            arr_zzawz[v1].zzw(this, v);
        }
    }
}

