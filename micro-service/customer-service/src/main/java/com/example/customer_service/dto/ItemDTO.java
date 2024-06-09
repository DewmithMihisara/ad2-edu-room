package com.example.customer_service.dto;


import lombok.*;

/**
 * @author Dewmith Mihisara
 * @date 2024-06-09
 * @since 0.0.1
 */
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    private String id;
    private String name;
    private String description;
}
