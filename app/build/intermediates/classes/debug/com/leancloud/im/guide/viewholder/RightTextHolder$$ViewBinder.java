// Generated code from Butter Knife. Do not modify!
package com.leancloud.im.guide.viewholder;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RightTextHolder$$ViewBinder<T extends com.leancloud.im.guide.viewholder.RightTextHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427422, "field 'timeView'");
    target.timeView = finder.castView(view, 2131427422, "field 'timeView'");
    view = finder.findRequiredView(source, 2131427427, "field 'contentView'");
    target.contentView = finder.castView(view, 2131427427, "field 'contentView'");
    view = finder.findRequiredView(source, 2131427428, "field 'nameView'");
    target.nameView = finder.castView(view, 2131427428, "field 'nameView'");
    view = finder.findRequiredView(source, 2131427423, "field 'statusView'");
    target.statusView = finder.castView(view, 2131427423, "field 'statusView'");
    view = finder.findRequiredView(source, 2131427425, "field 'loadingBar'");
    target.loadingBar = finder.castView(view, 2131427425, "field 'loadingBar'");
    view = finder.findRequiredView(source, 2131427426, "field 'errorView' and method 'onErrorClick'");
    target.errorView = finder.castView(view, 2131427426, "field 'errorView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onErrorClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.timeView = null;
    target.contentView = null;
    target.nameView = null;
    target.statusView = null;
    target.loadingBar = null;
    target.errorView = null;
  }
}
