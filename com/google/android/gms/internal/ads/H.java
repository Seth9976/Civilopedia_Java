package com.google.android.gms.internal.ads;

import A.f;
import Y.m;
import android.util.Log;
import com.google.android.gms.ads.internal.client.zzay;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.xmlpull.v1.XmlPullParser;

public abstract class h {
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final int[] e;
    public static final byte[][] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final W9 k;
    public static final X9 l;
    public static zzfwn m;

    static {
        h.a = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
        h.b = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
        h.c = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
        h.d = new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
        h.e = new int[]{0x69736F6D, 0x69736F32, 0x69736F33, 0x69736F34, 0x69736F35, 0x69736F36, 0x69736F39, 0x61766331, 1752589105, 0x68657631, 0x61763031, 0x6D703431, 0x6D703432, 862401121, 862401122, 0x33677236, 0x33677336, 0x33676536, 0x33676736, 0x4D345620, 0x4D344120, 0x66347620, 1801741417, 1295275600, 0x71742020, 1297305174, 0x64627931, 0x69736D6C, 0x70696666};
        h.f = new byte[][]{new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{(byte)0xE0, -21, 0x7A, 0x7C, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, (byte)0x8D, -21, -100, 50, (byte)0xB1, -3, (byte)0x86, 98, 5, 22, 0x5F, 73, -72, 0}, new byte[]{0x5F, -100, -107, -68, -93, 80, (byte)0x8C, 36, (byte)0xB1, (byte)0xD0, (byte)0xB1, 85, -100, (byte)0x83, -17, 91, 4, 68, 92, -60, 88, 28, (byte)0x8E, (byte)0x86, -40, 34, 78, -35, (byte)0xD0, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0x7F}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0x7F}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0x7F}};
        h.g = new int[]{0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
        h.h = new int[]{0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
        h.i = new int[]{0x3FFFFFF, 0x1FFFFFF};
        h.j = new int[]{26, 25};
        h.k = new W9();  // 初始化器: Ljava/lang/Object;-><init>()V
        h.l = new X9();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static int A(T9 t90, byte[] arr_b, int v, int v1, int v2, b9 b90) {
        Object object0 = ((I9)t90).zze();
        int v3 = ((I9)t90).B(object0, arr_b, v, v1, v2, b90);
        ((I9)t90).zzf(object0);
        b90.c = object0;
        return v3;
    }

    public static zzacb B(int v, String s, zzdy zzdy0, boolean z, boolean z1) {
        int v1 = h.m(zzdy0);
        if(z1) {
            v1 = Math.min(1, v1);
        }
        if(v1 >= 0) {
            return z ? new zzacj(s, null, Integer.toString(v1)) : new zzabu("und", s, Integer.toString(v1));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + u.b(v));
        return null;
    }

    public static final String C(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(Character.isUpperCase(((char)v1))) {
                stringBuilder0.append("_");
            }
            stringBuilder0.append(Character.toLowerCase(((char)v1)));
        }
        return stringBuilder0.toString();
    }

    public static void D(byte b, byte b1, char[] arr_c, int v) {
        if(b < -62 || h.Y(b1)) {
            throw zzglc.b();
        }
        arr_c[v] = (char)((b & 0x1F) << 6 | b1 & 0x3F);
    }

    public abstract void E(W7 arg1, W7 arg2);

    public static boolean F(zzys zzys0) {
        zzdy zzdy0 = new zzdy(8);
        switch(g0.a(zzys0, zzdy0).a) {
            case 1380333108: 
            case 1380533830: {
                ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 4, false);
                zzdy0.zzF(0);
                int v = zzdy0.zze();
                if(v != 0x57415645) {
                    Log.e("WavHeaderReader", "Unsupported form type: " + v);
                    return false;
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean G(zzys zzys0, boolean z) {
        long v8;
        int v7;
        long v = zzys0.zzd();
        long v1 = 0x1000L;
        int v2 = Long.compare(v, -1L);
        if(v2 != 0 && v <= 0x1000L) {
            v1 = v;
        }
        int v3 = (int)v1;
        zzdy zzdy0 = new zzdy(0x40);
        int v4 = 0;
        boolean z1 = false;
        while(v4 < v3) {
            zzdy0.zzC(8);
            if(!zzys0.zzm(zzdy0.zzH(), 0, 8, true)) {
                break;
            }
            long v5 = zzdy0.zzs();
            int v6 = zzdy0.zze();
            if(v5 == 1L) {
                zzys0.zzh(zzdy0.zzH(), 8, 8);
                v7 = 16;
                zzdy0.zzE(16);
                v8 = zzdy0.zzr();
            }
            else {
                if(v5 == 0L) {
                    long v9 = zzys0.zzd();
                    if(v9 != -1L) {
                        v5 = v9 - zzys0.zze() + 8L;
                    }
                }
                v8 = v5;
                v7 = 8;
            }
            if(v8 < ((long)v7)) {
                return false;
            }
            v4 += v7;
            if(v6 == 0x6D6F6F76) {
                int v10 = v3 + ((int)v8);
                v3 = v2 != 0 && ((long)v10) > v ? ((int)v) : v10;
            }
            else {
                if(v6 == 0x6D6F6F66 || v6 == 0x6D766578) {
                    return z1 && z;
                }
                if(((long)v4) + v8 - ((long)v7) >= ((long)v3)) {
                    break;
                }
                int v11 = (int)(v8 - ((long)v7));
                v4 += v11;
                if(v6 == 0x66747970) {
                    if(v11 < 8) {
                        return false;
                    }
                    zzdy0.zzC(v11);
                    zzys0.zzh(zzdy0.zzH(), 0, v11);
                    int v12 = v11 >> 2;
                    int v13 = 0;
                    while(v13 < v12) {
                        if(v13 == 1) {
                            zzdy0.zzG(4);
                        }
                        else {
                            int v14 = zzdy0.zze();
                            if(v14 >>> 8 == 0x336770) {
                                goto label_65;
                            }
                            else {
                                if(v14 == 0x68656963) {
                                    v14 = 0x68656963;
                                }
                                int[] arr_v = h.e;
                                int v15 = 0;
                                while(v15 < 29) {
                                    if(arr_v[v15] == v14) {
                                        goto label_65;
                                    }
                                    ++v15;
                                }
                            }
                        }
                        ++v13;
                        continue;
                    label_65:
                        z1 = true;
                        break;
                    }
                    if(z1) {
                        continue;
                    }
                    return false;
                }
                if(v11 != 0) {
                    zzys0.zzg(v11);
                }
            }
        }
        return z1 && !z;
    }

    public static int H(int v) {
        switch(v - 2) {
            case 1: 
            case 2: {
                return 1;
            }
            case 3: {
                return 3;
            }
            default: {
                throw new GeneralSecurityException("unknown point format: " + Integer.toString(zzgdn.zza(v)));
            }
        }
    }

    public static int I(T9 t90, byte[] arr_b, int v, int v1, b9 b90) {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = h.g0(v3, arr_b, v2, b90);
            v3 = b90.a;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw zzglc.f();
        }
        Object object0 = t90.zze();
        int v4 = v3 + v2;
        t90.e(object0, arr_b, v2, v4, b90);
        t90.zzf(object0);
        b90.c = object0;
        return v4;
    }

    public static zzacj J(int v, String s, zzdy zzdy0) {
        int v1 = zzdy0.zze();
        if(zzdy0.zze() == 1684108385 && v1 >= 22) {
            zzdy0.zzG(10);
            int v2 = zzdy0.zzo();
            if(v2 > 0) {
                String s1 = v2;
                int v3 = zzdy0.zzo();
                if(v3 > 0) {
                    s1 = s1 + "/" + v3;
                }
                return new zzacj(s, null, s1);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + u.b(v));
        return null;
    }

    public static g0 K(int v, zzys zzys0, zzdy zzdy0) {
        g0 g00 = g0.a(zzys0, zzdy0);
        int v1;
        while((v1 = g00.a) != v) {
            f.p(v1, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long v2 = g00.b + 8L;
            if(v2 > 0x7FFFFFFFL) {
                throw zzbp.zzc(("Chunk is too large (~2GB+) to skip; id: " + v1));
            }
            ((zzyl)zzys0).zzo(((int)v2), false);
            g00 = g0.a(zzys0, zzdy0);
        }
        return g00;
    }

    public static Object L(int v) {
        if(v < 2 || v > 0x40000000 || Integer.highestOneBit(v) != v) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + v);
        }
        if(v <= 0x100) {
            return new byte[v];
        }
        return v <= 0x10000 ? new short[v] : new int[v];
    }

    public abstract void M(W7 arg1, Thread arg2);

    public static void N(zzgkq zzgkq0, StringBuilder stringBuilder0, int v) {
        boolean z;
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        TreeSet treeSet0 = new TreeSet();
        Method[] arr_method = zzgkq0.getClass().getDeclaredMethods();
        for(int v2 = 0; v2 < arr_method.length; ++v2) {
            Method method0 = arr_method[v2];
            hashMap1.put(method0.getName(), method0);
            if(method0.getParameterTypes().length == 0) {
                hashMap0.put(method0.getName(), method0);
                if(method0.getName().startsWith("get")) {
                    treeSet0.add(method0.getName());
                }
            }
        }
        for(Object object0: treeSet0) {
            String s = (String)object0;
            String s1 = s.startsWith("get") ? s.substring(3) : s;
            if(s1.endsWith("List") && !s1.endsWith("OrBuilderList") && !s1.equals("List")) {
                String s2 = s1.substring(0, 1).toLowerCase() + s1.substring(1, s1.length() - 4);
                Method method1 = (Method)hashMap0.get(s);
                if(method1 != null && method1.getReturnType().equals(List.class)) {
                    h.v(stringBuilder0, v, h.C(s2), zzgkq.h(method1, zzgkq0, new Object[0]));
                    continue;
                }
            }
            if(s1.endsWith("Map") && !s1.equals("Map")) {
                String s3 = s1.substring(0, 1).toLowerCase() + s1.substring(1, s1.length() - 3);
                Method method2 = (Method)hashMap0.get(s);
                if(method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                    h.v(stringBuilder0, v, h.C(s3), zzgkq.h(method2, zzgkq0, new Object[0]));
                    continue;
                }
            }
            if(((Method)hashMap1.get("set" + s1)) != null && (!s1.endsWith("Bytes") || !hashMap0.containsKey("get" + s1.substring(0, s1.length() - 5)))) {
                String s4 = s1.substring(0, 1).toLowerCase() + s1.substring(1);
                Method method3 = (Method)hashMap0.get("get" + s1);
                Method method4 = (Method)hashMap0.get("has" + s1);
                if(method3 != null) {
                    Object object1 = zzgkq.h(method3, zzgkq0, new Object[0]);
                    if(method4 == null) {
                        if(object1 instanceof Boolean) {
                            if(!((Boolean)object1).booleanValue()) {
                                continue;
                            }
                            goto label_64;
                        }
                        else if(object1 instanceof Integer) {
                            if(((int)(((Integer)object1))) == 0) {
                                continue;
                            }
                            goto label_64;
                        }
                        else if(object1 instanceof Float) {
                            if(Float.floatToRawIntBits(((float)(((Float)object1)))) == 0) {
                                continue;
                            }
                            goto label_64;
                        }
                        else if(object1 instanceof Double) {
                            if(Double.doubleToRawLongBits(((double)(((Double)object1)))) == 0L) {
                                continue;
                            }
                            goto label_64;
                        }
                        else if(object1 instanceof String) {
                            z = object1.equals("");
                            goto label_56;
                        }
                        else {
                            if(object1 instanceof zzgji) {
                                z = object1.equals(zzgji.zzb);
                            label_56:
                                if(z) {
                                    continue;
                                }
                            }
                            else if(object1 instanceof zzgma) {
                                if(object1 == ((zzgma)object1).zzbh()) {
                                    continue;
                                }
                            }
                            else if(object1 instanceof Enum && ((Enum)object1).ordinal() == 0) {
                                continue;
                            }
                            goto label_64;
                        }
                        goto label_63;
                    }
                    else {
                    label_63:
                        if(((Boolean)zzgkq.h(method4, zzgkq0, new Object[0])).booleanValue()) {
                            goto label_64;
                        }
                        continue;
                    }
                label_64:
                    h.v(stringBuilder0, v, h.C(s4), object1);
                }
            }
        }
        if(!(zzgkq0 instanceof zzgkn)) {
            zzgnl zzgnl0 = zzgkq0.zzc;
            if(zzgnl0 != null) {
                for(int v1 = 0; v1 < zzgnl0.a; ++v1) {
                    h.v(stringBuilder0, v, String.valueOf(zzgnl0.b[v1] >>> 3), zzgnl0.c[v1]);
                }
            }
            return;
        }
        zzgkn zzgkn0 = (zzgkn)zzgkq0;
        throw null;
    }

    public static void O(long[] arr_v) {
        arr_v[10] = 0L;
        int v = 0;
        while(v < 10) {
            long v1 = arr_v[v];
            arr_v[v] = v1 - (v1 / 0x4000000L << 26);
            long v2 = arr_v[v + 1] + v1 / 0x4000000L;
            arr_v[v + 1] = v2;
            arr_v[v + 1] = v2 - (v2 / 0x2000000L << 25);
            v += 2;
            arr_v[v] += v2 / 0x2000000L;
        }
        long v3 = arr_v[0];
        long v4 = arr_v[10];
        long v5 = v3 + (v4 << 4);
        arr_v[0] = v5;
        long v6 = v4 + v4 + v5;
        arr_v[0] = v6;
        long v7 = v6 + v4;
        arr_v[0] = v7;
        arr_v[10] = 0L;
        arr_v[0] = v7 - (v7 / 0x4000000L << 26);
        arr_v[1] += v7 / 0x4000000L;
    }

    public static int P(T9 t90, int v, byte[] arr_b, int v1, int v2, zzgkz zzgkz0, b9 b90) {
        int v3 = h.I(t90, arr_b, v1, v2, b90);
        zzgkz0.add(b90.c);
        while(v3 < v2) {
            int v4 = h.e0(arr_b, v3, b90);
            if(v != b90.a) {
                break;
            }
            v3 = h.I(t90, arr_b, v4, v2, b90);
            zzgkz0.add(b90.c);
        }
        return v3;
    }

    public static zzacj Q(int v, String s, zzdy zzdy0) {
        int v1 = zzdy0.zze();
        if(zzdy0.zze() == 1684108385) {
            zzdy0.zzG(8);
            return new zzacj(s, null, zzdy0.zzw(v1 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + u.b(v));
        return null;
    }

    public static void R(int v, int v1, Object object0) {
        if(object0 instanceof byte[]) {
            ((byte[])object0)[v] = (byte)v1;
            return;
        }
        if(object0 instanceof short[]) {
            ((short[])object0)[v] = (short)v1;
            return;
        }
        ((int[])object0)[v] = v1;
    }

    public static void S(long[] arr_v) {
        long v = arr_v[8];
        long v1 = arr_v[18];
        long v2 = v + (v1 << 4);
        arr_v[8] = v2;
        long v3 = v1 + v1 + v2;
        arr_v[8] = v3;
        arr_v[8] = v3 + v1;
        long v4 = arr_v[7];
        long v5 = arr_v[17];
        long v6 = v4 + (v5 << 4);
        arr_v[7] = v6;
        long v7 = v5 + v5 + v6;
        arr_v[7] = v7;
        arr_v[7] = v7 + v5;
        long v8 = arr_v[6];
        long v9 = arr_v[16];
        long v10 = v8 + (v9 << 4);
        arr_v[6] = v10;
        long v11 = v9 + v9 + v10;
        arr_v[6] = v11;
        arr_v[6] = v11 + v9;
        long v12 = arr_v[5];
        long v13 = arr_v[15];
        long v14 = v12 + (v13 << 4);
        arr_v[5] = v14;
        long v15 = v13 + v13 + v14;
        arr_v[5] = v15;
        arr_v[5] = v15 + v13;
        long v16 = arr_v[4];
        long v17 = arr_v[14];
        long v18 = v16 + (v17 << 4);
        arr_v[4] = v18;
        long v19 = v17 + v17 + v18;
        arr_v[4] = v19;
        arr_v[4] = v19 + v17;
        long v20 = arr_v[3];
        long v21 = arr_v[13];
        long v22 = v20 + (v21 << 4);
        arr_v[3] = v22;
        long v23 = v21 + v21 + v22;
        arr_v[3] = v23;
        arr_v[3] = v23 + v21;
        long v24 = arr_v[2];
        long v25 = arr_v[12];
        long v26 = v24 + (v25 << 4);
        arr_v[2] = v26;
        long v27 = v25 + v25 + v26;
        arr_v[2] = v27;
        arr_v[2] = v27 + v25;
        long v28 = arr_v[1];
        long v29 = arr_v[11];
        long v30 = v28 + (v29 << 4);
        arr_v[1] = v30;
        long v31 = v29 + v29 + v30;
        arr_v[1] = v31;
        arr_v[1] = v31 + v29;
        long v32 = arr_v[0];
        long v33 = arr_v[10];
        long v34 = v32 + (v33 << 4);
        arr_v[0] = v34;
        long v35 = v33 + v33 + v34;
        arr_v[0] = v35;
        arr_v[0] = v35 + v33;
    }

    public abstract boolean T(zzftt arg1, O7 arg2, O7 arg3);

    public static int U(byte[] arr_b, int v, zzgkz zzgkz0, b9 b90) {
        int v1 = h.e0(arr_b, v, b90);
        int v2 = b90.a + v1;
        while(v1 < v2) {
            v1 = h.e0(arr_b, v1, b90);
            ((x9)zzgkz0).zzh(b90.a);
        }
        if(v1 != v2) {
            throw zzglc.f();
        }
        return v1;
    }

    public abstract boolean V(zzftt arg1, Object arg2, Object arg3);

    public static int W(byte[] arr_b, int v, b9 b90) {
        int v1 = h.e0(arr_b, v, b90);
        int v2 = b90.a;
        if(v2 < 0) {
            throw zzglc.d();
        }
        if(v2 == 0) {
            b90.c = "";
            return v1;
        }
        b90.c = new String(arr_b, v1, v2, zzgla.a);
        return v1 + v2;
    }

    public static void X(long[] arr_v, long[] arr_v1) {
        long v = arr_v1[0];
        long v1 = arr_v1[1];
        long v2 = arr_v1[2];
        long v3 = v * v2 + v1 * v1;
        long v4 = arr_v1[3];
        long v5 = v * v4 + v1 * v2;
        long v6 = arr_v1[4];
        long v7 = arr_v1[5];
        long v8 = v * v7 + (v1 * v6 + v2 * v4);
        long v9 = arr_v1[6];
        long v10 = (v1 + v1) * v7 + (v * v9 + (v2 * v6 + v4 * v4));
        long v11 = arr_v1[7];
        long v12 = v * v11 + (v1 * v9 + (v2 * v7 + v4 * v6));
        long v13 = arr_v1[8];
        long v14 = v4 * v7 + v1 * v11;
        long v15 = v14 + v14 + (v * v13 + v2 * v9);
        long v16 = arr_v1[9];
        long v17 = v * v16 + (v1 * v13 + (v2 * v11 + (v4 * v9 + v6 * v7)));
        long v18 = v1 * v16 + v4 * v11;
        long v19 = v18 + v18 + (v2 * v13 + (v6 * v9 + v7 * v7));
        long v20 = v2 * v16 + (v4 * v13 + (v6 * v11 + v7 * v9));
        long v21 = v4 * v16 + v7 * v11;
        long v22 = v21 + v21 + v6 * v13;
        long v23 = v6 * v16 + (v7 * v13 + v9 * v11);
        long v24 = (v7 + v7) * v16 + (v9 * v13 + v11 * v11);
        long v25 = v9 * v16 + v11 * v13;
        long[] arr_v2 = {v * v, (v + v) * v1, v3 + v3, v5 + v5, (v + v) * v6 + (v1 * 4L * v4 + v2 * v2), v8 + v8, v10 + v10, v12 + v12, v15 + v15 + v6 * v6, v17 + v17, v19 + v19, v20 + v20, v22 + v22 + v9 * v9, v23 + v23, v24 + v24, v25 + v25, v11 * 4L * v16 + v13 * v13, (v13 + v13) * v16, (v16 + v16) * v16};
        h.S(arr_v2);
        h.O(arr_v2);
        System.arraycopy(arr_v2, 0, arr_v, 0, 10);
    }

    public static boolean Y(byte b) {
        return b > -65;
    }

    public abstract boolean Z(zzftt arg1, W7 arg2, W7 arg3);

    public static int a(int v) [...] // Potential decryptor

    public static int a0(byte[] arr_b, int v, b9 b90) {
        int v1 = h.e0(arr_b, v, b90);
        int v2 = b90.a;
        if(v2 < 0) {
            throw zzglc.d();
        }
        if(v2 == 0) {
            b90.c = "";
            return v1;
        }
        ka.a.getClass();
        b90.c = S.g(arr_b, v1, v2);
        return v1 + v2;
    }

    public abstract int b(b8 arg1);

    public static void b0(long[] arr_v, long[] arr_v1, long[] arr_v2) {
        for(int v = 0; v < 10; ++v) {
            arr_v[v] = arr_v1[v] - arr_v2[v];
        }
    }

    public static int c(byte[] arr_b, int v, b9 b90) {
        int v1 = h.e0(arr_b, v, b90);
        int v2 = b90.a;
        if(v2 < 0) {
            throw zzglc.d();
        }
        if(v2 > arr_b.length - v1) {
            throw zzglc.f();
        }
        if(v2 == 0) {
            b90.c = zzgji.zzb;
            return v1;
        }
        b90.c = zzgji.zzw(arr_b, v1, v2);
        return v1 + v2;
    }

    public static int c0(int v, byte[] arr_b, int v1, int v2, zzgnl zzgnl0, b9 b90) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = h.i0(arr_b, v1, b90);
                    zzgnl0.b(v, b90.b);
                    return v3;
                }
                case 1: {
                    zzgnl0.b(v, h.j0(v1, arr_b));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = h.e0(arr_b, v1, b90);
                    int v5 = b90.a;
                    if(v5 < 0) {
                        throw zzglc.d();
                    }
                    if(v5 > arr_b.length - v4) {
                        throw zzglc.f();
                    }
                    if(v5 == 0) {
                        zzgnl0.b(v, zzgji.zzb);
                        return v4;
                    }
                    zzgnl0.b(v, zzgji.zzw(arr_b, v4, v5));
                    return v4 + v5;
                }
                case 3: {
                    int v6 = v & -8 | 4;
                    zzgnl zzgnl1 = zzgnl.a();
                    int v7 = 0;
                    while(v1 < v2) {
                        int v8 = h.e0(arr_b, v1, b90);
                        int v9 = b90.a;
                        if(v9 == v6) {
                            v7 = v9;
                            v1 = v8;
                            break;
                        }
                        v7 = v9;
                        v1 = h.c0(v9, arr_b, v8, v2, zzgnl1, b90);
                    }
                    if(v1 > v2 || v7 != v6) {
                        throw zzglc.e();
                    }
                    zzgnl0.b(v, zzgnl1);
                    return v1;
                }
                case 5: {
                    zzgnl0.b(v, h.p(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw new zzglc("Protocol message contained an invalid tag (zero).");
                }
            }
        }
        throw new zzglc("Protocol message contained an invalid tag (zero).");
    }

    public abstract O7 d(zzftt arg1);

    public static void d0(long[] arr_v, long[] arr_v1, long[] arr_v2) {
        for(int v = 0; v < 10; ++v) {
            arr_v[v] = arr_v1[v] + arr_v2[v];
        }
    }

    public static R8 e(zzgfa zzgfa0) {
        switch(zzgfa0.zze()) {
            case 3: {
                return new m(16);
            }
            case 4: {
                return new m(0x20);
            }
            case 5: {
                return new S(23);
            }
            default: {
                throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
            }
        }
    }

    public static int e0(byte[] arr_b, int v, b9 b90) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            b90.a = v1;
            return v + 1;
        }
        return h.g0(v1, arr_b, v + 1, b90);
    }

    public static String f(zzgji zzgji0) {
        StringBuilder stringBuilder0 = new StringBuilder(zzgji0.zzd());
        for(int v = 0; v < zzgji0.zzd(); ++v) {
            int v1 = zzgji0.zza(v);
            switch(v1) {
                case 7: {
                    stringBuilder0.append("\\a");
                    break;
                }
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 11: {
                    stringBuilder0.append("\\v");
                    break;
                }
                case 12: {
                    stringBuilder0.append("\\f");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 39: {
                    stringBuilder0.append("\\\'");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    if(v1 < 0x20 || v1 > 0x7E) {
                        stringBuilder0.append('\\');
                        stringBuilder0.append(((char)((v1 >>> 6 & 3) + 0x30)));
                        stringBuilder0.append(((char)((v1 >>> 3 & 7) + 0x30)));
                        stringBuilder0.append(((char)((v1 & 7) + 0x30)));
                    }
                    else {
                        stringBuilder0.append(((char)v1));
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public static byte[] f0(long[] arr_v) {
        int[] arr_v3;
        int[] arr_v2;
        long[] arr_v1 = Arrays.copyOf(arr_v, 10);
        for(int v1 = 0; true; ++v1) {
            arr_v2 = h.j;
            if(v1 >= 2) {
                break;
            }
            int v3 = 0;
            while(v3 < 9) {
                long v4 = arr_v1[v3];
                int v5 = arr_v2[v3 & 1];
                int v6 = -((int)((v4 >> 0x1F & v4) >> v5));
                arr_v1[v3] = v4 + ((long)(v6 << v5));
                ++v3;
                arr_v1[v3] -= (long)v6;
            }
            int v7 = -((int)((arr_v1[9] >> 0x1F & arr_v1[9]) >> 25));
            arr_v1[9] += (long)(v7 << 25);
            arr_v1[0] -= (long)(v7 * 19);
        }
        int v8 = -((int)((arr_v1[0] >> 0x1F & arr_v1[0]) >> 26));
        arr_v1[0] += (long)(v8 << 26);
        arr_v1[1] -= (long)v8;
        for(int v9 = 0; true; ++v9) {
            arr_v3 = h.i;
            if(v9 >= 2) {
                break;
            }
            int v10 = 0;
            while(v10 < 9) {
                long v11 = arr_v1[v10];
                int v12 = arr_v2[v10 & 1];
                arr_v1[v10] = ((long)arr_v3[v10 & 1]) & v11;
                ++v10;
                arr_v1[v10] += (long)(((int)(v11 >> v12)));
            }
        }
        long v13 = arr_v1[9];
        arr_v1[9] = 0x1FFFFFFL & v13;
        long v14 = arr_v1[0] + ((long)(((int)(v13 >> 25)) * 19));
        arr_v1[0] = v14;
        int v15 = ~(((int)v14) - 0x3FFFFED >> 0x1F);
        for(int v16 = 1; v16 < 10; ++v16) {
            int v17 = ~(((int)arr_v1[v16]) ^ arr_v3[v16 & 1]);
            v15 = 0;
        }
        arr_v1[0] -= (long)(0x3FFFFED & v15);
        arr_v1[1] -= (long)(0x1FFFFFF & v15);
        for(int v2 = 2; v2 < 10; v2 += 2) {
            arr_v1[v2] -= (long)(0x3FFFFFF & v15);
            arr_v1[v2 + 1] -= (long)(0x1FFFFFF & v15);
        }
        for(int v18 = 0; v18 < 10; ++v18) {
            arr_v1[v18] <<= h.h[v18];
        }
        byte[] arr_b = new byte[0x20];
        for(int v = 0; v < 10; ++v) {
            int v19 = h.g[v];
            int v20 = arr_b[v19];
            long v21 = arr_v1[v];
            arr_b[v19] = (byte)(((int)(((long)v20) | v21 & 0xFFL)));
            arr_b[v19 + 1] = (byte)(((int)(((long)arr_b[v19 + 1]) | v21 >> 8 & 0xFFL)));
            arr_b[v19 + 2] = (byte)(((int)(((long)arr_b[v19 + 2]) | v21 >> 16 & 0xFFL)));
            arr_b[v19 + 3] = (byte)(((int)(v21 >> 24 & 0xFFL | ((long)arr_b[v19 + 3]))));
        }
        return arr_b;
    }

    public static void g(byte b, byte b1, byte b2, byte b3, char[] arr_c, int v) {
        if(h.Y(b1) || b1 + 0x70 + (b << 28) >> 30 != 0 || h.Y(b2) || h.Y(b3)) {
            throw zzglc.b();
        }
        int v1 = (b & 7) << 18 | (b1 & 0x3F) << 12 | (b2 & 0x3F) << 6 | b3 & 0x3F;
        arr_c[v] = (char)((v1 >>> 10) + 0xD7C0);
        arr_c[v + 1] = (char)((v1 & 0x3FF) + 0xDC00);
    }

    public static int g0(int v, byte[] arr_b, int v1, b9 b90) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            b90.a = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            b90.a = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            b90.a = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            b90.a = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        b90.a = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    public static void h(int v, String s) {
        if(v < 0) {
            throw new IllegalArgumentException(s + " cannot be negative but was: " + v);
        }
    }

    public static int h0(int v, byte[] arr_b, int v1, int v2, zzgkz zzgkz0, b9 b90) {
        int v3 = h.e0(arr_b, v1, b90);
        ((x9)zzgkz0).zzh(b90.a);
        while(v3 < v2) {
            int v4 = h.e0(arr_b, v3, b90);
            if(v != b90.a) {
                break;
            }
            v3 = h.e0(arr_b, v4, b90);
            ((x9)zzgkz0).zzh(b90.a);
        }
        return v3;
    }

    // 去混淆评级： 低(24)
    public static void i(zzapc zzapc0) {
        byte[] arr_b;
        if(h.m != null) {
            return;
        }
        String s = (String)zzay.zzc().zzb(zzbhz.zzct);
        if(s != null && s.length() != 0) {
            arr_b = zzamn.zzb(s, true);
            try {
            label_12:
                zzfwt zzfwt0 = zzfwy.zza(arr_b);
                Iterator iterator0 = zzfzr.zza.zzd().iterator();
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    zzgfr zzgfr0 = (zzgfr)object0;
                    throw new GeneralSecurityException("Missing type_url.");
                }
                h.m = zzfzu.zza(zzfwt0);
            }
            catch(GeneralSecurityException unused_ex) {
            }
        }
        else {
            if(zzapc0 != null) {
                Method method0 = zzapc0.zzj("B6686OwUhvg9sC2Ywr/ef2K7k4+w2mnrIbLdBdrqQ7su4WMxR3/prcgS0L+6eNyY", "1l/ngTeh7Ob+HSjt2mKdxpX2SEfG+yjkE9qsfrYWj1c=");
                if(method0 != null) {
                    s = (String)method0.invoke(null, null);
                }
            }
            if(s != null) {
                try {
                    arr_b = zzamn.zzb(s, true);
                    goto label_12;
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
        }
    }

    public static int i0(byte[] arr_b, int v, b9 b90) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            b90.b = v1;
            return v + 1;
        }
        int v2 = v + 2;
        int v3 = arr_b[v + 1];
        long v4 = v1 & 0x7FL | ((long)(v3 & 0x7F)) << 7;
        int v5 = 7;
        while(v3 < 0) {
            int v6 = arr_b[v2];
            v5 += 7;
            v4 |= ((long)(v6 & 0x7F)) << v5;
            v3 = v6;
            ++v2;
        }
        b90.b = v4;
        return v2;
    }

    public static void j(zzgdw zzgdw0) {
        zzghq.zze(h.y(zzgdw0.zzf().zzg()));
        h.s(zzgdw0.zzf().zzh());
        if(zzgdw0.zzi() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzfxk.zzc(zzgdw0.zza().zze());
    }

    public static long j0(int v, byte[] arr_b) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }

    public static void k(long[] arr_v, long[] arr_v1, int v) {
        for(int v1 = 0; v1 < 10; ++v1) {
            int v2 = (int)arr_v[v1];
            int v3 = (((int)arr_v1[v1]) ^ v2) & -v;
            arr_v[v1] = (long)(v2 ^ v3);
            arr_v1[v1] = (long)(v3 ^ ((int)arr_v1[v1]));
        }
    }

    public static void l(long[] arr_v, long[] arr_v1, long[] arr_v2) {
        long[] arr_v3 = new long[19];
        h.w(arr_v3, arr_v1, arr_v2);
        h.S(arr_v3);
        h.O(arr_v3);
        System.arraycopy(arr_v3, 0, arr_v, 0, 10);
    }

    public static int m(zzdy zzdy0) {
        zzdy0.zzG(4);
        if(zzdy0.zze() == 1684108385) {
            zzdy0.zzG(8);
            return zzdy0.zzk();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    // 去混淆评级： 低(30)
    public static int n(Object object0) {
        return object0 == null ? 0 : h.a(object0.hashCode());
    }

    public static int o(Object object0, Object object1, int v, Object object2, int[] arr_v, Object[] arr_object, Object[] arr_object1) {
        int v1 = h.n(object0);
        int v2 = v1 & v;
        int v3 = h.z(v2, object2);
        if(v3 != 0) {
            int v4 = -1;
            while(true) {
                int v5 = arr_v[v3 - 1];
                if((v5 & ~v) == (v1 & ~v) && zzfoq.zza(object0, arr_object[v3 - 1]) && (arr_object1 == null || zzfoq.zza(object1, arr_object1[v3 - 1]))) {
                    int v6 = v5 & v;
                    if(v4 == -1) {
                        h.R(v2, v6, object2);
                        return v3 - 1;
                    }
                    arr_v[v4] = v6 & v | arr_v[v4] & ~v;
                    return v3 - 1;
                }
                int v7 = v5 & v;
                if(v7 == 0) {
                    break;
                }
                v4 = v3 - 1;
                v3 = v7;
            }
        }
        return -1;
    }

    public static int p(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    public static zzfrj q(XmlPullParser xmlPullParser0, String s, String s1) {
        zzfrg zzfrg0 = zzfrj.zzi();
        do {
            xmlPullParser0.next();
            if(zzeh.zzc(xmlPullParser0, s + ":Item")) {
                String s2 = zzeh.zza(xmlPullParser0, s1 + ":Mime");
                String s3 = zzeh.zza(xmlPullParser0, s1 + ":Semantic");
                String s4 = zzeh.zza(xmlPullParser0, s1 + ":Length");
                String s5 = zzeh.zza(xmlPullParser0, s1 + ":Padding");
                if(s2 != null && s3 != null) {
                    zzfrg0.zze(new zzaav(s2, s3, (s4 == null ? 0L : Long.parseLong(s4)), (s5 == null ? 0L : Long.parseLong(s5))));
                    continue;
                }
                return zzfrj.zzo();
            }
        }
        while(!zzeh.zzb(xmlPullParser0, s + ":Directory"));
        return zzfrg0.zzg();
    }

    public abstract W7 r(zzftt arg1);

    public static String s(int v) {
        switch(v - 2) {
            case 1: {
                return "HmacSha1";
            }
            case 2: {
                return "HmacSha384";
            }
            case 3: {
                return "HmacSha256";
            }
            case 4: {
                return "HmacSha512";
            }
            case 5: {
                return "HmacSha224";
            }
            default: {
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + Integer.toString(zzgej.zza(v)));
            }
        }
    }

    public static void t(byte b, byte b1, byte b2, char[] arr_c, int v) {
        if(!h.Y(b1)) {
            if(b != 0xFFFFFFE0) {
            label_4:
                if(b != -19) {
                label_7:
                    if(!h.Y(b2)) {
                        arr_c[v] = (char)((b & 15) << 12 | (b1 & 0x3F) << 6 | b2 & 0x3F);
                        return;
                    }
                }
                else if(b1 < 0xFFFFFFA0) {
                    b = -19;
                    goto label_7;
                }
            }
            else if(b1 >= 0xFFFFFFA0) {
                b = (byte)0xE0;
                goto label_4;
            }
        }
        throw zzglc.b();
    }

    public abstract void u(b8 arg1, Set arg2);

    public static final void v(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 instanceof List) {
            for(Object object1: ((List)object0)) {
                h.v(stringBuilder0, v, s, object1);
            }
            return;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                h.v(stringBuilder0, v, s, ((Map.Entry)object2));
            }
            return;
        }
        stringBuilder0.append('\n');
        for(int v2 = 0; v2 < v; ++v2) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append(s);
        if(object0 instanceof String) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(h.f(zzgji.zzx(((String)object0))));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof zzgji) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(h.f(((zzgji)object0)));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof zzgkq) {
            stringBuilder0.append(" {");
            h.N(((zzgkq)object0), stringBuilder0, v + 2);
            stringBuilder0.append("\n");
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append("}");
            return;
        }
        if(object0 instanceof Map.Entry) {
            stringBuilder0.append(" {");
            h.v(stringBuilder0, v + 2, "key", ((Map.Entry)object0).getKey());
            h.v(stringBuilder0, v + 2, "value", ((Map.Entry)object0).getValue());
            stringBuilder0.append("\n");
            while(v1 < v) {
                stringBuilder0.append(' ');
                ++v1;
            }
            stringBuilder0.append("}");
            return;
        }
        stringBuilder0.append(": ");
        stringBuilder0.append(object0);
    }

    public static void w(long[] arr_v, long[] arr_v1, long[] arr_v2) {
        arr_v[0] = arr_v1[0] * arr_v2[0];
        long v = arr_v1[0];
        long v1 = arr_v2[1] * v;
        long v2 = arr_v1[1];
        long v3 = arr_v2[0];
        arr_v[1] = v2 * v3 + v1;
        long v4 = arr_v1[1];
        long v5 = arr_v2[1];
        arr_v[2] = arr_v1[2] * v3 + (arr_v2[2] * v + (v4 + v4) * v5);
        long v6 = arr_v2[2];
        long v7 = arr_v1[2];
        arr_v[3] = arr_v1[3] * v3 + (arr_v2[3] * v + (v7 * v5 + v4 * v6));
        long v8 = arr_v2[3];
        long v9 = arr_v1[3];
        long v10 = v9 * v5 + v4 * v8;
        arr_v[4] = arr_v1[4] * v3 + (arr_v2[4] * v + (v10 + v10 + v7 * v6));
        long v11 = arr_v2[4];
        long v12 = arr_v1[4];
        arr_v[5] = arr_v1[5] * v3 + (arr_v2[5] * v + (v12 * v5 + (v4 * v11 + (v9 * v6 + v7 * v8))));
        long v13 = arr_v2[5];
        long v14 = arr_v1[5];
        long v15 = v14 * v5 + (v4 * v13 + v9 * v8);
        arr_v[6] = arr_v1[6] * v3 + (arr_v2[6] * v + (v12 * v6 + (v7 * v11 + (v15 + v15))));
        long v16 = arr_v2[6];
        long v17 = arr_v1[6];
        arr_v[7] = arr_v1[7] * v3 + (arr_v2[7] * v + (v17 * v5 + (v4 * v16 + (v14 * v6 + (v7 * v13 + (v12 * v8 + v9 * v11))))));
        long v18 = arr_v2[7];
        long v19 = arr_v1[7];
        long v20 = v19 * v5 + (v4 * v18 + (v14 * v8 + v9 * v13));
        arr_v[8] = arr_v1[8] * v3 + (arr_v2[8] * v + (v17 * v6 + (v7 * v16 + (v20 + v20 + v12 * v11))));
        long v21 = arr_v2[8];
        long v22 = arr_v1[8];
        arr_v[9] = arr_v1[9] * v3 + (v * arr_v2[9] + (v22 * v5 + (v4 * v21 + (v19 * v6 + (v7 * v18 + (v17 * v8 + (v9 * v16 + (v14 * v11 + v12 * v13))))))));
        long v23 = arr_v2[9];
        long v24 = arr_v1[9];
        long v25 = v5 * v24 + (v4 * v23 + (v19 * v8 + (v9 * v18 + v14 * v13)));
        arr_v[10] = v22 * v6 + (v7 * v21 + (v17 * v11 + (v12 * v16 + (v25 + v25))));
        arr_v[11] = v6 * v24 + (v7 * v23 + (v22 * v8 + (v9 * v21 + (v19 * v11 + (v12 * v18 + (v17 * v13 + v14 * v16))))));
        long v26 = v8 * v24 + (v9 * v23 + (v19 * v13 + v14 * v18));
        arr_v[12] = v22 * v11 + (v12 * v21 + (v26 + v26 + v17 * v16));
        arr_v[13] = v11 * v24 + (v12 * v23 + (v22 * v13 + (v14 * v21 + (v19 * v16 + v17 * v18))));
        long v27 = v13 * v24 + (v14 * v23 + v19 * v18);
        arr_v[14] = v22 * v16 + (v17 * v21 + (v27 + v27));
        arr_v[15] = v16 * v24 + (v17 * v23 + (v22 * v18 + v19 * v21));
        long v28 = v18 * v24 + v19 * v23;
        arr_v[16] = v28 + v28 + v22 * v21;
        arr_v[17] = v21 * v24 + v22 * v23;
        arr_v[18] = (v24 + v24) * v23;
    }

    public static byte[] x(byte[] arr_b) {
        if(arr_b.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] arr_b1 = new byte[16];
        for(int v = 0; v < 16; ++v) {
            int v1 = arr_b[v];
            byte b = (byte)(v1 + v1 & 0xFE);
            arr_b1[v] = b;
            if(v < 15) {
                arr_b1[v] = (byte)(arr_b[v + 1] >> 7 & 1 | b);
            }
        }
        arr_b1[15] = (byte)(((byte)(arr_b[0] >> 7 & 0x87)) ^ arr_b1[15]);
        return arr_b1;
    }

    public static int y(int v) {
        switch(v - 2) {
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            default: {
                throw new GeneralSecurityException("unknown curve type: " + Integer.toString(zzgeh.zza(v)));
            }
        }
    }

    public static int z(int v, Object object0) {
        if(object0 instanceof byte[]) {
            return ((byte[])object0)[v] & 0xFF;
        }
        return object0 instanceof short[] ? ((char)((short[])object0)[v]) : ((int[])object0)[v];
    }
}

