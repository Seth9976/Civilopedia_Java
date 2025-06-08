package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import i3.e;
import java.util.Arrays;

@TargetApi(21)
public final class zzasg {
    public final int[] a;
    public static final zzasg zza;

    static {
        zzasg.zza = new zzasg(new int[]{2});
    }

    public zzasg(int[] arr_v) {
        int[] arr_v1 = Arrays.copyOf(arr_v, 1);
        this.a = arr_v1;
        Arrays.sort(arr_v1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzasg ? Arrays.equals(this.a, ((zzasg)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a) * 0x1F + 2;
    }

    @Override
    public final String toString() {
        return e.f("AudioCapabilities[maxChannelCount=2, supportedEncodings=", Arrays.toString(this.a), "]");
    }
}

