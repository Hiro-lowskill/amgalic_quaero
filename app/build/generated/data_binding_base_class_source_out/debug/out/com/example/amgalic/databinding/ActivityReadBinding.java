// Generated by view binder compiler. Do not edit!
package com.example.amgalic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.amgalic.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityReadBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton imageButton16;

  @NonNull
  public final ImageButton imageButton17;

  @NonNull
  public final ListView listView;

  private ActivityReadBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton imageButton16, @NonNull ImageButton imageButton17,
      @NonNull ListView listView) {
    this.rootView = rootView;
    this.imageButton16 = imageButton16;
    this.imageButton17 = imageButton17;
    this.listView = listView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityReadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityReadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_read, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityReadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageButton16;
      ImageButton imageButton16 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton16 == null) {
        break missingId;
      }

      id = R.id.imageButton17;
      ImageButton imageButton17 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton17 == null) {
        break missingId;
      }

      id = R.id.listView;
      ListView listView = ViewBindings.findChildViewById(rootView, id);
      if (listView == null) {
        break missingId;
      }

      return new ActivityReadBinding((ConstraintLayout) rootView, imageButton16, imageButton17,
          listView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
