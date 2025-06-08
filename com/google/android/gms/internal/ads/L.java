package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public final class l {
    public final byte[] a;
    public int b;
    public int c;
    public long d;
    public final AbstractCollection e;
    public final Object f;
    public Object g;

    public l(int v) {
        if(v != 1) {
            super();
            this.a = new byte[8];
            this.e = new ArrayDeque();
            this.f = new m(0);
            return;
        }
        super();
        this.a = new byte[8];
        this.e = new Stack();
        this.f = new m(1);
    }

    public boolean a(zzys zzys0) {
        int v25;
        int v53;
        long v50;
        int v45;
        int v42;
        int v40;
        String s1;
        zzadg zzadg1;
        int v21;
        E9 e92;
        long v20;
        int v19;
        int v18;
        zzzt zzzt0;
        int v12;
        zzcw.zzb(((E9)this.g));
    alab1:
        while(true) {
            ArrayDeque arrayDeque0 = (ArrayDeque)this.e;
            k k0 = (k)arrayDeque0.peek();
            if(k0 != null && zzys0.zzf() >= k0.b) {
                E9 e90 = (E9)this.g;
                int v = ((k)arrayDeque0.pop()).a;
                zzadg zzadg0 = (zzadg)e90.j;
                zzcw.zzb(zzadg0.b0);
                SparseArray sparseArray0 = zzadg0.c;
                switch(v) {
                    case 0xA0: {
                        if(zzadg0.G != 2) {
                            return true;
                        }
                        zzadf zzadf2 = (zzadf)sparseArray0.get(zzadg0.M);
                        zzadf2.zzV.getClass();
                        if(zzadg0.R > 0L && "A_OPUS".equals(zzadf2.zzb)) {
                            byte[] arr_b = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(zzadg0.R).array();
                            zzadg0.n.zzD(arr_b, arr_b.length);
                        }
                        int v8 = 0;
                        for(int v7 = 0; v7 < zzadg0.K; ++v7) {
                            v8 += zzadg0.L[v7];
                        }
                        for(int v9 = 0; v9 < zzadg0.K; ++v9) {
                            long v10 = zzadg0.H + ((long)(zzadf2.zze * v9 / 1000));
                            int v11 = zzadg0.O;
                            if(v9 == 0) {
                                if(!zzadg0.Q) {
                                    v11 |= 1;
                                }
                                v12 = v11;
                                v9 = 0;
                            }
                            else {
                                v12 = v11;
                            }
                            int v13 = zzadg0.L[v9];
                            v8 -= v13;
                            zzadg0.f(zzadf2, v10, v12, v13, v8);
                        }
                        zzadg0.G = 0;
                        return true;
                    }
                    case 0xAE: {
                        zzadf zzadf0 = zzadg0.u;
                        zzcw.zzb(zzadf0);
                        String s = zzadf0.zzb;
                        if(s == null) {
                            throw zzbp.zza("CodecId is missing in TrackEntry element", null);
                        }
                        switch(s) {
                            case "A_AAC": 
                            case "A_AC3": 
                            case "A_DTS": 
                            case "A_DTS/EXPRESS": 
                            case "A_DTS/LOSSLESS": 
                            case "A_EAC3": 
                            case "A_FLAC": 
                            case "A_MPEG/L2": 
                            case "A_MPEG/L3": 
                            case "A_MS/ACM": 
                            case "A_OPUS": 
                            case "A_PCM/FLOAT/IEEE": 
                            case "A_PCM/INT/BIG": 
                            case "A_PCM/INT/LIT": 
                            case "A_TRUEHD": 
                            case "A_VORBIS": 
                            case "S_DVBSUB": 
                            case "S_HDMV/PGS": 
                            case "S_TEXT/ASS": 
                            case "S_TEXT/UTF8": 
                            case "S_TEXT/WEBVTT": 
                            case "S_VOBSUB": 
                            case "V_AV1": 
                            case "V_MPEG2": 
                            case "V_MPEG4/ISO/AP": 
                            case "V_MPEG4/ISO/ASP": 
                            case "V_MPEG4/ISO/AVC": 
                            case "V_MPEG4/ISO/SP": 
                            case "V_MPEGH/ISO/HEVC": 
                            case "V_MS/VFW/FOURCC": 
                            case "V_THEORA": 
                            case "V_VP8": 
                            case "V_VP9": {
                                zzadf0.zze(zzadg0.b0, zzadf0.zzc);
                                sparseArray0.put(zzadf0.zzc, zzadf0);
                            }
                        }
                        zzadg0.u = null;
                        return true;
                    label_22:
                        if(v != 0x6240) {
                            switch(v) {
                                case 0x6D80: {
                                    zzadg0.e(0x6D80);
                                    if(zzadg0.u.zzg && zzadg0.u.zzh != null) {
                                        throw zzbp.zza("Combining encryption and compression is not supported", null);
                                    }
                                    return true;
                                }
                                case 357149030: {
                                    if(zzadg0.r == 0x8000000000000001L) {
                                        zzadg0.r = 1000000L;
                                    }
                                    long v6 = zzadg0.s;
                                    if(v6 == 0x8000000000000001L) {
                                        return true;
                                    }
                                    zzadg0.t = zzadg0.c(v6);
                                    return true;
                                }
                                case 0x1654AE6B: {
                                    if(sparseArray0.size() == 0) {
                                        throw zzbp.zza("No valid tracks were found", null);
                                    }
                                    zzadg0.b0.zzB();
                                    return true;
                                }
                                case 0x1C53BB6B: {
                                    if(!zzadg0.v) {
                                        zzyu zzyu0 = zzadg0.b0;
                                        zzdo zzdo0 = zzadg0.C;
                                        zzdo zzdo1 = zzadg0.D;
                                        if(zzadg0.q == -1L || zzadg0.t == 0x8000000000000001L || zzdo0 == null || zzdo0.zza() == 0 || zzdo1 == null || zzdo1.zza() != zzdo0.zza()) {
                                            zzzt0 = new zzzt(zzadg0.t, 0L);
                                        }
                                        else {
                                            int v1 = zzdo0.zza();
                                            int[] arr_v = new int[v1];
                                            long[] arr_v1 = new long[v1];
                                            long[] arr_v2 = new long[v1];
                                            long[] arr_v3 = new long[v1];
                                            for(int v2 = 0; v2 < v1; ++v2) {
                                                arr_v3[v2] = zzdo0.zzb(v2);
                                                long v3 = zzadg0.q;
                                                arr_v1[v2] = zzdo1.zzb(v2) + v3;
                                            }
                                            for(int v4 = 0; v4 < v1 - 1; ++v4) {
                                                arr_v[v4] = (int)(arr_v1[v4 + 1] - arr_v1[v4]);
                                                arr_v2[v4] = arr_v3[v4 + 1] - arr_v3[v4];
                                            }
                                            arr_v[v1 - 1] = (int)(zzadg0.q + zzadg0.p - arr_v1[v1 - 1]);
                                            long v5 = zzadg0.t - arr_v3[v1 - 1];
                                            arr_v2[v1 - 1] = v5;
                                            if(v5 <= 0L) {
                                                Log.w("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + v5);
                                                arr_v = Arrays.copyOf(arr_v, v1 - 1);
                                                arr_v1 = Arrays.copyOf(arr_v1, v1 - 1);
                                                arr_v2 = Arrays.copyOf(arr_v2, v1 - 1);
                                                arr_v3 = Arrays.copyOf(arr_v3, v1 - 1);
                                            }
                                            zzzt0 = new zzyj(arr_v, arr_v1, arr_v2, arr_v3);
                                        }
                                        zzyu0.zzL(zzzt0);
                                        zzadg0.v = true;
                                    }
                                    zzadg0.C = null;
                                    zzadg0.D = null;
                                    return true;
                                }
                                default: {
                                    return true;
                                }
                            }
                        }
                        zzadg0.e(0x6240);
                        zzadf zzadf1 = zzadg0.u;
                        if(!zzadf1.zzg) {
                            return true;
                        }
                        zzzx zzzx0 = zzadf1.zzi;
                        if(zzzx0 == null) {
                            throw zzbp.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                        }
                        zzadf1.zzk = new zzv(null, new zzu[]{new zzu(zzm.zza, null, "video/webm", zzzx0.zzb)});
                        return true;
                    }
                    case 0x4DBB: {
                        int v14 = zzadg0.w;
                        if(v14 != -1) {
                            long v15 = zzadg0.x;
                            if(v15 != -1L) {
                                if(v14 == 0x1C53BB6B) {
                                    zzadg0.z = v15;
                                    return true;
                                }
                                return true;
                            }
                        }
                        throw zzbp.zza("Mandatory element SeekID or SeekPosition not found", null);
                    }
                    default: {
                        goto label_22;
                    }
                }
            }
            int v16 = this.b;
            m m0 = (m)this.f;
            if(v16 == 0) {
                long v17 = m0.e(zzys0, true, false, 4);
                if(v17 == -2L) {
                    zzys0.zzj();
                    while(true) {
                        byte[] arr_b1 = this.a;
                        ((zzyl)zzys0).zzm(arr_b1, 0, 4, false);
                        v18 = m.a(arr_b1[0]);
                        if(v18 != -1 && v18 <= 4) {
                            v19 = (int)m.c(false, v18, arr_b1);
                            E9 e91 = (E9)this.g;
                            if(v19 != 357149030 && v19 != 0x1654AE6B && v19 != 0x1C53BB6B && v19 != 0x1F43B675) {
                                goto label_138;
                            }
                            break;
                        }
                    label_138:
                        ((zzyl)zzys0).zzo(1, false);
                    }
                    ((zzyl)zzys0).zzo(v18, false);
                    v20 = (long)v19;
                }
                else {
                    v20 = v17;
                }
                if(v20 == -1L) {
                    return false;
                }
                this.c = (int)v20;
                this.b = 1;
                this.d = m0.e(zzys0, false, true, 8);
                this.b = 2;
            }
            else if(v16 == 1) {
                this.d = m0.e(zzys0, false, true, 8);
                this.b = 2;
            }
            e92 = (E9)this.g;
            v21 = this.c;
            zzadg1 = (zzadg)e92.j;
            switch(v21) {
                case 0xA1: 
                case 0xA3: 
                case 0xA5: 
                case 0x41ED: 
                case 0x4255: 
                case 18402: 
                case 0x53AB: 
                case 25506: 
                case 30322: {
                    v25 = 4;
                    goto label_244;
                }
                case 0xB5: 
                case 0x4489: 
                case 0x55D1: 
                case 21970: 
                case 0x55D3: 
                case 0x55D4: 
                case 0x55D5: 
                case 0x55D6: 
                case 0x55D7: 
                case 0x55D8: 
                case 0x55D9: 
                case 0x55DA: 
                case 30323: 
                case 30324: 
                case 30325: {
                    goto label_243;
                }
                case 0x86: 
                case 17026: 
                case 0x536E: 
                case 0x22B59C: {
                    v25 = 3;
                    goto label_244;
                }
                case 0x83: 
                case 0x88: 
                case 0x9B: 
                case 0x9F: 
                case 0xB0: 
                case 0xB3: 
                case 0xBA: 
                case 0xD7: 
                case 0xE7: 
                case 0xEE: 
                case 0xF1: 
                case 0xFB: 
                case 0x41E7: 
                case 16980: 
                case 17029: 
                case 0x42F7: 
                case 18401: 
                case 18408: 
                case 0x5031: 
                case 20530: 
                case 21420: 
                case 0x53B8: 
                case 0x54B0: 
                case 0x54B2: 
                case 21690: 
                case 21930: 
                case 0x55B9: 
                case 0x55BA: 
                case 0x55BB: 
                case 0x55BC: 
                case 0x55BD: 
                case 0x55EE: 
                case 0x56AA: 
                case 22203: 
                case 0x6264: 
                case 30114: 
                case 30321: 
                case 2352003: 
                case 2807729: {
                    break alab1;
                }
                case 0xA0: 
                case 0xA6: 
                case 0xAE: 
                case 0xB7: 
                case 0xBB: 
                case 0xE0: 
                case 0xE1: 
                case 0x41E4: 
                case 18407: 
                case 0x4DBB: 
                case 0x5034: 
                case 0x5035: 
                case 0x55B0: 
                case 0x55D0: 
                case 0x6240: 
                case 0x6D80: 
                case 30113: 
                case 30320: 
                case 290298740: 
                case 357149030: 
                case 0x1654AE6B: 
                case 0x18538067: 
                case 0x1A45DFA3: 
                case 0x1C53BB6B: 
                case 0x1F43B675: {
                    long v22 = zzys0.zzf();
                    arrayDeque0.push(new k(v21, this.d + v22));
                    int v23 = this.c;
                    long v24 = this.d;
                    zzadg zzadg2 = (zzadg)((E9)this.g).j;
                    zzcw.zzb(zzadg2.b0);
                    switch(v23) {
                        case 0xA0: {
                            zzadg2.Q = false;
                            zzadg2.R = 0L;
                            break;
                        }
                        case 0xAE: {
                            zzadf zzadf3 = new zzadf();  // 初始化器: Ljava/lang/Object;-><init>()V
                            zzadf3.zzl = -1;
                            zzadf3.zzm = -1;
                            zzadf3.zzn = -1;
                            zzadf3.zzo = -1;
                            zzadf3.zzp = 0;
                            zzadf3.zzq = -1;
                            zzadf3.zzr = 0.0f;
                            zzadf3.zzs = 0.0f;
                            zzadf3.zzt = 0.0f;
                            zzadf3.zzu = null;
                            zzadf3.zzv = -1;
                            zzadf3.zzw = false;
                            zzadf3.zzx = -1;
                            zzadf3.zzy = -1;
                            zzadf3.zzz = -1;
                            zzadf3.zzA = 1000;
                            zzadf3.zzB = 200;
                            zzadf3.zzC = -1.0f;
                            zzadf3.zzD = -1.0f;
                            zzadf3.zzE = -1.0f;
                            zzadf3.zzF = -1.0f;
                            zzadf3.zzG = -1.0f;
                            zzadf3.zzH = -1.0f;
                            zzadf3.zzI = -1.0f;
                            zzadf3.zzJ = -1.0f;
                            zzadf3.zzK = -1.0f;
                            zzadf3.zzL = -1.0f;
                            zzadf3.zzN = 1;
                            zzadf3.zzO = -1;
                            zzadf3.zzP = 8000;
                            zzadf3.zzQ = 0L;
                            zzadf3.zzR = 0L;
                            zzadf3.zzU = true;
                            zzadf3.b = "eng";
                            zzadg2.u = zzadf3;
                            break;
                        }
                        case 0xBB: {
                            zzadg2.E = false;
                            break;
                        }
                        case 0x4DBB: {
                            zzadg2.w = -1;
                            zzadg2.x = -1L;
                            break;
                        }
                        case 0x5035: {
                            zzadg2.e(0x5035);
                            zzadg2.u.zzg = true;
                            break;
                        }
                        case 0x55D0: {
                            zzadg2.e(0x55D0);
                            zzadg2.u.zzw = true;
                            break;
                        }
                        case 0x18538067: {
                            if(zzadg2.q != -1L && zzadg2.q != v22) {
                                throw zzbp.zza("Multiple Segment elements not supported", null);
                            }
                            zzadg2.q = v22;
                            zzadg2.p = v24;
                            break;
                        }
                        case 0x1C53BB6B: {
                            zzadg2.C = new zzdo(0x20);
                            zzadg2.D = new zzdo(0x20);
                            break;
                        }
                        case 0x1F43B675: {
                            if(!zzadg2.v) {
                                if(!zzadg2.d || zzadg2.z == -1L) {
                                    zzadg2.b0.zzL(new zzzt(zzadg2.t, 0L));
                                    zzadg2.v = true;
                                }
                                else {
                                    zzadg2.y = true;
                                }
                            }
                        }
                    }
                    this.b = 0;
                    return true;
                }
                default: {
                    ((zzyl)zzys0).zzo(((int)this.d), false);
                    this.b = 0;
                    break;
                }
            }
        }
        v25 = 2;
        goto label_244;
    label_243:
        v25 = 5;
    label_244:
        zzadg zzadg3 = (zzadg)e92.j;
        switch(v25) {
            case 2: {
                long v28 = this.d;
                if(v28 > 8L) {
                    throw zzbp.zza(("Invalid integer size: " + v28), null);
                }
                long v29 = this.c(zzys0, ((int)v28));
            alab2:
                switch(v21) {
                    case 0x83: {
                        zzadg3.e(0x83);
                        zzadg3.u.zzd = (int)v29;
                        break;
                    }
                    case 0x88: {
                        zzadg3.e(0x88);
                        zzadg3.u.zzU = v29 == 1L;
                        break;
                    }
                    case 0x9B: {
                        zzadg3.I = zzadg3.c(v29);
                        break;
                    }
                    case 0x9F: {
                        zzadg3.e(0x9F);
                        zzadg3.u.zzN = (int)v29;
                        break;
                    }
                    case 0xB0: {
                        zzadg3.e(0xB0);
                        zzadg3.u.zzl = (int)v29;
                        break;
                    }
                    case 0xB3: {
                        zzadg3.d(0xB3);
                        zzadg3.C.zzc(zzadg3.c(v29));
                        break;
                    }
                    case 0xBA: {
                        zzadg3.e(0xBA);
                        zzadg3.u.zzm = (int)v29;
                        break;
                    }
                    case 0xD7: {
                        zzadg3.e(0xD7);
                        zzadg3.u.zzc = (int)v29;
                        break;
                    }
                    case 0xE7: {
                        zzadg3.B = zzadg3.c(v29);
                        break;
                    }
                    case 0xEE: {
                        zzadg3.P = (int)v29;
                        break;
                    }
                    case 0xF1: {
                        if(!zzadg3.E) {
                            zzadg3.d(0xF1);
                            zzadg3.D.zzc(v29);
                            zzadg3.E = true;
                        }
                        break;
                    }
                    case 0xFB: {
                        zzadg3.Q = true;
                        break;
                    }
                    case 0x41E7: {
                        zzadg3.e(0x41E7);
                        zzadg3.u.a = (int)v29;
                        break;
                    }
                    case 16980: {
                        if(v29 != 3L) {
                            throw zzbp.zza(("ContentCompAlgo " + v29 + " not supported"), null);
                        }
                        break;
                    }
                    case 17029: {
                        if(v29 < 1L || v29 > 2L) {
                            throw zzbp.zza(("DocTypeReadVersion " + v29 + " not supported"), null);
                        }
                        break;
                    }
                    case 0x42F7: {
                        if(v29 != 1L) {
                            throw zzbp.zza(("EBMLReadVersion " + v29 + " not supported"), null);
                        }
                        break;
                    }
                    case 18401: {
                        if(v29 != 5L) {
                            throw zzbp.zza(("ContentEncAlgo " + v29 + " not supported"), null);
                        }
                        break;
                    }
                    case 18408: {
                        if(v29 != 1L) {
                            throw zzbp.zza(("AESSettingsCipherMode " + v29 + " not supported"), null);
                        }
                        break;
                    }
                    case 0x5031: {
                        if(v29 != 0L) {
                            throw zzbp.zza(("ContentEncodingOrder " + v29 + " not supported"), null);
                        }
                        break;
                    }
                    case 20530: {
                        if(v29 != 1L) {
                            throw zzbp.zza(("ContentEncodingScope " + v29 + " not supported"), null);
                        }
                        break;
                    }
                    case 21420: {
                        zzadg3.x = v29 + zzadg3.q;
                        break;
                    }
                    case 0x53B8: {
                        zzadg3.e(0x53B8);
                        switch(((int)v29)) {
                            case 0: {
                                zzadg3.u.zzv = 0;
                                break alab2;
                            }
                            case 1: {
                                zzadg3.u.zzv = 2;
                                break alab2;
                            }
                            case 3: {
                                zzadg3.u.zzv = 1;
                                break alab2;
                            }
                            case 15: {
                                zzadg3.u.zzv = 3;
                                break alab2;
                            }
                            default: {
                                break alab2;
                            }
                        }
                    }
                    case 0x54B0: {
                        zzadg3.e(0x54B0);
                        zzadg3.u.zzn = (int)v29;
                        break;
                    }
                    case 0x54B2: {
                        zzadg3.e(0x54B2);
                        zzadg3.u.zzp = (int)v29;
                        break;
                    }
                    case 21690: {
                        zzadg3.e(21690);
                        zzadg3.u.zzo = (int)v29;
                        break;
                    }
                    case 21930: {
                        zzadg3.e(21930);
                        zzadg3.u.zzT = v29 == 1L;
                        break;
                    }
                    case 0x55B9: {
                        zzadg3.e(0x55B9);
                        switch(((int)v29)) {
                            case 1: {
                                zzadg3.u.zzz = 2;
                                break alab2;
                            }
                            case 2: {
                                zzadg3.u.zzz = 1;
                                break alab2;
                            }
                            default: {
                                break alab2;
                            }
                        }
                    }
                    case 0x55BA: {
                        zzadg3.e(0x55BA);
                        int v30 = zzo.zzb(((int)v29));
                        if(v30 != -1) {
                            zzadg3.u.zzy = v30;
                        }
                        break;
                    }
                    case 0x55BB: {
                        zzadg3.e(0x55BB);
                        zzadf zzadf4 = zzadg3.u;
                        zzadf4.zzw = true;
                        int v31 = zzo.zza(((int)v29));
                        if(v31 != -1) {
                            zzadf4.zzx = v31;
                        }
                        break;
                    }
                    case 0x55BC: {
                        zzadg3.e(0x55BC);
                        zzadg3.u.zzA = (int)v29;
                        break;
                    }
                    case 0x55BD: {
                        zzadg3.e(0x55BD);
                        zzadg3.u.zzB = (int)v29;
                        break;
                    }
                    case 0x55EE: {
                        zzadg3.e(0x55EE);
                        zzadg3.u.zzf = (int)v29;
                        break;
                    }
                    case 0x56AA: {
                        zzadg3.e(0x56AA);
                        zzadg3.u.zzQ = v29;
                        break;
                    }
                    case 22203: {
                        zzadg3.e(22203);
                        zzadg3.u.zzR = v29;
                        break;
                    }
                    case 0x6264: {
                        zzadg3.e(0x6264);
                        zzadg3.u.zzO = (int)v29;
                        break;
                    }
                    case 30114: {
                        zzadg3.R = v29;
                        break;
                    }
                    case 30321: {
                        zzadg3.e(30321);
                        switch(((int)v29)) {
                            case 0: {
                                zzadg3.u.zzq = 0;
                                break alab2;
                            }
                            case 1: {
                                zzadg3.u.zzq = 1;
                                break alab2;
                            }
                            case 2: {
                                zzadg3.u.zzq = 2;
                                break alab2;
                            }
                            case 3: {
                                zzadg3.u.zzq = 3;
                                break alab2;
                            }
                            default: {
                                break alab2;
                            }
                        }
                    }
                    case 2352003: {
                        zzadg3.e(2352003);
                        zzadg3.u.zze = (int)v29;
                        break;
                    }
                    case 2807729: {
                        zzadg3.r = v29;
                    }
                }
                this.b = 0;
                return true;
            }
            case 3: {
                long v32 = this.d;
                if(v32 > 0x7FFFFFFFL) {
                    throw zzbp.zza(("String element size: " + v32), null);
                }
                int v33 = (int)v32;
                if(v33 == 0) {
                    s1 = "";
                }
                else {
                    byte[] arr_b2 = new byte[v33];
                    ((zzyl)zzys0).zzn(arr_b2, 0, v33, false);
                    while(v33 > 0 && arr_b2[v33 - 1] == 0) {
                        --v33;
                    }
                    s1 = new String(arr_b2, 0, v33);
                }
                switch(v21) {
                    case 0x86: {
                        zzadg3.e(0x86);
                        zzadg3.u.zzb = s1;
                        break;
                    }
                    case 17026: {
                        if(!"webm".equals(s1) && !"matroska".equals(s1)) {
                            throw zzbp.zza(("DocType " + s1 + " not supported"), null);
                        }
                        break;
                    }
                    case 0x536E: {
                        zzadg3.e(0x536E);
                        zzadg3.u.zza = s1;
                        break;
                    }
                    case 0x22B59C: {
                        zzadg3.e(0x22B59C);
                        zzadg3.u.b = s1;
                    }
                }
                this.b = 0;
                return true;
            }
            case 4: {
                int v34 = (int)this.d;
                SparseArray sparseArray1 = zzadg1.c;
                if(v21 == 0xA1 || v21 == 0xA3) {
                    zzdy zzdy0 = zzadg1.g;
                    if(zzadg1.G == 0) {
                        zzadg1.M = (int)zzadg1.b.e(zzys0, false, true, 8);
                        zzadg1.N = zzadg1.b.c;
                        zzadg1.I = 0x8000000000000001L;
                        zzadg1.G = 1;
                        zzdy0.zzC(0);
                    }
                    zzadf zzadf11 = (zzadf)sparseArray1.get(zzadg1.M);
                    if(zzadf11 == null) {
                        ((zzyl)zzys0).zzo(v34 - zzadg1.N, false);
                        zzadg1.G = 0;
                    }
                    else {
                        zzadf11.zzV.getClass();
                        if(zzadg1.G == 1) {
                            zzadg1.g(zzys0, 3);
                            int v35 = (zzdy0.zzH()[2] & 6) >> 1;
                            if(v35 == 0) {
                                zzadg1.K = 1;
                                int[] arr_v4 = zzadg1.L;
                                if(arr_v4 == null) {
                                    arr_v4 = new int[1];
                                }
                                else if(arr_v4.length < 1) {
                                    arr_v4 = new int[Math.max(arr_v4.length + arr_v4.length, 1)];
                                }
                                zzadg1.L = arr_v4;
                                arr_v4[0] = v34 - zzadg1.N - 3;
                            }
                            else {
                                int v36 = 4;
                                zzadg1.g(zzys0, 4);
                                int v37 = (zzdy0.zzH()[3] & 0xFF) + 1;
                                zzadg1.K = v37;
                                int[] arr_v5 = zzadg1.L;
                                if(arr_v5 == null) {
                                    arr_v5 = new int[v37];
                                }
                                else if(arr_v5.length < v37) {
                                    arr_v5 = new int[Math.max(arr_v5.length + arr_v5.length, v37)];
                                }
                                zzadg1.L = arr_v5;
                                if(v35 == 2) {
                                    Arrays.fill(arr_v5, 0, zzadg1.K, (v34 - zzadg1.N - 4) / zzadg1.K);
                                }
                                else {
                                    switch(v35) {
                                        case 1: {
                                            int v38 = 0;
                                            int v39 = 0;
                                            while(true) {
                                                v40 = zzadg1.K - 1;
                                                if(v38 >= v40) {
                                                    break;
                                                }
                                                zzadg1.L[v38] = 0;
                                                while(true) {
                                                    zzadg1.g(zzys0, v36 + 1);
                                                    int v41 = zzdy0.zzH()[v36] & 0xFF;
                                                    int[] arr_v6 = zzadg1.L;
                                                    v42 = arr_v6[v38] + v41;
                                                    arr_v6[v38] = v42;
                                                    if(v41 != 0xFF) {
                                                        break;
                                                    }
                                                    ++v36;
                                                }
                                                v39 += v42;
                                                ++v38;
                                                ++v36;
                                            }
                                            zzadg1.L[v40] = v34 - zzadg1.N - v36 - v39;
                                            break;
                                        }
                                        case 3: {
                                            int v43 = 0;
                                            int v44 = 0;
                                            while(true) {
                                                v45 = zzadg1.K - 1;
                                                if(v43 >= v45) {
                                                    goto label_570;
                                                }
                                                zzadg1.L[v43] = 0;
                                                int v46 = v36 + 1;
                                                zzadg1.g(zzys0, v46);
                                                if(zzdy0.zzH()[v36] == 0) {
                                                    throw zzbp.zza("No valid varint length mask found", null);
                                                }
                                                int v47 = 0;
                                                while(true) {
                                                    if(v47 < 8) {
                                                        int v48 = 1 << 7 - v47;
                                                        if((zzdy0.zzH()[v36] & v48) == 0) {
                                                            ++v47;
                                                            continue;
                                                        }
                                                        else {
                                                            int v49 = v46 + v47;
                                                            zzadg1.g(zzys0, v49);
                                                            v50 = (long)(~v48 & (zzdy0.zzH()[v36] & 0xFF));
                                                            while(v46 < v49) {
                                                                v50 = v50 << 8 | ((long)(zzdy0.zzH()[v46] & 0xFF));
                                                                ++v46;
                                                            }
                                                            if(v43 > 0) {
                                                                v50 -= (1L << v47 * 7 + 6) - 1L;
                                                            }
                                                            v36 = v49;
                                                            break;
                                                        }
                                                    }
                                                    v36 = v46;
                                                    v50 = 0L;
                                                    break;
                                                }
                                                if(v50 < 0xFFFFFFFF80000000L || v50 > 0x7FFFFFFFL) {
                                                    break;
                                                }
                                                int v51 = (int)v50;
                                                int[] arr_v7 = zzadg1.L;
                                                if(v43 != 0) {
                                                    v51 += arr_v7[v43 - 1];
                                                }
                                                arr_v7[v43] = v51;
                                                v44 += v51;
                                                ++v43;
                                            }
                                            throw zzbp.zza("EBML lacing sample size out of range.", null);
                                        label_570:
                                            zzadg1.L[v45] = v34 - zzadg1.N - v36 - v44;
                                            break;
                                        }
                                        default: {
                                            throw zzbp.zza("Unexpected lacing value: 2", null);
                                        }
                                    }
                                }
                            }
                            long v52 = zzadg1.B;
                            zzadg1.H = zzadg1.c(((long)(zzdy0.zzH()[0] << 8 | zzdy0.zzH()[1] & 0xFF))) + v52;
                            if(zzadf11.zzd == 2) {
                                v53 = 1;
                            }
                            else if(v21 == 0xA3) {
                                v53 = (zzdy0.zzH()[2] & 0x80) == 0x80 ? 1 : 0;
                                v21 = 0xA3;
                            }
                            else {
                                v53 = 0;
                            }
                            zzadg1.O = v53;
                            zzadg1.G = 2;
                            zzadg1.J = 0;
                        }
                        if(v21 == 0xA3) {
                            int v54;
                            while((v54 = zzadg1.J) < zzadg1.K) {
                                int v55 = zzadg1.b(zzys0, zzadf11, zzadg1.L[v54], false);
                                zzadg1.f(zzadf11, zzadg1.H + ((long)(zzadg1.J * zzadf11.zze / 1000)), zzadg1.O, v55, 0);
                                ++zzadg1.J;
                            }
                            zzadg1.G = 0;
                        }
                        else {
                            int v56;
                            while((v56 = zzadg1.J) < zzadg1.K) {
                                int[] arr_v8 = zzadg1.L;
                                arr_v8[v56] = zzadg1.b(zzys0, zzadf11, arr_v8[v56], true);
                                ++zzadg1.J;
                            }
                        }
                    }
                }
                else {
                    switch(v21) {
                        case 0xA5: {
                            if(zzadg1.G == 2) {
                                zzadf zzadf10 = (zzadf)sparseArray1.get(zzadg1.M);
                                if(zzadg1.P != 4 || !"V_VP9".equals(zzadf10.zzb)) {
                                    ((zzyl)zzys0).zzo(v34, false);
                                }
                                else {
                                    zzadg1.n.zzC(v34);
                                    ((zzyl)zzys0).zzn(zzadg1.n.zzH(), 0, v34, false);
                                }
                            }
                            break;
                        }
                        case 0x41ED: {
                            zzadg1.e(0x41ED);
                            zzadf zzadf9 = zzadg1.u;
                            if(zzadf9.a != 1685480259 && zzadf9.a != 0x64767643) {
                                ((zzyl)zzys0).zzo(v34, false);
                            }
                            else {
                                byte[] arr_b7 = new byte[v34];
                                zzadf9.zzM = arr_b7;
                                ((zzyl)zzys0).zzn(arr_b7, 0, v34, false);
                            }
                            break;
                        }
                        case 0x4255: {
                            zzadg1.e(0x4255);
                            zzadf zzadf8 = zzadg1.u;
                            byte[] arr_b6 = new byte[v34];
                            zzadf8.zzh = arr_b6;
                            ((zzyl)zzys0).zzn(arr_b6, 0, v34, false);
                            break;
                        }
                        case 18402: {
                            byte[] arr_b5 = new byte[v34];
                            ((zzyl)zzys0).zzn(arr_b5, 0, v34, false);
                            zzadg1.e(18402);
                            zzadf zzadf7 = zzadg1.u;
                            zzadf7.zzi = new zzzx(1, arr_b5, 0, 0);
                            break;
                        }
                        case 0x53AB: {
                            Arrays.fill(zzadg1.i.zzH(), 0);
                            ((zzyl)zzys0).zzn(zzadg1.i.zzH(), 4 - v34, v34, false);
                            zzadg1.i.zzF(0);
                            zzadg1.w = (int)zzadg1.i.zzs();
                            break;
                        }
                        case 25506: {
                            zzadg1.e(25506);
                            zzadf zzadf6 = zzadg1.u;
                            byte[] arr_b4 = new byte[v34];
                            zzadf6.zzj = arr_b4;
                            ((zzyl)zzys0).zzn(arr_b4, 0, v34, false);
                            break;
                        }
                        case 30322: {
                            zzadg1.e(30322);
                            zzadf zzadf5 = zzadg1.u;
                            byte[] arr_b3 = new byte[v34];
                            zzadf5.zzu = arr_b3;
                            ((zzyl)zzys0).zzn(arr_b3, 0, v34, false);
                            break;
                        }
                        default: {
                            throw zzbp.zza(("Unexpected id: " + v21), null);
                        }
                    }
                }
                this.b = 0;
                return true;
            }
            default: {
                long v26 = this.d;
                if(v26 != 4L && v26 != 8L) {
                    throw zzbp.zza(("Invalid float size: " + v26), null);
                }
                long v27 = this.c(zzys0, ((int)v26));
                zzadg3.a(v21, (((int)v26) == 4 ? ((double)Float.intBitsToFloat(((int)v27))) : Double.longBitsToDouble(v27)));
                this.b = 0;
                return true;
            }
        }
    }

    public long b(zzatv zzatv0, int v) {
        byte[] arr_b = this.a;
        zzatv0.zzh(arr_b, 0, v, false);
        long v2 = 0L;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 << 8 | ((long)(arr_b[v1] & 0xFF));
        }
        return v2;
    }

    public long c(zzys zzys0, int v) {
        byte[] arr_b = this.a;
        ((zzyl)zzys0).zzn(arr_b, 0, v, false);
        long v2 = 0L;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 << 8 | ((long)(arr_b[v1] & 0xFF));
        }
        return v2;
    }
}

