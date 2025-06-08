package w0;

import A0.a;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;
import n0.c;
import o2.C;
import q0.i;
import x0.h;

public final class d {
    public final Context a;
    public final x0.d b;
    public final b c;

    public d(Context context0, x0.d d0, b b0) {
        this.a = context0;
        this.b = d0;
        this.c = b0;
    }

    public final void a(i i0, int v, boolean z) {
        Long long0;
        String s1;
        ComponentName componentName0 = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler0 = (JobScheduler)this.a.getSystemService("jobscheduler");
        Adler32 adler320 = new Adler32();
        adler320.update("com.spears.civilopedia".getBytes(Charset.forName("UTF-8")));
        Charset charset0 = Charset.forName("UTF-8");
        adler320.update(i0.a.getBytes(charset0));
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
        c c0 = i0.c;
        adler320.update(byteBuffer0.putInt(a.a(c0)).array());
        byte[] arr_b = i0.b;
        if(arr_b != null) {
            adler320.update(arr_b);
        }
        int v1 = (int)adler320.getValue();
        if(!z) {
            for(Object object0: jobScheduler0.getAllPendingJobs()) {
                int v2 = ((JobInfo)object0).getExtras().getInt("attemptNumber");
                if(((JobInfo)object0).getId() == v1) {
                    if(v2 < v) {
                        break;
                    }
                    C.f("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", i0);
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
        SQLiteDatabase sQLiteDatabase0 = ((h)this.b).a();
        String s = String.valueOf(a.a(c0));
        s1 = i0.a;
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{s1, s})) {
            long0 = cursor0.moveToNext() ? cursor0.getLong(0) : 0L;
        }
        long v3 = (long)long0;
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(v1, componentName0);
        b b0 = this.c;
        jobInfo$Builder0.setMinimumLatency(b0.a(c0, v3, v));
        Set set0 = ((w0.c)b0.b.get(c0)).c;
        if(set0.contains(e.i)) {
            jobInfo$Builder0.setRequiredNetworkType(2);
        }
        else {
            jobInfo$Builder0.setRequiredNetworkType(1);
        }
        if(set0.contains(e.k)) {
            jobInfo$Builder0.setRequiresCharging(true);
        }
        if(set0.contains(e.j)) {
            jobInfo$Builder0.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("attemptNumber", v);
        persistableBundle0.putString("backendName", s1);
        persistableBundle0.putInt("priority", a.a(c0));
        if(arr_b != null) {
            persistableBundle0.putString("extras", Base64.encodeToString(arr_b, 0));
        }
        jobInfo$Builder0.setExtras(persistableBundle0);
        Object[] arr_object = {i0, v1, b0.a(c0, v3, v), long0, v};
        if(Log.isLoggable("TRuntime.JobInfoScheduler", 3)) {
            Log.d("TRuntime.JobInfoScheduler", String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", arr_object));
        }
        jobScheduler0.schedule(jobInfo$Builder0.build());
    }
}

