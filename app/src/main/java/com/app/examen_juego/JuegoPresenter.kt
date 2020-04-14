package com.app.examen_juego

import android.content.Context

class JuegoPresenter(val view: IContractJuego.View, val context: Context) :
    IContractJuego.Presenter {

    lateinit var posiciones: MutableList<Int>
    var posicionesLibres:MutableList<Int> = arrayListOf(1,2,3,4,5,6,7,8,9)
    override fun jugar(pos: Int) {
        turnoJugador1(pos)
        val randomNumber = posicionesLibres.random()
        turnoJugador2(randomNumber)
    }

    private fun turnoJugador2(pos: Int){
        if (pos == 1 && posLibre(1)) {
            view.pos1Selected(2)
            posiciones.add(1)
            posicionesLibres.remove(1)
        }
        if (pos == 2 && posLibre(2)) {
            view.pos2Selected(2)
            posiciones.add(2)
            posicionesLibres.remove(2)
        }
        if (pos == 3 && posLibre(3)) {
            view.pos3Selected(2)
            posiciones.add(3)
            posicionesLibres.remove(3)
        }

        if (pos == 4 && posLibre(4)) {
            view.pos4Selected(2)
            posiciones.add(4)
            posicionesLibres.remove(4)
        }
        if (pos == 5 && posLibre(7)) {
            view.pos5Selected(2)
            posiciones.add(5)
            posicionesLibres.remove(5)
        }
        if (pos == 6 && posLibre(6)) {
            view.pos6Selected(2)
            posiciones.add(6)
            posicionesLibres.remove(6)
        }
        if (pos == 7 && posLibre(7)) {
            view.pos7Selected(2)
            posiciones.add(7)
            posicionesLibres.remove(7)
        }
        if (pos == 8 && posLibre(8)) {
            view.pos8Selected(2)
            posiciones.add(8)
            posicionesLibres.remove(8)
        }
        if (pos == 9 && posLibre(9)) {
            view.pos9Selected(2)
            posiciones.add(9)
            posicionesLibres.remove(9)
        }
    }

    private fun turnoJugador1(pos: Int){
        if (pos == 1 && posLibre(1)) {
            view.pos1Selected(1)
            posiciones.add(1)
            posicionesLibres.remove(1)
        }
        if (pos == 2 && posLibre(2)) {
            view.pos2Selected(1)
            posiciones.add(2)
            posicionesLibres.remove(2)
        }
        if (pos == 3 && posLibre(3)) {
            view.pos3Selected(1)
            posiciones.add(3)
            posicionesLibres.remove(3)
        }

        if (pos == 4 && posLibre(4)) {
            view.pos4Selected(1)
            posiciones.add(4)
            posicionesLibres.remove(4)
        }
        if (pos == 5 && posLibre(7)) {
            view.pos5Selected(1)
            posiciones.add(5)
            posicionesLibres.remove(5)
        }
        if (pos == 6 && posLibre(6)) {
            view.pos6Selected(1)
            posiciones.add(6)
            posicionesLibres.remove(6)
        }
        if (pos == 7 && posLibre(7)) {
            view.pos7Selected(1)
            posiciones.add(7)
            posicionesLibres.remove(7)
        }
        if (pos == 8 && posLibre(8)) {
            view.pos8Selected(1)
            posiciones.add(8)
            posicionesLibres.remove(8)
        }
        if (pos == 9 && posLibre(9)) {
            view.pos9Selected(1)
            posiciones.add(9)
            posicionesLibres.remove(9)
        }
    }

    private fun posLibre(pos: Int): Boolean {
        return posicionesLibres.contains(pos)
    }

    override fun verificar(): Boolean {
        TODO("Not yet implemented")
    }

    override fun reiniciar() {
        TODO("Not yet implemented")
    }
}