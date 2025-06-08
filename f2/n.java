package f2;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.c;
import androidx.fragment.app.j;

public final class n extends c {
    @Override  // androidx.fragment.app.c
    public final Dialog onCreateDialog(Bundle bundle0) {
        new AlertDialog.Builder(this.getActivity());
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(new ContextThemeWrapper(this.getActivity(), 0x7F0F0002));  // style:AlertDialogTheme
        j j0 = this.getActivity();
        J2.j.c(j0);
        LayoutInflater layoutInflater0 = j0.getLayoutInflater();
        J2.j.e(layoutInflater0, "getLayoutInflater(...)");
        View view0 = layoutInflater0.inflate(0x7F0A0030, null, false);  // layout:dialog_google_play_unavailable
        new TextView(this.getContext()).setText(0x7F0E0012);  // string:GOOGLE_PLAY_SERVICES_UNAVAILABLE "Keep your device & apps working with Google 
                                                              // Play Services"
        alertDialog$Builder0.setView(view0).setPositiveButton(0x104000A, new f2.c(0));
        Dialog dialog0 = alertDialog$Builder0.create();
        J2.j.e(dialog0, "create(...)");
        return dialog0;
    }
}

