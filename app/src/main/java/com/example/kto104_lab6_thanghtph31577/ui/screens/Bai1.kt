package com.example.kto104_lab6_thanghtph31577.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.kto104_lab6_thanghtph31577.model.entities.Movie
import com.example.kto104_lab6_thanghtph31577.ui.components.MovieRow
import com.example.kto104_lab6_thanghtph31577.ui.components.MovieScreen
import com.example.kto104_lab6_thanghtph31577.utils.createTheaterSeating


@Preview
@Composable
fun Bai2(){
    MovieScreen(Movie.getSampleMovies())

}

@Composable
fun Bai1(){
    MovieRow(Movie.getSampleMovies())

}
@Composable
fun Bai3(){
    CinemaSeatBookingScreen(
        createTheaterSeating(
            totalRows = 12,
            totalSeatsPerRow = 9,
            aislePositionInRow = 4,
            aislePositionInColumn = 5
        ), totalSeatsPerRow = 9
    )
}