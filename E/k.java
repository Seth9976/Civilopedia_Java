package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets;
import androidx.recyclerview.widget.RecyclerView;

public abstract class k {
    public static WindowInsets.Builder e() {
        return new WindowInsets.Builder();
    }

    public static WindowInsets.Builder f(WindowInsets windowInsets0) {
        return new WindowInsets.Builder(windowInsets0);
    }

    public static void p(RecyclerView recyclerView0, Context context0, int[] arr_v, AttributeSet attributeSet0, TypedArray typedArray0) {
        recyclerView0.saveAttributeDataForStyleable(context0, arr_v, attributeSet0, typedArray0, 0x7F020125, 0);  // attr:recyclerViewStyle
    }
}

