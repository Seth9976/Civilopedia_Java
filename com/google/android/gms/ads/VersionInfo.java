package com.google.android.gms.ads;

public class VersionInfo {
    public final int a;
    public final int b;
    public final int c;

    public VersionInfo(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public int getMajorVersion() {
        return this.a;
    }

    public int getMicroVersion() {
        return this.c;
    }

    public int getMinorVersion() {
        return this.b;
    }

    @Override
    public String toString() {
        return this.a + "." + this.b + "." + this.c;
    }
}

