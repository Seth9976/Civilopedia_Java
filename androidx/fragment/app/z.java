package androidx.fragment.app;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class z {
    public ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;

    public final void b(h h0, String s) {
        Class class0 = h0.getClass();
        int v = class0.getModifiers();
        if(class0.isAnonymousClass() || !Modifier.isPublic(v) || class0.isMemberClass() && !Modifier.isStatic(v)) {
            throw new IllegalStateException("Fragment " + class0.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if(s != null) {
            if(h0.F != null && !s.equals(h0.F)) {
                throw new IllegalStateException("Can\'t change tag of fragment " + h0 + ": was " + h0.F + " now " + s);
            }
            h0.F = s;
        }
        ((a)this).c(new y(h0, 1));
        h0.z = ((a)this).q;
    }

    public final void c(y y0) {
        this.a.add(y0);
        y0.c = this.b;
        y0.d = this.c;
        y0.e = this.d;
        y0.f = this.e;
    }
}

