package net.itinajero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinajero.api.entity.Album;
import net.itinajero.repository.AlbumsRepository;

@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;
	
	@Override
	public List<Album> buscarTodos() {
		// TODO Auto-generated method stub
		return repoAlbums.findAll();
	}

}
