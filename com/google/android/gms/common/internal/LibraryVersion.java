package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
@Deprecated
public class LibraryVersion {
    public final ConcurrentHashMap a;
    public static final GmsLogger b;
    public static final LibraryVersion c;

    static {
        LibraryVersion.b = new GmsLogger("LibraryVersion", "");
        LibraryVersion.c = new LibraryVersion();
    }

    public LibraryVersion() {
        this.a = new ConcurrentHashMap();
    }

    @KeepForSdk
    public static LibraryVersion getInstance() {
        return LibraryVersion.c;
    }

    @KeepForSdk
    @Deprecated
    public String getVersion(String s) {
        InputStream inputStream0;
        GmsLogger gmsLogger0 = LibraryVersion.b;
        Preconditions.checkNotEmpty(s, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap0 = this.a;
        if(concurrentHashMap0.containsKey(s)) {
            return (String)concurrentHashMap0.get(s);
        }
        Properties properties0 = new Properties();
        String s1 = null;
        try {
            inputStream0 = LibraryVersion.class.getResourceAsStream("/" + s + ".properties");
            goto label_13;
        }
        catch(IOException iOException0) {
            IOException iOException1 = iOException0;
            String s2 = null;
            goto label_26;
        label_13:
            if(inputStream0 == null) {
                goto label_18;
                try {
                label_26:
                    gmsLogger0.e("LibraryVersion", "Failed to get app version for libraryName: " + s, iOException1);
                    String s4 = s1;
                    s1 = s2;
                    inputStream0 = s4;
                    goto label_37;
                }
                catch(Throwable throwable0) {
                }
                goto label_34;
            }
            else {
                try {
                    properties0.load(inputStream0);
                    s1 = properties0.getProperty("version", null);
                    gmsLogger0.v("LibraryVersion", s + " version is " + s1);
                    goto label_37;
                label_18:
                    gmsLogger0.w("LibraryVersion", "Failed to get app version for libraryName: " + s);
                    goto label_37;
                label_23:
                    String s3 = s1;
                    s1 = inputStream0;
                    s2 = s3;
                    goto label_26;
                }
                catch(IOException iOException1) {
                    goto label_23;
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
            }
            goto label_37;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_33:
        s1 = inputStream0;
    label_34:
        if(s1 != null) {
            IOUtils.closeQuietly(((Closeable)s1));
        }
        throw throwable0;
    label_37:
        if(inputStream0 != null) {
            IOUtils.closeQuietly(inputStream0);
        }
        if(s1 == null) {
            gmsLogger0.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            s1 = "UNKNOWN";
        }
        concurrentHashMap0.put(s, s1);
        return s1;
    }
}

