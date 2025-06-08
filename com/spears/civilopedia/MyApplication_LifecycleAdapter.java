package com.spears.civilopedia;

import O.i;
import androidx.lifecycle.g;
import java.util.HashMap;

public class MyApplication_LifecycleAdapter {
    public final MyApplication a;

    public MyApplication_LifecycleAdapter(MyApplication myApplication0) {
        this.a = myApplication0;
    }

    public final void a(g g0, boolean z, i i0) {
        boolean z1 = false;
        if(z) {
            return;
        }
        if(g0 == g.ON_START) {
            if(i0 == null) {
                this.a.onMoveToForeground();
            }
            else {
                HashMap hashMap0 = i0.a;
                Integer integer0 = (Integer)hashMap0.get("onMoveToForeground");
                int v = integer0 == null ? 0 : ((int)integer0);
                if((v & 1) != 0) {
                    z1 = true;
                }
                hashMap0.put("onMoveToForeground", ((int)(v | 1)));
                if(!z1) {
                    this.a.onMoveToForeground();
                }
            }
        }
    }
}

