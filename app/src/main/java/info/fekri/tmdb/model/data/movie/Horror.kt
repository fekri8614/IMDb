package info.fekri.tmdb.model.data.movie


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class HorrorResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val horrors: List<Horror>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)

@Entity("horror_table")
data class Horror(

    @PrimaryKey
    @SerializedName("id")
    val id: Int,

    @SerializedName("backdrop_path")
    val backdropPath: String,
    @SerializedName("original_language")
    val originalLanguage: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("video")
    val video: Boolean,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("vote_count")
    val voteCount: Int
)
