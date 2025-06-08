package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzcmo {
    public static final Pattern a;
    public static final Pattern b;

    static {
        zzcmo.a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
        zzcmo.b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
    }

    public static String zza(String s, String[] arr_s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        Matcher matcher0 = zzcmo.a.matcher(s);
        int v = 0;
        if(matcher0.find()) {
            int v1 = matcher0.end();
            stringBuilder0.append(s.substring(0, v1));
            while(v <= 0) {
                String s1 = arr_s[v];
                if(s1 != null) {
                    stringBuilder0.append(s1);
                }
                ++v;
            }
            stringBuilder0.append(s.substring(v1));
            return stringBuilder0.toString();
        }
        if(!zzcmo.b.matcher(s).find()) {
            while(v <= 0) {
                String s2 = arr_s[v];
                if(s2 != null) {
                    stringBuilder0.append(s2);
                }
                ++v;
            }
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }
}

