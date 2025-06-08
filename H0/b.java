package h0;

import O.j;
import O.m;
import O2.A;
import S.f;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import q.e;

public final class b extends m {
    public final int d;

    public b(j j0, int v) {
        this.d = v;
        super(j0);
    }

    @Override  // O.m
    public final String b() {
        switch(this.d) {
            case 0: {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
            case 1: {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }
            case 2: {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            }
            case 3: {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }
            case 4: {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }
            case 5: {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            default: {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }
        }
    }

    public final void d(f f0, Object object0) {
        Throwable throwable2;
        ObjectOutputStream objectOutputStream0;
        String s12;
        int v4;
        String s11;
        int v2;
        switch(this.d) {
            case 0: {
                String s2 = ((a)object0).a;
                if(s2 == null) {
                    f0.d(1);
                }
                else {
                    f0.e(1, s2);
                }
                String s3 = ((a)object0).b;
                if(s3 == null) {
                    f0.d(2);
                    return;
                }
                f0.e(2, s3);
                return;
            }
            case 1: {
                String s4 = ((c)object0).a;
                if(s4 == null) {
                    f0.d(1);
                }
                else {
                    f0.e(1, s4);
                }
                Long long0 = ((c)object0).b;
                if(long0 == null) {
                    f0.d(2);
                    return;
                }
                f0.c(2, ((long)long0));
                return;
            }
            case 2: {
                String s5 = ((d)object0).a;
                if(s5 == null) {
                    f0.d(1);
                }
                else {
                    f0.e(1, s5);
                }
                f0.c(2, ((long)((d)object0).b));
                return;
            }
            case 3: {
                ((h0.f)object0).getClass();
                f0.d(1);
                String s6 = ((h0.f)object0).a;
                if(s6 == null) {
                    f0.d(2);
                    return;
                }
                f0.e(2, s6);
                return;
            }
            case 4: {
                String s7 = ((g)object0).a;
                if(s7 == null) {
                    f0.d(1);
                }
                else {
                    f0.e(1, s7);
                }
                byte[] arr_b = Y.f.b(((g)object0).b);
                if(arr_b == null) {
                    f0.d(2);
                    return;
                }
                f0.b(2, arr_b);
                return;
            }
            case 5: {
                String s8 = ((i)object0).a;
                int v = 1;
                if(s8 == null) {
                    f0.d(1);
                }
                else {
                    f0.e(1, s8);
                }
                f0.c(2, ((long)A.b0(((i)object0).b)));
                String s9 = ((i)object0).c;
                if(s9 == null) {
                    f0.d(3);
                }
                else {
                    f0.e(3, s9);
                }
                String s10 = ((i)object0).d;
                if(s10 == null) {
                    f0.d(4);
                }
                else {
                    f0.e(4, s10);
                }
                byte[] arr_b1 = Y.f.b(((i)object0).e);
                if(arr_b1 == null) {
                    f0.d(5);
                }
                else {
                    f0.b(5, arr_b1);
                }
                byte[] arr_b2 = Y.f.b(((i)object0).f);
                if(arr_b2 == null) {
                    f0.d(6);
                }
                else {
                    f0.b(6, arr_b2);
                }
                f0.c(7, ((i)object0).g);
                f0.c(8, ((i)object0).h);
                f0.c(9, ((i)object0).i);
                f0.c(10, ((long)((i)object0).k));
                int v1 = ((i)object0).l;
                switch(e.c(v1)) {
                    case 0: {
                        v2 = 0;
                        break;
                    }
                    case 1: {
                        v2 = 1;
                        break;
                    }
                    default: {
                        StringBuilder stringBuilder0 = new StringBuilder("Could not convert ");
                        switch(v1) {
                            case 1: {
                                s11 = "EXPONENTIAL";
                                break;
                            }
                            case 2: {
                                s11 = "LINEAR";
                                break;
                            }
                            default: {
                                s11 = "null";
                            }
                        }
                        stringBuilder0.append(s11);
                        stringBuilder0.append(" to int");
                        throw new IllegalArgumentException(stringBuilder0.toString());
                    }
                }
                f0.c(11, ((long)v2));
                f0.c(12, ((i)object0).m);
                f0.c(13, ((i)object0).n);
                f0.c(14, ((i)object0).o);
                f0.c(15, ((i)object0).p);
                f0.c(16, ((long)((i)object0).q));
                int v3 = ((i)object0).r;
                switch(e.c(v3)) {
                    case 0: {
                        v4 = 0;
                        break;
                    }
                    case 1: {
                        v4 = 1;
                        break;
                    }
                    default: {
                        StringBuilder stringBuilder1 = new StringBuilder("Could not convert ");
                        switch(v3) {
                            case 1: {
                                s12 = "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
                                break;
                            }
                            case 2: {
                                s12 = "DROP_WORK_REQUEST";
                                break;
                            }
                            default: {
                                s12 = "null";
                            }
                        }
                        stringBuilder1.append(s12);
                        stringBuilder1.append(" to int");
                        throw new IllegalArgumentException(stringBuilder1.toString());
                    }
                }
                f0.c(17, ((long)v4));
                Y.c c0 = ((i)object0).j;
                if(c0 != null) {
                    int v5 = c0.a;
                    switch(e.c(v5)) {
                        case 0: {
                            v = 0;
                            break;
                        }
                        case 1: {
                            break;
                        }
                        case 2: {
                            v = 2;
                            break;
                        }
                        case 3: {
                            v = 3;
                            break;
                        }
                        case 4: {
                            v = 4;
                            break;
                        }
                        default: {
                            if(Build.VERSION.SDK_INT < 30 || v5 != 6) {
                                throw new IllegalArgumentException("Could not convert " + A.f.w(v5) + " to int");
                            }
                            v = 5;
                            break;
                        }
                    }
                    f0.c(18, ((long)v));
                    f0.c(19, ((long)c0.b));
                    f0.c(20, ((long)c0.c));
                    f0.c(21, ((long)c0.d));
                    f0.c(22, ((long)c0.e));
                    f0.c(23, c0.f);
                    f0.c(24, c0.g);
                    Y.e e0 = c0.h;
                    byte[] arr_b3 = null;
                    if(e0.a.size() != 0) {
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        try {
                            objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
                            goto label_158;
                        }
                        catch(IOException iOException0) {
                            goto label_167;
                            try {
                            label_158:
                                objectOutputStream0.writeInt(e0.a.size());
                                Iterator iterator0 = e0.a.iterator();
                                while(true) {
                                    if(!iterator0.hasNext()) {
                                        goto label_191;
                                    }
                                    Object object1 = iterator0.next();
                                    objectOutputStream0.writeUTF(((Y.d)object1).a.toString());
                                    objectOutputStream0.writeBoolean(((Y.d)object1).b);
                                }
                            }
                            catch(IOException iOException0) {
                            }
                            catch(Throwable throwable1) {
                                goto label_179;
                            }
                            arr_b3 = objectOutputStream0;
                            try {
                            label_167:
                                iOException0.printStackTrace();
                                goto label_172;
                            }
                            catch(Throwable throwable0) {
                            }
                            throwable2 = throwable0;
                            goto label_181;
                        }
                        catch(Throwable throwable0) {
                            throwable2 = throwable0;
                            goto label_181;
                        }
                    label_172:
                        if(arr_b3 != null) {
                            try {
                                ((ObjectOutputStream)arr_b3).close();
                            }
                            catch(IOException iOException1) {
                                iOException1.printStackTrace();
                            }
                            goto label_195;
                        label_179:
                            throwable2 = throwable1;
                            arr_b3 = objectOutputStream0;
                        label_181:
                            if(arr_b3 != null) {
                                try {
                                    ((ObjectOutputStream)arr_b3).close();
                                }
                                catch(IOException iOException2) {
                                    iOException2.printStackTrace();
                                }
                            }
                            try {
                                byteArrayOutputStream0.close();
                            }
                            catch(IOException iOException3) {
                                iOException3.printStackTrace();
                            }
                            throw throwable2;
                            try {
                            label_191:
                                objectOutputStream0.close();
                            }
                            catch(IOException iOException4) {
                                iOException4.printStackTrace();
                            }
                        }
                        try {
                        label_195:
                            byteArrayOutputStream0.close();
                        }
                        catch(IOException iOException5) {
                            iOException5.printStackTrace();
                        }
                        arr_b3 = byteArrayOutputStream0.toByteArray();
                    }
                    if(arr_b3 == null) {
                        f0.d(25);
                        return;
                    }
                    f0.b(25, arr_b3);
                    return;
                }
                f0.d(18);
                f0.d(19);
                f0.d(20);
                f0.d(21);
                f0.d(22);
                f0.d(23);
                f0.d(24);
                f0.d(25);
                return;
            }
            default: {
                String s = ((h0.j)object0).a;
                if(s == null) {
                    f0.d(1);
                }
                else {
                    f0.e(1, s);
                }
                String s1 = ((h0.j)object0).b;
                if(s1 == null) {
                    f0.d(2);
                    return;
                }
                f0.e(2, s1);
            }
        }
    }

    public final void e(Object object0) {
        f f0 = this.a();
        try {
            this.d(f0, object0);
            f0.l.executeInsert();
        }
        finally {
            this.c(f0);
        }
    }
}

