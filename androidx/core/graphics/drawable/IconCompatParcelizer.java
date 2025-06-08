package androidx.core.graphics.drawable;

import W.a;
import W.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(a a0) {
        IconCompat iconCompat0 = new IconCompat();
        iconCompat0.a = a0.f(iconCompat0.a, 1);
        byte[] arr_b = iconCompat0.c;
        if(a0.e(2)) {
            Parcel parcel0 = ((b)a0).e;
            int v = parcel0.readInt();
            if(v < 0) {
                arr_b = null;
            }
            else {
                byte[] arr_b1 = new byte[v];
                parcel0.readByteArray(arr_b1);
                arr_b = arr_b1;
            }
        }
        iconCompat0.c = arr_b;
        iconCompat0.d = a0.g(iconCompat0.d, 3);
        iconCompat0.e = a0.f(iconCompat0.e, 4);
        iconCompat0.f = a0.f(iconCompat0.f, 5);
        iconCompat0.g = (ColorStateList)a0.g(iconCompat0.g, 6);
        iconCompat0.i = a0.e(7) ? ((b)a0).e.readString() : iconCompat0.i;
        iconCompat0.j = a0.e(8) ? ((b)a0).e.readString() : iconCompat0.j;
        iconCompat0.h = PorterDuff.Mode.valueOf(iconCompat0.i);
        switch(iconCompat0.a) {
            case -1: {
                Parcelable parcelable0 = iconCompat0.d;
                if(parcelable0 == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat0.b = parcelable0;
                return iconCompat0;
            }
            case 3: {
                iconCompat0.b = iconCompat0.c;
                return iconCompat0;
            }
            case 1: 
            case 5: {
                Parcelable parcelable1 = iconCompat0.d;
                if(parcelable1 != null) {
                    iconCompat0.b = parcelable1;
                    return iconCompat0;
                }
                iconCompat0.b = iconCompat0.c;
                iconCompat0.a = 3;
                iconCompat0.e = 0;
                iconCompat0.f = iconCompat0.c.length;
                return iconCompat0;
            }
            case 2: 
            case 4: 
            case 6: {
                String s = new String(iconCompat0.c, Charset.forName("UTF-16"));
                iconCompat0.b = s;
                if(iconCompat0.a == 2 && iconCompat0.j == null) {
                    iconCompat0.j = s.split(":", -1)[0];
                    return iconCompat0;
                }
                return iconCompat0;
            }
            default: {
                return iconCompat0;
            }
        }
    }

    public static void write(IconCompat iconCompat0, a a0) {
        a0.getClass();
        iconCompat0.i = iconCompat0.h.name();
        switch(iconCompat0.a) {
            case -1: {
                iconCompat0.d = (Parcelable)iconCompat0.b;
                break;
            }
            case 2: {
                iconCompat0.c = ((String)iconCompat0.b).getBytes(Charset.forName("UTF-16"));
                break;
            }
            case 3: {
                iconCompat0.c = (byte[])iconCompat0.b;
                break;
            }
            case 1: 
            case 5: {
                iconCompat0.d = (Parcelable)iconCompat0.b;
                break;
            }
            case 4: 
            case 6: {
                iconCompat0.c = iconCompat0.b.toString().getBytes(Charset.forName("UTF-16"));
            }
        }
        int v = iconCompat0.a;
        if(-1 != v) {
            a0.j(v, 1);
        }
        byte[] arr_b = iconCompat0.c;
        if(arr_b != null) {
            a0.i(2);
            ((b)a0).e.writeInt(arr_b.length);
            ((b)a0).e.writeByteArray(arr_b);
        }
        Parcelable parcelable0 = iconCompat0.d;
        if(parcelable0 != null) {
            a0.i(3);
            ((b)a0).e.writeParcelable(parcelable0, 0);
        }
        int v1 = iconCompat0.e;
        if(v1 != 0) {
            a0.j(v1, 4);
        }
        int v2 = iconCompat0.f;
        if(v2 != 0) {
            a0.j(v2, 5);
        }
        ColorStateList colorStateList0 = iconCompat0.g;
        if(colorStateList0 != null) {
            a0.i(6);
            ((b)a0).e.writeParcelable(colorStateList0, 0);
        }
        String s = iconCompat0.i;
        if(s != null) {
            a0.i(7);
            ((b)a0).e.writeString(s);
        }
        String s1 = iconCompat0.j;
        if(s1 != null) {
            a0.i(8);
            ((b)a0).e.writeString(s1);
        }
    }
}

