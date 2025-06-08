package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class zzfq extends zzek {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public FileInputStream i;
    public long j;
    public boolean k;

    public zzfq(Context context0) {
        super(false);
        this.e = context0.getResources();
        this.f = "com.spears.civilopedia";
    }

    public static Uri buildRawResourceUri(int v) {
        return Uri.parse(("rawresource:///" + v));
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) throws zzfp {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.j;
        if(v2 != 0L) {
            try {
                if(v2 != -1L) {
                    v1 = (int)Math.min(v2, v1);
                }
                v3 = this.i.read(arr_b, v, v1);
            }
            catch(IOException iOException0) {
                throw new zzfp(null, iOException0, 2000);
            }
            if(v3 == -1) {
                if(this.j != -1L) {
                    throw new zzfp("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
                return -1;
            }
            long v4 = this.j;
            if(v4 != -1L) {
                this.j = v4 - ((long)v3);
            }
            this.zzg(v3);
            return v3;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws zzfp {
        long v5;
        AssetFileDescriptor assetFileDescriptor0;
        int v;
        Uri uri0 = zzev0.zza;
        this.g = uri0;
        boolean z = TextUtils.equals("rawresource", uri0.getScheme());
        Resources resources0 = this.e;
        if(z) {
            try {
            label_19:
                String s3 = uri0.getLastPathSegment();
                if(s3 == null) {
                    throw null;
                }
                v = Integer.parseInt(s3);
            }
            catch(NumberFormatException unused_ex) {
                throw new zzfp("Resource identifier must be an integer.", null, 1004);
            }
        }
        else if(TextUtils.equals("android.resource", uri0.getScheme()) && uri0.getPathSegments().size() == 1) {
            String s = uri0.getLastPathSegment();
            s.getClass();
            if(s.matches("\\d+")) {
                goto label_19;
            }
            else {
                goto label_9;
            }
        }
        else {
        label_9:
            if(!TextUtils.equals("android.resource", uri0.getScheme())) {
                throw new zzfp("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String s1 = uri0.getPath();
            s1.getClass();
            if(s1.startsWith("/")) {
                s1 = s1.substring(1);
            }
            String s2 = uri0.getHost();
            v = resources0.getIdentifier((TextUtils.isEmpty(s2) ? "" : s2 + ":") + s1, "raw", this.f);
            if(v == 0) {
                throw new zzfp("Resource not found.", null, 2005);
            }
        }
        this.b(zzev0);
        try {
            assetFileDescriptor0 = resources0.openRawResourceFd(v);
            this.h = assetFileDescriptor0;
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            throw new zzfp(null, resources$NotFoundException0, 2005);
        }
        if(assetFileDescriptor0 == null) {
            throw new zzfp("Resource is compressed: " + uri0, null, 2000);
        }
        long v1 = assetFileDescriptor0.getLength();
        FileInputStream fileInputStream0 = new FileInputStream(assetFileDescriptor0.getFileDescriptor());
        this.i = fileInputStream0;
        int v2 = Long.compare(v1, -1L);
        try {
            if(v2 != 0 && zzev0.zzf > v1) {
                throw new zzfp(null, null, 2008);
            }
            long v3 = assetFileDescriptor0.getStartOffset();
            long v4 = fileInputStream0.skip(zzev0.zzf + v3) - v3;
            if(v4 != zzev0.zzf) {
                throw new zzfp(null, null, 2008);
            }
            if(v2 == 0) {
                FileChannel fileChannel0 = fileInputStream0.getChannel();
                if(fileChannel0.size() == 0L) {
                    this.j = -1L;
                    v5 = -1L;
                }
                else {
                    v5 = fileChannel0.size() - fileChannel0.position();
                    this.j = v5;
                    if(v5 < 0L) {
                        throw new zzfp(null, null, 2008);
                    }
                }
            }
            else {
                v5 = v1 - v4;
                this.j = v5;
                if(v5 < 0L) {
                    throw new zzer(2008);
                }
            }
            goto label_61;
        }
        catch(zzfp zzfp0) {
        }
        catch(IOException iOException0) {
            throw new zzfp(null, iOException0, 2000);
        }
        throw zzfp0;
    label_61:
        long v6 = zzev0.zzg;
        if(v6 != -1L) {
            if(v5 != -1L) {
                v6 = Math.min(v5, v6);
            }
            this.j = v6;
        }
        this.k = true;
        this.c(zzev0);
        return zzev0.zzg == -1L ? this.j : zzev0.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzfp {
        try {
            try {
                this.g = null;
                FileInputStream fileInputStream0 = this.i;
                if(fileInputStream0 != null) {
                    fileInputStream0.close();
                }
                goto label_24;
            }
            catch(IOException iOException0) {
            }
            throw new zzfp(null, iOException0, 2000);
        }
        catch(Throwable throwable0) {
            try {
                this.i = null;
                AssetFileDescriptor assetFileDescriptor0 = this.h;
                if(assetFileDescriptor0 != null) {
                    assetFileDescriptor0.close();
                }
            }
            catch(IOException iOException1) {
                throw new zzfp(null, iOException1, 2000);
            }
            finally {
                this.h = null;
                if(this.k) {
                    this.k = false;
                    this.a();
                }
            }
            throw throwable0;
        }
        try {
        label_24:
            this.i = null;
            AssetFileDescriptor assetFileDescriptor1 = this.h;
            if(assetFileDescriptor1 != null) {
                assetFileDescriptor1.close();
            }
        }
        catch(IOException iOException2) {
            throw new zzfp(null, iOException2, 2000);
        }
        finally {
            this.h = null;
            if(this.k) {
                this.k = false;
                this.a();
            }
        }
    }
}

