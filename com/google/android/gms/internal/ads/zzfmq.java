package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

public final class zzfmq {
    public final Context a;
    public final SharedPreferences b;
    public final String c;
    public final zzflx d;
    public final boolean e;
    public static final Object f;

    static {
        zzfmq.f = new Object();
    }

    public zzfmq(Context context0, int v, zzflx zzflx0, boolean z) {
        this.e = false;
        this.a = context0;
        this.c = Integer.toString(v - 1);
        this.b = context0.getSharedPreferences("pcvmspf", 0);
        this.d = zzflx0;
        this.e = z;
    }

    public final File a(String s) {
        return new File(new File(this.a.getDir("pccache", 0), this.c), s);
    }

    public static String b(zzaqs zzaqs0) {
        zzaqu zzaqu0 = zzaqv.zze();
        zzaqu0.zze("");
        zzaqu0.zza("");
        zzaqu0.zzb(zzaqs0.zzd().zza());
        zzaqu0.zzd(zzaqs0.zzd().zzd());
        zzaqu0.zzc(zzaqs0.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzaqv)zzaqu0.zzal()).zzas().zzE());
    }

    public final void c(int v, long v1) {
        zzflx zzflx0 = this.d;
        if(zzflx0 != null) {
            zzflx0.zza(v, v1);
        }
    }

    public final zzaqv d(int v) {
        long v1;
        String s = v == 1 ? this.b.getString("LATMTD" + this.c, null) : this.b.getString("FBAMTD" + this.c, null);
        if(s == null) {
            return null;
        }
        try {
            v1 = System.currentTimeMillis();
            return zzaqv.zzi(zzgji.zzv(Hex.stringToBytes(s)), (this.e ? zzgkc.zza() : zzgkc.zzb()));
        }
        catch(zzglc unused_ex) {
            this.c(2029, v1);
            return null;
        }
        catch(NullPointerException unused_ex) {
            return null;
        }
        catch(RuntimeException unused_ex) {
            this.c(0x7F0, v1);
            return null;
        }
    }

    public final boolean zza(zzaqs zzaqs0) {
        long v = System.currentTimeMillis();
        synchronized(zzfmq.f) {
            if(!zzfmk.zze(new File(this.a(""), "pcbc"), zzaqs0.zze().zzE())) {
                this.c(4020, v);
                return false;
            }
            String s = zzfmq.b(zzaqs0);
            SharedPreferences.Editor sharedPreferences$Editor0 = this.b.edit();
            sharedPreferences$Editor0.putString("LATMTD" + this.c, s);
            boolean z = sharedPreferences$Editor0.commit();
            if(z) {
                this.c(5015, v);
            }
            else {
                this.c(0xFB5, v);
            }
            return z;
        }
    }

    public final boolean zzb(zzaqs zzaqs0, zzfmp zzfmp0) {
        long v1 = System.currentTimeMillis();
        synchronized(zzfmq.f) {
            if(this.d(1) != null) {
                this.c(0xFAE, v1);
                return false;
            }
            String s = "1";
            String s1 = "1";
            long v3 = System.currentTimeMillis();
            File file0 = this.a("");
            if(file0.exists()) {
                if(!file0.isDirectory()) {
                    s1 = "0";
                }
                String s2 = file0.isFile() ? "1" : "0";
                zzflx zzflx0 = this.d;
                if(zzflx0 != null) {
                    zzflx0.zzb(0xFB7, v3, "d:" + s1 + ",f:" + s2);
                }
                this.c(0xFAF, v3);
            }
            else if(!file0.mkdirs()) {
                if(!file0.canWrite()) {
                    s = "0";
                }
                zzflx zzflx1 = this.d;
                if(zzflx1 != null) {
                    zzflx1.zzb(0xFB8, v3, "cw:" + s);
                }
                this.c(0xFAF, v3);
                return false;
            }
            File file1 = this.a("");
            File file2 = new File(file1, "pcam.jar");
            File file3 = new File(file1, "pcbc");
            if(!zzfmk.zze(file2, zzaqs0.zzf().zzE())) {
                this.c(0xFB0, v1);
                return false;
            }
            if(!zzfmk.zze(file3, zzaqs0.zze().zzE())) {
                this.c(0xFB1, v1);
                return false;
            }
            if(zzfmp0 != null && !zzfmp0.zza(file2)) {
                this.c(0xFB2, v1);
                zzfmk.zzd(file1);
                return false;
            }
            String s3 = zzfmq.b(zzaqs0);
            long v4 = System.currentTimeMillis();
            String s4 = this.b.getString("LATMTD" + this.c, null);
            SharedPreferences.Editor sharedPreferences$Editor0 = this.b.edit();
            sharedPreferences$Editor0.putString("LATMTD" + this.c, s3);
            if(s4 != null) {
                sharedPreferences$Editor0.putString("FBAMTD" + this.c, s4);
            }
            if(!sharedPreferences$Editor0.commit()) {
                this.c(0xFB3, v4);
                return false;
            }
            HashSet hashSet0 = new HashSet();
            if(this.d(1) != null) {
                hashSet0.add("");
            }
            if(this.d(2) != null) {
                hashSet0.add("");
            }
            File[] arr_file = new File(this.a.getDir("pccache", 0), this.c).listFiles();
            for(int v = 0; v < arr_file.length; ++v) {
                File file4 = arr_file[v];
                if(!hashSet0.contains(file4.getName())) {
                    zzfmk.zzd(file4);
                }
            }
            this.c(5014, v1);
            return true;
        }
    }

    public final zzfmi zzc(int v) {
        File file3;
        File file2;
        File file1;
        zzaqv zzaqv0;
        long v1 = System.currentTimeMillis();
        synchronized(zzfmq.f) {
            zzaqv0 = this.d(1);
            if(zzaqv0 == null) {
                this.c(0xFB6, v1);
                return null;
            }
            File file0 = this.a("");
            file1 = new File(file0, "pcam.jar");
            if(!file1.exists()) {
                file1 = new File(file0, "pcam");
            }
            file2 = new File(file0, "pcbc");
            file3 = new File(file0, "pcopt");
            this.c(5016, v1);
        }
        return new zzfmi(zzaqv0, file1, file2, file3);
    }

    public final boolean zzd(int v) {
        long v1 = System.currentTimeMillis();
        synchronized(zzfmq.f) {
            if(this.d(1) == null) {
                this.c(0xFB9, v1);
                return false;
            }
            File file0 = this.a("");
            if(!new File(file0, "pcam.jar").exists()) {
                this.c(0xFBA, v1);
                return false;
            }
            if(!new File(file0, "pcbc").exists()) {
                this.c(0xFBB, v1);
                return false;
            }
            this.c(5019, v1);
            return true;
        }
    }
}

