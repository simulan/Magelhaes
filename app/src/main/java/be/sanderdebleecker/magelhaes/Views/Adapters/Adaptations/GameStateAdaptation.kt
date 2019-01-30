package be.sanderdebleecker.magelhaes.Views.Adapters.Adaptations

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

abstract class GameStateAdaptation(public val label: String,private val context: Context) {
    // some method to be used in the recyclerview, e.g. passing the view to this method to draw
    // some helper method/property to get the related resource / layout
    protected abstract val layout : Int

    abstract fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : RecyclerView.ViewHolder
    abstract fun onBindViewHolder(holder: RecyclerView.ViewHolder, data: Any)
}