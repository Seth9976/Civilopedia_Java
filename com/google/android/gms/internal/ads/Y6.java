package com.google.android.gms.internal.ads;

public final class y6 extends zzfoh {
    public final char i;

    public y6(char c) {
        this.i = c;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CharMatcher.is(\'");
        char[] arr_c = {'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        int v = this.i;
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_c[5 - v1] = "0123456789ABCDEF".charAt(v & 15);
            v >>= 4;
        }
        stringBuilder0.append(String.copyValueOf(arr_c));
        stringBuilder0.append("\')");
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfoh
    public final boolean zzb(char c) {
        return c == this.i;
    }
}

