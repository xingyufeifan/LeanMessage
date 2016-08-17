// Generated code from Butter Knife. Do not modify!
package com.leancloud.im.guide.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AVSquareMembersActivity$$ViewBinder<T extends com.leancloud.im.guide.activity.AVSquareMembersActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427448, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131427448, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131427412, "field 'refreshLayout'");
    target.refreshLayout = finder.castView(view, 2131427412, "field 'refreshLayout'");
    view = finder.findRequiredView(source, 2131427414, "field 'letterView'");
    target.letterView = finder.castView(view, 2131427414, "field 'letterView'");
    view = finder.findRequiredView(source, 2131427413, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131427413, "field 'recyclerView'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.refreshLayout = null;
    target.letterView = null;
    target.recyclerView = null;
  }
}
