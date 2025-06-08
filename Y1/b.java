package y1;

import android.util.Log;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class b {
    public final HashMap a;
    public final int b;
    public final int c;

    public b(int v) {
        this.a = new HashMap();
        this.b = 0x40;
        this.c = v;
    }

    public final void a(Map map0) {
        String s3;
        synchronized(this) {
            int v1 = 0;
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)map$Entry0.getKey();
                if(s == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                int v2 = this.c;
                String s1 = s.trim();
                if(s1.length() > v2) {
                    s1 = s1.substring(0, v2);
                }
                if(this.a.size() >= this.b && !this.a.containsKey(s1)) {
                    ++v1;
                }
                else {
                    String s2 = (String)map$Entry0.getValue();
                    HashMap hashMap0 = this.a;
                    if(s2 == null) {
                        s3 = "";
                    }
                    else {
                        int v3 = this.c;
                        s3 = s2.trim();
                        if(s3.length() > v3) {
                            s3 = s3.substring(0, v3);
                        }
                    }
                    hashMap0.put(s1, s3);
                }
            }
            if(v1 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + v1 + " entries when adding custom keys. Maximum allowable: " + this.b, null);
            }
        }
    }
}

