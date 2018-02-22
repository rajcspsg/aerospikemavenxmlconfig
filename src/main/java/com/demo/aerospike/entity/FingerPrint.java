package com.demo.aerospike.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class FingerPrint {

    @Id
    private String fId;

    private List<String> userIds;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }
}
