package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public final class b implements Runnable {
    public final Uri i;
    public final Bitmap j;
    public final CountDownLatch k;
    public final ImageManager l;

    public b(ImageManager imageManager0, Uri uri0, Bitmap bitmap0, CountDownLatch countDownLatch0) {
        this.l = imageManager0;
        this.i = uri0;
        this.j = bitmap0;
        this.k = countDownLatch0;
    }

    @Override
    public final void run() {
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageReceiver imageManager$ImageReceiver0 = (ImageReceiver)this.l.e.remove(this.i);
        if(imageManager$ImageReceiver0 != null) {
            ArrayList arrayList0 = imageManager$ImageReceiver0.j;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                zag zag0 = (zag)arrayList0.get(v1);
                Bitmap bitmap0 = this.j;
                if(bitmap0 == null) {
                    Long long0 = SystemClock.elapsedRealtime();
                    this.l.f.put(this.i, long0);
                    zag0.b(this.l.a, false);
                }
                else {
                    zag0.getClass();
                    Asserts.checkNotNull(bitmap0);
                    zag0.a(new BitmapDrawable(this.l.a.getResources(), bitmap0), false, false, true);
                }
                if(!(zag0 instanceof zaf)) {
                    this.l.d.remove(zag0);
                }
            }
        }
        this.k.countDown();
        synchronized(ImageManager.g) {
            ImageManager.h.remove(this.i);
        }
    }
}

