package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;
import p.b;
import p.h;

public final class zal {
    public final b a;
    public final b b;
    public final TaskCompletionSource c;
    public int d;
    public boolean e;

    public zal(Iterable iterable0) {
        this.b = new b();  // 初始化器: Lp/k;-><init>()V
        this.c = new TaskCompletionSource();
        this.e = false;
        this.a = new b();  // 初始化器: Lp/k;-><init>()V
        for(Object object0: iterable0) {
            ApiKey apiKey0 = ((HasApiKey)object0).getApiKey();
            this.a.put(apiKey0, null);
        }
        this.d = ((h)this.a.keySet()).j.d();
    }

    public final Task zaa() {
        return this.c.getTask();
    }

    public final Set zab() {
        return this.a.keySet();
    }

    public final void zac(ApiKey apiKey0, ConnectionResult connectionResult0, String s) {
        b b0 = this.a;
        b0.put(apiKey0, connectionResult0);
        b b1 = this.b;
        b1.put(apiKey0, s);
        --this.d;
        if(!connectionResult0.isSuccess()) {
            this.e = true;
        }
        if(this.d == 0) {
            TaskCompletionSource taskCompletionSource0 = this.c;
            if(this.e) {
                taskCompletionSource0.setException(new AvailabilityException(b0));
                return;
            }
            taskCompletionSource0.setResult(b1);
        }
    }
}

