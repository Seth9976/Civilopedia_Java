package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzbw {
    public String zza;
    public String zzb;
    public String zzc;
    public List zzd;
    public List zze;
    public int zzf;

    public zzbw() {
        this.zzf = 1;
        this.zzd = Collections.emptyList();
        this.zze = Collections.emptyList();
    }

    public static zzbw zza(JsonReader jsonReader0) throws IOException {
        int v2;
        zzbw zzbw0 = new zzbw();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            int v = -1;
            int v1 = 5;
            switch(jsonReader0.nextName()) {
                case "actions": {
                    zzbw0.zze = new ArrayList();
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        zzbv zzbv0 = new zzbv();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                        alab1:
                            switch(jsonReader0.nextName()) {
                                case "action_type": {
                                    String s1 = jsonReader0.nextString();
                                    switch(s1) {
                                        case "CLEAR": {
                                            v2 = 3;
                                            break alab1;
                                        }
                                        case "UNKNOWN_ACTION_TYPE": {
                                            v2 = 1;
                                            break alab1;
                                        }
                                        case "WRITE": {
                                            v2 = 2;
                                            break alab1;
                                        }
                                        default: {
                                            throw new IOException((s1.length() == 0 ? new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ") : "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: " + s1));
                                        }
                                    }
                                }
                                case "args_json": {
                                    zzbv0.zza = jsonReader0.nextString();
                                    continue;
                                }
                                default: {
                                    jsonReader0.skipValue();
                                    continue;
                                }
                            }
                            zzbv0.zzb = v2;
                        }
                        jsonReader0.endObject();
                        zzbw0.zze.add(zzbv0);
                    }
                    jsonReader0.endArray();
                    break;
                }
                case "consent_form_base_url": {
                    zzbw0.zzb = jsonReader0.nextString();
                    break;
                }
                case "consent_form_payload": {
                    zzbw0.zza = jsonReader0.nextString();
                    break;
                }
                case "consent_signal": {
                    String s = jsonReader0.nextString();
                    switch(s) {
                        case "CONSENT_SIGNAL_COLLECT_CONSENT": {
                            v = 4;
                            break;
                        }
                        case "CONSENT_SIGNAL_ERROR": {
                            v = 6;
                            break;
                        }
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS": {
                            v = 2;
                            break;
                        }
                        case "CONSENT_SIGNAL_NOT_REQUIRED": {
                            v = 5;
                            break;
                        }
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS": {
                            v = 1;
                            break;
                        }
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION": {
                            v = 7;
                            break;
                        }
                        case "CONSENT_SIGNAL_SUFFICIENT": {
                            v = 3;
                            break;
                        }
                        case "CONSENT_SIGNAL_UNKNOWN": {
                            v = 0;
                        }
                    }
                    switch(v) {
                        case 0: {
                            v1 = 1;
                            break;
                        }
                        case 1: {
                            v1 = 2;
                            break;
                        }
                        case 2: {
                            v1 = 3;
                            break;
                        }
                        case 3: {
                            v1 = 4;
                            break;
                        }
                        case 4: {
                            break;
                        }
                        case 5: {
                            v1 = 6;
                            break;
                        }
                        case 6: {
                            v1 = 7;
                            break;
                        }
                        case 7: {
                            v1 = 8;
                            break;
                        }
                        default: {
                            throw new IOException((s.length() == 0 ? new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ") : "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: " + s));
                        }
                    }
                    zzbw0.zzf = v1;
                    break;
                }
                case "error_message": {
                    zzbw0.zzc = jsonReader0.nextString();
                    break;
                }
                case "request_info_keys": {
                    zzbw0.zzd = new ArrayList();
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        String s2 = jsonReader0.nextString();
                        zzbw0.zzd.add(s2);
                    }
                    jsonReader0.endArray();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return zzbw0;
    }
}

