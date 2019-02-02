package be.sanderdebleecker.magelhaes.Views.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import be.sanderdebleecker.magelhaes.Models.CrewMember
import be.sanderdebleecker.magelhaes.Models.Vessel
import be.sanderdebleecker.magelhaes.Views.Adapters.Adaptations.CrewAdaptation
import be.sanderdebleecker.magelhaes.Views.Adapters.Adaptations.VesselAdaptation

class GameStateAdapter(private val list: List<Any>, context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val crewAdaptation = CrewAdaptation(context)
    private val hullAdaptation = VesselAdaptation(context)

    enum class ViewType(val intValue: Int) {
        CREW_MEMBER(0),
        HULL_DETAIL(1)
    }

    override fun getItemViewType(position: Int) = when (list[position]) {
        is CrewMember -> ViewType.CREW_MEMBER.intValue
        is Vessel -> ViewType.HULL_DETAIL.intValue
        else -> super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewType) {
        ViewType.CREW_MEMBER.intValue -> crewAdaptation.onCreateViewHolder(parent)
        ViewType.HULL_DETAIL.intValue -> hullAdaptation.onCreateViewHolder(parent)
        else -> throw Exception("Should implement the viewType ($viewType)")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewType = getItemViewType(position)
        when (viewType) {
            ViewType.CREW_MEMBER.intValue -> crewAdaptation.onBindViewHolder(holder, list[position])
            ViewType.HULL_DETAIL.intValue -> hullAdaptation.onBindViewHolder(holder, list[position])
        }
    }

    override fun getItemCount() = list.size
}