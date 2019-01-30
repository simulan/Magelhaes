package be.sanderdebleecker.magelhaes.Views

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.R
import be.sanderdebleecker.magelhaes.Views.Adapters.GameStateAdapter
import kotlinx.android.synthetic.main.fragment_state.*


class StateFragment : Fragment() {
    private var listener: IGameView? = null
    private lateinit var recycler: RecyclerView
    private lateinit var gameState: GameState

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_state, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val i = activity!!.intent
            gameState = i.getSerializableExtra(StateFragment.STATE_PARAMETER) as GameState
            showState(gameState)
        }
    }

    private fun showState(gameState: GameState) {
        recycler = recyclerCrewMembers as RecyclerView
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = GameStateAdapter(gameState.crew, context!!) //todo add captain
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IGameView) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement listener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    companion object {
        const val STATE_PARAMETER = "STATE_PARAMETER"
    }
}
