package org.springframwork.sf.model;

import lombok.Data;




@Data
public class Person extends BaseEntity {

    private String first_name;
    private String last_name;

}
