package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class zzajx implements zzail {
    public final LinkedHashMap a;
    public long b;
    public final zzajw c;
    public final int d;

    public zzajx(zzajw zzajw0, int v) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = zzajw0;
        this.d = 0x500000;
    }

    public zzajx(File file0, int v) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = new E9(file0, 4);
        this.d = 0x1400000;
    }

    public static int a(u0 u00) {
        int v = zzajx.h(u00);
        int v1 = zzajx.h(u00);
        int v2 = zzajx.h(u00);
        return zzajx.h(u00) << 24 | (v | v1 << 8 | v2 << 16);
    }

    public static long b(u0 u00) {
        return ((long)zzajx.h(u00)) & 0xFFL | (((long)zzajx.h(u00)) & 0xFFL) << 8 | (((long)zzajx.h(u00)) & 0xFFL) << 16 | (((long)zzajx.h(u00)) & 0xFFL) << 24 | (((long)zzajx.h(u00)) & 0xFFL) << 0x20 | (((long)zzajx.h(u00)) & 0xFFL) << 40 | (((long)zzajx.h(u00)) & 0xFFL) << 0x30 | (0xFFL & ((long)zzajx.h(u00))) << 56;
    }

    public static String c(u0 u00) {
        return new String(zzajx.g(u00, zzajx.b(u00)), "UTF-8");
    }

    public static void d(BufferedOutputStream bufferedOutputStream0, int v) {
        bufferedOutputStream0.write(v & 0xFF);
        bufferedOutputStream0.write(v >> 8 & 0xFF);
        bufferedOutputStream0.write(v >> 16 & 0xFF);
        bufferedOutputStream0.write(v >> 24 & 0xFF);
    }

    public static void e(BufferedOutputStream bufferedOutputStream0, long v) {
        bufferedOutputStream0.write(((int)(((byte)(((int)v))))));
        bufferedOutputStream0.write(((int)(((byte)(((int)(v >>> 8)))))));
        bufferedOutputStream0.write(((int)(((byte)(((int)(v >>> 16)))))));
        bufferedOutputStream0.write(((int)(((byte)(((int)(v >>> 24)))))));
        bufferedOutputStream0.write(((int)(((byte)(((int)(v >>> 0x20)))))));
        bufferedOutputStream0.write(((int)(((byte)(((int)(v >>> 40)))))));
        bufferedOutputStream0.write(((int)(((byte)(((int)(v >>> 0x30)))))));
        bufferedOutputStream0.write(((int)(((byte)(((int)(v >>> 56)))))));
    }

    public static void f(BufferedOutputStream bufferedOutputStream0, String s) {
        byte[] arr_b = s.getBytes("UTF-8");
        zzajx.e(bufferedOutputStream0, ((long)arr_b.length));
        bufferedOutputStream0.write(arr_b, 0, arr_b.length);
    }

    public static byte[] g(u0 u00, long v) {
        long v1 = u00.i - u00.j;
        if(v < 0L || v > v1 || ((long)(((int)v))) != v) {
            throw new IOException("streamToBytes length=" + v + ", maxLength=" + v1);
        }
        byte[] arr_b = new byte[((int)v)];
        new DataInputStream(u00).readFully(arr_b);
        return arr_b;
    }

    public static int h(u0 u00) {
        int v = u00.read();
        if(v == -1) {
            throw new EOFException();
        }
        return v;
    }

    public final void i(String s, t0 t00) {
        LinkedHashMap linkedHashMap0 = this.a;
        if(linkedHashMap0.containsKey(s)) {
            t0 t01 = (t0)linkedHashMap0.get(s);
            this.b = t00.a - t01.a + this.b;
        }
        else {
            this.b += t00.a;
        }
        linkedHashMap0.put(s, t00);
    }

    public static final String j(String s) {
        int v = s.length();
        return s.substring(0, v / 2).hashCode() + String.valueOf(s.substring(v / 2).hashCode());
    }

    @Override  // com.google.android.gms.internal.ads.zzail
    public final zzaik zza(String s) {
        zzaik zzaik0;
        t0 t01;
        u0 u00;
        File file0;
        t0 t00;
        synchronized(this) {
            t00 = (t0)this.a.get(s);
            if(t00 != null) {
                file0 = this.zzg(s);
                try {
                    u00 = new u0(new BufferedInputStream(new FileInputStream(file0)), file0.length());
                    goto label_5;
                }
                catch(IOException iOException0) {
                    zzajn.zza("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
                    this.zzi(s);
                    return null;
                }
            }
            return null;
        }
        try {
        label_5:
            t01 = t0.a(u00);
            if(TextUtils.equals(s, t01.b)) {
                byte[] arr_b = zzajx.g(u00, u00.i - u00.j);
                zzaik0 = new zzaik();
                zzaik0.zza = arr_b;
                zzaik0.zzb = t00.c;
                zzaik0.zzc = t00.d;
                zzaik0.zzd = t00.e;
                zzaik0.zze = t00.f;
                zzaik0.zzf = t00.g;
                TreeMap treeMap0 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for(Object object0: t00.h) {
                    treeMap0.put(((zzait)object0).zza(), ((zzait)object0).zzb());
                }
                zzaik0.zzg = treeMap0;
                zzaik0.zzh = Collections.unmodifiableList(t00.h);
                goto label_23;
            }
            goto label_26;
        }
        catch(Throwable throwable1) {
            goto label_32;
        }
        try {
        label_23:
            u00.close();
            return zzaik0;
        }
        catch(IOException iOException0) {
            zzajn.zza("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
            this.zzi(s);
            return null;
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
        try {
        label_26:
            zzajn.zza("%s: key=%s, found=%s", new Object[]{file0.getAbsolutePath(), s, t01.b});
            t0 t02 = (t0)this.a.remove(s);
            if(t02 != null) {
                this.b -= t02.a;
            }
            goto label_34;
        }
        catch(Throwable throwable1) {
            try {
            label_32:
                u00.close();
                throw throwable1;
            label_34:
                u00.close();
                return null;
            }
            catch(IOException iOException0) {
            }
            zzajn.zza("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
            this.zzi(s);
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzail
    public final void zzb() {
        synchronized(this) {
            File file0 = this.c.zza();
            if(!file0.exists()) {
                if(!file0.mkdirs()) {
                    zzajn.zzb("Unable to create cache dir %s", new Object[]{file0.getAbsolutePath()});
                    return;
                }
                return;
            }
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                return;
            }
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                try {
                    long v2 = file1.length();
                    u0 u00 = new u0(new BufferedInputStream(new FileInputStream(file1)), v2);
                    try {
                        t0 t00 = t0.a(u00);
                        t00.a = v2;
                        this.i(t00.b, t00);
                    }
                    catch(Throwable throwable0) {
                        u00.close();
                        throw throwable0;
                    }
                    u00.close();
                }
                catch(IOException unused_ex) {
                    file1.delete();
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzail
    public final void zzc(String s, boolean z) {
        synchronized(this) {
            zzaik zzaik0 = this.zza(s);
            if(zzaik0 != null) {
                zzaik0.zzf = 0L;
                zzaik0.zze = 0L;
                this.zzd(s, zzaik0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzail
    public final void zzd(String s, zzaik zzaik0) {
        t0 t00;
        BufferedOutputStream bufferedOutputStream0;
        synchronized(this) {
            if(this.b + ((long)zzaik0.zza.length) > ((long)this.d) && ((float)zzaik0.zza.length) > ((float)this.d) * 0.9f) {
                return;
            }
            File file0 = this.zzg(s);
            try {
                bufferedOutputStream0 = new BufferedOutputStream(new FileOutputStream(file0));
                t00 = new t0(s, zzaik0);
            }
            catch(IOException unused_ex) {
                goto label_62;
            }
            try {
                zzajx.d(bufferedOutputStream0, 0x20150306);
                zzajx.f(bufferedOutputStream0, s);
                zzajx.f(bufferedOutputStream0, (t00.c == null ? "" : t00.c));
                zzajx.e(bufferedOutputStream0, t00.d);
                zzajx.e(bufferedOutputStream0, t00.e);
                zzajx.e(bufferedOutputStream0, t00.f);
                zzajx.e(bufferedOutputStream0, t00.g);
                List list0 = t00.h;
                if(list0 == null) {
                    zzajx.d(bufferedOutputStream0, 0);
                }
                else {
                    zzajx.d(bufferedOutputStream0, list0.size());
                    for(Object object0: list0) {
                        zzajx.f(bufferedOutputStream0, ((zzait)object0).zza());
                        zzajx.f(bufferedOutputStream0, ((zzait)object0).zzb());
                    }
                }
                bufferedOutputStream0.flush();
                goto label_36;
            }
            catch(IOException iOException0) {
            }
            try {
                zzajn.zza("%s", new Object[]{iOException0.toString()});
                bufferedOutputStream0.close();
                zzajn.zza("Failed to write header for %s", new Object[]{file0.getAbsolutePath()});
                throw new IOException();
            label_36:
                bufferedOutputStream0.write(zzaik0.zza);
                bufferedOutputStream0.close();
                t00.a = file0.length();
                this.i(s, t00);
                if(this.b >= ((long)this.d)) {
                    if(zzajn.zzb) {
                        zzajn.zzd("Pruning old cache entries.", new Object[0]);
                    }
                    long v1 = this.b;
                    long v2 = SystemClock.elapsedRealtime();
                    int v3 = 0;
                    Iterator iterator1 = this.a.entrySet().iterator();
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        t0 t01 = (t0)((Map.Entry)object1).getValue();
                        if(this.zzg(t01.b).delete()) {
                            this.b -= t01.a;
                        }
                        else {
                            String s1 = zzajx.j(t01.b);
                            zzajn.zza("Could not delete cache entry for key=%s, filename=%s", new Object[]{t01.b, s1});
                        }
                        iterator1.remove();
                        ++v3;
                        if(((float)this.b) < ((float)this.d) * 0.9f) {
                            break;
                        }
                    }
                    if(zzajn.zzb) {
                        zzajn.zzd("pruned %d files, %d bytes, %d ms", new Object[]{v3, ((long)(this.b - v1)), ((long)(SystemClock.elapsedRealtime() - v2))});
                    }
                }
            }
            catch(IOException unused_ex) {
            label_62:
                if(!file0.delete()) {
                    zzajn.zza("Could not clean up file %s", new Object[]{file0.getAbsolutePath()});
                }
                if(!this.c.zza().exists()) {
                    zzajn.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.a.clear();
                    this.b = 0L;
                    this.zzb();
                }
            }
        }
    }

    public final File zzg(String s) {
        return new File(this.c.zza(), zzajx.j(s));
    }

    public final void zzi(String s) {
        synchronized(this) {
            boolean z = this.zzg(s).delete();
            t0 t00 = (t0)this.a.remove(s);
            if(t00 != null) {
                this.b -= t00.a;
            }
            if(!z) {
                zzajn.zza("Could not delete cache entry for key=%s, filename=%s", new Object[]{s, zzajx.j(s)});
            }
        }
    }
}

