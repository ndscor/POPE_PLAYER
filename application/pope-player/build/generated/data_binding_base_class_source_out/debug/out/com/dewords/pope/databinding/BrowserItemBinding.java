// Generated by data binding compiler. Do not edit!
package com.dewords.pope.databinding;

import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dewords.pope.R;
import com.dewords.pope.gui.browser.BaseBrowserAdapter;
import com.dewords.pope.gui.helpers.ThreeStatesCheckbox;
import java.lang.Deprecated;
import java.lang.Object;
import org.videolan.medialibrary.media.MediaLibraryItem;

public abstract class BrowserItemBinding extends ViewDataBinding {
  @NonNull
  public final ThreeStatesCheckbox browserCheckbox;

  @NonNull
  public final ConstraintLayout browserContainer;

  @NonNull
  public final TextView dviIcon;

  @NonNull
  public final AppCompatImageView itemBan;

  @NonNull
  public final ImageView itemIcon;

  @NonNull
  public final ImageView itemMore;

  @NonNull
  public final TextView text;

  @NonNull
  public final TextView title;

  @Bindable
  protected BaseBrowserAdapter.ViewHolder mHolder;

  @Bindable
  protected MediaLibraryItem mItem;

  @Bindable
  protected String mFilename;

  @Bindable
  protected boolean mHasContextMenu;

  @Bindable
  protected boolean mIsBanned;

  @Bindable
  protected boolean mIsBannedParent;

  @Bindable
  protected boolean mCheckEnabled;

  @Bindable
  protected boolean mFavorite;

  @Bindable
  protected String mProtocol;

  @Bindable
  protected BitmapDrawable mCover;

  @Bindable
  protected int mBgColor;

  @Bindable
  protected boolean mIsTv;

  protected BrowserItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ThreeStatesCheckbox browserCheckbox, ConstraintLayout browserContainer, TextView dviIcon,
      AppCompatImageView itemBan, ImageView itemIcon, ImageView itemMore, TextView text,
      TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.browserCheckbox = browserCheckbox;
    this.browserContainer = browserContainer;
    this.dviIcon = dviIcon;
    this.itemBan = itemBan;
    this.itemIcon = itemIcon;
    this.itemMore = itemMore;
    this.text = text;
    this.title = title;
  }

  public abstract void setHolder(@Nullable BaseBrowserAdapter.ViewHolder holder);

  @Nullable
  public BaseBrowserAdapter.ViewHolder getHolder() {
    return mHolder;
  }

  public abstract void setItem(@Nullable MediaLibraryItem item);

  @Nullable
  public MediaLibraryItem getItem() {
    return mItem;
  }

  public abstract void setFilename(@Nullable String filename);

  @Nullable
  public String getFilename() {
    return mFilename;
  }

  public abstract void setHasContextMenu(boolean hasContextMenu);

  public boolean getHasContextMenu() {
    return mHasContextMenu;
  }

  public abstract void setIsBanned(boolean isBanned);

  public boolean getIsBanned() {
    return mIsBanned;
  }

  public abstract void setIsBannedParent(boolean isBannedParent);

  public boolean getIsBannedParent() {
    return mIsBannedParent;
  }

  public abstract void setCheckEnabled(boolean checkEnabled);

  public boolean getCheckEnabled() {
    return mCheckEnabled;
  }

  public abstract void setFavorite(boolean favorite);

  public boolean getFavorite() {
    return mFavorite;
  }

  public abstract void setProtocol(@Nullable String protocol);

  @Nullable
  public String getProtocol() {
    return mProtocol;
  }

  public abstract void setCover(@Nullable BitmapDrawable cover);

  @Nullable
  public BitmapDrawable getCover() {
    return mCover;
  }

  public abstract void setBgColor(int bgColor);

  public int getBgColor() {
    return mBgColor;
  }

  public abstract void setIsTv(boolean isTv);

  public boolean getIsTv() {
    return mIsTv;
  }

  @NonNull
  public static BrowserItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.browser_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BrowserItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BrowserItemBinding>inflateInternal(inflater, R.layout.browser_item, root, attachToRoot, component);
  }

  @NonNull
  public static BrowserItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.browser_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BrowserItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BrowserItemBinding>inflateInternal(inflater, R.layout.browser_item, null, false, component);
  }

  public static BrowserItemBinding bind(@NonNull View view) {
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
  public static BrowserItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (BrowserItemBinding)bind(component, view, R.layout.browser_item);
  }
}
