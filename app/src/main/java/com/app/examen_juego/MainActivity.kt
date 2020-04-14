package com.app.examen_juego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),IContractJuego.View {

    lateinit var loginPresenter: IContractJuego.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showWinMessage() {

    }

    override fun showLoseMessage() {
    }

    override fun pos1Selected(numeroJugador: Int) {
        var color = ""
        if(numeroJugador == 1){
            color = "red"
        }else {
            color = "green"
        }
        btn_pos1.setBackgroundColor(color)

    }

    override fun pos2Selected(numeroJugador: Int) {
        var color = ""
        if(numeroJugador == 1){
            color = "red"
        }else {
            color = "green"
        }
        btn_pos2.setBackgroundColor(color)
    }

    override fun pos3Selected(numeroJugador: Int) {
        var color = ""
        if(numeroJugador == 1){
            color = "red"
        }else {
            color = "green"
        }
        btn_pos3.setBackgroundColor(color)    }

    override fun pos4Selected(numeroJugador: Int) {
        var color = ""
        if(numeroJugador == 1){
            color = "red"
        }else {
            color = "green"
        }
        btn_pos4.setBackgroundColor(color)    }

    override fun pos5Selected(numeroJugador: Int) {
        var color = ""
        if(numeroJugador == 1){
            color = "red"
        }else {
            color = "green"
        }
        btn_pos5.setBackgroundColor(color)
    }

    override fun pos6Selected(numeroJugador: Int) {
        var color = ""
        if(numeroJugador == 1){
            color = "red"
        }else {
            color = "green"
        }
        btn_pos6.setBackgroundColor(color)
    }

    override fun pos7Selected(numeroJugador: Int) {
        var color = ""
        if(numeroJugador == 1){
            color = "red"
        }else {
            color = "green"
        }
        btn_pos7.setBackgroundColor(color)    }

    override fun pos8Selected(numeroJugador: Int) {
        var color = ""
        if(numeroJugador == 1){
            color = "red"
        }else {
            color = "green"
        }
        btn_pos8.setBackgroundColor(color)
    }

    override fun pos9Selected(numeroJugador: Int) {
        var color = ""
        if(numeroJugador == 1){
            color = "red"
        }else {
            color = "green"
        }
        btn_pos8.setBackgroundColor(color)
    }




}