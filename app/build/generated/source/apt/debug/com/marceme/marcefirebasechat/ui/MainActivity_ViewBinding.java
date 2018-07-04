// Generated code from Butter Knife. Do not modify!
package com.marceme.marcefirebasechat.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.marceme.marcefirebasechat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mProgressBarForUsers = Utils.findRequiredViewAsType(source, R.id.progress_bar_users, "field 'mProgressBarForUsers'", ProgressBar.class);
    target.mUsersRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view_users, "field 'mUsersRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mProgressBarForUsers = null;
    target.mUsersRecyclerView = null;

    this.target = null;
  }
}
