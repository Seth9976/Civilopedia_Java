package com.google.android.gms.internal.ads;

import N.s;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;

public final class zzagf implements zzaga {
    public final Q a;
    public final zzdy b;
    public final boolean[] c;
    public final X d;
    public final s e;
    public Y f;
    public long g;
    public String h;
    public zzzy i;
    public boolean j;
    public long k;
    public static final float[] l;

    static {
        zzagf.l = new float[]{1.0f, 1.0f, 1.090909f, 0.909091f, 1.454545f, 1.212121f, 1.0f};
    }

    public zzagf() {
        this(null);
    }

    public zzagf(Q q0) {
        this.a = q0;
        this.c = new boolean[4];
        X x0 = new X();  // 初始化器: Ljava/lang/Object;-><init>()V
        x0.e = new byte[0x80];
        this.d = x0;
        this.k = 0x8000000000000001L;
        this.e = new s(0xB2);
        this.b = new zzdy();
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        boolean z;
        int v16;
        int v6;
        float f;
        s s0;
        X x0;
        zzcw.zzb(this.f);
        zzcw.zzb(this.i);
        int v = zzdy0.zzc();
        int v1 = zzdy0.zzd();
        byte[] arr_b = zzdy0.zzH();
        this.g += (long)zzdy0.zza();
        zzzw.zzb(this.i, zzdy0, zzdy0.zza());
        while(true) {
            int v2 = zzzo.zza(arr_b, v, v1, this.c);
            x0 = this.d;
            s0 = this.e;
            if(v2 == v1) {
                break;
            }
            int v3 = zzdy0.zzH()[v2 + 3];
            int v4 = v3 & 0xFF;
            int v5 = v2 - v;
            if(this.j) {
                v6 = v2 + 3;
            }
            else {
                if(v5 > 0) {
                    x0.a(arr_b, v, v2);
                }
                switch(x0.b) {
                    case 0: {
                    label_98:
                        v6 = v2 + 3;
                        if(v4 == 0xB0) {
                            x0.b = 1;
                            x0.a = true;
                        }
                        break;
                    }
                    case 1: {
                        v6 = v2 + 3;
                        if(v4 == 0xB5) {
                            x0.b = 2;
                        }
                        else {
                            Log.w("H263Reader", "Unexpected start code value");
                            x0.a = false;
                            x0.c = 0;
                            x0.b = 0;
                        }
                        break;
                    }
                    case 2: {
                        v6 = v2 + 3;
                        if(v4 > 0x1F) {
                            Log.w("H263Reader", "Unexpected start code value");
                            x0.a = false;
                            x0.c = 0;
                            x0.b = 0;
                        }
                        else {
                            x0.b = 3;
                        }
                        break;
                    }
                    case 3: {
                        v6 = v2 + 3;
                        if((v3 & 0xF0) == 0x20) {
                            x0.d = x0.c;
                            x0.b = 4;
                        }
                        else {
                            Log.w("H263Reader", "Unexpected start code value");
                            x0.a = false;
                            x0.c = 0;
                            x0.b = 0;
                        }
                        break;
                    }
                    default: {
                        if(v4 == 0xB3 || v4 == 0xB5) {
                            x0.c -= (v5 >= 0 ? 0 : -v5);
                            x0.a = false;
                            zzzy zzzy0 = this.i;
                            int v7 = x0.d;
                            String s1 = this.h;
                            s1.getClass();
                            byte[] arr_b1 = Arrays.copyOf(x0.e, x0.c);
                            zzdx zzdx0 = new zzdx(arr_b1, arr_b1.length);
                            zzdx0.zzk(v7);
                            zzdx0.zzk(4);
                            zzdx0.zzi();
                            zzdx0.zzj(8);
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(4);
                                zzdx0.zzj(3);
                            }
                            int v8 = zzdx0.zzc(4);
                            v6 = v2 + 3;
                            if(v8 == 15) {
                                int v9 = zzdx0.zzc(8);
                                int v10 = zzdx0.zzc(8);
                                if(v10 == 0) {
                                    Log.w("H263Reader", "Invalid aspect ratio");
                                    goto label_50;
                                }
                                else {
                                    f = ((float)v9) / ((float)v10);
                                    goto label_51;
                                }
                                goto label_46;
                            }
                            else {
                            label_46:
                                if(v8 < 7) {
                                    f = zzagf.l[v8];
                                    goto label_51;
                                }
                                else {
                                    Log.w("H263Reader", "Invalid aspect ratio");
                                }
                            }
                        label_50:
                            f = 1.0f;
                        label_51:
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(2);
                                zzdx0.zzj(1);
                                if(zzdx0.zzl()) {
                                    zzdx0.zzj(15);
                                    zzdx0.zzi();
                                    zzdx0.zzj(15);
                                    zzdx0.zzi();
                                    zzdx0.zzj(15);
                                    zzdx0.zzi();
                                    zzdx0.zzj(3);
                                    zzdx0.zzj(11);
                                    zzdx0.zzi();
                                    zzdx0.zzj(15);
                                    zzdx0.zzi();
                                }
                            }
                            if(zzdx0.zzc(2) != 0) {
                                Log.w("H263Reader", "Unhandled video object layer shape");
                            }
                            zzdx0.zzi();
                            int v11 = zzdx0.zzc(16);
                            zzdx0.zzi();
                            if(zzdx0.zzl()) {
                                if(v11 == 0) {
                                    Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                }
                                else {
                                    int v12 = v11 - 1;
                                    int v13 = 0;
                                    while(v12 > 0) {
                                        ++v13;
                                        v12 >>= 1;
                                    }
                                    zzdx0.zzj(v13);
                                }
                            }
                            zzdx0.zzi();
                            int v14 = zzdx0.zzc(13);
                            zzdx0.zzi();
                            int v15 = zzdx0.zzc(13);
                            zzdx0.zzi();
                            zzdx0.zzi();
                            zzab zzab0 = new zzab();
                            zzab0.zzH(s1);
                            zzab0.zzS("video/mp4v-es");
                            zzab0.zzX(v14);
                            zzab0.zzF(v15);
                            zzab0.zzP(f);
                            zzab0.zzI(Collections.singletonList(arr_b1));
                            zzzy0.zzk(zzab0.zzY());
                            this.j = true;
                            goto label_133;
                        }
                        else {
                            v6 = v2 + 3;
                            break;
                        }
                        goto label_98;
                    }
                }
                x0.a(X.f, 0, 3);
            }
        label_133:
            this.f.a(arr_b, v, v2);
            if(v5 > 0) {
                s0.e(arr_b, v, v2);
                v16 = 0;
            }
            else {
                v16 = -v5;
            }
            if(s0.h(v16)) {
                int v17 = zzzo.zzb(((byte[])s0.f), s0.e);
                this.b.zzD(((byte[])s0.f), v17);
                this.a.a(this.k, this.b);
            }
            if(v4 == 0xB2) {
                if(zzdy0.zzH()[v2 + 2] == 1) {
                    s0.g(0xB2);
                }
                v4 = 0xB2;
            }
            int v18 = v1 - v2;
            Y y0 = this.f;
            long v19 = this.g - ((long)v18);
            if(y0.e == 0xB6 && this.j && y0.b) {
                long v20 = y0.h;
                if(v20 != 0x8000000000000001L) {
                    y0.a.zzs(v20, ((int)y0.d), ((int)(v19 - y0.g)), v18, null);
                }
            }
            if(y0.e != 0xB3) {
                y0.g = v19;
            }
            Y y1 = this.f;
            long v21 = this.k;
            y1.e = v4;
            y1.d = false;
            switch(v4) {
                case 0xB3: {
                    z = true;
                    v4 = 0xB3;
                    break;
                }
                case 0xB6: {
                    z = true;
                    break;
                }
                default: {
                    z = false;
                }
            }
            y1.b = z;
            y1.c = v4 == 0xB6;
            y1.f = 0;
            y1.h = v21;
            v = v6;
        }
        if(!this.j) {
            x0.a(arr_b, v, v1);
        }
        this.f.a(arr_b, v, v1);
        s0.e(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        this.h = zzahm0.zzb();
        zzzy zzzy0 = zzyu0.zzv(zzahm0.zza(), 2);
        this.i = zzzy0;
        this.f = new Y(zzzy0);
        this.a.c(zzyu0, zzahm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.k = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        zzzo.zze(this.c);
        this.d.a = false;
        this.d.c = 0;
        this.d.b = 0;
        Y y0 = this.f;
        if(y0 != null) {
            y0.b = false;
            y0.c = false;
            y0.d = false;
            y0.e = -1;
        }
        this.e.f();
        this.g = 0L;
        this.k = 0x8000000000000001L;
    }
}

