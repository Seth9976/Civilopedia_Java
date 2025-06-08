package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class zzen extends zzek {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public zzen(Context context0) {
        super(false);
        this.e = context0.getContentResolver();
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) throws zzem {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.i;
        if(v2 != 0L) {
            try {
                if(v2 != -1L) {
                    v1 = (int)Math.min(v2, v1);
                }
                v3 = this.h.read(arr_b, v, v1);
            }
            catch(IOException iOException0) {
                throw new zzem(iOException0, 2000);
            }
            if(v3 == -1) {
                return -1;
            }
            long v4 = this.i;
            if(v4 != -1L) {
                this.i = v4 - ((long)v3);
            }
            this.zzg(v3);
            return v3;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws zzem {
        int v7;
        IOException iOException1;
        long v5;
        AssetFileDescriptor assetFileDescriptor0;
        Uri uri0;
        try {
            uri0 = zzev0.zza;
            this.f = uri0;
            this.b(zzev0);
            boolean z = "content".equals(zzev0.zza.getScheme());
            ContentResolver contentResolver0 = this.e;
            if(z) {
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor0 = contentResolver0.openTypedAssetFileDescriptor(uri0, "*/*", bundle0);
            }
            else {
                assetFileDescriptor0 = contentResolver0.openAssetFileDescriptor(uri0, "r");
            }
            this.g = assetFileDescriptor0;
            if(assetFileDescriptor0 != null) {
                long v = assetFileDescriptor0.getLength();
                FileInputStream fileInputStream0 = new FileInputStream(assetFileDescriptor0.getFileDescriptor());
                this.h = fileInputStream0;
                int v1 = Long.compare(v, -1L);
                if(v1 != 0 && zzev0.zzf > v) {
                    throw new zzem(null, 2008);
                }
                long v2 = assetFileDescriptor0.getStartOffset();
                long v3 = fileInputStream0.skip(zzev0.zzf + v2) - v2;
                if(v3 != zzev0.zzf) {
                    throw new zzem(null, 2008);
                }
                if(v1 == 0) {
                    FileChannel fileChannel0 = fileInputStream0.getChannel();
                    long v4 = fileChannel0.size();
                    if(v4 == 0L) {
                        this.i = -1L;
                        v5 = -1L;
                    }
                    else {
                        v5 = v4 - fileChannel0.position();
                        this.i = v5;
                        if(v5 < 0L) {
                            throw new zzem(null, 2008);
                        }
                    }
                }
                else {
                    v5 = v - v3;
                    this.i = v5;
                    if(v5 < 0L) {
                        throw new zzem(null, 2008);
                    }
                }
                goto label_38;
            }
            goto label_46;
        }
        catch(zzem zzem0) {
            throw zzem0;
        }
        catch(IOException iOException0) {
            v7 = 2000;
            goto label_56;
        }
    label_38:
        long v6 = zzev0.zzg;
        if(v6 != -1L) {
            if(v5 != -1L) {
                v6 = Math.min(v5, v6);
            }
            this.i = v6;
        }
        this.j = true;
        this.c(zzev0);
        return zzev0.zzg == -1L ? this.i : zzev0.zzg;
        try {
        label_46:
            iOException1 = new IOException("Could not open file descriptor for: " + uri0);
            v7 = 2000;
        }
        catch(zzem zzem0) {
            throw zzem0;
        }
        catch(IOException iOException0) {
            v7 = 2000;
            goto label_56;
        }
        try {
            throw new zzem(iOException1, 2000);
        }
        catch(zzem zzem0) {
            try {
                throw zzem0;
            }
            catch(zzem zzem0) {
            }
            catch(IOException iOException0) {
                v7 = 2000;
                goto label_56;
            }
            throw zzem0;
        }
        catch(IOException iOException0) {
        }
    label_56:
        if(iOException0 instanceof FileNotFoundException) {
            v7 = 2005;
        }
        throw new zzem(iOException0, v7);
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.f;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzem {
        try {
            try {
                this.f = null;
                FileInputStream fileInputStream0 = this.h;
                if(fileInputStream0 != null) {
                    fileInputStream0.close();
                }
                goto label_24;
            }
            catch(IOException iOException0) {
            }
            throw new zzem(iOException0, 2000);
        }
        catch(Throwable throwable0) {
            try {
                this.h = null;
                AssetFileDescriptor assetFileDescriptor0 = this.g;
                if(assetFileDescriptor0 != null) {
                    assetFileDescriptor0.close();
                }
            }
            catch(IOException iOException1) {
                throw new zzem(iOException1, 2000);
            }
            finally {
                this.g = null;
                if(this.j) {
                    this.j = false;
                    this.a();
                }
            }
            throw throwable0;
        }
        try {
        label_24:
            this.h = null;
            AssetFileDescriptor assetFileDescriptor1 = this.g;
            if(assetFileDescriptor1 != null) {
                assetFileDescriptor1.close();
            }
        }
        catch(IOException iOException2) {
            throw new zzem(iOException2, 2000);
        }
        finally {
            this.g = null;
            if(this.j) {
                this.j = false;
                this.a();
            }
        }
    }
}

