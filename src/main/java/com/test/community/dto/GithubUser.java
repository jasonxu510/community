package com.test.community.dto;

import lombok.Data;

/**
 * github的user实体类
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_Url;
}
