package com.google.android.gms.internal.play_billing;

public final class zzlh extends zzhk implements zzin {
    private static final zzlh zzb;
    private zzho zzd;

    static {
        zzlh zzlh0 = new zzlh();
        zzlh.zzb = zzlh0;
        zzhk.h(zzlh.class, zzlh0);
    }

    public zzlh() {
        this.zzd = G0.m;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzlh.zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzd", zzlf.class});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzlh();
                    }
                    case 4: {
                        return new zzlc(zzlh.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
                    }
                    case 5: {
                        return zzlh.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

