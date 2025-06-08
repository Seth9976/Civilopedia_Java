package x;

import B.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface.Builder;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w.c;
import w.d;
import x2.w;

public class g extends e {
    public final Class h;
    public final Constructor i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;

    public g() {
        super(8);
        Method method4;
        Method method3;
        Method method2;
        Method method1;
        Method method0;
        Constructor constructor0;
        Class class0 = null;
        try {
            Class class1 = Class.forName("android.graphics.FontFamily");
            constructor0 = class1.getConstructor(null);
            method0 = g.F(class1);
            method1 = class1.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            method2 = class1.getMethod("freeze", null);
            method3 = class1.getMethod("abortCreation", null);
            method4 = this.G(class1);
            class0 = class1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + classNotFoundException0.getClass().getName(), classNotFoundException0);
            method4 = null;
            constructor0 = null;
            method0 = null;
            method1 = null;
            method2 = null;
            method3 = null;
        }
        this.h = class0;
        this.i = constructor0;
        this.j = method0;
        this.k = method1;
        this.l = method2;
        this.m = method3;
        this.n = method4;
    }

    public final boolean A(Context context0, Object object0, String s, int v, int v1, int v2, FontVariationAxis[] arr_fontVariationAxis) {
        try {
            Object[] arr_object = {context0.getAssets(), s, 0, Boolean.FALSE, v, v1, v2, arr_fontVariationAxis};
            return ((Boolean)this.j.invoke(object0, arr_object)).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    public Typeface B(Object object0) {
        try {
            Object object1 = Array.newInstance(this.h, 1);
            Array.set(object1, 0, object0);
            return (Typeface)this.n.invoke(null, object1, -1, -1);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    public final boolean C(Object object0) {
        try {
            return ((Boolean)this.l.invoke(object0, null)).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    public final boolean D() {
        Method method0 = this.j;
        if(method0 == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method0 != null;
    }

    public final Object E() {
        try {
            return this.i.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    public static Method F(Class class0) {
        return class0.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
    }

    public Method G(Class class0) {
        Class[] arr_class = {Array.newInstance(class0, 1).getClass(), Integer.TYPE, Integer.TYPE};
        Method method0 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arr_class);
        method0.setAccessible(true);
        return method0;
    }

    @Override  // x.e
    public final Typeface f(Context context0, c c0, Resources resources0, int v) {
        if(!this.D()) {
            return super.f(context0, c0, resources0, v);
        }
        Object object0 = this.E();
        if(object0 == null) {
            return null;
        }
        d[] arr_d = c0.a;
        for(int v1 = 0; v1 < arr_d.length; ++v1) {
            d d0 = arr_d[v1];
            FontVariationAxis[] arr_fontVariationAxis = FontVariationAxis.fromFontVariationSettings(d0.d);
            if(!this.A(context0, object0, d0.a, d0.e, d0.b, ((int)d0.c), arr_fontVariationAxis)) {
                this.z(object0);
                return null;
            }
        }
        return this.C(object0) ? this.B(object0) : null;
    }

    @Override  // x.e
    public final Typeface g(Context context0, l[] arr_l, int v) {
        boolean z1;
        if(arr_l.length < 1) {
            return null;
        }
        if(!this.D()) {
            l l0 = this.j(v, arr_l);
            ContentResolver contentResolver0 = context0.getContentResolver();
            try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(l0.a, "r", null)) {
                if(parcelFileDescriptor0 != null) {
                    return new Typeface.Builder(parcelFileDescriptor0.getFileDescriptor()).setWeight(l0.c).setItalic(l0.d).build();
                }
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        HashMap hashMap0 = new HashMap();
        for(int v1 = 0; v1 < arr_l.length; ++v1) {
            l l1 = arr_l[v1];
            if(l1.e == 0) {
                Uri uri0 = l1.a;
                if(!hashMap0.containsKey(uri0)) {
                    hashMap0.put(uri0, w.t(context0, uri0));
                }
            }
        }
        Map map0 = Collections.unmodifiableMap(hashMap0);
        Object object0 = this.E();
        if(object0 == null) {
            return null;
        }
        boolean z = false;
        for(int v2 = 0; v2 < arr_l.length; ++v2) {
            l l2 = arr_l[v2];
            ByteBuffer byteBuffer0 = (ByteBuffer)map0.get(l2.a);
            if(byteBuffer0 != null) {
                try {
                    z1 = ((Boolean)this.k.invoke(object0, byteBuffer0, l2.b, null, l2.c, ((int)l2.d))).booleanValue();
                }
                catch(IllegalAccessException | InvocationTargetException unused_ex) {
                    z1 = false;
                }
                if(!z1) {
                    this.z(object0);
                    return null;
                }
                z = true;
            }
        }
        if(!z) {
            this.z(object0);
            return null;
        }
        if(!this.C(object0)) {
            return null;
        }
        Typeface typeface0 = this.B(object0);
        return typeface0 == null ? null : Typeface.create(typeface0, v);
    }

    @Override  // o2.G
    public final Typeface i(Context context0, Resources resources0, int v, String s, int v1) {
        if(!this.D()) {
            return super.i(context0, resources0, v, s, v1);
        }
        Object object0 = this.E();
        if(object0 == null) {
            return null;
        }
        if(!this.A(context0, object0, s, 0, -1, -1, null)) {
            this.z(object0);
            return null;
        }
        return this.C(object0) ? this.B(object0) : null;
    }

    public final void z(Object object0) {
        try {
            this.m.invoke(object0, null);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
    }
}

