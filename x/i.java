package x;

import B.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.Typeface;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import o2.G;
import w.c;
import w.d;

public final class i extends G {
    @Override  // o2.G
    public final Typeface f(Context context0, c c0, Resources resources0, int v) {
        try {
            d[] arr_d = c0.a;
            int v1 = 0;
            FontFamily.Builder fontFamily$Builder0 = null;
            for(int v2 = 0; true; ++v2) {
                if(v2 >= arr_d.length) {
                    if(fontFamily$Builder0 == null) {
                        return null;
                    }
                    if((v & 2) != 0) {
                        v1 = 1;
                    }
                    FontStyle fontStyle0 = new FontStyle(((v & 1) == 0 ? 400 : 700), v1);
                    return new Typeface.CustomFallbackBuilder(fontFamily$Builder0.build()).setStyle(fontStyle0).build();
                }
                d d0 = arr_d[v2];
                try {
                    Font font0 = new Font.Builder(resources0, d0.f).setWeight(d0.b).setSlant(((int)d0.c)).setTtcIndex(d0.e).setFontVariationSettings(d0.d).build();
                    if(fontFamily$Builder0 == null) {
                        fontFamily$Builder0 = new FontFamily.Builder(font0);
                    }
                    else {
                        fontFamily$Builder0.addFont(font0);
                    }
                }
                catch(IOException unused_ex) {
                }
            }
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // o2.G
    public final Typeface g(Context context0, l[] arr_l, int v) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        try {
            int v1 = 0;
            FontFamily.Builder fontFamily$Builder0 = null;
            for(int v2 = 0; true; ++v2) {
                if(v2 >= arr_l.length) {
                    if(fontFamily$Builder0 == null) {
                        return null;
                    }
                    if((v & 2) != 0) {
                        v1 = 1;
                    }
                    FontStyle fontStyle0 = new FontStyle(((v & 1) == 0 ? 400 : 700), v1);
                    return new Typeface.CustomFallbackBuilder(fontFamily$Builder0.build()).setStyle(fontStyle0).build();
                }
                l l0 = arr_l[v2];
                try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(l0.a, "r", null)) {
                    if(parcelFileDescriptor0 != null) {
                        Font font0 = new Font.Builder(parcelFileDescriptor0).setWeight(l0.c).setSlant(((int)l0.d)).setTtcIndex(l0.b).build();
                        if(fontFamily$Builder0 == null) {
                            fontFamily$Builder0 = new FontFamily.Builder(font0);
                        }
                        else {
                            fontFamily$Builder0.addFont(font0);
                        }
                    }
                }
                catch(IOException unused_ex) {
                }
            }
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // o2.G
    public final Typeface h(Context context0, InputStream inputStream0) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override  // o2.G
    public final Typeface i(Context context0, Resources resources0, int v, String s, int v1) {
        try {
            Font font0 = new Font.Builder(resources0, v).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(font0).build()).setStyle(font0.getStyle()).build();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // o2.G
    public final l j(int v, l[] arr_l) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}

