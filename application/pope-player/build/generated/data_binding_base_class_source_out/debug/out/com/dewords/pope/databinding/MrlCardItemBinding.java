// Generated by data binding compiler. Do not edit!
package com.dewords.pope.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dewords.pope.R;
import java.lang.Deprecated;
import java.lang.Object;
import org.videolan.medialibrary.interfaces.media.MediaWrapper;

public abstract class MrlCardItemBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView mrlCtx;

  @NonNull
  public final TextView mrlItemTitle;

  @NonNull
  public final TextView mrlItemUri;

  @Bindable
  protected MediaWrapper mItem;

  protected MrlCardItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout container, ImageView imageView10, ImageView mrlCtx, TextView mrlItemTitle,
      TextView mrlItemUri) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
    this.imageView10 = imageView10;
    this.mrlCtx = mrlCtx;
    this.mrlItemTitle = mrlItemTitle;
    this.mrlItemUri = mrlItemUri;
  }

  public abstract void setItem(@Nullable MediaWrapper item);

  @Nullable
  public MediaWrapper getItem() {
    return mItem;
  }

  @NonNull
  public static MrlCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.mrl_card_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MrlCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MrlCardItemBinding>inflateInternal(inflater, R.layout.mrl_card_item, root, attachToRoot, component);
  }

  @NonNull
  public static MrlCardItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.mrl_card_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MrlCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MrlCardItemBinding>inflateInternal(inflater, R.layout.mrl_card_item, null, false, component);
  }

  public static MrlCardItemBinding bind(@NonNull View view) {
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
  public static MrlCardItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (MrlCardItemBinding)bind(component, view, R.layout.mrl_card_item);
  }
}
