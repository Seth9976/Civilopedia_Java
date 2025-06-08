package com.google.android.gms.internal.ads;

import android.app.DownloadManager.Request;
import android.app.DownloadManager;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

public final class h2 implements DialogInterface.OnClickListener {
    public final String i;
    public final String j;
    public final zzbws k;

    public h2(zzbws zzbws0, String s, String s1) {
        this.k = zzbws0;
        this.i = s;
        this.j = s1;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        zzbws zzbws0 = this.k;
        DownloadManager downloadManager0 = (DownloadManager)zzbws0.d.getSystemService("download");
        try {
            DownloadManager.Request downloadManager$Request0 = new DownloadManager.Request(Uri.parse(this.i));
            downloadManager$Request0.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, this.j);
            downloadManager$Request0.allowScanningByMediaScanner();
            downloadManager$Request0.setNotificationVisibility(1);
            downloadManager0.enqueue(downloadManager$Request0);
        }
        catch(IllegalStateException unused_ex) {
            zzbws0.zzg("Could not store picture.");
        }
    }
}

