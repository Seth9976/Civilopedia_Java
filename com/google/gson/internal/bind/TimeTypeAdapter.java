package com.google.gson.internal.bind;

import X1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import jeb.synthetic.FIN;

public final class TimeTypeAdapter extends n {
    public final SimpleDateFormat a;
    public static final o b;

    static {
        TimeTypeAdapter.b = new o() {
            @Override  // com.google.gson.o
            public final n a(h h0, a a0) {
                return a0.a == Time.class ? new TimeTypeAdapter() : null;
            }
        };
    }

    public TimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override  // com.google.gson.n
    public final Object b(Y1.a a0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(a0.v() == 9) {
            a0.r();
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return null;
        }
        try {
            String s = a0.t();
            Time time0 = new Time(this.a.parse(s).getTime());
            FIN.finallyExec$NT(v);
            return time0;
        }
        catch(ParseException parseException0) {
            FIN.finallyExec$NT(v);
            throw new JsonSyntaxException(parseException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        synchronized(this) {
            b0.o((((Time)object0) == null ? null : this.a.format(((Time)object0))));
        }
    }
}

