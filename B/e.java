package B;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jeb.synthetic.TWR;
import o2.C;

public abstract class e {
    public static final d a;

    static {
        e.a = new d(0);
    }

    public static k a(Context context0, f f0) {
        Cursor cursor0;
        PackageManager packageManager0 = context0.getPackageManager();
        Resources resources0 = context0.getResources();
        String s = (String)f0.j;
        ProviderInfo providerInfo0 = packageManager0.resolveContentProvider(s, 0);
        if(providerInfo0 == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + s);
        }
        String s1 = providerInfo0.packageName;
        String s2 = (String)f0.k;
        if(!s1.equals(s2)) {
            throw new PackageManager.NameNotFoundException(A.f.j("Found content provider ", s, ", but package was not ", s2));
        }
        Signature[] arr_signature = packageManager0.getPackageInfo(providerInfo0.packageName, 0x40).signatures;
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_signature.length; ++v) {
            arrayList0.add(arr_signature[v].toByteArray());
        }
        d d0 = e.a;
        Collections.sort(arrayList0, d0);
        List list0 = (List)f0.n;
        if(list0 == null) {
            list0 = C.t(resources0, 0);
        }
    alab1:
        for(int v1 = 0; true; ++v1) {
            cursor0 = null;
            if(v1 >= list0.size()) {
                providerInfo0 = null;
                break;
            }
            ArrayList arrayList1 = new ArrayList(((Collection)list0.get(v1)));
            Collections.sort(arrayList1, d0);
            if(arrayList0.size() == arrayList1.size()) {
                int v2 = 0;
                while(v2 < arrayList0.size()) {
                    if(!Arrays.equals(((byte[])arrayList0.get(v2)), ((byte[])arrayList1.get(v2)))) {
                        continue alab1;
                    }
                    ++v2;
                }
                break;
            }
        }
        if(providerInfo0 == null) {
            return new k(1, null);
        }
        String s3 = providerInfo0.authority;
        ArrayList arrayList2 = new ArrayList();
        Uri uri0 = new Uri.Builder().scheme("content").authority(s3).build();
        Uri uri1 = new Uri.Builder().scheme("content").authority(s3).appendPath("file").build();
        try {
            cursor0 = context0.getContentResolver().query(uri0, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{((String)f0.l)}, null, null);
            if(cursor0 != null && cursor0.getCount() > 0) {
                int v3 = cursor0.getColumnIndex("result_code");
                arrayList2 = new ArrayList();
                int v4 = cursor0.getColumnIndex("_id");
                int v5 = cursor0.getColumnIndex("file_id");
                int v6 = cursor0.getColumnIndex("font_ttc_index");
                int v7 = cursor0.getColumnIndex("font_weight");
                int v8 = cursor0.getColumnIndex("font_italic");
                while(cursor0.moveToNext()) {
                    int v9 = v3 == -1 ? 0 : cursor0.getInt(v3);
                    int v10 = v6 == -1 ? 0 : cursor0.getInt(v6);
                    arrayList2.add(new l((v5 == -1 ? ContentUris.withAppendedId(uri0, cursor0.getLong(v4)) : ContentUris.withAppendedId(uri1, cursor0.getLong(v5))), v10, (v7 == -1 ? 400 : cursor0.getInt(v7)), v8 != -1 && cursor0.getInt(v8) == 1, v9));
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return new k(0, ((l[])arrayList2.toArray(new l[0])));
    }
}

