package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;

@Deprecated
public final class CustomEventExtras {
    public final HashMap a;

    public CustomEventExtras() {
        this.a = new HashMap();
    }

    public Object getExtra(String s) {
        return this.a.get(s);
    }

    public void setExtra(String s, Object object0) {
        this.a.put(s, object0);
    }
}

