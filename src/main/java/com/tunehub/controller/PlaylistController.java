package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub.entity.Playlist;
import com.tunehub.entity.Song;
import com.tunehub.service.PlaylistService;
import com.tunehub.service.SongService;

@Controller
public class PlaylistController {
    @Autowired
	PlaylistService playlistService;
    @Autowired
    SongService songService;
    @GetMapping(value="/createplaylists")
    public String createPlaylist(Model model) {
    	System.out.println("create playlist");
    	List<Song> songList=songService.getSongs();
    	model.addAttribute("songs", songList);
    	return "createplaylist";
    }
    @PostMapping(value="/addplaylist")
    public String addPlaylist( Playlist playlist) {
       	  
    boolean playlistName=	playlistService.getName(playlist);
    if(playlistName) {
    	playlistService.addPlaylist(playlist);
    	List<Song> songs=playlist.getSongs();
    	for(Song song:songs) {
    		song.getPlaylists().add(playlist);
    		songService.updateSong(song);
    	}
    }
    else {
    	System.out.println("duplicate playlist name");
    }
      return "adminhome"; 	
    	
    }
    @GetMapping(value="/viewplaylist")
    public String viewPlaylist(Model model) {
    	List<Playlist>playlists=playlistService.getPlaylist();
    	model.addAttribute("playlists", playlists);
    	return "viewplaylist";
    	
    }
}