package h0;

import O.j;
import O.m;

public final class e extends m {
    public final int d;

    public e(j j0, int v) {
        this.d = v;
        super(j0);
    }

    @Override  // O.m
    public final String b() {
        switch(this.d) {
            case 0: {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
            case 1: {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
            case 2: {
                return "DELETE FROM WorkProgress";
            }
            case 3: {
                return "DELETE FROM workspec WHERE id=?";
            }
            case 4: {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
            case 5: {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
            case 6: {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
            case 7: {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
            case 8: {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
            default: {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        }
    }
}

