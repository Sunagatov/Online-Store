package com.zufar.icedlatte.filestorage.converter;

import com.zufar.icedlatte.filestorage.dto.FileMetadataDto;
import com.zufar.icedlatte.filestorage.entity.FileMetadata;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileMetadataDtoConverter {

    public FileMetadataDto toDto(final FileMetadata entity) {
        return new FileMetadataDto(
                entity.getRelatedObjectId(),
                entity.getBucketName(),
                entity.getFileName()
        );
    }

    public FileMetadata toEntity(final FileMetadataDto dto) {
        FileMetadata fileMetadata = new FileMetadata();
        fileMetadata.setRelatedObjectId(dto.getRelatedObjectId());
        fileMetadata.setBucketName(dto.getBucketName());
        fileMetadata.setFileName(fileMetadata.getFileName());
        return fileMetadata;
    }

    public List<FileMetadata> toEntityList(final List<FileMetadataDto> dtoList){
        return dtoList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
