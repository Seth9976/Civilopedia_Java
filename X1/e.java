package x1;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import m0.m;

public abstract class e {
    public static final char[] a;
    public static long b;

    static {
        e.a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        e.b = -1L;
    }

    public static ExecutorService a(String s) {
        m m0 = new m(s, new AtomicLong(1L));
        ThreadPoolExecutor.DiscardPolicy threadPoolExecutor$DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorService0 = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), m0, threadPoolExecutor$DiscardPolicy0));
        Runtime.getRuntime().addShutdownHook(new Thread(new p(s, executorService0, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for " + s));
        return executorService0;
    }

    public static void b(Closeable closeable0, String s) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException iOException0) {
                Log.e("FirebaseCrashlytics", s, iOException0);
            }
        }
    }

    public static String c(File file0) {
        String[] arr_s;
        BufferedReader bufferedReader0;
        String s = null;
        if(file0.exists()) {
            try {
                bufferedReader0 = null;
                bufferedReader0 = new BufferedReader(new FileReader(file0), 0x400);
                goto label_7;
            }
            catch(Exception exception0) {
                goto label_14;
            }
            catch(Throwable throwable0) {
            }
            e.b(((Closeable)s), "Failed to close system file reader.");
            throw throwable0;
            try {
                try {
                    do {
                    label_7:
                        String s1 = bufferedReader0.readLine();
                        if(s1 == null) {
                            goto label_20;
                        }
                        arr_s = Pattern.compile("\\s*:\\s*").split(s1, 2);
                    }
                    while(arr_s.length <= 1 || !arr_s[0].equals("MemTotal"));
                    s = arr_s[1];
                }
                catch(Exception exception0) {
                label_14:
                    Log.e("FirebaseCrashlytics", "Error parsing " + file0, exception0);
                }
            }
            catch(Throwable throwable0) {
                s = bufferedReader0;
                e.b(((Closeable)s), "Failed to close system file reader.");
                throw throwable0;
            }
        label_20:
            e.b(bufferedReader0, "Failed to close system file reader.");
            return s;
        }
        return null;
    }

    public static int d() {
        int v = e.h();
        if(e.i()) {
            v |= 2;
        }
        return !Debug.isDebuggerConnected() && !Debug.waitingForDebugger() ? v : v | 4;
    }

    public static int e(Context context0, String s, String s1) {
        String s2;
        Resources resources0 = context0.getResources();
        int v = context0.getApplicationContext().getApplicationInfo().icon;
        if(v > 0) {
            try {
                s2 = context0.getResources().getResourcePackageName(v);
                return "android".equals(s2) ? resources0.getIdentifier(s, s1, "com.spears.civilopedia") : resources0.getIdentifier(s, s1, s2);
            }
            catch(Resources.NotFoundException unused_ex) {
                return resources0.getIdentifier(s, s1, "com.spears.civilopedia");
            }
            return resources0.getIdentifier(s, s1, "com.spears.civilopedia");
        }
        else {
            s2 = "com.spears.civilopedia";
        }
        return resources0.getIdentifier(s, s1, s2);
    }

    public static long f() {
        synchronized(e.class) {
            if(e.b == -1L) {
                String s = e.c(new File("/proc/meminfo"));
                long v1 = 0L;
                if(!TextUtils.isEmpty(s)) {
                    String s1 = s.toUpperCase(Locale.US);
                    try {
                        if(s1.endsWith("KB")) {
                            v1 = Long.parseLong(s1.split("KB")[0].trim()) * 0x400L;
                        }
                        else if(s1.endsWith("MB")) {
                            v1 = Long.parseLong(s1.split("MB")[0].trim()) * 0x100000L;
                        }
                        else if(s1.endsWith("GB")) {
                            v1 = Long.parseLong(s1.split("GB")[0].trim()) * 0x40000000L;
                        }
                        else {
                            Log.w("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + s1, null);
                        }
                        e.b = v1;
                        return e.b;
                    }
                    catch(NumberFormatException numberFormatException0) {
                    }
                    Log.e("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + s1, numberFormatException0);
                }
                e.b = v1;
            }
            return e.b;
        }
    }

    public static String g(byte[] arr_b) {
        char[] arr_c = new char[arr_b.length * 2];
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            arr_c[v * 2] = e.a[(v1 & 0xFF) >>> 4];
            arr_c[v * 2 + 1] = e.a[v1 & 15];
        }
        return new String(arr_c);
    }

    // 去混淆评级： 低(30)
    public static boolean h() {
        return Build.PRODUCT.contains("sdk") || (Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu"));
    }

    public static boolean i() {
        boolean z = e.h();
        if(!z && Build.TAGS != null && Build.TAGS.contains("test-keys")) {
            return true;
        }
        return new File("/system/app/Superuser.apk").exists() ? true : !z && new File("/system/xbin/su").exists();
    }

    public static String j(String s) {
        MessageDigest messageDigest0;
        byte[] arr_b = s.getBytes();
        try {
            messageDigest0 = MessageDigest.getInstance("SHA-1");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", noSuchAlgorithmException0);
            return "";
        }
        messageDigest0.update(arr_b);
        return e.g(messageDigest0.digest());
    }

    public static String k(FileInputStream fileInputStream0) {
        Scanner scanner0 = new Scanner(fileInputStream0).useDelimiter("\\A");
        return scanner0.hasNext() ? scanner0.next() : "";
    }
}

