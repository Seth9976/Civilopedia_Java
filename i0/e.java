package i0;

import androidx.work.impl.WorkDatabase;
import h0.c;

public final class e {
    public final WorkDatabase a;

    public e(WorkDatabase workDatabase0) {
        this.a = workDatabase0;
        super();
    }

    public int a(int v) {
        int v4;
        int v3;
        synchronized(e.class) {
            this.a.c();
            try {
                Long long0 = this.a.j().j("next_job_scheduler_id");
                v3 = 0;
                v4 = long0 == null ? 0 : long0.intValue();
                this.a.j().m(new c("next_job_scheduler_id", ((long)(v4 == 0x7FFFFFFF ? 0 : v4 + 1))));
                this.a.h();
            }
            finally {
                this.a.f();
            }
            if(v4 < 0 || v4 > v) {
                this.a.j().m(new c("next_job_scheduler_id", 1L));
            }
            else {
                v3 = v4;
            }
            return v3;
        }
    }
}

