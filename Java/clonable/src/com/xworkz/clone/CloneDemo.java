package com.xworkz.clone;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class CloneDemo implements Cloneable {
    private String name;
    private String email;
    private int age;

    @Override
    public CloneDemo clone() throws CloneNotSupportedException {
        return (CloneDemo) super.clone();
    }
}
