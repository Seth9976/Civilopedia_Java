package w;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

public abstract class a {
    public static final ThreadLocal a;

    static {
        a.a = new ThreadLocal();
    }

    public static ColorStateList a(Resources resources0, XmlResourceParser xmlResourceParser0, Resources.Theme resources$Theme0) {
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        do {
            int v = xmlResourceParser0.next();
        }
        while(v != 1 && v != 2);
        if(v != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return a.b(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
    }

    public static ColorStateList b(Resources resources0, XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        int v5;
        String s = xmlResourceParser0.getName();
        if(!s.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": invalid color state list tag " + s);
        }
        int v = xmlResourceParser0.getDepth();
        int[][] arr2_v = new int[20][];
        int[] arr_v = new int[20];
        int v1 = 0;
        int v2;
        while((v2 = xmlResourceParser0.next()) != 1) {
            int v3 = xmlResourceParser0.getDepth();
            if(v3 < v + 1 && v2 == 3) {
                break;
            }
            if(v2 == 2 && v3 <= v + 1 && xmlResourceParser0.getName().equals("item")) {
                TypedArray typedArray0 = resources$Theme0 == null ? resources0.obtainAttributes(attributeSet0, t.a.a) : resources$Theme0.obtainStyledAttributes(attributeSet0, t.a.a, 0, 0);
                int v4 = typedArray0.getResourceId(0, -1);
                if(v4 == -1) {
                    v5 = typedArray0.getColor(0, 0xFFFF00FF);
                }
                else {
                    ThreadLocal threadLocal0 = a.a;
                    TypedValue typedValue0 = (TypedValue)threadLocal0.get();
                    if(typedValue0 == null) {
                        typedValue0 = new TypedValue();
                        threadLocal0.set(typedValue0);
                    }
                    resources0.getValue(v4, typedValue0, true);
                    if(typedValue0.type < 28 || typedValue0.type > 0x1F) {
                        try {
                            v5 = a.a(resources0, resources0.getXml(v4), resources$Theme0).getDefaultColor();
                        }
                        catch(Exception unused_ex) {
                            v5 = typedArray0.getColor(0, 0xFFFF00FF);
                        }
                    }
                }
                float f = 1.0f;
                if(typedArray0.hasValue(1)) {
                    f = typedArray0.getFloat(1, 1.0f);
                }
                else if(typedArray0.hasValue(2)) {
                    f = typedArray0.getFloat(2, 1.0f);
                }
                typedArray0.recycle();
                int v6 = attributeSet0.getAttributeCount();
                int[] arr_v1 = new int[v6];
                int v8 = 0;
                for(int v7 = 0; v7 < v6; ++v7) {
                    int v9 = attributeSet0.getAttributeNameResource(v7);
                    if(v9 != 0x10101A5 && v9 != 0x101031F && v9 != 0x7F02002C) {  // attr:alpha
                        if(!attributeSet0.getAttributeBooleanValue(v7, false)) {
                            v9 = -v9;
                        }
                        arr_v1[v8] = v9;
                        ++v8;
                    }
                }
                int[] arr_v2 = StateSet.trimStateSet(arr_v1, v8);
                int v10 = Math.round(((float)Color.alpha(v5)) * f);
                int v11 = 8;
                if(v1 + 1 > arr_v.length) {
                    int[] arr_v3 = new int[(v1 > 4 ? v1 * 2 : 8)];
                    System.arraycopy(arr_v, 0, arr_v3, 0, v1);
                    arr_v = arr_v3;
                }
                arr_v[v1] = v10 << 24 | v5 & 0xFFFFFF;
                if(v1 + 1 > arr2_v.length) {
                    Class class0 = arr2_v.getClass().getComponentType();
                    if(v1 > 4) {
                        v11 = v1 * 2;
                    }
                    Object[] arr_object = (Object[])Array.newInstance(class0, v11);
                    System.arraycopy(arr2_v, 0, arr_object, 0, v1);
                    arr2_v = arr_object;
                }
                arr2_v[v1] = arr_v2;
                ++v1;
            }
        }
        int[] arr_v4 = new int[v1];
        int[][] arr2_v1 = new int[v1][];
        System.arraycopy(arr_v, 0, arr_v4, 0, v1);
        System.arraycopy(arr2_v, 0, arr2_v1, 0, v1);
        return new ColorStateList(arr2_v1, arr_v4);
    }
}

