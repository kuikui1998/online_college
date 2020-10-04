package com.hkk.eduservice.entity.chapter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther kuikui
 * @create 2020-10-02 20:53
 */
@Data
public class ChapterVo {

    private String id;

    private String title;

    //表示小节
    private List<VideoVo> children = new ArrayList<>();

}
