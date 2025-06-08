package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import q0.i;
import q0.o;
import w0.f;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final int a;

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        String s = intent0.getData().getQueryParameter("backendName");
        String s1 = intent0.getData().getQueryParameter("extras");
        int v = (int)Integer.valueOf(intent0.getData().getQueryParameter("priority"));
        int v1 = intent0.getExtras().getInt("attemptNumber");
        o.b(context0);
        a a0 = i.a();
        a0.E(s);
        a0.l = A0.a.b(v);
        if(s1 != null) {
            a0.k = Base64.decode(s1, 0);
        }
        o o0 = o.a();
        i i0 = a0.e();
        w0.a a1 = new w0.a();  // 初始化器: Ljava/lang/Object;-><init>()V
        o0.d.getClass();
        f f0 = new f(o0.d, i0, v1, a1);
        o0.d.e.execute(f0);
    }
}

