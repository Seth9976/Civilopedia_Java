package com.google.android.gms.internal.play_billing;

public final class zzkr extends zzhk implements zzin {
    private static final zzkr zzb;
    private int zzd;
    private String zze;
    private int zzf;
    private zzhn zzg;
    private zzho zzh;
    private zzki zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzkr zzkr0 = new zzkr();
        zzkr.zzb = zzkr0;
        zzhk.h(zzkr.class, zzkr0);
    }

    public zzkr() {
        this.zze = "";
        this.zzg = r0.m;
        this.zzh = G0.m;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzkr.zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001B\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", a0.f, "zzg", a0.e, "zzh", zzln.class, "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzkr();
            }
            case 4: {
                return new zzko(zzkr.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            case 5: {
                return zzkr.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

