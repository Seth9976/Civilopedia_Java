package com.google.gson.internal.bind;

import X1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.h;
import com.google.gson.internal.e;
import com.google.gson.n;
import com.google.gson.o;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public final class DateTypeAdapter extends n {
    public final ArrayList a;
    public static final o b;

    static {
        DateTypeAdapter.b = new o() {
            @Override  // com.google.gson.o
            public final n a(h h0, a a0) {
                return a0.a == Date.class ? new DateTypeAdapter() : null;
            }
        };
    }

    public DateTypeAdapter() {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateTimeInstance(2, 2, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if(e.a >= 9) {
            arrayList0.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale0));
        }
    }

    @Override  // com.google.gson.n
    public final Object b(Y1.a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        String s = a0.t();
        synchronized(this) {
            Iterator iterator0 = this.a.iterator();
        label_7:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                DateFormat dateFormat0 = (DateFormat)object0;
                try {
                    return dateFormat0.parse(s);
                }
                catch(ParseException unused_ex) {
                    goto label_7;
                }
            }
            try {
                return V1.a.b(s, new ParsePosition(0));
            }
            catch(ParseException parseException0) {
                throw new JsonSyntaxException(s, parseException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
        }
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        synchronized(this) {
            if(((Date)object0) == null) {
                b0.j();
                return;
            }
            b0.o(((DateFormat)this.a.get(0)).format(((Date)object0)));
        }
    }
}

