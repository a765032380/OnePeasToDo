// Generated by data binding compiler. Do not edit!
package pub.gll.onepeas.module.car.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import pub.gll.onepeas.module.car.R;
import pub.gll.onepeas.module.car.model.CarBrandItemModel;

public abstract class CarbrandItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView mIVIcon;

  @NonNull
  public final TextView mTVTitle;

  @Bindable
  protected CarBrandItemModel mCarBrand;

  protected CarbrandItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView mIVIcon, TextView mTVTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mIVIcon = mIVIcon;
    this.mTVTitle = mTVTitle;
  }

  public abstract void setCarBrand(@Nullable CarBrandItemModel carBrand);

  @Nullable
  public CarBrandItemModel getCarBrand() {
    return mCarBrand;
  }

  @NonNull
  public static CarbrandItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.carbrand_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CarbrandItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CarbrandItemBinding>inflateInternal(inflater, R.layout.carbrand_item, root, attachToRoot, component);
  }

  @NonNull
  public static CarbrandItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.carbrand_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CarbrandItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CarbrandItemBinding>inflateInternal(inflater, R.layout.carbrand_item, null, false, component);
  }

  public static CarbrandItemBinding bind(@NonNull View view) {
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
  public static CarbrandItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (CarbrandItemBinding)bind(component, view, R.layout.carbrand_item);
  }
}
