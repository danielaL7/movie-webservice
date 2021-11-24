package models

import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieResponse (
    @SerializedName("results")
    val movies : List<Movie>
)