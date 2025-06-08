package e2;

import android.util.Log;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper.SQLiteAssetException;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b implements Comparator {
    public Pattern i;
    public static final String j;

    static {
        b.j = "a";
    }

    @Override
    public final int compare(Object object0, Object object1) {
        Pattern pattern0 = this.i;
        Matcher matcher0 = pattern0.matcher(((String)object0));
        Matcher matcher1 = pattern0.matcher(((String)object1));
        if(matcher0.matches()) {
            if(matcher1.matches()) {
                int v = (int)Integer.valueOf(matcher0.group(1));
                int v1 = (int)Integer.valueOf(matcher1.group(1));
                int v2 = (int)Integer.valueOf(matcher0.group(2));
                int v3 = (int)Integer.valueOf(matcher1.group(2));
                if(v == v1) {
                    if(v2 == v3) {
                        return 0;
                    }
                    return v2 >= v3 ? 1 : -1;
                }
                return v < v1 ? -1 : 1;
            }
            Log.w("a", "could not parse upgrade script file: " + ((String)object1));
            throw new SQLiteAssetHelper.SQLiteAssetException("Invalid upgrade script file");  // 初始化器: Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V
        }
        Log.w("a", "could not parse upgrade script file: " + ((String)object0));
        throw new SQLiteAssetHelper.SQLiteAssetException("Invalid upgrade script file");  // 初始化器: Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V
    }
}

