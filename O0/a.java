package o0;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n0.b;
import q0.k;

public final class a implements k {
    public final String a;
    public final String b;
    public static final String c;
    public static final Set d;
    public static final a e;

    static {
        a.c = "https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3";
        new String("https://firebaselogging-pa.googleapis.com/v1/firelog/legacy/batchlog");
        new String("AIzaSyCckkiH8i2ZARwOs1LEzFKld15aOG8ozKo");
        a.d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{new b("proto"), new b("json")})));
        a.e = new a("https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3", null);
    }

    public a(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public static a a(byte[] arr_b) {
        String s = new String(arr_b, Charset.forName("UTF-8"));
        if(!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] arr_s = s.substring(2).split("\\Q\\\\E", 2);
        if(arr_s.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String s1 = arr_s[0];
        if(s1.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String s2 = arr_s[1];
        if(s2.isEmpty()) {
            s2 = null;
        }
        return new a(s1, s2);
    }
}

