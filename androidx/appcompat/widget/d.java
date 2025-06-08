package androidx.appcompat.widget;

import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import java.lang.reflect.Method;

public final class d implements View.OnKeyListener {
    public final SearchView i;

    public d(SearchView searchView0) {
        this.i = searchView0;
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        SearchView searchView0 = this.i;
        if(searchView0.j0 == null) {
            return false;
        }
        SearchAutoComplete searchView$SearchAutoComplete0 = searchView0.x;
        if(searchView$SearchAutoComplete0.isPopupShowing() && searchView$SearchAutoComplete0.getListSelection() != -1) {
            if(searchView0.j0 != null && (searchView0.W != null && keyEvent0.getAction() == 0 && keyEvent0.hasNoModifiers())) {
                switch(v) {
                    case 19: {
                        searchView$SearchAutoComplete0.getListSelection();
                        return false;
                    }
                    case 21: 
                    case 22: {
                        searchView$SearchAutoComplete0.setSelection((v == 21 ? 0 : searchView$SearchAutoComplete0.length()));
                        searchView$SearchAutoComplete0.setListSelection(0);
                        searchView$SearchAutoComplete0.clearListSelection();
                        Method method0 = (Method)SearchView.o0.l;
                        if(method0 != null) {
                            try {
                                method0.invoke(searchView$SearchAutoComplete0, Boolean.TRUE);
                                return true;
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                        break;
                    }
                    case 61: 
                    case 66: 
                    case 84: {
                        searchView0.o(searchView$SearchAutoComplete0.getListSelection());
                        break;
                    }
                    default: {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        if(TextUtils.getTrimmedLength(searchView$SearchAutoComplete0.getText()) != 0 && keyEvent0.hasNoModifiers() && keyEvent0.getAction() == 1 && v == 66) {
            view0.cancelLongPress();
            Intent intent0 = searchView0.k(null, "android.intent.action.SEARCH", null, searchView$SearchAutoComplete0.getText().toString());
            searchView0.getContext().startActivity(intent0);
            return true;
        }
        return false;
    }
}

