package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzwt extends zzqi {
    public final Context H0;
    public final zzxe I0;
    public final zzxp J0;
    public final boolean K0;
    public zzws L0;
    public boolean M0;
    public boolean N0;
    public Surface O0;
    public zzww P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public long V0;
    public long W0;
    public long X0;
    public int Y0;
    public int Z0;
    public int a1;
    public long b1;
    public long c1;
    public long d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public float i1;
    public zzcv j1;
    public int k1;
    public zzwx l1;
    public static final int[] m1;
    public static boolean n1;
    public static boolean o1;

    static {
        zzwt.m1 = new int[]{0x780, 1600, 0x5A0, 0x500, 960, 854, 640, 540, 480};
    }

    public zzwt(Context context0, zzqc zzqc0, zzqk zzqk0, long v, boolean z, Handler handler0, zzxq zzxq0, int v1, float f) {
        super(2, zzqc0, zzqk0, false, 30.0f);
        Context context1 = context0.getApplicationContext();
        this.H0 = context1;
        this.I0 = new zzxe(context1);
        this.J0 = new zzxp(handler0, zzxq0);
        this.K0 = "NVIDIA".equals(zzeg.zzc);
        this.W0 = 0x8000000000000001L;
        this.f1 = -1;
        this.g1 = -1;
        this.i1 = -1.0f;
        this.R0 = 1;
        this.k1 = 0;
        this.j1 = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void A() {
        this.S0 = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void B(zzgb zzgb0) {
        ++this.a1;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final boolean D(long v, long v1, zzqd zzqd0, ByteBuffer byteBuffer0, int v2, int v3, int v4, long v5, boolean z, boolean z1, zzad zzad0) {
        boolean z2;
        zzqd0.getClass();
        if(this.V0 == 0x8000000000000001L) {
            this.V0 = v;
        }
        zzxe zzxe0 = this.I0;
        if(v5 != this.b1) {
            zzxe0.zzd(v5);
            this.b1 = v5;
        }
        long v6 = this.C0;
        if(z && !z1) {
            this.Y(zzqd0, v2);
            return true;
        }
        float f = this.K;
        int v7 = this.zzbe();
        long v8 = SystemClock.elapsedRealtime();
        long v9 = (long)(((double)(v5 - v)) / ((double)f));
        if(v7 == 2) {
            v9 -= v8 * 1000L - v1;
        }
        if(this.O0 == this.P0) {
            if(v9 < -30000L) {
                this.Y(zzqd0, v2);
                this.R(v9);
                return true;
            }
            return false;
        }
        long v10 = v8 * 1000L - this.c1;
        if(this.U0) {
            z2 = !this.S0;
        }
        else if(v7 == 2 || this.T0) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        if(this.W0 == 0x8000000000000001L && v >= v6 && (z2 || v7 == 2 && v9 < -30000L && v10 > 100000L)) {
            long v11 = System.nanoTime();
            if(zzeg.zza >= 21) {
                this.X(zzqd0, v2, v11);
            }
            else {
                this.W(zzqd0, v2);
            }
            this.R(v9);
            return true;
        }
        if(v7 != 2 || v == this.V0) {
            return false;
        }
        long v12 = System.nanoTime();
        long v13 = zzxe0.zza(v9 * 1000L + v12);
        long v14 = (v13 - v12) / 1000L;
        long v15 = this.W0;
        if(v14 < -500000L && !z1) {
            zztq zztq0 = this.o;
            zztq0.getClass();
            int v16 = zztq0.zzb(v - this.q);
            if(v16 != 0) {
                if(v15 == 0x8000000000000001L) {
                    ++this.A0.zzj;
                    this.Z(v16, this.a1);
                }
                else {
                    this.A0.zzd += v16;
                    this.A0.zzf += this.a1;
                }
                if(this.M()) {
                    this.H();
                }
                return false;
            }
        }
        if(v14 < -30000L && !z1) {
            if(v15 == 0x8000000000000001L) {
                Trace.beginSection("dropVideoBuffer");
                zzqd0.zzn(v2, false);
                Trace.endSection();
                this.Z(0, 1);
            }
            else {
                this.Y(zzqd0, v2);
            }
            this.R(v14);
            return true;
        }
        if(zzeg.zza >= 21) {
            if(v14 < 50000L) {
                this.X(zzqd0, v2, v13);
                this.R(v14);
                return true;
            }
        }
        else if(v14 < 30000L) {
            if(v14 > 11000L) {
                try {
                    Thread.sleep((v14 - 10000L) / 1000L);
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            this.W(zzqd0, v2);
            this.R(v14);
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final zzqe F(IllegalStateException illegalStateException0, zzqf zzqf0) {
        return new zzwr(illegalStateException0, zzqf0, this.O0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void G(zzgb zzgb0) {
        if(!this.N0) {
            return;
        }
        ByteBuffer byteBuffer0 = zzgb0.zze;
        byteBuffer0.getClass();
        if(byteBuffer0.remaining() >= 7) {
            int v = byteBuffer0.get();
            int v1 = byteBuffer0.getShort();
            int v2 = byteBuffer0.getShort();
            int v3 = byteBuffer0.get();
            int v4 = byteBuffer0.get();
            byteBuffer0.position(0);
            if(v == -75 && v1 == 60 && v2 == 1 && v3 == 4 && v4 == 0) {
                byte[] arr_b = new byte[byteBuffer0.remaining()];
                byteBuffer0.get(arr_b);
                byteBuffer0.position(0);
                zzqd zzqd0 = this.M;
                Bundle bundle0 = new Bundle();
                bundle0.putByteArray("hdr10-plus-info", arr_b);
                zzqd0.zzp(bundle0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void I(long v) {
        super.I(v);
        --this.a1;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void K() {
        super.K();
        this.a1 = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final boolean N(zzqf zzqf0) {
        return this.O0 != null || this.V(zzqf0);
    }

    public static int Q(zzqf zzqf0, zzad zzad0) {
        if(zzad0.zzn != -1) {
            int v = zzad0.zzo.size();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                v2 += ((byte[])zzad0.zzo.get(v1)).length;
            }
            return zzad0.zzn + v2;
        }
        return zzwt.zzT(zzqf0, zzad0);
    }

    public final void R(long v) {
        this.A0.zzk += v;
        ++this.A0.zzl;
        this.d1 += v;
        ++this.e1;
    }

    public static final boolean S(String s) {
        boolean z = false;
        if(s.startsWith("OMX.google")) {
            return false;
        }
        synchronized(zzwt.class) {
            if(!zzwt.n1) {
                int v1 = zzeg.zza;
                int v2 = 3;
                int v3 = -1;
                if(v1 <= 28) {
                    switch(zzeg.zzb) {
                        case "aquaman": 
                        case "dangal": 
                        case "dangalFHD": 
                        case "dangalUHD": 
                        case "machuca": 
                        case "magnolia": 
                        case "once": 
                        case "oneday": {
                            z = true;
                            break;
                        }
                        default: {
                            goto label_15;
                        }
                    }
                }
                else {
                label_15:
                    if(v1 <= 27 && "HWEML".equals(zzeg.zzb)) {
                        z = true;
                    }
                    else if(v1 <= 26) {
                        switch(zzeg.zzb) {
                            case "1601": {
                                v2 = 0;
                                break;
                            }
                            case "1713": {
                                v2 = 1;
                                break;
                            }
                            case "1714": {
                                v2 = 2;
                                break;
                            }
                            case "601LV": {
                                break;
                            }
                            case "602LV": {
                                v2 = 4;
                                break;
                            }
                            case "A10-70F": {
                                v2 = 5;
                                break;
                            }
                            case "A10-70L": {
                                v2 = 6;
                                break;
                            }
                            case "A1601": {
                                v2 = 7;
                                break;
                            }
                            case "A2016a40": {
                                v2 = 8;
                                break;
                            }
                            case "A7000-a": {
                                v2 = 9;
                                break;
                            }
                            case "A7000plus": {
                                v2 = 10;
                                break;
                            }
                            case "A7010a48": {
                                v2 = 11;
                                break;
                            }
                            case "A7020a48": {
                                v2 = 12;
                                break;
                            }
                            case "ASUS_X00AD_2": {
                                v2 = 14;
                                break;
                            }
                            case "AquaPowerM": {
                                v2 = 13;
                                break;
                            }
                            case "Aura_Note_2": {
                                v2 = 15;
                                break;
                            }
                            case "BLACK-1X": {
                                v2 = 17;
                                break;
                            }
                            case "BRAVIA_ATV2": {
                                v2 = 18;
                                break;
                            }
                            case "BRAVIA_ATV3_4K": {
                                v2 = 19;
                                break;
                            }
                            case "C1": {
                                v2 = 20;
                                break;
                            }
                            case "CP8676_I02": {
                                v2 = 22;
                                break;
                            }
                            case "CPH1609": {
                                v2 = 23;
                                break;
                            }
                            case "CPH1715": {
                                v2 = 24;
                                break;
                            }
                            case "CPY83_I00": {
                                v2 = 25;
                                break;
                            }
                            case "ComioS1": {
                                v2 = 21;
                                break;
                            }
                            case "DM-01K": {
                                v2 = 29;
                                break;
                            }
                            case "E5643": {
                                v2 = 30;
                                break;
                            }
                            case "ELUGA_A3_Pro": {
                                v2 = 0x1F;
                                break;
                            }
                            case "ELUGA_Note": {
                                v2 = 0x20;
                                break;
                            }
                            case "ELUGA_Prim": {
                                v2 = 33;
                                break;
                            }
                            case "ELUGA_Ray_X": {
                                v2 = 34;
                                break;
                            }
                            case "EverStar_S": {
                                v2 = 35;
                                break;
                            }
                            case "F01H": {
                                v2 = 36;
                                break;
                            }
                            case "F01J": {
                                v2 = 37;
                                break;
                            }
                            case "F02H": {
                                v2 = 38;
                                break;
                            }
                            case "F03H": {
                                v2 = 39;
                                break;
                            }
                            case "F04H": {
                                v2 = 40;
                                break;
                            }
                            case "F04J": {
                                v2 = 41;
                                break;
                            }
                            case "F3111": {
                                v2 = 42;
                                break;
                            }
                            case "F3113": {
                                v2 = 43;
                                break;
                            }
                            case "F3116": {
                                v2 = 44;
                                break;
                            }
                            case "F3211": {
                                v2 = 45;
                                break;
                            }
                            case "F3213": {
                                v2 = 46;
                                break;
                            }
                            case "F3215": {
                                v2 = 0x2F;
                                break;
                            }
                            case "F3311": {
                                v2 = 0x30;
                                break;
                            }
                            case "GIONEE_GBL7360": {
                                v2 = 53;
                                break;
                            }
                            case "GIONEE_SWW1609": {
                                v2 = 54;
                                break;
                            }
                            case "GIONEE_SWW1627": {
                                v2 = 55;
                                break;
                            }
                            case "GIONEE_SWW1631": {
                                v2 = 56;
                                break;
                            }
                            case "GIONEE_WBL5708": {
                                v2 = 57;
                                break;
                            }
                            case "GIONEE_WBL7365": {
                                v2 = 58;
                                break;
                            }
                            case "GIONEE_WBL7519": {
                                v2 = 59;
                                break;
                            }
                            case "GiONEE_CBL7513": {
                                v2 = 51;
                                break;
                            }
                            case "GiONEE_GBL7319": {
                                v2 = 52;
                                break;
                            }
                            case "HWBLN-H": {
                                v2 = 0x3F;
                                break;
                            }
                            case "HWCAM-H": {
                                v2 = 0x40;
                                break;
                            }
                            case "HWVNS-H": {
                                v2 = 65;
                                break;
                            }
                            case "HWWAS-H": {
                                v2 = 66;
                                break;
                            }
                            case "Infinix-X572": {
                                v2 = 69;
                                break;
                            }
                            case "JGZ": {
                                v2 = 73;
                                break;
                            }
                            case "K50a40": {
                                v2 = 74;
                                break;
                            }
                            case "LS-5017": {
                                v2 = 78;
                                break;
                            }
                            case "M04": {
                                v2 = 0x4F;
                                break;
                            }
                            case "M5c": {
                                v2 = 80;
                                break;
                            }
                            case "MEIZU_M5": {
                                v2 = 83;
                                break;
                            }
                            case "MX6": {
                                v2 = 86;
                                break;
                            }
                            case "NX541J": {
                                v2 = 89;
                                break;
                            }
                            case "NX573J": {
                                v2 = 90;
                                break;
                            }
                            case "OnePlus5T": {
                                v2 = 91;
                                break;
                            }
                            case "P681": {
                                v2 = 93;
                                break;
                            }
                            case "P85": {
                                v2 = 94;
                                break;
                            }
                            case "PB2-670M": {
                                v2 = 100;
                                break;
                            }
                            case "PGN528": {
                                v2 = 101;
                                break;
                            }
                            case "PGN610": {
                                v2 = 102;
                                break;
                            }
                            case "PGN611": {
                                v2 = 103;
                                break;
                            }
                            case "PLE": {
                                v2 = 107;
                                break;
                            }
                            case "PRO7S": {
                                v2 = 108;
                                break;
                            }
                            case "Phantom6": {
                                v2 = 104;
                                break;
                            }
                            case "Pixi4-7_3G": {
                                v2 = 105;
                                break;
                            }
                            case "Pixi5-10_4G": {
                                v2 = 106;
                                break;
                            }
                            case "Q350": {
                                v2 = 109;
                                break;
                            }
                            case "Q4260": {
                                v2 = 110;
                                break;
                            }
                            case "Q427": {
                                v2 = 0x6F;
                                break;
                            }
                            case "Q4310": {
                                v2 = 0x70;
                                break;
                            }
                            case "Q5": {
                                v2 = 0x71;
                                break;
                            }
                            case "QM16XE_U": {
                                v2 = 0x72;
                                break;
                            }
                            case "QX1": {
                                v2 = 0x73;
                                break;
                            }
                            case "RAIJIN": {
                                v2 = 0x74;
                                break;
                            }
                            case "SVP-DTV15": {
                                v2 = 0x77;
                                break;
                            }
                            case "Slate_Pro": {
                                v2 = 0x76;
                                break;
                            }
                            case "TB3-730F": {
                                v2 = 0x7A;
                                break;
                            }
                            case "TB3-730X": {
                                v2 = 0x7B;
                                break;
                            }
                            case "TB3-850F": {
                                v2 = 0x7C;
                                break;
                            }
                            case "TB3-850M": {
                                v2 = 0x7D;
                                break;
                            }
                            case "V1": {
                                v2 = 0x7F;
                                break;
                            }
                            case "V23GB": {
                                v2 = 0x80;
                                break;
                            }
                            case "V5": {
                                v2 = 0x81;
                                break;
                            }
                            case "X3_HK": {
                                v2 = 0x87;
                                break;
                            }
                            case "XE2X": {
                                v2 = 0x88;
                                break;
                            }
                            case "XT1663": {
                                v2 = 0x89;
                                break;
                            }
                            case "Z12_PRO": {
                                v2 = 0x8A;
                                break;
                            }
                            case "Z80": {
                                v2 = 0x8B;
                                break;
                            }
                            case "b5": {
                                v2 = 16;
                                break;
                            }
                            case "cv1": {
                                v2 = 26;
                                break;
                            }
                            case "cv3": {
                                v2 = 27;
                                break;
                            }
                            case "deb": {
                                v2 = 28;
                                break;
                            }
                            case "flo": {
                                v2 = 49;
                                break;
                            }
                            case "fugu": {
                                v2 = 50;
                                break;
                            }
                            case "griffin": {
                                v2 = 60;
                                break;
                            }
                            case "htc_e56ml_dtul": {
                                v2 = 61;
                                break;
                            }
                            case "hwALE-H": {
                                v2 = 62;
                                break;
                            }
                            case "i9031": {
                                v2 = 67;
                                break;
                            }
                            case "iball8735_9806": {
                                v2 = 68;
                                break;
                            }
                            case "iris60": {
                                v2 = 70;
                                break;
                            }
                            case "itel_S41": {
                                v2 = 71;
                                break;
                            }
                            case "j2xlteins": {
                                v2 = 72;
                                break;
                            }
                            case "kate": {
                                v2 = 75;
                                break;
                            }
                            case "l5460": {
                                v2 = 76;
                                break;
                            }
                            case "le_x6": {
                                v2 = 77;
                                break;
                            }
                            case "manning": {
                                v2 = 81;
                                break;
                            }
                            case "marino_f": {
                                v2 = 82;
                                break;
                            }
                            case "mh": {
                                v2 = 84;
                                break;
                            }
                            case "mido": {
                                v2 = 85;
                                break;
                            }
                            case "namath": {
                                v2 = 87;
                                break;
                            }
                            case "nicklaus_f": {
                                v2 = 88;
                                break;
                            }
                            case "p212": {
                                v2 = 92;
                                break;
                            }
                            case "pacificrim": {
                                v2 = 0x5F;
                                break;
                            }
                            case "panell_d": {
                                v2 = 0x60;
                                break;
                            }
                            case "panell_dl": {
                                v2 = 97;
                                break;
                            }
                            case "panell_ds": {
                                v2 = 98;
                                break;
                            }
                            case "panell_dt": {
                                v2 = 99;
                                break;
                            }
                            case "s905x018": {
                                v2 = 120;
                                break;
                            }
                            case "santoni": {
                                v2 = 0x75;
                                break;
                            }
                            case "taido_row": {
                                v2 = 0x79;
                                break;
                            }
                            case "tcl_eu": {
                                v2 = 0x7E;
                                break;
                            }
                            case "vernee_M5": {
                                v2 = 130;
                                break;
                            }
                            case "watson": {
                                v2 = 0x83;
                                break;
                            }
                            case "whyred": {
                                v2 = 0x84;
                                break;
                            }
                            case "woods_f": {
                                v2 = 0x85;
                                break;
                            }
                            case "woods_fn": {
                                v2 = 0x86;
                                break;
                            }
                            default: {
                                v2 = -1;
                            }
                        }
                        switch(v2) {
                            case 0: 
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: 
                            case 8: 
                            case 9: 
                            case 10: 
                            case 11: 
                            case 12: 
                            case 13: 
                            case 14: 
                            case 15: 
                            case 16: 
                            case 17: 
                            case 18: 
                            case 19: 
                            case 20: 
                            case 21: 
                            case 22: 
                            case 23: 
                            case 24: 
                            case 25: 
                            case 26: 
                            case 27: 
                            case 28: 
                            case 29: 
                            case 30: 
                            case 0x1F: 
                            case 0x20: 
                            case 33: 
                            case 34: 
                            case 35: 
                            case 36: 
                            case 37: 
                            case 38: 
                            case 39: 
                            case 40: 
                            case 41: 
                            case 42: 
                            case 43: 
                            case 44: 
                            case 45: 
                            case 46: 
                            case 0x2F: 
                            case 0x30: 
                            case 49: 
                            case 50: 
                            case 51: 
                            case 52: 
                            case 53: 
                            case 54: 
                            case 55: 
                            case 56: 
                            case 57: 
                            case 58: 
                            case 59: 
                            case 60: 
                            case 61: 
                            case 62: 
                            case 0x3F: 
                            case 0x40: 
                            case 65: 
                            case 66: 
                            case 67: 
                            case 68: 
                            case 69: 
                            case 70: 
                            case 71: 
                            case 72: 
                            case 73: 
                            case 74: 
                            case 75: 
                            case 76: 
                            case 77: 
                            case 78: 
                            case 0x4F: 
                            case 80: 
                            case 81: 
                            case 82: 
                            case 83: 
                            case 84: 
                            case 85: 
                            case 86: 
                            case 87: 
                            case 88: 
                            case 89: 
                            case 90: 
                            case 91: 
                            case 92: 
                            case 93: 
                            case 94: 
                            case 0x5F: 
                            case 0x60: 
                            case 97: 
                            case 98: 
                            case 99: 
                            case 100: 
                            case 101: 
                            case 102: 
                            case 103: 
                            case 104: 
                            case 105: 
                            case 106: 
                            case 107: 
                            case 108: 
                            case 109: 
                            case 110: 
                            case 0x6F: 
                            case 0x70: 
                            case 0x71: 
                            case 0x72: 
                            case 0x73: 
                            case 0x74: 
                            case 0x75: 
                            case 0x76: 
                            case 0x77: 
                            case 120: 
                            case 0x79: 
                            case 0x7A: 
                            case 0x7B: 
                            case 0x7C: 
                            case 0x7D: 
                            case 0x7E: 
                            case 0x7F: 
                            case 0x80: 
                            case 0x81: 
                            case 130: 
                            case 0x83: 
                            case 0x84: 
                            case 0x85: 
                            case 0x86: 
                            case 0x87: 
                            case 0x88: 
                            case 0x89: 
                            case 0x8A: 
                            case 0x8B: {
                                z = true;
                                break;
                            }
                            default: {
                                switch(zzeg.zzd) {
                                    case "AFTA": {
                                        v3 = 0;
                                        break;
                                    }
                                    case "AFTN": {
                                        v3 = 1;
                                        break;
                                    }
                                    case "JSN-L21": {
                                        v3 = 2;
                                    }
                                }
                                if(v3 == 0 || v3 == 1 || v3 == 2) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                zzwt.o1 = z;
                zzwt.n1 = true;
            }
            return zzwt.o1;
        }
    }

    public static zzfrj T(zzad zzad0, boolean z, boolean z1) {
        String s = zzad0.zzm;
        if(s == null) {
            return zzfrj.zzo();
        }
        List list0 = zzqx.zzf(s, z, z1);
        String s1 = zzqx.zze(zzad0);
        if(s1 == null) {
            return zzfrj.zzm(list0);
        }
        List list1 = zzqx.zzf(s1, z, z1);
        zzfrg zzfrg0 = zzfrj.zzi();
        zzfrg0.zzf(list0);
        zzfrg0.zzf(list1);
        return zzfrg0.zzg();
    }

    public final void U() {
        int v = this.f1;
        if(v == -1) {
            if(this.g1 == -1) {
                return;
            }
            v = -1;
        }
        if(this.j1 != null && this.j1.zzc == v && this.j1.zzd == this.g1 && this.j1.zze == this.h1 && this.j1.zzf == this.i1) {
            return;
        }
        zzcv zzcv0 = new zzcv(v, this.g1, this.h1, this.i1);
        this.j1 = zzcv0;
        this.J0.zzt(zzcv0);
    }

    // 去混淆评级： 低(30)
    public final boolean V(zzqf zzqf0) {
        return zzeg.zza >= 23 && !zzwt.S(zzqf0.zza) && (!zzqf0.zzf || zzww.zzb(this.H0));
    }

    public final void W(zzqd zzqd0, int v) {
        this.U();
        Trace.beginSection("releaseOutputBuffer");
        zzqd0.zzn(v, true);
        Trace.endSection();
        this.c1 = SystemClock.elapsedRealtime() * 1000L;
        ++this.A0.zze;
        this.Z0 = 0;
        this.U0 = true;
        if(!this.S0) {
            this.S0 = true;
            this.J0.zzq(this.O0);
            this.Q0 = true;
        }
    }

    public final void X(zzqd zzqd0, int v, long v1) {
        this.U();
        Trace.beginSection("releaseOutputBuffer");
        zzqd0.zzm(v, v1);
        Trace.endSection();
        this.c1 = SystemClock.elapsedRealtime() * 1000L;
        ++this.A0.zze;
        this.Z0 = 0;
        this.U0 = true;
        if(!this.S0) {
            this.S0 = true;
            this.J0.zzq(this.O0);
            this.Q0 = true;
        }
    }

    public final void Y(zzqd zzqd0, int v) {
        Trace.beginSection("skipVideoBuffer");
        zzqd0.zzn(v, false);
        Trace.endSection();
        ++this.A0.zzf;
    }

    public final void Z(int v, int v1) {
        this.A0.zzh += v;
        int v2 = v + v1;
        this.A0.zzg += v2;
        this.Y0 += v2;
        int v3 = this.Z0 + v2;
        this.Z0 = v3;
        this.A0.zzi = Math.max(v3, this.A0.zzi);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void c() {
        try {
            this.j1 = null;
            this.S0 = false;
            this.Q0 = false;
            super.c();
        }
        finally {
            this.J0.zzc(this.A0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void d(boolean z, boolean z1) {
        super.d(z, z1);
        this.k.getClass();
        this.J0.zze(this.A0);
        this.T0 = z1;
        this.U0 = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void e(long v, boolean z) {
        super.e(v, z);
        this.S0 = false;
        this.I0.zzf();
        this.b1 = 0x8000000000000001L;
        this.V0 = 0x8000000000000001L;
        this.Z0 = 0;
        this.W0 = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void f() {
        zzww zzww0;
        try {
            super.f();
            zzww0 = this.P0;
        }
        catch(Throwable throwable0) {
            if(this.P0 != null) {
                zzww zzww1 = this.P0;
                if(this.O0 == zzww1) {
                    this.O0 = null;
                }
                zzww1.release();
                this.P0 = null;
            }
            throw throwable0;
        }
        if(zzww0 != null) {
            if(this.O0 == zzww0) {
                this.O0 = null;
            }
            zzww0.release();
            this.P0 = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public final void g() {
        this.Y0 = 0;
        this.X0 = SystemClock.elapsedRealtime();
        this.c1 = SystemClock.elapsedRealtime() * 1000L;
        this.d1 = 0L;
        this.e1 = 0;
        this.I0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public final void h() {
        this.W0 = 0x8000000000000001L;
        zzxp zzxp0 = this.J0;
        if(this.Y0 > 0) {
            long v = SystemClock.elapsedRealtime();
            zzxp0.zzd(this.Y0, v - this.X0);
            this.Y0 = 0;
            this.X0 = v;
        }
        int v1 = this.e1;
        if(v1 != 0) {
            zzxp0.zzr(this.d1, v1);
            this.d1 = 0L;
            this.e1 = 0;
        }
        this.I0.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final float j(float f, zzad[] arr_zzad) {
        float f1 = -1.0f;
        for(int v = 0; v < arr_zzad.length; ++v) {
            float f2 = arr_zzad[v].zzt;
            if(f2 != -1.0f) {
                f1 = Math.max(f1, f2);
            }
        }
        return f1 == -1.0f ? -1.0f : f1 * f;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final int k(zzqk zzqk0, zzad zzad0) {
        int v = 0;
        int v1 = 0x80;
        if(!zzbo.zzh(zzad0.zzm)) {
            return 0x80;
        }
        boolean z = zzad0.zzp != null;
        zzfrj zzfrj0 = zzwt.T(zzad0, z, false);
        if(z && zzfrj0.isEmpty()) {
            zzfrj0 = zzwt.T(zzad0, false, false);
        }
        if(zzfrj0.isEmpty()) {
            return 0x81;
        }
        if(zzad0.zzF != 0) {
            return 130;
        }
        int v2 = 1;
        zzqf zzqf0 = (zzqf)zzfrj0.get(0);
        boolean z1 = zzqf0.zzd(zzad0);
        if(!z1) {
            for(int v3 = 1; v3 < zzfrj0.size(); ++v3) {
                zzqf zzqf1 = (zzqf)zzfrj0.get(v3);
                if(zzqf1.zzd(zzad0)) {
                    zzqf0 = zzqf1;
                    v2 = 0;
                    z1 = true;
                    break;
                }
            }
        }
        int v4 = zzqf0.zze(zzad0) ? 16 : 8;
        int v5 = zzqf0.zzg ? 0x40 : 0;
        if(1 != v2) {
            v1 = 0;
        }
        if(z1) {
            zzfrj zzfrj1 = zzwt.T(zzad0, z, true);
            if(!zzfrj1.isEmpty()) {
                zzqf zzqf2 = (zzqf)zzqx.zzg(zzfrj1, zzad0).get(0);
                if(zzqf2.zzd(zzad0) && zzqf2.zze(zzad0)) {
                    v = 0x20;
                }
            }
        }
        return (z1 ? 4 : 3) | v4 | v | v5 | v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final zzgm l(zzqf zzqf0, zzad zzad0, zzad zzad1) {
        zzgm zzgm0 = zzqf0.zzb(zzad0, zzad1);
        int v = zzad1.zzr <= this.L0.zza && zzad1.zzs <= this.L0.zzb ? zzgm0.zze : zzgm0.zze | 0x100;
        if(zzwt.Q(zzqf0, zzad1) > this.L0.zzc) {
            v |= 0x40;
        }
        return v == 0 ? new zzgm(zzqf0.zza, zzad0, zzad1, zzgm0.zzd, 0) : new zzgm(zzqf0.zza, zzad0, zzad1, 0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final zzgm m(zziz zziz0) {
        zzgm zzgm0 = super.m(zziz0);
        this.J0.zzf(zziz0.zza, zzgm0);
        return zzgm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final zzqb p(zzqf zzqf0, zzad zzad0, float f) {
        int v14;
        Point point0;
        String s1;
        zzws zzws0;
        zzww zzww0 = this.P0;
        if(zzww0 != null && zzww0.zza != zzqf0.zzf) {
            if(this.O0 == zzww0) {
                this.O0 = null;
            }
            zzww0.release();
            this.P0 = null;
        }
        String s = zzqf0.zzc;
        zzad[] arr_zzad = this.p;
        arr_zzad.getClass();
        int v = zzad0.zzr;
        int v1 = zzad0.zzs;
        int v2 = zzwt.Q(zzqf0, zzad0);
        if(arr_zzad.length == 1) {
            if(v2 != -1) {
                int v3 = zzwt.zzT(zzqf0, zzad0);
                if(v3 != -1) {
                    v2 = Math.min(((int)(((float)v2) * 1.5f)), v3);
                }
            }
            zzws0 = new zzws(v, v1, v2);
            s1 = s;
        }
        else {
            int v5 = 0;
            for(int v4 = 0; v4 < arr_zzad.length; ++v4) {
                zzad zzad1 = arr_zzad[v4];
                if(zzad0.zzy != null && zzad1.zzy == null) {
                    zzab zzab0 = zzad1.zzb();
                    zzab0.zzy(zzad0.zzy);
                    zzad1 = zzab0.zzY();
                }
                if(zzqf0.zzb(zzad0, zzad1).zzd != 0) {
                    v5 |= (zzad1.zzr != -1 && zzad1.zzs != -1 ? 0 : 1);
                    v = Math.max(v, zzad1.zzr);
                    v1 = Math.max(v1, zzad1.zzs);
                    v2 = Math.max(v2, zzwt.Q(zzqf0, zzad1));
                }
            }
            if(v5 == 0) {
                s1 = s;
            }
            else {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + v + "x" + v1);
                int v6 = zzad0.zzs;
                int v7 = zzad0.zzr;
                int v8 = v6 <= v7 ? v7 : v6;
                int v9 = v6 > v7 ? v7 : v6;
                int[] arr_v = zzwt.m1;
                s1 = s;
                int v10 = 0;
                while(v10 < 9) {
                    int v11 = arr_v[v10];
                    int v12 = (int)(((float)v11) * (((float)v9) / ((float)v8)));
                    if(v11 <= v8 || v12 <= v9) {
                        break;
                    }
                    if(zzeg.zza >= 21) {
                        int v13 = v6 > v7 ? v12 : v11;
                        if(v6 <= v7) {
                            v11 = v12;
                        }
                        point0 = zzqf0.zza(v13, v11);
                        v14 = v2;
                        if(zzqf0.zzf(point0.x, point0.y, ((double)zzad0.zzt))) {
                            goto label_71;
                        }
                    }
                    else {
                        try {
                            v14 = v2;
                            int v15 = zzeg.zze(v11, 16) * 16;
                            int v16 = zzeg.zze(v12, 16) * 16;
                            if(v15 * v16 <= zzqx.zza()) {
                                int v17 = v6 > v7 ? v16 : v15;
                                if(v6 <= v7) {
                                    v15 = v16;
                                }
                                point0 = new Point(v17, v15);
                                goto label_71;
                            }
                            ++v10;
                            v2 = v14;
                            continue;
                        }
                        catch(zzqr unused_ex) {
                        }
                        goto label_70;
                    }
                    ++v10;
                    v2 = v14;
                }
                v14 = v2;
            label_70:
                point0 = null;
            label_71:
                if(point0 == null) {
                    v2 = v14;
                }
                else {
                    v = Math.max(v, point0.x);
                    v1 = Math.max(v1, point0.y);
                    zzab zzab1 = zzad0.zzb();
                    zzab1.zzX(v);
                    zzab1.zzF(v1);
                    v2 = Math.max(v14, zzwt.zzT(zzqf0, zzab1.zzY()));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + v + "x" + v1);
                }
            }
            zzws0 = new zzws(v, v1, v2);
        }
        this.L0 = zzws0;
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", s1);
        mediaFormat0.setInteger("width", zzad0.zzr);
        mediaFormat0.setInteger("height", zzad0.zzs);
        zzdp.zzb(mediaFormat0, zzad0.zzo);
        float f1 = zzad0.zzt;
        if(f1 != -1.0f) {
            mediaFormat0.setFloat("frame-rate", f1);
        }
        zzdp.zza(mediaFormat0, "rotation-degrees", zzad0.zzu);
        zzo zzo0 = zzad0.zzy;
        if(zzo0 != null) {
            zzdp.zza(mediaFormat0, "color-transfer", zzo0.zzd);
            zzdp.zza(mediaFormat0, "color-standard", zzo0.zzb);
            zzdp.zza(mediaFormat0, "color-range", zzo0.zzc);
            byte[] arr_b = zzo0.zze;
            if(arr_b != null) {
                mediaFormat0.setByteBuffer("hdr-static-info", ByteBuffer.wrap(arr_b));
            }
        }
        if("video/dolby-vision".equals(zzad0.zzm)) {
            Pair pair0 = zzqx.zzb(zzad0);
            if(pair0 != null) {
                zzdp.zza(mediaFormat0, "profile", ((int)(((Integer)pair0.first))));
            }
        }
        mediaFormat0.setInteger("max-width", zzws0.zza);
        mediaFormat0.setInteger("max-height", zzws0.zzb);
        zzdp.zza(mediaFormat0, "max-input-size", zzws0.zzc);
        if(zzeg.zza >= 23) {
            mediaFormat0.setInteger("priority", 0);
            if(f != -1.0f) {
                mediaFormat0.setFloat("operating-rate", f);
            }
        }
        if(this.K0) {
            mediaFormat0.setInteger("no-post-process", 1);
            mediaFormat0.setInteger("auto-frc", 0);
        }
        if(this.O0 == null) {
            if(!this.V(zzqf0)) {
                throw new IllegalStateException();
            }
            if(this.P0 == null) {
                this.P0 = zzww.zza(this.H0, zzqf0.zzf);
            }
            this.O0 = this.P0;
            return zzqb.zzb(zzqf0, mediaFormat0, zzad0, this.O0, null);
        }
        return zzqb.zzb(zzqf0, mediaFormat0, zzad0, this.O0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final List q(zzqk zzqk0, zzad zzad0) {
        return zzqx.zzg(zzwt.T(zzad0, false, false), zzad0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void r(Exception exception0) {
        zzdn.zza("MediaCodecVideoRenderer", "Video codec error", exception0);
        this.J0.zzs(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void s(String s, long v, long v1) {
        this.J0.zza(s, v, v1);
        this.M0 = zzwt.S(s);
        zzqf zzqf0 = this.T;
        zzqf0.getClass();
        boolean z = false;
        if(zzeg.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzqf0.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = zzqf0.zzg();
            for(int v2 = 0; v2 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v2) {
                if(arr_mediaCodecInfo$CodecProfileLevel[v2].profile == 0x4000) {
                    z = true;
                    break;
                }
            }
        }
        this.N0 = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void t(String s) {
        this.J0.zzb(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void y(zzad zzad0, MediaFormat mediaFormat0) {
        zzqd zzqd0 = this.M;
        if(zzqd0 != null) {
            zzqd0.zzq(this.R0);
        }
        mediaFormat0.getClass();
        this.f1 = !mediaFormat0.containsKey("crop-right") || !mediaFormat0.containsKey("crop-left") || !mediaFormat0.containsKey("crop-bottom") || !mediaFormat0.containsKey("crop-top") ? mediaFormat0.getInteger("width") : mediaFormat0.getInteger("crop-right") - mediaFormat0.getInteger("crop-left") + 1;
        int v = mediaFormat0.getInteger("height");
        this.g1 = v;
        float f = zzad0.zzv;
        this.i1 = f;
        if(zzeg.zza < 21) {
            this.h1 = zzad0.zzu;
        }
        else if(zzad0.zzu == 90 || zzad0.zzu == 270) {
            int v1 = this.f1;
            this.f1 = v;
            this.g1 = v1;
            this.i1 = 1.0f / f;
        }
        this.I0.zzc(zzad0.zzt);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void zzD(float f, float f1) throws zzgt {
        super.zzD(f, f1);
        this.I0.zze(f);
    }

    @Override  // com.google.android.gms.internal.ads.zzjt, com.google.android.gms.internal.ads.zzju
    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final boolean zzN() {
        if(super.zzN() && (this.S0 || (this.P0 != null && this.O0 == this.P0 || this.M == null))) {
            this.W0 = 0x8000000000000001L;
            return true;
        }
        if(this.W0 == 0x8000000000000001L) {
            return false;
        }
        if(SystemClock.elapsedRealtime() < this.W0) {
            return true;
        }
        this.W0 = 0x8000000000000001L;
        return false;
    }

    public static int zzT(zzqf zzqf0, zzad zzad0) {
        int v = zzad0.zzr;
        int v1 = zzad0.zzs;
        if(v != -1 && v1 != -1) {
            String s = zzad0.zzm;
            int v2 = 1;
            if("video/dolby-vision".equals(s)) {
                Pair pair0 = zzqx.zzb(zzad0);
                if(pair0 == null) {
                    s = "video/hevc";
                }
                else {
                    switch(((int)(((Integer)pair0.first)))) {
                        case 1: 
                        case 2: 
                        case 0x200: {
                            s = "video/avc";
                            break;
                        }
                        default: {
                            s = "video/hevc";
                        }
                    }
                }
            }
            switch(s) {
                case "video/3gpp": {
                    v2 = 0;
                    break;
                }
                case "video/av01": {
                    v2 = 3;
                    break;
                }
                case "video/avc": {
                    v2 = 2;
                    break;
                }
                case "video/hevc": {
                    v2 = 5;
                    break;
                }
                case "video/mp4v-es": {
                    break;
                }
                case "video/x-vnd.on2.vp8": {
                    v2 = 4;
                    break;
                }
                case "video/x-vnd.on2.vp9": {
                    v2 = 6;
                    break;
                }
                default: {
                    v2 = -1;
                }
            }
            switch(v2) {
                case 2: {
                    if(!"BRAVIA 4K 2015".equals(zzeg.zzd) && (!"Amazon".equals(zzeg.zzc) || !"KFSOWI".equals(zzeg.zzd) && (!"AFTS".equals(zzeg.zzd) || !zzqf0.zzf))) {
                        int v3 = zzeg.zze(v, 16);
                        return zzeg.zze(v1, 16) * v3 * 0x300 / 4;
                    }
                    return -1;
                }
                case 0: 
                case 1: 
                case 3: 
                case 4: {
                    return v * v1 * 3 / 4;
                }
                case 5: 
                case 6: {
                    return v * v1 * 3 / 8;
                }
                default: {
                    return -1;
                }
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public final void zzp(int v, Object object0) throws zzgt {
        zzxe zzxe0 = this.I0;
        switch(v) {
            case 1: {
                Surface surface0 = object0 instanceof Surface ? ((Surface)object0) : null;
                if(surface0 == null) {
                    zzww zzww0 = this.P0;
                    if(zzww0 == null) {
                        zzqf zzqf0 = this.T;
                        if(zzqf0 != null && this.V(zzqf0)) {
                            surface0 = zzww.zza(this.H0, zzqf0.zzf);
                            this.P0 = surface0;
                        }
                    }
                    else {
                        surface0 = zzww0;
                    }
                }
                zzxp zzxp0 = this.J0;
                if(this.O0 != surface0) {
                    this.O0 = surface0;
                    zzxe0.zzi(surface0);
                    this.Q0 = false;
                    int v3 = this.zzbe();
                    zzqd zzqd1 = this.M;
                    if(zzqd1 != null) {
                        if(zzeg.zza < 23 || surface0 == null || this.M0) {
                            this.J();
                            this.H();
                        }
                        else {
                            zzqd1.zzo(surface0);
                        }
                    }
                    if(surface0 == null || surface0 == this.P0) {
                        this.j1 = null;
                        this.S0 = false;
                        return;
                    }
                    zzcv zzcv0 = this.j1;
                    if(zzcv0 != null) {
                        zzxp0.zzt(zzcv0);
                    }
                    this.S0 = false;
                    if(v3 == 2) {
                        this.W0 = 0x8000000000000001L;
                        return;
                    }
                }
                else if(surface0 != null && surface0 != this.P0) {
                    zzcv zzcv1 = this.j1;
                    if(zzcv1 != null) {
                        zzxp0.zzt(zzcv1);
                    }
                    if(this.Q0) {
                        zzxp0.zzq(this.O0);
                    }
                }
                break;
            }
            case 4: {
                int v1 = (int)(((Integer)object0));
                this.R0 = v1;
                zzqd zzqd0 = this.M;
                if(zzqd0 != null) {
                    zzqd0.zzq(v1);
                    return;
                }
                break;
            }
            case 5: {
                zzxe0.zzj(((int)(((Integer)object0))));
                return;
            }
            case 7: {
                this.l1 = (zzwx)object0;
                return;
            }
            case 10: {
                int v2 = (int)(((Integer)object0));
                if(this.k1 != v2) {
                    this.k1 = v2;
                    return;
                }
                break;
            }
        }
    }
}

