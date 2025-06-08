package x;

import B.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o2.G;
import w.c;
import w.d;
import x2.w;

public class e extends G {
    public static Class c = null;
    public static Constructor d = null;
    public static Method e = null;
    public static Method f = null;
    public static boolean g = false;

    @Override  // o2.G
    public Typeface f(Context context0, c c0, Resources resources0, int v) {
        int v1;
        d[] arr_d;
        Object object0;
        e.y();
        try {
            object0 = e.d.newInstance(null);
            arr_d = c0.a;
            v1 = 0;
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        while(v1 < arr_d.length) {
            d d0 = arr_d[v1];
            File file0 = w.k(context0);
            if(file0 == null) {
                return null;
            }
            try {
                if(!w.c(file0, resources0, d0.f)) {
                    return null;
                }
                if(!e.x(object0, file0.getPath(), d0.b, d0.c)) {
                    return null;
                }
            }
            catch(RuntimeException unused_ex) {
                return null;
            }
            finally {
                file0.delete();
            }
            ++v1;
        }
        e.y();
        try {
            Object object1 = Array.newInstance(e.c, 1);
            Array.set(object1, 0, object0);
            return (Typeface)e.f.invoke(null, object1);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException1) {
            throw new RuntimeException(illegalAccessException1);
        }
    }

    @Override  // o2.G
    public Typeface g(Context context0, l[] arr_l, int v) {
        File file0;
        if(arr_l.length < 1) {
            return null;
        }
        l l0 = this.j(v, arr_l);
        ContentResolver contentResolver0 = context0.getContentResolver();
        try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(l0.a, "r", null)) {
            if(parcelFileDescriptor0 == null) {
                return null;
            }
            try {
                String s = Os.readlink(("/proc/self/fd/" + parcelFileDescriptor0.getFd()));
                file0 = null;
                if(OsConstants.S_ISREG(Os.stat(s).st_mode)) {
                    file0 = new File(s);
                }
            }
            catch(ErrnoException unused_ex) {
            }
            if(file0 != null && file0.canRead()) {
                return Typeface.createFromFile(file0);
            }
            try(FileInputStream fileInputStream0 = new FileInputStream(parcelFileDescriptor0.getFileDescriptor())) {
                return this.h(context0, fileInputStream0);
            }
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public static boolean x(Object object0, String s, int v, boolean z) {
        e.y();
        try {
            return ((Boolean)e.e.invoke(object0, s, v, Boolean.valueOf(z))).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    public static void y() {
        Method method1;
        Method method0;
        Class class0;
        Constructor constructor0;
        if(e.g) {
            return;
        }
        try {
            e.g = true;
            constructor0 = null;
            class0 = Class.forName("android.graphics.FontFamily");
            Constructor constructor1 = class0.getConstructor(null);
            method0 = class0.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            Class[] arr_class = {Array.newInstance(class0, 1).getClass()};
            method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", arr_class);
            constructor0 = constructor1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi21Impl", classNotFoundException0.getClass().getName(), classNotFoundException0);
            method1 = null;
            class0 = null;
            method0 = null;
        }
        e.d = constructor0;
        e.c = class0;
        e.e = method0;
        e.f = method1;
    }
}

