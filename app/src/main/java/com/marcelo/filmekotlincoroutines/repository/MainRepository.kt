package com.marcelo.filmekotlincoroutines.repository

import com.marcelo.filmekotlincoroutines.models.Movies
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class MainRepository {

   /* fun getMovies(callback: (movies: List<Movies>) -> Unit){
        Thread{
            Thread.sleep(3000)
            callback(
                listOf(
                    Movies(1, "Filme um"),
                    Movies(2, "Filme dois")
                )
            )
        }.start()
    }*/

    suspend fun getMoviesCoroutines(): List<Movies> {
        return withContext(Dispatchers.Default) {
            delay(3000)
            listOf(
                Movies(1, "Filme um"),
                Movies(2, "Filme dois")
            )
        }
    }
}