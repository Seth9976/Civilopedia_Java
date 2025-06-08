package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import e.a;
import g.b;
import java.io.IOException;
import jeb.synthetic.TWR;
import k.l;
import k.o;
import l.W;
import org.xmlpull.v1.XmlPullParserException;

public final class g extends MenuInflater {
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;
    public static final Class[] e;
    public static final Class[] f;

    static {
        Class[] arr_class = {Context.class};
        g.e = arr_class;
        g.f = arr_class;
    }

    public g(Context context0) {
        super(context0);
        this.c = context0;
        Object[] arr_object = {context0};
        this.a = arr_object;
        this.b = arr_object;
    }

    public static Object a(Object object0) {
        if(object0 instanceof Activity) {
            return object0;
        }
        return object0 instanceof ContextWrapper ? g.a(((ContextWrapper)object0).getBaseContext()) : object0;
    }

    public final void b(XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, Menu menu0) {
        ColorStateList colorStateList1;
        f f0 = new f(this, menu0);
        int v = xmlResourceParser0.getEventType();
        do {
            if(v == 2) {
                String s = xmlResourceParser0.getName();
                if(!s.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + s);
                }
                v = xmlResourceParser0.next();
                break;
            }
            v = xmlResourceParser0.next();
        }
        while(v != 1);
        boolean z = false;
        String s1 = null;
        boolean z1 = false;
        while(!z1) {
            if(v == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            switch(v) {
                case 2: {
                    if(!z) {
                        String s2 = xmlResourceParser0.getName();
                        g g0 = f0.E;
                        if(s2.equals("group")) {
                            TypedArray typedArray0 = g0.c.obtainStyledAttributes(attributeSet0, a.p);
                            f0.b = typedArray0.getResourceId(1, 0);
                            f0.c = typedArray0.getInt(3, 0);
                            f0.d = typedArray0.getInt(4, 0);
                            f0.e = typedArray0.getInt(5, 0);
                            f0.f = typedArray0.getBoolean(2, true);
                            f0.g = typedArray0.getBoolean(0, true);
                            typedArray0.recycle();
                        }
                        else if(s2.equals("item")) {
                            Context context0 = g0.c;
                            TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, a.q);
                            f0.i = typedArray1.getResourceId(2, 0);
                            f0.j = typedArray1.getInt(5, f0.c) & 0xFFFF0000 | typedArray1.getInt(6, f0.d) & 0xFFFF;
                            f0.k = typedArray1.getText(7);
                            f0.l = typedArray1.getText(8);
                            f0.m = typedArray1.getResourceId(0, 0);
                            String s3 = typedArray1.getString(9);
                            f0.n = s3 == null ? '\u0000' : s3.charAt(0);
                            f0.o = typedArray1.getInt(16, 0x1000);
                            String s4 = typedArray1.getString(10);
                            f0.p = s4 == null ? '\u0000' : s4.charAt(0);
                            f0.q = typedArray1.getInt(20, 0x1000);
                            f0.r = typedArray1.hasValue(11) ? typedArray1.getBoolean(11, false) : f0.e;
                            f0.s = typedArray1.getBoolean(3, false);
                            f0.t = typedArray1.getBoolean(4, f0.f);
                            f0.u = typedArray1.getBoolean(1, f0.g);
                            f0.v = typedArray1.getInt(21, -1);
                            f0.y = typedArray1.getString(12);
                            f0.w = typedArray1.getResourceId(13, 0);
                            f0.x = typedArray1.getString(15);
                            String s5 = typedArray1.getString(14);
                            boolean z2 = s5 != null;
                            if(!z2 || f0.w != 0 || f0.x != null) {
                                if(z2) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute \'actionProviderClass\'. Action view already specified.");
                                }
                                f0.z = null;
                            }
                            else {
                                f0.z = (o)f0.a(s5, g.f, g0.b);
                            }
                            f0.A = typedArray1.getText(17);
                            f0.B = typedArray1.getText(22);
                            f0.D = typedArray1.hasValue(19) ? W.c(typedArray1.getInt(19, -1), f0.D) : null;
                            if(typedArray1.hasValue(18)) {
                                if(typedArray1.hasValue(18)) {
                                    int v1 = typedArray1.getResourceId(18, 0);
                                    if(v1 != 0) {
                                        ColorStateList colorStateList0 = b.b(context0, v1);
                                        if(colorStateList0 != null) {
                                            colorStateList1 = colorStateList0;
                                        }
                                    }
                                }
                                else {
                                    colorStateList1 = typedArray1.getColorStateList(18);
                                }
                                f0.C = colorStateList1;
                            }
                            else {
                                f0.C = null;
                            }
                            typedArray1.recycle();
                            f0.h = false;
                        }
                        else if(s2.equals("menu")) {
                            f0.h = true;
                            SubMenu subMenu0 = f0.a.addSubMenu(f0.b, f0.i, f0.j, f0.k);
                            f0.b(subMenu0.getItem());
                            this.b(xmlResourceParser0, attributeSet0, subMenu0);
                        }
                        else {
                            s1 = s2;
                            z = true;
                        }
                    }
                    break;
                }
                case 3: {
                    String s6 = xmlResourceParser0.getName();
                    if(z && s6.equals(s1)) {
                        z = false;
                        s1 = null;
                    }
                    else if(s6.equals("group")) {
                        f0.b = 0;
                        f0.c = 0;
                        f0.d = 0;
                        f0.e = 0;
                        f0.f = true;
                        f0.g = true;
                    }
                    else if(!s6.equals("item")) {
                        if(s6.equals("menu")) {
                            z1 = true;
                        }
                    }
                    else if(!f0.h) {
                        if(f0.z == null || !f0.z.a.hasSubMenu()) {
                            f0.h = true;
                            f0.b(f0.a.add(f0.b, f0.i, f0.j, f0.k));
                        }
                        else {
                            f0.h = true;
                            f0.b(f0.a.addSubMenu(f0.b, f0.i, f0.j, f0.k).getItem());
                        }
                    }
                }
            }
            v = xmlResourceParser0.next();
        }
    }

    @Override  // android.view.MenuInflater
    public final void inflate(int v, Menu menu0) {
        XmlResourceParser xmlResourceParser0;
        if(!(menu0 instanceof l)) {
            super.inflate(v, menu0);
            return;
        }
        try {
            try {
                xmlResourceParser0 = null;
                xmlResourceParser0 = this.c.getResources().getLayout(v);
                this.b(xmlResourceParser0, Xml.asAttributeSet(xmlResourceParser0), menu0);
            }
            catch(XmlPullParserException xmlPullParserException0) {
                throw new InflateException("Error inflating menu XML", xmlPullParserException0);
            }
            catch(IOException iOException0) {
                throw new InflateException("Error inflating menu XML", iOException0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(xmlResourceParser0, throwable0);
            throw throwable0;
        }
        xmlResourceParser0.close();
    }
}

