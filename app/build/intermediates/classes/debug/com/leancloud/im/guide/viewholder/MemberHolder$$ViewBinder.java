// Generated code from Butter Knife. Do not modify!
package com.leancloud.im.guide.viewholder;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MemberHolder$$ViewBinder<T extends com.leancloud.im.guide.viewholder.MemberHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427410, "field 'mTextView'");
    target.mTextView = finder.castView(view, 2131427410, "field 'mTextView'");
  }

  @Override public void unbind(T target) {
    target.mTextView = null;
  }
}
