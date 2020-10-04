package com.hkk.eduservice.service;

import com.hkk.eduservice.entity.EduChapter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hkk.eduservice.entity.chapter.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-09-26
 */
public interface EduChapterService extends IService<EduChapter> {

    //课程大纲的列表,根据课程id进行查询
    List<ChapterVo> getChapterVideoByCourseId(String courseId);
}
