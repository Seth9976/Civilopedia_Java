package N;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class y {
    public final RecyclerView a;

    public y(RecyclerView recyclerView0) {
        this.a = recyclerView0;
        super();
    }

    public void a(int v) {
        RecyclerView recyclerView0 = this.a;
        View view0 = recyclerView0.getChildAt(v);
        if(view0 != null) {
            RecyclerView.G(view0);
            view0.clearAnimation();
        }
        recyclerView0.removeViewAt(v);
    }
}

