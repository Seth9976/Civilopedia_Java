package com.google.android.gms.appset;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AppSetIdInfo {
    @Retention(RetentionPolicy.SOURCE)
    public @interface Scope {
    }

    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    public final String a;
    public final int b;

    public AppSetIdInfo(String s, int v) {
        this.a = s;
        this.b = v;
    }

    public String getId() {
        return this.a;
    }

    public int getScope() {
        return this.b;
    }
}

