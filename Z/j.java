package Z;

import Y.m;
import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashMap;

public abstract class j {
    public static final String a;
    public static final String[] b;

    static {
        j.a = "WM-WrkDbPathHelper";
        j.b = new String[]{"-journal", "-shm", "-wal"};
    }

    public static void a(Context context0) {
        File file0 = context0.getDatabasePath("androidx.work.workdb");
        int v = Build.VERSION.SDK_INT;
        if(v >= 23 && file0.exists()) {
            m.d().a("WM-WrkDbPathHelper", "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap0 = new HashMap();
            if(v >= 23) {
                File file1 = context0.getDatabasePath("androidx.work.workdb");
                File file2 = new File(context0.getNoBackupFilesDir(), "androidx.work.workdb");
                hashMap0.put(file1, file2);
                String[] arr_s = j.b;
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    String s = arr_s[v1];
                    hashMap0.put(new File(file1.getPath() + s), new File(file2.getPath() + s));
                }
            }
            for(Object object0: hashMap0.keySet()) {
                File file3 = (File)object0;
                File file4 = (File)hashMap0.get(file3);
                if(file3.exists() && file4 != null) {
                    if(file4.exists()) {
                        m.d().g("WM-WrkDbPathHelper", String.format("Over-writing contents of %s", file4), new Throwable[0]);
                    }
                    String s1 = file3.renameTo(file4) ? String.format("Migrated %s to %s", file3, file4) : String.format("Renaming %s to %s failed", file3, file4);
                    m.d().a("WM-WrkDbPathHelper", s1, new Throwable[0]);
                }
            }
        }
    }
}

