/*
 * ***************************************************************************
 * DialogActivity.java
 * ***************************************************************************
 * Copyright © 2016 VLC authors and VideoLAN
 * Author: Geoffrey Métais
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston MA 02110-1301, USA.
 * ***************************************************************************
 */

package com.dewords.pope.gui

import android.os.Bundle
import android.view.View
import org.videolan.libvlc.Dialog
import org.videolan.medialibrary.interfaces.media.MediaWrapper
import org.videolan.resources.util.parcelable
import org.videolan.resources.util.parcelableList
import com.dewords.pope.R
import com.dewords.pope.gui.dialogs.DeviceDialog
import com.dewords.pope.gui.dialogs.NetworkServerDialog
import com.dewords.pope.media.MediaUtils
import com.dewords.pope.util.showVlcDialog

class DialogActivity : BaseActivity() {
    override fun getSnackAnchorView(overAudioPlayer:Boolean): View? = findViewById<View>(android.R.id.content)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transparent)
        val key = intent.action
        if (key.isNullOrEmpty()) {
            finish()
            return
        }
        when (key) {
            KEY_SERVER -> setupServerDialog()
            KEY_SUBS_DL -> setupSubsDialog()
            KEY_DEVICE -> setupDeviceDialog()
            KEY_DIALOG -> {
                dialog?.run {
                    showVlcDialog(this)
                    dialog = null
                } ?: finish()
            }
            else -> finish()
        }
    }

    private fun setupDeviceDialog() {
        window.decorView.alpha = 0f
        val dialog = DeviceDialog()
        val intent = intent
        dialog.setDevice(intent.getStringExtra(EXTRA_PATH)!!, intent.getStringExtra(EXTRA_UUID)!!, intent.getBooleanExtra(EXTRA_SCAN, false))
        dialog.show(supportFragmentManager, "device_dialog")
    }


    private fun setupServerDialog() {
        val networkServerDialog = NetworkServerDialog()
        intent.parcelable<MediaWrapper>(EXTRA_MEDIA)?.let {
            networkServerDialog.setServer(it)
        }
        networkServerDialog.show(supportFragmentManager, "fragment_edit_network")
    }

    private fun setupSubsDialog() {
        val medialist = intent.parcelableList<MediaWrapper>(EXTRA_MEDIALIST)
        if (medialist != null)
            MediaUtils.getSubs(this, medialist)
        else
            finish()
    }

    companion object {

        var dialog : Dialog? = null
        const val KEY_SERVER = "serverDialog"
        const val KEY_SUBS_DL = "subsdlDialog"
        const val KEY_DEVICE = "deviceDialog"
        const val KEY_DIALOG = "vlcDialog"

        const val EXTRA_MEDIALIST = "extra_media_list"
        const val EXTRA_MEDIA = "extra_media"
        const val EXTRA_PATH = "extra_path"
        const val EXTRA_UUID = "extra_uuid"
        const val EXTRA_SCAN = "extra_scan"
    }
}
