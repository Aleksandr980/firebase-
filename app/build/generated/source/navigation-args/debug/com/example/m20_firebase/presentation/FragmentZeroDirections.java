package com.example.m20_firebase.presentation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.m20_firebase.R;

public class FragmentZeroDirections {
  private FragmentZeroDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentZeroToFragmentFirst() {
    return new ActionOnlyNavDirections(R.id.action_fragmentZero_to_fragmentFirst);
  }

  @NonNull
  public static NavDirections actionFragmentZeroToFragmentMaps() {
    return new ActionOnlyNavDirections(R.id.action_fragmentZero_to_fragmentMaps);
  }
}
