package be.sanderdebleecker.magelhaes.Views.Adapters.Adaptations

import android.content.Context
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import be.sanderdebleecker.magelhaes.R
import kotlinx.android.synthetic.main.layout_hull_state.view.*



class HullGameStateAdaptation(label: String, context: Context) : GameStateAdaptation(label, context) {
    override val layout = R.layout.layout_hull_state

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_game_state, parent, false)
        return HullViewHolder(view)
    }

    //todo change
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, data: Any) {
        val viewHolder = holder as HullViewHolder
        val hullHealth = data as Int
        viewHolder.hull!!.layoutParams = LinearLayout.LayoutParams(LinearLayoutCompat.LayoutParams.WRAP_CONTENT, LinearLayoutCompat.LayoutParams.WRAP_CONTENT, hullHealth.toFloat())
    }

    class HullViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var container: LinearLayout? = null
        var hull: View? = null

        init {
            container = view.container
            hull = view.viewHull
        }
    }

}