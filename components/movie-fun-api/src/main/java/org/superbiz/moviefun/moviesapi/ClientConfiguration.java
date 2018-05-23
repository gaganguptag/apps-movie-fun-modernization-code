package org.superbiz.moviefun.moviesapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.superbiz.moviefun.moviesapi.albumsaapi.AlbumsClient;
import org.superbiz.moviefun.moviesapi.moviesapi.MoviesClient;

@Configuration
public class ClientConfiguration {

    @Value("${movies.url}") String moviesUrl;
    @Value("${albums.url}") String albumsUrl;

    @Bean
    public MoviesClient moviesClient(RestOperations restOperations) {
        return new MoviesClient("//movie-service/movies", restOperations);
    }

    @Bean
    public AlbumsClient albumsClient(RestOperations restOperations) {
        return new AlbumsClient("//album-service/albums", restOperations);
    }

}

