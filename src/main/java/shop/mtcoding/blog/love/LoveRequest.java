package shop.mtcoding.blog.love;

import lombok.Data;

public class LoveRequest {

    @Data
    public static class SaveDTO {
        private Integer boardId;
    }
}