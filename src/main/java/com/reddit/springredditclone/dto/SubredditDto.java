package com.reddit.springredditclone.dto;

import javassist.bytecode.MethodParametersAttribute;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubredditDto {
    private Long id;
    private String name;
    private String description;
    private Integer postCount;


//    public static MethodParametersAttribute builder() {
//    }
//
//    public String getDescription() {
//    }
//
//    public String getName() {
//    }
}
