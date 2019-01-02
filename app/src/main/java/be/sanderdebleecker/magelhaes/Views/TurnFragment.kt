package be.sanderdebleecker.magelhaes.Views

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.Turn
import kotlinx.android.synthetic.main.fragment_turn.*


class TurnFragment : Fragment() {
    private var mListener: IGameView? = null
    private lateinit var turn: Turn

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val i = activity!!.intent
            val turn: BaseTurn = i.getSerializableExtra(TURN_PARAMETER) as BaseTurn
            showTurn(turn);
        }
    }

    fun showTurn(turn: Turn) {
        txtvScenario.text = turn.Scenario
        if (turn.Options.isNotEmpty()) {
            txtvOption1.text = turn.Options[0].Text;
            if (turn.Options.size > 1) {
                txtvOption2.text = turn.Options[1].Text;
                if (turn.Options.size > 2) {
                    txtvOption2.text = turn.Options[2].Text;
                }
            }
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is IGameView) {
            mListener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    companion object {
        val TURN_PARAMETER = "TURN_PARAMETER"
    }
}