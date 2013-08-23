package com.library.service;

import com.library.dao.GenericDao;
import com.library.domain.Comment;

/**
 * TODO: Add class description
 * <p/>
 * User: override
 * Date: 23.08.13
 * Time: 12:07
 */
public class CommentService extends AbstractGenericService<Comment, Long> {

    protected CommentService(GenericDao<Comment, Long> commentLongGenericDao) {
        super(commentLongGenericDao);
    }
}
