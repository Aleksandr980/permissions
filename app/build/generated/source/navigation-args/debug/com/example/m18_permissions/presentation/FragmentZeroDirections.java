package com.example.m18_permissions.presentation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.m18_permissions.R;

public class FragmentZeroDirections {
  private FragmentZeroDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentZeroToFragmentFirst() {
    return new ActionOnlyNavDirections(R.id.action_fragmentZero_to_fragmentFirst);
  }
}
