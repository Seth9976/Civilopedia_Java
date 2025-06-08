package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import jeb.synthetic.FIN;

public class zzajq implements zzaiu {
    public final zzajs a;

    public zzajq(zzajp zzajp0) {
        zzajs zzajs0 = new zzajs(0x1000);
        super();
        this.a = zzajs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaiu
    public zzaix zza(zzajb zzajb0) throws zzajk {
        Q q0;
        byte[] arr_b2;
        byte[] arr_b1;
        int v6;
        zzakf zzakf0;
        zzajs zzajs0;
        InputStream inputStream0;
        List list0;
        int v4;
        zzajz zzajz1;
        boolean z;
        zzajz zzajz0;
        int v3;
        HttpURLConnection httpURLConnection0;
        HashMap hashMap1;
        Map map0;
        long v = SystemClock.elapsedRealtime();
        while(true) {
            Collections.emptyList();
            try {
                zzaik zzaik0 = zzajb0.zzd();
                if(zzaik0 == null) {
                    map0 = Collections.emptyMap();
                }
                else {
                    HashMap hashMap0 = new HashMap();
                    String s = zzaik0.zzb;
                    if(s != null) {
                        hashMap0.put("If-None-Match", s);
                    }
                    long v1 = zzaik0.zzd;
                    if(v1 > 0L) {
                        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss \'GMT\'", Locale.US);
                        simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap0.put("If-Modified-Since", simpleDateFormat0.format(new Date(v1)));
                    }
                    map0 = hashMap0;
                }
                hashMap1 = new HashMap();
                hashMap1.putAll(map0);
                hashMap1.putAll(zzajb0.zzl());
                URL uRL0 = new URL(zzajb0.zzk());
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                httpURLConnection0.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int v2 = zzajb0.zzb();
                httpURLConnection0.setConnectTimeout(v2);
                httpURLConnection0.setReadTimeout(v2);
                httpURLConnection0.setUseCaches(false);
                httpURLConnection0.setDoInput(true);
                "https".equals(uRL0.getProtocol());
            }
            catch(IOException iOException0) {
                goto label_64;
            }
            try {
                for(Object object0: hashMap1.keySet()) {
                    httpURLConnection0.setRequestProperty(((String)object0), ((String)hashMap1.get(((String)object0))));
                }
                if(zzajb0.zza() == 0) {
                    httpURLConnection0.setRequestMethod("GET");
                }
                else {
                    httpURLConnection0.setRequestMethod("POST");
                    byte[] arr_b = zzajb0.zzx();
                    if(arr_b != null) {
                        httpURLConnection0.setDoOutput(true);
                        if(!httpURLConnection0.getRequestProperties().containsKey("Content-Type")) {
                            httpURLConnection0.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                        }
                        DataOutputStream dataOutputStream0 = new DataOutputStream(httpURLConnection0.getOutputStream());
                        dataOutputStream0.write(arr_b);
                        dataOutputStream0.close();
                    }
                }
                v3 = httpURLConnection0.getResponseCode();
                if(v3 == -1) {
                    throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                }
                if((v3 < 100 || v3 >= 200) && (v3 != 204 && v3 != 304)) {
                    goto label_56;
                }
                else {
                    zzajz0 = new zzajz(v3, zzakc.a(httpURLConnection0.getHeaderFields()), -1, null);
                    goto label_54;
                }
                goto label_66;
            }
            catch(Throwable throwable0) {
                z = false;
                goto label_60;
            }
            try {
            label_54:
                httpURLConnection0.disconnect();
                goto label_66;
            }
            catch(IOException iOException0) {
                goto label_64;
            }
            try {
            label_56:
                zzajz0 = new zzajz(v3, zzakc.a(httpURLConnection0.getHeaderFields()), httpURLConnection0.getContentLength(), new v0(httpURLConnection0));
                goto label_66;
            }
            catch(Throwable throwable0) {
                z = true;
            }
            try {
            label_60:
                if(!z) {
                    httpURLConnection0.disconnect();
                }
                throw throwable0;
            }
            catch(IOException iOException0) {
            label_64:
                zzajz1 = null;
                goto label_124;
            }
            try {
            label_66:
                v4 = zzajz0.zzb();
                list0 = zzajz0.zzd();
                if(v4 == 304) {
                    long v5 = SystemClock.elapsedRealtime() - v;
                    zzaik zzaik1 = zzajb0.zzd();
                    if(zzaik1 == null) {
                        return new zzaix(304, null, true, v5, list0);
                    }
                    TreeSet treeSet0 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    if(!list0.isEmpty()) {
                        for(Object object1: list0) {
                            treeSet0.add(((zzait)object1).zza());
                        }
                    }
                    ArrayList arrayList0 = new ArrayList(list0);
                    List list1 = zzaik1.zzh;
                    if(list1 != null) {
                        if(!list1.isEmpty()) {
                            for(Object object3: zzaik1.zzh) {
                                zzait zzait0 = (zzait)object3;
                                if(!treeSet0.contains(zzait0.zza())) {
                                    arrayList0.add(zzait0);
                                }
                            }
                        }
                    }
                    else if(!zzaik1.zzg.isEmpty()) {
                        for(Object object2: zzaik1.zzg.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object2;
                            if(!treeSet0.contains(map$Entry0.getKey())) {
                                arrayList0.add(new zzait(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue())));
                            }
                        }
                    }
                    return new zzaix(304, zzaik1.zza, true, v5, arrayList0);
                }
                inputStream0 = zzajz0.zzc();
                if(inputStream0 == null) {
                    goto label_120;
                }
                else {
                    zzajs0 = this.a;
                    zzakf0 = new zzakf(zzajs0, zzajz0.zza());
                    v6 = FIN.finallyOpen$NT();
                    arr_b1 = zzajs0.zzb(0x400);
                    int v7;
                    while((v7 = inputStream0.read(arr_b1)) != -1) {
                        zzakf0.write(arr_b1, 0, v7);
                    }
                    arr_b2 = zzakf0.toByteArray();
                    goto label_112;
                }
                goto label_126;
            }
            catch(IOException iOException0) {
                goto label_123;
            }
            try {
            label_112:
                FIN.finallyCodeBegin$NT(v6);
                inputStream0.close();
                goto label_116;
            }
            catch(IOException unused_ex) {
                try {
                    zzajn.zzd("Error occurred when closing InputStream", new Object[0]);
                label_116:
                    zzajs0.zza(arr_b1);
                    zzakf0.close();
                    FIN.finallyCodeEnd$NT(v6);
                    goto label_126;
                label_120:
                    arr_b2 = new byte[0];
                    goto label_126;
                label_123:
                    zzajz1 = zzajz0;
                }
                catch(IOException iOException0) {
                    goto label_123;
                }
            }
        label_124:
            byte[] arr_b3 = null;
            goto label_140;
            try {
            label_126:
                long v8 = SystemClock.elapsedRealtime() - v;
                if(zzajn.zzb || v8 > 3000L) {
                    Long long0 = v8;
                    Integer integer0 = arr_b2 == null ? "null" : ((int)arr_b2.length);
                    zzajn.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[]{zzajb0, long0, integer0, v4, zzajb0.zzy().zza()});
                }
                if(v4 < 200 || v4 > 299) {
                    throw new IOException();
                }
                return new zzaix(v4, arr_b2, false, SystemClock.elapsedRealtime() - v, list0);
            }
            catch(IOException iOException0) {
                arr_b3 = arr_b2;
                zzajz1 = zzajz0;
            }
        label_140:
            if(iOException0 instanceof SocketTimeoutException) {
                q0 = new Q(4, "socket", new zzajj());
            }
            else {
                if(iOException0 instanceof MalformedURLException) {
                    break;
                }
                if(zzajz1 == null) {
                    throw new zzaiy(iOException0);
                }
                int v9 = zzajz1.zzb();
                zzajn.zzb("Unexpected response code %d for %s", new Object[]{v9, zzajb0.zzk()});
                if(arr_b3 == null) {
                    q0 = new Q(4, "network", new zzaiw());
                }
                else {
                    List list2 = zzajz1.zzd();
                    zzaix zzaix0 = new zzaix(v9, arr_b3, false, SystemClock.elapsedRealtime() - v, list2);
                    if(v9 != 401 && v9 != 403) {
                        if(v9 < 400 || v9 > 0x1F3) {
                            throw new zzaji(zzaix0);
                        }
                        throw new zzaio(zzaix0);
                    }
                    q0 = new Q(4, "auth", new zzaij(zzaix0));
                }
            }
            String s1 = (String)q0.j;
            zzaip zzaip0 = zzajb0.zzy();
            int v10 = zzajb0.zzb();
            try {
                zzaip0.zzc(((zzajk)q0.k));
            }
            catch(zzajk zzajk0) {
                zzajb0.zzm(s1 + "-timeout-giveup [timeout=" + v10 + "]");
                throw zzajk0;
            }
            zzajb0.zzm(s1 + "-retry [timeout=" + v10 + "]");
        }
        throw new RuntimeException("Bad URL " + zzajb0.zzk(), iOException0);
    }
}

