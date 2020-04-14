package com.app.examen_juego

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

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
        if(numeroJugador == 1){
            btn_pos00.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos00.setBackgroundColor(resources.getColor(R.color.j2))
        }


    }

    override fun pos2Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos01.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos01.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos3Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos02.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos02.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos4Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos10.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos10.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos5Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos11.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos11.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos6Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos12.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos12.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos7Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos20.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos20.setBackgroundColor(resources.getColor(R.color.j2))
        }
         }

    override fun pos8Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos21.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos21.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos9Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos22.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos22.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }
}