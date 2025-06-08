package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzyn implements zzyy {
    public static final int[] a;
    public static final Q b;

    static {
        zzyn.a = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
        zzyn.b = new Q();
    }

    public static final void a(int v, ArrayList arrayList0) {
        Constructor constructor0;
        zzyr zzyr0 = null;
        switch(v) {
            case 0: {
                arrayList0.add(new zzafp());
                return;
            }
            case 1: {
                arrayList0.add(new zzafs());
                return;
            }
            case 2: {
                arrayList0.add(new zzafv(0));
                return;
            }
            case 3: {
                arrayList0.add(new zzaag(0));
                return;
            }
            case 4: {
                Q q0 = zzyn.b;
                synchronized(((AtomicBoolean)q0.j)) {
                    if(!((AtomicBoolean)q0.j).get()) {
                        try {
                            Object object0 = Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null);
                            if(Boolean.TRUE.equals(object0)) {
                                q0.k = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzyr.class).getConstructor(Integer.TYPE);
                            }
                        }
                        catch(ClassNotFoundException exception0) {
                            throw new RuntimeException("Error instantiating FLAC extension", exception0);
                        }
                        catch(Exception unused_ex) {
                        }
                        ((AtomicBoolean)q0.j).set(true);
                    }
                    constructor0 = (Constructor)q0.k;
                }
                if(constructor0 != null) {
                    try {
                        zzyr0 = (zzyr)constructor0.newInstance(0);
                    }
                    catch(Exception exception1) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", exception1);
                    }
                }
                if(zzyr0 != null) {
                    arrayList0.add(zzyr0);
                    return;
                }
                arrayList0.add(new zzaam(0));
                return;
            }
            case 5: {
                arrayList0.add(new zzaap());
                return;
            }
            case 6: {
                arrayList0.add(new zzadg(0));
                return;
            }
            case 7: {
                arrayList0.add(new zzado(0));
                return;
            }
            case 8: {
                arrayList0.add(new zzaej(0, null));
                arrayList0.add(new zzaeo(0));
                return;
            }
            case 9: {
                arrayList0.add(new zzafd());
                return;
            }
            case 10: {
                arrayList0.add(new zzagy());
                return;
            }
            case 11: {
                arrayList0.add(new zzahi(1, 0, 112800));
                return;
            }
            case 12: {
                arrayList0.add(new zzahu());
                return;
            }
            case 14: {
                arrayList0.add(new zzaau());
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyy
    public final zzyr[] zza() {
        synchronized(this) {
            return this.zzb(Uri.EMPTY, new HashMap());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyy
    public final zzyr[] zzb(Uri uri0, Map map0) {
        int v2;
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(14);
            List list0 = (List)map0.get("Content-Type");
            String s = list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
            int v1 = 10;
            if(s == null) {
            label_49:
                v2 = -1;
            }
            else {
                switch(zzbo.zze(s)) {
                    case "application/mp4": {
                        v2 = 8;
                        goto label_50;
                    }
                    case "application/webm": {
                        break;
                    }
                    case "audio/3gpp": {
                        v2 = 3;
                        goto label_50;
                    }
                    case "audio/ac3": {
                        v2 = 0;
                        goto label_50;
                    }
                    case "audio/ac4": {
                        v2 = 1;
                        goto label_50;
                    }
                    case "audio/amr": 
                    case "audio/amr-wb": {
                        v2 = 3;
                        goto label_50;
                    }
                    case "audio/eac3": 
                    case "audio/eac3-joc": {
                        v2 = 0;
                        goto label_50;
                    }
                    case "audio/flac": {
                        v2 = 4;
                        goto label_50;
                    }
                    case "audio/mp4": {
                        v2 = 8;
                        goto label_50;
                    }
                    case "audio/mpeg": {
                        v2 = 7;
                        goto label_50;
                    }
                    case "audio/ogg": {
                        v2 = 9;
                        goto label_50;
                    }
                    case "audio/wav": {
                        v2 = 12;
                        goto label_50;
                    }
                    case "audio/webm": {
                        break;
                    }
                    case "audio/x-matroska": {
                        break;
                    }
                    case "image/jpeg": {
                        v2 = 14;
                        goto label_50;
                    }
                    case "text/vtt": {
                        v2 = 13;
                        goto label_50;
                    }
                    case "video/mp2p": {
                        v2 = 10;
                        goto label_50;
                    }
                    case "video/mp2t": {
                        v2 = 11;
                        goto label_50;
                    }
                    case "video/mp4": {
                        v2 = 8;
                        goto label_50;
                    }
                    case "video/webm": {
                        break;
                    }
                    case "video/x-flv": {
                        v2 = 5;
                        goto label_50;
                    }
                    case "video/x-matroska": {
                        break;
                    }
                    default: {
                        goto label_49;
                    }
                }
                v2 = 6;
            }
        label_50:
            if(v2 != -1) {
                zzyn.a(v2, arrayList0);
            }
            String s1 = uri0.getLastPathSegment();
            if(s1 == null) {
                v1 = -1;
            }
            else if(s1.endsWith(".ac3") || s1.endsWith(".ec3")) {
                v1 = 0;
            }
            else if(s1.endsWith(".ac4")) {
                v1 = 1;
            }
            else if(s1.endsWith(".adts") || s1.endsWith(".aac")) {
                v1 = 2;
            }
            else if(s1.endsWith(".amr")) {
                v1 = 3;
            }
            else if(s1.endsWith(".flac")) {
                v1 = 4;
            }
            else if(s1.endsWith(".flv")) {
                v1 = 5;
            }
            else if(s1.startsWith(".mk", s1.length() - 4) || s1.endsWith(".webm")) {
                v1 = 6;
            }
            else if(s1.endsWith(".mp3")) {
                v1 = 7;
            }
            else if(s1.endsWith(".mp4") || s1.startsWith(".m4", s1.length() - 4) || s1.startsWith(".mp4", s1.length() - 5) || s1.startsWith(".cmf", s1.length() - 5)) {
                v1 = 8;
            }
            else if(s1.startsWith(".og", s1.length() - 4) || s1.endsWith(".opus")) {
                v1 = 9;
            }
            else if(!s1.endsWith(".ps") && !s1.endsWith(".mpeg") && !s1.endsWith(".mpg") && !s1.endsWith(".m2p")) {
                if(s1.endsWith(".ts") || s1.startsWith(".ts", s1.length() - 4)) {
                    v1 = 11;
                }
                else if(s1.endsWith(".wav") || s1.endsWith(".wave")) {
                    v1 = 12;
                }
                else if(s1.endsWith(".vtt") || s1.endsWith(".webvtt")) {
                    v1 = 13;
                }
                else if(!s1.endsWith(".jpg") && !s1.endsWith(".jpeg")) {
                    v1 = -1;
                }
                else {
                    v1 = 14;
                }
            }
            if(v1 != -1 && v1 != v2) {
                zzyn.a(v1, arrayList0);
            }
            int[] arr_v = zzyn.a;
            for(int v3 = 0; v3 < 14; ++v3) {
                int v4 = arr_v[v3];
                if(v4 != v2 && v4 != v1) {
                    zzyn.a(v4, arrayList0);
                }
            }
            return (zzyr[])arrayList0.toArray(new zzyr[arrayList0.size()]);
        }
    }
}

