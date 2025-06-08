package i1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzfa;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Map;
import p.b;
import p.h;

public final class o implements Runnable {
    public final URL i;
    public final byte[] j;
    public final n k;
    public final String l;
    public final b m;
    public final zzfa n;

    public o(zzfa zzfa0, String s, URL uRL0, byte[] arr_b, b b0, n n0) {
        this.n = zzfa0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(uRL0);
        Preconditions.checkNotNull(n0);
        this.i = uRL0;
        this.j = arr_b;
        this.k = n0;
        this.l = s;
        this.m = b0;
    }

    @Override
    public final void run() {
        byte[] arr_b3;
        InputStream inputStream0;
        Map map2;
        int v1;
        int v;
        Map map1;
        Map map0;
        IOException iOException1;
        HttpURLConnection httpURLConnection0;
        String s = this.l;
        zzfa zzfa0 = this.n;
        zzfa0.zzax();
        zzge zzge0 = zzfa0.a;
        OutputStream outputStream0 = null;
        try {
            URLConnection uRLConnection0 = this.i.openConnection();
            if(!(uRLConnection0 instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection0 = (HttpURLConnection)uRLConnection0;
            httpURLConnection0.setDefaultUseCaches(false);
            httpURLConnection0.setConnectTimeout(60000);
            httpURLConnection0.setReadTimeout(61000);
            httpURLConnection0.setInstanceFollowRedirects(false);
            httpURLConnection0.setDoInput(true);
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            httpURLConnection0 = null;
            map0 = null;
            v1 = 0;
            goto label_93;
        }
        catch(Throwable throwable0) {
            httpURLConnection0 = null;
            map1 = null;
            goto label_61;
        }
        try {
            b b0 = this.m;
            if(b0 != null) {
                for(Object object0: ((h)b0.entrySet())) {
                    httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
            }
            byte[] arr_b = this.j;
            if(arr_b != null) {
                byte[] arr_b1 = zzfa0.b.zzu().B(arr_b);
                zzge0.zzay().zzj().zzb("Uploading data. size", ((int)arr_b1.length));
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection0.setFixedLengthStreamingMode(arr_b1.length);
                httpURLConnection0.connect();
                OutputStream outputStream1 = httpURLConnection0.getOutputStream();
                try {
                    outputStream1.write(arr_b1);
                    outputStream1.close();
                }
                catch(IOException iOException3) {
                    iOException1 = iOException3;
                    map0 = null;
                    outputStream0 = outputStream1;
                    v1 = 0;
                    goto label_93;
                }
                catch(Throwable throwable0) {
                    map1 = null;
                    outputStream0 = outputStream1;
                    goto label_61;
                }
            }
            v = httpURLConnection0.getResponseCode();
            goto label_63;
        }
        catch(IOException iOException2) {
            iOException1 = iOException2;
            map0 = null;
            v1 = 0;
            goto label_93;
        }
        catch(Throwable throwable0) {
            map1 = null;
        }
    label_61:
        int v2 = 0;
        goto label_106;
        try {
        label_63:
            map2 = httpURLConnection0.getHeaderFields();
        }
        catch(IOException iOException4) {
            map0 = null;
            v1 = v;
            goto label_92;
        }
        catch(Throwable throwable0) {
            v2 = v;
            map1 = null;
            goto label_106;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            inputStream0 = null;
            inputStream0 = httpURLConnection0.getInputStream();
            byte[] arr_b2 = new byte[0x400];
            int v3;
            while((v3 = inputStream0.read(arr_b2)) > 0) {
                byteArrayOutputStream0.write(arr_b2, 0, v3);
            }
            arr_b3 = byteArrayOutputStream0.toByteArray();
            goto label_87;
        }
        catch(Throwable throwable1) {
            try {
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                throw throwable1;
            label_87:
                inputStream0.close();
                goto label_115;
            }
            catch(IOException iOException4) {
            }
            catch(Throwable throwable0) {
                goto label_104;
            }
        }
        v1 = v;
        map0 = map2;
    label_92:
        iOException1 = iOException4;
    label_93:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException5) {
                zzge0.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeu.d(s), iOException5);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        zzgb zzgb0 = zzge0.zzaz();
        l l0 = new l(this.l, this.k, v1, iOException1, null, map0);
        zzgb0.zzp(l0);
        return;
    label_104:
        v2 = v;
        map1 = map2;
    label_106:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException6) {
                zzge0.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeu.d(s), iOException6);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        zzge0.zzaz().zzp(new l(this.l, this.k, v2, null, null, map1));
        throw throwable0;
    label_115:
        httpURLConnection0.disconnect();
        zzgb0 = zzge0.zzaz();
        l0 = new l(this.l, this.k, v, null, arr_b3, map2);
        zzgb0.zzp(l0);
    }
}

