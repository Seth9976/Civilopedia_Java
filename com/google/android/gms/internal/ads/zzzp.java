package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public final class zzzp {
    public static List zza(byte[] arr_b) {
        int v = arr_b[11];
        int v1 = arr_b[10];
        List list0 = new ArrayList(3);
        ((ArrayList)list0).add(arr_b);
        ((ArrayList)list0).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((long)((v & 0xFF) << 8 | v1 & 0xFF)) * 1000000000L / 48000L).array());
        ((ArrayList)list0).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return list0;
    }
}

