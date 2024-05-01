package com.tunehub.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.Song;
import com.tunehub.repository.SongRepository;
import com.tunehub.service.SongService;
@Service
public class SongServiceImpl implements SongService {
    @Autowired
	SongRepository sr;
    
	@Override
	public void addSong(Song song) {
		
		sr.save(song);
	}

	@Override
	public boolean getSongName(Song song) {
		Song s=sr.findByName(song.getName());
		if(s==null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Song> getSongs() {
		
		return sr.findAll();
	}

	@Override
	public void updateSong(Song song) {
		sr.save(song);
	
	}

}