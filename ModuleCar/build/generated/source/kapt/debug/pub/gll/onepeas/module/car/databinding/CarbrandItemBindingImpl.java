package pub.gll.onepeas.module.car.databinding;
import pub.gll.onepeas.module.car.R;
import pub.gll.onepeas.module.car.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CarbrandItemBindingImpl extends CarbrandItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CarbrandItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private CarbrandItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mIVIcon.setTag(null);
        this.mTVTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.carBrand == variableId) {
            setCarBrand((pub.gll.onepeas.module.car.model.CarBrandItemModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCarBrand(@Nullable pub.gll.onepeas.module.car.model.CarBrandItemModel CarBrand) {
        this.mCarBrand = CarBrand;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.carBrand);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String carBrandName = null;
        java.lang.String carBrandIcon = null;
        pub.gll.onepeas.module.car.model.CarBrandItemModel carBrand = mCarBrand;

        if ((dirtyFlags & 0x3L) != 0) {



                if (carBrand != null) {
                    // read carBrand.name
                    carBrandName = carBrand.getName();
                    // read carBrand.icon
                    carBrandIcon = carBrand.getIcon();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            pub.gll.onepeas.module.car.binding.ViewBindingKt.bindingAvator(this.mIVIcon, carBrandIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mTVTitle, carBrandName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): carBrand
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}