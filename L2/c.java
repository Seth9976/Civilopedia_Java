package l2;

import J2.j;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.view.View;
import com.spears.civilopedia.planning.PlanningActivity;

public final class c extends View {
    public final Paint i;
    public final Path j;

    public c(PlanningActivity planningActivity0, Path path0, Path path1) {
        super(planningActivity0);
        Paint paint0 = new Paint();
        this.i = paint0;
        this.setElevation(200.0f);
        paint0.setStyle(Paint.Style.FILL);
        paint0.setColor(0xFF000000);
        paint0.setAlpha(76);
        paint0.setAntiAlias(true);
        Path path2 = new Path();
        this.j = path2;
        path2.addPath(path0);
        path2.addPath(path1);
        path2.setFillType(Path.FillType.EVEN_ODD);
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        j.f(canvas0, "canvas");
        super.onDraw(canvas0);
        canvas0.drawPath(this.j, this.i);
    }
}

