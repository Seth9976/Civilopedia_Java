package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public final class zzakc extends zzajp {
    public zzakc() {
    }

    public zzakc(zzakb zzakb0, SSLSocketFactory sSLSocketFactory0) {
    }

    public static ArrayList a(Map map0) {
        ArrayList arrayList0 = new ArrayList(map0.size());
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getKey() != null) {
                for(Object object1: ((List)map$Entry0.getValue())) {
                    arrayList0.add(new zzait(((String)map$Entry0.getKey()), ((String)object1)));
                }
            }
        }
        return arrayList0;
    }
}

