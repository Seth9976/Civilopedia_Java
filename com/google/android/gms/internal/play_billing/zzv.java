package com.google.android.gms.internal.play_billing;

import m0.p;

public final class zzv {
    public static zzeu zza(p p0) {
        zzr zzr0 = new zzr();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzr0.c = zzw.zze();
        Z0 z00 = new Z0(zzr0);
        zzr0.b = z00;
        zzr0.a = p0.getClass();
        try {
            p0.a(zzr0);
            zzr0.a = "billingOverrideService.getBillingOverride";
        }
        catch(Exception exception0) {
            u0 u00 = new u0(exception0);
            Y0 y00 = z00.j;
            if(zzq.n.W(y00, null, u00)) {
                zzq.b(y00);
            }
        }
        return z00;
    }
}

