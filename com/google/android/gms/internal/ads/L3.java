package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage.MessageLevel;

public abstract class l3 {
    public static final int[] a;

    static {
        int[] arr_v = new int[ConsoleMessage.MessageLevel.values().length];
        l3.a = arr_v;
        try {
            arr_v[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            l3.a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            l3.a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            l3.a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            l3.a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

