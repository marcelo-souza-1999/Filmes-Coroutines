package com.marcelo.filmekotlincoroutines.repository

import com.marcelo.filmekotlincoroutines.models.Movies

class MainRepository {

    fun getMovies(callback: (movies: List<Movies>) -> Unit){
        Thread{
            Thread.sleep(3000)
            callback(
                listOf(
                    Movies(1, "Filme um"),
                    Movies(2, "Filme dois")
                )
            )
        }.start()
    }
}