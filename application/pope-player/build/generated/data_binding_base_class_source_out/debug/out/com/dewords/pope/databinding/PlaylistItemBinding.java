// Generated by data binding compiler. Do not edit!
package com.dewords.pope.databinding;

import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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
import com.dewords.pope.gui.audio.PlaylistAdapter;
import com.dewords.pope.gui.view.MiniVisualizer;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Object;
import org.videolan.medialibrary.interfaces.media.MediaWrapper;

public abstract class PlaylistItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView audioItemSubtitle;

  @NonNull
  public final TextView audioItemTitle;

  @NonNull
  public final ImageView coverImage;

  @NonNull
  public final ConstraintLayout itemContainer;

  @NonNull
  public final AppCompatImageView itemDelete;

  @NonNull
  public final ImageButton itemMore;

  @NonNull
  public final AppCompatImageView itemMoveDown;

  @NonNull
  public final AppCompatImageView itemMoveUp;

  @NonNull
  public final MiniVisualizer playing;

  @NonNull
  public final View selector;

  @NonNull
  public final View tipsOverlay;

  @Bindable
  protected PlaylistAdapter.ViewHolder mHolder;

  @Bindable
  protected BitmapDrawable mCover;

  @Bindable
  protected MediaWrapper mMedia;

  @Bindable
  protected String mSubTitle;

  @Bindable
  protected ImageView.ScaleType mScaleType;

  @Bindable
  protected Boolean mMasked;

  protected PlaylistItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView audioItemSubtitle, TextView audioItemTitle, ImageView coverImage,
      ConstraintLayout itemContainer, AppCompatImageView itemDelete, ImageButton itemMore,
      AppCompatImageView itemMoveDown, AppCompatImageView itemMoveUp, MiniVisualizer playing,
      View selector, View tipsOverlay) {
    super(_bindingComponent, _root, _localFieldCount);
    this.audioItemSubtitle = audioItemSubtitle;
    this.audioItemTitle = audioItemTitle;
    this.coverImage = coverImage;
    this.itemContainer = itemContainer;
    this.itemDelete = itemDelete;
    this.itemMore = itemMore;
    this.itemMoveDown = itemMoveDown;
    this.itemMoveUp = itemMoveUp;
    this.playing = playing;
    this.selector = selector;
    this.tipsOverlay = tipsOverlay;
  }

  public abstract void setHolder(@Nullable PlaylistAdapter.ViewHolder holder);

  @Nullable
  public PlaylistAdapter.ViewHolder getHolder() {
    return mHolder;
  }

  public abstract void setCover(@Nullable BitmapDrawable cover);

  @Nullable
  public BitmapDrawable getCover() {
    return mCover;
  }

  public abstract void setMedia(@Nullable MediaWrapper media);

  @Nullable
  public MediaWrapper getMedia() {
    return mMedia;
  }

  public abstract void setSubTitle(@Nullable String subTitle);

  @Nullable
  public String getSubTitle() {
    return mSubTitle;
  }

  public abstract void setScaleType(@Nullable ImageView.ScaleType scaleType);

  @Nullable
  public ImageView.ScaleType getScaleType() {
    return mScaleType;
  }

  public abstract void setMasked(@Nullable Boolean masked);

  @Nullable
  public Boolean getMasked() {
    return mMasked;
  }

  @NonNull
  public static PlaylistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.playlist_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PlaylistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PlaylistItemBinding>inflateInternal(inflater, R.layout.playlist_item, root, attachToRoot, component);
  }

  @NonNull
  public static PlaylistItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.playlist_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PlaylistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PlaylistItemBinding>inflateInternal(inflater, R.layout.playlist_item, null, false, component);
  }

  public static PlaylistItemBinding bind(@NonNull View view) {
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
  public static PlaylistItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (PlaylistItemBinding)bind(component, view, R.layout.playlist_item);
  }
}
