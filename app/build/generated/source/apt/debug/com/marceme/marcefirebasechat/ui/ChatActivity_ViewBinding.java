// Generated code from Butter Knife. Do not modify!
package com.marceme.marcefirebasechat.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.marceme.marcefirebasechat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatActivity_ViewBinding<T extends ChatActivity> implements Unbinder {
  protected T target;

  private View view2131296270;

  @UiThread
  public ChatActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mChatRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view_chat, "field 'mChatRecyclerView'", RecyclerView.class);
    target.mUserMessageChatText = Utils.findRequiredViewAsType(source, R.id.edit_text_message, "field 'mUserMessageChatText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_send_message, "method 'btnSendMsgListener'");
    view2131296270 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.btnSendMsgListener(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mChatRecyclerView = null;
    target.mUserMessageChatText = null;

    view2131296270.setOnClickListener(null);
    view2131296270 = null;

    this.target = null;
  }
}
