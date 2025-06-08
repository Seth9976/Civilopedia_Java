package com.google.android.gms.internal.ads;

public final class zzggp {
    public static int zza(int v) {
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return v - 2;
    }

    public static int zzb(int v) {
        switch(v) {
            case 0: {
                return 2;
            }
            case 1: {
                return 3;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 5;
            }
            case 4: {
                return 6;
            }
            default: {
                return 0;
            }
        }
    }
}

