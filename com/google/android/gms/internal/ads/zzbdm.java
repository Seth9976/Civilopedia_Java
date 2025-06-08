package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class zzbdm {
    public final zzbds a;
    public final zzbfb b;
    public final boolean c;

    public zzbdm() {
        this.b = zzbfc.zzd();
        this.c = false;
        this.a = new zzbds();
    }

    public zzbdm(zzbds zzbds0) {
        this.b = zzbfc.zzd();
        this.a = zzbds0;
        this.c = ((Boolean)zzay.zzc().zzb(zzbhz.zzdV)).booleanValue();
    }

    public final String a(int v) {
        synchronized(this) {
            String s = this.b.zzk();
            long v2 = zzt.zzA().elapsedRealtime();
            String s1 = Base64.encodeToString(((zzbfc)this.b.zzal()).zzaw(), 3);
            return "id=" + s + ",timestamp=" + v2 + ",event=" + (v - 1) + ",data=" + s1 + "\n";
        }
    }

    public final void b(int v) {
        FileOutputStream fileOutputStream0;
        synchronized(this) {
            File file0 = Environment.getExternalStorageDirectory();
            if(file0 != null) {
                File file1 = new File(file0, "clearcut_events.txt");
                try {
                    fileOutputStream0 = new FileOutputStream(file1, true);
                    goto label_5;
                }
                catch(FileNotFoundException unused_ex) {
                    zze.zza("Could not find file for Clearcut");
                    return;
                }
            }
            return;
        }
        try {
            try {
            label_5:
                fileOutputStream0.write(this.a(v).getBytes());
                goto label_20;
            }
            catch(IOException unused_ex) {
            }
            zze.zza("Could not write Clearcut to file.");
        }
        catch(Throwable throwable1) {
            goto label_16;
        }
        try {
            fileOutputStream0.close();
            return;
        }
        catch(IOException unused_ex) {
        }
        try {
            zze.zza("Could not close Clearcut output stream.");
        }
        catch(FileNotFoundException unused_ex) {
            zze.zza("Could not find file for Clearcut");
            return;
        }
        return;
        try {
        label_16:
            fileOutputStream0.close();
            throw throwable1;
        }
        catch(IOException unused_ex) {
            try {
                zze.zza("Could not close Clearcut output stream.");
                throw throwable1;
            }
            catch(FileNotFoundException unused_ex) {
                zze.zza("Could not find file for Clearcut");
                return;
            }
        }
        try {
        label_20:
            fileOutputStream0.close();
            return;
        }
        catch(IOException unused_ex) {
            try {
                zze.zza("Could not close Clearcut output stream.");
                return;
            }
            catch(FileNotFoundException unused_ex) {
            }
        }
        zze.zza("Could not find file for Clearcut");
    }

    public final void c(int v) {
        synchronized(this) {
            zzbfb zzbfb0 = this.b;
            zzbfb0.zzd();
            List list0 = zzbhz.zzb();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                String[] arr_s = ((String)object0).split(",");
                for(int v2 = 0; v2 < arr_s.length; ++v2) {
                    String s = arr_s[v2];
                    try {
                        arrayList0.add(Long.valueOf(s));
                    }
                    catch(NumberFormatException unused_ex) {
                        zze.zza("Experiment ID is not a number");
                    }
                }
            }
            zzbfb0.zzc(arrayList0);
            byte[] arr_b = ((zzbfc)this.b.zzal()).zzaw();
            zzbdr zzbdr0 = new zzbdr(this.a, arr_b);
            zzbdr0.zza(v - 1);
            zzbdr0.zzc();
            zze.zza(("Logging Event with event code : " + Integer.toString(v - 1, 10)));
        }
    }

    public static zzbdm zza() {
        return new zzbdm();
    }

    public final void zzb(zzbdl zzbdl0) {
        synchronized(this) {
            if(this.c) {
                try {
                    zzbdl0.zza(this.b);
                }
                catch(NullPointerException nullPointerException0) {
                    zzt.zzo().zzt(nullPointerException0, "AdMobClearcutLogger.modify");
                }
            }
        }
    }

    public final void zzc(int v) {
        synchronized(this) {
            if(!this.c) {
                return;
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzdW)).booleanValue()) {
                this.b(v);
                return;
            }
            this.c(v);
        }
    }
}

