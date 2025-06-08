package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class zzch {
    public static final HashMap a;
    public static List b;
    public static final Object c;

    static {
        zzch.a = new HashMap();
        zzch.c = new Object();
    }

    public static Integer[] a(Range range0) {
        return new Integer[]{((Integer)range0.getLower()), ((Integer)range0.getUpper())};
    }

    public static List zza(String s) {
        Object object0 = zzch.c;
        synchronized(object0) {
            HashMap hashMap0 = zzch.a;
            if(hashMap0.containsKey(s)) {
                return (List)hashMap0.get(s);
            }
            try {
                __monitor_enter(object0);
            }
            catch(RuntimeException | LinkageError runtimeException0) {
                goto label_53;
            }
            try {
                if(zzch.b == null) {
                    zzch.b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                try {
                    __monitor_exit(object0);
                    throw throwable0;
                label_18:
                    __monitor_exit(object0);
                    List list1 = new ArrayList();
                    for(Object object1: zzch.b) {
                        MediaCodecInfo mediaCodecInfo0 = (MediaCodecInfo)object1;
                        if(!mediaCodecInfo0.isEncoder() && Arrays.asList(mediaCodecInfo0.getSupportedTypes()).contains(s)) {
                            HashMap hashMap1 = new HashMap();
                            hashMap1.put("codecName", mediaCodecInfo0.getName());
                            MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = mediaCodecInfo0.getCapabilitiesForType(s);
                            ArrayList arrayList0 = new ArrayList();
                            MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = mediaCodecInfo$CodecCapabilities0.profileLevels;
                            for(int v1 = 0; v1 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v1) {
                                MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel0 = arr_mediaCodecInfo$CodecProfileLevel[v1];
                                arrayList0.add(new Integer[]{mediaCodecInfo$CodecProfileLevel0.profile, mediaCodecInfo$CodecProfileLevel0.level});
                            }
                            hashMap1.put("profileLevels", arrayList0);
                            int v2 = Build.VERSION.SDK_INT;
                            MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
                            hashMap1.put("bitRatesBps", zzch.a(mediaCodecInfo$VideoCapabilities0.getBitrateRange()));
                            hashMap1.put("widthAlignment", mediaCodecInfo$VideoCapabilities0.getWidthAlignment());
                            hashMap1.put("heightAlignment", mediaCodecInfo$VideoCapabilities0.getHeightAlignment());
                            hashMap1.put("frameRates", zzch.a(mediaCodecInfo$VideoCapabilities0.getSupportedFrameRates()));
                            hashMap1.put("widths", zzch.a(mediaCodecInfo$VideoCapabilities0.getSupportedWidths()));
                            hashMap1.put("heights", zzch.a(mediaCodecInfo$VideoCapabilities0.getSupportedHeights()));
                            if(v2 >= 23) {
                                hashMap1.put("instancesLimit", mediaCodecInfo$CodecCapabilities0.getMaxSupportedInstances());
                            }
                            ((ArrayList)list1).add(hashMap1);
                        }
                    }
                    zzch.a.put(s, list1);
                    return list1;
                }
                catch(RuntimeException | LinkageError runtimeException0) {
                }
            }
        label_53:
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error", runtimeException0.getClass().getSimpleName());
            List list2 = new ArrayList();
            ((ArrayList)list2).add(hashMap2);
            zzch.a.put(s, list2);
            return list2;
        }
    }
}

