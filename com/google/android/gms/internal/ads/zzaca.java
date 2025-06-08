package com.google.android.gms.internal.ads;

import A.f;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public final class zzaca {
    public static final zzaby zza;

    static {
        zzaca.zza = zzabx.zza;
    }

    public static int a(int v) {
        return v == 0 || v == 3 ? 1 : 2;
    }

    public static int b(byte[] arr_b, int v, int v1) {
        int v2 = zzaca.c(v, arr_b);
        if(v1 != 0 && v1 != 3) {
            while(v2 < arr_b.length - 1) {
                if((v2 - v) % 2 == 0 && arr_b[v2 + 1] == 0) {
                    return v2;
                }
                v2 = zzaca.c(v2 + 1, arr_b);
            }
            return arr_b.length;
        }
        return v2;
    }

    public static int c(int v, byte[] arr_b) {
        while(v < arr_b.length) {
            if(arr_b[v] == 0) {
                return v;
            }
            ++v;
        }
        return arr_b.length;
    }

    public static int d(int v, zzdy zzdy0) {
        byte[] arr_b = zzdy0.zzH();
        int v1 = zzdy0.zzc();
        for(int v2 = v1; v2 + 1 < v1 + v; ++v2) {
            if((arr_b[v2] & 0xFF) == 0xFF && arr_b[v2 + 1] == 0) {
                System.arraycopy(arr_b, v2 + 2, arr_b, v2 + 1, v - (v2 - v1) - 2);
                --v;
            }
        }
        return v;
    }

    public static zzacb e(int v, zzdy zzdy0, boolean z, zzaby zzaby0) {
        int v22;
        byte[] arr_b4;
        String s3;
        int v21;
        int v20;
        int v18;
        int v16;
        int v15;
        zzacj zzacj0;
        int v29;
        String s7;
        int v27;
        boolean z1;
        int v11;
        int v10;
        int v9;
        int v8;
        int v5;
        int v1 = zzdy0.zzk();
        int v2 = zzdy0.zzk();
        int v3 = zzdy0.zzk();
        int v4 = v < 3 ? 0 : zzdy0.zzk();
        switch(v) {
            case 3: {
                v5 = zzdy0.zzn();
                break;
            }
            case 4: {
                v5 = zzdy0.zzn();
                if(!z) {
                    v5 = v5 >> 24 << 21 | (v5 & 0xFF | (v5 >> 8 & 0xFF) << 7 | (v5 >> 16 & 0xFF) << 14);
                }
                break;
            }
            default: {
                v5 = zzdy0.zzm();
            }
        }
        int v6 = v < 3 ? 0 : zzdy0.zzo();
        zzacb zzacb0 = null;
        if(v1 == 0 && v2 == 0 && v3 == 0 && v4 == 0 && v5 == 0 && v6 == 0) {
            zzdy0.zzF(zzdy0.zzd());
            return null;
        }
        int v7 = zzdy0.zzc() + v5;
        if(v7 > zzdy0.zzd()) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            zzdy0.zzF(zzdy0.zzd());
            return null;
        }
        if(zzaby0 == null) {
            switch(v) {
                case 3: {
                    v8 = (v6 & 0x80) == 0 ? 0 : 1;
                    v11 = (v6 & 0x40) == 0 ? 0 : 1;
                    z1 = false;
                    v10 = (v6 & 0x20) == 0 ? 0 : 1;
                    v9 = v8;
                    break;
                }
                case 4: {
                    v11 = (v6 & 4) == 0 ? 0 : 1;
                    z1 = (v6 & 2) != 0;
                    v9 = v6 & 1;
                    v10 = (v6 & 0x40) == 0 ? 0 : 1;
                    v8 = (v6 & 8) == 0 ? 0 : 1;
                    break;
                }
                default: {
                    v8 = 0;
                    v9 = 0;
                    v10 = 0;
                    v11 = 0;
                    z1 = false;
                }
            }
            if(v8 != 0 || v11 != 0) {
                Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                zzdy0.zzF(v7);
                return null;
            }
            if(v10 != 0) {
                --v5;
                zzdy0.zzG(1);
            }
            if(v9 != 0) {
                v5 += -4;
                zzdy0.zzG(4);
            }
            if(z1) {
                v5 = zzaca.d(v5, zzdy0);
            }
            if(v1 != 84 || v2 != 88 || v3 != 88 || v != 2 && v4 != 88) {
                goto label_66;
                try {
                label_107:
                    String s4 = new String(arr_b4, 0, v22, "ISO-8859-1");
                    int v23 = zzaca.b(arr_b4, v22 + 1, v21);
                    String s5 = zzaca.f(s3, arr_b4, v22 + 1, v23);
                    int v24 = v23 + zzaca.a(v21);
                    int v25 = zzaca.b(arr_b4, v24, v21);
                    int v26 = v25 + zzaca.a(v21);
                    v15 = v1;
                    v16 = 0x4F;
                    zzacb0 = new zzabw(s4, s5, zzaca.f(s3, arr_b4, v24, v25), (v5 - 1 > v26 ? Arrays.copyOfRange(arr_b4, v26, v5 - 1) : zzeg.zzf));
                    v27 = v4;
                    goto label_255;
                label_118:
                    v20 = v7;
                label_119:
                    if(v != 2) {
                        if(v18 != 65 || v2 != 80 || v3 != 73 || v4 != 67) {
                            v15 = v1;
                        label_146:
                            if(v18 == 67 && v2 == 0x4F && v3 == 77 && (v4 == 77 || v == 2)) {
                                if(v5 >= 4) {
                                    int v55 = zzdy0.zzk();
                                    String s11 = zzaca.g(v55);
                                    byte[] arr_b7 = new byte[3];
                                    zzdy0.zzB(arr_b7, 0, 3);
                                    String s12 = new String(arr_b7, 0, 3);
                                    byte[] arr_b8 = new byte[v5 - 4];
                                    zzdy0.zzB(arr_b8, 0, v5 - 4);
                                    int v56 = zzaca.b(arr_b8, 0, v55);
                                    int v57 = v56 + zzaca.a(v55);
                                    v16 = v3;
                                    zzacb0 = new zzabu(s12, new String(arr_b8, 0, v56, s11), zzaca.f(s11, arr_b8, v57, zzaca.b(arr_b8, v57, v55)));
                                }
                                else {
                                    v16 = 77;
                                }
                                v27 = v4;
                            }
                            else if(v18 == 67 && v2 == 72 && v3 == 65 && v4 == 80) {
                                int v33 = zzdy0.zzc();
                                int v34 = zzaca.c(v33, zzdy0.zzH());
                                String s8 = new String(zzdy0.zzH(), v33, v34 - v33, "ISO-8859-1");
                                zzdy0.zzF(v34 + 1);
                                int v35 = zzdy0.zze();
                                int v36 = zzdy0.zze();
                                long v37 = zzdy0.zzs();
                                long v38 = zzdy0.zzs();
                                ArrayList arrayList0 = new ArrayList();
                                while(zzdy0.zzc() < v33 + v5) {
                                    zzacb zzacb1 = zzaca.e(v, zzdy0, z, null);
                                    if(zzacb1 != null) {
                                        arrayList0.add(zzacb1);
                                    }
                                }
                                v16 = v3;
                                zzacb0 = new zzabq(s8, v35, v36, (v37 == 0xFFFFFFFFL ? -1L : v37), (v38 == 0xFFFFFFFFL ? -1L : v38), ((zzacb[])arrayList0.toArray(new zzacb[0])));
                                v27 = v4;
                            }
                            else if(v18 == 67 && v2 == 84 && v3 == 0x4F && v4 == 67) {
                                int v39 = zzdy0.zzc();
                                int v40 = zzaca.c(v39, zzdy0.zzH());
                                String s9 = new String(zzdy0.zzH(), v39, v40 - v39, "ISO-8859-1");
                                zzdy0.zzF(v40 + 1);
                                int v41 = zzdy0.zzk();
                                int v42 = zzdy0.zzk();
                                String[] arr_s = new String[v42];
                                for(int v43 = 0; v43 < v42; ++v43) {
                                    int v44 = zzdy0.zzc();
                                    int v45 = zzaca.c(v44, zzdy0.zzH());
                                    arr_s[v43] = new String(zzdy0.zzH(), v44, v45 - v44, "ISO-8859-1");
                                    zzdy0.zzF(v45 + 1);
                                }
                                ArrayList arrayList1 = new ArrayList();
                                while(zzdy0.zzc() < v39 + v5) {
                                    zzacb zzacb2 = zzaca.e(v, zzdy0, z, null);
                                    if(zzacb2 != null) {
                                        arrayList1.add(zzacb2);
                                    }
                                }
                                zzacb0 = new zzabs(s9, (v41 & 2) != 0, 1 == (v41 & 1), arr_s, ((zzacb[])arrayList1.toArray(new zzacb[0])));
                                v27 = 67;
                                v16 = 0x4F;
                            }
                            else if(v18 != 77 || v2 != 76) {
                                v27 = v4;
                                v16 = v3;
                            label_218:
                                String s10 = zzaca.h(v, v18, v2, v16, v27);
                                byte[] arr_b6 = new byte[v5];
                                zzdy0.zzB(arr_b6, 0, v5);
                                zzacb0 = new zzabo(s10, arr_b6);
                            }
                            else {
                                v16 = v3;
                                v27 = v4;
                                if(v16 != 76 || v27 != 84) {
                                    goto label_218;
                                }
                                else {
                                    int v46 = zzdy0.zzo();
                                    int v47 = zzdy0.zzm();
                                    int v48 = zzdy0.zzm();
                                    int v49 = zzdy0.zzk();
                                    int v50 = zzdy0.zzk();
                                    zzdx zzdx0 = new zzdx();
                                    zzdx0.zzg(zzdy0.zzH(), zzdy0.zzd());
                                    zzdx0.zzh(zzdy0.zzc() * 8);
                                    int v51 = (v5 - 10) * 8 / (v49 + v50);
                                    int[] arr_v = new int[v51];
                                    int[] arr_v1 = new int[v51];
                                    for(int v52 = 0; v52 < v51; ++v52) {
                                        int v53 = zzdx0.zzc(v49);
                                        int v54 = zzdx0.zzc(v50);
                                        arr_v[v52] = v53;
                                        arr_v1[v52] = v54;
                                    }
                                    zzacb0 = new zzacf(v46, v47, v48, arr_v, arr_v1);
                                }
                            }
                        }
                        else {
                        label_124:
                            int v28 = zzdy0.zzk();
                            String s6 = zzaca.g(v28);
                            byte[] arr_b5 = new byte[v5 - 1];
                            zzdy0.zzB(arr_b5, 0, v5 - 1);
                            if(v == 2) {
                                s7 = "image/" + zzfoc.zza(new String(arr_b5, 0, 3, "ISO-8859-1"));
                                if("image/jpg".equals(s7)) {
                                    s7 = "image/jpeg";
                                }
                                v29 = 2;
                            }
                            else {
                                v29 = zzaca.c(0, arr_b5);
                                s7 = zzfoc.zza(new String(arr_b5, 0, v29, "ISO-8859-1"));
                                if(s7.indexOf(0x2F) == -1) {
                                    s7 = "image/" + s7;
                                }
                            }
                            int v30 = arr_b5[v29 + 1] & 0xFF;
                            int v31 = zzaca.b(arr_b5, v29 + 2, v28);
                            v15 = v1;
                            int v32 = v31 + zzaca.a(v28);
                            zzacb0 = new zzabm(s7, new String(arr_b5, v29 + 2, v31 - (v29 + 2), s6), v30, (v5 - 1 > v32 ? Arrays.copyOfRange(arr_b5, v32, v5 - 1) : zzeg.zzf));
                            v16 = v3;
                            v27 = v4;
                        }
                    }
                    else if(v18 != 80 || v2 != 73 || v3 != 67) {
                        v15 = v1;
                        goto label_146;
                    }
                    else {
                        goto label_124;
                    }
                    goto label_255;
                }
                catch(UnsupportedEncodingException unused_ex) {
                    goto label_261;
                }
                catch(Throwable throwable0) {
                    v7 = v20;
                    goto label_269;
                }
            label_240:
                if(v5 > 0) {
                    try {
                        int v58 = zzdy0.zzk();
                        byte[] arr_b9 = new byte[v5 - 1];
                        zzdy0.zzB(arr_b9, 0, v5 - 1);
                        int v59 = zzaca.b(arr_b9, 0, v58);
                        int v60 = v59 + zzaca.a(v58);
                        zzacj0 = new zzacl("WXXX", new String(arr_b9, 0, v59, zzaca.g(v58)), zzaca.f("ISO-8859-1", arr_b9, v60, zzaca.c(v60, arr_b9)));
                        v15 = v1;
                        v16 = v3;
                        zzacb0 = zzacj0;
                        goto label_253;
                    label_251:
                        v15 = 87;
                        v16 = v3;
                    }
                    catch(UnsupportedEncodingException unused_ex) {
                        goto label_266;
                    }
                    catch(Throwable throwable0) {
                        goto label_269;
                    }
                }
                else {
                    goto label_251;
                }
            label_253:
                v27 = v4;
                v20 = v7;
            }
            else if(v5 > 0) {
                try {
                    int v12 = zzdy0.zzk();
                    String s = zzaca.g(v12);
                    byte[] arr_b = new byte[v5 - 1];
                    zzdy0.zzB(arr_b, 0, v5 - 1);
                    int v13 = zzaca.b(arr_b, 0, v12);
                    int v14 = v13 + zzaca.a(v12);
                    zzacj0 = new zzacj("TXXX", new String(arr_b, 0, v13, s), zzaca.f(s, arr_b, v14, zzaca.b(arr_b, v14, v12)));
                    v15 = v1;
                    v16 = v3;
                    zzacb0 = zzacj0;
                    goto label_253;
                label_66:
                    if(v1 == 84) {
                        String s1 = zzaca.h(v, 84, v2, v3, v4);
                        if(v5 > 0) {
                            int v17 = zzdy0.zzk();
                            byte[] arr_b1 = new byte[v5 - 1];
                            zzdy0.zzB(arr_b1, 0, v5 - 1);
                            zzacj0 = new zzacj(s1, null, new String(arr_b1, 0, zzaca.b(arr_b1, 0, v17), zzaca.g(v17)));
                            v15 = v1;
                            v16 = v3;
                            zzacb0 = zzacj0;
                        }
                        else {
                            v15 = 84;
                            v16 = v3;
                        }
                        goto label_253;
                    }
                    else if(v1 != 87) {
                        v18 = v1;
                        goto label_82;
                    }
                    else if(v2 == 88 && v3 == 88 && (v == 2 || v4 == 88)) {
                        goto label_240;
                    }
                    else {
                        v18 = 87;
                    label_82:
                        if(v18 == 87) {
                            String s2 = zzaca.h(v, 87, v2, v3, v4);
                            byte[] arr_b2 = new byte[v5];
                            zzdy0.zzB(arr_b2, 0, v5);
                            zzacj0 = new zzacl(s2, null, new String(arr_b2, 0, zzaca.c(0, arr_b2), "ISO-8859-1"));
                            v15 = v1;
                            v16 = v3;
                            zzacb0 = zzacj0;
                            goto label_253;
                        }
                        else if(v18 != 80) {
                        label_96:
                            if(v18 != 71) {
                                goto label_118;
                            }
                            else if(v2 != 69 || v3 != 0x4F || v4 != 66 && v != 2) {
                                v20 = v7;
                                v18 = 71;
                                goto label_119;
                            }
                            else {
                                v21 = zzdy0.zzk();
                                s3 = zzaca.g(v21);
                                arr_b4 = new byte[v5 - 1];
                                zzdy0.zzB(arr_b4, 0, v5 - 1);
                                v22 = zzaca.c(0, arr_b4);
                                v20 = v7;
                                goto label_107;
                            }
                        }
                        else if(v2 == 82 && v3 == 73 && v4 == 86) {
                            byte[] arr_b3 = new byte[v5];
                            zzdy0.zzB(arr_b3, 0, v5);
                            int v19 = zzaca.c(0, arr_b3);
                            zzacj0 = new zzach(new String(arr_b3, 0, v19, "ISO-8859-1"), (v5 > v19 + 1 ? Arrays.copyOfRange(arr_b3, v19 + 1, v5) : zzeg.zzf));
                            v15 = v1;
                            v16 = v3;
                            zzacb0 = zzacj0;
                            goto label_253;
                        }
                        else {
                            v18 = 80;
                            goto label_96;
                        }
                    }
                }
                catch(UnsupportedEncodingException unused_ex) {
                    goto label_266;
                }
                catch(Throwable throwable0) {
                    goto label_269;
                }
            }
            else {
                v15 = v1;
                v16 = v3;
                goto label_253;
            }
        label_255:
            if(zzacb0 == null) {
                try {
                    Log.w("Id3Decoder", "Failed to decode frame: id=" + zzaca.h(v, v15, v2, v16, v27) + ", frameSize=" + v5);
                    goto label_271;
                label_261:
                    v7 = v20;
                }
                catch(UnsupportedEncodingException unused_ex) {
                    goto label_261;
                }
                catch(Throwable throwable0) {
                    v7 = v20;
                    goto label_269;
                }
                try {
                    while(true) {
                        Log.w("Id3Decoder", "Unsupported character encoding");
                        break;
                        try {
                            goto label_269;
                        label_266:
                        }
                        catch(UnsupportedEncodingException unused_ex) {
                        }
                    }
                }
                catch(Throwable throwable0) {
                    goto label_269;
                }
                zzdy0.zzF(v7);
                return null;
            label_269:
                zzdy0.zzF(v7);
                throw throwable0;
            }
        label_271:
            zzdy0.zzF(v20);
            return zzacb0;
        }
        zzdy0.zzF(v7);
        return null;
    }

    public static String f(String s, byte[] arr_b, int v, int v1) {
        return v1 <= v || v1 > arr_b.length ? "" : new String(arr_b, v, v1 - v, s);
    }

    public static String g(int v) {
        switch(v) {
            case 1: {
                return "UTF-16";
            }
            case 2: {
                return "UTF-16BE";
            }
            case 3: {
                return "UTF-8";
            }
            default: {
                return "ISO-8859-1";
            }
        }
    }

    public static String h(int v, int v1, int v2, int v3, int v4) {
        return v == 2 ? String.format(Locale.US, "%c%c%c", v1, v2, v3) : String.format(Locale.US, "%c%c%c%c", v1, v2, v3, v4);
    }

    public static boolean i(zzdy zzdy0, int v, int v1, boolean z) {
        int v8;
        int v6;
        long v5;
        int v4;
        int v2 = zzdy0.zzc();
        while(true) {
            int v3 = 1;
            if(zzdy0.zza() < v1) {
                break;
            }
            try {
                if(v >= 3) {
                    v4 = zzdy0.zze();
                    v5 = zzdy0.zzs();
                    v6 = zzdy0.zzo();
                }
                else {
                    v4 = zzdy0.zzm();
                    v5 = (long)zzdy0.zzm();
                    v6 = 0;
                }
            }
            catch(Throwable throwable0) {
                zzdy0.zzF(v2);
                throw throwable0;
            }
            if(v4 == 0 && v5 == 0L && v6 == 0) {
                zzdy0.zzF(v2);
                return true;
            }
            if(v == 4 && !z) {
                if((0x808080L & v5) != 0L) {
                    zzdy0.zzF(v2);
                    return false;
                }
                v5 = v5 >> 24 << 21 | ((0xFFL & v5 >> 16) << 14 | (v5 & 0xFFL | (v5 >> 8 & 0xFFL) << 7));
            }
            if(v == 4) {
                if((v6 & 0x40) == 0) {
                    v3 = 0;
                }
                int v7 = v3;
                v3 = v6 & 1;
                v8 = v7;
            }
            else if(v == 3) {
                v8 = (v6 & 0x20) == 0 ? 0 : 1;
                if((v6 & 0x80) == 0) {
                    v3 = 0;
                }
            }
            else {
                v8 = 0;
                v3 = 0;
            }
            if(v3 != 0) {
                v8 += 4;
            }
            if(v5 < ((long)v8)) {
                zzdy0.zzF(v2);
                return false;
            }
            if(((long)zzdy0.zza()) < v5) {
                zzdy0.zzF(v2);
                return false;
            }
            try {
                zzdy0.zzG(((int)v5));
                continue;
            }
            catch(Throwable throwable0) {
            }
            zzdy0.zzF(v2);
            throw throwable0;
        }
        zzdy0.zzF(v2);
        return true;
    }

    public static final zzbl zza(byte[] arr_b, int v, zzaby zzaby0, zzabb zzabb0) {
        j j0;
        ArrayList arrayList0 = new ArrayList();
        zzdy zzdy0 = new zzdy(arr_b, v);
        boolean z = false;
        int v1 = 10;
        if(zzdy0.zza() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
            j0 = null;
        }
        else {
            int v2 = zzdy0.zzm();
            if(v2 == 4801587) {
                int v3 = zzdy0.zzk();
                zzdy0.zzG(1);
                int v4 = zzdy0.zzk();
                int v5 = zzdy0.zzj();
                if(v3 != 2) {
                    switch(v3) {
                        case 3: {
                            if((v4 & 0x40) != 0) {
                                int v6 = zzdy0.zze();
                                zzdy0.zzG(v6);
                                v5 -= v6 + 4;
                            }
                            j0 = new j(3, v5, (v4 & 0x80) != 0);
                            break;
                        }
                        case 4: {
                            if((v4 & 0x40) != 0) {
                                int v7 = zzdy0.zzj();
                                zzdy0.zzG(v7 - 4);
                                v5 -= v7;
                            }
                            if((v4 & 16) != 0) {
                                v5 += -10;
                            }
                            j0 = new j(4, v5, false);
                            break;
                        }
                        default: {
                            f.p(v3, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                            j0 = null;
                        }
                    }
                }
                else if((v4 & 0x40) != 0) {
                    Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    j0 = null;
                }
                else {
                    j0 = new j(2, v5, (v4 & 0x80) != 0);
                }
            }
            else {
                Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", v2));
                j0 = null;
            }
        }
        if(j0 == null) {
            return null;
        }
        int v8 = zzdy0.zzc();
        int v9 = j0.a;
        if(v9 == 2) {
            v1 = 6;
        }
        zzdy0.zzE(v8 + (j0.b ? zzaca.d(j0.c, zzdy0) : j0.c));
        if(!zzaca.i(zzdy0, v9, v1, false)) {
            if(v9 == 4 && zzaca.i(zzdy0, 4, v1, true)) {
                z = true;
                goto label_54;
            }
            f.p(v9, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
    label_54:
        while(zzdy0.zza() >= v1) {
            zzacb zzacb0 = zzaca.e(v9, zzdy0, z, zzaby0);
            if(zzacb0 != null) {
                arrayList0.add(zzacb0);
            }
        }
        return new zzbl(arrayList0);
    }
}

