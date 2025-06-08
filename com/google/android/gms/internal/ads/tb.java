package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

public final class tb implements zzrx, zzry {
    public final zzry[] i;
    public final IdentityHashMap j;
    public final ArrayList k;
    public final HashMap l;
    public zzrx m;
    public zzty n;
    public zzry[] o;
    public zzrk p;

    public tb(long[] arr_v, zzry[] arr_zzry) {
        this.i = arr_zzry;
        this.k = new ArrayList();
        this.l = new HashMap();
        this.p = new zzrk(new zzts[0]);
        this.j = new IdentityHashMap();
        this.o = new zzry[0];
        for(int v = 0; v < arr_zzry.length; ++v) {
            long v1 = arr_v[v];
            if(v1 != 0L) {
                this.i[v] = new rb(arr_zzry[v], v1);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zza(long v, zzjw zzjw0) {
        zzry[] arr_zzry = this.o;
        return arr_zzry.length <= 0 ? this.i[0].zza(v, zzjw0) : arr_zzry[0].zza(v, zzjw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzb() {
        return this.p.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzc() {
        return this.p.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        zzry[] arr_zzry = this.o;
        long v = 0x8000000000000001L;
        for(int v1 = 0; v1 < arr_zzry.length; ++v1) {
            zzry zzry0 = arr_zzry[v1];
            long v2 = zzry0.zzd();
            if(v2 != 0x8000000000000001L) {
                if(v == 0x8000000000000001L) {
                    zzry[] arr_zzry1 = this.o;
                    for(int v3 = 0; v3 < arr_zzry1.length; ++v3) {
                        zzry zzry1 = arr_zzry1[v3];
                        if(zzry1 == zzry0) {
                            break;
                        }
                        if(zzry1.zze(v2) != v2) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    v = v2;
                }
                else if(v2 != v) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            }
            else if(v != 0x8000000000000001L && zzry0.zze(v) != v) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zze(long v) {
        long v1 = this.o[0].zze(v);
        for(int v2 = 1; true; ++v2) {
            zzry[] arr_zzry = this.o;
            if(v2 >= arr_zzry.length) {
                break;
            }
            if(arr_zzry[v2].zze(v1) != v1) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] arr_zzvg, boolean[] arr_z, zztq[] arr_zztq, boolean[] arr_z1, long v) {
        HashMap hashMap1;
        ArrayList arrayList1;
        zzry[] arr_zzry;
        IdentityHashMap identityHashMap0;
        HashMap hashMap0;
        int[] arr_v = new int[arr_zzvg.length];
        int[] arr_v1 = new int[arr_zzvg.length];
        for(int v1 = 0; true; ++v1) {
            hashMap0 = this.l;
            identityHashMap0 = this.j;
            arr_zzry = this.i;
            if(v1 >= arr_zzvg.length) {
                break;
            }
            zztq zztq0 = arr_zztq[v1];
            Integer integer0 = zztq0 == null ? null : ((Integer)identityHashMap0.get(zztq0));
            arr_v[v1] = integer0 == null ? -1 : ((int)integer0);
            arr_v1[v1] = -1;
            zzvg zzvg0 = arr_zzvg[v1];
            if(zzvg0 != null) {
                zzck zzck0 = (zzck)hashMap0.get(zzvg0.zze());
                zzck0.getClass();
                for(int v2 = 0; v2 < arr_zzry.length; ++v2) {
                    if(arr_zzry[v2].zzh().zza(zzck0) != -1) {
                        arr_v1[v1] = v2;
                        break;
                    }
                }
            }
        }
        identityHashMap0.clear();
        zztq[] arr_zztq1 = new zztq[arr_zzvg.length];
        zztq[] arr_zztq2 = new zztq[arr_zzvg.length];
        zzvg[] arr_zzvg1 = new zzvg[arr_zzvg.length];
        ArrayList arrayList0 = new ArrayList(arr_zzry.length);
        long v3 = v;
        for(int v4 = 0; v4 < arr_zzry.length; v4 = v6 + 1) {
            int v5 = 0;
            while(v5 < arr_zzvg.length) {
                arr_zztq2[v5] = arr_v[v5] == v4 ? arr_zztq[v5] : null;
                if(arr_v1[v5] == v4) {
                    zzvg zzvg1 = arr_zzvg[v5];
                    zzvg1.getClass();
                    arrayList1 = arrayList0;
                    zzck zzck1 = (zzck)hashMap0.get(zzvg1.zze());
                    zzck1.getClass();
                    hashMap1 = hashMap0;
                    arr_zzvg1[v5] = new qb(zzvg1, zzck1);
                }
                else {
                    hashMap1 = hashMap0;
                    arrayList1 = arrayList0;
                    arr_zzvg1[v5] = null;
                }
                ++v5;
                arrayList0 = arrayList1;
                hashMap0 = hashMap1;
            }
            int v6 = v4;
            long v7 = arr_zzry[v4].zzf(arr_zzvg1, arr_z, arr_zztq2, arr_z1, v3);
            if(v6 == 0) {
                v3 = v7;
            }
            else if(v7 != v3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for(int v8 = 0; true; ++v8) {
                boolean z1 = true;
                if(v8 >= arr_zzvg.length) {
                    break;
                }
                if(arr_v1[v8] == v6) {
                    zztq zztq1 = arr_zztq2[v8];
                    zztq1.getClass();
                    arr_zztq1[v8] = zztq1;
                    identityHashMap0.put(zztq1, v6);
                    z = true;
                }
                else if(arr_v[v8] == v6) {
                    if(arr_zztq2[v8] != null) {
                        z1 = false;
                    }
                    zzcw.zzf(z1);
                }
            }
            if(z) {
                arrayList0.add(arr_zzry[v6]);
            }
        }
        System.arraycopy(arr_zztq1, 0, arr_zztq, 0, arr_zzvg.length);
        zzry[] arr_zzry1 = (zzry[])arrayList0.toArray(new zzry[0]);
        this.o = arr_zzry1;
        this.p = new zzrk(arr_zzry1);
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zztr
    public final void zzg(zzts zzts0) {
        zzry zzry0 = (zzry)zzts0;
        zzrx zzrx0 = this.m;
        zzrx0.getClass();
        zzrx0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        zzty zzty0 = this.n;
        zzty0.getClass();
        return zzty0;
    }

    @Override  // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzry0) {
        this.k.remove(zzry0);
        if(!this.k.isEmpty()) {
            return;
        }
        zzry[] arr_zzry = this.i;
        int v1 = 0;
        for(int v = 0; v < arr_zzry.length; ++v) {
            v1 += arr_zzry[v].zzh().zzc;
        }
        zzck[] arr_zzck = new zzck[v1];
        for(int v2 = 0; v2 < arr_zzry.length; ++v2) {
            zzty zzty0 = arr_zzry[v2].zzh();
            int v4 = zzty0.zzc;
            int v5 = 0;
            for(int v3 = 0; v5 < v4; ++v3) {
                zzck zzck0 = zzty0.zzb(v5);
                zzck zzck1 = zzck0.zzc(v2 + ":" + zzck0.zzc);
                this.l.put(zzck1, zzck0);
                arr_zzck[v3] = zzck1;
                ++v5;
            }
        }
        this.n = new zzty(arr_zzck);
        zzrx zzrx0 = this.m;
        zzrx0.getClass();
        zzrx0.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzj(long v, boolean z) {
        zzry[] arr_zzry = this.o;
        for(int v1 = 0; v1 < arr_zzry.length; ++v1) {
            arr_zzry[v1].zzj(v, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzk() {
        zzry[] arr_zzry = this.i;
        for(int v = 0; v < arr_zzry.length; ++v) {
            arr_zzry[v].zzk();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrx0, long v) {
        this.m = zzrx0;
        zzry[] arr_zzry = this.i;
        Collections.addAll(this.k, arr_zzry);
        for(int v1 = 0; v1 < arr_zzry.length; ++v1) {
            arr_zzry[v1].zzl(this, v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzm(long v) {
        this.p.zzm(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzo(long v) {
        ArrayList arrayList0 = this.k;
        if(!arrayList0.isEmpty()) {
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((zzry)arrayList0.get(v2)).zzo(v);
            }
            return false;
        }
        return this.p.zzo(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzp() {
        return this.p.zzp();
    }
}

