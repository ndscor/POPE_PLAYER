package com.dewords.pope.interfaces

import androidx.recyclerview.widget.RecyclerView
import org.videolan.medialibrary.media.MediaLibraryItem

interface IListEventsHandler {
    fun onRemove(position: Int, item: MediaLibraryItem)
    fun onMove(oldPosition: Int, newPosition: Int)
    fun onStartDrag(viewHolder: RecyclerView.ViewHolder )
}