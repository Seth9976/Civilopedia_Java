package com.google.android.gms.internal.play_billing;

public final class zzln extends zzhk implements zzin {
    private static final zzln zzb;
    private int zzd;
    private zzho zze;
    private int zzf;
    private String zzg;

    static {
        zzln zzln0 = new zzln();
        zzln.zzb = zzln0;
        zzhk.h(zzln.class, zzln0);
    }

    public zzln() {
        this.zze = G0.m;
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzln.zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001A\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzln();
            }
            case 4: {
                return new zzll(zzln.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            default: {
                return v - 1 != 5 ? null : zzln.zzb;
            }
        }
    }
}

