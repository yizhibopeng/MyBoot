package com.sysyu.cmis.bean;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author yupeng
 * @description
 * @date 2019/1/16 0016 18:06
 */
@Alias("user_list")
@Data
public class User {
    private Long id;
    private String userId;
    private String userName;
    private String passWord;
    private String userBarcode;
    private String language;
    private String groupId;
}
