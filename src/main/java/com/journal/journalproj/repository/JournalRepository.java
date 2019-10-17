package com.journal.journalproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.journal.journalproj.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> {
}