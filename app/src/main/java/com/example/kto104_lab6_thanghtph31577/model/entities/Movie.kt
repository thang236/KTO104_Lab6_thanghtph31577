package com.example.kto104_lab6_thanghtph31577.model.entities

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration: Double,
    val releaseDate: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie("Inception", "2010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"20/5/2024"),
            Movie("Inception", "2010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"Phim hay"),
            Movie("Inception", "2010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"20/5/2024"),
            Movie("Inception", "2010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"20/5/2024"),
            Movie("Inception", "2010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"20/5/2024"),
            Movie("Inception", "2010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"20/5/2024"),
            Movie("Inception", "2010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"20/5/2024"),
            Movie("Inception", "2010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"20/5/2024"),
            Movie("Inception", "2010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"20/5/2024"),


        )
    }
}
