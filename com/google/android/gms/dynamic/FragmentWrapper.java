package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@SuppressLint({"NewApi"})
@KeepForSdk
public final class FragmentWrapper extends Stub {
    public final Fragment i;

    public FragmentWrapper(Fragment fragment0) {
        this.i = fragment0;
    }

    @KeepForSdk
    public static FragmentWrapper wrap(Fragment fragment0) {
        return fragment0 == null ? null : new FragmentWrapper(fragment0);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzA() {
        return this.i.isVisible();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzb() {
        return this.i.getId();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzc() {
        return this.i.getTargetRequestCode();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzd() {
        return this.i.getArguments();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        return FragmentWrapper.wrap(this.i.getParentFragment());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzf() {
        return FragmentWrapper.wrap(this.i.getTargetFragment());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.i.getActivity());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.i.getResources());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzi() {
        return ObjectWrapper.wrap(this.i.getView());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzj() {
        return this.i.getTag();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzk(IObjectWrapper iObjectWrapper0) {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        Preconditions.checkNotNull(view0);
        this.i.registerForContextMenu(view0);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzl(boolean z) {
        this.i.setHasOptionsMenu(z);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzm(boolean z) {
        this.i.setMenuVisibility(z);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzn(boolean z) {
        this.i.setRetainInstance(z);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzo(boolean z) {
        this.i.setUserVisibleHint(z);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzp(Intent intent0) {
        this.i.startActivity(intent0);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzq(Intent intent0, int v) {
        this.i.startActivityForResult(intent0, v);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzr(IObjectWrapper iObjectWrapper0) {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        Preconditions.checkNotNull(view0);
        this.i.unregisterForContextMenu(view0);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.i.getRetainInstance();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzt() {
        return this.i.getUserVisibleHint();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzu() {
        return this.i.isAdded();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzv() {
        return this.i.isDetached();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzw() {
        return this.i.isHidden();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzx() {
        return this.i.isInLayout();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzy() {
        return this.i.isRemoving();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzz() {
        return this.i.isResumed();
    }
}

