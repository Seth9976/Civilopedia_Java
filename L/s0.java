package l;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import androidx.appcompat.widget.SearchView;

public final class s0 implements View.OnLayoutChangeListener {
    public final SearchView a;

    public s0(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        int v10;
        SearchView searchView0 = this.a;
        View view1 = searchView0.F;
        if(view1.getWidth() > 1) {
            Resources resources0 = searchView0.getContext().getResources();
            int v8 = searchView0.z.getPaddingLeft();
            Rect rect0 = new Rect();
            boolean z = O0.a(searchView0);
            if(searchView0.U) {
                int v9 = resources0.getDimensionPixelSize(0x7F050029);  // dimen:abc_dropdownitem_icon_width
                v10 = resources0.getDimensionPixelSize(0x7F05002A) + v9;  // dimen:abc_dropdownitem_text_padding_left
            }
            else {
                v10 = 0;
            }
            searchView0.x.getDropDownBackground().getPadding(rect0);
            searchView0.x.setDropDownHorizontalOffset((z ? -rect0.left : v8 - (rect0.left + v10)));
            searchView0.x.setDropDownWidth(view1.getWidth() + rect0.left + rect0.right + v10 - v8);
        }
    }
}

