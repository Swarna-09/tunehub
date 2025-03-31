package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Playlist;

import jakarta.transaction.Transactional;

public interface PlaylistService {

	public Playlist addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();


}