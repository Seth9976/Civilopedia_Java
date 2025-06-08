package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import i3.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class zzfg extends zzek {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public zzfg() {
        super(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) throws zzff {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.g;
        if(v2 == 0L) {
            return -1;
        }
        try {
            v3 = this.e.read(arr_b, v, ((int)Math.min(v2, v1)));
        }
        catch(IOException iOException0) {
            throw new zzff(iOException0, 2000);
        }
        if(v3 > 0) {
            this.g -= (long)v3;
            this.zzg(v3);
        }
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws zzff {
        long v1;
        RandomAccessFile randomAccessFile0;
        Uri uri0 = zzev0.zza;
        this.f = uri0;
        this.b(zzev0);
        int v = 2006;
        try {
            String s = uri0.getPath();
            if(s == null) {
                throw null;
            }
            randomAccessFile0 = new RandomAccessFile(s, "r");
            this.e = randomAccessFile0;
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(TextUtils.isEmpty(uri0.getQuery()) && TextUtils.isEmpty(uri0.getFragment())) {
                if(zzeg.zza < 21 || !b6.b(fileNotFoundException0.getCause())) {
                    v = 2005;
                }
                throw new zzff(fileNotFoundException0, v);
            }
            String s1 = uri0.getPath();
            String s2 = uri0.getQuery();
            String s3 = uri0.getFragment();
            StringBuilder stringBuilder0 = e.j("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing \'?\' or \'#\'? Use Uri.fromFile(new File(path)) to avoid this. path=", s1, ",query=", s2, ",fragment=");
            stringBuilder0.append(s3);
            throw new zzff(stringBuilder0.toString(), fileNotFoundException0, 1004);
        }
        catch(SecurityException securityException0) {
            throw new zzff(securityException0, 2006);
        }
        catch(RuntimeException runtimeException0) {
            throw new zzff(runtimeException0, 2000);
        }
        try {
            randomAccessFile0.seek(zzev0.zzf);
            v1 = zzev0.zzg;
            if(v1 == -1L) {
                v1 = this.e.length() - zzev0.zzf;
            }
        }
        catch(IOException iOException0) {
            throw new zzff(iOException0, 2000);
        }
        this.g = v1;
        if(v1 < 0L) {
            throw new zzff(null, null, 2008);
        }
        this.h = true;
        this.c(zzev0);
        return this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.f;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzff {
        try {
            this.f = null;
            RandomAccessFile randomAccessFile0 = this.e;
            if(randomAccessFile0 != null) {
                randomAccessFile0.close();
            }
        }
        catch(IOException iOException0) {
            throw new zzff(iOException0, 2000);
        }
        finally {
            this.e = null;
            if(this.h) {
                this.h = false;
                this.a();
            }
        }
    }
}

