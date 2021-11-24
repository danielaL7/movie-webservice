package services

import models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    // MOVIES //

    //Get Popular movies
    @GET("/3/movie/popular?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getPopularMovieList(): Call<MovieResponse>

    //Get Top rated movies
    @GET("/3/movie/top_rated?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTopRatedMovieList(): Call<MovieResponse>

    //Get Now Playing movies (In Theatars)
    @GET("/3/movie/now_playing?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getMovieInTheatarsList(): Call<MovieResponse>

    //Get Upcoming movies
    @GET("/3/movie/upcoming?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getUpcomingMovieList(): Call<MovieResponse>

    // TV //

    //Get Popular TV shows
    @GET("/3/tv/popular?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getPopularTvList(): Call<MovieResponse>

    //Get Top rated TV shows
    @GET("/3/tv/top_rated?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTopRatedTvList(): Call<MovieResponse>

    //Get Latest TV shows
    @GET("/3/tv/latest?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getLatestTvList(): Call<MovieResponse>

    //Get Todays TV shows
    @GET("/3/tv/airing_today?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTvTodayList(): Call<MovieResponse>

    // TRENDING //

    //Get What is trending today - movies/tv
    @GET("/3/trending/movie/day?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTrendingTodayMovieList(): Call<MovieResponse>
    //Get What is trending today - tv
    @GET("/3/trending/tv/day?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTrendingTodayTvList(): Call<MovieResponse>

    //Get what is trending this week - movies/tv
    @GET("/3/trending/movie/week?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTrendingWeekMovieList(): Call<MovieResponse>
    //Get what is trending this week - tv
    @GET("/3/trending/tv/week?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTrendingWeekTvList(): Call<MovieResponse>

    // DETAILS //

    //DETAILS PAGE - MOVIES

    //Get details
    @GET("/3/movie/{movie_id}?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getMovieDetails(): Call<MovieResponse>
    //Get reviews
    @GET("/3/movie/{movie_id}/reviews?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getMovieReviews(): Call<MovieResponse>
    //Get cast (credits)
    @GET("/3/movie/{movie_id}/credits?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getMovieCast(): Call<MovieResponse>

    //DETAILS PAGE - TV

    //Get details
    @GET("/3/tv/{tv_id}?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTvDetails(): Call<MovieResponse>
    //Get reviews
    @GET("/3/tv/{tv_id}/reviews?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTvReviews(): Call<MovieResponse>
    //Get cast (credits)
    @GET("/3/tv/{tv_id}/credits?api_key=7a89c49e5fa71b154ce116aac8a27d70")
    fun getTvCast(): Call<MovieResponse>

}