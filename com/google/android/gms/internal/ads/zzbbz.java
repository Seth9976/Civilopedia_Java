package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.Normalizer.Form;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public final class zzbbz {
    public final zzbbx a;
    public final int b;
    public final int c;

    public zzbbz(int v, int v1, int v2) {
        this.b = v;
        if(v1 > 0x40 || v1 < 0) {
            v1 = 0x40;
        }
        this.c = v2 <= 0 ? 1 : v2;
        this.a = new zzbbx(v1);
    }

    public final String zza(ArrayList arrayList0, ArrayList arrayList1) {
        Collections.sort(arrayList1, new zzbby(this));
        HashSet hashSet0 = new HashSet();
        int v = 0;
    alab2:
        while(v < arrayList1.size()) {
            String[] arr_s = Normalizer.normalize(((CharSequence)arrayList0.get(((zzbbn)arrayList1.get(v)).e)), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if(arr_s.length != 0) {
                int v1 = 0;
                while(v1 < arr_s.length) {
                    String s = arr_s[v1];
                    if(s.contains("\'")) {
                        StringBuilder stringBuilder0 = new StringBuilder(s);
                        boolean z = false;
                        for(int v2 = 1; v2 + 2 <= stringBuilder0.length(); ++v2) {
                            if(stringBuilder0.charAt(v2) == 39) {
                                if(stringBuilder0.charAt(v2 - 1) == 0x20) {
                                    stringBuilder0.setCharAt(v2, ' ');
                                }
                                else {
                                    switch(stringBuilder0.charAt(v2 + 1)) {
                                        case 83: 
                                        case 0x73: {
                                            if(v2 + 2 == stringBuilder0.length() || stringBuilder0.charAt(v2 + 2) == 0x20) {
                                                stringBuilder0.insert(v2, ' ');
                                                v2 += 2;
                                            }
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                        String s1 = z ? stringBuilder0.toString() : null;
                        if(s1 != null) {
                            s = s1;
                        }
                    }
                    String[] arr_s1 = zzbbs.zzb(s, true);
                    int v3 = this.c;
                    if(arr_s1.length >= v3) {
                        int v4 = 0;
                    alab1:
                        while(true) {
                            int v5 = this.b;
                            if(v4 >= arr_s1.length) {
                                break;
                            }
                            String s2 = "";
                            for(int v6 = 0; v6 < v3; ++v6) {
                                int v7 = v4 + v6;
                                if(v7 >= arr_s1.length) {
                                    break alab1;
                                }
                                if(v6 > 0) {
                                    s2 = s2 + " ";
                                }
                                s2 = s2 + arr_s1[v7];
                            }
                            hashSet0.add(s2);
                            if(hashSet0.size() < v5) {
                                ++v4;
                                continue;
                            }
                            else {
                                break alab2;
                            }
                            goto label_59;
                        }
                        if(hashSet0.size() < v5) {
                            ++v1;
                            continue;
                        }
                        else {
                            break alab2;
                        }
                    }
                    else {
                        ++v1;
                        continue;
                    }
                    goto label_59;
                }
            }
            ++v;
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x1000);
        Base64OutputStream base64OutputStream0 = new Base64OutputStream(byteArrayOutputStream0, 10);
        Iterator iterator0 = hashSet0.iterator();
    label_59:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s3 = (String)object0;
            try {
                base64OutputStream0.write(this.a.zzb(s3));
            }
            catch(IOException iOException0) {
                zzcfi.zzh("Error while writing hash to byteStream", iOException0);
                if(true) {
                    break;
                }
            }
        }
        try {
            base64OutputStream0.close();
        }
        catch(IOException iOException1) {
            zzcfi.zzh("HashManager: Unable to convert to Base64.", iOException1);
        }
        try {
            byteArrayOutputStream0.close();
            return byteArrayOutputStream0.toString();
        }
        catch(IOException iOException2) {
            zzcfi.zzh("HashManager: Unable to convert to Base64.", iOException2);
            return "";
        }
    }
}

