package A;

import J2.j;
import android.os.Parcel;
import android.util.Log;
import androidx.fragment.app.h;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import q.e;

public abstract class f {
    public static final boolean a(int v) {
        return v == 3 || v == 4 || v == 6;
    }

    public static int b(int v, int v1, String s) {
        return (s.hashCode() + v) * v1;
    }

    public static IObjectWrapper c(Parcel parcel0) {
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public static String d(int v, int v1, String s, String s1) {
        return s + v + s1 + v1;
    }

    public static String e(int v, String s, String s1) [...] // Potential decryptor

    public static String f(int v, String s, String s1, String s2, String s3) {
        return s + s1 + s2 + v + s3;
    }

    public static String g(String s, h h0, String s1) {
        return s + h0 + s1;
    }

    public static String h(String s, String s1) [...] // Inlined contents

    public static String i(String s, String s1, String s2) {
        return s + s1 + s2;
    }

    public static String j(String s, String s1, String s2, String s3) {
        return s + s1 + s2 + s3;
    }

    public static String k(String s, String s1, String s2, String s3, String s4) {
        return s + s1 + s2 + s3 + s4;
    }

    public static String l(StringBuilder stringBuilder0, int v, String s, String s1, String s2) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(v);
        stringBuilder0.append(s2);
        return stringBuilder0.toString();
    }

    public static StringBuilder m(int v, String s, String s1, String s2, String s3) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        stringBuilder0.append(v);
        stringBuilder0.append(s3);
        return stringBuilder0;
    }

    public static StringBuilder n(String s, int v, String s1, int v1, String s2) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(v);
        stringBuilder0.append(s1);
        stringBuilder0.append(v1);
        stringBuilder0.append(s2);
        return stringBuilder0;
    }

    public static void o(int v, String s) {
        if(v != 0) {
            return;
        }
        NullPointerException nullPointerException0 = new NullPointerException(j.h(s));
        j.j(nullPointerException0, "J2.j");
        throw nullPointerException0;
    }

    public static void p(int v, String s, String s1) {
        Log.w(s1, s + v);
    }

    public static void q(StringBuilder stringBuilder0, int v, String s, int v1, String s1) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        stringBuilder0.append(v1);
        stringBuilder0.append(s1);
    }

    public static void r(StringBuilder stringBuilder0, int v, String s, String s1, String s2) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
    }

    public static void s(StringBuilder stringBuilder0, String s, String s1, int v, String s2) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(v);
        stringBuilder0.append(s2);
    }

    public static void t(StringBuilder stringBuilder0, String s, String s1, String s2, String s3) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        stringBuilder0.append(s3);
    }

    public static void u(int v, String s) {
        if(v != 0) {
            return;
        }
        NullPointerException nullPointerException0 = new NullPointerException(e.b(s, " must not be null"));
        j.j(nullPointerException0, "J2.j");
        throw nullPointerException0;
    }

    public static String v(int v) {
        switch(v) {
            case 1: {
                return "DECLARATION";
            }
            case 2: {
                return "FAKE_OVERRIDE";
            }
            case 3: {
                return "DELEGATION";
            }
            case 4: {
                return "SYNTHESIZED";
            }
            default: {
                return "null";
            }
        }
    }

    public static String w(int v) {
        switch(v) {
            case 1: {
                return "NOT_REQUIRED";
            }
            case 2: {
                return "CONNECTED";
            }
            case 3: {
                return "UNMETERED";
            }
            case 4: {
                return "NOT_ROAMING";
            }
            case 5: {
                return "METERED";
            }
            case 6: {
                return "TEMPORARILY_UNMETERED";
            }
            default: {
                return "null";
            }
        }
    }

    public static String x(int v) {
        switch(v) {
            case 1: {
                return "ENQUEUED";
            }
            case 2: {
                return "RUNNING";
            }
            case 3: {
                return "SUCCEEDED";
            }
            case 4: {
                return "FAILED";
            }
            case 5: {
                return "BLOCKED";
            }
            case 6: {
                return "CANCELLED";
            }
            default: {
                return "null";
            }
        }
    }

    public static String y(int v) {
        switch(v) {
            case 1: {
                return "BEGIN_ARRAY";
            }
            case 2: {
                return "END_ARRAY";
            }
            case 3: {
                return "BEGIN_OBJECT";
            }
            case 4: {
                return "END_OBJECT";
            }
            case 5: {
                return "NAME";
            }
            case 6: {
                return "STRING";
            }
            case 7: {
                return "NUMBER";
            }
            case 8: {
                return "BOOLEAN";
            }
            case 9: {
                return "NULL";
            }
            case 10: {
                return "END_DOCUMENT";
            }
            default: {
                return "null";
            }
        }
    }
}

