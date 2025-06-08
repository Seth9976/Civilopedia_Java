package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzadf {
    public int a;
    public String b;
    public int zzA;
    public int zzB;
    public float zzC;
    public float zzD;
    public float zzE;
    public float zzF;
    public float zzG;
    public float zzH;
    public float zzI;
    public float zzJ;
    public float zzK;
    public float zzL;
    public byte[] zzM;
    public int zzN;
    public int zzO;
    public int zzP;
    public long zzQ;
    public long zzR;
    public zzzz zzS;
    public boolean zzT;
    public boolean zzU;
    public zzzy zzV;
    public int zzW;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzzx zzi;
    public byte[] zzj;
    public zzv zzk;
    public int zzl;
    public int zzm;
    public int zzn;
    public int zzo;
    public int zzp;
    public int zzq;
    public float zzr;
    public float zzs;
    public float zzt;
    public byte[] zzu;
    public int zzv;
    public boolean zzw;
    public int zzx;
    public int zzy;
    public int zzz;

    public final byte[] a(String s) {
        byte[] arr_b = this.zzj;
        if(arr_b == null) {
            throw zzbp.zza(("Missing CodecPrivate for codec " + s), null);
        }
        return arr_b;
    }

    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void zze(zzyu zzyu0, int v) throws zzbp {
        float f;
        int v22;
        Pair pair0;
        int v5;
        String s2;
        List list0;
        int v4;
        String s = this.zzb;
        int v1 = 4;
        int v2 = 2;
        int v3 = 0;
        switch(s) {
            case "A_AAC": {
                v4 = 13;
                break;
            }
            case "A_AC3": {
                v4 = 16;
                break;
            }
            case "A_DTS": {
                v4 = 19;
                break;
            }
            case "A_DTS/EXPRESS": {
                v4 = 20;
                break;
            }
            case "A_DTS/LOSSLESS": {
                v4 = 21;
                break;
            }
            case "A_EAC3": {
                v4 = 17;
                break;
            }
            case "A_FLAC": {
                v4 = 22;
                break;
            }
            case "A_MPEG/L2": {
                v4 = 14;
                break;
            }
            case "A_MPEG/L3": {
                v4 = 15;
                break;
            }
            case "A_MS/ACM": {
                v4 = 23;
                break;
            }
            case "A_OPUS": {
                v4 = 12;
                break;
            }
            case "A_PCM/FLOAT/IEEE": {
                v4 = 26;
                break;
            }
            case "A_PCM/INT/BIG": {
                v4 = 25;
                break;
            }
            case "A_PCM/INT/LIT": {
                v4 = 24;
                break;
            }
            case "A_TRUEHD": {
                v4 = 18;
                break;
            }
            case "A_VORBIS": {
                v4 = 11;
                break;
            }
            case "S_DVBSUB": {
                v4 = 0x20;
                break;
            }
            case "S_HDMV/PGS": {
                v4 = 0x1F;
                break;
            }
            case "S_TEXT/ASS": {
                v4 = 28;
                break;
            }
            case "S_TEXT/UTF8": {
                v4 = 27;
                break;
            }
            case "S_TEXT/WEBVTT": {
                v4 = 29;
                break;
            }
            case "S_VOBSUB": {
                v4 = 30;
                break;
            }
            case "V_AV1": {
                v4 = 2;
                break;
            }
            case "V_MPEG2": {
                v4 = 3;
                break;
            }
            case "V_MPEG4/ISO/AP": {
                v4 = 6;
                break;
            }
            case "V_MPEG4/ISO/ASP": {
                v4 = 5;
                break;
            }
            case "V_MPEG4/ISO/AVC": {
                v4 = 7;
                break;
            }
            case "V_MPEG4/ISO/SP": {
                v4 = 4;
                break;
            }
            case "V_MPEGH/ISO/HEVC": {
                v4 = 8;
                break;
            }
            case "V_MS/VFW/FOURCC": {
                v4 = 9;
                break;
            }
            case "V_THEORA": {
                v4 = 10;
                break;
            }
            case "V_VP8": {
                v4 = 0;
                break;
            }
            case "V_VP9": {
                v4 = 1;
                break;
            }
            default: {
                v4 = -1;
            }
        }
        String s1 = "audio/raw";
        byte[] arr_b = null;
        switch(v4) {
            case 0: {
                s1 = "video/x-vnd.on2.vp8";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 1: {
                s1 = "video/x-vnd.on2.vp9";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 2: {
                s1 = "video/av01";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 3: {
                s1 = "video/mpeg2";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                list0 = this.zzj == null ? null : Collections.singletonList(this.zzj);
                s1 = "video/mp4v-es";
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 7: {
                zzya zzya0 = zzya.zza(new zzdy(this.a(s)));
                this.zzW = zzya0.zzb;
                s1 = "video/avc";
                s2 = zzya0.zzf;
                list0 = zzya0.zza;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 8: {
                zzzh zzzh0 = zzzh.zza(new zzdy(this.a(s)));
                this.zzW = zzzh0.zzb;
                s1 = "video/hevc";
                s2 = zzzh0.zzd;
                list0 = zzzh0.zza;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 9: {
                zzdy zzdy0 = new zzdy(this.a(s));
                try {
                    zzdy0.zzG(16);
                    long v6 = zzdy0.zzq();
                    if(v6 == 1482049860L) {
                        goto label_140;
                    }
                    else if(v6 == 0x33363248L) {
                        pair0 = new Pair("video/3gpp", null);
                    }
                    else {
                        if(v6 == 0x31435657L) {
                            int v7 = zzdy0.zzc() + 20;
                            byte[] arr_b1 = zzdy0.zzH();
                            while(true) {
                                if(v7 >= arr_b1.length - 4) {
                                    throw zzbp.zza("Failed to find FourCC VC1 initialization data", null);
                                }
                                if(arr_b1[v7] == 0 && arr_b1[v7 + 1] == 0 && arr_b1[v7 + 2] == 1 && arr_b1[v7 + 3] == 15) {
                                    break;
                                }
                                ++v7;
                            }
                            pair0 = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(arr_b1, v7, arr_b1.length)));
                            goto label_143;
                        }
                        goto label_137;
                    }
                    goto label_143;
                }
                catch(ArrayIndexOutOfBoundsException unused_ex) {
                    throw zzbp.zza("Error parsing FourCC private data", null);
                }
            label_137:
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                pair0 = new Pair("video/x-unknown", null);
                goto label_143;
                try {
                label_140:
                    pair0 = new Pair("video/divx", null);
                }
                catch(ArrayIndexOutOfBoundsException unused_ex) {
                    throw zzbp.zza("Error parsing FourCC private data", null);
                }
            label_143:
                s1 = (String)pair0.first;
                list0 = (List)pair0.second;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 10: {
                s1 = "video/x-unknown";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 11: {
                byte[] arr_b2 = this.a(s);
                try {
                    if(arr_b2[0] != 2) {
                        throw zzbp.zza("Error parsing vorbis codec private", null);
                    }
                    int v8 = 1;
                    int v9 = 0;
                    int v10;
                    while((v10 = arr_b2[v8] & 0xFF) == 0xFF) {
                        v9 += 0xFF;
                        ++v8;
                    }
                    int v11 = v8 + 1;
                    int v12 = v9 + v10;
                    int v13 = 0;
                    int v14;
                    while((v14 = arr_b2[v11] & 0xFF) == 0xFF) {
                        v13 += 0xFF;
                        ++v11;
                    }
                    if(arr_b2[v11 + 1] != 1) {
                        throw zzbp.zza("Error parsing vorbis codec private", null);
                    }
                    byte[] arr_b3 = new byte[v12];
                    System.arraycopy(arr_b2, v11 + 1, arr_b3, 0, v12);
                    int v15 = v11 + 1 + v12;
                    if(arr_b2[v15] != 3) {
                        throw zzbp.zza("Error parsing vorbis codec private", null);
                    }
                    int v16 = v15 + (v13 + v14);
                    if(arr_b2[v16] != 5) {
                        throw zzbp.zza("Error parsing vorbis codec private", null);
                    }
                    int v17 = arr_b2.length - v16;
                    byte[] arr_b4 = new byte[v17];
                    System.arraycopy(arr_b2, v16, arr_b4, 0, v17);
                    list0 = new ArrayList(2);
                    ((ArrayList)list0).add(arr_b3);
                    ((ArrayList)list0).add(arr_b4);
                    s1 = "audio/vorbis";
                    v5 = 0x2000;
                }
                catch(ArrayIndexOutOfBoundsException unused_ex) {
                    throw zzbp.zza("Error parsing vorbis codec private", null);
                }
                s2 = null;
                v1 = -1;
                break;
            }
            case 12: {
                list0 = new ArrayList(3);
                ((ArrayList)list0).add(this.a(this.zzb));
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
                ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
                ((ArrayList)list0).add(byteBuffer0.order(byteOrder0).putLong(this.zzQ).array());
                ((ArrayList)list0).add(ByteBuffer.allocate(8).order(byteOrder0).putLong(this.zzR).array());
                s1 = "audio/opus";
                v5 = 5760;
                s2 = null;
                v1 = -1;
                break;
            }
            case 13: {
                list0 = Collections.singletonList(this.a(s));
                zzxs zzxs0 = zzxt.zza(this.zzj);
                this.zzP = zzxs0.zza;
                this.zzN = zzxs0.zzb;
                s1 = "audio/mp4a-latm";
                s2 = zzxs0.zzc;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 14: {
                s1 = "audio/mpeg-L2";
                goto label_216;
            }
            case 15: {
                s1 = "audio/mpeg";
            label_216:
                list0 = null;
                s2 = null;
                v5 = 0x1000;
                v1 = -1;
                break;
            }
            case 16: {
                s1 = "audio/ac3";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 17: {
                s1 = "audio/eac3";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 18: {
                this.zzS = new zzzz();
                s1 = "audio/true-hd";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 19: 
            case 20: {
                s1 = "audio/vnd.dts";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 21: {
                s1 = "audio/vnd.dts.hd";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 22: {
                list0 = Collections.singletonList(this.a(s));
                s1 = "audio/flac";
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 23: {
                zzdy zzdy1 = new zzdy(this.a(s));
                try {
                    int v18 = zzdy1.zzi();
                    if(v18 == 1) {
                        goto label_270;
                    }
                    else if(v18 == 0xFFFE) {
                        zzdy1.zzF(24);
                        if(zzdy1.zzr() != zzadg.g0.getMostSignificantBits() || zzdy1.zzr() != zzadg.g0.getLeastSignificantBits()) {
                            goto label_266;
                        }
                        else {
                            goto label_270;
                        }
                    }
                    else {
                        goto label_268;
                    }
                    break;
                }
                catch(ArrayIndexOutOfBoundsException unused_ex) {
                    throw zzbp.zza("Error parsing MS/ACM codec private", null);
                }
            label_266:
                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                goto label_297;
            label_268:
                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                goto label_297;
            label_270:
                v1 = zzeg.zzn(this.zzO);
                if(v1 == 0) {
                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    goto label_297;
                }
                else {
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    break;
                }
                break;
            }
            case 24: {
                v1 = zzeg.zzn(this.zzO);
                if(v1 == 0) {
                    Log.w("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    goto label_297;
                }
                else {
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    break;
                }
                break;
            }
            case 25: {
                int v19 = this.zzO;
                if(v19 == 8) {
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    v1 = 3;
                }
                else if(v19 == 16) {
                    v1 = 0x10000000;
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    break;
                }
                else {
                    Log.w("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + v19 + ". Setting mimeType to audio/x-unknown");
                    goto label_297;
                }
                break;
            }
            case 26: {
                int v20 = this.zzO;
                if(v20 == 0x20) {
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                }
                else {
                    Log.w("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + v20 + ". Setting mimeType to audio/x-unknown");
                label_297:
                    list0 = null;
                    s2 = null;
                    s1 = "audio/x-unknown";
                    v5 = -1;
                    v1 = -1;
                }
                break;
            }
            case 27: {
                s1 = "application/x-subrip";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 28: {
                byte[] arr_b5 = this.a(this.zzb);
                list0 = zzfrj.zzq(zzadg.d0, arr_b5);
                s1 = "text/x-ssa";
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 29: {
                s1 = "text/vtt";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 30: {
                list0 = zzfrj.zzp(this.a(s));
                s1 = "application/vobsub";
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 0x1F: {
                s1 = "application/pgs";
                list0 = null;
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            case 0x20: {
                byte[] arr_b6 = new byte[4];
                System.arraycopy(this.a(s), 0, arr_b6, 0, 4);
                list0 = zzfrj.zzp(arr_b6);
                s1 = "application/dvbsubs";
                s2 = null;
                v5 = -1;
                v1 = -1;
                break;
            }
            default: {
                throw zzbp.zza("Unrecognized codec identifier.", null);
            }
        }
        byte[] arr_b7 = this.zzM;
        if(arr_b7 != null) {
            zzyo zzyo0 = zzyo.zza(new zzdy(arr_b7));
            if(zzyo0 != null) {
                s2 = zzyo0.zza;
                s1 = "video/dolby-vision";
            }
        }
        boolean z = this.zzU;
        zzab zzab0 = new zzab();
        if(zzbo.zzg(s1)) {
            zzab0.zzw(this.zzN);
            zzab0.zzT(this.zzP);
            zzab0.zzN(v1);
            v2 = 1;
        }
        else if(zzbo.zzh(s1)) {
            if(this.zzp == 0) {
                int v21 = this.zzn;
                v22 = -1;
                if(v21 == -1) {
                    v21 = this.zzl;
                }
                this.zzn = v21;
                this.zzo = this.zzo == -1 ? this.zzm : this.zzo;
            }
            else {
                v22 = -1;
            }
            int v23 = this.zzn;
            if(v23 == -1) {
                f = -1.0f;
            }
            else {
                int v24 = this.zzo;
                f = v24 == -1 ? -1.0f : ((float)(this.zzm * v23)) / ((float)(this.zzl * v24));
            }
            if(this.zzw) {
                if(this.zzC != -1.0f && this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f) {
                    arr_b = new byte[25];
                    ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b).order(ByteOrder.LITTLE_ENDIAN);
                    byteBuffer1.put(0);
                    byteBuffer1.putShort(((short)(((int)(this.zzC * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzD * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzE * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzF * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzG * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzH * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzI * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzJ * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzK + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzL + 0.5f)))));
                    byteBuffer1.putShort(((short)this.zzA));
                    byteBuffer1.putShort(((short)this.zzB));
                }
                arr_b = new zzo(this.zzx, this.zzz, this.zzy, arr_b);
            }
            String s3 = this.zza;
            if(s3 != null) {
                Map map0 = zzadg.h0;
                if(map0.containsKey(s3)) {
                    v22 = (int)(((Integer)map0.get(this.zza)));
                }
            }
            if(this.zzq != 0 || Float.compare(this.zzr, 0.0f) != 0 || Float.compare(this.zzs, 0.0f) != 0) {
                v3 = v22;
            }
            else if(Float.compare(this.zzt, 0.0f) != 0) {
                if(Float.compare(this.zzs, 90.0f) == 0) {
                    v3 = 90;
                }
                else if(Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                    v3 = 180;
                }
                else if(Float.compare(this.zzs, -90.0f) == 0) {
                    v3 = 270;
                }
                else {
                    v3 = v22;
                }
            }
            zzab0.zzX(this.zzl);
            zzab0.zzF(this.zzm);
            zzab0.zzP(f);
            zzab0.zzR(v3);
            zzab0.zzQ(this.zzu);
            zzab0.zzV(this.zzv);
            zzab0.zzy(((zzo)arr_b));
        }
        else if("application/x-subrip".equals(s1) || "text/x-ssa".equals(s1) || "text/vtt".equals(s1) || "application/vobsub".equals(s1) || "application/pgs".equals(s1) || "application/dvbsubs".equals(s1)) {
            v2 = 3;
        }
        else {
            throw zzbp.zza("Unexpected MIME type.", null);
        }
        if(this.zza != null && !zzadg.h0.containsKey(this.zza)) {
            zzab0.zzJ(this.zza);
        }
        zzab0.zzG(v);
        zzab0.zzS(s1);
        zzab0.zzL(v5);
        zzab0.zzK(this.b);
        zzab0.zzU(z);
        zzab0.zzI(list0);
        zzab0.zzx(s2);
        zzab0.zzB(this.zzk);
        zzad zzad0 = zzab0.zzY();
        zzzy zzzy0 = zzyu0.zzv(this.zzc, v2);
        this.zzV = zzzy0;
        zzzy0.zzk(zzad0);
    }
}

