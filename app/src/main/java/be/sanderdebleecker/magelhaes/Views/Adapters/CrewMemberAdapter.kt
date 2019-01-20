package be.sanderdebleecker.magelhaes.Views.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.sanderdebleecker.magelhaes.Models.CrewMember
import be.sanderdebleecker.magelhaes.R
import kotlinx.android.synthetic.main.layout_game_state.view.*

//https://stacktips.com/tutorials/android/android-recyclerview-example

class CrewMemberAdapter(private val list : List<CrewMember>) : RecyclerView.Adapter<CrewMemberAdapter.CrewMemberViewHolder>() {

    // todo try with 'parent' instead of null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrewMemberViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.layout_game_state, null)
        return CrewMemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: CrewMemberViewHolder, position: Int) {
        val crewMember = list[position]
        holder.name = crewMember.Name
    }

    override fun getItemCount() = list.size

    class CrewMemberViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var name = ""
        init {
            name = view.txtvName.text.toString()
        }
    }
}