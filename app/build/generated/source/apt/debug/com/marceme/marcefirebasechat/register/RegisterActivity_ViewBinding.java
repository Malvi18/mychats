// Generated code from Butter Knife. Do not modify!
package com.marceme.marcefirebasechat.register;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.marceme.marcefirebasechat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisterActivity_ViewBinding<T extends RegisterActivity> implements Unbinder {
  protected T target;

  private View view2131296282;

  private View view2131296283;

  @UiThread
  public RegisterActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mUserFirstNameRegister = Utils.findRequiredViewAsType(source, R.id.edit_text_display_name, "field 'mUserFirstNameRegister'", EditText.class);
    target.mUserEmailRegister = Utils.findRequiredViewAsType(source, R.id.edit_text_email_register, "field 'mUserEmailRegister'", EditText.class);
    target.mUserPassWordRegister = Utils.findRequiredViewAsType(source, R.id.edit_text_password_register, "field 'mUserPassWordRegister'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_register_user, "method 'registerUserClickListener'");
    view2131296282 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.registerUserClickListener(Utils.<Button>castParam(p0, "doClick", 0, "registerUserClickListener", 0));
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_cancel_register, "method 'cancelClickListener'");
    view2131296283 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cancelClickListener(Utils.<Button>castParam(p0, "doClick", 0, "cancelClickListener", 0));
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mUserFirstNameRegister = null;
    target.mUserEmailRegister = null;
    target.mUserPassWordRegister = null;

    view2131296282.setOnClickListener(null);
    view2131296282 = null;
    view2131296283.setOnClickListener(null);
    view2131296283 = null;

    this.target = null;
  }
}
