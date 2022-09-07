package com.programacionmovil.rollerdice

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn_tirar_rollerdice : Button
    lateinit var dado1: ImageView
    lateinit var dado2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_tirar_rollerdice = findViewById(R.id.btn_tirar_rollerdice)
        dado1 = findViewById(R.id.dado1)
        dado2 = findViewById(R.id.dado2)
        btn_tirar_rollerdice.setOnClickListener(){
            Toast.makeText(applicationContext, "Tirando", Toast.LENGTH_SHORT).show()
            dado1.setImageDrawable(getRandomDiceImage())
            dado2.setImageDrawable(getRandomDiceImage())

        }
    }

    private fun getRandomDiceImage() : Drawable {
        val numero = (1..6).random()
        var dado : Drawable
        when(numero) {
            1 -> {
                dado = getDrawable(R.drawable.dice_1)!!
            }
            2 -> {
                dado = getDrawable(R.drawable.dice_2)!!
            }
            3 -> {
                dado = getDrawable(R.drawable.dice_3)!!
            }
            4 -> {
                dado = getDrawable(R.drawable.dice_4)!!
            }
            5 -> {
                dado = getDrawable(R.drawable.dice_5)!!
            }
            6 -> {
                dado = getDrawable(R.drawable.dice_6)!!
            }
            else -> {
                dado= getDrawable(R.drawable.empty_dice)!!
            }
        }
        return dado
    }

    fun aleatorio(): Int{
        return (1..6).random()
    }
}