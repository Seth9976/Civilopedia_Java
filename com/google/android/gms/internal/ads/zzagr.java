package com.google.android.gms.internal.ads;

import A.f;
import android.util.Log;

public final class zzagr implements zzahn {
    public final zzaga a;
    public final zzdx b;
    public int c;
    public int d;
    public zzee e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public zzagr(zzaga zzaga0) {
        this.a = zzaga0;
        this.b = new zzdx(new byte[10], 10);
        this.c = 0;
    }

    public final boolean a(zzdy zzdy0, byte[] arr_b, int v) {
        int v1 = Math.min(zzdy0.zza(), v - this.d);
        if(v1 <= 0) {
            return true;
        }
        if(arr_b == null) {
            zzdy0.zzG(v1);
        }
        else {
            zzdy0.zzB(arr_b, this.d, v1);
        }
        int v2 = this.d + v1;
        this.d = v2;
        return v2 == v;
    }

    @Override  // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzdy zzdy0, int v) throws zzbp {
        long v20;
        long v19;
        int v9;
        zzcw.zzb(this.e);
        zzaga zzaga0 = this.a;
        if((v & 1) != 0) {
            switch(this.c) {
                case 0: 
                case 1: {
                    break;
                }
                case 2: {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                    break;
                }
                default: {
                    int v1 = this.j;
                    if(v1 != -1) {
                        Log.w("PesReader", "Unexpected start indicator: expected " + v1 + " more bytes");
                    }
                    zzaga0.zzc();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int v2 = v;
        while(zzdy0.zza() > 0) {
            int v3 = this.c;
            if(v3 == 0) {
                zzdy0.zzG(zzdy0.zza());
            }
            else {
                zzdx zzdx0 = this.b;
                switch(v3) {
                    case 1: {
                        if(!this.a(zzdy0, zzdx0.zza, 9)) {
                            break;
                        }
                        zzdx0.zzh(0);
                        int v8 = zzdx0.zzc(24);
                        if(v8 == 1) {
                            zzdx0.zzj(8);
                            int v10 = zzdx0.zzc(16);
                            zzdx0.zzj(5);
                            this.k = zzdx0.zzl();
                            zzdx0.zzj(2);
                            this.f = zzdx0.zzl();
                            this.g = zzdx0.zzl();
                            zzdx0.zzj(6);
                            int v11 = zzdx0.zzc(8);
                            this.i = v11;
                            if(v10 == 0) {
                                this.j = -1;
                            }
                            else {
                                int v12 = v10 - 3 - v11;
                                this.j = v12;
                                if(v12 < 0) {
                                    f.p(v12, "Found negative packet payload size: ", "PesReader");
                                    this.j = -1;
                                }
                            }
                            v9 = 2;
                        }
                        else {
                            f.p(v8, "Unexpected start code prefix: ", "PesReader");
                            this.j = -1;
                            v9 = 0;
                        }
                        this.c = v9;
                        this.d = 0;
                        break;
                    }
                    case 2: {
                        if(!this.a(zzdy0, zzdx0.zza, Math.min(10, this.i)) || !this.a(zzdy0, null, this.i)) {
                            break;
                        }
                        zzdx0.zzh(0);
                        if(this.f) {
                            zzdx0.zzj(4);
                            int v13 = zzdx0.zzc(3);
                            zzdx0.zzj(1);
                            int v14 = zzdx0.zzc(15);
                            zzdx0.zzj(1);
                            long v15 = ((long)v13) << 30 | ((long)(v14 << 15)) | ((long)zzdx0.zzc(15));
                            zzdx0.zzj(1);
                            if(this.h || !this.g) {
                                v19 = v15;
                            }
                            else {
                                zzdx0.zzj(4);
                                int v16 = zzdx0.zzc(3);
                                zzdx0.zzj(1);
                                int v17 = zzdx0.zzc(15);
                                zzdx0.zzj(1);
                                int v18 = zzdx0.zzc(15);
                                zzdx0.zzj(1);
                                v19 = v15;
                                this.e.zzb(((long)v16) << 30 | ((long)(v17 << 15)) | ((long)v18));
                                this.h = true;
                            }
                            v20 = this.e.zzb(v19);
                        }
                        else {
                            v20 = 0x8000000000000001L;
                        }
                        v2 |= (this.k ? 4 : 0);
                        zzaga0.zzd(v20, v2);
                        this.c = 3;
                        this.d = 0;
                        break;
                    }
                    default: {
                        int v4 = zzdy0.zza();
                        int v5 = this.j == -1 ? 0 : v4 - this.j;
                        if(v5 > 0) {
                            v4 -= v5;
                            zzdy0.zzE(zzdy0.zzc() + v4);
                        }
                        zzaga0.zza(zzdy0);
                        int v6 = this.j;
                        if(v6 == -1) {
                            break;
                        }
                        int v7 = v6 - v4;
                        this.j = v7;
                        if(v7 != 0) {
                            break;
                        }
                        zzaga0.zzc();
                        this.c = 1;
                        this.d = 0;
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzee zzee0, zzyu zzyu0, zzahm zzahm0) {
        this.e = zzee0;
        this.a.zzb(zzyu0, zzahm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.zze();
    }
}

