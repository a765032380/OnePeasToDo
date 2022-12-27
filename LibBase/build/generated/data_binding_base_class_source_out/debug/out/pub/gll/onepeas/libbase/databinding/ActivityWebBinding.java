// Generated by view binder compiler. Do not edit!
package pub.gll.onepeas.libbase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tencent.smtt.sdk.WebView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import pub.gll.onepeas.libbase.R;

public final class ActivityWebBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout flVideo;

  @NonNull
  public final Button mBTDownload;

  @NonNull
  public final Button mBTDownloadList;

  @NonNull
  public final WebView webView;

  private ActivityWebBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout flVideo,
      @NonNull Button mBTDownload, @NonNull Button mBTDownloadList, @NonNull WebView webView) {
    this.rootView = rootView;
    this.flVideo = flVideo;
    this.mBTDownload = mBTDownload;
    this.mBTDownloadList = mBTDownloadList;
    this.webView = webView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWebBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWebBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_web, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWebBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fl_video;
      FrameLayout flVideo = ViewBindings.findChildViewById(rootView, id);
      if (flVideo == null) {
        break missingId;
      }

      id = R.id.mBTDownload;
      Button mBTDownload = ViewBindings.findChildViewById(rootView, id);
      if (mBTDownload == null) {
        break missingId;
      }

      id = R.id.mBTDownloadList;
      Button mBTDownloadList = ViewBindings.findChildViewById(rootView, id);
      if (mBTDownloadList == null) {
        break missingId;
      }

      id = R.id.web_view;
      WebView webView = ViewBindings.findChildViewById(rootView, id);
      if (webView == null) {
        break missingId;
      }

      return new ActivityWebBinding((ConstraintLayout) rootView, flVideo, mBTDownload,
          mBTDownloadList, webView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
