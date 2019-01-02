package be.sanderdebleecker.magelhaes.App

import android.app.Application
import be.sanderdebleecker.magelhaes.Controllers.GameController

class MagelhaesApp : Application() {
    val gameController: GameController = GameController()
}