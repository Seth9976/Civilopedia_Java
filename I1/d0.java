package i1;

import B.o;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzlf;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class d0 implements h0, n {
    public final zzlf i;

    public d0(zzlf zzlf0) {
        this.i = zzlf0;
    }

    public d0(zzlf zzlf0, String s) {
        this.i = zzlf0;
    }

    @Override  // i1.n
    public void a(String s, int v, IOException iOException0, byte[] arr_b, Map map0) {
        e e1;
        List list0;
        zzlf zzlf0 = this.i;
        zzlf0.zzaz().zzg();
        zzlf0.b();
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            list0 = (List)Preconditions.checkNotNull(zzlf0.x);
            zzlf0.x = null;
            if(v == 200) {
                goto label_10;
            }
            else {
                goto label_8;
            }
            goto label_76;
        }
        catch(Throwable throwable0) {
            zzlf0.t = false;
            zzlf0.w();
            throw throwable0;
        }
    label_8:
        if(v == 204) {
            v = 204;
        label_10:
            if(iOException0 == null) {
                try {
                    zzlf0.i.zzc.zzb(zzlf0.zzav().currentTimeMillis());
                    zzlf0.i.zzd.zzb(0L);
                    zzlf0.y();
                    zzlf0.zzay().zzj().zzc("Successful upload. Got network response. code, size", v, ((int)arr_b.length));
                    e e0 = zzlf0.c;
                    zzlf.D(e0);
                    e0.zzw();
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_59;
                }
                catch(Throwable throwable0) {
                    zzlf0.t = false;
                    zzlf0.w();
                    throw throwable0;
                }
                try {
                    for(Object object0: list0) {
                        Long long0 = (Long)object0;
                        try {
                            e1 = zzlf0.c;
                            zzlf.D(e1);
                            e1.zzg();
                            e1.a();
                            SQLiteDatabase sQLiteDatabase0 = e1.r();
                            String[] arr_s = {String.valueOf(((long)long0))};
                        }
                        catch(SQLiteException sQLiteException1) {
                            goto label_34;
                        }
                        try {
                            if(sQLiteDatabase0.delete("queue", "rowid=?", arr_s) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                            continue;
                        }
                        catch(SQLiteException sQLiteException2) {
                            try {
                                e1.a.zzay().zzd().zzb("Failed to delete a bundle in a queue table", sQLiteException2);
                                throw sQLiteException2;
                            }
                            catch(SQLiteException sQLiteException1) {
                            }
                        }
                    label_34:
                        if(zzlf0.y == null || !zzlf0.y.contains(long0)) {
                            throw sQLiteException1;
                        }
                        if(false) {
                            break;
                        }
                    }
                    e e2 = zzlf0.c;
                    zzlf.D(e2);
                    e2.d();
                    goto label_46;
                }
                catch(Throwable throwable1) {
                    try {
                        try {
                            e e3 = zzlf0.c;
                            zzlf.D(e3);
                            e3.C();
                            throw throwable1;
                        label_46:
                            e e4 = zzlf0.c;
                            zzlf.D(e4);
                            e4.C();
                            zzlf0.y = null;
                            zzlf.D(zzlf0.b);
                            if(!zzlf0.b.zza() || !zzlf0.A()) {
                                zzlf0.z = -1L;
                                zzlf0.y();
                            }
                            else {
                                zzlf0.p();
                            }
                            zzlf0.o = 0L;
                            goto label_76;
                        }
                        catch(SQLiteException sQLiteException0) {
                        }
                    label_59:
                        zzlf0.zzay().zzd().zzb("Database error while trying to delete uploaded bundles", sQLiteException0);
                        zzlf0.o = zzlf0.zzav().elapsedRealtime();
                        zzlf0.zzay().zzj().zzb("Disable upload, time", zzlf0.o);
                        goto label_76;
                    label_63:
                        zzlf0.zzay().zzj().zzc("Network upload failed. Will retry later. code, error", v, iOException0);
                        zzlf0.i.zzd.zzb(zzlf0.zzav().currentTimeMillis());
                        if(v == 429 || v == 503) {
                            zzlf0.i.zzb.zzb(zzlf0.zzav().currentTimeMillis());
                        }
                        e e5 = zzlf0.c;
                        zzlf.D(e5);
                        e5.D(list0);
                        zzlf0.y();
                        goto label_76;
                    }
                    catch(Throwable throwable0) {
                    }
                    zzlf0.t = false;
                    zzlf0.w();
                    throw throwable0;
                }
            }
            else {
                goto label_63;
            }
        }
        else {
            goto label_63;
        }
    label_76:
        zzlf0.t = false;
        zzlf0.w();
    }

    @Override  // i1.h0
    public void zza(String s, Bundle bundle0) {
        boolean z = TextUtils.isEmpty(s);
        zzlf zzlf0 = this.i;
        if(z) {
            zzge zzge0 = zzlf0.l;
            if(zzge0 != null) {
                zzge0.zzay().zzd().zzb("AppId not known when logging event", "_err");
            }
            return;
        }
        zzlf0.zzaz().zzp(new o(this, s, bundle0, 19));
    }
}

