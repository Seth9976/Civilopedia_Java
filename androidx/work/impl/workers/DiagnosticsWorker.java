package androidx.work.impl.workers;

import B1.a;
import O.k;
import O2.A;
import Y.c;
import Y.f;
import Y.l;
import Y.m;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase_Impl;
import g1.n;
import h0.d;
import h0.i;
import i3.e;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DiagnosticsWorker extends Worker {
    public static final String o;

    static {
        DiagnosticsWorker.o = "WM-DiagnosticsWrkr";
    }

    public DiagnosticsWorker(Context context0, WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
    }

    public static String a(n n0, n n1, a a0, ArrayList arrayList0) {
        ArrayList arrayList1;
        String s5;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for(Object object0: arrayList0) {
            d d0 = a0.s(((i)object0).a);
            Integer integer0 = d0 == null ? null : d0.b;
            String s = ((i)object0).a;
            n0.getClass();
            k k0 = k.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if(s == null) {
                k0.e(1);
            }
            else {
                k0.f(1, s);
            }
            WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)n0.j;
            workDatabase_Impl0.b();
            Cursor cursor0 = workDatabase_Impl0.g(k0);
            try {
                arrayList1 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    arrayList1.add(cursor0.getString(0));
                }
            }
            finally {
                cursor0.close();
                k0.release();
            }
            ArrayList arrayList2 = n1.k(((i)object0).a);
            String s1 = TextUtils.join(",", arrayList1);
            String s2 = TextUtils.join(",", arrayList2);
            String s3 = ((i)object0).a;
            String s4 = ((i)object0).c;
            switch(((i)object0).b) {
                case 1: {
                    s5 = "ENQUEUED";
                    break;
                }
                case 2: {
                    s5 = "RUNNING";
                    break;
                }
                case 3: {
                    s5 = "SUCCEEDED";
                    break;
                }
                case 4: {
                    s5 = "FAILED";
                    break;
                }
                case 5: {
                    s5 = "BLOCKED";
                    break;
                }
                case 6: {
                    s5 = "CANCELLED";
                    break;
                }
                default: {
                    throw null;
                }
            }
            StringBuilder stringBuilder1 = e.j("\n", s3, "\t ", s4, "\t ");
            e.l(integer0, "\t ", s5, "\t ", stringBuilder1);
            stringBuilder0.append(e.i(stringBuilder1, s1, "\t ", s2, "\t"));
        }
        return stringBuilder0.toString();
    }

    @Override  // androidx.work.Worker
    public final l doWork() {
        ArrayList arrayList0;
        n n3;
        n n2;
        a a1;
        Z.k k0 = Z.k.U(this.getApplicationContext());
        E1.d d0 = k0.m.n();
        n n0 = k0.m.l();
        n n1 = k0.m.o();
        a a0 = k0.m.k();
        long v = TimeUnit.DAYS.toMillis(1L);
        d0.getClass();
        k k1 = k.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        k1.d(1, System.currentTimeMillis() - v);
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)d0.i;
        workDatabase_Impl0.b();
        Cursor cursor0 = workDatabase_Impl0.g(k1);
        try {
            int v2 = o1.a.v(cursor0, "required_network_type");
            int v3 = o1.a.v(cursor0, "requires_charging");
            int v4 = o1.a.v(cursor0, "requires_device_idle");
            int v5 = o1.a.v(cursor0, "requires_battery_not_low");
            int v6 = o1.a.v(cursor0, "requires_storage_not_low");
            int v7 = o1.a.v(cursor0, "trigger_content_update_delay");
            int v8 = o1.a.v(cursor0, "trigger_max_content_delay");
            int v9 = o1.a.v(cursor0, "content_uri_triggers");
            int v10 = o1.a.v(cursor0, "id");
            int v11 = o1.a.v(cursor0, "state");
            int v12 = o1.a.v(cursor0, "worker_class_name");
            int v13 = o1.a.v(cursor0, "input_merger_class_name");
            int v14 = o1.a.v(cursor0, "input");
            int v15 = o1.a.v(cursor0, "output");
            int v16 = o1.a.v(cursor0, "initial_delay");
            int v17 = o1.a.v(cursor0, "interval_duration");
            int v18 = o1.a.v(cursor0, "flex_duration");
            int v19 = o1.a.v(cursor0, "run_attempt_count");
            int v20 = o1.a.v(cursor0, "backoff_policy");
            int v21 = o1.a.v(cursor0, "backoff_delay_duration");
            int v22 = o1.a.v(cursor0, "period_start_time");
            int v23 = o1.a.v(cursor0, "minimum_retention_duration");
            int v24 = o1.a.v(cursor0, "schedule_requested_at");
            int v25 = o1.a.v(cursor0, "run_in_foreground");
            int v26 = o1.a.v(cursor0, "out_of_quota_policy");
            arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v10);
                String s1 = cursor0.getString(v12);
                c c0 = new c();
                c0.a = A.L(cursor0.getInt(v2));
                c0.b = cursor0.getInt(v3) != 0;
                c0.c = cursor0.getInt(v4) != 0;
                c0.d = cursor0.getInt(v5) != 0;
                c0.e = cursor0.getInt(v6) != 0;
                c0.f = cursor0.getLong(v7);
                c0.g = cursor0.getLong(v8);
                c0.h = A.f(cursor0.getBlob(v9));
                i i0 = new i(s, s1);
                i0.b = A.N(cursor0.getInt(v11));
                i0.d = cursor0.getString(v13);
                i0.e = f.a(cursor0.getBlob(v14));
                i0.f = f.a(cursor0.getBlob(v15));
                i0.g = cursor0.getLong(v16);
                i0.h = cursor0.getLong(v17);
                i0.i = cursor0.getLong(v18);
                i0.k = cursor0.getInt(v19);
                i0.l = A.K(cursor0.getInt(v20));
                i0.m = cursor0.getLong(v21);
                i0.n = cursor0.getLong(v22);
                i0.o = cursor0.getLong(v23);
                i0.p = cursor0.getLong(v24);
                i0.q = cursor0.getInt(v25) != 0;
                i0.r = A.M(cursor0.getInt(v26));
                i0.j = c0;
                arrayList0.add(i0);
            }
        }
        finally {
            cursor0.close();
            k1.release();
        }
        ArrayList arrayList1 = d0.g();
        ArrayList arrayList2 = d0.d();
        if(arrayList0.isEmpty()) {
            a1 = a0;
            n2 = n0;
            n3 = n1;
        }
        else {
            m.d().e("WM-DiagnosticsWrkr", "Recently completed work:\n\n", new Throwable[0]);
            a1 = a0;
            n2 = n0;
            n3 = n1;
            m.d().e("WM-DiagnosticsWrkr", DiagnosticsWorker.a(n2, n3, a1, arrayList0), new Throwable[0]);
        }
        if(!arrayList1.isEmpty()) {
            m.d().e("WM-DiagnosticsWrkr", "Running work:\n\n", new Throwable[0]);
            m.d().e("WM-DiagnosticsWrkr", DiagnosticsWorker.a(n2, n3, a1, arrayList1), new Throwable[0]);
        }
        if(!arrayList2.isEmpty()) {
            m.d().e("WM-DiagnosticsWrkr", "Enqueued work:\n\n", new Throwable[0]);
            m.d().e("WM-DiagnosticsWrkr", DiagnosticsWorker.a(n2, n3, a1, arrayList2), new Throwable[0]);
        }
        return new Y.k(f.c);
    }
}

