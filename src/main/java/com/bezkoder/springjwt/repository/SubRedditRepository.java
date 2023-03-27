package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.SubReddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubRedditRepository extends JpaRepository<SubReddit, Long> {

}
