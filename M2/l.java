package m2;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.spears.civilopedia.planning.edit.PlotEditActivity;

public final class l implements DialogInterface.OnClickListener {
    public final int i;
    public final PlotEditActivity j;

    public l(PlotEditActivity plotEditActivity0, int v) {
        this.i = v;
        this.j = plotEditActivity0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        PlotEditActivity plotEditActivity0 = this.j;
        if(this.i != 0) {
            plotEditActivity0.setResult(102, plotEditActivity0.getIntent());
            plotEditActivity0.finish();
            return;
        }
        plotEditActivity0.setResult(101, plotEditActivity0.getIntent());
        plotEditActivity0.finish();
    }
}

