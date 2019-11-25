package com.jk.cmsuser.mapper;

import com.jk.cmsuser.model.CmsUser;

import java.util.List;

public interface CmsMapper {
    List<CmsUser> queryCms();

    List queryNewCmsUser();
}
