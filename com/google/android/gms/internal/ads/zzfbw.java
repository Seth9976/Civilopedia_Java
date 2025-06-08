package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfbw {
    public final List zza;
    public final zzfbo zzb;
    public final List zzc;

    public zzfbw(JsonReader jsonReader0) {
        List list0 = Collections.emptyList();
        ArrayList arrayList0 = new ArrayList();
        jsonReader0.beginObject();
        zzfbo zzfbo0 = null;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if("responses".equals(s)) {
                jsonReader0.beginArray();
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s1 = jsonReader0.nextName();
                    if("ad_configs".equals(s1)) {
                        list0 = new ArrayList();
                        jsonReader0.beginArray();
                        while(jsonReader0.hasNext()) {
                            ((ArrayList)list0).add(new zzfbl(jsonReader0));
                        }
                        jsonReader0.endArray();
                    }
                    else if(s1.equals("common")) {
                        zzfbo0 = new zzfbo(jsonReader0);
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
                jsonReader0.endObject();
                jsonReader0.endArray();
            }
            else if(s.equals("actions")) {
                jsonReader0.beginArray();
                while(jsonReader0.hasNext()) {
                    jsonReader0.beginObject();
                    String s2 = null;
                    JSONObject jSONObject0 = null;
                    while(jsonReader0.hasNext()) {
                        String s3 = jsonReader0.nextName();
                        if("name".equals(s3)) {
                            s2 = jsonReader0.nextString();
                        }
                        else if("info".equals(s3)) {
                            jSONObject0 = zzbu.zzh(jsonReader0);
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    if(s2 != null) {
                        arrayList0.add(new zzfbv(s2, jSONObject0));
                    }
                    jsonReader0.endObject();
                }
                jsonReader0.endArray();
            }
        }
        this.zzc = arrayList0;
        this.zza = list0;
        if(zzfbo0 == null) {
            zzfbo0 = new zzfbo(new JsonReader(new StringReader("{}")));
        }
        this.zzb = zzfbo0;
    }

    public static zzfbw zza(Reader reader0) throws zzfbp {
        try {
            return new zzfbw(new JsonReader(reader0));
        }
        catch(IOException | IllegalStateException | JSONException | NumberFormatException | AssertionError iOException0) {
            throw new zzfbp("unable to parse ServerResponse", iOException0);
        }
        finally {
            IOUtils.closeQuietly(reader0);
        }
    }
}

