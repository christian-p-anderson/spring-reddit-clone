package com.reddit.springredditclone.repository;

import com.reddit.springredditclone.model.Post;
import com.reddit.springredditclone.model.User;
import com.reddit.springredditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
