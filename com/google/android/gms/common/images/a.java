package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.HashSet;

public final class a implements Runnable {
    public final zag i;
    public final ImageManager j;

    public a(ImageManager imageManager0, zag zag0) {
        this.j = imageManager0;
        this.i = zag0;
    }

    @Override
    public final void run() {
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        ImageReceiver imageManager$ImageReceiver0 = (ImageReceiver)this.j.d.get(this.i);
        if(imageManager$ImageReceiver0 != null) {
            this.j.d.remove(this.i);
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            imageManager$ImageReceiver0.j.remove(this.i);
        }
        zag zag0 = this.i;
        O0.a a0 = zag0.a;
        Uri uri0 = a0.a;
        if(uri0 != null) {
            Long long0 = (Long)this.j.f.get(uri0);
            if(long0 != null) {
                if(SystemClock.elapsedRealtime() - ((long)long0) < 3600000L) {
                    this.i.b(this.j.a, true);
                    return;
                }
                this.j.f.remove(a0.a);
            }
            this.i.a(null, false, true, false);
            ImageReceiver imageManager$ImageReceiver1 = (ImageReceiver)this.j.e.get(a0.a);
            if(imageManager$ImageReceiver1 == null) {
                ImageReceiver imageManager$ImageReceiver2 = new ImageReceiver(this.j, a0.a);
                this.j.e.put(a0.a, imageManager$ImageReceiver2);
                imageManager$ImageReceiver1 = imageManager$ImageReceiver2;
            }
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            imageManager$ImageReceiver1.j.add(this.i);
            zag zag1 = this.i;
            if(!(zag1 instanceof zaf)) {
                this.j.d.put(zag1, imageManager$ImageReceiver1);
            }
            synchronized(ImageManager.g) {
                HashSet hashSet0 = ImageManager.h;
                if(!hashSet0.contains(a0.a)) {
                    hashSet0.add(a0.a);
                    imageManager$ImageReceiver1.a();
                }
            }
            return;
        }
        zag0.b(this.j.a, true);
    }
}

