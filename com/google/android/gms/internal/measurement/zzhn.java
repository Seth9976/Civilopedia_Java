package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import p.k;

public final class zzhn {
    public static volatile zzif a;

    public static zzif zza(Context context0) {
        zzif zzif2;
        zzhg zzhg0;
        zzif zzif1;
        File file0;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0;
        zzif zzif0;
        synchronized(zzhn.class) {
            zzif0 = zzhn.a;
            if(zzif0 == null) {
                String s = Build.TAGS;
                if(!Build.TYPE.equals("eng") && !Build.TYPE.equals("userdebug")) {
                    zzif2 = zzif.zzc();
                    zzif0 = zzif2;
                    zzhn.a = zzif0;
                    return zzif0;
                }
                else if(s.contains("dev-keys") || s.contains("test-keys")) {
                    if(!context0.isDeviceProtectedStorage()) {
                        context0 = context0.createDeviceProtectedStorageContext();
                    }
                    strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                    goto label_10;
                }
                else {
                    zzif2 = zzif.zzc();
                }
                zzif0 = zzif2;
                zzhn.a = zzif0;
                return zzif0;
            }
            return zzif0;
        }
    label_10:
        StrictMode.allowThreadDiskWrites();
        try {
            file0 = new File(context0.getDir("phenotype_hermetic", 0), "overrides.txt");
        }
        catch(RuntimeException runtimeException0) {
            Log.e("HermeticFileOverrides", "no data dir", runtimeException0);
            zzif1 = zzif.zzc();
            goto label_18;
        }
        zzif1 = file0.exists() ? zzif.zzd(file0) : zzif.zzc();
    label_18:
        if(zzif1.zzb()) {
            File file1 = (File)zzif1.zza();
            try(BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)))) {
                k k0 = new k();
                HashMap hashMap0 = new HashMap();
                String s1;
                while((s1 = bufferedReader0.readLine()) != null) {
                    String[] arr_s = s1.split(" ", 3);
                    if(arr_s.length == 3) {
                        String s2 = new String(arr_s[0]);
                        String s3 = Uri.decode(new String(arr_s[1]));
                        String s4 = (String)hashMap0.get(arr_s[2]);
                        if(s4 == null) {
                            String s5 = new String(arr_s[2]);
                            s4 = Uri.decode(s5);
                            if(s4.length() < 0x400 || s4 == s5) {
                                hashMap0.put(s5, s4);
                            }
                        }
                        if(!k0.containsKey(s2)) {
                            k0.put(s2, new k());
                        }
                        ((k)k0.getOrDefault(s2, null)).put(s3, s4);
                    }
                    else {
                        Log.e("HermeticFileOverrides", "Invalid: " + s1);
                    }
                }
                Log.i("HermeticFileOverrides", "Parsed " + file1.toString());
                zzhg0 = new zzhg(k0);
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            zzif2 = zzif.zzd(zzhg0);
        }
        else {
            zzif2 = zzif.zzc();
        }
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        zzif0 = zzif2;
        zzhn.a = zzif0;
        return zzif0;
    }
}

