package be.sanderdebleecker.magelhaes


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import be.sanderdebleecker.magelhaes.App.MagelhaesApp
import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Views.IGameView
import be.sanderdebleecker.magelhaes.Views.MenuFragment
import be.sanderdebleecker.magelhaes.Views.TurnFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IGameView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (main_container != null) {
            val firstFragment = MenuFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_container, firstFragment).commit()
        }
    }

    fun openTurnFragment(turn : BaseTurn) {
        intent.putExtra(TurnFragment.TURN_PARAMETER,turn)
        val fragment = TurnFragment()
        supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }
    override fun onClickStart() {
        // micmic onAdvanceTurn for the moment
        onAdvanceTurn()
    }
    override fun onAdvanceTurn() {
        val controller = (applicationContext as MagelhaesApp).gameController
        val turn = controller.onAdvanceTurn()
        if(turn==null) {
            Toast.makeText(this,"all turns played",Toast.LENGTH_SHORT).show()
            //game controller should handle nullcheck not the view
        }else{
            openTurnFragment(turn)
        }
    }
}