// Generated by data binding compiler. Do not edit!
package com.dewords.pope.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dewords.pope.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogDisplaySettingsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView displayInListImage;

  @NonNull
  public final TextView displayInListText;

  @NonNull
  public final View displayModeGroup;

  @NonNull
  public final CheckBox onlyFavsCheckbox;

  @NonNull
  public final View onlyFavsGroup;

  @NonNull
  public final TextView onlyFavsText;

  @NonNull
  public final CheckBox showAllArtistCheckbox;

  @NonNull
  public final View showAllArtistGroup;

  @NonNull
  public final TextView showAllArtistText;

  @NonNull
  public final LinearLayout sortsContainer;

  @NonNull
  public final TextView sortsTitle;

  @NonNull
  public final TextView title;

  @NonNull
  public final Spinner videoGroupSpinner;

  @NonNull
  public final TextView videoGroupText;

  @NonNull
  public final View videoGroupsGroup;

  protected DialogDisplaySettingsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView displayInListImage, TextView displayInListText, View displayModeGroup,
      CheckBox onlyFavsCheckbox, View onlyFavsGroup, TextView onlyFavsText,
      CheckBox showAllArtistCheckbox, View showAllArtistGroup, TextView showAllArtistText,
      LinearLayout sortsContainer, TextView sortsTitle, TextView title, Spinner videoGroupSpinner,
      TextView videoGroupText, View videoGroupsGroup) {
    super(_bindingComponent, _root, _localFieldCount);
    this.displayInListImage = displayInListImage;
    this.displayInListText = displayInListText;
    this.displayModeGroup = displayModeGroup;
    this.onlyFavsCheckbox = onlyFavsCheckbox;
    this.onlyFavsGroup = onlyFavsGroup;
    this.onlyFavsText = onlyFavsText;
    this.showAllArtistCheckbox = showAllArtistCheckbox;
    this.showAllArtistGroup = showAllArtistGroup;
    this.showAllArtistText = showAllArtistText;
    this.sortsContainer = sortsContainer;
    this.sortsTitle = sortsTitle;
    this.title = title;
    this.videoGroupSpinner = videoGroupSpinner;
    this.videoGroupText = videoGroupText;
    this.videoGroupsGroup = videoGroupsGroup;
  }

  @NonNull
  public static DialogDisplaySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_display_settings, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogDisplaySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogDisplaySettingsBinding>inflateInternal(inflater, R.layout.dialog_display_settings, root, attachToRoot, component);
  }

  @NonNull
  public static DialogDisplaySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_display_settings, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogDisplaySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogDisplaySettingsBinding>inflateInternal(inflater, R.layout.dialog_display_settings, null, false, component);
  }

  public static DialogDisplaySettingsBinding bind(@NonNull View view) {
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
  public static DialogDisplaySettingsBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogDisplaySettingsBinding)bind(component, view, R.layout.dialog_display_settings);
  }
}
