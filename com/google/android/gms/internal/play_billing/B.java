package com.google.android.gms.internal.play_billing;

import java.util.stream.Collector.Characteristics;
import java.util.stream.Collector;

public abstract class b {
    public static final Collector a;

    static {
        b.a = Collector.of(new zzbj(), new zzbm(), new zzbn(), new zzbo(), new Collector.Characteristics[0]);
        Collector.of(new zzbp(), new zzbq(), new zzbr(), new zzbs(), new Collector.Characteristics[0]);
        Collector.of(new zzbt(), new zzbu(), new zzbk(), new zzbl(), new Collector.Characteristics[0]);
    }
}

