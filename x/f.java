package x;

import B.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileChannel;
import java.util.List;
import o2.G;
import p.k;
import w.c;
import w.d;
import x2.w;

public final class f extends G {
    public static final Class c;
    public static final Constructor d;
    public static final Method e;
    public static final Method f;

    static {
        Method method1;
        Method method0;
        Class class0;
        Constructor constructor0 = null;
        try {
            class0 = Class.forName("android.graphics.FontFamily");
            Constructor constructor1 = class0.getConstructor(null);
            method0 = class0.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            Class[] arr_class = {Array.newInstance(class0, 1).getClass()};
            method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", arr_class);
            constructor0 = constructor1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi24Impl", classNotFoundException0.getClass().getName(), classNotFoundException0);
            method1 = null;
            class0 = null;
            method0 = null;
        }
        f.d = constructor0;
        f.c = class0;
        f.e = method0;
        f.f = method1;
    }

    @Override  // o2.G
    public final Typeface f(Context context0, c c0, Resources resources0, int v) {
        Throwable throwable3;
        FileInputStream fileInputStream0;
        ByteBuffer byteBuffer0;
        Object object0;
        try {
            object0 = f.d.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            object0 = null;
        }
        if(object0 == null) {
            return null;
        }
        d[] arr_d = c0.a;
        int v1 = 0;
        while(v1 < arr_d.length) {
            d d0 = arr_d[v1];
            int v2 = d0.f;
            File file0 = w.k(context0);
            if(file0 == null) {
            label_37:
                byteBuffer0 = null;
            }
            else {
                try {
                    if(w.c(file0, resources0, v2)) {
                        goto label_16;
                    }
                    else {
                        goto label_13;
                    }
                    goto label_37;
                }
                catch(Throwable throwable0) {
                    file0.delete();
                    throw throwable0;
                }
            label_13:
                file0.delete();
                byteBuffer0 = null;
                goto label_38;
                try {
                label_16:
                    fileInputStream0 = new FileInputStream(file0);
                }
                catch(IOException unused_ex) {
                    byteBuffer0 = null;
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    file0.delete();
                    throw throwable0;
                }
                try {
                    FileChannel fileChannel0 = fileInputStream0.getChannel();
                    long v3 = fileChannel0.size();
                    byteBuffer0 = fileChannel0.map(FileChannel.MapMode.READ_ONLY, 0L, v3);
                    goto label_28;
                }
                catch(Throwable throwable1) {
                    try {
                        throwable3 = throwable1;
                        fileInputStream0.close();
                        throw throwable3;
                    }
                    catch(Throwable throwable2) {
                        try {
                            throwable3.addSuppressed(throwable2);
                            throw throwable3;
                        label_28:
                            fileInputStream0.close();
                            goto label_35;
                        }
                        catch(IOException unused_ex) {
                        }
                        catch(Throwable throwable0) {
                            file0.delete();
                            throw throwable0;
                        }
                    }
                }
                byteBuffer0 = null;
            label_35:
                file0.delete();
            }
        label_38:
            if(byteBuffer0 == null) {
                return null;
            }
            if(!f.x(object0, byteBuffer0, d0.e, d0.b, d0.c)) {
                return null;
            }
            ++v1;
        }
        return f.y(object0);
    }

    @Override  // o2.G
    public final Typeface g(Context context0, l[] arr_l, int v) {
        Object object0;
        try {
            object0 = f.d.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            object0 = null;
        }
        if(object0 == null) {
            return null;
        }
        k k0 = new k();
        for(int v1 = 0; v1 < arr_l.length; ++v1) {
            l l0 = arr_l[v1];
            Uri uri0 = l0.a;
            ByteBuffer byteBuffer0 = (ByteBuffer)k0.getOrDefault(uri0, null);
            if(byteBuffer0 == null) {
                byteBuffer0 = w.t(context0, uri0);
                k0.put(uri0, byteBuffer0);
            }
            if(byteBuffer0 == null) {
                return null;
            }
            if(!f.x(object0, byteBuffer0, l0.b, l0.c, l0.d)) {
                return null;
            }
        }
        Typeface typeface0 = f.y(object0);
        return typeface0 == null ? null : Typeface.create(typeface0, v);
    }

    public static boolean x(Object object0, ByteBuffer byteBuffer0, int v, int v1, boolean z) {
        try {
            return ((Boolean)f.e.invoke(object0, byteBuffer0, v, null, v1, Boolean.valueOf(z))).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    public static Typeface y(Object object0) {
        try {
            Object object1 = Array.newInstance(f.c, 1);
            Array.set(object1, 0, object0);
            return (Typeface)f.f.invoke(null, object1);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }
}

