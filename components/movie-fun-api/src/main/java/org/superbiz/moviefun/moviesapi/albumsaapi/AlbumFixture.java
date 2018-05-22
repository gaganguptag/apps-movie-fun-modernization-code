package org.superbiz.moviefun.moviesapi.albumsaapi;

import org.springframework.stereotype.Component;


import java.util.List;

import static java.util.Arrays.asList;

@Component
public class AlbumFixture {

    public List<AlbumsInfo> load() {
        return asList(
                new AlbumsInfo(null,"Massive Attack", "Mezzanine", 1998, 9),
                new AlbumsInfo(null,"Radiohead", "OK Computer", 1997, 8),
                new AlbumsInfo(null,"Radiohead", "Kid A", 2000, 9)
        );
    }
}
