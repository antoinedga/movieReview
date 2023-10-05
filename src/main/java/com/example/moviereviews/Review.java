package com.example.moviereviews;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    public Review(String reviewBody) {
        this.reviewBody = reviewBody;
    }

    private ObjectId id;
    private String reviewBody;
}
