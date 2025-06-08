package C;

import android.app.job.JobInfo.Builder;
import android.media.AudioManager;
import android.text.PrecomputedText.Params.Builder;
import android.text.TextPaint;

public abstract class a {
    public static int a(AudioManager audioManager0) {
        return audioManager0.getStreamMinVolume(3);
    }

    public static PrecomputedText.Params.Builder g(TextPaint textPaint0) {
        return new PrecomputedText.Params.Builder(textPaint0);
    }

    public static void p(JobInfo.Builder jobInfo$Builder0) {
        jobInfo$Builder0.setImportantWhileForeground(true);
    }
}

