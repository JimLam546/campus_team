package com.jim.Campus_Team.entity.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TeamUpdateRequest implements Serializable {
    private static final long serialVersionUID = 5283424543923668719L;

    private Long id;

    /**
     * 队伍名称
     */
    private String teamName;

    /**
     * 队伍描述
     */
    private String description;

    /**
     * 最多人数
     */
    private Integer maxNum;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 队伍加入密码
     */
    private String teamPassword;

    /**
     * 队伍状态(0-公开，1-加密，2-private，3-过期)
     */
    private Integer teamStatus;
}
