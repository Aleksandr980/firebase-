package com.example.m20_firebase.presentation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.m20_firebase.R;

public class FragmentMapsDirections {
  private FragmentMapsDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentMapsToFragmentZero() {
    return new ActionOnlyNavDirections(R.id.action_fragmentMaps_to_fragmentZero);
  }
}
