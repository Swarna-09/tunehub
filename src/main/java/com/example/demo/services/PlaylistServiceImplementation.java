package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Playlist;
import com.example.demo.repositories.PlaylistRepository;

import jakarta.transaction.Transactional;

@Service
public class PlaylistServiceImplementation 
					implements PlaylistService
{
	@Autowired
	PlaylistRepository repo;
	@Override
	public Playlist addPlaylist(Playlist playlist) {
		return repo.save(playlist);
		
	}
	@Transactional
	public void deletePlaylist(Iterable<? extends Playlist> playlistId) {
	    CrudRepository<Playlist, Integer> playlistRepository = null;
		playlistRepository.deleteAll(playlistId);
	}

	@Override
	public List<Playlist> fetchAllPlaylists() {
		return repo.findAll();
	}

}