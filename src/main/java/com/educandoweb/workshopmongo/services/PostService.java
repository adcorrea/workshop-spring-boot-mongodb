package com.educandoweb.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshopmongo.domain.Post;
import com.educandoweb.workshopmongo.repository.PostRepository;
import com.educandoweb.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository PostRepository;
	

	
	public Post findById(String id) {
		Optional<Post> obj = PostRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	
	
	
	
}