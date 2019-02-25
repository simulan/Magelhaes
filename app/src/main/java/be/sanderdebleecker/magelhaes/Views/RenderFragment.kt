package be.sanderdebleecker.magelhaes.Views

import android.opengl.GLSurfaceView
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.sanderdebleecker.magelhaes.R
import be.sanderdebleecker.magelhaes.Views.Base.MyGLSurfaceView

class RenderFragment : Fragment() {
    private lateinit var mGLView: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = MyGLSurfaceView(context!!)
        this.activity!!.setContentView(view)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_render, container, false)
    }

    override fun onPause() {
        super.onPause()
        mGLView.onPause()
    }

    override fun onResume() {
        super.onResume()
        mGLView.onResume()
    }
}
