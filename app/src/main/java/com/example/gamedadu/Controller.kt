package com.example.gamedadu

import java.io.StreamCorruptedException

class Controller {
    fun generateDadu(): Int {
        var Dadu = (1..6).random()
        var Score = 0
        if (Dadu % 2 == 0 ) {
            Score += -3
        } else {
            Score -= 5
        }
        return Score
    }

    fun hasilScore() {
        var ronde = 0
        var totalScore = 0
        while (ronde < 6) {
            totalScore += generateDadu()
            ronde ++
        }
    }
}