import models.Movie
import models.MovieResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import services.MovieApiInterface
import services.MovieApiService

fun main (){
    getMovieData { movies : List<Movie> ->
        for (movie: Movie in movies){
            println(movie.title);
        }
    }
}

private fun getMovieData(callback: (List<Movie>) -> Unit){
    val apiService = MovieApiService.getInstance().create(MovieApiInterface::class.java)
    apiService.getPopularMovieList().enqueue(object : Callback<MovieResponse> {
        override fun onFailure(call: Call<MovieResponse>, t: Throwable) {

        }

        override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
            return callback(response.body()!!.movies)
        }

    })
}