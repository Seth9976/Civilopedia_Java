package com.google.android.gms.internal.location;

import A.f;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzbn {
    public static String zza(@NullableDecl String s, @NullableDecl Object[] arr_object) {
        String s1;
        int v = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object0 = arr_object[v1];
            if(object0 == null) {
                s1 = "null";
            }
            else {
                try {
                    s1 = object0.toString();
                }
                catch(Exception exception0) {
                    String s2 = object0.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(object0));
                    String s3 = String.valueOf(s2);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", (s3.length() == 0 ? new String("Exception during lenientFormat for ") : "Exception during lenientFormat for " + s3), exception0);
                    String s4 = exception0.getClass().getName();
                    StringBuilder stringBuilder0 = new StringBuilder(String.valueOf(s2).length() + 9 + s4.length());
                    f.t(stringBuilder0, "<", s2, " threw ", s4);
                    stringBuilder0.append(">");
                    s1 = stringBuilder0.toString();
                }
            }
            arr_object[v1] = s1;
        }
        StringBuilder stringBuilder1 = new StringBuilder(arr_object.length * 16 + s.length());
        int v2 = 0;
        while(v < arr_object.length) {
            int v3 = s.indexOf("%s", v2);
            if(v3 == -1) {
                break;
            }
            stringBuilder1.append(s, v2, v3);
            stringBuilder1.append(arr_object[v]);
            v2 = v3 + 2;
            ++v;
        }
        stringBuilder1.append(s, v2, s.length());
        if(v < arr_object.length) {
            stringBuilder1.append(" [");
            int v4 = v + 1;
            stringBuilder1.append(arr_object[v]);
            while(v4 < arr_object.length) {
                stringBuilder1.append(", ");
                stringBuilder1.append(arr_object[v4]);
                ++v4;
            }
            stringBuilder1.append(']');
        }
        return stringBuilder1.toString();
    }
}

