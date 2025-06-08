package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class zzfbl {
    public final String zzA;
    public final zzccg zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfcg zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbyb zzae;
    public final boolean zzaf;
    public final zzs zzag;
    public final String zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final JSONObject zzal;
    public final boolean zzam;
    public final String zzan;
    public final boolean zzao;
    public final String zzap;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzcax zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfbq zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    public zzfbl(JsonReader jsonReader0) {
        List list29;
        List list0 = Collections.emptyList();
        List list1 = Collections.emptyList();
        List list2 = Collections.emptyList();
        List list3 = Collections.emptyList();
        List list4 = Collections.emptyList();
        List list5 = Collections.emptyList();
        List list6 = Collections.emptyList();
        List list7 = Collections.emptyList();
        List list8 = Collections.emptyList();
        List list9 = Collections.emptyList();
        List list10 = Collections.emptyList();
        List list11 = Collections.emptyList();
        List list12 = Collections.emptyList();
        List list13 = Collections.emptyList();
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        jsonReader0.beginObject();
        JSONObject jSONObject6 = jSONObject0;
        JSONObject jSONObject7 = jSONObject1;
        JSONObject jSONObject8 = jSONObject2;
        JSONObject jSONObject9 = jSONObject3;
        JSONObject jSONObject10 = jSONObject4;
        JSONObject jSONObject11 = jSONObject5;
        List list14 = zzfrj.zzo();
        String s = "";
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String s6 = "";
        String s7 = "";
        String s8 = "";
        String s9 = "";
        String s10 = "";
        String s11 = "";
        String s12 = "";
        String s13 = "";
        String s14 = "";
        String s15 = "";
        String s16 = "";
        zzcax zzcax0 = null;
        zzfbq zzfbq0 = null;
        zzccg zzccg0 = null;
        zzbyb zzbyb0 = null;
        zzs zzs0 = null;
        String s17 = null;
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int v3 = -1;
        int v4 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int v5 = 0;
        int v6 = -1;
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        List list15 = list13;
        List list16 = list12;
        List list17 = list11;
        List list18 = list10;
        List list19 = list9;
        List list20 = list8;
        List list21 = list7;
        List list22 = list6;
        List list23 = list5;
        List list24 = list4;
        List list25 = list3;
        List list26 = list2;
        List list27 = list1;
        List list28 = list0;
        while(jsonReader0.hasNext()) {
            String s18 = jsonReader0.nextName();
            String s19 = s18 == null ? "" : s18;
            switch(s19.hashCode()) {
                case 0x808DB56D: {
                    list29 = list15;
                    if(s19.equals("ad_source_instance_name")) {
                        if(((Boolean)zzbhz.zzfL.zzl()).booleanValue()) {
                            s14 = jsonReader0.nextString();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_415;
                    }
                    break;
                }
                case 0x89F2A0DF: {
                    list29 = list15;
                    if(s19.equals("debug_signals")) {
                        jSONObject7 = zzbu.zzh(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0x8AD8AA29: {
                    list29 = list15;
                    if(s19.equals("omid_settings")) {
                        jSONObject9 = zzbu.zzh(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0x93FE39FC: {
                    list29 = list15;
                    if(s19.equals("play_prewarm_options")) {
                        zzbyb0 = zzbyb.zza(zzbu.zzh(jsonReader0));
                        goto label_415;
                    }
                    break;
                }
                case 0x9615F213: {
                    list29 = list15;
                    if(s19.equals("ad_source_name")) {
                        if(((Boolean)zzbhz.zzfL.zzl()).booleanValue()) {
                            s12 = jsonReader0.nextString();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_415;
                    }
                    break;
                }
                case 0x9CE0CAC1: {
                    list29 = list15;
                    if(s19.equals("is_interscroller")) {
                        z12 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case -1620470467: {
                    list29 = list15;
                    if(s19.equals("backend_query_id")) {
                        s9 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case -1550155393: {
                    list29 = list15;
                    if(s19.equals("nofill_urls")) {
                        list20 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case -1440104884: {
                    list29 = list15;
                    if(s19.equals("is_custom_close_blocked")) {
                        z5 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0xAA32F5D0: {
                    list29 = list15;
                    if(s19.equals("orientation")) {
                        String s20 = jsonReader0.nextString();
                        if("landscape".equalsIgnoreCase(s20)) {
                            v3 = 6;
                        }
                        else if("portrait".equalsIgnoreCase(s20)) {
                            v3 = 7;
                        }
                        else {
                            v3 = -1;
                        }
                        goto label_415;
                    }
                    break;
                }
                case 0xAAD3A8B5: {
                    list29 = list15;
                    if(s19.equals("enable_omid")) {
                        z7 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case -1406227629: {
                    list29 = list15;
                    if(s19.equals("buffer_click_url_as_ready_to_ping")) {
                        z16 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0xAC540548: {
                    list29 = list15;
                    if(s19.equals("showable_impression_type")) {
                        v5 = jsonReader0.nextInt();
                        goto label_415;
                    }
                    break;
                }
                case 0xAE04DC9B: {
                    list29 = list15;
                    if(s19.equals("ad_cover")) {
                        jSONObject10 = zzbu.zzh(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case -1360811658: {
                    if(s19.equals("ad_sizes")) {
                        list15 = zzfbm.a(jsonReader0);
                        continue;
                    }
                    else {
                        list29 = list15;
                        break;
                    }
                    goto label_170;
                }
                case -1306015996: {
                label_170:
                    list29 = list15;
                    if(s19.equals("adapters")) {
                        list16 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case -1303332046: {
                    list29 = list15;
                    if(s19.equals("test_mode_enabled")) {
                        z4 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case -1289032093: {
                    list29 = list15;
                    if(s19.equals("extras")) {
                        jSONObject8 = zzbu.zzh(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case -1240082064: {
                    list29 = list15;
                    if(s19.equals("ad_event_value")) {
                        zzs0 = zzs.zza(zzbu.zzh(jsonReader0));
                        goto label_415;
                    }
                    break;
                }
                case 0xB66FE42D: {
                    list29 = list15;
                    if(s19.equals("allow_pub_rendered_attribution")) {
                        z = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0xBA5F9700: {
                    list29 = list15;
                    if(s19.equals("presentation_error_urls")) {
                        list19 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case -1152230954: {
                    list29 = list15;
                    if(s19.equals("ad_type")) {
                        String s21 = jsonReader0.nextString();
                        if("banner".equals(s21)) {
                            v = 1;
                        }
                        else if("interstitial".equals(s21)) {
                            v = 2;
                        }
                        else if("native_express".equals(s21)) {
                            v = 3;
                        }
                        else if("native".equals(s21)) {
                            v = 4;
                        }
                        else if("rewarded".equals(s21)) {
                            v = 5;
                        }
                        else if("app_open_ad".equals(s21) || "app_open_ad_v2".equals(s21)) {
                            v = 6;
                        }
                        else if("rewarded_interstitial".equals(s21)) {
                            v = 7;
                        }
                        else {
                            v = 0;
                        }
                        goto label_415;
                    }
                    break;
                }
                case 0xBBA94761: {
                    list29 = list15;
                    if(s19.equals("is_scroll_aware")) {
                        z9 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0xBD7DA620: {
                    list29 = list15;
                    if(s19.equals("fill_urls")) {
                        list21 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0xBF82F4DA: {
                    list29 = list15;
                    if(s19.equals("allocation_id")) {
                        s2 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case -1078050970: {
                    list29 = list15;
                    if(s19.equals("video_complete_urls")) {
                        list22 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case -1051269058: {
                    list29 = list15;
                    if(s19.equals("active_view")) {
                        s5 = zzbu.zzh(jsonReader0).toString();
                        goto label_415;
                    }
                    break;
                }
                case -982608540: {
                    list29 = list15;
                    if(s19.equals("valid_from_timestamp")) {
                        s1 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 0xC60F987D: {
                    list29 = list15;
                    if(s19.equals("ad_source_instance_id")) {
                        if(((Boolean)zzbhz.zzfL.zzl()).booleanValue()) {
                            s15 = jsonReader0.nextString();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_415;
                    }
                    break;
                }
                case 0xD1B2113B: {
                    list29 = list15;
                    if(s19.equals("click_urls")) {
                        list27 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0xDF8FE939: {
                    list29 = list15;
                    if(s19.equals("safe_browsing")) {
                        zzccg0 = zzccg.zza(zzbu.zzh(jsonReader0));
                        goto label_415;
                    }
                    break;
                }
                case 0xE5F30977: {
                    list29 = list15;
                    if(s19.equals("imp_urls")) {
                        list26 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case -404433734: {
                    list29 = list15;
                    if(s19.equals("rtb_native_required_assets")) {
                        jSONObject11 = zzbu.zzh(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case -404326515: {
                    list29 = list15;
                    if(s19.equals("render_timeout_ms")) {
                        v4 = jsonReader0.nextInt();
                        goto label_415;
                    }
                    break;
                }
                case 0xE84B81F5: {
                    list29 = list15;
                    if(s19.equals("ad_close_time_ms")) {
                        v6 = jsonReader0.nextInt();
                        goto label_415;
                    }
                    break;
                }
                case -388807511: {
                    list29 = list15;
                    if(s19.equals("content_url")) {
                        s17 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 0xE9F5B450: {
                    list29 = list15;
                    if(s19.equals("is_close_button_enabled")) {
                        z11 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0xF347050C: {
                    list29 = list15;
                    if(s19.equals("force_disable_hardware_acceleration")) {
                        z15 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case -213424028: {
                    list29 = list15;
                    if(s19.equals("watermark")) {
                        s8 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case -180214626: {
                    list29 = list15;
                    if(s19.equals("native_required_asset_viewability")) {
                        z14 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0xF6C8BE34: {
                    list29 = list15;
                    if(s19.equals("is_offline_ad")) {
                        z13 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0xFE40547A: {
                    list29 = list15;
                    if(s19.equals("allow_custom_click_gesture")) {
                        z2 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 3107: {
                    list29 = list15;
                    if(s19.equals("ad")) {
                        zzfbq0 = new zzfbq(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0xD1B: {
                    list29 = list15;
                    if(s19.equals("id")) {
                        s3 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 3076010: {
                    list29 = list15;
                    if(s19.equals("data")) {
                        jSONObject6 = zzbu.zzh(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0x23640CB: {
                    list29 = list15;
                    if(s19.equals("request_id")) {
                        s16 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 0x3C44B50: {
                    list29 = list15;
                    if(s19.equals("render_test_label")) {
                        z3 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0x6674F9B: {
                    list29 = list15;
                    if(s19.equals("qdata")) {
                        s4 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 230323073: {
                    list29 = list15;
                    if(s19.equals("ad_load_urls")) {
                        list25 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0x18F0294B: {
                    list29 = list15;
                    if(s19.equals("is_closable_area_disabled")) {
                        z6 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0x20BBC660: {
                    list29 = list15;
                    if(s19.equals("presentation_error_timeout_ms")) {
                        v2 = jsonReader0.nextInt();
                        goto label_415;
                    }
                    break;
                }
                case 0x239CB9FC: {
                    list29 = list15;
                    if(s19.equals("debug_dialog_string")) {
                        s6 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 0x2CFEAB54: {
                    list29 = list15;
                    if(s19.equals("container_sizes")) {
                        list17 = zzfbm.a(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0x2F2793B0: {
                    list29 = list15;
                    if(s19.equals("impression_type")) {
                        int v7 = jsonReader0.nextInt();
                        v1 = v7 == 0 || v7 == 1 ? v7 : 0;
                        goto label_415;
                    }
                    break;
                }
                case 1010584092: {
                    list29 = list15;
                    if(s19.equals("transaction_id")) {
                        s = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 1100650276: {
                    list29 = list15;
                    if(s19.equals("rewards")) {
                        zzcax0 = zzcax.zza(zzbu.zze(jsonReader0));
                        goto label_415;
                    }
                    break;
                }
                case 1186014765: {
                    list29 = list15;
                    if(s19.equals("cache_hit_urls")) {
                        list14 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0x4EC7DC6F: {
                    list29 = list15;
                    if(s19.equals("allow_pub_owned_ad_view")) {
                        z1 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0x55AAC6A3: {
                    list29 = list15;
                    if(s19.equals("ad_source_id")) {
                        if(((Boolean)zzbhz.zzfL.zzl()).booleanValue()) {
                            s13 = jsonReader0.nextString();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_415;
                    }
                    break;
                }
                case 0x619B1543: {
                    list29 = list15;
                    if(s19.equals("bid_response")) {
                        s7 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 0x61B080E5: {
                    list29 = list15;
                    if(s19.equals("video_start_urls")) {
                        list24 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0x6483313F: {
                    list29 = list15;
                    if(s19.equals("ad_network_class_name")) {
                        s11 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 0x64A20A30: {
                    list29 = list15;
                    if(s19.equals("video_reward_urls")) {
                        list23 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 1799285870: {
                    list29 = list15;
                    if(s19.equals("use_third_party_container_height")) {
                        z10 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 0x6DA6D810: {
                    list29 = list15;
                    if(s19.equals("renderers")) {
                        list28 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                case 0x6FC8B8D3: {
                    list29 = list15;
                    if(s19.equals("is_analytics_logging_enabled")) {
                        z8 = jsonReader0.nextBoolean();
                        goto label_415;
                    }
                    break;
                }
                case 2068142375: {
                    list29 = list15;
                    if(s19.equals("rule_line_external_id")) {
                        s10 = jsonReader0.nextString();
                        goto label_415;
                    }
                    break;
                }
                case 2072888499: {
                    list29 = list15;
                    if(s19.equals("manual_tracking_urls")) {
                        list18 = zzbu.zzd(jsonReader0);
                        goto label_415;
                    }
                    break;
                }
                default: {
                    list29 = list15;
                }
            }
            jsonReader0.skipValue();
        label_415:
            list15 = list29;
        }
        jsonReader0.endObject();
        this.zza = list28;
        this.zzb = v;
        this.zzc = list27;
        this.zzd = list26;
        this.zzg = list25;
        this.zzf = v1;
        this.zzh = list24;
        this.zzi = list23;
        this.zzj = list22;
        this.zzk = s;
        this.zzl = s1;
        this.zzm = zzcax0;
        this.zzn = list21;
        this.zzo = list20;
        this.zzp = list19;
        this.zzq = list18;
        this.zzr = v2;
        this.zzs = list17;
        this.zzt = zzfbq0;
        this.zzu = list16;
        this.zzv = list15;
        this.zzx = s2;
        this.zzw = jSONObject6;
        this.zzy = s3;
        this.zzz = s4;
        this.zzA = s5;
        this.zzB = zzccg0;
        this.zzC = s6;
        this.zzD = jSONObject7;
        this.zzE = jSONObject8;
        this.zzK = z;
        this.zzL = z1;
        this.zzM = z2;
        this.zzN = z3;
        this.zzO = z4;
        this.zzP = z5;
        this.zzQ = z6;
        this.zzR = v3;
        this.zzS = v4;
        this.zzU = z7;
        this.zzV = s7;
        this.zzW = new zzfcg(jSONObject9);
        this.zzX = z8;
        this.zzY = z9;
        this.zzZ = v5;
        this.zzaa = s8;
        this.zzab = v6;
        this.zzac = s9;
        this.zzad = z10;
        this.zzae = zzbyb0;
        this.zzaf = z11;
        this.zzag = zzs0;
        this.zzah = s10;
        this.zzai = z12;
        this.zzaj = jSONObject10;
        this.zzF = s11;
        this.zzG = s12;
        this.zzH = s13;
        this.zzI = s14;
        this.zzJ = s15;
        this.zzak = z13;
        this.zzal = jSONObject11;
        this.zzam = z14;
        this.zzan = s17;
        this.zzao = z15;
        this.zze = list14;
        this.zzT = z16;
        this.zzap = s16;
    }

    public static String zza(int v) {
        switch(v) {
            case 1: {
                return "BANNER";
            }
            case 2: {
                return "INTERSTITIAL";
            }
            case 3: {
                return "NATIVE_EXPRESS";
            }
            case 4: {
                return "NATIVE";
            }
            case 5: {
                return "REWARDED";
            }
            case 6: {
                return "APP_OPEN_AD";
            }
            case 7: {
                return "REWARDED_INTERSTITIAL";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }
}

