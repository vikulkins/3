// Generated by view binder compiler. Do not edit!
package com.example.a3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.a3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFromBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button clickHere;

  @NonNull
  public final FragmentContainerView fragmentFrom;

  @NonNull
  public final TextView welcome;

  private FragmentFromBinding(@NonNull FrameLayout rootView, @NonNull Button clickHere,
      @NonNull FragmentContainerView fragmentFrom, @NonNull TextView welcome) {
    this.rootView = rootView;
    this.clickHere = clickHere;
    this.fragmentFrom = fragmentFrom;
    this.welcome = welcome;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFromBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFromBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_from, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFromBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.click_here;
      Button clickHere = ViewBindings.findChildViewById(rootView, id);
      if (clickHere == null) {
        break missingId;
      }

      id = R.id.fragment_from;
      FragmentContainerView fragmentFrom = ViewBindings.findChildViewById(rootView, id);
      if (fragmentFrom == null) {
        break missingId;
      }

      id = R.id.welcome;
      TextView welcome = ViewBindings.findChildViewById(rootView, id);
      if (welcome == null) {
        break missingId;
      }

      return new FragmentFromBinding((FrameLayout) rootView, clickHere, fragmentFrom, welcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
