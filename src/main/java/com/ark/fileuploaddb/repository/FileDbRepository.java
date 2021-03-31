package com.ark.fileuploaddb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ark.fileuploaddb.model.FileDb;

@Repository
public interface FileDbRepository extends JpaRepository<FileDb, String>{

}
