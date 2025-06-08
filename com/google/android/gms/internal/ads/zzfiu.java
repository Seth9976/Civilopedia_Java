package com.google.android.gms.internal.ads;

public enum zzfiu {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    public final String i;

    public zzfiu(String s1) {
        this.i = s1;
    }

    @Override
    public final String toString() {
        return this.i;
    }
}

