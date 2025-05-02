package com.Assignment.Java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private long id;
    private String name;
    private String position;

    public Long getStaff_id() {
        return id;
    }

    public void id(Long staffId) {
        this.id = staffId;
    }
}
