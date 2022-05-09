package com.webservice.board.service.posts;

import com.webservice.board.domain.posts.Posts;
import com.webservice.board.domain.posts.PostsRepository;
import com.webservice.board.web.dto.PostsResponseDto;
import com.webservice.board.web.dto.PostsSaveRequestDto;
import com.webservice.board.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No post with id " + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No post with id " + id));

        return new PostsResponseDto(entity);
    }
}
