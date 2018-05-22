package org.superbiz.moviefun.moviesapi.albumsaapi;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

import java.util.List;


public class AlbumsClient {

    private String albumsUrl;
    private RestOperations restOperations;

    public AlbumsClient(String albumsUrl, RestOperations restOperations) {
        this.albumsUrl = albumsUrl;
        this.restOperations = restOperations;
    }

    public void addAlbum(AlbumsInfo album) {
        restOperations.postForEntity(albumsUrl, album, AlbumsInfo.class);
    }

    public AlbumsInfo find(long id) {
        return restOperations.getForEntity(albumsUrl + "/" + id, AlbumsInfo.class).getBody();
    }

    public List<AlbumsInfo> getAlbums() {
        ParameterizedTypeReference<List<AlbumsInfo>> albumListType = new ParameterizedTypeReference<List<AlbumsInfo>>() {
        };

        return restOperations.exchange(albumsUrl, HttpMethod.GET, null, albumListType).getBody();
    }
}
