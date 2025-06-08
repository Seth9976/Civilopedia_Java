package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;

public final class c implements View.OnClickListener {
    public final SearchView i;

    public c(SearchView searchView0) {
        this.i = searchView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SearchView searchView0 = this.i;
        SearchAutoComplete searchView$SearchAutoComplete0 = searchView0.x;
        if(view0 == searchView0.B) {
            searchView0.x(false);
            searchView$SearchAutoComplete0.requestFocus();
            searchView$SearchAutoComplete0.setImeVisibility(true);
            View.OnClickListener view$OnClickListener0 = searchView0.T;
            if(view$OnClickListener0 != null) {
                view$OnClickListener0.onClick(searchView0);
                return;
            }
        }
        else {
            if(view0 == searchView0.D) {
                searchView0.n();
                return;
            }
            if(view0 == searchView0.C) {
                searchView0.r();
                return;
            }
            if(view0 == searchView0.E) {
                SearchableInfo searchableInfo0 = searchView0.j0;
                if(searchableInfo0 != null) {
                    try {
                        if(searchableInfo0.getVoiceSearchLaunchWebSearch()) {
                            Intent intent0 = new Intent(searchView0.P);
                            ComponentName componentName0 = searchableInfo0.getSearchActivity();
                            intent0.putExtra("calling_package", (componentName0 == null ? null : componentName0.flattenToShortString()));
                            searchView0.getContext().startActivity(intent0);
                            return;
                        }
                        if(searchableInfo0.getVoiceSearchLaunchRecognizer()) {
                            Intent intent1 = searchView0.l(searchView0.Q, searchableInfo0);
                            searchView0.getContext().startActivity(intent1);
                            return;
                        }
                    }
                    catch(ActivityNotFoundException unused_ex) {
                        Log.w("SearchView", "Could not find voice search activity");
                        return;
                    }
                }
            }
            else if(view0 == searchView$SearchAutoComplete0) {
                searchView0.m();
            }
        }
        try {
        }
        catch(ActivityNotFoundException unused_ex) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}

