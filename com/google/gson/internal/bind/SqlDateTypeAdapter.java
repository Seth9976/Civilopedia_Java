package com.google.gson.internal.bind;

import X1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import jeb.synthetic.FIN;

public final class SqlDateTypeAdapter extends n {
    public final SimpleDateFormat a;
    public static final o b;

    static {
        SqlDateTypeAdapter.b = new o() {
            @Override  // com.google.gson.o
            public final n a(h h0, a a0) {
                return a0.a == Date.class ? new SqlDateTypeAdapter() : null;
            }
        };
    }

    public SqlDateTypeAdapter() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
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
            Date date0 = new Date(this.a.parse(s).getTime());
            FIN.finallyExec$NT(v);
            return date0;
        }
        catch(ParseException parseException0) {
            FIN.finallyExec$NT(v);
            throw new JsonSyntaxException(parseException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        synchronized(this) {
            b0.o((((Date)object0) == null ? null : this.a.format(((Date)object0))));
        }
    }
}

