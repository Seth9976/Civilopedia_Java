package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzecs implements zzffi {
    public final Context a;
    public final String b;

    public zzecs(Context context0, String s, zzcah zzcah0, int v, byte[] arr_b) {
        this.a = context0;
        this.b = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) throws Exception {
        return this.zzb(((zzecq)object0));
    }

    public final zzecr zzb(zzecq zzecq0) throws zzdzl {
        String s3;
        InputStreamReader inputStreamReader0;
        URL uRL1;
        zzcfh zzcfh0;
        BufferedOutputStream bufferedOutputStream1;
        BufferedOutputStream bufferedOutputStream0;
        HttpURLConnection httpURLConnection0;
        int v2;
        HashMap hashMap0;
        URL uRL0;
        zzecr zzecr0;
        int v = zzecq0.zzb;
        Map map0 = zzecq0.zzc;
        byte[] arr_b = zzecq0.zzd;
        String s = zzecq0.zze;
        long v1 = zzt.zzA().elapsedRealtime();
        try {
            zzecr0 = new zzecr();
            zzcfi.zzi(("SDK version: " + this.b));
            zzcfi.zze(("AdRequestServiceImpl: Sending request: " + zzecq0.zza));
            uRL0 = new URL(zzecq0.zza);
            hashMap0 = new HashMap();
            v2 = 0;
            while(true) {
            label_11:
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                break;
            }
        }
        catch(IOException iOException0) {
            goto label_103;
        }
        try {
            zzt.zzp().zze(this.a, this.b, false, httpURLConnection0, false, v);
            for(Object object0: map0.entrySet()) {
                httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            if(!TextUtils.isEmpty(s)) {
                httpURLConnection0.setRequestProperty("Content-Type", s);
            }
            bufferedOutputStream0 = null;
            if(arr_b.length > 0) {
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
                goto label_24;
            }
            goto label_35;
        }
        catch(zzdzl zzdzl0) {
            goto label_94;
        }
        catch(Throwable throwable0) {
            goto label_98;
        }
        try {
        label_24:
            bufferedOutputStream1 = new BufferedOutputStream(httpURLConnection0.getOutputStream());
        }
        catch(Throwable throwable1) {
            try {
                goto label_32;
            }
            catch(zzdzl zzdzl0) {
                goto label_94;
            }
            catch(Throwable throwable0) {
                goto label_98;
            }
        }
        try {
            bufferedOutputStream1.write(arr_b);
            goto label_34;
        }
        catch(Throwable throwable1) {
            try {
                bufferedOutputStream0 = bufferedOutputStream1;
            label_32:
                IOUtils.closeQuietly(bufferedOutputStream0);
                throw throwable1;
            label_34:
                IOUtils.closeQuietly(bufferedOutputStream1);
            label_35:
                zzcfh0 = new zzcfh(null);
                zzcfh0.zzc(httpURLConnection0, arr_b);
                int v3 = httpURLConnection0.getResponseCode();
                for(Object object1: httpURLConnection0.getHeaderFields().entrySet()) {
                    String s1 = (String)((Map.Entry)object1).getKey();
                    List list0 = (List)((Map.Entry)object1).getValue();
                    if(hashMap0.containsKey(s1)) {
                        ((List)hashMap0.get(s1)).addAll(list0);
                    }
                    else {
                        hashMap0.put(s1, new ArrayList(list0));
                    }
                }
                zzcfh0.zze(httpURLConnection0, v3);
                zzecr0.zza = v3;
                zzecr0.zzb = hashMap0;
                zzecr0.zzc = "";
                if(v3 >= 200 && v3 < 300) {
                    goto label_68;
                }
                if(v3 < 300 || v3 >= 400) {
                    zzcfi.zzj(("Received error HTTP response code: " + v3));
                    throw new zzdzl(1, "Received error HTTP response code: " + v3);
                }
                String s2 = httpURLConnection0.getHeaderField("Location");
                if(TextUtils.isEmpty(s2)) {
                    zzcfi.zzj("No location header to follow redirect.");
                    throw new zzdzl(1, "No location header to follow redirect");
                }
                uRL1 = new URL(s2);
                if(v2 + 1 > ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzea))))) {
                    zzcfi.zzj("Too many redirects.");
                    throw new zzdzl(1, "Too many redirects");
                }
            }
            catch(zzdzl zzdzl0) {
                goto label_94;
            }
            catch(Throwable throwable0) {
                goto label_98;
            }
        }
        try {
            httpURLConnection0.disconnect();
            ++v2;
            uRL0 = uRL1;
            goto label_11;
        }
        catch(IOException iOException0) {
            goto label_103;
        }
        try {
        label_68:
            inputStreamReader0 = new InputStreamReader(httpURLConnection0.getInputStream());
        }
        catch(Throwable throwable2) {
            goto label_82;
        }
        try {
            StringBuilder stringBuilder0 = new StringBuilder(0x2000);
            char[] arr_c = new char[0x800];
            int v4;
            while((v4 = inputStreamReader0.read(arr_c)) != -1) {
                stringBuilder0.append(arr_c, 0, v4);
            }
            s3 = stringBuilder0.toString();
            goto label_84;
        }
        catch(Throwable throwable2) {
        }
        bufferedOutputStream0 = inputStreamReader0;
        try {
            try {
            label_82:
                IOUtils.closeQuietly(bufferedOutputStream0);
                throw throwable2;
            label_84:
                IOUtils.closeQuietly(inputStreamReader0);
                zzcfh0.zzg(s3);
                zzecr0.zzc = s3;
                if(TextUtils.isEmpty(s3) && !((Boolean)zzay.zzc().zzb(zzbhz.zzew)).booleanValue()) {
                    throw new zzdzl(3);
                }
                zzecr0.zzd = zzt.zzA().elapsedRealtime() - v1;
                goto label_100;
            }
            catch(zzdzl zzdzl0) {
            }
        label_94:
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzgX)).booleanValue()) {
                throw zzdzl0;
            }
            zzecr0.zzd = zzt.zzA().elapsedRealtime() - v1;
            goto label_100;
        }
        catch(Throwable throwable0) {
        }
        try {
        label_98:
            httpURLConnection0.disconnect();
            throw throwable0;
        label_100:
            httpURLConnection0.disconnect();
            return zzecr0;
        }
        catch(IOException iOException0) {
        label_103:
            String s4 = "Error while connecting to ad server: " + iOException0.getMessage();
            zzcfi.zzj(s4);
            throw new zzdzl(1, s4, iOException0);
        }
    }
}

