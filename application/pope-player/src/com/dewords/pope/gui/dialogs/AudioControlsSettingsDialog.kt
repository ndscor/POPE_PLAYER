package com.dewords.pope.gui.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_EXPANDED
import com.dewords.pope.R
import com.dewords.pope.databinding.DialogAudioControlsSettingsBinding

class AudioControlsSettingsDialog : VLCBottomSheetDialogFragment() {

    override fun getDefaultState(): Int = STATE_EXPANDED

    override fun needToManageOrientation(): Boolean = true

    private lateinit var binding: DialogAudioControlsSettingsBinding


    override fun initialFocusedView() = binding.fragmentContainerView.findViewById<View>(R.id.recycler_view) ?: binding.container

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DialogAudioControlsSettingsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}
