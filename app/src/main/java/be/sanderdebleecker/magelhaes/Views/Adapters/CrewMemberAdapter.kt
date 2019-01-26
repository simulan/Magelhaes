package be.sanderdebleecker.magelhaes.Views.Adapters

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
import kotlinx.android.synthetic.main.layout_game_state.view.*

class CrewMemberAdapter(private val list: List<CrewMember>, private val context: Context) : RecyclerView.Adapter<CrewMemberAdapter.CrewMemberViewHolder>() {
    private val maxHealth = 6


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrewMemberViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_game_state, parent, false)
        return CrewMemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: CrewMemberViewHolder, position: Int) {
        val crewMember = list[position]
        holder.name!!.text = crewMember.name
        for(healthIndex in 1..maxHealth) {
            val v = holder.containerHealth!!.getChildAt(healthIndex-1)
            showHitpoint(v, healthIndex, crewMember)
        }
    }

    private fun showHitpoint(view: View, healthIndex : Int,crewMember : CrewMember) {
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

    override fun getItemCount() = list.size

    class CrewMemberViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: AppCompatTextView? = null
        var containerHealth: LinearLayout? = null

        init {
            name = view.txtvName
            containerHealth = view.containerHealth
        }
    }
}