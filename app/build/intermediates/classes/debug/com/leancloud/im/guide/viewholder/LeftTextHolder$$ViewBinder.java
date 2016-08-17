// Generated code from Butter Knife. Do not modify!
package com.leancloud.im.guide.viewholder;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LeftTextHolder$$ViewBinder<T extends com.leancloud.im.guide.viewholder.LeftTextHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427415, "field 'timeView'");
    target.timeView = finder.castView(view, 2131427415, "field 'timeView'");
    view = finder.findRequiredView(source, 2131427418, "field 'contentView' and method 'onNameClick'");
    target.contentView = finder.castView(view, 2131427418, "field 'contentView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onNameClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131427416, "field 'nameView' and method 'onNameClick'");
    target.nameView = finder.castView(view, 2131427416, "field 'nameView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onNameClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.timeView = null;
    target.contentView = null;
    target.nameView = null;
  }
}
