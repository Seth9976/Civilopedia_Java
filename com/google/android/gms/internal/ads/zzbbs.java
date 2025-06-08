package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbbs {
    public static int zza(String s) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes("UTF-8");
            return MurmurHash3.murmurhash3_x86_32(arr_b, 0, arr_b.length, 0);
        }
        catch(UnsupportedEncodingException unused_ex) {
            arr_b = s.getBytes();
            return MurmurHash3.murmurhash3_x86_32(arr_b, 0, arr_b.length, 0);
        }
    }

    public static String[] zzb(String s, boolean z) {
        if(s == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        char[] arr_c = s.toCharArray();
        int v = s.length();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v1 < v) {
            int v4 = Character.codePointAt(arr_c, v1);
            int v5 = Character.charCount(v4);
            if(Character.isLetter(v4)) {
                Character.UnicodeBlock character$UnicodeBlock0 = Character.UnicodeBlock.of(v4);
                if(character$UnicodeBlock0 == Character.UnicodeBlock.BOPOMOFO || character$UnicodeBlock0 == Character.UnicodeBlock.BOPOMOFO_EXTENDED || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_COMPATIBILITY || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || character$UnicodeBlock0 == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || character$UnicodeBlock0 == Character.UnicodeBlock.HANGUL_JAMO || character$UnicodeBlock0 == Character.UnicodeBlock.HANGUL_SYLLABLES || character$UnicodeBlock0 == Character.UnicodeBlock.HIRAGANA || character$UnicodeBlock0 == Character.UnicodeBlock.KATAKANA || character$UnicodeBlock0 == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS || v4 >= 0xFF66 && v4 <= 0xFF9D || v4 >= 0xFFA1 && v4 <= 0xFFDC) {
                    if(v2 != 0) {
                        arrayList0.add(new String(arr_c, v3, v1 - v3));
                    }
                    arrayList0.add(new String(arr_c, v1, v5));
                    v2 = 0;
                }
            }
            else if(Character.isLetterOrDigit(v4) || Character.getType(v4) == 6 || Character.getType(v4) == 8) {
                if(1 != v2) {
                    v3 = v1;
                }
                v2 = 1;
            }
            else if(z && Character.charCount(v4) == 1 && Character.toChars(v4)[0] == 39) {
                if(1 != v2) {
                    v3 = v1;
                }
                v2 = 1;
            }
            else if(v2 != 0) {
                arrayList0.add(new String(arr_c, v3, v1 - v3));
                v2 = 0;
            }
            v1 += v5;
        }
        if(v2 != 0) {
            arrayList0.add(new String(arr_c, v3, v1 - v3));
        }
        return (String[])arrayList0.toArray(new String[arrayList0.size()]);
    }
}

