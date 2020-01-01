package com.test.community.dto;

import lombok.Data;

/**
 * git登录实体类
 */
@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
