package be.sanderdebleecker.magelhaes.Views.Adapters.Adaptations

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import be.sanderdebleecker.magelhaes.Models.CrewMember
import be.sanderdebleecker.magelhaes.R
import kotlinx.android.synthetic.main.layout_crew_state.view.*

class CrewAdaptation(context : Context) : BaseAdaptation(context) {
    override val layout = R.layout.layout_crew_state
    private val maxHealth = 6

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return CrewMemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, data: Any) {
        holder as CrewMemberViewHolder
        val crewMember = data as CrewMember
        holder.name!!.text = crewMember.name
        for(healthIndex in 1..maxHealth) {
            val v = holder.containerHealth!!.getChildAt(healthIndex-1)
            showHitpoint(v, healthIndex, crewMember)
        }
    }

    private fun showHitpoint(view: View, healthIndex : Int, crewMember : CrewMember) {
        if(crewMember.health<healthIndex) {
            if(crewMember.maxHealth>healthIndex) {
                view.background = ContextCompat.getDrawable(context, R.drawable.empty_hitpoint)!!
            }else{
                view.visibility = View.INVISIBLE
            }
        }else{
            view.background = ContextCompat.getDrawable(context, R.drawable.single_hitpoint)!!
        }
    }

    class CrewMemberViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: AppCompatTextView? = null
        var containerHealth: LinearLayout? = null

        init {
            name = view.txtvName
            containerHealth = view.containerHealth
        }
    }

}

