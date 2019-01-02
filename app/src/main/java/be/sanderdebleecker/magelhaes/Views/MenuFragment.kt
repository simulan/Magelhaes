package be.sanderdebleecker.magelhaes.Views

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import be.sanderdebleecker.magelhaes.R

class MenuFragment : Fragment() {

    private var mListener: IGameView? = null
    private var btnStart: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            //if you have parameters
        }
    }

    private fun bindEvents() {
        btnStart!!.setOnClickListener { onButtonPressed() }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_menu, container, false)
        btnStart = v.findViewById(R.id.btn_Start) as Button
        bindEvents()
        return v
    }

    fun onButtonPressed() {
        if (mListener != null) {
            mListener!!.onClickStart()
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


}// Required empty public constructor
