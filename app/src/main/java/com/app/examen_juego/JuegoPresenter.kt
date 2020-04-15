package com.app.examen_juego

import android.content.Context

class JuegoPresenter(val view: IContractJuego.View, val context: Context) :
    IContractJuego.Presenter {

    var posicionesJ1: MutableList<Int> = arrayListOf()
    var posicionesJ2: MutableList<Int> = arrayListOf()
    var posicionesLibres: MutableList<Int> = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    override fun jugar(pos: Int) {

        turnoJugador1(pos)
        if (!posicionesLibres.isEmpty() && !verificar(posicionesJ1) && !verificar(posicionesJ2)) {
            val randomNumber = posicionesLibres.random()
            turnoJugador2(randomNumber)
        }

        if (verificar(posicionesJ1))
            view.showWinMessage()
        if (verificar(posicionesJ2))
            view.showLoseMessage()
        else{
            view.showTieMessage()
        }



    }

    private fun turnoJugador1(pos: Int) {
        if (pos == 1 && posLibre(1)) {
            view.pos1Selected(2)
            posicionesJ1.add(1)
            posicionesLibres.remove(1)
        }
        if (pos == 2 && posLibre(2)) {
            view.pos2Selected(2)
            posicionesJ1.add(2)
            posicionesLibres.remove(2)
        }
        if (pos == 3 && posLibre(3)) {
            view.pos3Selected(2)
            posicionesJ1.add(3)
            posicionesLibres.remove(3)
        }

        if (pos == 4 && posLibre(4)) {
            view.pos4Selected(2)
            posicionesJ1.add(4)
            posicionesLibres.remove(4)
        }
        if (pos == 5 && posLibre(7)) {
            view.pos5Selected(2)
            posicionesJ1.add(5)
            posicionesLibres.remove(5)
        }
        if (pos == 6 && posLibre(6)) {
            view.pos6Selected(2)
            posicionesJ1.add(6)
            posicionesLibres.remove(6)
        }
        if (pos == 7 && posLibre(7)) {
            view.pos7Selected(2)
            posicionesJ1.add(7)
            posicionesLibres.remove(7)
        }
        if (pos == 8 && posLibre(8)) {
            view.pos8Selected(2)
            posicionesJ1.add(8)
            posicionesLibres.remove(8)
        }
        if (pos == 9 && posLibre(9)) {
            view.pos9Selected(2)
            posicionesJ1.add(9)
            posicionesLibres.remove(9)
        }
    }

    private fun turnoJugador2(pos: Int) {
        if (pos == 1 && posLibre(1)) {
            view.pos1Selected(1)
            posicionesJ2.add(1)
            posicionesLibres.remove(1)
        }
        if (pos == 2 && posLibre(2)) {
            view.pos2Selected(1)
            posicionesJ2.add(2)
            posicionesLibres.remove(2)
        }
        if (pos == 3 && posLibre(3)) {
            view.pos3Selected(1)
            posicionesJ2.add(3)
            posicionesLibres.remove(3)
        }

        if (pos == 4 && posLibre(4)) {
            view.pos4Selected(1)
            posicionesJ2.add(4)
            posicionesLibres.remove(4)
        }
        if (pos == 5 && posLibre(7)) {
            view.pos5Selected(1)
            posicionesJ2.add(5)
            posicionesLibres.remove(5)
        }
        if (pos == 6 && posLibre(6)) {
            view.pos6Selected(1)
            posicionesJ2.add(6)
            posicionesLibres.remove(6)
        }
        if (pos == 7 && posLibre(7)) {
            view.pos7Selected(1)
            posicionesJ2.add(7)
            posicionesLibres.remove(7)
        }
        if (pos == 8 && posLibre(8)) {
            view.pos8Selected(1)
            posicionesJ2.add(8)
            posicionesLibres.remove(8)
        }
        if (pos == 9 && posLibre(9)) {
            view.pos9Selected(1)
            posicionesJ2.add(9)
            posicionesLibres.remove(9)
        }
    }

    private fun posLibre(pos: Int): Boolean {
        return posicionesLibres.contains(pos)
    }

    override fun verificar(list: MutableList<Int>): Boolean {
        var resp = false
        if(esHorizontal(list) || esVertical(list) || esDiagonal(list))
            resp=true

        return resp
    }

    override fun reiniciar() {

        posicionesJ1 = arrayListOf()
        posicionesJ2 = arrayListOf()
        posicionesLibres = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        view.restart()
    }

    private fun esHorizontal(list: MutableList<Int>): Boolean{
        var resp = false
        if((list.contains(1) && list.contains(2) && list.contains(3)) ||
            (list.contains(4) && list.contains(5) && list.contains(6))||
            (list.contains(7) && list.contains(8) && list.contains(9)) )
            resp = true
        return resp
    }
    private fun esVertical(list: MutableList<Int>): Boolean{
        var resp = false
        if((list.contains(1) && list.contains(4) && list.contains(7)) ||
            (list.contains(2) && list.contains(5) && list.contains(8))||
            (list.contains(3) && list.contains(6) && list.contains(9)) )
            resp = true
        return resp
    }
    private fun esDiagonal(list: MutableList<Int>): Boolean{
        var resp = false
        if((list.contains(1) && list.contains(5) && list.contains(9)) ||
            (list.contains(3) && list.contains(5) && list.contains(7)) )
            resp = true
        return resp
    }
}