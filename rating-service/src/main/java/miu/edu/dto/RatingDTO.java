package miu.edu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingDTO {

    private Long motionPictureId;
    private Integer totalNumberOfRating;
    private Double avgRating;

}
