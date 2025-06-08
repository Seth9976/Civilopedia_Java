package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

public final class zzfbo {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfbn zzi;
    public final Bundle zzj;

    public zzfbo(JsonReader jsonReader0) {
        Bundle bundle1;
        Bundle bundle2;
        List list0 = Collections.emptyList();
        Bundle bundle0 = new Bundle();
        jsonReader0.beginObject();
        long v = 0L;
        zzfbn zzfbn0 = null;
        String s = "";
        String s1 = "";
        String s2 = "";
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s3 = jsonReader0.nextName();
            if("nofill_urls".equals(s3)) {
                list0 = zzbu.zzd(jsonReader0);
            }
            else if("refresh_interval".equals(s3)) {
                v1 = jsonReader0.nextInt();
            }
            else if("gws_query_id".equals(s3)) {
                s = jsonReader0.nextString();
            }
            else if("analytics_query_ad_event_id".equals(s3)) {
                s1 = jsonReader0.nextString();
            }
            else if("is_idless".equals(s3)) {
                z = jsonReader0.nextBoolean();
            }
            else if("response_code".equals(s3)) {
                v2 = jsonReader0.nextInt();
            }
            else if("latency".equals(s3)) {
                v = jsonReader0.nextLong();
            }
            else {
                if(!((Boolean)zzay.zzc().zzb(zzbhz.zzgW)).booleanValue() || !"public_error".equals(s3) || jsonReader0.peek() != JsonToken.BEGIN_OBJECT) {
                    bundle1 = bundle0;
                    if("bidding_data".equals(s3)) {
                        s2 = jsonReader0.nextString();
                    }
                    else if(!"response_info_extras".equals(s3)) {
                        jsonReader0.skipValue();
                    }
                    else if(((Boolean)zzay.zzc().zzb(zzbhz.zzfN)).booleanValue()) {
                        try {
                            bundle2 = zzbu.zza(zzbu.zzh(jsonReader0));
                        }
                        catch(JSONException | IOException unused_ex) {
                            goto label_70;
                        }
                        catch(IllegalStateException unused_ex) {
                            jsonReader0.skipValue();
                            goto label_70;
                        }
                        if(bundle2 != null) {
                            bundle0 = bundle2;
                            continue;
                        }
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
                else {
                    zzfbn zzfbn1 = new zzfbn();  // 初始化器: Ljava/lang/Object;-><init>()V
                    jsonReader0.beginObject();
                    String s4 = "";
                    while(jsonReader0.hasNext()) {
                        switch(jsonReader0.nextName()) {
                            case "code": {
                                jsonReader0.nextInt();
                                break;
                            }
                            case "description": {
                                s4 = jsonReader0.nextString();
                                break;
                            }
                            default: {
                                jsonReader0.skipValue();
                            }
                        }
                    }
                    bundle1 = bundle0;
                    jsonReader0.endObject();
                    zzfbn1.a = s4;
                    zzfbn0 = zzfbn1;
                }
            label_70:
                bundle0 = bundle1;
            }
        }
        jsonReader0.endObject();
        this.zza = list0;
        this.zzc = v1;
        this.zzb = s;
        this.zzd = s1;
        this.zze = v2;
        this.zzf = v;
        this.zzi = zzfbn0;
        this.zzg = z;
        this.zzh = s2;
        this.zzj = bundle0;
    }
}

