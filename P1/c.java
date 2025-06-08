package P1;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import o1.f;
import o1.g;
import org.json.JSONException;
import org.json.JSONObject;
import q.e;

public final class c {
    public Object a;
    public final Object b;
    public static final String[] c;

    static {
        c.c = new String[]{"*", "FCM", "GCM", ""};
    }

    public c(f f0, int v) {
        if(v != 1) {
            super();
            f0.a();
            this.a = f0.a.getSharedPreferences("com.google.android.gms.appid", 0);
            f0.a();
            g g0 = f0.c;
            String s = g0.e;
            if(s == null) {
                f0.a();
                s = g0.b;
                if(s.startsWith("1:") || s.startsWith("2:")) {
                    String[] arr_s = s.split(":");
                    if(arr_s.length == 4) {
                        s = arr_s[1];
                        if(s.isEmpty()) {
                            s = null;
                        }
                    }
                    else {
                        s = null;
                    }
                }
            }
            this.b = s;
            return;
        }
        super();
        this.b = f0;
    }

    public File a() {
        if(((File)this.a) == null) {
            synchronized(this) {
                if(((File)this.a) == null) {
                    ((f)this.b).a();
                    this.a = new File(((f)this.b).a.getFilesDir(), "PersistedInstallation." + ((f)this.b).c() + ".json");
                }
            }
        }
        return (File)this.a;
    }

    public void b(b b0) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("Fid", b0.a);
            jSONObject0.put("Status", e.c(b0.b));
            jSONObject0.put("AuthToken", b0.c);
            jSONObject0.put("RefreshToken", b0.d);
            jSONObject0.put("TokenCreationEpochInSecs", b0.f);
            jSONObject0.put("ExpiresInSecs", b0.e);
            jSONObject0.put("FisError", b0.g);
            ((f)this.b).a();
            File file0 = File.createTempFile("PersistedInstallation", "tmp", ((f)this.b).a.getFilesDir());
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            fileOutputStream0.write(jSONObject0.toString().getBytes("UTF-8"));
            fileOutputStream0.close();
            if(!file0.renameTo(this.a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        }
        catch(JSONException | IOException unused_ex) {
        }
    }

    public String c() {
        synchronized(((SharedPreferences)this.a)) {
        }
        return ((SharedPreferences)this.a).getString("|S|id", null);
    }

    public b d() {
        JSONObject jSONObject0;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x4000];
        try(FileInputStream fileInputStream0 = new FileInputStream(this.a())) {
            int v;
            while((v = fileInputStream0.read(arr_b, 0, 0x4000)) >= 0) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            jSONObject0 = new JSONObject(byteArrayOutputStream0.toString());
        }
        catch(IOException | JSONException unused_ex) {
            jSONObject0 = new JSONObject();
        }
        String s = jSONObject0.optString("Fid", null);
        int v1 = jSONObject0.optInt("Status", 0);
        String s1 = jSONObject0.optString("AuthToken", null);
        String s2 = jSONObject0.optString("RefreshToken", null);
        long v2 = jSONObject0.optLong("TokenCreationEpochInSecs", 0L);
        long v3 = jSONObject0.optLong("ExpiresInSecs", 0L);
        String s3 = jSONObject0.optString("FisError", null);
        int v4 = e.d(5)[v1];
        if(v4 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        return new b(s, v4, s1, s2, v3, v2, s3);
    }

    public String e() {
        PublicKey publicKey0;
        synchronized(((SharedPreferences)this.a)) {
            String s = null;
            String s1 = ((SharedPreferences)this.a).getString("|S||P|", null);
            if(s1 == null) {
                return null;
            }
            try {
                byte[] arr_b = Base64.decode(s1, 8);
                publicKey0 = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arr_b));
            }
            catch(IllegalArgumentException | InvalidKeySpecException | NoSuchAlgorithmException illegalArgumentException0) {
                Log.w("ContentValues", "Invalid key stored " + illegalArgumentException0);
                publicKey0 = null;
            }
            if(publicKey0 == null) {
                return null;
            }
            byte[] arr_b1 = publicKey0.getEncoded();
            try {
                byte[] arr_b2 = MessageDigest.getInstance("SHA1").digest(arr_b1);
                arr_b2[0] = (byte)((arr_b2[0] & 15) + 0x70 & 0xFF);
                s = Base64.encodeToString(arr_b2, 0, 8, 11);
            }
            catch(NoSuchAlgorithmException unused_ex) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return s;
        }
    }
}

