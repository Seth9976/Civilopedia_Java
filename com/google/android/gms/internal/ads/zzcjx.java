package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzcjx extends zzcju {
    public final File l;
    public boolean m;
    public static final Set n;
    public static final DecimalFormat o;
    public static final int zzd;

    static {
        zzcjx.n = Collections.synchronizedSet(new HashSet());
        zzcjx.o = new DecimalFormat("#,###");
    }

    public zzcjx(zzchr zzchr0) {
        super(zzchr0);
        File file0 = this.i.getCacheDir();
        if(file0 == null) {
            zzcfi.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file1 = new File(file0, "admobVideoStreams");
        this.l = file1;
        if(!file1.isDirectory() && !file1.mkdirs()) {
            zzcfi.zzj(("Could not create preload cache directory at " + file1.getAbsolutePath()));
            this.l = null;
            return;
        }
        if(file1.setReadable(true, false) && file1.setExecutable(true, false)) {
            return;
        }
        zzcfi.zzj(("Could not set cache file permissions at " + file1.getAbsolutePath()));
        this.l = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
        this.m = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String s) {
        String s13;
        String s12;
        String s11;
        String s10;
        String s9;
        int v13;
        ReadableByteChannel readableByteChannel1;
        FileChannel fileChannel1;
        String s8;
        zzbz zzbz1;
        String s7;
        String s6;
        FileOutputStream fileOutputStream2;
        int v12;
        int v11;
        long v10;
        zzbz zzbz0;
        ByteBuffer byteBuffer0;
        FileChannel fileChannel0;
        FileOutputStream fileOutputStream1;
        ReadableByteChannel readableByteChannel0;
        int v8;
        int v7;
        int v6;
        boolean z;
        int v;
        FileOutputStream fileOutputStream0 = null;
        if(this.l != null) {
            while(true) {
                File file0 = this.l;
                if(file0 == null) {
                    v = 0;
                }
                else {
                    File[] arr_file = file0.listFiles();
                    v = 0;
                    for(int v1 = 0; v1 < arr_file.length; ++v1) {
                        if(!arr_file[v1].getName().endsWith(".done")) {
                            ++v;
                        }
                    }
                }
                if(v > ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzs))))) {
                    File file1 = this.l;
                    if(file1 != null) {
                        File[] arr_file1 = file1.listFiles();
                        long v2 = 0x7FFFFFFFFFFFFFFFL;
                        File file2 = null;
                        for(int v3 = 0; v3 < arr_file1.length; ++v3) {
                            File file3 = arr_file1[v3];
                            if(!file3.getName().endsWith(".done")) {
                                long v4 = file3.lastModified();
                                if(v4 < v2) {
                                    file2 = file3;
                                    v2 = v4;
                                }
                            }
                        }
                        if(file2 == null) {
                            z = false;
                        }
                        else {
                            z = file2.delete();
                            String s1 = file2.getName() + ".done";
                            File file4 = new File(this.l, s1);
                            if(file4.isFile()) {
                                z &= file4.delete();
                            }
                        }
                        if(z) {
                            continue;
                        }
                    }
                    zzcfi.zzj("Unable to expire stream cache");
                    this.zzc(s, null, "expireFailed", null);
                    return false;
                }
                break;
            }
            String s2 = zzcfb.zze(s);
            File file5 = new File(this.l, s2);
            String s3 = file5.getName() + ".done";
            File file6 = new File(this.l, s3);
            if(file5.isFile() && file6.isFile()) {
                long v5 = file5.length();
                zzcfi.zze(("Stream cache hit at " + s));
                b3 b30 = new b3(this, s, file5.getAbsolutePath(), ((int)v5));
                zzcfb.zza.post(b30);
                return true;
            }
            String s4 = this.l.getAbsolutePath() + s;
            Set set0 = zzcjx.n;
            synchronized(set0) {
                if(set0.contains(s4)) {
                    zzcfi.zzj(("Stream cache already in progress at " + s));
                    this.zzc(s, file5.getAbsolutePath(), "inProgress", null);
                    return false;
                }
                goto label_62;
            }
            return false;
        label_62:
            set0.add(s4);
            try {
                HttpURLConnection httpURLConnection0 = zzfnf.zza().zzn(new zzcjw(s), 0x109, -1);
                if(!(httpURLConnection0 instanceof HttpURLConnection)) {
                    goto label_72;
                }
                v6 = httpURLConnection0.getResponseCode();
                if(v6 < 400) {
                label_72:
                    v7 = httpURLConnection0.getContentLength();
                    if(v7 < 0) {
                        zzcfi.zzj(("Stream cache aborted, missing content-length header at " + s));
                        this.zzc(s, file5.getAbsolutePath(), "contentLengthMissing", null);
                        set0.remove(s4);
                        return false;
                    }
                    String s5 = zzcjx.o.format(((long)v7));
                    v8 = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzt)));
                    if(v7 > v8) {
                        zzcfi.zzj(("Content length " + s5 + " exceeds limit at " + s));
                        this.zzc(s, file5.getAbsolutePath(), "sizeExceeded", "File too big for full file cache. Size: " + s5);
                        set0.remove(s4);
                        return false;
                    }
                    zzcfi.zze(("Caching " + s5 + " bytes from " + s));
                    readableByteChannel0 = Channels.newChannel(httpURLConnection0.getInputStream());
                    fileOutputStream1 = new FileOutputStream(file5);
                    goto label_88;
                }
                goto label_184;
            }
            catch(IOException | RuntimeException iOException0) {
                s6 = s4;
                s9 = "error";
                s12 = null;
                goto label_196;
            }
            try {
            label_88:
                fileChannel0 = fileOutputStream1.getChannel();
                byteBuffer0 = ByteBuffer.allocate(0x100000);
                Clock clock0 = zzt.zzA();
                long v9 = clock0.currentTimeMillis();
                zzbz0 = new zzbz(((long)(((Long)zzay.zzc().zzb(zzbhz.zzw)))));
                v10 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzv)));
                v11 = 0;
                while(true) {
                label_95:
                    v12 = readableByteChannel0.read(byteBuffer0);
                    break;
                }
            }
            catch(IOException | RuntimeException iOException0) {
                fileOutputStream2 = fileOutputStream1;
                s6 = s4;
                s9 = "error";
                fileOutputStream0 = fileOutputStream2;
                s12 = null;
                goto label_196;
            }
            if(v12 < 0) {
                goto label_160;
            }
            v11 += v12;
            if(v11 > v8) {
                goto label_146;
            }
            try {
                byteBuffer0.flip();
                while(fileChannel0.write(byteBuffer0) > 0) {
                }
                byteBuffer0.clear();
                if(clock0.currentTimeMillis() - v9 <= 1000L * v10) {
                    if(this.m) {
                        goto label_138;
                    }
                    if(zzbz0.zzb()) {
                        s7 = file5.getAbsolutePath();
                        zzbz1 = zzbz0;
                        s8 = s4;
                        fileChannel1 = fileChannel0;
                        fileOutputStream2 = fileOutputStream1;
                        readableByteChannel1 = readableByteChannel0;
                        v13 = v8;
                        goto label_123;
                    }
                    else {
                        goto label_125;
                    }
                    goto label_131;
                }
                goto label_141;
            }
            catch(IOException | RuntimeException iOException0) {
                try {
                    fileOutputStream2 = fileOutputStream1;
                    s8 = s4;
                    goto label_175;
                label_123:
                    zzcfb.zza.post(new Y2(this, s, s7, v11, v7));
                    goto label_131;
                label_125:
                    zzbz1 = zzbz0;
                    fileChannel1 = fileChannel0;
                    fileOutputStream2 = fileOutputStream1;
                    readableByteChannel1 = readableByteChannel0;
                    v13 = v8;
                    s8 = s4;
                label_131:
                    readableByteChannel0 = readableByteChannel1;
                    zzbz0 = zzbz1;
                    s4 = s8;
                    fileChannel0 = fileChannel1;
                    fileOutputStream1 = fileOutputStream2;
                    v8 = v13;
                    goto label_95;
                label_138:
                    fileOutputStream2 = fileOutputStream1;
                    s9 = "externalAbort";
                }
                catch(IOException | RuntimeException iOException0) {
                    goto label_175;
                }
            }
            try {
                throw new IOException("abort requested");
            }
            catch(IOException | RuntimeException iOException0) {
                s6 = s4;
                fileOutputStream0 = fileOutputStream2;
                s12 = null;
                goto label_196;
            }
            try {
            label_141:
                fileOutputStream2 = fileOutputStream1;
                s10 = s4;
                s9 = "downloadTimeout";
            }
            catch(IOException | RuntimeException iOException0) {
                goto label_175;
            }
            try {
                s11 = "Timeout exceeded. Limit: " + Long.toString(v10) + " sec";
            }
            catch(IOException | RuntimeException iOException0) {
                s6 = s4;
                fileOutputStream0 = fileOutputStream2;
                s12 = null;
                goto label_196;
            }
            try {
                throw new IOException("stream cache time limit exceeded");
            }
            catch(IOException | RuntimeException iOException0) {
                s12 = s11;
                s6 = s10;
                fileOutputStream0 = fileOutputStream2;
                goto label_196;
            }
            try {
            label_146:
                fileOutputStream2 = fileOutputStream1;
                s10 = s4;
                s9 = "sizeExceeded";
            }
            catch(IOException | RuntimeException iOException0) {
                goto label_175;
            }
            try {
                s11 = "File too big for full file cache. Size: " + Integer.toString(v11);
            }
            catch(IOException | RuntimeException iOException0) {
                s6 = s4;
                fileOutputStream0 = fileOutputStream2;
                s12 = null;
                goto label_196;
            }
            try {
                throw new IOException("stream cache file size limit exceeded");
            }
            catch(IOException | RuntimeException iOException0) {
                s12 = s11;
                s6 = s10;
                fileOutputStream0 = fileOutputStream2;
                goto label_196;
            }
            try {
                try {
                label_160:
                    fileOutputStream2 = fileOutputStream1;
                    s8 = s4;
                    fileOutputStream2.close();
                    if(zzcfi.zzm(3)) {
                        zzcfi.zze(("Preloaded " + zzcjx.o.format(((long)v11)) + " bytes from " + s));
                    }
                    file5.setReadable(true, false);
                    if(file6.isFile()) {
                        file6.setLastModified(System.currentTimeMillis());
                        goto label_170;
                    }
                }
                catch(IOException iOException0) {
                    goto label_175;
                }
                try {
                    file6.createNewFile();
                }
                catch(IOException unused_ex) {
                }
                try {
                label_170:
                    b3 b31 = new b3(this, s, file5.getAbsolutePath(), v11);
                    zzcfb.zza.post(b31);
                    s6 = s8;
                    goto label_177;
                label_175:
                    s6 = s8;
                    s9 = "error";
                    fileOutputStream0 = fileOutputStream2;
                    s12 = null;
                    goto label_196;
                }
                catch(IOException iOException0) {
                    goto label_175;
                }
            }
            catch(RuntimeException iOException0) {
                goto label_175;
            }
            try {
            label_177:
                zzcjx.n.remove(s6);
                return true;
            }
            catch(IOException | RuntimeException iOException0) {
            }
            s9 = "error";
            fileOutputStream0 = fileOutputStream2;
            s12 = null;
            goto label_196;
            try {
            label_184:
                s9 = "badUrl";
                s13 = "HTTP request failed. Code: " + Integer.toString(v6);
            }
            catch(IOException | RuntimeException iOException0) {
                s6 = s4;
                s9 = "error";
                s12 = null;
                goto label_196;
            }
            try {
                throw new IOException("HTTP status code " + v6 + " at " + s);
            }
            catch(IOException | RuntimeException iOException0) {
                s12 = s13;
                s6 = s4;
            }
        label_196:
            if(iOException0 instanceof RuntimeException) {
                zzt.zzo().zzt(iOException0, "VideoStreamFullFileCache.preload");
            }
            try {
                fileOutputStream0.close();
            }
            catch(IOException | NullPointerException unused_ex) {
            }
            if(this.m) {
                zzcfi.zzi(("Preload aborted for URL \"" + s + "\""));
            }
            else {
                zzcfi.zzk(("Preload failed for URL \"" + s + "\""), iOException0);
            }
            if(file5.exists() && !file5.delete()) {
                zzcfi.zzj(("Could not delete partial cache file at " + file5.getAbsolutePath()));
            }
            this.zzc(s, file5.getAbsolutePath(), s9, s12);
            zzcjx.n.remove(s6);
            return false;
        }
        this.zzc(s, null, "noCacheDir", null);
        return false;
    }
}

