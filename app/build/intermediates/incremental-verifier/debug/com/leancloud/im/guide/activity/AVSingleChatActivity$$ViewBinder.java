// Generated code from Butter Knife. Do not modify!
package com.leancloud.im.guide.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AVSingleChatActivity$$ViewBinder<T extends com.leancloud.im.guide.activity.AVSingleChatActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427448, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131427448, "field 'toolbar'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
  }
}
