package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;
    public static final PorterDuff.Mode k;

    static {
        IconCompat.k = PorterDuff.Mode.SRC_IN;
    }

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.k;
        this.i = null;
    }

    public static IconCompat a(int v) {
        if(v == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat0 = new IconCompat();  // 初始化器: Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V
        iconCompat0.c = null;
        iconCompat0.d = null;
        iconCompat0.f = 0;
        iconCompat0.g = null;
        iconCompat0.h = IconCompat.k;
        iconCompat0.i = null;
        iconCompat0.a = 2;
        iconCompat0.e = v;
        iconCompat0.b = "";
        iconCompat0.j = "";
        return iconCompat0;
    }

    public final int b() {
        int v = this.a;
        if(v == -1) {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 23) {
                Icon icon0 = (Icon)this.b;
                if(v1 >= 28) {
                    return icon0.getResId();
                }
                try {
                    return (int)(((Integer)icon0.getClass().getMethod("getResId", null).invoke(icon0, null)));
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.e("IconCompat", "Unable to get icon resource", illegalAccessException0);
                    return 0;
                }
                catch(InvocationTargetException invocationTargetException0) {
                    Log.e("IconCompat", "Unable to get icon resource", invocationTargetException0);
                    return 0;
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    Log.e("IconCompat", "Unable to get icon resource", noSuchMethodException0);
                    return 0;
                }
            }
        }
        if(v != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.e;
    }

    public final Uri c() {
        int v = this.a;
        if(v == -1) {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 23) {
                Icon icon0 = (Icon)this.b;
                if(v1 >= 28) {
                    return icon0.getUri();
                }
                try {
                    return (Uri)icon0.getClass().getMethod("getUri", null).invoke(icon0, null);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.e("IconCompat", "Unable to get icon uri", illegalAccessException0);
                    return null;
                }
                catch(InvocationTargetException invocationTargetException0) {
                    Log.e("IconCompat", "Unable to get icon uri", invocationTargetException0);
                    return null;
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    Log.e("IconCompat", "Unable to get icon uri", noSuchMethodException0);
                    return null;
                }
            }
        }
        if(v != 4 && v != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse(((String)this.b));
    }

    @Override
    public final String toString() {
        String s;
        if(this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder stringBuilder0 = new StringBuilder("Icon(typ=");
        switch(this.a) {
            case 1: {
                s = "BITMAP";
                break;
            }
            case 2: {
                s = "RESOURCE";
                break;
            }
            case 3: {
                s = "DATA";
                break;
            }
            case 4: {
                s = "URI";
                break;
            }
            case 5: {
                s = "BITMAP_MASKABLE";
                break;
            }
            case 6: {
                s = "URI_MASKABLE";
                break;
            }
            default: {
                s = "UNKNOWN";
            }
        }
        stringBuilder0.append(s);
        switch(this.a) {
            case 2: {
                stringBuilder0.append(" pkg=");
                stringBuilder0.append(this.j);
                stringBuilder0.append(" id=");
                stringBuilder0.append(String.format("0x%08x", this.b()));
                break;
            }
            case 3: {
                stringBuilder0.append(" len=");
                stringBuilder0.append(this.e);
                if(this.f != 0) {
                    stringBuilder0.append(" off=");
                    stringBuilder0.append(this.f);
                }
                break;
            }
            case 1: 
            case 5: {
                stringBuilder0.append(" size=");
                stringBuilder0.append(((Bitmap)this.b).getWidth());
                stringBuilder0.append("x");
                stringBuilder0.append(((Bitmap)this.b).getHeight());
                break;
            }
            case 4: 
            case 6: {
                stringBuilder0.append(" uri=");
                stringBuilder0.append(this.b);
            }
        }
        if(this.g != null) {
            stringBuilder0.append(" tint=");
            stringBuilder0.append(this.g);
        }
        if(this.h != IconCompat.k) {
            stringBuilder0.append(" mode=");
            stringBuilder0.append(this.h);
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

