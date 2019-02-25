package be.sanderdebleecker.magelhaes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import be.sanderdebleecker.magelhaes.Views.Base.MyGLSurfaceView

class RenderActivity : AppCompatActivity() {
    private lateinit var mGLView: MyGLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mGLView = MyGLSurfaceView(this)
        setContentView(mGLView)
    }
}
