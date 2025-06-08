package androidx.fragment.app;

import B.b;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import java.util.Collections;
import java.util.HashMap;

public abstract class c extends h implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    public Handler f0;
    public final b g0;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public Dialog m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;

    public c() {
        this.g0 = new b(this, 16);
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = true;
        this.l0 = -1;
    }

    public void dismiss() {
        this.k(false, false);
    }

    public void dismissAllowingStateLoss() {
        this.k(true, false);
    }

    public Dialog getDialog() {
        return this.m0;
    }

    public boolean getShowsDialog() {
        return this.k0;
    }

    public int getTheme() {
        return this.i0;
    }

    public boolean isCancelable() {
        return this.j0;
    }

    public final void k(boolean z, boolean z1) {
        if(this.o0) {
            return;
        }
        this.o0 = true;
        this.p0 = false;
        Dialog dialog0 = this.m0;
        if(dialog0 != null) {
            dialog0.setOnDismissListener(null);
            this.m0.dismiss();
            if(!z1) {
                if(Looper.myLooper() == this.f0.getLooper()) {
                    this.onDismiss(this.m0);
                }
                else {
                    this.f0.post(this.g0);
                }
            }
        }
        this.n0 = true;
        if(this.l0 >= 0) {
            l l0 = this.requireFragmentManager();
            int v = this.l0;
            ((v)l0).getClass();
            if(v < 0) {
                throw new IllegalArgumentException("Bad id: " + v);
            }
            ((v)l0).H(new t(((v)l0), v), false);
            this.l0 = -1;
            return;
        }
        v v1 = (v)this.requireFragmentManager();
        v1.getClass();
        a a0 = new a(v1);
        if(this.z != null && this.z != a0.q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + this.toString() + " is already attached to a FragmentManager.");
        }
        a0.c(new y(this, 3));
        if(z) {
            a0.e(true);
            return;
        }
        a0.e(false);
    }

    @Override  // androidx.fragment.app.h
    public void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        if(!this.k0) {
            return;
        }
        View view0 = this.getView();
        if(view0 != null) {
            if(view0.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            this.m0.setContentView(view0);
        }
        j j0 = this.getActivity();
        if(j0 != null) {
            this.m0.setOwnerActivity(j0);
        }
        this.m0.setCancelable(this.j0);
        this.m0.setOnCancelListener(this);
        this.m0.setOnDismissListener(this);
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("android:savedDialogState");
            if(bundle1 != null) {
                this.m0.onRestoreInstanceState(bundle1);
            }
        }
    }

    @Override  // androidx.fragment.app.h
    public void onAttach(Context context0) {
        super.onAttach(context0);
        if(!this.p0) {
            this.o0 = false;
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public void onCancel(DialogInterface dialogInterface0) {
    }

    @Override  // androidx.fragment.app.h
    public void onCreate(Bundle bundle0) {
        this.M = true;
        if(bundle0 != null) {
            Parcelable parcelable0 = bundle0.getParcelable("android:support:fragments");
            if(parcelable0 != null) {
                this.B.d0(parcelable0);
                this.B.k();
            }
        }
        v v0 = this.B;
        if(v0.w < 1) {
            v0.k();
        }
        this.f0 = new Handler();
        this.k0 = this.E == 0;
        if(bundle0 != null) {
            this.h0 = bundle0.getInt("android:style", 0);
            this.i0 = bundle0.getInt("android:theme", 0);
            this.j0 = bundle0.getBoolean("android:cancelable", true);
            this.k0 = bundle0.getBoolean("android:showsDialog", this.k0);
            this.l0 = bundle0.getInt("android:backStackId", -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle0) {
        return new Dialog(this.requireContext(), this.getTheme());
    }

    @Override  // androidx.fragment.app.h
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog0 = this.m0;
        if(dialog0 != null) {
            this.n0 = true;
            dialog0.setOnDismissListener(null);
            this.m0.dismiss();
            if(!this.o0) {
                this.onDismiss(this.m0);
            }
            this.m0 = null;
        }
    }

    @Override  // androidx.fragment.app.h
    public void onDetach() {
        super.onDetach();
        if(!this.p0 && !this.o0) {
            this.o0 = true;
        }
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface0) {
        if(!this.n0) {
            this.k(true, true);
        }
    }

    @Override  // androidx.fragment.app.h
    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        if(!this.k0) {
            return super.onGetLayoutInflater(bundle0);
        }
        Dialog dialog0 = this.onCreateDialog(bundle0);
        this.m0 = dialog0;
        if(dialog0 != null) {
            this.setupDialog(dialog0, this.h0);
            return (LayoutInflater)this.m0.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater)this.A.k.getSystemService("layout_inflater");
    }

    @Override  // androidx.fragment.app.h
    public void onSaveInstanceState(Bundle bundle0) {
        Dialog dialog0 = this.m0;
        if(dialog0 != null) {
            Bundle bundle1 = dialog0.onSaveInstanceState();
            if(bundle1 != null) {
                bundle0.putBundle("android:savedDialogState", bundle1);
            }
        }
        int v = this.h0;
        if(v != 0) {
            bundle0.putInt("android:style", v);
        }
        int v1 = this.i0;
        if(v1 != 0) {
            bundle0.putInt("android:theme", v1);
        }
        if(!this.j0) {
            bundle0.putBoolean("android:cancelable", false);
        }
        if(!this.k0) {
            bundle0.putBoolean("android:showsDialog", false);
        }
        int v2 = this.l0;
        if(v2 != -1) {
            bundle0.putInt("android:backStackId", v2);
        }
    }

    @Override  // androidx.fragment.app.h
    public void onStart() {
        this.M = true;
        Dialog dialog0 = this.m0;
        if(dialog0 != null) {
            this.n0 = false;
            dialog0.show();
        }
    }

    @Override  // androidx.fragment.app.h
    public void onStop() {
        this.M = true;
        Dialog dialog0 = this.m0;
        if(dialog0 != null) {
            dialog0.hide();
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog0 = this.getDialog();
        if(dialog0 == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        return dialog0;
    }

    public void setCancelable(boolean z) {
        this.j0 = z;
        Dialog dialog0 = this.m0;
        if(dialog0 != null) {
            dialog0.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.k0 = z;
    }

    public void setStyle(int v, int v1) {
        this.h0 = v;
        if(v == 2 || v == 3) {
            this.i0 = 0x1030059;
        }
        if(v1 != 0) {
            this.i0 = v1;
        }
    }

    public void setupDialog(Dialog dialog0, int v) {
        switch(v) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                dialog0.getWindow().addFlags(24);
                break;
            }
            default: {
                return;
            }
        }
        dialog0.requestWindowFeature(1);
    }

    public int show(z z0, String s) {
        this.o0 = false;
        this.p0 = true;
        z0.b(this, s);
        this.n0 = false;
        int v = ((a)z0).e(false);
        this.l0 = v;
        return v;
    }

    public void show(l l0, String s) {
        this.o0 = false;
        this.p0 = true;
        ((v)l0).getClass();
        a a0 = new a(((v)l0));
        a0.b(this, s);
        a0.e(false);
    }

    public void showNow(l l0, String s) {
        this.o0 = false;
        this.p0 = true;
        ((v)l0).getClass();
        a a0 = new a(((v)l0));
        a0.b(this, s);
        if(a0.h) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        v v0 = a0.q;
        v0.I(false);
        a0.a(v0.G, v0.H);
        v0.l = true;
        try {
            v0.c0(v0.G, v0.H);
        }
        catch(Throwable throwable0) {
            v0.f();
            throw throwable0;
        }
        v0.f();
        v0.l0();
        HashMap hashMap0 = v0.o;
        if(v0.F) {
            v0.F = false;
            for(Object object0: hashMap0.values()) {
                h h0 = (h)object0;
                if(h0 == null || !h0.Q) {
                }
                else if(v0.l) {
                    v0.F = true;
                }
                else {
                    h0.Q = false;
                    v0.Y(h0, v0.w, 0, 0, false);
                }
            }
        }
        hashMap0.values().removeAll(Collections.singleton(null));
    }
}

