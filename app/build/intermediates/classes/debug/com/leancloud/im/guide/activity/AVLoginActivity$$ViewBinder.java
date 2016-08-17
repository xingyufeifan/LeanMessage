// Generated code from Butter Knife. Do not modify!
package com.leancloud.im.guide.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AVLoginActivity$$ViewBinder<T extends com.leancloud.im.guide.activity.AVLoginActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427408, "field 'userNameView'");
    target.userNameView = finder.castView(view, 2131427408, "field 'userNameView'");
    view = finder.findRequiredView(source, 2131427409, "field 'loginButton' and method 'onLoginClick'");
    target.loginButton = finder.castView(view, 2131427409, "field 'loginButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onLoginClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.userNameView = null;
    target.loginButton = null;
  }
}
