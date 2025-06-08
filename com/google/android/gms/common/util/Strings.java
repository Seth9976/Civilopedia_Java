package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@KeepForSdk
public class Strings {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    // 去混淆评级： 低(20)
    @KeepForSdk
    public static String emptyToNull(String s) {
        return TextUtils.isEmpty(s) ? null : s;
    }

    @KeepForSdk
    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean isEmptyOrWhitespace(String s) {
        return s == null || s.trim().isEmpty();
    }
}

