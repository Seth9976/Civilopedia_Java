package com.spears.civilopedia;

import android.os.Bundle;
import android.widget.TextView;
import f2.j;
import kotlin.Metadata;
import o1.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spears/civilopedia/CopyrightActivity;", "Lf2/j;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CopyrightActivity extends j {
    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0A001D);  // layout:activity_copyright
        TextView textView0 = (TextView)this.findViewById(0x7F07010F);  // id:text
        String s = this.l().b.c().d() ? "LOC_COPYRIGHT_TEXT" : "LOC_COPYRIGHT_BLOCK";
        J2.j.c(textView0);
        a.V(textView0, a.B(s));
    }
}

