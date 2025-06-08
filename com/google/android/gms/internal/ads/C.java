package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public final class c extends d {
    public long j;
    public long[] k;
    public long[] l;

    public static Serializable a(int v, zzdy zzdy0) {
        if(v != 0) {
            boolean z = true;
            if(v != 1) {
                switch(v) {
                    case 2: {
                        return c.b(zzdy0);
                    }
                    case 3: {
                        Serializable serializable3 = new HashMap();
                        while(true) {
                            String s = c.b(zzdy0);
                            int v3 = zzdy0.zzk();
                            if(v3 == 9) {
                                break;
                            }
                            Serializable serializable4 = c.a(v3, zzdy0);
                            if(serializable4 != null) {
                                ((HashMap)serializable3).put(s, serializable4);
                            }
                        }
                        return serializable3;
                    }
                    case 8: {
                        return c.c(zzdy0);
                    }
                    case 10: {
                        int v2 = zzdy0.zzn();
                        Serializable serializable1 = new ArrayList(v2);
                        for(int v1 = 0; v1 < v2; ++v1) {
                            Serializable serializable2 = c.a(zzdy0.zzk(), zzdy0);
                            if(serializable2 != null) {
                                ((ArrayList)serializable1).add(serializable2);
                            }
                        }
                        return serializable1;
                    }
                    case 11: {
                        Serializable serializable0 = new Date(((long)Double.longBitsToDouble(zzdy0.zzr())));
                        zzdy0.zzG(2);
                        return serializable0;
                    }
                    default: {
                        return null;
                    }
                }
            }
            if(zzdy0.zzk() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Double.longBitsToDouble(zzdy0.zzr());
    }

    public static String b(zzdy zzdy0) {
        int v = zzdy0.zzo();
        zzdy0.zzG(v);
        return new String(zzdy0.zzH(), zzdy0.zzc(), v);
    }

    public static HashMap c(zzdy zzdy0) {
        int v = zzdy0.zzn();
        HashMap hashMap0 = new HashMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            String s = c.b(zzdy0);
            Serializable serializable0 = c.a(zzdy0.zzk(), zzdy0);
            if(serializable0 != null) {
                hashMap0.put(s, serializable0);
            }
        }
        return hashMap0;
    }
}

