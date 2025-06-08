package k2;

import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;

public final class a implements View.OnCreateContextMenuListener {
    public final int i;

    public a(int v) {
        this.i = v;
    }

    @Override  // android.view.View$OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu0, View view0, ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        if(contextMenu0 != null) {
            String s = android.support.v4.media.session.a.H("LOC_DELETE_BUTTON", new Object[0]);
            contextMenu0.add(101, 0, this.i, s);
        }
    }
}

