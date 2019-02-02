package be.sanderdebleecker.magelhaes.Views.Adapters.Adaptations

import android.content.Context
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import be.sanderdebleecker.magelhaes.Models.Vessel
import be.sanderdebleecker.magelhaes.R
import kotlinx.android.synthetic.main.layout_vessel_state.view.*

class VesselAdaptation(context: Context) : BaseAdaptation(context) {
    override val layout = R.layout.layout_vessel_state

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return HullViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, data: Any) {
        val viewHolder = holder as HullViewHolder
        val vessel = data as Vessel

        viewHolder.txtvName!!.text = vessel.name
        val hull = viewHolder.containerHull!!.getChildAt(1)
        hull.layoutParams = LinearLayout.LayoutParams(LinearLayoutCompat.LayoutParams.WRAP_CONTENT, LinearLayoutCompat.LayoutParams.WRAP_CONTENT, vessel.health.toFloat())
    }

    class HullViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var containerHull: LinearLayout? = null
        var txtvName: TextView? = null

        init {
            containerHull = view.containerHull
            txtvName = view.txtvName
        }
    }

}