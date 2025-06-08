package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class zzbie {
    public final ArrayBlockingQueue a;
    public final LinkedHashMap b;
    public final HashMap c;
    public String d;
    public Context e;
    public String f;
    public final HashSet g;
    public AtomicBoolean h;
    public File i;

    public zzbie() {
        this.a = new ArrayBlockingQueue(100);
        this.b = new LinkedHashMap();
        this.c = new HashMap();
        this.g = new HashSet(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));
    }

    public final LinkedHashMap a(LinkedHashMap linkedHashMap0, Map map0) {
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(linkedHashMap0);
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            String s1 = (String)((Map.Entry)object0).getValue();
            String s2 = (String)linkedHashMap1.get(s);
            linkedHashMap1.put(s, this.zza(s).zza(s2, s1));
        }
        return linkedHashMap1;
    }

    public final void b(LinkedHashMap linkedHashMap0, zzbin zzbin0) {
        FileOutputStream fileOutputStream0;
        Uri.Builder uri$Builder0 = Uri.parse(this.d).buildUpon();
        for(Object object0: linkedHashMap0.entrySet()) {
            uri$Builder0.appendQueryParameter(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        String s = uri$Builder0.build().toString();
        if(zzbin0 != null) {
            StringBuilder stringBuilder0 = new StringBuilder(s);
            if(!TextUtils.isEmpty(zzbin0.zzb())) {
                stringBuilder0.append("&it=");
                stringBuilder0.append(zzbin0.zzb());
            }
            if(!TextUtils.isEmpty(zzbin0.zza())) {
                stringBuilder0.append("&blat=");
                stringBuilder0.append(zzbin0.zza());
            }
            s = stringBuilder0.toString();
        }
        if(this.h.get()) {
            File file0 = this.i;
            if(file0 != null) {
                try {
                    try {
                        fileOutputStream0 = null;
                        fileOutputStream0 = new FileOutputStream(file0, true);
                        fileOutputStream0.write(s.getBytes());
                        fileOutputStream0.write(10);
                        goto label_39;
                    }
                    catch(IOException iOException0) {
                    }
                    zzcfi.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", iOException0);
                    if(fileOutputStream0 != null) {
                        goto label_27;
                    }
                    return;
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
                try {
                label_27:
                    fileOutputStream0.close();
                    return;
                }
                catch(IOException iOException1) {
                    zzcfi.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException1);
                }
                return;
            label_33:
                if(fileOutputStream0 != null) {
                    try {
                        fileOutputStream0.close();
                    }
                    catch(IOException iOException2) {
                        zzcfi.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException2);
                    }
                }
                throw throwable0;
                try {
                label_39:
                    fileOutputStream0.close();
                }
                catch(IOException iOException3) {
                    zzcfi.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException3);
                }
                return;
            }
            zzcfi.zzj("CsiReporter: File doesn\'t exists. Cannot write CSI data to file.");
            return;
        }
        zzs.zzG(this.e, this.f, s);
    }

    public final zzbik zza(String s) {
        zzbik zzbik0 = (zzbik)this.c.get(s);
        return zzbik0 == null ? zzbik.zza : zzbik0;
    }

    public final void zzd(Context context0, String s, String s1, Map map0) {
        this.e = context0;
        this.f = s;
        this.d = s1;
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        this.h = atomicBoolean0;
        atomicBoolean0.set(((Boolean)zzbjk.zzc.zze()).booleanValue());
        if(this.h.get()) {
            File file0 = Environment.getExternalStorageDirectory();
            if(file0 != null) {
                this.i = new File(file0, "sdk_csi_data.txt");
            }
        }
        for(Object object0: map0.entrySet()) {
            String s2 = (String)((Map.Entry)object0).getKey();
            String s3 = (String)((Map.Entry)object0).getValue();
            this.b.put(s2, s3);
        }
        zzbid zzbid0 = () -> {
            zzbin zzbin0;
            zzbio zzbio0;
            while(true) {
                try {
                label_0:
                    zzbio0 = (zzbio)this.a.take();
                    zzbin0 = zzbio0.zza();
                }
                catch(InterruptedException interruptedException0) {
                    zzcfi.zzk("CsiReporter:reporter interrupted", interruptedException0);
                    return;
                }
                if(TextUtils.isEmpty(zzbin0.zzb())) {
                    goto label_0;
                }
                Map map0 = zzbio0.zzb();
                this.b(this.a(this.b, map0), zzbin0);
            }
        };
        zzcfv.zza.execute(zzbid0);
        this.c.put("action", zzbik.zzb);
        this.c.put("ad_format", zzbik.zzb);
        this.c.put("e", zzbik.zzc);
    }

    public final void zze(String s) {
        if(this.g.contains(s)) {
            return;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("sdkVersion", this.f);
        linkedHashMap0.put("ue", s);
        this.b(this.a(this.b, linkedHashMap0), null);
    }

    public final boolean zzf(zzbio zzbio0) {
        return this.a.offer(zzbio0);
    }
}

