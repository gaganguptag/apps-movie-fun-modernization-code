package org.superbiz.moviefun.moviesapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.superbiz.moviefun.moviesapi.moviesapi.MovieFixtures;
import org.superbiz.moviefun.moviesapi.moviesapi.MoviesClient;
import org.superbiz.moviefun.moviesapi.moviesapi.MoviesInfo;
import org.superbiz.moviefun.moviesapi.albumsaapi.AlbumFixture;
import org.superbiz.moviefun.moviesapi.albumsaapi.AlbumsClient;
import org.superbiz.moviefun.moviesapi.albumsaapi.AlbumsInfo;

import java.util.Map;

@Controller
public class HomeController {

    private final MoviesClient moviesBean;
    private final AlbumsClient albumsBean;
    private final MovieFixtures movieFixtures;
    private final AlbumFixture albumFixtures;

    public HomeController(MoviesClient moviesRepository, AlbumsClient albumsBean, MovieFixtures movieFixtures, AlbumFixture albumFixtures) {
        this.moviesBean = moviesRepository;
        this.albumsBean = albumsBean;
        this.movieFixtures = movieFixtures;
        this.albumFixtures = albumFixtures;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/setup")
    public String setup(Map<String, Object> model) {
        for (MoviesInfo movie : movieFixtures.load()) {
            moviesBean.addMovie(movie);
        }

        for (AlbumsInfo album : albumFixtures.load()) {
            albumsBean.addAlbum(album);
        }

        model.put("movies", moviesBean.getMovies());
        model.put("albums", albumsBean.getAlbums());

        return "setup";
    }
}
