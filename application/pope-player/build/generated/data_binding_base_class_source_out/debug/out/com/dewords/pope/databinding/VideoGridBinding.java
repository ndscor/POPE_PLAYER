// Generated by data binding compiler. Do not edit!
package com.dewords.pope.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dewords.pope.R;
import com.dewords.pope.gui.view.AutoFitRecyclerView;
import com.dewords.pope.gui.view.EmptyLoadingStateView;
import com.dewords.pope.gui.view.FastScroller;
import com.dewords.pope.gui.view.SwipeRefreshLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class VideoGridBinding extends ViewDataBinding {
  @NonNull
  public final EmptyLoadingStateView emptyLoading;

  @NonNull
  public final FastScroller fastScroller;

  @NonNull
  public final SwipeRefreshLayout swipeLayout;

  @NonNull
  public final AutoFitRecyclerView videoGrid;

  @Bindable
  protected boolean mEmpty;

  protected VideoGridBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EmptyLoadingStateView emptyLoading, FastScroller fastScroller, SwipeRefreshLayout swipeLayout,
      AutoFitRecyclerView videoGrid) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emptyLoading = emptyLoading;
    this.fastScroller = fastScroller;
    this.swipeLayout = swipeLayout;
    this.videoGrid = videoGrid;
  }

  public abstract void setEmpty(boolean empty);

  public boolean getEmpty() {
    return mEmpty;
  }

  @NonNull
  public static VideoGridBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.video_grid, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VideoGridBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VideoGridBinding>inflateInternal(inflater, R.layout.video_grid, root, attachToRoot, component);
  }

  @NonNull
  public static VideoGridBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.video_grid, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VideoGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VideoGridBinding>inflateInternal(inflater, R.layout.video_grid, null, false, component);
  }

  public static VideoGridBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static VideoGridBinding bind(@NonNull View view, @Nullable Object component) {
    return (VideoGridBinding)bind(component, view, R.layout.video_grid);
  }
}
