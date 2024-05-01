package com.tunehub.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.Playlist;
import com.tunehub.repository.PlaylistRepository;
import com.tunehub.service.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService {
@Autowired
PlaylistRepository pr;

@Override
public void addPlaylist(Playlist playlist) {
	pr.save(playlist);
	
}

@Override
public boolean getName(Playlist playlist) {
	  Playlist playlistName=pr.findByName(playlist.getName());
	  if(playlistName==null) {
		  return true;
	  }
	return false;
}
@Override
public List<Playlist> getPlaylist(){
	return pr.findAll();
}

}